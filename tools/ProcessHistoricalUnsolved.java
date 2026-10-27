package tools;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.*;

public class ProcessHistoricalUnsolved {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Users/Administrator/Desktop/captchas");
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File f) {
                String n = f.getName();
                return n.endsWith(".png") && !n.contains("_DUNG") && !n.contains("_SAI") && !n.contains("_KHONGGIAI");
            }
        });

        if (files == null || files.length == 0) {
            System.out.println("No unrenamed files to process.");
            return;
        }

        System.out.println("Processing " + files.length + " unrenamed files...");
        int renamedKhongGiai = 0;
        for (File f : files) {
            String name = f.getName();
            String base = name.substring(0, name.length() - 4);
            File target = new File(dir, base + "_ans_null_KHONGGIAI.png");
            if (f.renameTo(target)) {
                renamedKhongGiai++;
            }
        }
        System.out.println("Done! Renamed " + renamedKhongGiai + " historical files to _ans_null_KHONGGIAI.png");
    }
}
