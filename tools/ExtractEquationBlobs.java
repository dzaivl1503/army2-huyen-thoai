package tools;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.*;

public class ExtractEquationBlobs {
    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "C:/Users/Administrator/Desktop/captchas/captcha_1791140257898_ans_55_SAI.png";
        File f = new File(path);
        BufferedImage img = ImageIO.read(f);
        int w = img.getWidth();
        int h = img.getHeight();

        boolean[][] dark = new boolean[w][h];
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int lum = (r * 299 + g * 587 + b * 114) / 1000;
                if (lum < 115) dark[x][y] = true;
            }
        }

        // Find connected components
        boolean[][] visited = new boolean[w][h];
        List<Blob> blobs = new ArrayList<>();

        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                if (dark[x][y] && !visited[x][y]) {
                    Blob b = new Blob();
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{x, y});
                    visited[x][y] = true;

                    while (!q.isEmpty()) {
                        int[] p = q.poll();
                        b.pixels.add(p);
                        b.minX = Math.min(b.minX, p[0]);
                        b.maxX = Math.max(b.maxX, p[0]);
                        b.minY = Math.min(b.minY, p[1]);
                        b.maxY = Math.max(b.maxY, p[1]);

                        for (int d = 0; d < 8; d++) {
                            int nx = p[0] + dx[d];
                            int ny = p[1] + dy[d];
                            if (nx >= 0 && nx < w && ny >= 0 && ny < h && dark[nx][ny] && !visited[nx][ny]) {
                                visited[nx][ny] = true;
                                q.add(new int[]{nx, ny});
                            }
                        }
                    }

                    if (b.pixels.size() >= 15) { // Filter noise
                        blobs.add(b);
                    }
                }
            }
        }

        // Sort by minX
        blobs.sort((b1, b2) -> Integer.compare(b1.minX, b2.minX));

        System.out.println("Found " + blobs.size() + " significant character blobs:");
        for (int i = 0; i < blobs.size(); i++) {
            Blob b = blobs.get(i);
            System.out.printf("Blob #%d: X=[%3d..%3d] (w=%2d) Y=[%2d..%2d] (h=%2d) pixels=%d\n",
                    i, b.minX, b.maxX, b.maxX - b.minX + 1, b.minY, b.maxY, b.maxY - b.minY + 1, b.pixels.size());
            
            // Render this individual blob
            int bw = b.maxX - b.minX + 1;
            int bh = b.maxY - b.minY + 1;
            boolean[][] bmap = new boolean[bw][bh];
            for (int[] p : b.pixels) {
                bmap[p[0] - b.minX][p[1] - b.minY] = true;
            }

            for (int y = 0; y < bh; y++) {
                StringBuilder sb = new StringBuilder();
                for (int x = 0; x < bw; x++) {
                    sb.append(bmap[x][y] ? "#" : " ");
                }
                System.out.println("  " + sb.toString());
            }
            System.out.println();
        }
    }

    static class Blob {
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        List<int[]> pixels = new ArrayList<>();
    }
}
