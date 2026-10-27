/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener124;
import game.ActionListener167;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener200
implements IActionListener {
    ActionListener200() {
    }

    public final void a() {
        GameCanvas.var_game_InputScreen_a.a(StringUtils.di(), new ActionListener167(), new ActionListener124(), 3);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

