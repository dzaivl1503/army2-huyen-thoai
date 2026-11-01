/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab2;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper48
extends ScrollDialogScreen {
    public static GameHelper48 var_game_GameHelper48_a;
    private int var_int_I11I1IllI1I1;
    private static Vector var_java_util_Vector_I11I1IllI1I1;
    private int var_int_II1IlIlIlII = GameCanvas.var_int_b;
    private static int l111Ill1I1I;
    private static int III1I1lllII;
    private static int IlIIlIlIII;
    private static int lI11IllI1II1;
    private static int I1I111l1;
    GameCommand var_game_GameCommand_a;
    private static int ll1I11lII;
    private static int Il11I11l1I;
    private static int l111IlIlI;
    private static int III1lIl1I;
    private static int lIIIl1II1I;
    Vector var_java_util_Vector_a = new Vector();
    private int Illlll1l11l = BattleScreen.var_javax_microedition_lcdui_Image_f.getHeight() / 16;
    private GameHelper40 llIIlIlll11 = new GameHelper40(0, 1);
    ItemTemplate var_game_ItemTemplate_a;
    private String var_java_lang_String_I11I1IllI1I1 = "";
    private String var_java_lang_String_II1IlIlIlII = "";
    private String l11I11lllI = "";
    int var_int_a = 1;
    boolean var_boolean_a;
    private String I1I1I11II1ll;
    private static int lIl1IIl1;
    private static boolean var_boolean_I11I1IllI1I1;

    public GameHelper48() {
        this.d = GameCanvas.var_int_b / 2 - 85;
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - 85;
        this.var_int_g = 180;
        this.var_int_h = 4;
        ((ScrollDialogScreen)this).a = StringUtils.n();
        this.n();
        if (GameCanvas.var_boolean_d) {
            l111Ill1I1I = 4;
            lI11IllI1II1 = 9;
            I1I111l1 = 5;
            IlIIlIlIII = 40;
            return;
        }
        l111Ill1I1I = 8;
        lI11IllI1II1 = 0;
        I1I111l1 = 0;
        IlIIlIlIII = 20;
    }

    private void II1ll11llI() {
        GameCommand gameCommand = new GameCommand(StringUtils.af(), new ActionListener097(this));
        GameCommand gameCommand2 = new GameCommand(StringUtils.ae(), new ActionListener217(this));
        GameCommand gameCommand3 = new GameCommand("Menu", new ActionListener278(this, gameCommand, gameCommand2));
        if (this.var_game_ItemTemplate_a == null) {
            this.f = gameCommand;
            return;
        }
        this.f = this.var_game_ItemTemplate_a.var_int_f != -1 && this.var_game_ItemTemplate_a.var_int_e != -1 ? gameCommand3 : (this.var_game_ItemTemplate_a.var_int_e == -1 && this.var_game_ItemTemplate_a.var_int_f != -1 ? gameCommand2 : gameCommand);
        this.h = new GameCommand(StringUtils.dH(), new ActionListener228(this));
        this.var_game_GameCommand_a = new GameCommand(StringUtils.dF(), new ActionListener277(this, gameCommand3, gameCommand2, gameCommand));
        if (this.game_ItemTemplate_a().var_boolean_b) {
            this.g = this.var_game_GameCommand_a;
            return;
        }
        this.g = null;
    }

    public final ItemTemplate game_ItemTemplate_a() {
        return (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.var_int_I11I1IllI1I1);
    }

    public final void a(Vector vector) {
        this.var_int_I11I1IllI1I1 = 0;
        var_java_util_Vector_I11I1IllI1I1.removeAllElements();
        var_java_util_Vector_I11I1IllI1I1 = vector;
        this.var_java_util_Vector_a.removeAllElements();
        for (int i = 0; i < var_java_util_Vector_I11I1IllI1I1.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate)var_java_util_Vector_I11I1IllI1I1.elementAt(i);
            this.var_java_util_Vector_a.addElement(itemTemplate);
        }
        this.Illlll1l11l = this.var_java_util_Vector_a.size();
        III1I1lllII = this.var_java_util_Vector_a.size() / l111Ill1I1I;
        if (this.Illlll1l11l % l111Ill1I1I != 0) {
            ++III1I1lllII;
        }
        lIIIl1II1I = Math.max(0, III1I1lllII * IlIIlIlIII - (72 - I1I111l1));
        this.var_game_ItemTemplate_a = (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.var_int_I11I1IllI1I1);
        this.var_java_lang_String_I11I1IllI1I1 = this.var_game_ItemTemplate_a.var_java_lang_String_b;
        this.var_java_lang_String_II1IlIlIlII = this.var_game_ItemTemplate_a.var_java_lang_String_a;
        this.l11I11lllI = StringUtils.cO() + ": " + this.var_game_ItemTemplate_a.var_int_e + StringUtils.aq() + "(" + this.var_game_ItemTemplate_a.var_byte_e + StringUtils.p() + ")";
    }

    public final void a(int n, Image image) {
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate)this.var_java_util_Vector_a.elementAt(i);
            if (itemTemplate.var_short_a != n) continue;
            itemTemplate.var_javax_microedition_lcdui_Image_a = image;
        }
    }

    public final void a(Graphics graphics) {
        int n;
        Object object;
        int n2;
        super.a(graphics);
        graphics.setColor(3832504);
        graphics.fillRoundRect(this.var_int_II1IlIlIlII / 2 - 85, this.e + 23, 170, 78, 6, 6);
        int n3 = this.var_int_I11I1IllI1I1;
        int n4 = this.e + 29;
        int n5 = this.var_int_II1IlIlIlII / 2 - 78;
        int n6 = 0;
        int n7 = 0;
        graphics.setClip(n5 - 2, n4 - 2, 170, 72);
        graphics.translate(0, -Il11I11l1I);
        graphics.setColor(16767817);
        for (n2 = 0; n2 < this.var_java_util_Vector_a.size(); ++n2) {
            object = (ItemTemplate)this.var_java_util_Vector_a.elementAt(n2);
            n = n5 + n6 * IlIIlIlIII + lI11IllI1II1;
            int n8 = n4 + n7 * IlIIlIlIII + I1I111l1;
            if (n2 == n3) {
                graphics.fillRect(n - (GameCanvas.var_boolean_d ? 12 : 2), n8 - (GameCanvas.var_boolean_d ? 12 : 2), GameCanvas.var_boolean_d ? 40 : 20, GameCanvas.var_boolean_d ? 40 : 20);
                if (!GameCanvas.var_boolean_d) {
                    ll1I11lII = n8 - (n4 + 20);
                }
            }
            if (((ItemTemplate)object).var_boolean_c) {
                graphics.setColor(5612786);
                graphics.fillRect(n, n8, 16, 16);
            }
            ((ItemTemplate)object).a(graphics, n, n8);
            if (++n6 != l111Ill1I1I) continue;
            n6 = 0;
            ++n7;
        }
        graphics.translate(0, -graphics.getTranslateY());
        graphics.setClip(0, 0, 1000, 1000);
        n2 = this.e + 103;
        n4 = this.var_int_II1IlIlIlII / 2 - 85;
        object = TerrainMidlet.myInfo;
        String string = StringUtils.dE() + ": " + DataUtils.a(((PlayerAccountInfo)object).var_long_c) + " " + StringUtils.aq() + "-" + DataUtils.a(((PlayerAccountInfo)object).e) + " " + StringUtils.ar();
        n = FontRenderer.a.a(this.var_java_lang_String_I11I1IllI1I1);
        if (n > 155) {
            DataUtils.a(this.llIIlIlll11, n - 150);
        }
        n7 = this.llIIlIlll11.a;
        FontRenderer.a.a(graphics, string, this.var_int_II1IlIlIlII / 2, n2 - 1, 3);
        graphics.setColor(2378093);
        graphics.fillRoundRect(n4, n2 + 14, 170, 16, 6, 6);
        graphics.fillRoundRect(n4, n2 + 34, 170, 16, 6, 6);
        graphics.fillRoundRect(n4, n2 + 54, 170, 16, 6, 6);
        FontRenderer.c.a(graphics, this.var_java_lang_String_II1IlIlIlII, n4 + 6, n2 + 15, 0);
        FontRenderer.b.a(graphics, this.l11I11lllI, n4 + 6, n2 + 35, 0);
        graphics.setClip(n4, n2, 170, this.var_int_g);
        FontRenderer.b.a(graphics, this.var_java_lang_String_I11I1IllI1I1, n4 + 6 + n7, n2 + 55, 0);
        this.d(graphics);
        if (this.var_boolean_a) {
            n3 = GameCanvas.var_int_c / 2;
            n4 = GameCanvas.var_int_b / 2;
            BaseScreen.a(n4 - 75, n3 - 30, 150, 60, graphics);
            FontRenderer.a.a(graphics, StringUtils.K(), GameCanvas.var_int_d, n3 - 15, 2);
            FontRenderer.a.a(graphics, this.var_int_a + " " + StringUtils.cP(), n4, n3 + 18 - 15, 2);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 4, n4 - 40 + GameCanvas.var_int_a % 3, n3 + 20 - 15, 0);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 7, n4 + 30 - GameCanvas.var_int_a % 3, n3 + 20 - 15, 0);
        }
    }

    public final void c() {
        super.c();
        if (Il11I11l1I != ll1I11lII) {
            III1lIl1I = ll1I11lII - Il11I11l1I << 2;
            Il11I11l1I += (l111IlIlI += III1lIl1I) >> 4;
            l111IlIlI &= 0xF;
        }
        if (Il11I11l1I > lIIIl1II1I) {
            Il11I11l1I = lIIIl1II1I;
        }
        if (Il11I11l1I < 0) {
            Il11I11l1I = 0;
        }
    }

    private void I1l11I1IlI() {
        Object object;
        this.var_int_a = 1;
        this.var_boolean_a = false;
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            object = (ItemTemplate)this.var_java_util_Vector_a.elementAt(i);
            ((ItemTemplate)this.var_java_util_Vector_a.elementAt(i)).var_int_c = 0;
            ((ItemTemplate)object).var_boolean_c = false;
        }
        this.var_game_ItemTemplate_a = (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.var_int_I11I1IllI1I1);
        this.var_java_lang_String_I11I1IllI1I1 = this.var_game_ItemTemplate_a.var_java_lang_String_b;
        this.var_java_lang_String_II1IlIlIlII = this.var_game_ItemTemplate_a.var_java_lang_String_a;
        String string = (this.var_game_ItemTemplate_a.var_int_e == -1 ? "" : "-") + DataUtils.a((long)this.var_game_ItemTemplate_a.var_int_f) + " " + StringUtils.ar();
        if (this.var_game_ItemTemplate_a.var_int_f == -1) {
            string = "";
        }
        object = this.var_game_ItemTemplate_a.var_int_e + StringUtils.aq();
        if (this.var_game_ItemTemplate_a.var_int_e == -1) {
            object = "";
        }
        this.I1I1I11II1ll = this.var_game_ItemTemplate_a.var_byte_e <= 0 ? "" : "(" + this.var_game_ItemTemplate_a.var_byte_e + StringUtils.p() + ")";
        this.l11I11lllI = StringUtils.cO() + ": " + (String)object + string + this.I1I1I11II1ll;
        this.II1ll11llI();
        this.llIIlIlll11.a = 0;
        int n = this.var_int_I11I1IllI1I1 / l111Ill1I1I;
        ll1I11lII = n * IlIIlIlIII + I1I111l1 - 20;
        if (ll1I11lII > lIIIl1II1I) {
            ll1I11lII = lIIIl1II1I;
        }
        if (ll1I11lII < 0) {
            ll1I11lII = 0;
        }
    }

    public final void void_b() {
        super.void_b();
        if (this.var_boolean_a) {
            ItemTemplate itemTemplate = this.game_ItemTemplate_a();
            if (GameCanvas.var_boolean_arr_a[4] || GameCanvas.var_boolean_c && GameCanvas.a(GameCanvas.var_int_b / 2 - 100, GameCanvas.var_int_c / 2 - 100, 100, 200)) {
                GameCanvas.var_boolean_arr_a[4] = false;
                --this.var_int_a;
                if (this.var_int_a <= 0) {
                    itemTemplate.var_boolean_c = false;
                    this.var_int_a = 0;
                }
                itemTemplate.var_int_c = this.var_int_a;
            }
            if (GameCanvas.var_boolean_arr_a[6] || GameCanvas.var_boolean_c && GameCanvas.a(GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2 - 100, 100, 200)) {
                GameCanvas.var_boolean_arr_a[6] = false;
                this.var_int_a = itemTemplate.var_int_b <= 5 && this.var_int_a > 100 ? 100 : ++this.var_int_a;
                itemTemplate.var_int_c = this.var_int_a;
                itemTemplate.var_boolean_c = true;
            }
            return;
        }
        if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            --this.var_int_I11I1IllI1I1;
            if (this.var_int_I11I1IllI1I1 < 0) {
                this.var_int_I11I1IllI1I1 = this.Illlll1l11l - 1;
            }
            this.I1l11I1IlI();
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            ++this.var_int_I11I1IllI1I1;
            if (this.var_int_I11I1IllI1I1 > this.Illlll1l11l - 1) {
                this.var_int_I11I1IllI1I1 = 0;
            }
            this.I1l11I1IlI();
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            this.var_int_I11I1IllI1I1 += l111Ill1I1I;
            if (this.var_int_I11I1IllI1I1 > this.Illlll1l11l - 1) {
                this.var_int_I11I1IllI1I1 = this.Illlll1l11l - 1;
            }
            this.I1l11I1IlI();
        }
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            this.var_int_I11I1IllI1I1 -= l111Ill1I1I;
            if (this.var_int_I11I1IllI1I1 < 0) {
                this.var_int_I11I1IllI1I1 = 0;
            }
            this.I1l11I1IlI();
        }
        if (GameCanvas.var_boolean_b) {
            if (!var_boolean_I11I1IllI1I1) {
                lIl1IIl1 = Il11I11l1I;
                var_boolean_I11I1IllI1I1 = true;
            }
            if ((ll1I11lII = lIl1IIl1 + (GameCanvas.h - GameCanvas.g)) < 0) {
                ll1I11lII = 0;
            }
            if (ll1I11lII > lIIIl1II1I) {
                ll1I11lII = lIIIl1II1I;
            }
        }
        if (GameCanvas.var_boolean_c) {
            int n = this.e;
            int n2 = this.d;
            var_boolean_I11I1IllI1I1 = false;
            n = Math.abs(GameCanvas.h - GameCanvas.g) < 10 && GameCanvas.a(n2, n + 20, 160, 80) ? (ll1I11lII + GameCanvas.g - n - 20) / IlIIlIlIII * l111Ill1I1I + (GameCanvas.f - n2 - 8) / IlIIlIlIII : -1;
            n2 = n;
            if (n == -1) {
                return;
            }
            if (n2 == this.var_int_I11I1IllI1I1 && this.f != null) {
                this.f.var_game_IActionListener_a.a();
            }
            this.var_int_I11I1IllI1I1 = n2;
            if (this.var_int_I11I1IllI1I1 < 0) {
                this.var_int_I11I1IllI1I1 = 0;
            }
            if (this.var_int_I11I1IllI1I1 > var_java_util_Vector_I11I1IllI1I1.size() - 1) {
                this.var_int_I11I1IllI1I1 = var_java_util_Vector_I11I1IllI1I1.size() - 1;
            }
            this.I1l11I1IlI();
        }
    }

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        ll1I11lII = 0;
        this.II1ll11llI();
        this.I1l11I1IlI();
    }

    static {
        var_java_util_Vector_I11I1IllI1I1 = new Vector();
        l111Ill1I1I = 8;
        lIl1IIl1 = 0;
        var_boolean_I11I1IllI1I1 = false;
    }
}

