/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener214
implements IActionListener {
    private BoardScreen II1l1III;

    ActionListener214(BoardScreen boardScreen) {
        this.II1l1III = boardScreen;
    }

    public final void a() {
        new StringBuffer("[jm] TOI DAY item select= ").append(this.II1l1III.var_int_arr_a[BoardScreen.int_e(this.II1l1III)]);
        if (this.II1l1III.var_int_arr_a[BoardScreen.int_e(this.II1l1III)] == -1) {
            GameCanvas.void_a(StringUtils.aQ());
            return;
        }
        ExplosionEffect.void_a(this.II1l1III.var_int_arr_a);
        GameHelper31 gameHelper31 = ExplosionEffect.a(BoardScreen.var_game_GameHelper11_a.a);
        new StringBuffer("[jm] curr Type= ").append(gameHelper31.var_byte_a).append(" isPassive= ").append(gameHelper31.var_boolean_a);
        if (BoardScreen.boolean_a(this.II1l1III) && !gameHelper31.var_boolean_a) {
            if (gameHelper31.g <= 0 && !gameHelper31.var_boolean_b) {
                GameCanvas.void_a(StringUtils.aN());
                return;
            }
            if (gameHelper31.var_byte_c < gameHelper31.f) {
                this.II1l1III.var_int_arr_a[BoardScreen.int_e((BoardScreen)this.II1l1III)] = gameHelper31.var_byte_a;
                new StringBuffer("[jm] item curr= ").append(this.II1l1III.var_int_arr_a[BoardScreen.int_e(this.II1l1III)]);
                BoardScreen.a(this.II1l1III, false);
                return;
            }
            GameCanvas.void_a(StringUtils.aP() + gameHelper31.f + StringUtils.aO());
            return;
        }
        BoardScreen.a(this.II1l1III, true);
    }
}

