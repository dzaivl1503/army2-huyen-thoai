/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener132
implements IActionListener {
    private ActionListener217 Ill1lI1Il11l;

    ActionListener132(ActionListener217 actionListener217) {
        this.Ill1lI1Il11l = actionListener217;
    }

    public final void a() {
        GameCanvas.void_a(StringUtils.ds());
        this.Ill1lI1Il11l.a.game_ItemTemplate_a().var_int_c = 0;
        this.Ill1lI1Il11l.a.game_ItemTemplate_a().var_boolean_c = false;
        this.Ill1lI1Il11l.a.var_boolean_a = false;
        int qty = this.Ill1lI1Il11l.a.var_int_a > 0 ? this.Ill1lI1Il11l.a.var_int_a : 1;
        this.Ill1lI1Il11l.a.var_int_a = 1;
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, (byte)1, this.Ill1lI1Il11l.a.game_ItemTemplate_a().var_short_a, qty);
    }
}

