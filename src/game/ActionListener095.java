/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.IActionListener;
import game.MissionScreen;
import game.StringUtils;

final class ActionListener095
implements IActionListener {
    private MissionScreen IlllIIl1;

    ActionListener095(MissionScreen missionScreen) {
        this.IlllIIl1 = missionScreen;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().c((byte)1, (byte)this.IlllIIl1.game_GameHelper23_a().var_int_a);
        GameCanvas.void_a(StringUtils.ds());
    }
}

