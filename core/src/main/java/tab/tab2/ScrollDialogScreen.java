/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab2;

import javax.microedition.lcdui.Graphics;

public class ScrollDialogScreen
extends BaseScreen {
    public int d;
    public int e;
    public int var_int_f;
    public int var_int_g;
    public int var_int_h = 4;
    public String a;
    public boolean c;
    private int Il1IIlIl;

    public final void n() {
        this.var_int_f = (this.var_int_h << 5) + 56;
    }

    public void a(Graphics graphics) {
        this.b.a(graphics);
        graphics.translate(this.var_int_q, 0);
        BaseScreen.a(graphics, this.e, this.var_int_h, this.var_int_g, this.a);
    }

    public final void d(Graphics graphics) {
        super.a(graphics);
    }

    public void c() {
        this.void_a();
        this.b.c();
        if (this.c) {
            this.p = -GameCanvas.var_int_b;
            ++this.Il1IIlIl;
            if (this.Il1IIlIl == 5) {
                this.Il1IIlIl = 0;
                this.c = false;
                GameCanvas.var_game_BaseScreen_a = null;
                this.b.b_();
            }
        }
    }

    public void a(BaseScreen baseScreen) {
        this.b = baseScreen;
        this.var_int_q = -GameCanvas.var_int_b;
        this.p = 0;
        super.b_();
    }
}
