package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.*;

public class CountFields {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/game");
        Pattern defPattern = Pattern.compile("(?:public|protected|private|static|final|volatile|transient)\\s+(?:[a-zA-Z0-9_<>\\[\\]]+)\\s+(field\\d+)\\s*(?:=[^;]+)?;");
        int totalFieldDefs = 0;
        Map<String, Integer> classFieldCount = new HashMap<>();

        for (File f : dir.listFiles((d, n) -> n.endsWith(".java"))) {
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            Matcher m = defPattern.matcher(content);
            int count = 0;
            while (m.find()) {
                count++;
                totalFieldDefs++;
            }
            if (count > 0) {
                classFieldCount.put(f.getName(), count);
            }
        }

        System.out.println("Total distinct field definitions: " + totalFieldDefs);
        System.out.println("Total classes with field definitions: " + classFieldCount.size());

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(classFieldCount.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println("\nTop 25 classes with most fields:");
        for (int i = 0; i < Math.min(25, sorted.size()); i++) {
            System.out.println("  " + sorted.get(i).getKey() + ": " + sorted.get(i).getValue() + " fields");
        }
    }
}
