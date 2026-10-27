/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.InventoryScreen;

final class ActionListener058
implements IActionListener {
    private InventoryScreen ll1IIIIl1Il;

    ActionListener058(InventoryScreen inventoryScreen) {
        this.ll1IIIIl1Il = inventoryScreen;
    }

    public final void a() {
        GameCanvas.d();
        this.ll1IIIIl1Il.e();
    }
}

