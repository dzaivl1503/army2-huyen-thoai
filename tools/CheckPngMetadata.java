package tools;

import java.io.*;
import java.nio.file.*;

public class CheckPngMetadata {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Users/Administrator/Desktop/captchas");
        File[] files = dir.listFiles((d, n) -> n.endsWith(".png"));
        if (files == null || files.length == 0) {
            System.out.println("No files found!");
            return;
        }
        System.out.println("Total files: " + files.length);
        for (int i = 0; i < Math.min(10, files.length); i++) {
            File f = files[i];
            byte[] b = Files.readAllBytes(f.toPath());
            System.out.println("--------------------------------------------------");
            System.out.println("File: " + f.getName() + " (Bytes: " + b.length + ")");
            int idx = 8;
            while (idx + 8 <= b.length) {
                int len = ((b[idx] & 0xFF) << 24) | ((b[idx+1] & 0xFF) << 16) | ((b[idx+2] & 0xFF) << 8) | (b[idx+3] & 0xFF);
                if (len < 0 || idx + 8 + len + 4 > b.length) {
                    System.out.println("  Invalid chunk len=" + len);
                    break;
                }
                String type = new String(b, idx + 4, 4, "ISO-8859-1");
                if (type.equals("IHDR")) {
                    int w = ((b[idx+8] & 0xFF) << 24) | ((b[idx+9] & 0xFF) << 16) | ((b[idx+10] & 0xFF) << 8) | (b[idx+11] & 0xFF);
                    int h = ((b[idx+12] & 0xFF) << 24) | ((b[idx+13] & 0xFF) << 16) | ((b[idx+14] & 0xFF) << 8) | (b[idx+15] & 0xFF);
                    int bitDepth = b[idx+16] & 0xFF;
                    int colorType = b[idx+17] & 0xFF;
                    System.out.println("  IHDR: " + w + "x" + h + ", bitDepth=" + bitDepth + ", colorType=" + colorType);
                }
                idx += 8 + len + 4;
                if (type.equals("IEND")) break;
            }
        }
    }
}
