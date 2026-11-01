/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;

import java.util.Vector;

final class ActionListener161
implements IActionListener {
    ActionListener161() {
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand((PlayerEntity.var_boolean_J ? "T\u1eaeT" : "B\u1eacT") + " V\u1ebc C\u0102N G\u00d3C", new ActionListener154()));
        vector.addElement(new GameCommand((PlayerEntity.var_boolean_I ? "T\u1eaeT" : "B\u1eacT") + " V\u1ebc HP", new ActionListener136()));
        vector.addElement(new GameCommand((PlayerEntity.var_boolean_K ? "T\u1eaeT" : "B\u1eacT") + " NH\u1eacN LOA L\u1edaN", new ActionListener041()));
        vector.addElement(new GameCommand((PlayerEntity.var_boolean_L ? "T\u1eaeT" : "B\u1eacT") + " HI\u1ec6U \u1ee8NG", new ActionListener162(this)));
        vector.addElement(new GameCommand("C\u00c0I S\u1ed0 FRAME", new ActionListener037()));
        PlayerEntity playerEntity = BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b];
        if (playerEntity.var_byte_c == 6 || playerEntity.var_byte_c == 8) {
            vector.addElement(new GameCommand("C\u00c0I FRAME 2", new ActionListener081()));
        }
        vector.addElement(new GameCommand("SPEED GAME", new ActionListener280()));
        vector.addElement(new GameCommand("XEM GI\u1edc", new ActionListener039()));
        vector.addElement(new GameCommand("TR\u1ede L\u1ea0I", new ActionListener275()));
        GameCanvas.var_game_PopupMenu_a.a(vector);
    }
}

