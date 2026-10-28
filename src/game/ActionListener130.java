/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener005;
import game.ActionListener164;
import game.GameCanvas;
import game.IActionListener;
import game.PlayerEntity;

public final class ActionListener130
implements IActionListener {
    public ActionListener130() {
    }

    public final void a() {
        GameCanvas.var_game_InputScreen_a.a("L\u1ef1c b\u1eafn", new ActionListener005(), new ActionListener164(), 1);
        GameCanvas.var_game_InputScreen_a.a.a(String.valueOf(PlayerEntity.var_int_p));
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

