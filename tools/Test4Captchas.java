package tools;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

public class Test4Captchas {
    public static final String[] API_KEYS = {
        "K81682947188957",
        "helloworld",
        "K84573190788957"
    };

    public static void main(String[] args) throws Exception {
        File dir = new File("test_captchas");
        File[] files = dir.listFiles((d, n) -> n.endsWith(".png"));
        if (files == null) return;
        Arrays.sort(files, Comparator.comparingLong(File::lastModified));

        for (File f : files) {
            System.out.println("==================================================");
            System.out.println("File: " + f.getName());
            byte[] bytes = Files.readAllBytes(f.toPath());
            java.awt.image.BufferedImage bimg = javax.imageio.ImageIO.read(f);
            System.out.println("Dimensions: " + bimg.getWidth() + "x" + bimg.getHeight() + ", Size: " + bytes.length + " bytes");

            // Test preprocessToBmp
            byte[] bmpBytes = preprocessToBmp(bimg);
            File bmpFile = new File("test_captchas", f.getName() + ".bmp");
            Files.write(bmpFile.toPath(), bmpBytes);
            System.out.println("Saved BMP: " + bmpFile.getName() + " (" + bmpBytes.length + " bytes)");

            // Call OCR on BMP
            String ocrBmp2 = callOcr(bmpBytes, "2", true);
            System.out.println("OCR Engine 2 on BMP: [" + ocrBmp2 + "]");
            String ansBmp2 = ValidateImprovedSolver.improvedSolveMath(ocrBmp2);
            System.out.println("  -> Solved: " + ansBmp2);

            String ocrBmp1 = callOcr(bmpBytes, "1", true);
            System.out.println("OCR Engine 1 on BMP: [" + ocrBmp1 + "]");
            String ansBmp1 = ValidateImprovedSolver.improvedSolveMath(ocrBmp1);
            System.out.println("  -> Solved: " + ansBmp1);

            // Also test upscale (zoom 2x/3x) on BMP
            byte[] scaledBmp = preprocessToBmpScaled(bimg, 3);
            File scaledFile = new File("test_captchas", f.getName() + "_3x.bmp");
            Files.write(scaledFile.toPath(), scaledBmp);
            String ocrScaled2 = callOcr(scaledBmp, "2", true);
            System.out.println("OCR Engine 2 on 3x BMP: [" + ocrScaled2 + "]");
            String ansScaled2 = ValidateImprovedSolver.improvedSolveMath(ocrScaled2);
            System.out.println("  -> Solved 3x: " + ansScaled2);
        }
    }

    private static byte[] preprocessToBmp(java.awt.image.BufferedImage img) throws Exception {
        return preprocessToBmpScaled(img, 1);
    }

    private static byte[] preprocessToBmpScaled(java.awt.image.BufferedImage img, int scale) throws Exception {
        int w = img.getWidth() * scale;
        int h = img.getHeight() * scale;
        boolean[][] dark = new boolean[w][h];

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int lum = (r * 299 + g * 587 + b * 114) / 1000;
                boolean isDark = (lum < 135);
                for (int dy = 0; dy < scale; dy++) {
                    for (int dx = 0; dx < scale; dx++) {
                        dark[x * scale + dx][y * scale + dy] = isDark;
                    }
                }
            }
        }

        int rowBytes = ((w * 3 + 3) / 4) * 4;
        int imageSize = rowBytes * h;
        int fileSize = 54 + imageSize;
        ByteArrayOutputStream baos = new ByteArrayOutputStream(fileSize);

        baos.write('B'); baos.write('M');
        writeLittleInt(baos, fileSize);
        writeLittleShort(baos, 0);
        writeLittleShort(baos, 0);
        writeLittleInt(baos, 54);

        writeLittleInt(baos, 40);
        writeLittleInt(baos, w);
        writeLittleInt(baos, h);
        writeLittleShort(baos, 1);
        writeLittleShort(baos, 24);
        writeLittleInt(baos, 0);
        writeLittleInt(baos, imageSize);
        writeLittleInt(baos, 2835);
        writeLittleInt(baos, 2835);
        writeLittleInt(baos, 0);
        writeLittleInt(baos, 0);

        byte[] row = new byte[rowBytes];
        for (int y = h - 1; y >= 0; y--) {
            int idx = 0;
            for (int x = 0; x < w; x++) {
                byte val = dark[x][y] ? (byte) 0 : (byte) 255;
                row[idx++] = val;
                row[idx++] = val;
                row[idx++] = val;
            }
            while (idx < rowBytes) row[idx++] = 0;
            baos.write(row);
        }
        return baos.toByteArray();
    }

    private static void writeLittleInt(OutputStream os, int v) throws IOException {
        os.write(v & 0xFF); os.write((v >> 8) & 0xFF); os.write((v >> 16) & 0xFF); os.write((v >> 24) & 0xFF);
    }
    private static void writeLittleShort(OutputStream os, int v) throws IOException {
        os.write(v & 0xFF); os.write((v >> 8) & 0xFF);
    }

    private static String callOcr(byte[] imgBytes, String engine, boolean isBmp) {
        String ext = isBmp ? "bmp" : "png";
        String mime = isBmp ? "image/bmp" : "image/png";
        for (String key : API_KEYS) {
            try {
                String boundary = "----Boundary" + System.currentTimeMillis();
                URL url = new URL("https://api.ocr.space/parse/image");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

                try (OutputStream os = conn.getOutputStream()) {
                    writeField(os, boundary, "apikey", key);
                    writeField(os, boundary, "language", "eng");
                    writeField(os, boundary, "OCREngine", engine);
                    writeField(os, boundary, "scale", "true");

                    String header = "--" + boundary + "\r\n"
                        + "Content-Disposition: form-data; name=\"file\"; filename=\"captcha." + ext + "\"\r\n"
                        + "Content-Type: " + mime + "\r\n\r\n";
                    os.write(header.getBytes("UTF-8"));
                    os.write(imgBytes);
                    os.write(("\r\n--" + boundary + "--\r\n").getBytes("UTF-8"));
                    os.flush();
                }

                if (conn.getResponseCode() == 200) {
                    try (InputStream is = conn.getInputStream();
                         ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                        byte[] buf = new byte[1024];
                        int n;
                        while ((n = is.read(buf)) != -1) baos.write(buf, 0, n);
                        String json = new String(baos.toByteArray(), "UTF-8");
                        return extractParsedText(json);
                    }
                }
            } catch (Exception e) {
                System.out.println("  [Error with key " + key + ": " + e.getMessage() + "]");
            }
        }
        return null;
    }

    private static void writeField(OutputStream os, String boundary, String name, String val) throws IOException {
        String s = "--" + boundary + "\r\n"
            + "Content-Disposition: form-data; name=\"" + name + "\"\r\n\r\n"
            + val + "\r\n";
        os.write(s.getBytes("UTF-8"));
    }

    private static String extractParsedText(String json) {
        String needle = "\"ParsedText\":\"";
        int i = json.indexOf(needle);
        if (i < 0) return null;
        int start = i + needle.length();
        int end = json.indexOf('"', start);
        if (end < 0) return null;
        String raw = json.substring(start, end);
        return raw.replace("\\r", "").replace("\\n", " ").replace("\\t", " ").replace("\\\"", "\"").trim();
    }
}
