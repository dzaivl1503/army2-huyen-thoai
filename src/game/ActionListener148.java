/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.EquipTemplate;
import game.GameCanvas;
import game.GameHelper05;
import game.IActionListener;
import game.StringUtils;

final class ActionListener148
implements IActionListener {
    private GameHelper05 var_game_GameHelper05_II1llIIl1;
    private final EquipTemplate var_game_EquipTemplate_II1llIIl1;

    ActionListener148(GameHelper05 gameHelper05, EquipTemplate equipTemplate) {
        this.var_game_GameHelper05_II1llIIl1 = gameHelper05;
        this.var_game_EquipTemplate_II1llIIl1 = equipTemplate;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.var_game_GameHelper05_II1llIIl1.var_byte_a, this.var_game_EquipTemplate_II1llIIl1.var_byte_a, GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
        GameCanvas.b(StringUtils.ds());
    }
}

