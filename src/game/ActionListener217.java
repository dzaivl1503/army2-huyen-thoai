/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener132;
import game.DataUtils;
import game.GameCanvas;
import game.GameHelper48;
import game.IActionListener;
import game.StringUtils;

final class ActionListener217
implements IActionListener {
    final GameHelper48 a;

    ActionListener217(GameHelper48 gameHelper48) {
        this.a = gameHelper48;
    }

    public final void a() {
        String string = this.a.game_ItemTemplate_a().var_boolean_b ? StringUtils.t() + DataUtils.a((long)(this.a.var_game_ItemTemplate_a.var_int_f * this.a.var_int_a)) + " " + StringUtils.ar() : StringUtils.t() + DataUtils.a((long)this.a.var_game_ItemTemplate_a.var_int_f) + " " + StringUtils.ar();
        GameCanvas.b(string, new ActionListener132(this));
    }
}

