/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab3;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class BaseScreen {
    public BaseScreen b;
    public static final int var_int_o;
    public GameCommand f;
    public GameCommand g;
    public GameCommand h;
    public boolean j = false;
    public int p;
    public int var_int_q;
    private int var_int_I11I11I1l;
    private int var_int_III11II1I1;
    private static int var_int_I1ll1l1l111l;
    public static int var_int_r;
    public static Image var_javax_microedition_lcdui_Image_q;
    public static Image var_javax_microedition_lcdui_Image_r;
    private static Image var_javax_microedition_lcdui_Image_I11I11I1l;
    private static Image var_javax_microedition_lcdui_Image_III11II1I1;
    private static Image var_javax_microedition_lcdui_Image_I1ll1l1l111l;
    private static Image var_javax_microedition_lcdui_Image_ll1111lIlll;
    private static Image var_javax_microedition_lcdui_Image_llIIIlIll;
    private static Image II1III1II11;
    private static Image lll1IlIIl1lI;
    public static Image s;
    public static boolean k;
    private static int var_int_ll1111lIlll;
    private static int var_int_llIIIlIll;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean var_boolean_o;

    public BaseScreen() {
        String string = System.getProperty("microedition.platform");
        k = string != null && string.indexOf("NX") == 0;
    }

    public void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        BaseScreen.c(graphics);
        int n = GameCanvas.var_boolean_d ? 12 : 3;
        if (GameCanvas.var_game_GameHelper21_a == null && !GameCanvas.var_game_GameHelper10_a.var_boolean_a) {
            if (this.f != null) {
                FontRenderer.a.a(graphics, this.f.var_java_lang_String_a, 5, GameCanvas.var_int_c - FontRenderer.a.a() - n, 0);
            }
            if (this.g != null) {
                FontRenderer.a.a(graphics, this.g.var_java_lang_String_a, GameCanvas.var_int_d, GameCanvas.var_int_c - var_int_r / 2 - 8, 2);
            }
            if (this.h != null) {
                FontRenderer.a.a(graphics, this.h.var_java_lang_String_a, GameCanvas.var_int_b - 5, GameCanvas.var_int_c - FontRenderer.a.a() - n, 1);
            }
        }
    }

    public static void b(Graphics graphics) {
        graphics.setClip(0, 0, 1000, 1000);
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        if (++var_int_ll1111lIlll == 5) {
            var_int_ll1111lIlll = 0;
            var_int_llIIIlIll = -var_int_llIIIlIll;
        }
        graphics.drawImage(lll1IlIIl1lI, 5, 5 + var_int_llIIIlIll, 0);
    }

    public abstract void c();

    public final boolean boolean_a() {
        return GameCanvas.var_game_BaseScreen_a == this;
    }

    public void void_a() {
        if (this.var_int_q != this.p) {
            this.var_int_III11II1I1 = this.p - this.var_int_q << 2;
            this.var_int_I11I11I1l += this.var_int_III11II1I1;
            this.var_int_q += this.var_int_I11I11I1l >> 3;
            this.var_int_I11I11I1l &= 0xF;
        }
    }

    public void void_b() {
        if (GameCanvas.var_boolean_arr_a[5] || BaseScreen.boolean_a((byte)2)) {
            GameCanvas.var_boolean_arr_a[5] = false;
            if (this.g != null && this.g.var_game_IActionListener_a != null) {
                this.g.var_game_IActionListener_a.a();
            }
        }
        if ((GameCanvas.var_boolean_arr_a[12] || BaseScreen.boolean_a((byte)0)) && !GameCanvas.var_boolean_arr_b[5]) {
            GameCanvas.var_boolean_arr_a[12] = false;
            if (this.f != null && this.f.var_game_IActionListener_a != null) {
                this.f.var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_arr_a[13] || BaseScreen.boolean_a((byte)1) && !GameCanvas.var_boolean_arr_b[5]) {
            GameCanvas.var_boolean_arr_a[13] = false;
            if (this.h != null && this.h.var_game_IActionListener_a != null) {
                this.h.var_game_IActionListener_a.a();
            }
        }
    }

    public static void m() {
        for (int i = 0; i < GameCanvas.var_boolean_arr_a.length; ++i) {
            GameCanvas.var_boolean_arr_b[i] = false;
            GameCanvas.var_boolean_arr_a[i] = false;
        }
    }

    public void b_() {
        BaseScreen.m();
        GameCanvas.var_game_BaseScreen_a = this;
    }

    public void a(BaseScreen baseScreen) {
        this.b = baseScreen;
        BaseScreen.m();
        GameCanvas.var_game_BaseScreen_a = this;
    }

    public void b(int n) {
    }

    public static boolean boolean_a(byte by) {
        return GameCanvas.var_boolean_c && (by == 0 ? GameCanvas.a(0, GameCanvas.var_int_c - var_int_r, var_int_I1ll1l1l111l, var_int_r) : (by == 1 ? GameCanvas.a(GameCanvas.var_int_b - var_int_I1ll1l1l111l, GameCanvas.var_int_c - var_int_r, var_int_I1ll1l1l111l, var_int_r) : GameCanvas.a(GameCanvas.var_int_b - var_int_I1ll1l1l111l >> 1, GameCanvas.var_int_c - var_int_r, var_int_I1ll1l1l111l, var_int_r)));
    }

    public static void c(Graphics graphics) {
        int n = var_int_r;
        graphics.setColor(12965614);
        graphics.fillRect(0, GameCanvas.var_int_c - n, GameCanvas.var_int_b, n);
        graphics.setColor(0x303030);
        graphics.drawLine(0, GameCanvas.var_int_c - n, GameCanvas.var_int_b, GameCanvas.var_int_c - n);
        graphics.setColor(0xFFFFFF);
        graphics.drawLine(0, GameCanvas.var_int_c - n + 1, GameCanvas.var_int_b, GameCanvas.var_int_c - n + 1);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, String string) {
        int n4;
        int n5 = (n2 << 5) + 56;
        int n6 = GameCanvas.var_int_b / 2 - n5 / 2;
        graphics.setColor(12965614);
        graphics.fillRect(n6, n + 20, n5 - 1, n3 - 25);
        graphics.setColor(0x303030);
        graphics.drawRect(n6, n + 10, n5 - 1, n3 - 15);
        graphics.drawImage(var_javax_microedition_lcdui_Image_I11I11I1l, n6, n, 0);
        for (n4 = 0; n4 < n2; ++n4) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_III11II1I1, n6 + 23 + (n4 << 5), n, 0);
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_I1ll1l1l111l, n6 + 23 + (n2 << 5), n, 0);
        graphics.drawImage(var_javax_microedition_lcdui_Image_ll1111lIlll, n6, n + n3 - var_javax_microedition_lcdui_Image_ll1111lIlll.getHeight(), 0);
        graphics.drawImage(var_javax_microedition_lcdui_Image_llIIIlIll, n6 + n5 - var_javax_microedition_lcdui_Image_llIIIlIll.getWidth(), n + n3 - var_javax_microedition_lcdui_Image_llIIIlIll.getHeight(), 0);
        graphics.setColor(12965614);
        graphics.fillRect(n6 + 23, n + n3 - 5, n5 - 46, 5);
        graphics.setColor(0x303030);
        graphics.drawLine(n6 + 23, n + n3 - 1, n6 + n5 - 23, n + n3 - 1);
        graphics.setColor(8620444);
        graphics.drawLine(n6 + 23, n + n3 - 2, n6 + n5 - 23, n + n3 - 2);
        graphics.setColor(8620444);
        graphics.drawLine(n6 + 1, n + 20, n6 + 1, n + n3 - 5);
        graphics.drawLine(n6 + n5 - 2, n + 20, n6 + n5 - 2, n + n3 - 5);
        if (string != null && !string.equals("")) {
            graphics.setColor(12965614);
            n4 = FontRenderer.e.a(string);
            graphics.fillRect(n6 + n5 / 2 - n4 / 2 - 5, n + 1, n4 + 10, 18);
            graphics.setColor(6985149);
            graphics.drawRect(n6 + n5 / 2 - n4 / 2 - 5, n + 1, n4 + 10, 17);
            FontRenderer.e.a(graphics, string, n6 + n5 / 2, n + 3, 2);
        }
    }

    public static void a(int n, int n2, int n3, int n4, Graphics graphics) {
        graphics.setClip(0, 0, 1000, 1000);
        graphics.setColor(12965614);
        graphics.fillRect(n + 5, n2 + 5, n3 - 10, n4 - 10);
        graphics.setColor(6457531);
        graphics.drawRect(n + 6, n2 + 6, n3 - 13, n4 - 13);
        graphics.drawImage(II1III1II11, n, n2, 0);
        DataUtils.a(graphics, II1III1II11, 0, 0, 14, 14, 5, n + n3, n2, 24);
        DataUtils.a(graphics, II1III1II11, 0, 0, 14, 14, 3, n + n3, n2 + n4, 40);
        DataUtils.a(graphics, II1III1II11, 0, 0, 14, 14, 6, n, n2 + n4, 36);
        graphics.setColor(0x303030);
        graphics.drawLine(n + 14, n2, n + n3 - 14, n2);
        graphics.drawLine(n, n2 + 14, n, n2 + n4 - 14);
        graphics.drawLine(n + n3 - 1, n2 + 14, n + n3 - 1, n2 + n4 - 14);
        graphics.drawLine(n + 14, n2 + n4 - 1, n + n3 - 14, n2 + n4 - 1);
        graphics.setColor(6457531);
        graphics.fillRect(n + 14, n2 + 1, n3 - 28, 4);
        graphics.fillRect(n + 14, n2 + n4 - 6, n3 - 28, 4);
        graphics.fillRect(n + 1, n2 + 14, 4, n4 - 28);
        graphics.fillRect(n + n3 - 6, n2 + 14, 4, n4 - 28);
        graphics.setColor(4678279);
        graphics.drawRect(n + 14, n2 + 1, n3 - 28, 4);
        graphics.drawRect(n + 14, n2 + n4 - 6, n3 - 28, 4);
        graphics.drawRect(n + 1, n2 + 14, 4, n4 - 28);
        graphics.drawRect(n + n3 - 6, n2 + 14, 4, n4 - 28);
    }

    static {
        var_int_o = FontRenderer.a.a() + 6;
        var_int_I1ll1l1l111l = FontRenderer.a.a("_TEXT__");
        var_int_r = 20;
        try {
            var_javax_microedition_lcdui_Image_I11I11I1l = Image.createImage((String)"/map/tab_1.png");
            var_javax_microedition_lcdui_Image_III11II1I1 = Image.createImage((String)"/map/tab_2.png");
            var_javax_microedition_lcdui_Image_I1ll1l1l111l = Image.createImage((String)"/map/tab_3.png");
            var_javax_microedition_lcdui_Image_ll1111lIlll = Image.createImage((String)"/map/tab_4.png");
            var_javax_microedition_lcdui_Image_llIIIlIll = Image.createImage((String)"/map/tab_5.png");
            II1III1II11 = Image.createImage((String)"/map/corner.png");
            lll1IlIIl1lI = Image.createImage((String)"/lever-up.png");
            s = Image.createImage((String)"/cup.png");
            var_javax_microedition_lcdui_Image_q = Image.createImage((String)"/x.png");
            var_javax_microedition_lcdui_Image_r = Image.createImage((String)"/v.png");
        } catch (Exception e) {}
        var_int_llIIIlIll = 1;
    }
}

