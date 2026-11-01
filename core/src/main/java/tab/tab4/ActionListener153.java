/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener153
implements IActionListener {
    private final PlayerAccountInfo lI11l1Il1lll;

    ActionListener153(PlayerAccountInfo playerAccountInfo) {
        this.lI11l1Il1lll = playerAccountInfo;
    }

    public final void a() {
        if (this.lI11l1Il1lll.var_boolean_b) {
            GameCanvas.void_a(StringUtils.bG());
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().b(this.lI11l1Il1lll.var_int_a);
    }
}

