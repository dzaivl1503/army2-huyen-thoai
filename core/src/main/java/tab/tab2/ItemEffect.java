/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab2;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ItemEffect
extends ScrollDialogScreen {
    public static ItemEffect var_game_ItemEffect_a;
    private int var_int_IIIIllllIll1;
    private static Vector var_java_util_Vector_IlIIIllIl1;
    private int var_int_llIll1l1IIII = GameCanvas.var_int_b;
    private static int Il1llIlI;
    private static int Ill1l11II1Il;
    private static int IIl11llII;
    private static int III11llIll;
    private static int l1I111lllI1I;
    public static int var_int_a;
    private static int ll1lIlIIII;
    private static int lllIIlIlI;
    private static int I1llllll1II1;
    private static int lII1I1l11;
    private Vector var_java_util_Vector_IIIIllllIll1 = new Vector();
    private int II1l111I = BattleScreen.var_javax_microedition_lcdui_Image_f.getHeight() / 16;
    private GameHelper40 var_game_GameHelper40_IlIIIllIl1 = new GameHelper40(0, 1);
    private GameHelper40 var_game_GameHelper40_IIIIllllIll1 = new GameHelper40(0, 1);
    ItemTemplate var_game_ItemTemplate_a;
    private String var_java_lang_String_IIIIllllIll1 = "";
    private String var_java_lang_String_llIll1l1IIII = "";
    private String I1IIlI11I11 = "";
    private static int I1lIl11I;
    private static boolean var_boolean_IlIIIllIl1;

    public ItemEffect() {
        this.h = new GameCommand(StringUtils.dH(), new ActionListener176(this));
        this.d = GameCanvas.var_int_b / 2 - 85;
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - 85;
        this.var_int_g = 180;
        this.var_int_h = 4;
        ((ScrollDialogScreen)this).a = StringUtils.u();
        this.n();
        if (GameCanvas.var_boolean_d) {
            Il1llIlI = 4;
            III11llIll = 9;
            l1I111lllI1I = 5;
            IIl11llII = 40;
            return;
        }
        Il1llIlI = 8;
        III11llIll = 0;
        l1I111lllI1I = 0;
        IIl11llII = 20;
    }

    private void lIllIIlI1II() {
        GameCommand gameCommand = new GameCommand(StringUtils.af(), new ActionListener066(this));
        GameCommand gameCommand2 = new GameCommand(StringUtils.ae(), new ActionListener073(this));
        GameCommand gameCommand3 = new GameCommand("Menu", new ActionListener078(gameCommand, gameCommand2));
        if (this.var_game_ItemTemplate_a != null) {
            if (this.var_game_ItemTemplate_a.var_int_f != -1 && this.var_game_ItemTemplate_a.var_int_e != -1) {
                this.f = gameCommand3;
                return;
            }
            if (this.var_game_ItemTemplate_a.var_int_e == -1 && this.var_game_ItemTemplate_a.var_int_f != -1) {
                this.f = gameCommand2;
                return;
            }
        }
        this.f = gameCommand;
    }

    public final ItemTemplate game_ItemTemplate_a() {
        return (ItemTemplate)this.var_java_util_Vector_IIIIllllIll1.elementAt(this.var_int_IIIIllllIll1);
    }

    public final void a(Vector vector) {
        this.var_int_IIIIllllIll1 = 0;
        var_java_util_Vector_IlIIIllIl1.removeAllElements();
        var_java_util_Vector_IlIIIllIl1 = vector;
        this.var_java_util_Vector_IIIIllllIll1.removeAllElements();
        for (int i = 0; i < var_java_util_Vector_IlIIIllIl1.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate)var_java_util_Vector_IlIIIllIl1.elementAt(i);
            if (itemTemplate.var_byte_b != TerrainMidlet.myInfo.var_byte_a) continue;
            this.var_java_util_Vector_IIIIllllIll1.addElement(itemTemplate);
        }
        this.II1l111I = this.var_java_util_Vector_IIIIllllIll1.size();
        Ill1l11II1Il = this.var_java_util_Vector_IIIIllllIll1.size() / Il1llIlI;
        if (this.var_java_util_Vector_IIIIllllIll1.size() % Il1llIlI != 0) {
            ++Ill1l11II1Il;
        }
        lII1I1l11 = Ill1l11II1Il * IIl11llII - 70;
        this.var_game_ItemTemplate_a = (ItemTemplate)this.var_java_util_Vector_IIIIllllIll1.elementAt(this.var_int_IIIIllllIll1);
        this.var_java_lang_String_IIIIllllIll1 = this.var_game_ItemTemplate_a.java_lang_String_b();
        this.var_java_lang_String_llIll1l1IIII = this.var_game_ItemTemplate_a.var_java_lang_String_a;
        this.I1IIlI11I11 = "Gi\u00e1: " + this.var_game_ItemTemplate_a.var_int_e + StringUtils.aq() + "(" + this.var_game_ItemTemplate_a.var_byte_e + "ng\u00e0y)";
    }

    public final void a(Graphics graphics) {
        int n;
        int n2;
        Object object;
        int n3;
        super.a(graphics);
        graphics.setColor(3832504);
        graphics.fillRoundRect(this.var_int_llIll1l1IIII / 2 - 85, this.e + 23, 170, 78, 6, 6);
        int n4 = this.var_int_IIIIllllIll1;
        int n5 = this.e + 29;
        int n6 = this.var_int_llIll1l1IIII / 2 - 78;
        int n7 = 0;
        int n8 = 0;
        graphics.setClip(n6 - 2, n5 - 2, 170, 72);
        graphics.translate(0, -ll1lIlIIII);
        graphics.setColor(16767817);
        for (n3 = 0; n3 < this.var_java_util_Vector_IIIIllllIll1.size(); ++n3) {
            object = (ItemTemplate)this.var_java_util_Vector_IIIIllllIll1.elementAt(n3);
            n2 = n6 + n7 * IIl11llII + III11llIll;
            n = n5 + n8 * IIl11llII + l1I111lllI1I;
            if (n3 == n4) {
                graphics.fillRect(n2 - (GameCanvas.var_boolean_d ? 12 : 2), n - (GameCanvas.var_boolean_d ? 12 : 2), GameCanvas.var_boolean_d ? 40 : 20, GameCanvas.var_boolean_d ? 40 : 20);
            }
            if (((ItemTemplate)object).var_boolean_c) {
                graphics.setColor(5612786);
                graphics.fillRect(n2, n, 16, 16);
            }
            ((ItemTemplate)object).a(graphics, n2, n);
            if (++n7 != Il1llIlI) continue;
            n7 = 0;
            ++n8;
        }
        graphics.setClip(0, 0, 1000, 1000);
        graphics.translate(0, -graphics.getTranslateY());
        n3 = this.e + 103;
        n5 = this.var_int_llIll1l1IIII / 2 - 85;
        object = TerrainMidlet.myInfo;
        String string = StringUtils.dE() + ": " + DataUtils.a(((PlayerAccountInfo)object).var_long_c) + " " + StringUtils.aq() + "-" + DataUtils.a(((PlayerAccountInfo)object).e) + " " + StringUtils.ar();
        n = FontRenderer.a.a(this.var_java_lang_String_IIIIllllIll1);
        n6 = FontRenderer.a.a(this.I1IIlI11I11);
        if (n > 155) {
            DataUtils.a(this.var_game_GameHelper40_IlIIIllIl1, n - 150);
        }
        if (n6 > 155) {
            DataUtils.a(this.var_game_GameHelper40_IIIIllllIll1, n6 - 150);
        }
        n8 = this.var_game_GameHelper40_IlIIIllIl1.a;
        n2 = this.var_game_GameHelper40_IIIIllllIll1.a;
        FontRenderer.a.a(graphics, string, this.var_int_llIll1l1IIII / 2, n3 - 1, 3);
        graphics.setColor(2378093);
        graphics.fillRoundRect(n5, n3 + 14, 170, 16, 6, 6);
        graphics.fillRoundRect(n5, n3 + 34, 170, 16, 6, 6);
        graphics.fillRoundRect(n5, n3 + 54, 170, 16, 6, 6);
        graphics.setClip(n5, n3, 170, this.var_int_g);
        FontRenderer.c.a(graphics, this.var_java_lang_String_llIll1l1IIII, n5 + 6, n3 + 15, 0);
        FontRenderer.b.a(graphics, this.I1IIlI11I11, n5 + 6 + n2, n3 + 35, 0);
        FontRenderer.b.a(graphics, this.var_java_lang_String_IIIIllllIll1, n5 + 6 + n8, n3 + 55, 0);
        this.d(graphics);
    }

    public final void c() {
        super.c();
        if (ll1lIlIIII != var_int_a) {
            I1llllll1II1 = var_int_a - ll1lIlIIII << 2;
            ll1lIlIIII += (lllIIlIlI += I1llllll1II1) >> 4;
            lllIIlIlI &= 0xF;
        }
        if (ll1lIlIIII > lII1I1l11) {
            ll1lIlIIII = lII1I1l11;
        }
        if (ll1lIlIIII < 0) {
            ll1lIlIIII = 0;
        }
    }

    private void II1Il11I() {
        this.var_game_ItemTemplate_a = (ItemTemplate)this.var_java_util_Vector_IIIIllllIll1.elementAt(this.var_int_IIIIllllIll1);
        this.var_java_lang_String_IIIIllllIll1 = this.var_game_ItemTemplate_a.java_lang_String_b();
        this.var_java_lang_String_llIll1l1IIII = this.var_game_ItemTemplate_a.var_java_lang_String_a + " (lvl " + this.var_game_ItemTemplate_a.var_byte_f + ")";
        String string = (this.var_game_ItemTemplate_a.var_int_e == -1 ? "" : "-") + DataUtils.a((long)this.var_game_ItemTemplate_a.var_int_f) + " " + StringUtils.ar();
        if (this.var_game_ItemTemplate_a.var_int_f == -1) {
            string = "";
        }
        String string2 = this.var_game_ItemTemplate_a.var_int_e + StringUtils.aq();
        if (this.var_game_ItemTemplate_a.var_int_e == -1) {
            string2 = "";
        }
        String string3 = this.var_game_ItemTemplate_a.var_byte_e < 0 ? "" : "(" + this.var_game_ItemTemplate_a.var_byte_e + StringUtils.p() + ")";
        this.I1IIlI11I11 = StringUtils.cO() + ": " + string2 + string + string3;
        this.lIllIIlI1II();
        this.var_game_GameHelper40_IlIIIllIl1.a = 0;
        int n = this.var_int_IIIIllllIll1 / Il1llIlI;
        var_int_a = n * IIl11llII + l1I111lllI1I - 20;
        if (var_int_a < 0) {
            var_int_a = 0;
        }
        if (var_int_a > lII1I1l11) {
            var_int_a = lII1I1l11;
        }
    }

    public final void void_b() {
        int n;
        super.void_b();
        if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            --this.var_int_IIIIllllIll1;
            if (this.var_int_IIIIllllIll1 < 0) {
                this.var_int_IIIIllllIll1 = this.II1l111I - 1;
            }
            this.II1Il11I();
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            ++this.var_int_IIIIllllIll1;
            if (this.var_int_IIIIllllIll1 > this.II1l111I - 1) {
                this.var_int_IIIIllllIll1 = 0;
            }
            this.II1Il11I();
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            this.var_int_IIIIllllIll1 += Il1llIlI;
            if (this.var_int_IIIIllllIll1 > this.II1l111I - 1) {
                this.var_int_IIIIllllIll1 = this.II1l111I - 1;
            }
            this.II1Il11I();
        }
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            this.var_int_IIIIllllIll1 -= Il1llIlI;
            if (this.var_int_IIIIllllIll1 < 0) {
                this.var_int_IIIIllllIll1 = 0;
            }
            this.II1Il11I();
        }
        if (GameCanvas.var_boolean_b) {
            n = Ill1l11II1Il;
            if (!var_boolean_IlIIIllIl1) {
                I1lIl11I = ll1lIlIIII;
                var_boolean_IlIIIllIl1 = true;
            }
            if ((var_int_a = I1lIl11I + (GameCanvas.h - GameCanvas.g)) < 0) {
                var_int_a = 0;
            }
            if (var_int_a > n * 40 - 40) {
                var_int_a = n * 40 - 40;
            }
        }
        if (GameCanvas.var_boolean_c) {
            n = this.e;
            int n2 = this.d;
            var_boolean_IlIIIllIl1 = false;
            n = Math.abs(GameCanvas.h - GameCanvas.g) < 10 && GameCanvas.a(n2, n + 20, 160, 80) ? (var_int_a + GameCanvas.g - n - 20) / IIl11llII * Il1llIlI + (GameCanvas.f - n2 - 8) / IIl11llII : -1;
            n2 = n;
            if (n == -1) {
                return;
            }
            if (n2 == this.var_int_IIIIllllIll1 && this.f != null) {
                this.f.var_game_IActionListener_a.a();
            }
            this.var_int_IIIIllllIll1 = n2;
            if (this.var_int_IIIIllllIll1 < 0) {
                this.var_int_IIIIllllIll1 = 0;
            }
            if (this.var_int_IIIIllllIll1 > var_java_util_Vector_IlIIIllIl1.size() - 1) {
                this.var_int_IIIIllllIll1 = var_java_util_Vector_IlIIIllIl1.size() - 1;
            }
            this.II1Il11I();
        }
    }

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        var_int_a = 0;
        this.lIllIIlI1II();
        this.II1Il11I();
    }

    static {
        var_java_util_Vector_IlIIIllIl1 = new Vector();
        Il1llIlI = 8;
        I1lIl11I = 0;
        var_boolean_IlIIIllIl1 = false;
    }
}

