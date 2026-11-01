/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener056
implements IActionListener {
    private ActionListener073 Il1l111ll;

    ActionListener056(ActionListener073 actionListener073) {
        this.Il1l111ll = actionListener073;
    }

    public final void a() {
        GameCanvas.void_a(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)0, null, (short)this.Il1l111ll.a.game_ItemTemplate_a().var_int_d, (byte)1);
    }
}

