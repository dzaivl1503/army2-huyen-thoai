/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 */
package tab.tab5;

import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class DataUtils {
    private static Random var_java_util_Random_llIlll1l1l;
    private static short[] var_short_arr_llIlll1l1l;
    private static short[] llllI111;
    private static int[] var_int_arr_llIlll1l1l;
    private static Class var_java_lang_Class_llIlll1l1l;

    public static int int_a(int n) {
        if ((n = DataUtils.c(n)) >= 0 && n < 90) {
            return var_short_arr_llIlll1l1l[n];
        }
        if (n >= 90 && n < 180) {
            return var_short_arr_llIlll1l1l[180 - n];
        }
        if (n >= 180 && n < 270) {
            return -var_short_arr_llIlll1l1l[n - 180];
        }
        return -var_short_arr_llIlll1l1l[360 - n];
    }

    public static int b(int n) {
        if ((n = DataUtils.c(n)) >= 0 && n < 90) {
            return llllI111[n];
        }
        if (n >= 90 && n < 180) {
            return -llllI111[180 - n];
        }
        if (n >= 180 && n < 270) {
            return -llllI111[n - 180];
        }
        return llllI111[360 - n];
    }

    public static final int a(int n, int n2) {
        if (n == 0) {
            if (n2 <= 0) {
                return 270;
            }
            return 90;
        }
        int n3 = Math.abs((n2 << 10) / n);
        int n4 = 0;
        while (true) {
            if (n4 > 90) {
                n3 = 0;
                break;
            }
            if (var_int_arr_llIlll1l1l[n4] >= n3) {
                n3 = n4;
                break;
            }
            ++n4;
        }
        if (n2 >= 0 && n < 0) {
            n3 = 180 - n3;
        }
        if (n2 < 0 && n < 0) {
            n3 += 180;
        }
        if (n2 < 0 && n >= 0) {
            n3 = 360 - n3;
        }
        return n3;
    }

    public static String java_lang_String_a(int n) {
        int n2 = n / 86400;
        int n3 = (n %= 86400) / 3600;
        int n4 = (n %= 3600) / 60;
        if ((n %= 60) < 0) {
            n = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        return n2 + "n " + (n3 >= 10 ? "" : "0") + n3 + ":" + (n4 >= 10 ? "" : "0") + n4 + ":" + (n >= 10 ? "" : "0") + n;
    }

    public static final int c(int n) {
        if (n >= 360) {
            n -= 360;
        }
        if (n < 0) {
            n += 360;
        }
        return n;
    }

    public static int b(int n, int n2) {
        return n + var_java_util_Random_llIlll1l1l.nextInt(n2 - n);
    }

    public static int d(int n) {
        return var_java_util_Random_llIlll1l1l.nextInt() % n;
    }

    public static boolean boolean_a(int n) {
        return n >> 24 != 0;
    }

    public static boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        return n >= n3 && n < n3 + n5 && n2 >= n4 && n2 < n4 + n6;
    }

    public static boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return n + n3 >= n5 && n <= n5 + n7 && n2 + n4 >= n6 && n2 <= n6 + n8;
    }

    public static int e(int n) {
        int n2;
        if (n <= 0) {
            return 0;
        }
        int n3 = (n + 1) / 2;
        while (Math.abs((n2 = n3) - (n3 = n3 / 2 + n / (n3 << 1))) > 1) {
        }
        return n3;
    }

    public static final byte[] byte_arr_a(String storeName) {
        try {
            RecordStore rs = RecordStore.openRecordStore(storeName, false);
            byte[] byArray = rs.getRecord(1);
            rs.closeRecordStore();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(String string, int n) {
        DataUtils.a(new byte[]{(byte)n}, string);
    }

    public static void a(String string, String string2) {
        DataUtils.a(string2.getBytes(), string);
    }

    public static String java_lang_String_a(String storeName) {
        byte[] byArray = DataUtils.byte_arr_a(storeName);
        if (byArray == null) {
            return "";
        }
        return new String(byArray);
    }

    public static int int_a(String storeName) {
        byte[] byArray = DataUtils.byte_arr_a(storeName);
        if (byArray == null) {
            return -1;
        }
        return byArray[0];
    }

    public static final void a(byte[] byArray, String string) {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            if (byArray != null) {
                if (recordStore.getNumRecords() == 0) {
                    recordStore.addRecord(byArray, 0, byArray.length);
                } else {
                    recordStore.setRecord(1, byArray, 0, byArray.length);
                }
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            new StringBuffer("[y] save rms '").append(string).append("' error!");
            return;
        }
    }

    public static final int a(int n, byte[] byArray) {
        return (byArray[n] & 0xFF) << 8 | byArray[n + 1] & 0xFF;
    }

    public static void a() {
        try {
            String[] stringArray = RecordStore.listRecordStores();
            if (stringArray != null) {
                for (int i = 0; i < stringArray.length; ++i) {
                    RecordStore.deleteRecordStore((String)stringArray[i]);
                }
                return;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static GameHelper40 a(GameHelper40 gameHelper40, int n) {
        gameHelper40.a += gameHelper40.b;
        if (gameHelper40.b == -1 && Math.abs(gameHelper40.a) > n) {
            gameHelper40.b = -gameHelper40.b;
        }
        if (gameHelper40.b == 1 && gameHelper40.a > 5) {
            gameHelper40.b = -gameHelper40.b;
        }
        return gameHelper40;
    }

    public static String a(long l) {
        String string = "";
        long l2 = l / 1000L + 1L;
        int n = 0;
        while ((long)n < l2) {
            if (l < 1000L) {
                string = l + string;
                break;
            }
            long l3 = l % 1000L;
            string = l3 == 0L ? ".000" + string : (l3 < 10L ? ".00" + l3 + string : (l3 < 100L ? ".0" + l3 + string : "." + l3 + string));
            l /= 1000L;
            ++n;
        }
        return string;
    }

    public static void a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n + n3 > image.getWidth() && (n3 = image.getWidth() - n) <= 0) {
            n3 = 1;
        }
        if (n2 + n4 > image.getHeight() && (n4 = image.getHeight() - n2) <= 0) {
            n4 = 1;
        }
        graphics.drawRegion(image, n, n2, n3, n4, n5, n6, n7, n8);
    }

    public static InputStream java_io_InputStream_a(String string) {
        if (string == null) return null;
        if (!string.startsWith("/")) {
            InputStream is = DataUtils.class.getResourceAsStream("/" + string);
            if (is != null) return is;
        }
        return DataUtils.class.getResourceAsStream(string);
    }

    static {
        var_java_util_Random_llIlll1l1l = new Random();
        var_short_arr_llIlll1l1l = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
        llllI111 = new short[91];
        var_int_arr_llIlll1l1l = new int[91];
        for (int i = 0; i <= 90; ++i) {
            DataUtils.llllI111[i] = var_short_arr_llIlll1l1l[90 - i];
            DataUtils.var_int_arr_llIlll1l1l[i] = llllI111[i] == 0 ? Integer.MAX_VALUE : (var_short_arr_llIlll1l1l[i] << 10) / llllI111[i];
        }
    }
}

