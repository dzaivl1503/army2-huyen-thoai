/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener121;
import game.ActionListener163;
import game.BattleManager;
import game.BattleScreen;
import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener257
implements IActionListener {
    ActionListener257() {
    }

    public final void a() {
        if (BattleScreen.var_boolean_f) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().d((byte)1);
            BattleScreen.var_boolean_f = false;
            return;
        }
        if (BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_byte_f == 5) {
            GameCanvas.b(StringUtils.ba(), new ActionListener163());
            return;
        }
        GameCanvas.b(StringUtils.aZ(), new ActionListener121());
    }
}

