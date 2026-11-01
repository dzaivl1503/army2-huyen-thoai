/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener241
implements IActionListener {
    private GameHelper25 llIlIl11l;

    public ActionListener241(GameHelper25 gameHelper25) {
        this.llIlIl11l = gameHelper25;
    }

    public final void a() {
        if (GameHelper25.game_ShopItemEntry_arr_a(this.llIlIl11l) != null && GameHelper25.int_a(this.llIlIl11l) < GameHelper25.game_ShopItemEntry_arr_a(this.llIlIl11l).length) {
            ShopItemEntry shopItemEntry = GameHelper25.game_ShopItemEntry_arr_a(this.llIlIl11l)[GameHelper25.int_a(this.llIlIl11l)];
            GameHelper27 gameHelper27 = GameHelper27.a;
            gameHelper27.a(shopItemEntry);
            GameCanvas.var_game_GameHelper21_a = gameHelper27;
        }
    }
}

