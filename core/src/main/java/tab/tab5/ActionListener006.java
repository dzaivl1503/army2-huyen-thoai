/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;

import java.util.Vector;

final class ActionListener006
implements IActionListener {
    private GameHelper33 l11IIlII;

    ActionListener006(GameHelper33 gameHelper33) {
        this.l11IIlII = gameHelper33;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        if (this.l11IIlII.var_int_c == 2) {
            if (this.l11IIlII.var_int_a >= 0 && this.l11IIlII.var_int_a < this.l11IIlII.var_java_util_Vector_a.size()) {
                if (this.l11IIlII.b == BoardScreen.var_game_BoardScreen_a) {
                    vector.addElement(this.l11IIlII.e);
                }
                vector.addElement(this.l11IIlII.var_game_GameCommand_b);
            }
            vector.addElement(this.l11IIlII.var_game_GameCommand_a);
        } else {
            vector.addElement(this.l11IIlII.var_game_GameCommand_c);
            vector.addElement(this.l11IIlII.d);
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

