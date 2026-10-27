/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.BattleScreen;
import game.ConnectionWatchdog;
import game.IActionListener;
import game.MenuScreen;

final class ActionListener022
implements IActionListener {
    ActionListener022() {
    }

    public final void a() {
        BattleScreen.var_int_n = 0;
        BattleScreen.var_boolean_f = false;
        ConnectionWatchdog.game_ConnectionWatchdog_a().d((byte)1);
        MenuScreen.var_game_MenuScreen_a.b_();
    }
}

