/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


public final class ActionListener267
implements IActionListener {
    private InventoryScreen IIll11l1lI;

    public ActionListener267(InventoryScreen inventoryScreen) {
        this.IIll11l1lI = inventoryScreen;
    }

    public final void a() {
        ItemTemplate itemTemplate = this.IIll11l1lI.game_ItemTemplate_a();
        if (itemTemplate != null && !itemTemplate.var_boolean_d) {
            ItemManager.a.void_b(itemTemplate);
            GameCanvas.var_game_GameHelper21_a = ItemManager.a;
        }
    }
}

