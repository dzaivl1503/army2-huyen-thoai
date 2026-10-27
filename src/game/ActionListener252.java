/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameHelper32;
import game.IActionListener;

final class ActionListener252
implements IActionListener {
    private final GameHelper32 llIl11l1;

    private ActionListener252(GameHelper32 gameHelper32) {
        this.llIl11l1 = gameHelper32;
    }

    public final void a() {
        this.llIl11l1.h();
    }

    ActionListener252(GameHelper32 gameHelper32, byte by) {
        this(gameHelper32);
    }
}

