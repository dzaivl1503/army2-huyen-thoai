/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.DataUtils;
import game.GameCanvas;
import game.IActionListener;

final class ActionListener282
implements IActionListener {
    ActionListener282() {
    }

    public final void a() {
        int n = GameCanvas.var_game_GameHelper49_a.int_a();
        GameCanvas.l = n - 1;
        GameCanvas.a();
        DataUtils.a("speed", GameCanvas.l);
        GameCanvas.d();
    }
}

