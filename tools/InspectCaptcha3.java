package tools;

import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class InspectCaptcha3 {
    public static void main(String[] args) throws Exception {
        inspectFile("test_captchas/captcha_1791341778774_ans_31_SAI.png", "CAPTCHA 1 (ans 31 SAI)");
        inspectFile("test_captchas/captcha_1791341781244_ans_null_KHONGGIAI.png", "CAPTCHA 2 (ans null KHONGGIAI)");
        inspectFile("test_captchas/captcha_1791341791719_ans_11_SAI.png", "CAPTCHA 3 (ans 11 SAI)");
        inspectFile("test_captchas/captcha_1791341793850.png", "CAPTCHA 4 (newest)");
    }

    private static void inspectFile(String path, String label) throws Exception {
        File f = new File(path);
        if (!f.exists()) return;
        BufferedImage img = ImageIO.read(f);
        System.out.println("==========================================================================================");
        System.out.println("=== " + label + " (" + f.getName() + ") ===");
        System.out.println("==========================================================================================");

        for (int y = 20; y < 75; y += 2) {
            StringBuilder sb = new StringBuilder();
            for (int x = 10; x < 230; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int lum = (r * 299 + g * 587 + b * 114) / 1000;
                sb.append(lum < 115 ? "#" : " ");
            }
            String line = sb.toString();
            if (line.trim().length() > 0) {
                System.out.println(line);
            }
        }
    }
}
