/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener104;
import game.ActionListener148;
import game.BoardScreen;
import game.ConnectionWatchdog;
import game.EquipTemplate;
import game.GameCanvas;
import game.GameHelper05;
import game.IActionListener;
import game.StringUtils;

final class ActionListener090
implements IActionListener {
    private GameHelper05 II1lllIl;

    ActionListener090(GameHelper05 gameHelper05) {
        this.II1lllIl = gameHelper05;
    }

    public final void a() {
        if (GameHelper05.var_java_util_Vector_a.size() != 0) {
            GameHelper05 gameHelper05 = this.II1lllIl;
            EquipTemplate equipTemplate = (EquipTemplate)GameHelper05.var_java_util_Vector_a.elementAt(GameHelper05.var_int_a);
            GameHelper05.a(equipTemplate.var_byte_a, equipTemplate.var_java_lang_String_a);
            if (equipTemplate.var_boolean_a) {
                GameCanvas.var_game_InputScreen_a.a(StringUtils.dq() + ":", new ActionListener148(gameHelper05, equipTemplate), new ActionListener104(), 0);
                GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
                return;
            }
            BoardScreen.var_byte_a = gameHelper05.var_byte_a;
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(gameHelper05.var_byte_a, equipTemplate.var_byte_a, "");
            GameCanvas.c(StringUtils.ds());
        }
    }
}

