package tools;

import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RenderOneFail {
    public static void main(String[] args) throws Exception {
        String[] files = {
            "C:/Users/Administrator/Desktop/captchas/captcha_1791144892811_ans_129_SAI.png",
            "C:/Users/Administrator/Desktop/captchas/captcha_1791145076799_ans_8_SAI.png",
            "C:/Users/Administrator/Desktop/captchas/captcha_1791145296414_ans_46_SAI.png"
        };
        for (String filePath : files) {
            File f = new File(filePath);
            if (!f.exists()) continue;
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

            System.out.println("==================================================");
            System.out.println("FILE: " + f.getName());
            for (int y = 25; y < 85; y += 2) {
                StringBuilder sb = new StringBuilder();
                for (int x = 5; x < w - 5; x++) {
                    sb.append(dark[x][y] ? "#" : " ");
                }
                String line = sb.toString();
                if (line.trim().length() > 0) System.out.println(line);
            }
        }
    }
}
