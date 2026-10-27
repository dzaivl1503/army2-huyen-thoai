/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener020
implements IActionListener {
    ActionListener020() {
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().c();
        GameCanvas.b(StringUtils.ds());
    }
}

