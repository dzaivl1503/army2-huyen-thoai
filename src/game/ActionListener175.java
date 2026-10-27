/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener098;
import game.GameCanvas;
import game.IActionListener;
import game.OptionScreen;
import game.StringUtils;

final class ActionListener175
implements IActionListener {
    final OptionScreen a;

    ActionListener175(OptionScreen optionScreen) {
        this.a = optionScreen;
    }

    public final void a() {
        GameCanvas.b(StringUtils.aA(), new ActionListener098(this));
    }
}

