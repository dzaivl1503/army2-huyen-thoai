/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;

import java.util.Vector;

final class ActionListener044
implements IActionListener {
    ActionListener044() {
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand("4 vs 4", new ActionListener084()));
        vector.addElement(new GameCommand("3 vs 3", new ActionListener192()));
        vector.addElement(new GameCommand("2 vs 2", new ActionListener128()));
        vector.addElement(new GameCommand("1 vs 1", new ActionListener016()));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

