/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.InventoryScreen;

final class ActionListener263
implements IActionListener {
    private InventoryScreen lIlIIlllIIl1;

    ActionListener263(InventoryScreen inventoryScreen) {
        this.lIlIIlllIIl1 = inventoryScreen;
    }

    public final void a() {
        GameCanvas.d();
        this.lIlIIlllIIl1.var_int_b = 0;
    }
}

