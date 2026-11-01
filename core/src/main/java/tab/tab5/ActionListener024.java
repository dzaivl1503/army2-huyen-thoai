/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;

import java.util.Vector;

final class ActionListener024
implements IActionListener {
    private BoardScreen llIIIlI1I11l;

    ActionListener024(BoardScreen boardScreen) {
        this.llIIIlI1I11l = boardScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        for (int i = 0; i < this.llIIIlI1I11l.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.llIIIlI1I11l.var_java_util_Vector_a.elementAt(i);
            if (playerAccountInfo.var_int_a == TerrainMidlet.myInfo.var_int_a || playerAccountInfo.var_int_a == -1) continue;
            vector.addElement(new GameCommand(playerAccountInfo.var_java_lang_String_a, new ActionListener007(playerAccountInfo)));
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

