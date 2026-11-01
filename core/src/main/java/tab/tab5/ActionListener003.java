/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener003
implements IActionListener {
    private ActionListener097 l1I1I1IIlll;

    ActionListener003(ActionListener097 actionListener097) {
        this.l1I1I1IIlll = actionListener097;
    }

    public final void a() {
        GameCanvas.void_a(StringUtils.ds());
        this.l1I1I1IIlll.a.game_ItemTemplate_a().var_int_c = 0;
        this.l1I1I1IIlll.a.game_ItemTemplate_a().var_boolean_c = false;
        this.l1I1I1IIlll.a.var_boolean_a = false;
        int qty = this.l1I1I1IIlll.a.var_int_a > 0 ? this.l1I1I1IIlll.a.var_int_a : 1;
        this.l1I1I1IIlll.a.var_int_a = 1;
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, (byte)0, this.l1I1I1IIlll.a.game_ItemTemplate_a().var_short_a, qty);
    }
}

