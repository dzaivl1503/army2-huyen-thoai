/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;

public final class GameHelper06
extends BaseScreen {
    public static GameHelper06 a = new GameHelper06();
    private int var_int_ll11lI11Il1I = 0;
    private boolean var_boolean_ll11lI11Il1I = true;
    private int var_int_lllllIIll1I = 0;
    private boolean var_boolean_lllllIIll1I;

    public final void a(Graphics graphics) {
        graphics.setColor(7852799);
        graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_boolean_lllllIIll1I) {
            DataUtils.a(graphics, ClanScreen.i, 0, this.var_int_lllllIIll1I * 51, 71, 51, 0, GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2, 3);
        }
    }

    public final void c() {
        if (this.var_boolean_lllllIIll1I) {
            if (this.var_int_ll11lI11Il1I < 50) {
                ++this.var_int_lllllIIll1I;
                if (this.var_int_lllllIIll1I > 3) {
                    this.var_int_lllllIIll1I = 3;
                }
            } else {
                --this.var_int_lllllIIll1I;
                if (this.var_int_lllllIIll1I < 0) {
                    this.var_int_lllllIIll1I = 0;
                    this.var_boolean_lllllIIll1I = false;
                }
            }
        }
        if (this.var_boolean_ll11lI11Il1I) {
            GameCanvas.b();
            this.var_boolean_ll11lI11Il1I = false;
            this.var_boolean_lllllIIll1I = true;
        } else if (this.var_int_ll11lI11Il1I == 55) {
            ClanScreen.i = null;
            GameSetting.var_game_GameSetting_a.b_();
            a = null;
            return;
        }
        ++this.var_int_ll11lI11Il1I;
    }
}

