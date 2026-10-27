/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.ItemManager;

final class ActionListener284
implements IActionListener {
    private final ItemManager Illl111IlIl;

    private ActionListener284(ItemManager itemManager) {
        this.Illl111IlIl = itemManager;
    }

    public final void a() {
        ItemManager.b(this.Illl111IlIl, false);
        ItemManager.game_MarqueeNotice_b(this.Illl111IlIl).void_a();
        this.Illl111IlIl.c();
    }

    ActionListener284(ItemManager itemManager, byte by) {
        this(itemManager);
    }
}

