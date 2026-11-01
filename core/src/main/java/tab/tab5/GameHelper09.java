/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper09 {
    private int lllll1ll1I;
    public int var_int_a;
    public static Image var_javax_microedition_lcdui_Image_a;
    private GameHelper29 var_game_GameHelper29_ll1l1lI11I;
    private int Ill1Il1l;
    private int[] var_int_arr_ll1l1lI11I;
    private int IIll1l11I = 20;

    public GameHelper09(int n) {
        this.lllll1ll1I = n - 10;
        this.var_int_a = 3;
        this.Ill1Il1l = GameCanvas.var_int_c / this.IIll1l11I + 2;
        this.var_int_arr_ll1l1lI11I = new int[this.Ill1Il1l];
        this.var_game_GameHelper29_ll1l1lI11I = new GameHelper29(var_javax_microedition_lcdui_Image_a, 40, 32);
        for (n = 0; n < this.Ill1Il1l; ++n) {
            this.var_int_arr_ll1l1lI11I[n] = n % 3;
        }
    }

    public final void a(Graphics graphics) {
        if (this.var_game_GameHelper29_ll1l1lI11I != null) {
            for (int i = 0; i < this.Ill1Il1l; ++i) {
                this.var_game_GameHelper29_ll1l1lI11I.a(this.var_int_arr_ll1l1lI11I[i], this.lllll1ll1I, GameCanvas.var_int_c + GameHelper16.c - i * this.IIll1l11I, 0, 3, graphics);
            }
        }
    }

    public final void a() {
        if (this.var_int_a < 0) {
            CharacterSelectScreen.var_java_util_Vector_b.removeElement(this);
        }
        if (GameCanvas.var_int_a % 2 == 0) {
            for (int i = 0; i < this.Ill1Il1l; ++i) {
                int n = i;
                this.var_int_arr_ll1l1lI11I[n] = this.var_int_arr_ll1l1lI11I[n] + 1;
                if (this.var_int_arr_ll1l1lI11I[i] <= 2) continue;
                this.var_int_arr_ll1l1lI11I[i] = 0;
            }
        }
    }
}

