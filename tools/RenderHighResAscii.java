package tools;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RenderHighResAscii {
    public static void main(String[] args) throws Exception {
        File f = new File("C:/Users/Administrator/Desktop/captchas/captcha_1791145296414_ans_46_SAI.png");
        BufferedImage img = ImageIO.read(f);
        int w = img.getWidth();
        int h = img.getHeight();

        // Print width slices so it doesn't wrap!
        // Print columns 0-80, 80-160, 160-240
        printSlice(img, 0, 80);
        printSlice(img, 80, 160);
        printSlice(img, 160, 240);
    }

    private static void printSlice(BufferedImage img, int startX, int endX) {
        System.out.println("=== Slice X: " + startX + " to " + endX + " ===");
        int h = img.getHeight();
        for (int y = 0; y < h; y += 2) {
            StringBuilder sb = new StringBuilder();
            for (int x = startX; x < endX; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int lum = (r * 299 + g * 587 + b * 114) / 1000;
                sb.append(lum < 115 ? "#" : " ");
            }
            if (sb.toString().trim().length() > 0) {
                System.out.println(sb.toString());
            }
        }
    }
}
