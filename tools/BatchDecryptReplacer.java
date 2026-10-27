package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BatchDecryptReplacer {
    private static final char[] key = "\u73cb\u4150\u7652\u7cb4\u0758\ua811\u43f4\u8cbe\ua84b\u0531\uf747\uc01f".toCharArray();

    public static String decrypt(String s) {
        char[] out = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            out[i] = (char)(s.charAt(i) ^ key[i % key.length]);
        }
        return new String(out);
    }

    public static String unescapeUnicode(String raw) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < raw.length(); i++) {
            if (raw.charAt(i) == '\\' && i + 5 < raw.length() && raw.charAt(i + 1) == 'u') {
                String hex = raw.substring(i + 2, i + 6);
                sb.append((char) Integer.parseInt(hex, 16));
                i += 5;
            } else if (raw.charAt(i) == '\\' && i + 1 < raw.length()) {
                char c = raw.charAt(i + 1);
                if (c == 'n') { sb.append('\n'); i++; }
                else if (c == 'r') { sb.append('\r'); i++; }
                else if (c == 't') { sb.append('\t'); i++; }
                else if (c == '\"') { sb.append('\"'); i++; }
                else if (c == '\\') { sb.append('\\'); i++; }
                else { sb.append(c); i++; }
            } else {
                sb.append(raw.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String toJavaLiteral(String s) {
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\b': sb.append("\\b"); break;
                case '\f': sb.append("\\f"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 32 || c == 127) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
                    break;
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        File srcDir = new File("src/game");
        Pattern p = Pattern.compile("StringDecryptor\\.decrypt\\(\"((?:\\\\\"|[^\"])*)\"\\)");

        int totalFilesModified = 0;
        int totalStringsReplaced = 0;

        for (File f : srcDir.listFiles((d, n) -> n.endsWith(".java"))) {
            if (f.getName().equals("StringDecryptor.java")) {
                continue;
            }

            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            Matcher m = p.matcher(content);
            if (!m.find()) {
                continue;
            }

            m.reset();
            StringBuffer sb = new StringBuffer();
            int fileReplacements = 0;
            while (m.find()) {
                String raw = m.group(1);
                String unescaped = unescapeUnicode(raw);
                String decrypted = decrypt(unescaped);
                String literal = toJavaLiteral(decrypted);

                m.appendReplacement(sb, Matcher.quoteReplacement(literal));
                fileReplacements++;
            }
            m.appendTail(sb);

            String updated = sb.toString();
            // Remove unused import game.StringDecryptor;
            if (!updated.contains("StringDecryptor")) {
                updated = updated.replaceAll("import game\\.StringDecryptor;[\\r\\n]+", "");
            }

            Files.write(f.toPath(), updated.getBytes(StandardCharsets.UTF_8));
            totalFilesModified++;
            totalStringsReplaced += fileReplacements;
        }

        System.out.println("SUCCESS: Replaced " + totalStringsReplaced + " encrypted strings across " + totalFilesModified + " files.");
    }
}
