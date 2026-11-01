/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;

import java.util.Vector;

final class ActionListener089
implements IActionListener {
    private final GameCommand llIll111Ill;
    private final GameCommand I1IIII1Il;

    ActionListener089(GameCommand gameCommand, GameCommand gameCommand2) {
        this.llIll111Ill = gameCommand;
        this.I1IIII1Il = gameCommand2;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(this.llIll111Ill);
        vector.addElement(this.I1IIII1Il);
        GameCanvas.var_game_GameHelper10_a.a(vector, 2);
    }
}

