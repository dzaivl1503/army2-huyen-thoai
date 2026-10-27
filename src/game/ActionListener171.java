/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener171
implements IActionListener {
    ActionListener171() {
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().c();
        GameCanvas.b(StringUtils.ds());
    }
}

