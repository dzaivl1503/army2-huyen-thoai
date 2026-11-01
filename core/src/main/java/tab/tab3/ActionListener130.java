/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


public final class ActionListener130
implements IActionListener {
    public ActionListener130() {
    }

    public final void a() {
        if (GameCanvas.var_game_BaseScreen_a != BattleScreen.var_game_BattleScreen_a || BattleScreen.var_game_BattleScreen_a == null) {
            GameCanvas.b("C\u1ea7n \u1edf trong tr\u1eadn m\u1edbi c\u00e0i \u0111\u01b0\u1ee3c l\u1ef1c b\u1eafn");
            return;
        }
        GameCanvas.var_game_InputScreen_a.a("L\u1ef1c b\u1eafn", new ActionListener005(), new ActionListener164(), 1);
        GameCanvas.var_game_InputScreen_a.a.a(String.valueOf(PlayerEntity.var_int_p));
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

