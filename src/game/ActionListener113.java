/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener049;
import game.ActionListener105;
import game.ClanGroupEntry;
import game.GameCanvas;
import game.GameCommand;
import game.GameHelper13;
import game.IActionListener;
import game.StringUtils;

final class ActionListener113
implements IActionListener {
    final GameHelper13 a;

    ActionListener113(GameHelper13 gameHelper13) {
        this.a = gameHelper13;
    }

    public final void a() {
        if (this.a.var_int_a >= 0 && this.a.var_int_a < this.a.var_java_util_Vector_a.size()) {
            ClanGroupEntry clanGroupEntry = (ClanGroupEntry)this.a.var_java_util_Vector_a.elementAt(this.a.var_int_a);
            ActionListener049 actionListener049 = new ActionListener049(this);
            GameCanvas.var_game_GameHelper20_a.a(clanGroupEntry.b, new GameCommand(StringUtils.cF(), actionListener049), new GameCommand("", actionListener049), new GameCommand(StringUtils.dI(), new ActionListener105()));
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_GameHelper20_a;
        }
    }
}

