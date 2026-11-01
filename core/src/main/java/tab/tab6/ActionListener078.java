/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;

import java.util.Vector;

final class ActionListener078
implements IActionListener {
    private final GameCommand IlI11I1l;
    private final GameCommand II11IIlIlI;

    ActionListener078(GameCommand gameCommand, GameCommand gameCommand2) {
        this.IlI11I1l = gameCommand;
        this.II11IIlIlI = gameCommand2;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(this.IlI11I1l);
        vector.addElement(this.II11IIlIlI);
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

