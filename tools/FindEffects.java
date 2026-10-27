package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEffects {
    private static final char[] key = "\u73cb\u4150\u7652\u7cb4\u0758\ua811\u43f4\u8cbe\ua84b\u0531\uf747\uc01f".toCharArray();

    public static String decrypt(String s) {
        char[] out = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            out[i] = (char)(s.charAt(i) ^ key[i % key.length]);
        }
        return new String(out);
    }

    public static void main(String[] args) throws Exception {
        File srcDir = new File("src/game");
        Pattern p = Pattern.compile("StringDecryptor\\.decrypt\\(\"([^\"]+)\"\\)");
        
        for (File f : srcDir.listFiles()) {
            if (!f.getName().endsWith(".java")) continue;
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            Matcher m = p.matcher(content);
            while (m.find()) {
                String raw = m.group(1);
                // unescape unicode if raw contains backslash u
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < raw.length(); i++) {
                    if (raw.charAt(i) == '\\' && i + 5 < raw.length() && raw.charAt(i + 1) == 'u') {
                        String hex = raw.substring(i + 2, i + 6);
                        sb.append((char)Integer.parseInt(hex, 16));
                        i += 5;
                    } else {
                        sb.append(raw.charAt(i));
                    }
                }
                String dec = decrypt(sb.toString());
                if (dec.contains(".png") || dec.contains("effect") || dec.contains("cloud") || dec.contains("mua") || dec.contains("tuyet") || dec.contains("locxoay") || dec.contains("no")) {
                    System.out.println(f.getName() + " -> " + dec);
                }
            }
        }
    }
}
