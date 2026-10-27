/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ChatEntity;
import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener182
implements IActionListener {
    ActionListener182() {
    }

    public final void a() {
        GameCanvas.b(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().g((byte)ChatEntity.var_int_a);
    }
}

