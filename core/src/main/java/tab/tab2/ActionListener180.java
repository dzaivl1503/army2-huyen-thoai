/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;

import java.util.Vector;

final class ActionListener180
implements IActionListener {
    final BoardScreen a;

    ActionListener180(BoardScreen boardScreen) {
        this.a = boardScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        if (BoardScreen.int_a(this.a) == TerrainMidlet.myInfo.var_int_a) {
            vector.addElement(BoardScreen.game_GameCommand_a(this.a));
            vector.addElement(BoardScreen.game_GameCommand_b(this.a));
        }
        GameCommand gameCommand = new GameCommand(StringUtils.aT(), new ActionListener057(this));
        GameCommand gameCommand2 = new GameCommand("Kick..", new ActionListener195(this));
        PlayerAccountInfo myAcc = this.a.getMyAccountInfo();
        if ((myAcc == null || !myAcc.var_boolean_b) || BoardScreen.int_a(this.a) == TerrainMidlet.myInfo.var_int_a) {
            vector.addElement(BoardScreen.game_GameCommand_c(this.a));
        }
        if (BoardScreen.int_a(this.a) == TerrainMidlet.myInfo.var_int_a) {
            vector.addElement(gameCommand);
        }
        boolean bl = false;
        for (int i = 0; i < this.a.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.a.var_java_util_Vector_a.elementAt(i);
            if (playerAccountInfo.var_int_a == TerrainMidlet.myInfo.var_int_a || playerAccountInfo.var_int_a == -1) continue;
            bl = true;
            break;
        }
        if (bl) {
            vector.addElement(BoardScreen.game_GameCommand_d(this.a));
        }
        if (bl && BoardScreen.int_a(this.a) == TerrainMidlet.myInfo.var_int_a) {
            vector.addElement(gameCommand2);
        }
        if (bl) {
            GameCommand gameCommand3 = new GameCommand(StringUtils.aM(), new ActionListener085(this));
            vector.addElement(gameCommand3);
        }
        vector.addElement(BoardScreen.game_GameCommand_e(this.a));
        vector.addElement(BoardScreen.f(this.a));
        vector.addElement(BoardScreen.g(this.a));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

