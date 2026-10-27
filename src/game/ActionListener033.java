/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener069;
import game.GameCanvas;
import game.IActionListener;
import game.StringUtils;

final class ActionListener033
implements IActionListener {
    ActionListener033() {
    }

    public final void a() {
        GameCanvas.a(StringUtils.cW(), new ActionListener069());
    }
}

