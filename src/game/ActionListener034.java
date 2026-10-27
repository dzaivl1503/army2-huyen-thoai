/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener057;
import game.ActionListener080;
import game.ActionListener181;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener034
implements IActionListener {
    final ActionListener057 a;

    ActionListener034(ActionListener057 actionListener057) {
        this.a = actionListener057;
    }

    public final void a() {
        GameCanvas.var_game_InputScreen_a.a(StringUtils.bC(), new ActionListener181(this), new ActionListener080(), 1);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

