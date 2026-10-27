package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.*;

public class MapActionListeners {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/game");
        File[] actionFiles = dir.listFiles((d, n) -> n.startsWith("ActionListener") && n.endsWith(".java"));
        Arrays.sort(actionFiles, Comparator.comparing(File::getName));

        // Find usage contexts: GameCommand("Caption", new ActionListenerXXX(...))
        Map<String, String> actionCaptions = new HashMap<>();
        Pattern cmdPat = Pattern.compile("new\\s+GameCommand\\s*\\(\\s*(?:\"([^\"]+)\"|(?:MenuScreen|BoardScreen|BattleScreen)\\.[a-zA-Z0-9_]+\\(\\))\\s*,\\s*new\\s+(ActionListener\\d{3})\\b");

        for (File f : dir.listFiles((d, n) -> n.endsWith(".java"))) {
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            Matcher m = cmdPat.matcher(content);
            while (m.find()) {
                String caption = m.group(1);
                String act = m.group(2);
                if (caption != null && !caption.isEmpty() && !actionCaptions.containsKey(act)) {
                    actionCaptions.put(act, caption);
                }
            }
        }

        Map<String, String> newNames = new LinkedHashMap<>();
        Set<String> usedNames = new HashSet<>();

        for (File f : actionFiles) {
            String oldName = f.getName().replace(".java", "");
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);

            // Determine host type
            String hostType = "App";
            Matcher ctorMatcher = Pattern.compile("ActionListener\\d{3}\\s*\\(([^)]*)\\)").matcher(content);
            if (ctorMatcher.find()) {
                String params = ctorMatcher.group(1).trim();
                if (!params.isEmpty()) {
                    String firstParam = params.split("\\s+")[0].replaceAll("[^a-zA-Z0-9_]", "");
                    if (firstParam.endsWith("Screen") || firstParam.endsWith("Entity") || firstParam.endsWith("Manager") || firstParam.endsWith("Dialog")) {
                        hostType = firstParam.replace("Screen", "").replace("Entity", "").replace("Manager", "").replace("Dialog", "");
                    }
                }
            }

            // Determine action keyword
            String caption = actionCaptions.get(oldName);
            String keyword = "Action";
            if (caption != null) {
                // remove non-ascii or punctuation
                String clean = caption.replaceAll("[^a-zA-Z0-9_]", "").trim();
                if (!clean.isEmpty()) {
                    keyword = clean;
                }
            }

            // If still generic, look at method1 body
            if (keyword.equals("Action")) {
                if (content.contains("NetworkSession")) keyword = "Network";
                else if (content.contains("GameCanvas.method355") || content.contains("GameCanvas.method356")) keyword = "Alert";
                else if (content.contains("method154")) keyword = "Open";
                else if (content.contains("a_()")) keyword = "Show";
                else if (content.contains("close") || content.contains("removeElement")) keyword = "Close";
            }

            // Capitalize keyword
            if (keyword.length() > 0) {
                keyword = Character.toUpperCase(keyword.charAt(0)) + (keyword.length() > 1 ? keyword.substring(1) : "");
            }

            String candidate = hostType + keyword + "Action";
            // Ensure unique
            String uniqueName = candidate;
            int counter = 2;
            while (usedNames.contains(uniqueName)) {
                uniqueName = hostType + keyword + counter + "Action";
                counter++;
            }
            usedNames.add(uniqueName);
            newNames.put(oldName, uniqueName);
        }

        System.out.println("Generated " + newNames.size() + " unique action names. Sample (First 30):");
        int count = 0;
        for (Map.Entry<String, String> e : newNames.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
            if (++count >= 30) break;
        }
    }
}
