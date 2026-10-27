/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener205
implements IActionListener {
    ActionListener205() {
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().i();
        GameCanvas.b(StringUtils.ds());
    }
}

