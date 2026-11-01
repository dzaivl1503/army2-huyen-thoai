/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener212
implements IActionListener {
    private InventoryScreen IllII1lI;

    ActionListener212(InventoryScreen inventoryScreen) {
        this.IllII1lI = inventoryScreen;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, (byte)-1, null, null);
        this.IllII1lI.e();
        GameCanvas.d();
    }
}

