/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;

import java.util.Vector;

final class ActionListener085
implements IActionListener {
    private ActionListener180 lIII1l1lII;

    ActionListener085(ActionListener180 actionListener180) {
        this.lIII1l1lII = actionListener180;
    }

    public final void a() {
        BoardScreen boardScreen = this.lIII1l1lII.a;
        Vector<GameCommand> vector = new Vector<GameCommand>();
        for (int i = 0; i < boardScreen.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)boardScreen.var_java_util_Vector_a.elementAt(i);
            if (playerAccountInfo.var_int_a == TerrainMidlet.myInfo.var_int_a || playerAccountInfo.var_int_a == -1) continue;
            vector.addElement(new GameCommand(playerAccountInfo.var_java_lang_String_a, new ActionListener023(playerAccountInfo)));
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

