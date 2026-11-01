/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class OptionScreen
extends BaseScreen {
    public static OptionScreen a;
    private Vector var_java_util_Vector_I1II1I111l;
    private int var_int_I1II1I111l;
    private int II11I1I1lII1;
    private int Illl1III;
    private int I11lI1I1;
    private int I11I1llI11l1;
    private int ll11IlIIlI1l = 0;
    private boolean var_boolean_I1II1I111l = false;

    public final PlayerSlot game_PlayerSlot_a() {
        return (PlayerSlot)this.var_java_util_Vector_I1II1I111l.elementAt(this.I11I1llI11l1);
    }

    private void l1l1lI1I1() {
        GameCommand gameCommand = new GameCommand(StringUtils.af(), new ActionListener224(this));
        GameCommand gameCommand2 = new GameCommand(StringUtils.ae(), new ActionListener175(this));
        if (this.game_PlayerSlot_a().var_int_a != -1 && this.game_PlayerSlot_a().var_int_b != -1) {
            this.g = new GameCommand("Menu", new ActionListener089(gameCommand, gameCommand2));
        } else {
            if (this.game_PlayerSlot_a().var_int_a != -1) {
                this.g = gameCommand;
            }
            if (this.game_PlayerSlot_a().var_int_b != -1) {
                this.g = gameCommand2;
            }
        }
        this.h = new GameCommand(StringUtils.dH(), new ActionListener017());
    }

    public final void a(Vector vector) {
        this.var_java_util_Vector_I1II1I111l = vector;
        this.I11lI1I1 = vector.size() * 50 - (GameCanvas.var_int_c - (BaseScreen.var_int_o + BaseScreen.var_int_r)) + 10;
        if (this.I11lI1I1 < 0) {
            this.I11lI1I1 = 0;
        }
    }

    public final void b_() {
        super.b_();
        this.l1l1lI1I1();
        GameCanvas.d();
    }

    public final void a(Graphics graphics) {
        int n;
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (n = 0; n <= GameCanvas.var_int_b; n += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, n, GameCanvas.var_int_c - 62, 0);
        }
        FontRenderer.f.a(graphics, StringUtils.k(), 10, 3, 0);
        graphics.translate(0, 30);
        graphics.setClip(0, 1, GameCanvas.var_int_b, GameCanvas.var_int_c - 25 - BaseScreen.var_int_o);
        graphics.translate(0, -this.II11I1I1lII1);
        n = 0;
        for (int i = 0; i < this.var_java_util_Vector_I1II1I111l.size(); ++i) {
            if (i == this.I11I1llI11l1) {
                graphics.setColor(16765440);
                graphics.fillRect(0, n, GameCanvas.var_int_b, 49);
            }
            if (i * 50 > -graphics.getTranslateY() && i * 50 < -graphics.getTranslateY() + GameCanvas.var_int_c) {
                PlayerSlot playerSlot = (PlayerSlot)this.var_java_util_Vector_I1II1I111l.elementAt(i);
                String string = playerSlot.var_java_lang_String_a;
                FontRenderer.e.a(graphics, "Level: " + playerSlot.c + ": " + string, 5, n, 0);
                string = StringUtils.cO() + ": ";
                if (playerSlot.var_int_a != -1 && playerSlot.var_int_b != -1) {
                    string = string + DataUtils.a((long)playerSlot.var_int_a) + " " + StringUtils.aq() + " - " + DataUtils.a((long)playerSlot.var_int_b) + " " + StringUtils.ar();
                } else {
                    if (playerSlot.var_int_a != -1) {
                        string = string + DataUtils.a((long)playerSlot.var_int_a) + " " + StringUtils.aq();
                    }
                    if (playerSlot.var_int_b != -1) {
                        string = string + DataUtils.a((long)playerSlot.var_int_b) + " " + StringUtils.ar();
                    }
                }
                FontRenderer.a.a(graphics, StringUtils.cO() + ": " + string, 5, n + 18, 0);
                FontRenderer.a.a(graphics, StringUtils.Y() + ": " + playerSlot.var_byte_b + " " + StringUtils.o(), 5, n + 34, 0);
            }
            n += 50;
        }
        super.a(graphics);
    }

    public final void void_a() {
        if (this.II11I1I1lII1 != this.var_int_I1II1I111l) {
            this.Illl1III = this.var_int_I1II1I111l - this.II11I1I1lII1 >> 2;
            this.II11I1I1lII1 += this.Illl1III;
        }
    }

    public final void c() {
        GameHelper18.a();
        this.void_a();
    }

    public final void void_b() {
        super.void_b();
        int n = 0;
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            ++this.I11I1llI11l1;
            if (this.I11I1llI11l1 == this.var_java_util_Vector_I1II1I111l.size()) {
                this.I11I1llI11l1 = 0;
            }
            n = 1;
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            --this.I11I1llI11l1;
            if (this.I11I1llI11l1 < 0) {
                this.I11I1llI11l1 = this.var_java_util_Vector_I1II1I111l.size() - 1;
            }
            n = 1;
        }
        if (n != 0) {
            this.var_int_I1II1I111l = this.I11I1llI11l1 * 50 - (GameCanvas.var_int_e - 2 * BaseScreen.var_int_o);
            if (this.var_int_I1II1I111l < 0) {
                this.var_int_I1II1I111l = 0;
            }
            if (this.var_int_I1II1I111l > this.I11lI1I1) {
                this.var_int_I1II1I111l = this.I11lI1I1;
            }
            if (this.I11I1llI11l1 == this.var_java_util_Vector_I1II1I111l.size() - 1 || this.I11I1llI11l1 == 0) {
                this.II11I1I1lII1 = this.var_int_I1II1I111l;
            }
            this.l1l1lI1I1();
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.var_boolean_I1II1I111l) {
                this.ll11IlIIlI1l = this.II11I1I1lII1;
                this.var_boolean_I1II1I111l = true;
            }
            this.var_int_I1II1I111l = this.ll11IlIIlI1l + (GameCanvas.h - GameCanvas.g);
            if (this.var_int_I1II1I111l > this.I11lI1I1) {
                this.var_int_I1II1I111l = this.I11lI1I1;
            }
            if (this.var_int_I1II1I111l < 0) {
                this.var_int_I1II1I111l = 0;
            }
        }
        if (GameCanvas.var_boolean_c) {
            this.var_boolean_I1II1I111l = false;
            n = GameCanvas.h - GameCanvas.g;
            if (GameCanvas.a(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c - BaseScreen.var_int_r) && Math.abs(n) < 10) {
                n = BaseScreen.var_int_o;
                if ((n = (this.var_int_I1II1I111l + GameCanvas.g - n) / 50) == this.I11I1llI11l1) {
                    if (this.g != null) {
                        this.g.var_game_IActionListener_a.a();
                    } else if (this.f != null) {
                        this.f.var_game_IActionListener_a.a();
                    }
                }
                this.I11I1llI11l1 = n;
                this.l1l1lI1I1();
                if (this.I11I1llI11l1 < 0) {
                    this.I11I1llI11l1 = 0;
                }
                if (this.I11I1llI11l1 >= this.var_java_util_Vector_I1II1I111l.size()) {
                    this.I11I1llI11l1 = this.var_java_util_Vector_I1II1I111l.size() - 1;
                }
            }
        }
    }
}

