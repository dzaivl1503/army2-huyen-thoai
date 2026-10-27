/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.GameHelper32;
import game.IActionListener;

final class ActionListener251
implements IActionListener {
    private final GameHelper32 ll11Il1I;

    private ActionListener251(GameHelper32 gameHelper32) {
        this.ll11Il1I = gameHelper32;
    }

    public final void a() {
        GameCanvas.d();
    }

    ActionListener251(GameHelper32 gameHelper32, byte by) {
        this(gameHelper32);
    }
}

