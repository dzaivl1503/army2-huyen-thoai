/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener236
implements IActionListener {
    private ActionListener232 IIl11l1lI;

    ActionListener236(ActionListener232 actionListener232) {
        this.IIl11l1lI = actionListener232;
    }

    public final void a() {
        GameCanvas.void_a(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().d((byte)0, this.IIl11l1lI.a.game_ItemTemplate_a().var_int_a);
    }
}

