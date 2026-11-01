/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener300
implements IActionListener {
    private ActionListener048 lIIl1l1l1I1l;

    ActionListener300(ActionListener048 actionListener048) {
        this.lIIl1l1l1I1l = actionListener048;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().i((byte)(this.lIIl1l1l1I1l.a.var_byte_a + 1));
        GameCanvas.void_a(StringUtils.ci());
    }
}

