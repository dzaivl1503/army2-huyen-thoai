package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PatchClanScreen {
    public static void main(String[] args) throws Exception {
        File file = new File("src/game/ClanScreen.java");
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        List<String> newLines = new ArrayList<>();
        
        // lines 0 to 260 (1 to 261)
        for (int i = 0; i < 260; i++) {
            newLines.add(lines.get(i));
        }
        
        newLines.add("    public final void method3() {");
        newLines.add("    }");
        newLines.add("");
        newLines.add("    public final void method4(Graphics graphics) {");
        newLines.add("        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());");
        newLines.add("        graphics.setColor(0);");
        newLines.add("        graphics.fillRect(0, 0, GameCanvas.field1308, GameCanvas.field1309);");
        newLines.add("        graphics.translate(-LuckyDrawScreen.field501, -LuckyDrawScreen.field502);");
        newLines.add("    }");
        
        // find line where method5 starts
        int m5Index = -1;
        for (int i = 260; i < lines.size(); i++) {
            if (lines.get(i).contains("void method5(")) {
                m5Index = i;
                break;
            }
        }
        if (m5Index == -1) throw new RuntimeException("method5 not found");
        
        for (int i = m5Index; i < lines.size(); i++) {
            newLines.add(lines.get(i));
        }
        
        Files.write(file.toPath(), newLines, StandardCharsets.UTF_8);
        System.out.println("ClanScreen.java patched successfully!");
    }
}
