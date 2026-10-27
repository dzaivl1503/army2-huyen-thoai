/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener036;
import game.ActionListener111;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener159
implements IActionListener {
    ActionListener159() {
    }

    public final void a() {
        GameCanvas.var_game_InputScreen_a.a(StringUtils.df(), new ActionListener111(), new ActionListener036(), 0);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

