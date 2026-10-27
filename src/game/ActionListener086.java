/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ChatEntity;
import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;
import game.TerrainMidlet;

final class ActionListener086
implements IActionListener {
    ActionListener086() {
    }

    public final void a() {
        if (TerrainMidlet.myInfo.e >= ChatEntity.var_int_arr_b[ChatEntity.var_int_a]) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)(ChatEntity.var_int_a - ChatEntity.var_int_b), (byte)1);
            GameCanvas.c(StringUtils.cn());
            return;
        }
        GameCanvas.void_a(StringUtils.cm());
    }
}

