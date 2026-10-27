/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.DailyGiftScreen;
import game.GameHelper07;
import game.IActionListener;

final class ActionListener053
implements IActionListener {
    private DailyGiftScreen l1I1l1l11II;

    ActionListener053(DailyGiftScreen dailyGiftScreen) {
        this.l1I1l1l11II = dailyGiftScreen;
    }

    public final void a() {
        GameHelper07 gameHelper07 = (GameHelper07)this.l1I1l1l11II.var_java_util_Vector_a.elementAt(this.l1I1l1l11II.var_int_a);
        ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)gameHelper07.var_int_b, (byte)2, (byte)this.l1I1l1l11II.var_int_a);
    }
}

