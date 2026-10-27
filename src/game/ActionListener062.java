/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.MenuScreen;

final class ActionListener062
implements IActionListener {
    ActionListener062() {
    }

    public final void a() {
        if (GameCanvas.var_game_BaseScreen_a.j) {
            MenuScreen.var_game_MenuScreen_a.e();
        }
        GameCanvas.var_game_GameHelper21_a = null;
    }
}

