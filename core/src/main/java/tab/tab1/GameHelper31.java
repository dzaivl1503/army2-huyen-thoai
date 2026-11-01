/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper31 {
    private static Image var_javax_microedition_lcdui_Image_ll1IlI1Il;
    public static final String[] var_java_lang_String_arr_a;
    public byte var_byte_a;
    public String var_java_lang_String_a;
    public byte var_byte_b;
    public int var_int_a;
    public int var_int_b;
    public byte var_byte_c;
    public byte d;
    public byte e;
    public byte f;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    private static int l11lllI1l1;
    public static int var_int_c;
    private static byte[] var_byte_arr_ll1IlI1Il;
    private static byte[] lIIlIIII1I11;
    public int g;

    public GameHelper31(byte by, int n, int n2, int n3) {
        this.var_byte_a = by;
        this.var_byte_b = (byte)n;
        this.g = n;
        this.var_byte_c = 0;
        this.d = 0;
        this.var_int_a = n2;
        this.var_int_b = n3;
        this.var_java_lang_String_a = var_java_lang_String_arr_a[by];
        this.e = lIIlIIII1I11[by];
        this.f = var_byte_arr_ll1IlI1Il[by];
        this.var_boolean_a = false;
        switch (by) {
            case 0: {
                this.var_boolean_b = true;
                this.var_byte_b = (byte)99;
                return;
            }
            case 1: {
                this.var_boolean_b = true;
                this.var_byte_b = (byte)99;
                return;
            }
            case 12: {
                this.var_boolean_a = true;
                return;
            }
            case 13: {
                this.var_boolean_a = true;
                return;
            }
            case 14: {
                this.var_boolean_a = true;
                return;
            }
            case 15: {
                this.var_boolean_a = true;
            }
        }
    }

    public static void a(Graphics graphics, int n, int n2, int n3) {
        try {
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_ll1IlI1Il, 0, n + 2 << 4, 16, 16, 0, n2 + 8, n3 + 8, 3);
            return;
        }
        catch (Exception exception) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(n2, n3, 16, 16);
            return;
        }
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        try {
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_ll1IlI1Il, 0, n + 2 << 4, 16, 16, 0, n2, n3, 33);
            return;
        }
        catch (Exception exception) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(n2, n3, 16, 16);
            return;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        try {
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_ll1IlI1Il, 0, this.var_byte_a + 2 << 4, 16, 16, 0, n, n2, 0);
            return;
        }
        catch (Exception exception) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(n, n2, 16, 16);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(Graphics graphics, int[] nArray, int n, int n2, int n3, boolean bl, byte[] byArray) {
        int n4;
        int n5;
        int n6 = 0;
        int n7 = 0;
        byte by = (byte)(bl ? 22 : 0);
        for (n5 = 0; n5 < nArray.length; ++n5) {
            n4 = n2 + n6 * (16 + l11lllI1l1 + by);
            int string = n3 + n7 * (16 + l11lllI1l1 + by);
            if (n >= 0 && n5 == n) {
                graphics.setColor(GameCanvas.var_int_a % 5 <= 2 ? 0xFF0000 : 0xFFFF00);
                graphics.fillRect(n4 - l11lllI1l1 / 2, string - l11lllI1l1 / 2, 16 + l11lllI1l1, 16 + l11lllI1l1);
            }
            try {
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_ll1IlI1Il, 0, nArray[n5] + 2 << 4, 16, 16, 0, n4, string, 0);
            }
            catch (Exception exception) {
                graphics.fillRect(n4, string, 16, 16);
            }
            if (++n6 <= var_int_c - 1) continue;
            n6 = 0;
            ++n7;
        }
        n6 = 0;
        n7 = 0;
        for (n5 = 0; n5 < nArray.length; ++n5) {
            n = n2 + n6 * (16 + l11lllI1l1 + by);
            n4 = GameCanvas.var_game_BaseScreen_a == BattleScreen.var_game_BattleScreen_a ? n3 + n7 * (16 + l11lllI1l1 + by) : n3 + n7 * (16 + l11lllI1l1 + by);
            try { String string = nArray[n5] == 100 ? "" : String.valueOf((int)nArray[n5]);
                FontRenderer.h.a(graphics, string, n + 12, n4 + 12, 0);
            }
            catch (Exception exception) {}
            if (++n6 <= var_int_c - 1) continue;
            n6 = 0;
            ++n7;
        }
    }

    static {
        var_java_lang_String_arr_a = StringUtils.java_lang_String_arr_c();
        l11lllI1l1 = 2;
        var_int_c = 4;
        var_byte_arr_ll1IlI1Il = new byte[]{2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        lIIlIIII1I11 = new byte[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        var_javax_microedition_lcdui_Image_ll1IlI1Il = BattleScreen.var_javax_microedition_lcdui_Image_f;
    }
}

