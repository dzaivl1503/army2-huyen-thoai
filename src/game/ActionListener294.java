/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener232;
import game.EquipScreen;
import game.GameCanvas;
import game.IActionListener;
import game.InventoryScreen;
import game.MenuScreen;
import game.StringUtils;

final class ActionListener294
implements IActionListener {
    private ActionListener232 l1ll11l1I1l1;

    ActionListener294(ActionListener232 actionListener232) {
        this.l1ll11l1I1l1 = actionListener232;
    }

    public final void a() {
        if (EquipScreen.var_java_util_Vector_a.size() == 0) {
            GameCanvas.void_a(StringUtils.Q());
            return;
        }
        this.l1ll11l1I1l1.a.c = true;
        InventoryScreen.var_game_InventoryScreen_a.a(MenuScreen.var_game_MenuScreen_a);
    }
}

