/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.PlayerEntity;

final class ActionListener009
implements IActionListener {
    ActionListener009() {
    }

    public final void a() {
        int n;
        try {
            n = Integer.parseInt(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
        }
        catch (Exception exception) {
            n = 30;
        }
        PlayerEntity.var_int_q = n;
        GameCanvas.d();
    }
}

