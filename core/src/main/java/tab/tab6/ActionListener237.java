/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener237
implements IActionListener {
    private ActionListener234 l1Ill1I1lI;

    ActionListener237(ActionListener234 actionListener234) {
        this.l1Ill1I1lI = actionListener234;
    }

    public final void a() {
        GameCanvas.b(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().b(this.l1Ill1I1lI.a.var_int_arr_a);
    }
}

