/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener291
implements IActionListener {
    private final ItemManager lIlI1llIIIl;

    private ActionListener291(ItemManager itemManager) {
        this.lIlI1llIIIl = itemManager;
    }

    public final void a() {
        if (ItemManager.int_a(this.lIlI1llIIIl) == 0) {
            ItemManager.game_MarqueeNotice_a(this.lIlI1llIIIl).a("Vui l\u00f2ng ch\u1ecdn \u0111\u00e1 tr\u01b0\u1edbc khi n\u00e2ng c\u1ea5p!");
            ItemManager.a(this.lIlI1llIIIl, true);
            this.lIlI1llIIIl.c();
            return;
        }
        ItemManager.b(this.lIlI1llIIIl, true);
        this.lIlI1llIIIl.c();
    }

    ActionListener291(ItemManager itemManager, byte by) {
        this(itemManager);
    }
}

