/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.ActionListener077;
import game.ActionListener135;
import game.ActionListener147;
import game.BaseScreen;
import game.BoardScreen;
import game.ConnectionWatchdog;
import game.DataUtils;
import game.FontRenderer;
import game.GameCanvas;
import game.GameCommand;
import game.GameHelper11;
import game.GameHelper31;
import game.PlayerAccountInfo;
import game.ScrollDialogScreen;
import game.StringUtils;
import game.TerrainMidlet;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ExplosionEffect
extends ScrollDialogScreen {
    public static ExplosionEffect var_game_ExplosionEffect_a;
    private static GameHelper11 var_game_GameHelper11_I111IlIl11Il;
    private static Vector var_java_util_Vector_I111IlIl11Il;
    boolean var_boolean_a;
    static int var_int_a;
    private static int var_int_IIIllIII1lI;
    private GameCommand var_game_GameCommand_I111IlIl11Il;
    private String var_java_lang_String_IIIllIII1lI;

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        this.d = GameCanvas.var_int_b - ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.b >> 1;
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - 80;
        if (!GameCanvas.var_boolean_d) {
            this.var_int_g = 157;
            this.var_int_h = 3;
        } else {
            this.var_int_h = 4;
            this.var_int_g = 177;
        }
        ((ScrollDialogScreen)this).a = StringUtils.s();
    }

    public ExplosionEffect() {
        this.g = new GameCommand(StringUtils.cN(), new ActionListener077(this));
        this.h = this.var_game_GameCommand_I111IlIl11Il = new GameCommand(StringUtils.dH(), new ActionListener147(this));
        new GameCommand(StringUtils.q(), new ActionListener135());
    }

    public static void a(Vector vector) {
        var_java_util_Vector_I111IlIl11Il = vector;
        int n = vector.size();
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = ExplosionEffect.a((int)i).var_byte_a;
        }
        var_game_GameHelper11_I111IlIl11Il = !GameCanvas.var_boolean_d ? new GameHelper11(nArray, 6, 3) : new GameHelper11(nArray, 4, 2);
        int[] nArray2 = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray2[i] = ExplosionEffect.a((int)i).var_byte_a;
        }
        if (!GameCanvas.var_boolean_d) {
            BoardScreen.var_game_GameHelper11_a = new GameHelper11(nArray2, 5, 3);
            return;
        }
        BoardScreen.var_game_GameHelper11_a = new GameHelper11(nArray2, 4, 2);
    }

    public static GameHelper31 a(int n) {
        return (GameHelper31)var_java_util_Vector_I111IlIl11Il.elementAt(n);
    }

    public static GameHelper31 game_GameHelper31_a() {
        return (GameHelper31)var_java_util_Vector_I111IlIl11Il.elementAt(ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a);
    }

    public static int[] int_arr_a() {
        int[] nArray = new int[var_java_util_Vector_I111IlIl11Il.size()];
        for (int i = 0; i < var_java_util_Vector_I111IlIl11Il.size(); ++i) {
            nArray[i] = ExplosionEffect.a((int)i).g;
            nArray[0] = -1;
            nArray[1] = -1;
        }
        return nArray;
    }

    public static void e() {
        for (int i = 0; i < var_java_util_Vector_I111IlIl11Il.size(); ++i) {
            ExplosionEffect.a((int)i).d = 0;
        }
        var_int_IIIllIII1lI = 0;
    }

    public final void void_b() {
        if (!this.var_boolean_a) {
            var_game_GameHelper11_I111IlIl11Il.a();
        } else {
            if (false) {
                if ((var_int_a -= ExplosionEffect.game_GameHelper31_a().e) < ExplosionEffect.game_GameHelper31_a().e) {
                    var_int_a = ExplosionEffect.game_GameHelper31_a().e;
                }
                ExplosionEffect.Illll1Il1III(ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a, var_int_a);
            }
            if (false) {
                ExplosionEffect.Illll1Il1III(ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a, var_int_a += ExplosionEffect.game_GameHelper31_a().e);
            }
            if (GameCanvas.var_boolean_c) {
                int n = GameCanvas.var_int_b - 140 >> 1;
                int n2 = GameCanvas.var_int_c - 80 >> 1;
                int cfr_ignored_0 = n + 45;
                int cfr_ignored_1 = n2 + 27;
                if (false) {
                    if ((var_int_a -= ExplosionEffect.game_GameHelper31_a().e) < ExplosionEffect.game_GameHelper31_a().e) {
                        var_int_a = ExplosionEffect.game_GameHelper31_a().e;
                    }
                    ExplosionEffect.Illll1Il1III(ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a, var_int_a);
                }
                int cfr_ignored_2 = n + 115;
                int cfr_ignored_3 = n2 + 27;
                if (false) {
                    ExplosionEffect.Illll1Il1III(ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a, var_int_a += ExplosionEffect.game_GameHelper31_a().e);
                }
            }
        }
        super.void_b();
        BaseScreen.m();
    }

    public final void c() {
        super.c();
        var_game_GameHelper11_I111IlIl11Il.b();
    }

    public final void a(byte by, byte by2, int n) {
        ExplosionEffect.Illll1Il1III(by2, n);
        if ((long)(ExplosionEffect.a((int)by2).var_int_a * n) > TerrainMidlet.myInfo.var_long_c || ExplosionEffect.a((int)by2).var_int_b * n > TerrainMidlet.myInfo.e) {
            GameCanvas.void_a(StringUtils.bx());
            return;
        }
        ExplosionEffect.game_GameHelper31_a().d = (byte)(ExplosionEffect.game_GameHelper31_a().d + n);
        new StringBuffer("[lt] TONG TIEN= ").append(var_int_IIIllIII1lI);
        if (var_int_IIIllIII1lI > 0 && this.var_int_h > 0) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(by, by2, n);
            ExplosionEffect.e();
            GameCanvas.d();
        }
        if (this.var_boolean_a) {
            this.var_boolean_a = false;
        }
    }

    private static void Illll1Il1III(int n, int n2) {
        var_int_IIIllIII1lI = 0;
        for (int i = 0; i < var_java_util_Vector_I111IlIl11Il.size(); ++i) {
            int n3;
            if (i == n) {
                n3 = n2 * ExplosionEffect.a((int)i).var_int_a;
                if (n3 == -1) {
                    n3 = n2 * ExplosionEffect.a((int)i).var_int_b;
                }
                var_int_IIIllIII1lI += n3;
                continue;
            }
            if (ExplosionEffect.a((int)i).d <= 0) continue;
            n3 = ExplosionEffect.a((int)i).d * ExplosionEffect.a((int)i).var_int_a;
            if (n3 == -1) {
                n3 = n2 * ExplosionEffect.a((int)i).var_int_b;
            }
            var_int_IIIllIII1lI += n3;
        }
    }

    public static void void_a(int[] nArray) {
        int n;
        for (n = 0; n < var_java_util_Vector_I111IlIl11Il.size(); ++n) {
            ExplosionEffect.a((int)n).var_byte_c = 0;
        }
        for (n = 0; n < nArray.length; ++n) {
            if (nArray[n] < 0) continue;
            ExplosionEffect.a((int)nArray[n]).var_byte_c = (byte)(ExplosionEffect.a((int)nArray[n]).var_byte_c + 1);
        }
    }

    public static int[] int_arr_a(int[] nArray) {
        nArray[nArray.length - 4] = ExplosionEffect.a((int)12).g > 0 ? -2 : -1;
        nArray[nArray.length - 3] = ExplosionEffect.a((int)13).g > 0 ? -2 : -1;
        nArray[nArray.length - 2] = ExplosionEffect.a((int)14).g > 0 ? -2 : -1;
        nArray[nArray.length - 1] = ExplosionEffect.a((int)15).g > 0 ? -2 : -1;
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] >= 0 && ExplosionEffect.a((int)nArray[i]).g <= 0) {
                nArray[i] = -2;
            }
            if (i == nArray.length - 1 && ExplosionEffect.a((int)15).g <= 0) {
                nArray[i] = -1;
                continue;
            }
            if (i == nArray.length - 2 && ExplosionEffect.a((int)14).g <= 0) {
                nArray[i] = -1;
                continue;
            }
            if (i == nArray.length - 3 && ExplosionEffect.a((int)13).g <= 0) {
                nArray[i] = -1;
                continue;
            }
            if (i != nArray.length - 4 || ExplosionEffect.a((int)12).g > 0) continue;
            nArray[i] = -1;
        }
        return nArray;
    }

    public static void a(byte n, byte[] byArray, int[] nArray, long l, long n2) {
        for (int i = 0; i < n; ++i) {
            ExplosionEffect.a((int)byArray[i]).g = nArray[i];
        }
        TerrainMidlet.myInfo.var_long_c = l;
        TerrainMidlet.myInfo.e = n2;
    }

    public final void a(Graphics graphics) {
        String string;
        String string2;
        super.a(graphics);
        int n = this.e;
        int n2 = this.d;
        var_game_GameHelper11_I111IlIl11Il.a(n2, n + 25, graphics, ExplosionEffect.int_arr_a());
        if (ExplosionEffect.game_GameHelper31_a().var_boolean_b) {
            string2 = StringUtils.cO() + ": ";
            string = StringUtils.cA();
        } else {
            String string3 = string2 = ExplosionEffect.game_GameHelper31_a().var_int_a == -1 ? "" : ExplosionEffect.game_GameHelper31_a().var_int_a + StringUtils.aq();
            string = ExplosionEffect.game_GameHelper31_a().var_int_b == -1 ? "" : (ExplosionEffect.game_GameHelper31_a().var_int_a == -1 ? "" : "-") + ExplosionEffect.game_GameHelper31_a().var_int_b + " " + StringUtils.ar();
        }
        String string4 = string;
        this.var_java_lang_String_IIIllIII1lI = string2 = string2 + string4;
        graphics.setColor(2509680);
        int n3 = GameCanvas.var_boolean_d ? 20 : 0;
        int n4 = this.e + 88 + n3;
        Object object = TerrainMidlet.myInfo;
        object = DataUtils.a(((PlayerAccountInfo)object).var_long_c) + " " + StringUtils.aq() + "-" + DataUtils.a(((PlayerAccountInfo)object).e) + " " + StringUtils.ar();
        FontRenderer.a.a(graphics, (String)object, GameCanvas.var_int_b / 2, n4 + 2, 3);
        if (!GameCanvas.var_boolean_d) {
            graphics.fillRoundRect(this.d - 2, this.e + 105 + n3, 124, 46, 6, 7);
        } else {
            graphics.fillRoundRect(this.d - 2, this.e + 105 + n3, 164, 46, 6, 7);
        }
        n4 = this.d + 5;
        FontRenderer.b.a(graphics, ExplosionEffect.a((int)ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a).var_java_lang_String_a, n4, this.e + 107 + n3, 0);
        FontRenderer.b.a(graphics, this.var_java_lang_String_IIIllIII1lI, this.d + 4, this.e + 121 + n3, 0);
        FontRenderer.b.a(graphics, ExplosionEffect.game_GameHelper31_a().g <= 0 ? "" : StringUtils.cz() + ": " + ExplosionEffect.game_GameHelper31_a().g + " " + StringUtils.cP(), this.d + 4, this.e + 135 + n3, 0);
        if (this.var_boolean_a && ExplosionEffect.game_GameHelper31_a().var_byte_a != 36 && ExplosionEffect.game_GameHelper31_a().var_byte_a != 37) {
            n3 = GameCanvas.var_int_c - 80 >> 1;
            n4 = GameCanvas.var_int_b - 140 >> 1;
            int n5 = ExplosionEffect.var_game_GameHelper11_I111IlIl11Il.a;
            BaseScreen.a(n4 - 5, n3, 150, 75, graphics);
            FontRenderer.a.a(graphics, StringUtils.cy(), GameCanvas.var_int_d, n3 + 7, 2);
            ExplosionEffect.a(n5).a(graphics, n4 + 20, n3 + 25);
            FontRenderer.a.a(graphics, var_int_a + " " + StringUtils.cP(), n4 + 70, n3 + 25, 0);
            FontRenderer.a.a(graphics, (ExplosionEffect.a((int)n5).var_int_a == -1 ? "" : var_int_a * ExplosionEffect.a((int)n5).var_int_a + StringUtils.aq()) + (ExplosionEffect.a((int)n5).var_int_b == -1 ? "" : (ExplosionEffect.a((int)n5).var_int_a == -1 ? "" : "/") + var_int_a * ExplosionEffect.a((int)n5).var_int_b + " luong"), GameCanvas.var_int_d, n3 + 52, 2);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 4, n4 + 45 + GameCanvas.var_int_a % 3, n3 + 27, 0);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 7, n4 + 115 - GameCanvas.var_int_a % 3, n3 + 27, 0);
        }
        this.d(graphics);
    }

    static {
        var_java_util_Vector_I111IlIl11Il = new Vector();
    }
}

