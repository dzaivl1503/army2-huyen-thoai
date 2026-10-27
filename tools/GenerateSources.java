package tools;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateSources {
    public static void main(String[] args) throws Exception {
        File srcDir = new File("src");
        List<String> files = new ArrayList<>();
        Files.walkFileTree(srcDir.toPath(), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (file.toString().endsWith(".java")) {
                    files.add(file.toString());
                }
                return FileVisitResult.CONTINUE;
            }
        });
        Collections.sort(files);
        try (PrintWriter pw = new PrintWriter(new File("sources.txt"), "UTF-8")) {
            for (String f : files) {
                pw.println(f);
            }
        }
        System.out.println("Generated sources.txt with " + files.size() + " files.");
    }
}
