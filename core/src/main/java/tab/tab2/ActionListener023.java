/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


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

