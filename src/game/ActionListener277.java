/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameCanvas;
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
        final ItemTemplate itemTemplate = this.var_game_GameHelper48_l11Il11llI11.var_game_ItemTemplate_a;
        if (itemTemplate == null) {
            return;
        }
        GameCanvas.var_game_InputScreen_a.a("Nh\u1eadp s\u1ed1 l\u01b0\u1ee3ng:", new IActionListener() {
            public final void a() {
                int qty = 1;
                try {
                    String text = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
                    qty = Integer.parseInt(text);
                } catch (Exception ignored) {
                }
                if (qty <= 0) {
                    qty = 1;
                }
                ActionListener277.this.var_game_GameHelper48_l11Il11llI11.var_boolean_a = true;
                ActionListener277.this.var_game_GameHelper48_l11Il11llI11.var_int_a = qty;
                for (int i = 0; i < ActionListener277.this.var_game_GameHelper48_l11Il11llI11.var_java_util_Vector_a.size(); ++i) {
                    ((ItemTemplate)ActionListener277.this.var_game_GameHelper48_l11Il11llI11.var_java_util_Vector_a.elementAt(i)).var_int_c = 0;
                    ((ItemTemplate)ActionListener277.this.var_game_GameHelper48_l11Il11llI11.var_java_util_Vector_a.elementAt(i)).var_boolean_c = false;
                }
                itemTemplate.var_int_c = qty;
                itemTemplate.var_boolean_c = true;
                GameCommand buyCmd = itemTemplate.var_int_f != -1 && itemTemplate.var_int_e != -1 ? ActionListener277.this.var_game_GameCommand_l11Il11llI11 : (itemTemplate.var_int_e == -1 && itemTemplate.var_int_f != -1 ? ActionListener277.this.I1IIllI1I11I : ActionListener277.this.IlI111l1);
                ActionListener277.this.var_game_GameHelper48_l11Il11llI11.f = buyCmd;
                ActionListener277.this.var_game_GameHelper48_l11Il11llI11.g = buyCmd;
                GameCanvas.var_game_GameHelper21_a = null;
                if (buyCmd != null && buyCmd.var_game_IActionListener_a != null) {
                    buyCmd.var_game_IActionListener_a.a();
                }
            }
        }, new IActionListener() {
            public final void a() {
                GameCanvas.var_game_GameHelper21_a = null;
            }
        }, 1);
        GameCanvas.var_game_InputScreen_a.a.a(this.var_game_GameHelper48_l11Il11llI11.var_int_a > 1 ? String.valueOf(this.var_game_GameHelper48_l11Il11llI11.var_int_a) : "1");
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}


