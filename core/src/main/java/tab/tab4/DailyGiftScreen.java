/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class DailyGiftScreen
extends BaseScreen {
    public static DailyGiftScreen var_game_DailyGiftScreen_a;
    public Vector var_java_util_Vector_a = new Vector();
    public BaseScreen var_game_BaseScreen_a;
    public int var_int_a = 0;
    private int I1IlI11lIlll;
    private int llIl1II111ll;
    private int ll1II1III11l;
    private int Il1l1Illll1;
    private int IlII1lI1Il;
    private int llI1I11ll1Il = 0;
    private boolean l1I111IllIl = false;

    public final void a(GameHelper07 gameHelper07) {
        this.var_java_util_Vector_a.addElement(gameHelper07);
    }

    public final void a(BaseScreen baseScreen) {
        this.var_game_BaseScreen_a = baseScreen;
        this.d();
        super.b_();
    }

    public final void void_a() {
        if (this.llIl1II111ll != this.I1IlI11lIlll) {
            this.Il1l1Illll1 = this.I1IlI11lIlll - this.llIl1II111ll << 2;
            this.ll1II1III11l += this.Il1l1Illll1;
            this.llIl1II111ll += this.ll1II1III11l >> 4;
            this.ll1II1III11l &= 0xF;
        }
    }

    public final void void_b() {
        super.void_b();
        if (this.var_java_util_Vector_a.isEmpty()) {
            return;
        }
        if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            --this.var_int_a;
            if (this.var_int_a < 0) {
                this.var_int_a = this.var_java_util_Vector_a.size() - 1;
            }
            this.d();
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            ++this.var_int_a;
            if (this.var_int_a > this.var_java_util_Vector_a.size() - 1) {
                this.var_int_a = 0;
            }
            this.d();
        }
        if (GameCanvas.var_boolean_arr_b[8]) {
            this.I1IlI11lIlll += 20;
            new StringBuffer("[ej] cmyLim= ").append(this.IlII1lI1Il);
            if (this.I1IlI11lIlll > this.IlII1lI1Il) {
                this.I1IlI11lIlll = this.IlII1lI1Il;
            }
        }
        if (GameCanvas.var_boolean_arr_b[2]) {
            this.I1IlI11lIlll = -20;
            if (this.I1IlI11lIlll < 0) {
                this.I1IlI11lIlll = 0;
            }
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.l1I111IllIl) {
                this.llI1I11ll1Il = this.llIl1II111ll;
                this.l1I111IllIl = true;
            }
            this.I1IlI11lIlll = this.llI1I11ll1Il + (GameCanvas.h - GameCanvas.g);
            if (this.I1IlI11lIlll < 0) {
                this.I1IlI11lIlll = 0;
            }
            if (this.I1IlI11lIlll > this.IlII1lI1Il) {
                this.I1IlI11lIlll = this.IlII1lI1Il;
            }
        }
    }

    public final void d() {
        this.h = new GameCommand(StringUtils.dH(), new ActionListener027(this));
        this.f = new GameCommand("Menu", new ActionListener208(this));
        if (this.var_java_util_Vector_a.isEmpty()) {
            this.g = null;
            return;
        }
        if (this.var_int_a < 0 || this.var_int_a >= this.var_java_util_Vector_a.size()) {
            this.var_int_a = 0;
        }
        if (((GameHelper07)this.var_java_util_Vector_a.elementAt((int)this.var_int_a)).var_boolean_b) {
            this.g = new GameCommand(StringUtils.e(), new ActionListener053(this));
            return;
        }
        this.g = null;
    }

    public final void a(Graphics graphics) {
        int n;
        ClanScreen.c(graphics);
        graphics.translate(0, -this.llIl1II111ll);
        if (this.var_java_util_Vector_a.isEmpty()) {
            FontRenderer.f.a(graphics, StringUtils.h(), GameCanvas.var_int_b / 2, 5, 3);
            FontRenderer.a.a(graphics, "Ch\u01b0a c\u00f3 c\u00f4ng th\u1ee9c", GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2, 3);
            super.a(graphics);
            return;
        }
        if (this.var_int_a < 0 || this.var_int_a >= this.var_java_util_Vector_a.size()) {
            this.var_int_a = 0;
        }
        GameHelper07 gameHelper07 = (GameHelper07)this.var_java_util_Vector_a.elementAt(this.var_int_a);
        FontRenderer.f.a(graphics, StringUtils.h(), GameCanvas.var_int_b / 2, 5, 3);
        if (gameHelper07.var_game_ItemTemplate_b != null) {
            FontRenderer.a.a(graphics, gameHelper07.var_game_ItemTemplate_b.var_java_lang_String_a, GameCanvas.var_int_b / 2, 30, 3);
            gameHelper07.var_game_ItemTemplate_b.a(graphics, GameCanvas.var_int_b / 2 + FontRenderer.a.a(gameHelper07.var_game_ItemTemplate_b.var_java_lang_String_a) / 2 + 10, 30);
        }
        for (n = 0; n < gameHelper07.var_java_lang_String_arr_c.length; ++n) {
            FontRenderer.e.a(graphics, gameHelper07.var_java_lang_String_arr_c[n], GameCanvas.var_int_b / 2, 50 + n * 18, 3);
        }
        FontRenderer.e.a(graphics, StringUtils.i() + ": " + TerrainMidlet.myInfo.var_int_b + "/" + gameHelper07.var_int_a, GameCanvas.var_int_b / 2, gameHelper07.var_int_c + 53, 3);
        gameHelper07.var_game_ItemTemplate_a.a(graphics, GameCanvas.var_int_b / 2 - 70 - 8, gameHelper07.var_int_c + 78 - 8);
        FontRenderer.a.a(graphics, "1x " + gameHelper07.var_game_ItemTemplate_a.var_java_lang_String_a, GameCanvas.var_int_b / 2 - 55, gameHelper07.var_int_c + 71, 0);
        FontRenderer.a.a(graphics, gameHelper07.var_boolean_a ? "1/1" : "0/1", GameCanvas.var_int_b / 2 + 70, gameHelper07.var_int_c + 71, 3);
        for (n = 0; n < gameHelper07.var_javax_microedition_lcdui_Image_arr_a.length; ++n) {
            if (gameHelper07.var_javax_microedition_lcdui_Image_arr_a[n] != null) {
                graphics.drawImage(gameHelper07.var_javax_microedition_lcdui_Image_arr_a[n], GameCanvas.var_int_b / 2 - 70, gameHelper07.var_int_c + 97 + n * 18, 3);
            }
            FontRenderer.a.a(graphics, gameHelper07.var_java_lang_String_arr_b[n], GameCanvas.var_int_b / 2 - 55, gameHelper07.var_int_c + 89 + n * 18, 0);
            FontRenderer.a.a(graphics, gameHelper07.var_java_lang_String_arr_a[n], GameCanvas.var_int_b / 2 + 70, gameHelper07.var_int_c + 89 + n * 18, 3);
        }
        super.a(graphics);
    }

    public final void c() {
        this.void_a();
        if (this.var_java_util_Vector_a.isEmpty()) {
            this.IlII1lI1Il = 0;
            return;
        }
        if (this.var_int_a < 0 || this.var_int_a >= this.var_java_util_Vector_a.size()) {
            this.var_int_a = 0;
        }
        this.var_java_util_Vector_a.elementAt(this.var_int_a);
        this.IlII1lI1Il = 105 + this.var_java_util_Vector_a.size() * 30 - (GameCanvas.var_int_c - BaseScreen.var_int_r - 25);
        if (this.IlII1lI1Il < 0) {
            this.IlII1lI1Il = 0;
        }
    }

    public final GameHelper07 a(int n) {
        if (this.var_java_util_Vector_a.isEmpty() || n < 0 || n >= this.var_java_util_Vector_a.size()) {
            return null;
        }
        return (GameHelper07)this.var_java_util_Vector_a.elementAt(n);
    }
}

