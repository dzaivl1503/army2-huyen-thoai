/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener088
implements IActionListener {
    ActionListener088() {
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(true, -1);
        GameCanvas.void_a(StringUtils.ds());
    }
}

