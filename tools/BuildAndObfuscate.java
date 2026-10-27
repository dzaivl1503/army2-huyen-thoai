package tools;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.SecureRandom;
import java.util.*;
import java.util.zip.*;
import javax.tools.*;

public class BuildAndObfuscate {
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println("==================================================");
            System.out.println("     Building & Obfuscating Army2D (ModByNguyenVanBang)");
            System.out.println("==================================================");

            File rootDir = new File(".").getCanonicalFile();
            File srcDir = new File(rootDir, "src");
            File resourcesDir = new File(rootDir, "resources");
            File libDir = new File(rootDir, "lib");
            File buildDir = new File(rootDir, "build");
            File distDir = new File(rootDir, "dist");
            File toolsDir = new File(rootDir, "tools");

            buildDir.mkdirs();
            distDir.mkdirs();
            toolsDir.mkdirs();

            // 1. Dictionaries not needed for compact short names
            // ensureDictionaries(toolsDir);

            // 2. Scan source files
            System.out.println("\n[1/5] Scanning source files...");
            List<File> javaFiles = new ArrayList<>();
            Files.walkFileTree(srcDir.toPath(), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    if (file.toString().endsWith(".java")) {
                        javaFiles.add(file.toFile());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
            System.out.println("Found " + javaFiles.size() + " Java source files.");

            // 3. Compile sources
            System.out.println("\n[2/5] Compiling Java sources with J2ME CLDC/MIDP libraries...");
            String classPath = String.join(File.pathSeparator,
                new File(libDir, "cldc_1.1.jar").getAbsolutePath(),
                new File(libDir, "midp_2.1.jar").getAbsolutePath(),
                new File(libDir, "jsr082_1.1.jar").getAbsolutePath(),
                new File(libDir, "jsr205_2.0.jar").getAbsolutePath(),
                new File(libDir, "jsr280_1.0.jar").getAbsolutePath()
            );

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            if (compiler == null) {
                throw new RuntimeException("JDK JavaCompiler not found. Please run with a JDK.");
            }

            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, java.nio.charset.StandardCharsets.UTF_8);
            Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(javaFiles);
            List<String> options = Arrays.asList(
                "-encoding", "UTF-8",
                "-d", buildDir.getAbsolutePath(),
                "-cp", classPath,
                "-source", "1.8",
                "-target", "1.8",
                "-nowarn"
            );

            JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, options, null, compilationUnits);
            boolean success = task.call();
            fileManager.close();

            if (!success) {
                throw new RuntimeException("Compilation failed!");
            }
            System.out.println("Compilation successful!");

            // Synchronize compiled classes to out/production/Army2D
            File outProd = new File(rootDir, "out/production/Army2D");
            if (outProd.exists()) {
                copyDirectory(buildDir, outProd);
                System.out.println("Synchronized classes to " + outProd.getAbsolutePath());
            }

            // 4. Create raw un-obfuscated jar
            System.out.println("\n[3/5] Packaging raw JAR with resources...");
            File rawJar = new File(distDir, "Army2D_raw.jar");
            packageJar(buildDir, resourcesDir, rawJar);
            System.out.println("Created: " + rawJar.getAbsolutePath() + " (" + rawJar.length() + " bytes)");

            // 5. Run ProGuard
            System.out.println("\n[4/5] Running ProGuard Obfuscation...");
            File proguardPro = new File(toolsDir, "proguard.pro");
            File obfJar = new File(distDir, "Army2D_obf.jar");
            if (obfJar.exists()) obfJar.delete();

            // Run ProGuard via ProcessBuilder to prevent System.exit() from killing the build
            String javaExe = ProcessHandle.current().info().command().orElse("java");
            ProcessBuilder pb = new ProcessBuilder(
                javaExe,
                "-jar", new File(toolsDir, "proguard.jar").getAbsolutePath(),
                "@tools/proguard.pro"
            );
            pb.directory(rootDir);
            pb.inheritIO();
            Process p = pb.start();
            int exitCode = p.waitFor();
            if (exitCode != 0) {
                throw new RuntimeException("ProGuard exited with code " + exitCode);
            }

            if (!obfJar.exists()) {
                throw new RuntimeException("ProGuard output jar was not generated!");
            }
            System.out.println("ProGuard obfuscation finished: " + obfJar.length() + " bytes");

            // 6. Post-process anti-decompilation and manifest
            System.out.println("\n[5/5] Injecting anti-decompilation protection & updating metadata...");
            File finalJar = new File(distDir, "Army2D.jar");
            PostProcessor.process(obfJar, finalJar);

            // Also copy to Army2D_ModByNguyenVanBang.jar for convenience
            File namedJar = new File(distDir, "Army2D_ModByNguyenVanBang.jar");
            try {
                Files.copy(finalJar.toPath(), namedJar.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception copyEx) {
                System.out.println("  [Warning] Could not copy to " + namedJar.getName() + " (file may be open in emulator): " + copyEx.getMessage());
            }

            File lightJar = new File(distDir, "Army2D_Light.jar");
            try {
                Files.copy(finalJar.toPath(), lightJar.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception copyEx) {
                System.out.println("  [Warning] Could not copy to " + lightJar.getName() + ": " + copyEx.getMessage());
            }

            long elapsed = System.currentTimeMillis() - start;
            System.out.println("\n==================================================");
            System.out.println("BUILD & OBFUSCATION COMPLETED SUCCESSFULLY in " + (elapsed / 1000.0) + "s!");
            System.out.println("  -> " + finalJar.getAbsolutePath() + " (" + finalJar.length() + " bytes)");
            System.out.println("  -> " + lightJar.getAbsolutePath() + " (" + lightJar.length() + " bytes)");
            System.out.println("  -> " + namedJar.getAbsolutePath() + " (" + namedJar.length() + " bytes)");
            System.out.println("==================================================");

        } catch (Exception e) {
            System.err.println("\n[ERROR] Build failed: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void ensureDictionaries(File toolsDir) throws IOException {
        File classDict = new File(toolsDir, "class_dict.txt");
        if (!classDict.exists() || classDict.length() == 0) {
            System.out.println("Generating class dictionary (ModByNguyenVanBang pattern)...");
            SecureRandom rnd = new SecureRandom();
            Set<String> names = new LinkedHashSet<>();
            while (names.size() < 1200) {
                int len = 14 + rnd.nextInt(7);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < len; i++) {
                    sb.append(CHARS.charAt(rnd.nextInt(CHARS.length())));
                }
                char suffix = LOWER.charAt(rnd.nextInt(LOWER.length()));
                names.add("ModByNguyenVanBang_" + sb.toString() + "_ModByNguyenVanBang" + suffix);
            }
            Files.write(classDict.toPath(), names);
        }

        File memberDict = new File(toolsDir, "member_dict.txt");
        if (!memberDict.exists() || memberDict.length() == 0) {
            throw new RuntimeException("tools/member_dict.txt is missing!");
        }
    }

    private static void packageJar(File classesDir, File resourcesDir, File outJar) throws IOException {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outJar))) {
            zos.setLevel(Deflater.BEST_COMPRESSION);
            // First add MANIFEST.MF
            File manifestFile = new File(resourcesDir, "META-INF/MANIFEST.MF");
            if (manifestFile.exists()) {
                ZipEntry me = new ZipEntry("META-INF/MANIFEST.MF");
                zos.putNextEntry(me);
                Files.copy(manifestFile.toPath(), zos);
                zos.closeEntry();
            }

            // Add resources (except META-INF/MANIFEST.MF)
            addDirectoryToZip(resourcesDir, resourcesDir, zos, true);

            // Add compiled classes
            addDirectoryToZip(classesDir, classesDir, zos, false);
        }
    }

    private static void addDirectoryToZip(File baseDir, File currentDir, ZipOutputStream zos, boolean isResource) throws IOException {
        File[] files = currentDir.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) {
                addDirectoryToZip(baseDir, f, zos, isResource);
            } else {
                String relPath = baseDir.toPath().relativize(f.toPath()).toString().replace('\\', '/');
                if (isResource && relPath.equals("META-INF/MANIFEST.MF")) {
                    continue; // already added first
                }
                ZipEntry entry = new ZipEntry(relPath);
                zos.putNextEntry(entry);
                Files.copy(f.toPath(), zos);
                zos.closeEntry();
            }
        }
    }

    private static void copyDirectory(File src, File dest) throws IOException {
        if (!dest.exists()) {
            dest.mkdirs();
        }
        File[] files = src.listFiles();
        if (files == null) return;
        for (File f : files) {
            File target = new File(dest, f.getName());
            if (f.isDirectory()) {
                copyDirectory(f, target);
            } else {
                try {
                    Files.copy(f.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    System.out.println("[Warning] Khong the ghi de " + target.getName() + " (dang bi khoa boi tien trinh khac)");
                }
            }
        }
    }
}
