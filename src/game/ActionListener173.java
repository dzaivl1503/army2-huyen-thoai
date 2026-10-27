/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.DailyGiftScreen;
import game.IActionListener;

final class ActionListener173
implements IActionListener {
    ActionListener173() {
    }

    public final void a() {
        if (GameCanvas.var_game_BaseScreen_a == DailyGiftScreen.var_game_DailyGiftScreen_a) {
            if (DailyGiftScreen.var_game_DailyGiftScreen_a.var_game_BaseScreen_a != null) {
                DailyGiftScreen.var_game_DailyGiftScreen_a.var_game_BaseScreen_a.b_();
            }
        } else if (DailyGiftScreen.var_game_DailyGiftScreen_a != null && DailyGiftScreen.var_game_DailyGiftScreen_a.var_game_BaseScreen_a != null) {
            DailyGiftScreen.var_game_DailyGiftScreen_a.var_game_BaseScreen_a.b_();
        } else if (GameCanvas.var_game_BaseScreen_a != null) {
            GameCanvas.var_game_BaseScreen_a.b_();
        }
    }
}

