/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener143
implements IActionListener {
    private UpgradeScreen IIlI1l11;

    ActionListener143(UpgradeScreen upgradeScreen) {
        this.IIlI1l11 = upgradeScreen;
    }

    public final void a() {
        new StringBuffer("[ho] gift thu ").append(this.IIlI1l11.var_int_b).append(" = ").append(this.IIlI1l11.var_int_arr_a[this.IIlI1l11.var_int_b]);
        this.IIlI1l11.var_boolean_b = true;
        if (this.IIlI1l11.c == 0) {
            if (this.IIlI1l11.var_int_arr_a[this.IIlI1l11.var_int_b] != -1) {
                this.IIlI1l11.var_int_arr_a[this.IIlI1l11.var_int_b] = -1;
                this.IIlI1l11.var_game_ChestBox_arr_a[this.IIlI1l11.var_int_b] = new ChestBox();
                this.IIlI1l11.var_game_ChestBox_arr_a[this.IIlI1l11.var_int_b].var_boolean_a = true;
                ConnectionWatchdog.game_ConnectionWatchdog_a().k((byte)this.IIlI1l11.var_int_b);
            }
            ++this.IIlI1l11.var_int_a;
        }
    }
}

