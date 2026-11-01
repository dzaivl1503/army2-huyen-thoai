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

public final class PlayerAccountInfo {
    public int var_int_a = -1;
    public String var_java_lang_String_a = "";
    public long var_long_a;
    public int var_int_b;
    public int var_int_c;
    public long var_long_b;
    public short var_short_a;
    public int var_int_d;
    public byte var_byte_a;
    public short var_short_b;
    public short[][] var_short_arr_arr_a = new short[10][5];
    public short[][] var_short_arr_arr_b = new short[10][5];
    public long var_long_c;
    public long e;
    public short[] var_short_arr_a = new short[5];
    public EquipSlotSet var_game_EquipSlotSet_a;
    public EquipSlotSet var_game_EquipSlotSet_b;
    public String var_java_lang_String_b;
    public int f;
    public short[] var_short_arr_b = new short[5];
    public byte[] var_byte_arr_a = new byte[5];
    public byte[] var_byte_arr_b = new byte[5];
    public int[] var_int_arr_a = new int[5];
    public int[] var_int_arr_b = new int[5];
    public int g;
    public boolean var_boolean_a;
    public int h;
    public int[] var_int_arr_c = new int[5];
    public static String[] var_java_lang_String_arr_a;
    public static int[] var_int_arr_d;
    public static int i;
    public Image var_javax_microedition_lcdui_Image_a;
    public String var_java_lang_String_c;
    public String var_java_lang_String_d;
    public byte var_byte_b;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public byte var_byte_c;
    public int j;
    public FloatingTextManager var_game_FloatingTextManager_a = new FloatingTextManager();

    public final void a() {
        for (int i = 0; i < this.var_short_arr_a.length; ++i) {
            this.var_short_arr_b[i] = this.var_short_arr_a[i];
            this.var_int_arr_a[i] = 0;
            this.var_int_arr_b[i] = 0;
        }
    }

    public final void b() {
        this.var_game_EquipSlotSet_a = new EquipSlotSet(new short[][]{{this.var_byte_a, 0, this.var_short_arr_arr_a[this.var_byte_a][0]}, {this.var_byte_a, 1, this.var_short_arr_arr_a[this.var_byte_a][1]}, {this.var_byte_a, 2, this.var_short_arr_arr_a[this.var_byte_a][2]}, {this.var_byte_a, 3, this.var_short_arr_arr_a[this.var_byte_a][3]}, {this.var_byte_a, 4, this.var_short_arr_arr_a[this.var_byte_a][4]}});
    }

    public final void c() {
        this.var_game_EquipSlotSet_b = new EquipSlotSet(new short[][]{{this.var_byte_a, 0, this.var_short_arr_arr_b[this.var_byte_a][0]}, {this.var_byte_a, 1, this.var_short_arr_arr_b[this.var_byte_a][1]}, {this.var_byte_a, 2, this.var_short_arr_arr_b[this.var_byte_a][2]}, {this.var_byte_a, 3, this.var_short_arr_arr_b[this.var_byte_a][3]}, {this.var_byte_a, 4, this.var_short_arr_arr_b[this.var_byte_a][4]}});
    }

    public final void d() {
        for (int i = 0; i < 5; ++i) {
            this.var_int_arr_a[i] = 0;
            this.var_int_arr_b[i] = 0;
        }
    }

    public final void e() {
        for (int i = 0; i < 5; ++i) {
            this.var_int_arr_a[i] = 0;
            this.var_int_arr_b[i] = 0;
            this.var_byte_arr_a[i] = 0;
            this.var_byte_arr_b[i] = 0;
        }
    }

    public final void f() {
        for (int i = 0; i < var_int_arr_d.length; ++i) {
            if (this.var_int_b < var_int_arr_d[i]) continue;
            this.g = i;
            return;
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        this.var_game_FloatingTextManager_a.a(graphics, n, n2, n3);
    }
}

