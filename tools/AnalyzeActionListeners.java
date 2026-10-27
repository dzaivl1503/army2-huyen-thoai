package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.*;

public class AnalyzeActionListeners {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/game");
        File[] actionFiles = dir.listFiles((d, n) -> n.startsWith("ActionListener") && n.endsWith(".java"));
        Arrays.sort(actionFiles, Comparator.comparing(File::getName));

        // 1. Scan where new ActionListenerXXX(...) is invoked across all files
        Map<String, List<String>> usageContexts = new HashMap<>();
        Pattern newActionPat = Pattern.compile("new\\s+(ActionListener\\d{3})\\s*\\(([^)]*)\\)");

        for (File f : dir.listFiles((d, n) -> n.endsWith(".java"))) {
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            String[] lines = content.split("\r?\n");
            for (int lineNum = 0; lineNum < lines.length; lineNum++) {
                String line = lines[lineNum];
                Matcher m = newActionPat.matcher(line);
                while (m.find()) {
                    String act = m.group(1);
                    String ctx = f.getName().replace(".java", "") + ":" + (lineNum + 1) + " -> " + line.trim();
                    usageContexts.computeIfAbsent(act, k -> new ArrayList<>()).add(ctx);
                }
            }
        }

        System.out.println("Total ActionListener files: " + actionFiles.length);
        System.out.println("Found usages for: " + usageContexts.size() + " actions.");

        // Print first 40 actions with their usage and internal method call
        for (int i = 0; i < Math.min(40, actionFiles.length); i++) {
            File f = actionFiles[i];
            String name = f.getName().replace(".java", "");
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);

            // Find what method1 does
            Matcher m1 = Pattern.compile("public\\s+final\\s+void\\s+method1\\s*\\(\\)\\s*\\{([\\s\\S]*?)\\}").matcher(content);
            String body = m1.find() ? m1.group(1).trim().replaceAll("\\s+", " ") : "";

            List<String> usages = usageContexts.get(name);
            System.out.println("--------------------------------------------------");
            System.out.println(name + " body: " + body);
            if (usages != null) {
                for (String u : usages) {
                    System.out.println("   " + u);
                }
            } else {
                System.out.println("   (No direct new found)");
            }
        }
    }
}
