package tools;

import java.io.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;

public class PostProcessor {
    public static void main(String[] args) throws Exception {
        File inJar = new File(args.length > 0 ? args[0] : "dist/Army2D_obf.jar");
        File outJar = new File(args.length > 1 ? args[1] : "dist/Army2D.jar");
        process(inJar, outJar);
    }

    public static void process(File inJar, File outJar) throws Exception {
        System.out.println("Post-processing jar: " + inJar.getPath() + " -> " + outJar.getPath());
        File tempOut = new File(outJar.getParentFile(), outJar.getName() + ".tmp");

        try (ZipFile zipIn = new ZipFile(inJar);
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tempOut))) {
            zos.setLevel(Deflater.BEST_COMPRESSION);

            Enumeration<? extends ZipEntry> entries = zipIn.entries();
            int classCount = 0;
            boolean hasManifest = false;
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                byte[] data = zipIn.getInputStream(entry).readAllBytes();

                if (entry.getName().endsWith(".class")) {
                    data = protectClass(data);
                    classCount++;
                } else if (entry.getName().equals("META-INF/MANIFEST.MF")) {
                    hasManifest = true;
                    String manifest = new String(data, "UTF-8");
                    manifest = manifest.replace("MIDlet-Vendor: Rikikono", "MIDlet-Vendor: ModByNguyenVanBang");
                    data = manifest.getBytes("UTF-8");
                }

                ZipEntry outEntry = new ZipEntry(entry.getName());
                zos.putNextEntry(outEntry);
                zos.write(data);
                zos.closeEntry();
            }

            if (!hasManifest) {
                File manifestFile = new File("resources/META-INF/MANIFEST.MF");
                if (manifestFile.exists()) {
                    ZipEntry me = new ZipEntry("META-INF/MANIFEST.MF");
                    zos.putNextEntry(me);
                    java.nio.file.Files.copy(manifestFile.toPath(), zos);
                    zos.closeEntry();
                    System.out.println("Injected META-INF/MANIFEST.MF into final jar.");
                }
            }
            System.out.println("Protected " + classCount + " classes with anti-decompiler signatures.");
        }

        if (outJar.exists()) {
            outJar.delete();
        }
        if (!tempOut.renameTo(outJar)) {
            // fallback copy
            try (InputStream in = new FileInputStream(tempOut);
                 OutputStream out = new FileOutputStream(outJar)) {
                in.transferTo(out);
            }
            tempOut.delete();
        }
        System.out.println("Final obfuscated JAR ready: " + outJar.getAbsolutePath());
    }

    private static byte[] protectClass(byte[] data) {
        ClassReader cr = new ClassReader(data);
        ClassWriter cw = new ClassWriter(0);
        cr.accept(new ClassVisitor(Opcodes.ASM9, cw) {
            @Override
            public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                // Injects invalid generic signature like Army2D_v240 to crash decompilers
                super.visit(version, access, name, "[[S", superName, interfaces);
            }

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                return super.visitMethod(access, name, descriptor, "[J", exceptions);
            }

            @Override
            public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
                return super.visitField(access, name, descriptor, "[J", value);
            }
        }, 0);
        return cw.toByteArray();
    }
}
