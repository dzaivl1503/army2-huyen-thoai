package tools;

import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RenderBlob2Detailed {
    public static void main(String[] args) throws Exception {
        File f = new File("C:/Users/Administrator/Desktop/captchas/captcha_1791140257898_ans_55_SAI.png");
        BufferedImage img = ImageIO.read(f);

        System.out.println("=== BLOB 2 OF captcha_1791140257898 ===");
        for (int y = 45; y < 68; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 95; x < 128; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int lum = (r * 299 + g * 587 + b * 114) / 1000;
                sb.append(lum < 115 ? "#" : " ");
            }
            System.out.println(sb.toString());
        }

        System.out.println("\n=== BLOB 3 OF captcha_1791140257898 ===");
        for (int y = 42; y < 70; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 128; x < 150; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int lum = (r * 299 + g * 587 + b * 114) / 1000;
                sb.append(lum < 115 ? "#" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}
