/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener202
implements IActionListener {
    private ActionListener066 I1l1lIll;

    ActionListener202(ActionListener066 actionListener066) {
        this.I1l1lIll = actionListener066;
    }

    public final void a() {
        GameCanvas.void_a(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)0, null, (short)this.I1l1lIll.a.game_ItemTemplate_a().var_int_d, (byte)0);
    }
}

