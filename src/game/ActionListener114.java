/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener076;
import game.ActionListener116;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener114
implements IActionListener {
    ActionListener114() {
    }

    public final void a() {
        GameCanvas.var_game_InputScreen_a.a(StringUtils.java_lang_String_b(), new ActionListener116(), new ActionListener076(), 1);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

