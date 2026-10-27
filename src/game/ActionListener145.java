/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.MenuScreen;

final class ActionListener145
implements IActionListener {
    private MenuScreen l1Illl1ll;

    ActionListener145(MenuScreen menuScreen) {
        this.l1Illl1ll = menuScreen;
    }

    public final void a() {
        this.l1Illl1ll.e();
        GameCanvas.d();
    }
}

