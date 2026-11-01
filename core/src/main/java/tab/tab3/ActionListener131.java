/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener131
implements IActionListener {
    private ActionListener108 III11IIl1Il;

    ActionListener131(ActionListener108 actionListener108) {
        this.III11IIl1Il = actionListener108;
    }

    public final void a() {
        ClanGroupEntry clanGroupEntry = (ClanGroupEntry)this.III11IIl1Il.a.var_java_util_Vector_a.elementAt(this.III11IIl1Il.a.var_int_a);
        if (this.III11IIl1Il.a.var_int_a >= 0 && this.III11IIl1Il.a.var_int_a < this.III11IIl1Il.a.var_java_util_Vector_a.size() && clanGroupEntry.var_int_a != TerrainMidlet.myInfo.var_int_a) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().d(clanGroupEntry.var_int_a);
            GameCanvas.b(StringUtils.aW() + "...");
        }
    }
}

