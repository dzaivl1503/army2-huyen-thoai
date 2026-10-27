/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener077;
import game.GameCanvas;
import game.IActionListener;

final class ActionListener199
implements IActionListener {
    private ActionListener077 I1l11lll;

    ActionListener199(ActionListener077 actionListener077) {
        this.I1l11lll = actionListener077;
    }

    public final void a() {
        this.I1l11lll.a.var_boolean_a = false;
        GameCanvas.d();
    }
}

