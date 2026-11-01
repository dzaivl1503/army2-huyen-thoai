/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener288
implements IActionListener {
    private final ItemManager l1Illl1III;

    private ActionListener288(ItemManager itemManager) {
        this.l1Illl1III = itemManager;
    }

    public final void a() {
        if (this.l1Illl1III.var_game_ItemTemplate_a != null && ItemManager.int_a(this.l1Illl1III) > 0) {
            int n = ItemManager.int_b(this.l1Illl1III);
            if (n > 0 && TerrainMidlet.myInfo.var_long_c < (long)n) {
                ItemManager.b(this.l1Illl1III, false);
                ItemManager.game_MarqueeNotice_b(this.l1Illl1III).void_a();
                ItemManager.game_MarqueeNotice_a(this.l1Illl1III).a("Kh\u00f4ng \u0111\u1ee7 xu!");
                ItemManager.a(this.l1Illl1III, true);
                this.l1Illl1III.c();
                return;
            }
            ItemManager.game_MarqueeNotice_b(this.l1Illl1III).void_a();
            ItemManager.b(this.l1Illl1III, false);
            n = ItemManager.c(this.l1Illl1III);
            int[] nArray = new int[n];
            int[] nArray2 = new int[n];
            int n2 = 0;
            for (int i = 0; i < this.l1Illl1III.var_java_util_Vector_b.size(); ++i) {
                GameHelper45 gameHelper45 = (GameHelper45)this.l1Illl1III.var_java_util_Vector_b.elementAt(i);
                if (!ItemManager.a(this.l1Illl1III, gameHelper45.var_game_ItemTemplate_a)) continue;
                nArray[n2] = gameHelper45.var_game_ItemTemplate_a.var_short_a;
                nArray2[n2] = gameHelper45.var_int_a;
                ++n2;
            }
            ItemTemplate itemTemplate = ItemManager.game_ItemTemplate_a(this.l1Illl1III);
            int n3 = itemTemplate != null ? (int)itemTemplate.var_short_a : -1;
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.l1Illl1III.var_game_ItemTemplate_a.var_int_a, nArray, nArray2, n3);
            this.l1Illl1III.l();
        }
    }

    ActionListener288(ItemManager itemManager, byte by) {
        this(itemManager);
    }
}

