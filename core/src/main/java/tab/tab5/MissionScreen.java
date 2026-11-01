/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab5;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class MissionScreen
extends BaseScreen {
    public static MissionScreen a;
    private Vector var_java_util_Vector_llIIIIllIl1l = new Vector();
    private int var_int_llIIIIllIl1l;
    private int IIlI11I1l11;
    private int lll1II1IlllI;
    private int ll1ll1lI1I;
    private int l1lI1lI11I;
    private int IllI1111llI;
    private int I1l11Il1IIl = 0;
    private boolean var_boolean_llIIIIllIl1l = false;
    private int ll111lIllI;

    public MissionScreen() {
        this.h = new GameCommand(StringUtils.dH(), new ActionListener184());
    }

    public final GameHelper23 game_GameHelper23_a() {
        return (GameHelper23)this.var_java_util_Vector_llIIIIllIl1l.elementAt(this.l1lI1lI11I);
    }

    public final void a(Graphics graphics) {
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (int i = 0; i <= GameCanvas.var_int_b; i += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, i, GameCanvas.var_int_c - 62, 0);
        }
        graphics.setColor(1407674);
        graphics.fillRect(0, 25, GameCanvas.var_int_b, BaseScreen.var_int_o);
        FontRenderer.f.a(graphics, "NHI\u1ec6M V\u1ee4", GameCanvas.var_int_b / 2, 3, 17);
        FontRenderer.b.a(graphics, "Nhi\u1ec7m v\u1ee5", 10, 28, 0);
        FontRenderer.b.a(graphics, "Ho\u00e0n th\u00e0nh", GameCanvas.var_int_b - 10, 28, 1);
        Graphics graphics2 = graphics;
        MissionScreen missionScreen = this;
        graphics.translate(0, BaseScreen.var_int_o + 25);
        graphics.setClip(0, 1, GameCanvas.var_int_b, GameCanvas.var_int_c - 25 - 21 - BaseScreen.var_int_o);
        graphics.translate(0, -this.IIlI11I1l11);
        int n = 0;
        for (int i = 0; i < missionScreen.var_java_util_Vector_llIIIIllIl1l.size(); ++i) {
            if (i == missionScreen.l1lI1lI11I) {
                graphics2.setColor(16765440);
                graphics2.fillRect(0, n, GameCanvas.var_int_b, missionScreen.IllI1111llI);
            }
            if (i * missionScreen.IllI1111llI + missionScreen.IllI1111llI > -graphics2.getTranslateY() && i * missionScreen.IllI1111llI < -graphics2.getTranslateY() + GameCanvas.var_int_c) {
                GameHelper23 gameHelper23 = (GameHelper23)missionScreen.var_java_util_Vector_llIIIIllIl1l.elementAt(i);
                FontRenderer.e.a(graphics2, gameHelper23.var_java_lang_String_a, 7, n + 10, 0);
                graphics2.setColor(1521982);
                graphics2.fillRect(5, n + 26, 102, 17);
                graphics2.setColor(2378093);
                graphics2.fillRect(6, n + 26 + 1, 100, 15);
                int n2 = gameHelper23.c * 100 / gameHelper23.var_int_b;
                graphics2.setColor(16767817);
                graphics2.fillRect(6, n + 26 + 1, n2, 15);
                FontRenderer.e.a(graphics2, gameHelper23.c + "/" + gameHelper23.var_int_b, 56, n + 26, 2);
                FontRenderer.e.a(graphics2, gameHelper23.var_java_lang_String_b, 7, n + 43, 0);
                if (!gameHelper23.var_boolean_a) {
                    graphics2.drawImage(BaseScreen.var_javax_microedition_lcdui_Image_q, GameCanvas.var_int_b - 20, n + 32, 3);
                } else {
                    graphics2.drawImage(BaseScreen.var_javax_microedition_lcdui_Image_r, GameCanvas.var_int_b - 20, n + 32, 3);
                }
            }
            n += missionScreen.IllI1111llI;
        }
        super.a(graphics);
    }

    public final void void_a() {
        if (this.IIlI11I1l11 != this.var_int_llIIIIllIl1l) {
            this.lll1II1IlllI = this.var_int_llIIIIllIl1l - this.IIlI11I1l11 >> 2;
            this.IIlI11I1l11 += this.lll1II1IlllI;
        }
    }

    public final void c() {
        this.void_a();
        GameHelper18.a();
    }

    private void lI11llllI() {
        if (this.game_GameHelper23_a().var_boolean_a) {
            this.g = new GameCommand(StringUtils.l(), new ActionListener095(this));
            return;
        }
        this.g = null;
    }

    public final void void_b() {
        super.void_b();
        int n = 0;
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            ++this.l1lI1lI11I;
            if (this.l1lI1lI11I == this.var_java_util_Vector_llIIIIllIl1l.size()) {
                this.l1lI1lI11I = 0;
            }
            n = 1;
            this.lI11llllI();
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            --this.l1lI1lI11I;
            if (this.l1lI1lI11I < 0) {
                this.l1lI1lI11I = this.var_java_util_Vector_llIIIIllIl1l.size() - 1;
            }
            n = 1;
            this.lI11llllI();
        } else if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
        } else if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
        }
        if (n != 0) {
            this.var_int_llIIIIllIl1l = this.l1lI1lI11I * this.IllI1111llI - (GameCanvas.var_int_e - 3 * BaseScreen.var_int_o);
            if (this.var_int_llIIIIllIl1l < 0) {
                this.var_int_llIIIIllIl1l = 0;
            }
            if (this.var_int_llIIIIllIl1l > this.ll1ll1lI1I) {
                this.var_int_llIIIIllIl1l = this.ll1ll1lI1I;
            }
            if (this.l1lI1lI11I == this.var_java_util_Vector_llIIIIllIl1l.size() - 1 || this.l1lI1lI11I == 0) {
                this.IIlI11I1l11 = this.var_int_llIIIIllIl1l;
            }
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.var_boolean_llIIIIllIl1l) {
                this.I1l11Il1IIl = this.IIlI11I1l11;
                this.var_boolean_llIIIIllIl1l = true;
                this.ll111lIllI = GameCanvas.f;
            }
            this.var_int_llIIIIllIl1l = this.I1l11Il1IIl + (GameCanvas.h - GameCanvas.g);
            if (this.var_int_llIIIIllIl1l > this.ll1ll1lI1I) {
                this.var_int_llIIIIllIl1l = this.ll1ll1lI1I;
            }
            if (this.var_int_llIIIIllIl1l < 0) {
                this.var_int_llIIIIllIl1l = 0;
            }
        }
        if (GameCanvas.var_boolean_c) {
            this.var_boolean_llIIIIllIl1l = false;
            if (Math.abs(GameCanvas.f - this.ll111lIllI) > 50) {
                return;
            }
            n = GameCanvas.h - GameCanvas.g;
            if (GameCanvas.a(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c - BaseScreen.var_int_r) && Math.abs(n) < 10) {
                n = 2 * BaseScreen.var_int_o;
                if ((n = (this.var_int_llIIIIllIl1l + GameCanvas.g - n) / this.IllI1111llI) == this.l1lI1lI11I) {
                    if (this.g != null) {
                        this.g.var_game_IActionListener_a.a();
                    } else if (this.f != null) {
                        this.f.var_game_IActionListener_a.a();
                    }
                }
                this.l1lI1lI11I = n;
                if (this.l1lI1lI11I < 0) {
                    this.l1lI1lI11I = 0;
                }
                if (this.l1lI1lI11I >= this.var_java_util_Vector_llIIIIllIl1l.size()) {
                    this.l1lI1lI11I = this.var_java_util_Vector_llIIIIllIl1l.size() - 1;
                }
            }
        }
    }

    public final void a(Vector vector) {
        this.var_java_util_Vector_llIIIIllIl1l = vector;
        this.IllI1111llI = 65;
        this.ll1ll1lI1I = this.var_java_util_Vector_llIIIIllIl1l.size() * this.IllI1111llI - (GameCanvas.var_int_c - ((BaseScreen.var_int_o << 1) + BaseScreen.var_int_r)) + 10;
        if (this.ll1ll1lI1I < 0) {
            this.ll1ll1lI1I = 0;
        }
        this.lI11llllI();
    }
}

