/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener086;
import game.DataUtils;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;
import game.TerrainMidlet;

final class ActionListener158
implements IActionListener {
    ActionListener158() {
    }

    public final void a() {
        GameCanvas.b(StringUtils.co() + DataUtils.a((long)TerrainMidlet.myInfo.e) + " " + StringUtils.ar(), new ActionListener086());
    }
}

