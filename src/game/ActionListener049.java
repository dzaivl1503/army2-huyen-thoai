/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener113;
import game.ActionListener142;
import game.ActionListener152;
import game.ClanGroupEntry;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener049
implements IActionListener {
    final ActionListener113 a;

    ActionListener049(ActionListener113 actionListener113) {
        this.a = actionListener113;
    }

    public final void a() {
        if (this.a.a.var_int_a >= 0 && this.a.a.var_int_a < this.a.a.var_java_util_Vector_a.size()) {
            if (GameCanvas.k > 0) {
                GameCanvas.void_a(StringUtils.cd());
                return;
            }
            ClanGroupEntry clanGroupEntry = (ClanGroupEntry)this.a.a.var_java_util_Vector_a.elementAt(this.a.a.var_int_a);
            GameCanvas.var_game_InputScreen_a.a(StringUtils.cc() + clanGroupEntry.var_java_lang_String_a + ":", new ActionListener142(this), new ActionListener152(), 0);
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
        }
    }
}

