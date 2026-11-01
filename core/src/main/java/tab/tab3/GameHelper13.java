/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab3;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class GameHelper13
extends BaseScreen {
    public static GameHelper13 var_game_GameHelper13_a;
    public Vector var_java_util_Vector_a = new Vector();
    public int var_int_a;
    private int II1IIII1;
    private int lI1lIl1ll11;
    private int lIl1IllIl;
    private int IlllI1111Ill;
    public int b;
    private int l11Il1I1l;
    public BaseScreen var_game_BaseScreen_a;
    private int l1I1lll111l1 = 0;
    private boolean lI1II1l1111 = false;

    public final void a(BaseScreen baseScreen) {
        this.var_game_BaseScreen_a = baseScreen;
        GameCanvas.var_java_util_Vector_a.removeAllElements();
        GameCanvas.var_game_TimerHUD_a.var_int_a = 0;
        super.b_();
    }

    public final void void_a() {
        if (this.lI1lIl1ll11 != this.II1IIII1) {
            this.IlllI1111Ill = this.II1IIII1 - this.lI1lIl1ll11 << 2;
            this.lIl1IllIl += this.IlllI1111Ill;
            this.lI1lIl1ll11 += this.lIl1IllIl >> 4;
            this.lIl1IllIl &= 0xF;
        }
    }

    public GameHelper13() {
        this.g = new GameCommand(StringUtils.aI(), new ActionListener113(this));
        this.h = new GameCommand(StringUtils.dI(), new ActionListener118(this));
        this.f = new GameCommand("Menu", new ActionListener108(this));
    }

    public final void a(Graphics graphics) {
        this.var_game_BaseScreen_a.a(graphics);
        graphics.setClip(10, 20, GameCanvas.var_int_b - 19, GameCanvas.var_int_c - 59);
        graphics.setColor(13302783);
        graphics.fillRect(10, 20, GameCanvas.var_int_b - 20, GameCanvas.var_int_c - 60);
        graphics.setColor(5215093);
        graphics.drawRect(10, 20, GameCanvas.var_int_b - 20, GameCanvas.var_int_c - 60);
        graphics.translate(10, 20);
        graphics.translate(this.l11Il1I1l, 0);
        FontRenderer.f.a(graphics, StringUtils.cH(), 10, 3, 0);
        graphics.setColor(1407674);
        graphics.fillRect(1, 25, GameCanvas.var_int_b - 21, BaseScreen.var_int_o);
        FontRenderer.b.a(graphics, StringUtils.dT(), 10, 28, 0);
        FontRenderer.b.a(graphics, StringUtils.cF(), GameCanvas.var_int_b - 45, 28, 2);
        if (this.var_java_util_Vector_a.size() == 0) {
            FontRenderer.e.a(graphics, StringUtils.cC(), GameCanvas.var_int_d - 10, 50, 2);
            FontRenderer.e.a(graphics, StringUtils.cD(), GameCanvas.var_int_d - 10, 75, 2);
            FontRenderer.e.a(graphics, StringUtils.cE(), GameCanvas.var_int_d - 10, 90, 2);
        }
        graphics.translate(0, BaseScreen.var_int_o + 25);
        graphics.setClip(0, 0, GameCanvas.var_int_b - 20, GameCanvas.var_int_c - 25 - 21 - 40 - BaseScreen.var_int_o);
        graphics.translate(0, -this.lI1lIl1ll11);
        int n = 0;
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            if (i == this.var_int_a) {
                graphics.setColor(16765440);
                graphics.fillRect(2, n, GameCanvas.var_int_b - 21 - 2, 38);
            }
            ClanGroupEntry clanGroupEntry = (ClanGroupEntry)this.var_java_util_Vector_a.elementAt(i);
            graphics.drawImage(TimerHUD.var_javax_microedition_lcdui_Image_arr_a[0], 10, n + 4, 0);
            FontRenderer.e.a(graphics, clanGroupEntry.var_java_lang_String_a, 30, n + 3, 0);
            FontRenderer.e.a(graphics, FontRenderer.e.a(clanGroupEntry.b, GameCanvas.var_int_b - 80)[0], 10, n + BaseScreen.var_int_o, 0);
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_arr_c[clanGroupEntry.var_boolean_a ? 0 : 1], GameCanvas.var_int_b - 40, n + 20, 3);
            n += 40;
        }
        super.a(graphics);
    }

    public final void void_b() {
        super.void_b();
        int n = 0;
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            ++this.var_int_a;
            if (this.var_int_a == this.var_java_util_Vector_a.size()) {
                this.var_int_a = 0;
            }
            n = 1;
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            --this.var_int_a;
            if (this.var_int_a < 0) {
                this.var_int_a = this.var_java_util_Vector_a.size() - 1;
            }
            n = 1;
        }
        if (n != 0) {
            this.II1IIII1 = this.var_int_a * 40 - (GameCanvas.var_int_e - 2 * BaseScreen.var_int_o);
            if (this.II1IIII1 > this.b) {
                this.II1IIII1 = this.b;
            }
            if (this.II1IIII1 < 0) {
                this.II1IIII1 = 0;
            }
            if (this.var_int_a == this.var_java_util_Vector_a.size() - 1 || this.var_int_a == 0) {
                this.lI1lIl1ll11 = this.II1IIII1;
            }
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.lI1II1l1111) {
                this.l1I1lll111l1 = this.lI1lIl1ll11;
                this.lI1II1l1111 = true;
            }
            this.II1IIII1 = this.l1I1lll111l1 + (GameCanvas.h - GameCanvas.g);
            if (this.II1IIII1 > this.b) {
                this.II1IIII1 = this.b;
            }
            if (this.II1IIII1 < 0) {
                this.II1IIII1 = 0;
            }
        }
        if (GameCanvas.var_boolean_c) {
            this.lI1II1l1111 = false;
            n = GameCanvas.h - GameCanvas.g;
            if (GameCanvas.a(0, 20, GameCanvas.var_int_b, GameCanvas.var_int_c - 60) && Math.abs(n) < 10) {
                n = 20 + 2 * BaseScreen.var_int_o;
                if ((n = (this.II1IIII1 + GameCanvas.g - n) / 40) == this.var_int_a) {
                    if (this.g != null) {
                        this.g.var_game_IActionListener_a.a();
                    } else if (this.f != null) {
                        this.f.var_game_IActionListener_a.a();
                    }
                }
                this.var_int_a = n;
                if (this.var_int_a < 0) {
                    this.var_int_a = 0;
                }
                if (this.var_int_a >= this.var_java_util_Vector_a.size()) {
                    this.var_int_a = this.var_java_util_Vector_a.size() - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.l11Il1I1l != 0) {
            this.l11Il1I1l += -this.l11Il1I1l >> 1;
        }
        if (this.l11Il1I1l == -1) {
            this.l11Il1I1l = 0;
        }
        this.void_a();
    }
}

