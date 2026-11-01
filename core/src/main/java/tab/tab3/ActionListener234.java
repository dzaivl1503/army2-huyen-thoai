/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener234
implements IActionListener {
    final EquipScreen a;

    ActionListener234(EquipScreen equipScreen) {
        this.a = equipScreen;
    }

    public final void a() {
        for (int i = 0; i < this.a.var_short_arr_a.length; ++i) {
            if (this.a.var_int_arr_a[i] == this.a.var_short_arr_a[i]) continue;
            GameCanvas.a(StringUtils.N(), new ActionListener237(this), new ActionListener233(this));
            return;
        }
        this.a.e();
    }
}

