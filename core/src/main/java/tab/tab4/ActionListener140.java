/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener140
implements IActionListener {
    private BoardScreen l1IlIl1l1;

    ActionListener140(BoardScreen boardScreen) {
        this.l1IlIl1l1 = boardScreen;
    }

    public final void a() {
        if (this.l1IlIl1l1.var_int_a == 0) {
            PlayerAccountInfo myAcc = this.l1IlIl1l1.getMyAccountInfo();
            boolean bl = myAcc == null || !myAcc.var_boolean_b;
            if (bl) {
                if (TerrainMidlet.myInfo.var_long_c < (long)BoardScreen.int_d(this.l1IlIl1l1)) {
                    GameCanvas.void_a(StringUtils.bF());
                    return;
                }
                this.l1IlIl1l1.var_int_a = 30;
            }
            GameCanvas.b(StringUtils.bE());
            if (bl) {
                ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.l1IlIl1l1.var_int_arr_a);
            }
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(bl);
        }
    }
}

