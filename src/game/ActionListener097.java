/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener003;
import game.GameCanvas;
import game.GameHelper48;
import game.IActionListener;
import game.StringUtils;

final class ActionListener097
implements IActionListener {
    final GameHelper48 a;

    ActionListener097(GameHelper48 gameHelper48) {
        this.a = gameHelper48;
    }

    public final void a() {
        String string = this.a.game_ItemTemplate_a().var_boolean_b ? StringUtils.t() + this.a.var_game_ItemTemplate_a.var_int_e * this.a.var_int_a + " " + StringUtils.aq() : StringUtils.t() + this.a.var_game_ItemTemplate_a.var_int_e + " " + StringUtils.aq();
        GameCanvas.b(string, new ActionListener003(this));
    }
}

