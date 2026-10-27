/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.IActionListener;

final class ActionListener193
implements IActionListener {
    private final int lIII111lII1;

    ActionListener193(int n) {
        this.lIII111lII1 = n;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().d((byte)1, this.lIII111lII1);
    }
}

