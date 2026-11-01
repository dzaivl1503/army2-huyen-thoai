/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener211
implements IActionListener {
    private BattleScreen Illll111l1;

    ActionListener211(BattleScreen battleScreen) {
        this.Illll111l1 = battleScreen;
    }

    public final void a() {
        BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_int_i = BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_int_g;
        BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_int_j = BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_int_h;
        BattleScreen.var_game_TurnTimer_a.b();
        BattleScreen battleScreen = this.Illll111l1;
        BattleScreen.a(battleScreen, BattleScreen.int_a(battleScreen) - 1);
    }
}

