/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.BaseScreen;
import game.FontRenderer;
import game.GameCanvas;
import game.GameCommand;
import game.GameHelper21;
import javax.microedition.lcdui.Graphics;

public final class GameHelper20
extends GameHelper21 {
    private String[] lllll1l1;

    public final void a(String string, GameCommand gameCommand, GameCommand gameCommand2, GameCommand gameCommand3) {
        this.lllll1l1 = FontRenderer.a.a(string, GameCanvas.var_int_b - 50);
        this.a = gameCommand;
        this.b = gameCommand2;
        this.c = gameCommand3;
    }

    public final void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        int n = 0;
        if (GameCanvas.var_int_c < 200) {
            n += 10;
        }
        int n2 = 0;
        if (this.lllll1l1.length > 3) {
            n2 = this.lllll1l1.length - 3 << 3;
        }
        BaseScreen.a(8, GameCanvas.var_int_c - 112 - n2, GameCanvas.var_int_b - 16, 69 + (n2 << 1), graphics);
        n += GameCanvas.var_int_c - 20 - 50 - (this.lllll1l1.length * FontRenderer.a.a() >> 1);
        n2 = 0;
        while (n2 < this.lllll1l1.length) {
            FontRenderer.a.a(graphics, this.lllll1l1[n2], GameCanvas.var_int_d, n - 10, 2);
            ++n2;
            n += FontRenderer.a.a();
        }
        super.a(graphics);
    }
}

