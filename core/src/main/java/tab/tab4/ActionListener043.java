/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener043
implements IActionListener {
    private ActionListener048 llIlI1lII1;

    ActionListener043(ActionListener048 actionListener048) {
        this.llIlI1lII1 = actionListener048;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().i(this.llIlI1lII1.a.var_byte_a);
        GameCanvas.void_a(StringUtils.ci());
    }
}

