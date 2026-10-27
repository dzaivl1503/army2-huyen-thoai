/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener190;
import game.ActionListener227;
import game.ActionListener231;
import game.GameCanvas;
import game.GameCommand;
import game.GameSetting;
import game.IActionListener;
import game.StringUtils;

final class ActionListener273
implements IActionListener {
    private GameSetting llll11lI1Ill;

    ActionListener273(GameSetting gameSetting) {
        this.llll11lI1Ill = gameSetting;
    }

    public final void a() {
        String string = this.llll11lI1Ill.var_game_MapEntity_a.java_lang_String_a().toLowerCase().trim();
        String string2 = this.llll11lI1Ill.var_game_MapEntity_b.java_lang_String_a();
        if (string.equals("")) {
            GameCanvas.void_a(StringUtils.bV());
            return;
        }
        if (string2.equals("")) {
            GameCanvas.var_game_GameHelper20_a.a(StringUtils.bU(), null, new GameCommand("OK", new ActionListener190(this.llll11lI1Ill)), null);
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_GameHelper20_a;
            return;
        }
        GameCanvas.var_game_InputScreen_a.a(StringUtils.bT(), new ActionListener231(this.llll11lI1Ill), new ActionListener227(), 2);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

