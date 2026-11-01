/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener289
implements IActionListener {
    private final ItemManager lllI11Il1;

    private ActionListener289(ItemManager itemManager) {
        this.lllI11Il1 = itemManager;
    }

    public final void a() {
        ItemManager.a(this.lllI11Il1, false);
        ItemManager.game_MarqueeNotice_a(this.lllI11Il1).void_a();
        this.lllI11Il1.c();
    }

    ActionListener289(ItemManager itemManager, byte by) {
        this(itemManager);
    }
}

