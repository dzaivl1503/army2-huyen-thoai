/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab1;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper05
extends BaseScreen {
    public static GameHelper05 var_game_GameHelper05_a;
    private static Image I1I11II1lIl;
    private static Image var_javax_microedition_lcdui_Image_I1IIllII1lII;
    public static String var_java_lang_String_a;
    public static Vector var_java_util_Vector_a;
    public static int var_int_a;
    public static int b;
    public static int c;
    private static int IlI1I1II1ll;
    private static int IIlllIIlI;
    private static int ll1I1lII1IIl;
    public byte var_byte_a;
    private int l11IlI1l11;
    static boolean var_boolean_a;
    private static boolean var_boolean_I1IIllII1lII;
    private static Vector var_java_util_Vector_I1IIllII1lII;
    private int IlI1lI1I = 0;
    private boolean I11l1lII = false;

    public final void void_a() {
        if (c != b) {
            IIlllIIlI = b - c << 2;
            c += (IlI1I1II1ll += IIlllIIlI) >> 4;
            IlI1I1II1ll &= 0xF;
        }
    }

    public GameHelper05() {
        this.g = new GameCommand(StringUtils.aU(), new ActionListener090(this));
        this.f = new GameCommand(StringUtils.dJ(), new ActionListener092(this));
        this.h = new GameCommand(StringUtils.dI(), new ActionListener074(this));
    }

    public static void a(int n, String string) {
        if (string != null && !string.equals("")) {
            var_java_lang_String_a = StringUtils.dN() + ": " + string;
            return;
        }
        var_java_lang_String_a = StringUtils.dN() + ": " + n;
    }

    public final void b_() {
        super.b_();
        this.l11IlI1l11 = GameCanvas.var_int_b;
        var_boolean_a = true;
        var_int_a = 0;
        b = 0 * BaseScreen.var_int_o - (GameCanvas.var_int_e - 2 * BaseScreen.var_int_o);
        if (b > ll1I1lII1IIl) {
            b = ll1I1lII1IIl;
        }
        if (b < 0) {
            b = 0;
        }
        if (var_int_a == var_java_util_Vector_a.size() - 1 || var_int_a == 0) {
            c = b;
        }
    }

    public final void c() {
        GameHelper18.a();
        this.void_a();
        if (var_boolean_a && this.l11IlI1l11 > 0) {
            this.l11IlI1l11 -= Math.max(this.l11IlI1l11 / 2, 1);
        }
    }

    public final void a(Graphics graphics) {
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (int i = 0; i <= GameCanvas.var_int_b; i += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, i, GameCanvas.var_int_c - 62, 0);
        }
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        var_java_util_Vector_I1IIllII1lII.elementAt(ChallengeScreen.var_game_ChallengeScreen_a.var_int_a);
        FontRenderer.f.a(graphics, StringUtils.dM() + " " + this.var_byte_a, 10, 3, 0);
        graphics.setColor(2378093);
        graphics.fillRect(0, 25, GameCanvas.var_int_b, BaseScreen.var_int_o);
        FontRenderer.b.a(graphics, StringUtils.dO(), 10, 28, 0);
        if (var_boolean_I1IIllII1lII) {
            GameHelper05.IllIl11lIl(this.l11IlI1l11, graphics);
        }
        super.a(graphics);
    }

    private static void IllIl11lIl(int n, Graphics graphics) {
        int n2 = GameCanvas.var_boolean_d ? 40 : BaseScreen.var_int_o;
        graphics.translate(n, n2 + (GameCanvas.var_boolean_d ? 14 : 25));
        graphics.setClip(n, 0 + (GameCanvas.var_boolean_d ? -10 : 1), GameCanvas.var_int_b, GameCanvas.var_int_c);
        graphics.translate(n, 0 - c);
        int n3 = 0 - n2;
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            if ((n3 += n2) < c - n2 || n3 > c + GameCanvas.var_int_c) continue;
            if (i == var_int_a) {
                graphics.setColor(16767817);
                graphics.fillRect(n, n3 - (GameCanvas.var_boolean_d ? 10 : 0), GameCanvas.var_int_b, n2);
            }
            EquipTemplate equipTemplate = (EquipTemplate)var_java_util_Vector_a.elementAt(i);
            String string = StringUtils.dN() + " " + equipTemplate.var_byte_a;
            if (!equipTemplate.var_java_lang_String_a.equals("")) {
                string = equipTemplate.var_java_lang_String_a;
            }
            DataUtils.a(graphics, I1I11II1lIl, 0, equipTemplate.d * 17, 18, 17, 0, n + 8, n3 + 1, 0);
            FontRenderer.e.a(graphics, string, n + 30, n3 + 2, 0);
            FontRenderer.e.a(graphics, equipTemplate.b + "/" + equipTemplate.c, n + GameCanvas.var_int_b - 3, n3 + 2, 1);
            FontRenderer.e.a(graphics, DataUtils.a((long)equipTemplate.var_int_a) + " " + StringUtils.aq(), n + GameCanvas.var_int_b - 30, n3 + 2, 1);
            if (!((EquipTemplate)GameHelper05.var_java_util_Vector_a.elementAt((int)i)).var_boolean_a) continue;
            graphics.drawImage(var_javax_microedition_lcdui_Image_I1IIllII1lII, n + GameCanvas.var_int_b - 30 - FontRenderer.e.a(DataUtils.a((long)equipTemplate.var_int_a) + " " + StringUtils.aq()) - 5, n3 + 1, 24);
        }
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
    }

    public final void void_b() {
        super.void_b();
        if (var_java_util_Vector_a.size() != 0 && var_java_util_Vector_a != null) {
            int n;
            boolean bl = false;
            if (GameCanvas.var_boolean_arr_a[8]) {
                GameCanvas.var_boolean_arr_a[8] = false;
                if (++var_int_a >= var_java_util_Vector_a.size()) {
                    var_int_a = 0;
                }
                bl = true;
            } else if (GameCanvas.var_boolean_arr_a[2]) {
                GameCanvas.var_boolean_arr_a[2] = false;
                if (--var_int_a < 0) {
                    var_int_a = var_java_util_Vector_a.size() - 1;
                }
                bl = true;
            }
            if (GameCanvas.var_boolean_b) {
                if (!this.I11l1lII) {
                    this.IlI1lI1I = c;
                    this.I11l1lII = true;
                }
                if ((b = this.IlI1lI1I + (GameCanvas.h - GameCanvas.g)) < 0) {
                    b = 0;
                }
                if (b > ll1I1lII1IIl) {
                    b = ll1I1lII1IIl;
                }
            }
            int n2 = n = GameCanvas.var_boolean_d ? 40 : BaseScreen.var_int_o;
            if (GameCanvas.var_boolean_c) {
                this.I11l1lII = false;
                if (Math.abs(GameCanvas.h - GameCanvas.g) < 10) {
                    int n3 = 25 + BaseScreen.var_int_o;
                    if ((n3 = (b + GameCanvas.g - n3) / n) == var_int_a) {
                        if (this.g != null) {
                            this.g.var_game_IActionListener_a.a();
                        } else if (this.f != null) {
                            this.f.var_game_IActionListener_a.a();
                        }
                    }
                    var_int_a = n3;
                    if (n3 < 0) {
                        var_int_a = 0;
                    }
                    if (var_int_a >= var_java_util_Vector_a.size()) {
                        var_int_a = var_java_util_Vector_a.size() - 1;
                    }
                }
            }
            if (bl) {
                b = var_int_a * n - (GameCanvas.var_int_e - (n << 1));
                if (b > ll1I1lII1IIl) {
                    b = ll1I1lII1IIl;
                }
                if (b < 0) {
                    b = 0;
                }
                if (var_int_a == var_java_util_Vector_a.size() - 1 || var_int_a == 0) {
                    c = b;
                }
            }
        }
    }

    public static void a(Vector vector) {
        var_java_util_Vector_I1IIllII1lII = ChallengeScreen.var_game_ChallengeScreen_a.var_java_util_Vector_a;
        var_java_util_Vector_a = vector;
        int n = GameCanvas.var_boolean_d ? 40 : BaseScreen.var_int_o;
        byte by = (byte)(GameCanvas.var_boolean_d ? 5 : 0);
        ll1I1lII1IIl = var_java_util_Vector_a.size() * n - (GameCanvas.var_int_c - (BaseScreen.var_int_o << 2) - by);
    }

    static void a(GameHelper05 gameHelper05) {
        GameCanvas.c(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(gameHelper05.var_byte_a);
    }

    static void e() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().void_a();
        GameCanvas.b(StringUtils.ds());
    }

    static {
        var_boolean_I1IIllII1lII = true;
        I1I11II1lIl = BattleScreen.var_javax_microedition_lcdui_Image_b;
        var_javax_microedition_lcdui_Image_I1IIllII1lII = BattleScreen.var_javax_microedition_lcdui_Image_c;
    }
}

