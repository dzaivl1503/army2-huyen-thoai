/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.GameHelper24;
import game.GameHelper25;
import game.IActionListener;

final class ActionListener242
implements IActionListener {
    private GameHelper25 llI11ll11I;

    public ActionListener242(GameHelper25 gameHelper25) {
        this.llI11ll11I = gameHelper25;
    }

    public final void a() {
        if (GameHelper25.game_ShopItemEntry_arr_a(this.llI11ll11I) != null && GameHelper25.int_a(this.llI11ll11I) < GameHelper25.game_ShopItemEntry_arr_a(this.llI11ll11I).length && GameHelper25.game_EquipUpgradeEntry_arr_a(this.llI11ll11I) != null && GameHelper25.int_a(this.llI11ll11I) < GameHelper25.game_EquipUpgradeEntry_arr_a(this.llI11ll11I).length) {
            GameHelper24 gameHelper24 = new GameHelper24();
            gameHelper24.a(GameHelper25.game_EquipUpgradeEntry_arr_a(this.llI11ll11I)[GameHelper25.int_a(this.llI11ll11I)]);
            GameCanvas.var_game_GameHelper21_a = gameHelper24;
        }
    }
}

