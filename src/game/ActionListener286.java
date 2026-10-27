/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.ItemManager;

final class ActionListener286
implements IActionListener {
    private ActionListener286(ItemManager itemManager) {
    }

    public final void a() {
        GameCanvas.d();
    }

    ActionListener286(ItemManager itemManager, byte by) {
        this(itemManager);
    }
}

