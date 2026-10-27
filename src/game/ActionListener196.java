/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
import game.IActionListener;
import game.TerrainMidlet;

final class ActionListener196
implements IActionListener {
    private final String llIl1l1lI;

    ActionListener196(String string) {
        this.llIl1l1lI = string;
    }

    public final void a() {
        GameCanvas.d();
        try {
            TerrainMidlet.instance.platformRequest(this.llIl1l1lI);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

