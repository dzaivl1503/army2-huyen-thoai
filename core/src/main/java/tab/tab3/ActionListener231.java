/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener231
implements IActionListener {
    private GameSetting I111l1l1II;

    ActionListener231(GameSetting gameSetting) {
        this.I111l1l1II = gameSetting;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals(this.I111l1l1II.var_game_MapEntity_b.java_lang_String_a())) {
            GameSetting gameSetting = this.I111l1l1II;
            if (!MessageHandler.game_MessageHandler_a().var_boolean_a) {
                GameSetting.e();
            } else {
                GameCanvas.b(StringUtils.ds());
            }
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(gameSetting.var_game_MapEntity_a.java_lang_String_a().toLowerCase(), gameSetting.var_game_MapEntity_b.java_lang_String_a().toLowerCase());
            return;
        }
        GameCanvas.var_game_GameHelper20_a.a(StringUtils.bS(), null, new GameCommand("OK", new ActionListener144(this.I111l1l1II)), null);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_GameHelper20_a;
    }
}

