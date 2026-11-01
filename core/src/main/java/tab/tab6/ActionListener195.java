/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;

import java.util.Vector;

final class ActionListener195
implements IActionListener {
    private ActionListener180 l111lIlII1;

    ActionListener195(ActionListener180 actionListener180) {
        this.l111lIlII1 = actionListener180;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        for (int i = 0; i < this.l111lIlII1.a.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.l111lIlII1.a.var_java_util_Vector_a.elementAt(i);
            if (playerAccountInfo.var_int_a == TerrainMidlet.myInfo.var_int_a || playerAccountInfo.var_int_a == -1) continue;
            vector.addElement(new GameCommand(playerAccountInfo.var_java_lang_String_a, new ActionListener153(playerAccountInfo)));
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

