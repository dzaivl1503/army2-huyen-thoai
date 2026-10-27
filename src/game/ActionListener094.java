/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener157;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;
import game.TerrainMidlet;

final class ActionListener094
implements IActionListener {
    ActionListener094() {
    }

    public final void a() {
        GameCanvas.b(StringUtils.co() + TerrainMidlet.myInfo.var_long_c + StringUtils.aq(), new ActionListener157());
    }
}

