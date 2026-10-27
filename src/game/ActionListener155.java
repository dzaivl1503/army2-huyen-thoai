/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.TerrainMidlet;
import game.UpdateScreen;

final class ActionListener155
implements IActionListener {
    ActionListener155() {
    }

    public final void a() {
        try {
            TerrainMidlet.instance.platformRequest(UpdateScreen.b);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        TerrainMidlet.exit();
    }
}

