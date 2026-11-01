/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener150
implements IActionListener {
    private ProfileScreen l11llll11II;

    ActionListener150(ProfileScreen profileScreen) {
        this.l11llll11II = profileScreen;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().b(((EquipItemEntry)this.l11llll11II.var_java_util_Vector_a.elementAt((int)this.l11llll11II.var_int_a)).var_short_a);
        GameCanvas.void_a(StringUtils.ds());
        ProfileScreen.var_boolean_b = true;
    }
}

