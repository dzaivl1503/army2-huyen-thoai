/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener077;
import game.GameCanvas;
import game.IActionListener;

final class ActionListener166
implements IActionListener {
    private ActionListener077 I11IIIlI;

    ActionListener166(ActionListener077 actionListener077) {
        this.I11IIIlI = actionListener077;
    }

    public final void a() {
        this.I11IIIlI.a.var_boolean_a = true;
        GameCanvas.d();
        this.I11IIIlI.a.g.var_game_IActionListener_a.a();
    }
}

