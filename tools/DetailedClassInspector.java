package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class DetailedClassInspector {
    public static void main(String[] args) throws Exception {
        String[] targets = {
            "GameClass066", "GameClass074", "GameClass097", "GameClass099", "GameClass105",
            "GameClass107", "GameClass114", "GameClass115", "GameClass126", "GameClass133",
            "GameClass149", "GameClass150", "GameClass157", "GameClass176", "GameClass189",
            "GameClass222", "GameClass229", "GameClass235", "GameClass255", "GameClass272",
            "GameClass286", "GameClass313", "GameClass314", "GameClass319", "GameClass337",
            "GameClass340", "GameClass341", "GameClass343", "GameClass347", "GameClass353"
        };

        for (String target : targets) {
            File f = new File("src/game/" + target + ".java");
            if (!f.exists()) continue;
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            System.out.println("==================================================");
            System.out.println("FILE: " + target + ".java (" + f.length() + "B)");
            System.out.println(content.trim());
        }
    }
}
