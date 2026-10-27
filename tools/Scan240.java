package tools;

import org.objectweb.asm.*;
import java.io.*;
import java.util.zip.*;

public class Scan240 {
    static final char[] key = "\u7387\u6ef2\uc0a1\ub9dc\u9a9c\ue76f\u3b4a\u5830\ucdd2\u4e16\u7a77\u1e15".toCharArray();

    static String decrypt(String s) {
        int n = s.length();
        char[] cArray = new char[n];
        for (int i = 0; i < n; ++i) {
            cArray[i] = (char)(s.charAt(i) ^ key[i % key.length]);
        }
        return new String(cArray);
    }

    public static void main(String[] args) throws Exception {
        File jarFile = new File("C:/Users/Administrator/Downloads/240.jar");
        ZipFile zip = new ZipFile(jarFile);

        ZipEntry entry = zip.getEntry("game/RIKIKONO_BOKOgxYsYYpYjRetWvVx_BUITIENHIEP_COMq.class");
        InputStream is = zip.getInputStream(entry);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int n;
        while ((n = is.read(buf)) != -1) baos.write(buf, 0, n);
        byte[] bytes = baos.toByteArray();
        zip.close();

        ClassReader cr = new ClassReader(bytes);
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                return new MethodVisitor(Opcodes.ASM9) {
                    @Override
                    public void visitLdcInsn(Object value) {
                        if (value instanceof String) {
                            String dec = decrypt((String) value);
                            if (dec.contains("AMRY") || dec.contains("ARMY")) {
                                System.out.println("Method " + name + " has string: \"" + dec + "\"");
                            }
                        }
                    }
                };
            }
        }, ClassReader.SKIP_DEBUG);
    }
}
