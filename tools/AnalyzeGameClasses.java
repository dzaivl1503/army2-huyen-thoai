package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.*;

public class AnalyzeGameClasses {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/game");
        File[] files = dir.listFiles((d, name) -> name.startsWith("GameClass") && name.endsWith(".java"));
        Arrays.sort(files, Comparator.comparing(File::getName));

        Map<String, Integer> categoryCounts = new HashMap<>();
        List<String> details = new ArrayList<>();

        for (File f : files) {
            String name = f.getName().replace(".java", "");
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);

            String kind = "other";
            if (content.contains("interface ")) {
                kind = "interface";
            } else if (content.contains("implements GameClass317")) {
                kind = "action_listener (implements GameClass317)";
            } else if (content.contains("extends BaseScreen")) {
                kind = "screen (extends BaseScreen)";
            } else if (content.contains("extends Canvas")) {
                kind = "canvas";
            } else if (content.contains("implements Runnable")) {
                kind = "runnable";
            } else if (content.contains("extends Thread")) {
                kind = "thread";
            } else if (content.contains("implements GameClass")) {
                Matcher m = Pattern.compile("implements (GameClass\\d+)").matcher(content);
                if (m.find()) {
                    kind = "implements " + m.group(1);
                }
            }

            categoryCounts.put(kind, categoryCounts.getOrDefault(kind, 0) + 1);

            // Find first few lines of class declaration
            Matcher decl = Pattern.compile("(?:public |final |abstract )*(?:class|interface) " + name + "[^{]+").matcher(content);
            String declStr = decl.find() ? decl.group(0).trim().replaceAll("\\s+", " ") : "";
            details.add(name + ": [" + kind + "] - " + declStr);
        }

        System.out.println("=== CATEGORY SUMMARY ===");
        for (Map.Entry<String, Integer> e : categoryCounts.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("=== NON-LISTENER GAME CLASSES (" + (files.length - 296) + ") ===");
        for (File f : files) {
            String name = f.getName().replace(".java", "");
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            if (!content.contains("implements GameClass317")) {
                Matcher decl = Pattern.compile("(?:public |final |abstract )*(?:class|interface) " + name + "[^{]+").matcher(content);
                String declStr = decl.find() ? decl.group(0).trim().replaceAll("\\s+", " ") : "";
                System.out.println(name + " (" + f.length() + "B): " + declStr);
            }
        }
    }
}
