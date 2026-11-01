/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;

import java.util.Vector;

final class ActionListener187
implements IActionListener {
    private final GameCommand lIIlIlIIll1;
    private final GameCommand Il1IIIl1l;

    ActionListener187(GameCommand gameCommand, GameCommand gameCommand2) {
        this.lIIlIlIIll1 = gameCommand;
        this.Il1IIIl1l = gameCommand2;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(this.lIIlIlIIll1);
        vector.addElement(this.Il1IIIl1l);
        GameCanvas.var_game_GameHelper10_a.a(vector, 2);
    }
}

