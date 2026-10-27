package tools;

public class Decrypt {
    private static final char[] key = "\u73cb\u4150\u7652\u7cb4\u0758\ua811\u43f4\u8cbe\ua84b\u0531\uf747\uc01f".toCharArray();

    public static String decrypt(String s) {
        char[] out = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            out[i] = (char)(s.charAt(i) ^ key[i % key.length]);
        }
        return new String(out);
    }

    public static void main(String[] args) {
        System.out.println("field1541: " + decrypt("\u73a6\u4135\u763c\u7cc1\u073a\ua876\u43da\u8cce\ua825\u0556"));
        System.out.println("field1546: " + decrypt("\u73bf\u4122\u7633\u7cda\u072b\ua861\u4395\u8ccc\ua82e\u055f\uf733\uc031\u73bb\u413e\u7635"));
    }
}
