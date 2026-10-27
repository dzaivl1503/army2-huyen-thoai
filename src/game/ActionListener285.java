/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.ItemManager;

final class ActionListener285
implements IActionListener {
    private final ItemManager I1l1l1lIlll;

    private ActionListener285(ItemManager itemManager) {
        this.I1l1l1lIlll = itemManager;
    }

    public final void a() {
        this.I1l1l1lIlll.i();
    }

    ActionListener285(ItemManager itemManager, byte by) {
        this(itemManager);
    }
}

