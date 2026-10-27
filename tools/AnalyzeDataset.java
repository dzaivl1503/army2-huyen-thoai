package tools;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.*;

public class AnalyzeDataset {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Users/Administrator/Desktop/captchas");
        File[] files = dir.listFiles((d, name) -> name.contains("_DUNG.png"));
        if (files == null) return;

        System.out.println("Analyzing " + files.length + " VERIFIED CORRECT captchas:");
        for (File f : files) {
            System.out.println("--------------------------------------------------");
            System.out.println("File: " + f.getName());
            // Extract expected answer from filename: e.g. captcha_1791130904047_ans_76_DUNG.png
            String name = f.getName();
            int ansIdx = name.indexOf("_ans_");
            int dungIdx = name.indexOf("_DUNG");
            String expectedAns = name.substring(ansIdx + 5, dungIdx);
            System.out.println("Verified Answer: " + expectedAns);
        }
    }
}
