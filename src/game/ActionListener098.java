/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener175;
import game.ConnectionWatchdog;
import game.IActionListener;

final class ActionListener098
implements IActionListener {
    private ActionListener175 I11IIl11;

    ActionListener098(ActionListener175 actionListener175) {
        this.I11IIl11 = actionListener175;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().c((byte)1, (byte)1, this.I11IIl11.a.game_PlayerSlot_a().var_byte_a);
    }
}

