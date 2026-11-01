/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener117
implements IActionListener {
    private GameHelper33 l11l1llI11I;

    ActionListener117(GameHelper33 gameHelper33) {
        this.l11l1llI11I = gameHelper33;
    }

    public final void a() {
        this.l11l1llI11I.var_boolean_a = false;
        if (this.l11l1llI11I.var_int_c <= 0) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)(-this.l11l1llI11I.var_int_c), this.l11l1llI11I.var_int_b);
            return;
        }
        if (this.l11l1llI11I.var_int_c == 3) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(true, -1);
            GameCanvas.b(StringUtils.ci());
            return;
        }
        if (this.l11l1llI11I.var_int_c == 5) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)this.l11l1llI11I.var_int_b, ProfileScreen.var_game_ProfileScreen_b.var_game_EquipItemEntry_a.var_short_a);
            GameCanvas.b(StringUtils.ci());
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().c(this.l11l1llI11I.var_int_b);
        GameCanvas.b(StringUtils.ci());
    }
}

