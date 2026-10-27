package tools;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.*;

public class ExtractTemplates {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Users/Administrator/Desktop/captchas");
        File[] files = dir.listFiles((d, name) -> name.endsWith(".png"));
        if (files == null) return;

        // Take 10 files and inspect blob dimensions
        Map<String, List<int[]>> charDimensions = new HashMap<>();

        for (int i = 0; i < Math.min(20, files.length); i++) {
            File f = files[i];
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

            // Find blobs
            boolean[][] visited = new boolean[w][h];
            int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
            int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    if (dark[x][y] && !visited[x][y]) {
                        int minX = x, maxX = x, minY = y, maxY = y;
                        int count = 0;
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[]{x, y});
                        visited[x][y] = true;

                        while (!q.isEmpty()) {
                            int[] p = q.poll();
                            count++;
                            minX = Math.min(minX, p[0]);
                            maxX = Math.max(maxX, p[0]);
                            minY = Math.min(minY, p[1]);
                            maxY = Math.max(maxY, p[1]);

                            for (int d = 0; d < 8; d++) {
                                int nx = p[0] + dx[d];
                                int ny = p[1] + dy[d];
                                if (nx >= 0 && nx < w && ny >= 0 && ny < h && dark[nx][ny] && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    q.add(new int[]{nx, ny});
                                }
                            }
                        }

                        if (count >= 20) {
                            int bw = maxX - minX + 1;
                            int bh = maxY - minY + 1;
                            System.out.printf("File %d: Blob at X=[%3d..%3d] (w=%2d, h=%2d, count=%3d)\n",
                                    i, minX, maxX, bw, bh, count);
                        }
                    }
                }
            }
        }
    }
}
