/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.PlayerAccountInfo;
import game.StringUtils;

final class ActionListener023
implements IActionListener {
    private final PlayerAccountInfo II1IllIl1l11;

    ActionListener023(PlayerAccountInfo playerAccountInfo) {
        this.II1IllIl1l11 = playerAccountInfo;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().g(this.II1IllIl1l11.var_int_a);
        GameCanvas.b(StringUtils.ds());
    }
}

