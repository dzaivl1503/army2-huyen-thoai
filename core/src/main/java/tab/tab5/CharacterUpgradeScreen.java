/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class CharacterUpgradeScreen
extends ScrollDialogScreen {
    public static CharacterUpgradeScreen var_game_CharacterUpgradeScreen_a;
    public static Image var_javax_microedition_lcdui_Image_a;
    private static Image var_javax_microedition_lcdui_Image_II11I1l1Il1;
    private int var_int_IIl11I1IllI = 0;
    private short var_short_IIl11I1IllI;
    private short[] var_short_arr_IIl11I1IllI = new short[5];
    private short[] var_short_arr_II11I1l1Il1 = new short[5];
    private GameCommand var_game_GameCommand_IIl11I1IllI;
    private static String[] var_java_lang_String_arr_IIl11I1IllI;
    private GameCommand var_game_GameCommand_II11I1l1Il1;
    byte[] var_byte_arr_a = new byte[5];
    byte[] b = new byte[5];

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        GameCanvas.var_java_util_Vector_a.removeAllElements();
        this.var_short_IIl11I1IllI = TerrainMidlet.myInfo.var_short_a;
        for (int i = 0; i < 5; ++i) {
            this.var_short_arr_IIl11I1IllI[i] = TerrainMidlet.myInfo.var_short_arr_a[i];
            this.b[i] = 0;
        }
        this.var_short_arr_II11I1l1Il1 = new short[5];
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        ((ScrollDialogScreen)this).a = "Lvl " + playerAccountInfo.var_int_b + (playerAccountInfo.var_int_c < 0 ? "" : "+") + playerAccountInfo.var_int_c + "%";
        if (playerAccountInfo.var_short_a > 0) {
            for (int i = 0; i < 5; ++i) {
                this.var_byte_arr_a[i] = 1;
            }
        }
    }

    public CharacterUpgradeScreen() {
        this.d = GameCanvas.var_int_b / 2 - 65;
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - 90;
        this.var_int_g = 170;
        if (GameCanvas.var_boolean_d) {
            this.var_int_g = 185;
        }
        this.h = new GameCommand(StringUtils.dI(), new ActionListener226(this));
        this.var_game_GameCommand_IIl11I1IllI = new GameCommand(StringUtils.O(), new ActionListener229(this));
        this.var_game_GameCommand_II11I1l1Il1 = new GameCommand(StringUtils.H(), new ActionListener274(this));
        ((ScrollDialogScreen)this).a = "";
        this.var_int_h = GameCanvas.var_boolean_d ? 4 : 3;
        this.n();
    }

    public final void a_() {
        TerrainMidlet.myInfo.var_short_a = this.var_short_IIl11I1IllI;
        if (this.var_short_IIl11I1IllI != 0) {
            for (int i = 0; i < 5; ++i) {
                short[] sArray;
                short[] sArray2 = sArray = this.var_short_arr_IIl11I1IllI;
                int n = i;
                sArray2[n] = (short)(sArray2[n] - this.var_short_arr_II11I1l1Il1[i]);
                this.var_short_arr_II11I1l1Il1[i] = 0;
                this.b[i] = 0;
                this.var_byte_arr_a[i] = 1;
            }
        }
    }

    private void II11l111() {
        if (TerrainMidlet.myInfo.var_short_a > 0) {
            int n = this.var_int_IIl11I1IllI;
            this.var_short_arr_II11I1l1Il1[n] = (short)(this.var_short_arr_II11I1l1Il1[n] + 1);
            TerrainMidlet.myInfo.var_short_a = (short)(TerrainMidlet.myInfo.var_short_a - 1);
            int n2 = this.var_int_IIl11I1IllI;
            this.var_short_arr_IIl11I1IllI[n2] = (short)(this.var_short_arr_IIl11I1IllI[n2] + 1);
            this.b[this.var_int_IIl11I1IllI] = 1;
        }
        if (TerrainMidlet.myInfo.var_short_a == 0) {
            for (int i = 0; i < 5; ++i) {
                this.var_byte_arr_a[i] = 0;
            }
        }
    }

    final void a(int n, int n2, short s) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > s) {
            n2 = s;
        }
        s = this.var_short_arr_II11I1l1Il1[n];
        if ((s = (short)(n2 - s)) != 0) {
            short s2 = TerrainMidlet.myInfo.var_short_arr_a[n];
            this.var_short_arr_II11I1l1Il1[n] = (short)n2;
            this.var_short_arr_IIl11I1IllI[n] = (short)(s2 + n2);
            TerrainMidlet.myInfo.var_short_a = (short)(TerrainMidlet.myInfo.var_short_a - s);
            this.b[n] = (byte)(n2 > 0 ? 1 : 0);
            for (n = 0; n < 5; ++n) {
                this.var_byte_arr_a[n] = (byte)(TerrainMidlet.myInfo.var_short_a > 0 ? 1 : 0);
            }
        }
        GameCanvas.d();
    }

    private void I1lIIllllII() {
        int n = TerrainMidlet.myInfo.var_short_arr_a[this.var_int_IIl11I1IllI];
        if (this.var_short_arr_IIl11I1IllI[this.var_int_IIl11I1IllI] > n) {
            int n2 = this.var_int_IIl11I1IllI;
            this.var_short_arr_II11I1l1Il1[n2] = (short)(this.var_short_arr_II11I1l1Il1[n2] - 1);
            TerrainMidlet.myInfo.var_short_a = (short)(TerrainMidlet.myInfo.var_short_a + 1);
            int n3 = this.var_int_IIl11I1IllI;
            this.var_short_arr_IIl11I1IllI[n3] = (short)(this.var_short_arr_IIl11I1IllI[n3] - 1);
            this.var_byte_arr_a[this.var_int_IIl11I1IllI] = 1;
        }
        if (this.var_short_arr_IIl11I1IllI[this.var_int_IIl11I1IllI] == n) {
            this.b[this.var_int_IIl11I1IllI] = 0;
        }
        if (TerrainMidlet.myInfo.var_short_a > 0) {
            for (n = 0; n < 5; ++n) {
                this.var_byte_arr_a[n] = 1;
            }
        }
    }

    public static void a(Graphics graphics, int n, int n2) {
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        graphics.setColor(1521982);
        graphics.fillRect(n, n2, 102, 17);
        graphics.setColor(2378093);
        graphics.fillRect(n + 1, n2 + 1, 100, 15);
        graphics.setColor(16767817);
        graphics.fillRect(n + 1, n2 + 1, playerAccountInfo.var_int_c, 15);
        FontRenderer.e.a(graphics, playerAccountInfo.var_long_a + "/" + playerAccountInfo.var_long_b, n + 51, n2, 2);
    }

    public final void a(Graphics graphics) {
        int n;
        int n2;
        super.a(graphics);
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        if (!GameCanvas.var_boolean_d) {
            CharacterUpgradeScreen.a(graphics, GameCanvas.var_int_d - 50, this.e + 28);
            n2 = 18;
            graphics.setColor(4156571);
            graphics.fillRect(this.d - 1, this.e + 56 + this.var_int_IIl11I1IllI * 18, 130, 18);
        } else {
            graphics.translate(-15, -33);
            n2 = 30;
        }
        byte by = (byte)(GameCanvas.var_boolean_d ? 15 : 0);
        byte by2 = (byte)(GameCanvas.var_boolean_d ? 10 : 0);
        for (n = 0; n < 5; ++n) {
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_a, 0, n << 4, 16, 16, 0, this.d, this.e + 57 + n * n2, 0);
            if (!GameCanvas.var_boolean_d) {
                if (n == this.var_int_IIl11I1IllI) {
                    FontRenderer.b.a(graphics, var_java_lang_String_arr_IIl11I1IllI[n], this.d + 25, this.e + 58 + n * n2, 0);
                } else {
                    FontRenderer.a.a(graphics, var_java_lang_String_arr_IIl11I1IllI[n], this.d + 25, this.e + 58 + n * n2, 0);
                }
            } else {
                FontRenderer.a.a(graphics, var_java_lang_String_arr_IIl11I1IllI[n], this.d + 25, this.e + 58 + n * n2, 0);
            }
            short s = this.var_short_arr_IIl11I1IllI[n];
            graphics.setColor(1521982);
            graphics.fillRect(this.d + 98 + by, this.e + 57 + n * n2, 30, 16);
            if (this.b[n] == 1) {
                FontRenderer.c.a(graphics, String.valueOf(s), this.d + 113 + by, this.e + 57 + n * n2, 3);
            } else {
                FontRenderer.b.a(graphics, String.valueOf(s), this.d + 113 + by, this.e + 57 + n * n2, 3);
            }
            if (this.b[n] == 1) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_II11I1l1Il1, this.d + 96 + by - by2, this.e + 62 + n * n2, 24);
            }
            if (this.var_byte_arr_a[n] != 1) continue;
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_II11I1l1Il1, 0, 0, 4, 7, 2, this.d + 130 + by + by2, this.e + 62 + n * n2, 0);
        }
        graphics.translate(0, -graphics.getTranslateY());
        n = (byte)(GameCanvas.var_boolean_d ? 15 : 0);
        FontRenderer.e.a(graphics, "Point: " + playerAccountInfo.var_short_a, this.d + 61 - n, this.e + 57 + 90 + 2 + n, 3);
        this.d(graphics);
    }

    public final void void_b() {
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            --this.var_int_IIl11I1IllI;
            if (this.var_int_IIl11I1IllI < 0) {
                this.var_int_IIl11I1IllI = 4;
            }
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            ++this.var_int_IIl11I1IllI;
            if (this.var_int_IIl11I1IllI > 4) {
                this.var_int_IIl11I1IllI = 0;
            }
        }
        if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            this.I1lIIllllII();
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            this.II11l111();
        }
        if (GameCanvas.var_boolean_c) {
            int n;
            for (n = 0; n < 5; ++n) {
                int n2 = this.e + 57 - 33 + n * 30;
                if (!GameCanvas.a(this.d - 15 + 98 + 15, n2, 30, 16)) continue;
                n2 = n;
                CharacterUpgradeScreen characterUpgradeScreen = this;
                this.var_int_IIl11I1IllI = n2;
                short s = (short)(TerrainMidlet.myInfo.var_short_a + characterUpgradeScreen.var_short_arr_II11I1l1Il1[n2]);
                GameCanvas.var_game_InputScreen_a.a(var_java_lang_String_arr_IIl11I1IllI[n2] + " (0-" + s + ")", new ActionListener230(characterUpgradeScreen, n2, s), new ActionListener223(), 1);
                GameCanvas.var_game_InputScreen_a.a.a(String.valueOf(characterUpgradeScreen.var_short_arr_II11I1l1Il1[n2]));
                GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
                return;
            }
            this.var_int_IIl11I1IllI = n = (GameCanvas.g - this.e - 20) / 25;
            if (this.var_int_IIl11I1IllI < 0) {
                this.var_int_IIl11I1IllI = 0;
            }
            if (this.var_int_IIl11I1IllI > 4) {
                this.var_int_IIl11I1IllI = 4;
            }
            if (GameCanvas.a(this.d + 70, this.e + 25 + this.var_int_IIl11I1IllI * 25, 30, 30)) {
                this.I1lIIllllII();
            }
            if (GameCanvas.a(this.d + 130, this.e + 25 + this.var_int_IIl11I1IllI * 25, 30, 30)) {
                new StringBuffer("[fo] UP Select= ").append(this.var_int_IIl11I1IllI);
                this.II11l111();
            }
        }
        super.void_b();
    }

    public final void c() {
        super.c();
        BattleScreen.var_game_BattleGraphicHelper_a.a();
        if (TerrainMidlet.myInfo.var_short_a >= 0) {
            this.g = this.var_game_GameCommand_IIl11I1IllI;
            this.f = this.var_game_GameCommand_II11I1l1Il1;
            return;
        }
        this.g = null;
        this.f = null;
    }

    static short[] a(CharacterUpgradeScreen characterUpgradeScreen) {
        return characterUpgradeScreen.var_short_arr_II11I1l1Il1;
    }

    static void a(CharacterUpgradeScreen characterUpgradeScreen, short s) {
        characterUpgradeScreen.var_short_IIl11I1IllI = s;
    }

    static {
        var_java_lang_String_arr_IIl11I1IllI = new String[]{StringUtils.as(), StringUtils.at(), StringUtils.au(), StringUtils.av(), StringUtils.aw()};
        try {
            var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/item/ability.png");
            var_javax_microedition_lcdui_Image_II11I1l1Il1 = Image.createImage((String)"/map/arrow1.png");
        } catch (Exception e) {
        }
    }
}

