/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.BoardScreen;
import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;
import game.TerrainMidlet;

final class ActionListener096
implements IActionListener {
    private BoardScreen IlIIII11;

    ActionListener096(BoardScreen boardScreen) {
        this.IlIIII11 = boardScreen;
    }

    public final void a() {
        if ((long)BoardScreen.int_d(this.IlIIII11) > TerrainMidlet.myInfo.var_long_c) {
            GameCanvas.void_a(StringUtils.by());
        }
        GameCanvas.b(StringUtils.bw());
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.IlIIII11.var_int_arr_a);
        ConnectionWatchdog.game_ConnectionWatchdog_a().e();
    }
}

