/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;

import java.util.Vector;

final class ActionListener057
implements IActionListener {
    final ActionListener180 a;

    ActionListener057(ActionListener180 actionListener180) {
        this.a = actionListener180;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand(StringUtils.dh(), new ActionListener034(this)));
        vector.addElement(new GameCommand(StringUtils.di(), new ActionListener200()));
        vector.addElement(new GameCommand(StringUtils.dg(), new ActionListener044()));
        vector.addElement(new GameCommand(StringUtils.df(), new ActionListener159()));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

