/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener248;
import game.GameCanvas;
import game.IActionListener;
import game.OptionScreen;
import game.StringUtils;

final class ActionListener224
implements IActionListener {
    final OptionScreen a;

    ActionListener224(OptionScreen optionScreen) {
        this.a = optionScreen;
    }

    public final void a() {
        GameCanvas.b(StringUtils.aA(), new ActionListener248(this));
    }
}

