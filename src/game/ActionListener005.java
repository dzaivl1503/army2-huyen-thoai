/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener009;
import game.ActionListener129;
import game.BattleManager;
import game.BattleScreen;
import game.GameCanvas;
import game.IActionListener;
import game.PlayerEntity;

final class ActionListener005
implements IActionListener {
    ActionListener005() {
    }

    public final void a() {
        int n;
        try {
            n = Integer.parseInt(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
        }
        catch (Exception exception) {
            n = 30;
        }
        if (n <= 0) {
            n = 1;
        }
        if (n > 100) {
            n = 100;
        }
        PlayerEntity.var_int_p = n;
        PlayerEntity.isPullingForce = false;
        PlayerEntity.fireCooldown = 25;
        if (GameCanvas.var_game_BaseScreen_a != BattleScreen.var_game_BattleScreen_a || BattleScreen.var_game_BattleScreen_a == null || BattleManager.var_game_PlayerEntity_arr_a == null || BattleScreen.var_byte_b < 0 || BattleScreen.var_byte_b >= BattleManager.var_game_PlayerEntity_arr_a.length || BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b] == null) {
            BaseScreen.m();
            GameCanvas.d();
            return;
        }
        PlayerEntity playerEntity = BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b];
        if (playerEntity.var_byte_c != 6 && playerEntity.var_byte_c != 8) {
            BaseScreen.m();
            GameCanvas.d();
            return;
        }
        GameCanvas.var_game_InputScreen_a.a("L\u1ef1c b\u1eafn 2", new ActionListener009(), new ActionListener129(), 1);
        GameCanvas.var_game_InputScreen_a.a.a(String.valueOf(PlayerEntity.var_int_q));
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

