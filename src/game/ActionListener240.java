/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.EquipScreen;
import game.IActionListener;
import game.MenuScreen;

final class ActionListener240
implements IActionListener {
    public final void a() {
        if (EquipScreen.var_game_EquipScreen_a != null) {
            EquipScreen.var_game_EquipScreen_a.c = false;
            EquipScreen.var_game_EquipScreen_a.a(MenuScreen.var_game_MenuScreen_a);
        }
    }
}

