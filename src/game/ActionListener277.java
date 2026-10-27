/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCommand;
import game.GameHelper48;
import game.IActionListener;
import game.ItemTemplate;

final class ActionListener277
implements IActionListener {
    private GameHelper48 var_game_GameHelper48_l11Il11llI11;
    private final GameCommand var_game_GameCommand_l11Il11llI11;
    private final GameCommand I1IIllI1I11I;
    private final GameCommand IlI111l1;

    ActionListener277(GameHelper48 gameHelper48, GameCommand gameCommand, GameCommand gameCommand2, GameCommand gameCommand3) {
        this.var_game_GameHelper48_l11Il11llI11 = gameHelper48;
        this.var_game_GameCommand_l11Il11llI11 = gameCommand;
        this.I1IIllI1I11I = gameCommand2;
        this.IlI111l1 = gameCommand3;
    }

    public final void a() {
        this.var_game_GameHelper48_l11Il11llI11.var_boolean_a = true;
        this.var_game_GameHelper48_l11Il11llI11.var_int_a = 1;
        for (int i = 0; i < this.var_game_GameHelper48_l11Il11llI11.var_java_util_Vector_a.size(); ++i) {
            ((ItemTemplate)this.var_game_GameHelper48_l11Il11llI11.var_java_util_Vector_a.elementAt((int)i)).var_int_c = 0;
            ((ItemTemplate)this.var_game_GameHelper48_l11Il11llI11.var_java_util_Vector_a.elementAt((int)i)).var_boolean_c = false;
        }
        this.var_game_GameHelper48_l11Il11llI11.g = this.var_game_GameHelper48_l11Il11llI11.var_game_ItemTemplate_a.var_int_f != -1 && this.var_game_GameHelper48_l11Il11llI11.var_game_ItemTemplate_a.var_int_e != -1 ? this.var_game_GameCommand_l11Il11llI11 : (this.var_game_GameHelper48_l11Il11llI11.var_game_ItemTemplate_a.var_int_e == -1 && this.var_game_GameHelper48_l11Il11llI11.var_game_ItemTemplate_a.var_int_f != -1 ? this.I1IIllI1I11I : this.IlI111l1);
        this.var_game_GameHelper48_l11Il11llI11.f = null;
    }
}

