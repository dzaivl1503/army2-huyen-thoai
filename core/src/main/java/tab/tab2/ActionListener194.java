/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener194
implements IActionListener {
    private InventoryScreen II1lIlII;

    ActionListener194(InventoryScreen inventoryScreen) {
        this.II1lIlII = inventoryScreen;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)2, null, (short)-1, (byte)-1);
        GameCanvas.c(StringUtils.ds());
        this.II1lIlII.var_int_b = 0;
        this.II1lIlII.var_int_a = 0;
    }
}

