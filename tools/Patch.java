package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Patch {
    public static void main(String[] args) throws Exception {
        File file = new File("src/game/RankingScreen.java");
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        List<String> newLines = new ArrayList<>();
        
        // lines 0 to 220 (1 to 221)
        for (int i = 0; i <= 220; i++) {
            newLines.add(lines.get(i));
        }
        
        newLines.add("    public final void method246() {");
        newLines.add("    }");
        newLines.add("");
        newLines.add("    private void method247() {");
        newLines.add("    }");
        newLines.add("");
        newLines.add("    public final void method248(Graphics graphics) {");
        newLines.add("    }");
        
        // lines 493 to end
        for (int i = 493; i < lines.size(); i++) {
            newLines.add(lines.get(i));
        }
        
        Files.write(file.toPath(), newLines, StandardCharsets.UTF_8);
        System.out.println("RankingScreen.java patched successfully!");
    }
}
