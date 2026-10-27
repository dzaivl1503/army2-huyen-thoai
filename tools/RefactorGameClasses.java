package tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.regex.*;

public class RefactorGameClasses {

    public static Map<String, String> buildMapping(File srcDir) {
        Map<String, String> map = new LinkedHashMap<>();

        // 1. Substantive classes (Core interfaces, models, screens, handlers)
        map.put("GameClass317", "IActionListener");
        map.put("GameClass332", "Message");
        map.put("GameClass320", "ImagePack");
        map.put("GameClass321", "FrameImage");
        map.put("GameClass302", "ServerInfo");
        map.put("GameClass207", "ServerManager");
        map.put("GameClass318", "IServerListener");
        map.put("GameClass346", "ConnectTask");
        map.put("GameClass325", "Dialog");
        map.put("GameClass285", "MessageBox");
        map.put("GameClass294", "HUDComponent");
        map.put("GameClass067", "TimerHUD");
        map.put("GameClass132", "ChatPopup");
        map.put("GameClass204", "MarqueeNotice");
        map.put("GameClass096", "UpdateScreen");
        map.put("GameClass125", "PlayerSummaryScreen");
        map.put("GameClass163", "SplashScreen");
        map.put("GameClass348", "SlideDialog");
        map.put("GameClass307", "BackgroundRenderer");
        map.put("GameClass326", "GameItem");
        map.put("GameClass322", "PakTool");
        map.put("GameClass330", "MinigameHandler");
        map.put("GameClass048", "BauCuaHandler");
        map.put("GameClass049", "AnimatedTile");
        map.put("GameClass056", "SmsSender");
        map.put("GameClass066", "BulletEffectData");
        map.put("GameClass074", "QuestReward");
        map.put("GameClass079", "MapEditBoxListener");
        map.put("GameClass097", "EquipItemEntry");
        map.put("GameClass099", "EquipTemplate");
        map.put("GameClass103", "TurnTimer");
        map.put("GameClass105", "PopupMenu");
        map.put("GameClass107", "AvatarIcon");
        map.put("GameClass114", "GuildWarMessageQueue");
        map.put("GameClass115", "Point4D");
        map.put("GameClass126", "LoginWaitTask");
        map.put("GameClass133", "ClanGroupEntry");
        map.put("GameClass149", "ShopItemEntry");
        map.put("GameClass150", "CachedIcon");
        map.put("GameClass157", "AvatarCache");
        map.put("GameClass176", "EquipCache");
        map.put("GameClass189", "TornadoEffect");
        map.put("GameClass222", "ConnectionWatchdog");
        map.put("GameClass229", "FloatingText");
        map.put("GameClass235", "PlayerAccountInfo");
        map.put("GameClass255", "RankGraphicHelper");
        map.put("GameClass272", "BattleGraphicHelper");
        map.put("GameClass286", "PlayerSlot");
        map.put("GameClass313", "ClanRankEntry");
        map.put("GameClass314", "ChestBox");
        map.put("GameClass319", "INetworkCallback");
        map.put("GameClass331", "EmulatorHelper");
        map.put("GameClass337", "MissionDetailEntry");
        map.put("GameClass340", "EquipUpgradeEntry");
        map.put("GameClass341", "ClanMemberEntry");
        map.put("GameClass343", "IPacketListener");
        map.put("GameClass347", "StringUtils");
        map.put("GameClass353", "ItemUpgradeEffect");

        // 2. Action listeners (implementing GameClass317)
        File[] allFiles = srcDir.listFiles((d, n) -> n.startsWith("GameClass") && n.endsWith(".java"));
        if (allFiles != null) {
            Arrays.sort(allFiles, Comparator.comparing(File::getName));
            for (File f : allFiles) {
                String className = f.getName().replace(".java", "");
                if (!map.containsKey(className)) {
                    // It's an action listener
                    String num = className.replace("GameClass", "");
                    map.put(className, "ActionListener" + num);
                }
            }
        }

        return map;
    }

    public static void main(String[] args) throws Exception {
        File srcDir = new File("src/game");
        Map<String, String> renameMap = buildMapping(srcDir);
        System.out.println("Total GameClasses to rename: " + renameMap.size());

        // Validate uniqueness of targets
        Set<String> targetNames = new HashSet<>();
        for (Map.Entry<String, String> e : renameMap.entrySet()) {
            if (!targetNames.add(e.getValue())) {
                throw new IllegalStateException("Duplicate target name: " + e.getValue());
            }
            File existing = new File(srcDir, e.getValue() + ".java");
            if (existing.exists() && !existing.getName().equals(e.getKey() + ".java")) {
                throw new IllegalStateException("Target file already exists: " + existing.getName());
            }
        }

        // Build regex pattern matching any GameClass name
        // Sort keys by length descending (although GameClassXXX are all same length 12)
        StringBuilder patternBuilder = new StringBuilder("\\b(");
        List<String> keys = new ArrayList<>(renameMap.keySet());
        Collections.sort(keys, (a, b) -> b.length() - a.length());
        for (int i = 0; i < keys.size(); i++) {
            if (i > 0) patternBuilder.append("|");
            patternBuilder.append(Pattern.quote(keys.get(i)));
        }
        patternBuilder.append(")\\b");
        Pattern classPattern = Pattern.compile(patternBuilder.toString());

        // 1. Process all java files in src/game
        File[] javaFiles = srcDir.listFiles((d, n) -> n.endsWith(".java"));
        int modifiedCount = 0;
        Map<File, String> updatedContents = new HashMap<>();

        for (File f : javaFiles) {
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            Matcher m = classPattern.matcher(content);
            if (!m.find()) {
                continue;
            }

            m.reset();
            StringBuffer sb = new StringBuffer();
            while (m.find()) {
                String oldName = m.group(1);
                String newName = renameMap.get(oldName);
                if (newName == null) {
                    newName = oldName;
                }
                m.appendReplacement(sb, Matcher.quoteReplacement(newName));
            }
            m.appendTail(sb);
            updatedContents.put(f, sb.toString());
            modifiedCount++;
        }

        System.out.println("Modified content in " + modifiedCount + " files.");

        // 2. Write new files and delete old ones
        int renamedFiles = 0;
        for (File f : javaFiles) {
            String oldName = f.getName().replace(".java", "");
            String newContent = updatedContents.getOrDefault(f, new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8));
            String newName = renameMap.get(oldName);

            if (newName != null) {
                File newFile = new File(srcDir, newName + ".java");
                Files.write(newFile.toPath(), newContent.getBytes(StandardCharsets.UTF_8));
                f.delete();
                renamedFiles++;
            } else {
                // If not renamed, but content changed, overwrite
                if (updatedContents.containsKey(f)) {
                    Files.write(f.toPath(), newContent.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
        System.out.println("Renamed " + renamedFiles + " files.");

        // 3. Update sources.txt
        File rootDir = new File(".");
        List<String> sources = new ArrayList<>();
        Files.walkFileTree(srcDir.toPath(), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, java.nio.file.attribute.BasicFileAttributes attrs) {
                if (file.toString().endsWith(".java")) {
                    sources.add(file.toString());
                }
                return FileVisitResult.CONTINUE;
            }
        });
        Collections.sort(sources);
        Files.write(new File(rootDir, "sources.txt").toPath(), sources, StandardCharsets.UTF_8);
        System.out.println("Updated sources.txt with " + sources.size() + " files.");
    }
}
