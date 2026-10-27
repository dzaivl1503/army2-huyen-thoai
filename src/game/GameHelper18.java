/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package game;

import game.BoardScreen;
import game.ClanScreen;
import game.GameCanvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper18 {
    public static Image[] a;
    private static Image var_javax_microedition_lcdui_Image_IllII1I1l1;
    private static int[] var_int_arr_IllII1I1l1;
    private static int[] var_int_arr_IIlll11IIl;
    private static int[] IlIIlI1IIlII;
    private static int var_int_IllII1I1l1;
    private static int var_int_IIlll11IIl;

    public static void a() {
        int[] nArray;
        for (int i = 0; i < 2; ++i) {
            int[] nArray2 = nArray = var_int_arr_IIlll11IIl;
            int n = i;
            nArray2[n] = nArray2[n] + IlIIlI1IIlII[i];
            if (var_int_arr_IIlll11IIl[i] <= GameCanvas.var_int_b) continue;
            GameHelper18.var_int_arr_IIlll11IIl[i] = -a[i].getWidth();
        }
        int[] nArray3 = nArray = var_int_arr_IIlll11IIl;
        nArray3[3] = nArray3[3] + IlIIlI1IIlII[3];
        if (var_int_arr_IIlll11IIl[2] > GameCanvas.var_int_b) {
            GameHelper18.var_int_arr_IIlll11IIl[2] = -a[2].getWidth();
        }
        if (var_int_arr_IIlll11IIl[3] > GameCanvas.var_int_b) {
            GameHelper18.var_int_arr_IIlll11IIl[3] = -a[2].getWidth();
        }
        if (GameCanvas.var_int_a % 2 == 0) {
            int[] nArray4 = nArray = var_int_arr_IIlll11IIl;
            nArray4[2] = nArray4[2] + IlIIlI1IIlII[2];
        }
    }

    public static void b() {
        if (GameCanvas.var_int_a % 2 == 0) {
            ++var_int_IIlll11IIl;
        }
        if (GameCanvas.var_int_a % 3 == 0) {
            ++var_int_IllII1I1l1;
        }
        if (var_int_IllII1I1l1 > GameCanvas.var_int_b) {
            var_int_IllII1I1l1 = -ClanScreen.var_javax_microedition_lcdui_Image_d.getWidth();
        }
        if (var_int_IIlll11IIl > GameCanvas.var_int_b) {
            var_int_IIlll11IIl = -ClanScreen.var_javax_microedition_lcdui_Image_d.getWidth();
        }
    }

    public static void a(Graphics graphics) {
        graphics.drawImage(var_javax_microedition_lcdui_Image_IllII1I1l1, 30, 40, 0);
        for (int i = 2; i >= 0; --i) {
            graphics.drawImage(a[i], var_int_arr_IIlll11IIl[i], var_int_arr_IllII1I1l1[i], 0);
        }
    }

    public static void b(Graphics graphics) {
        graphics.drawImage(ClanScreen.var_javax_microedition_lcdui_Image_a, GameCanvas.var_int_b - 20, 20, 24);
        graphics.drawImage(a[2], var_int_arr_IIlll11IIl[2], 100, 0);
        graphics.drawImage(a[2], var_int_arr_IIlll11IIl[3], 20, 0);
        graphics.drawImage(a[1], var_int_arr_IIlll11IIl[1], var_int_arr_IllII1I1l1[1], 0);
        graphics.drawImage(ClanScreen.var_javax_microedition_lcdui_Image_d, var_int_IllII1I1l1, 20, 0);
        graphics.drawImage(ClanScreen.var_javax_microedition_lcdui_Image_d, var_int_IIlll11IIl, 50, 0);
        graphics.drawImage(a[0], var_int_arr_IIlll11IIl[0], var_int_arr_IllII1I1l1[0], 0);
    }

    static {
        var_int_IllII1I1l1 = 60;
        var_int_IIlll11IIl = 170;
        var_int_arr_IIlll11IIl = new int[]{0, GameCanvas.var_int_d, 20, GameCanvas.var_int_b / 2 + 10};
        var_int_arr_IllII1I1l1 = new int[]{30, 80, 40, 0};
        IlIIlI1IIlII = new int[]{2, 1, 1, 1};
        var_javax_microedition_lcdui_Image_IllII1I1l1 = BoardScreen.e;
        a = BoardScreen.var_javax_microedition_lcdui_Image_arr_b;
    }
}

