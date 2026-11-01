/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener052
implements IActionListener {
    private BoardScreen Il1l1I111II;

    ActionListener052(BoardScreen boardScreen) {
        this.Il1l1I111II = boardScreen;
    }

    public final void a() {
        PlayerAccountInfo playerAccountInfo = this.Il1l1I111II.getMyAccountInfo();
        if (playerAccountInfo != null && playerAccountInfo.var_boolean_b && playerAccountInfo.var_int_a != BoardScreen.int_a(this.Il1l1I111II)) {
            GameCanvas.void_a(StringUtils.aR());
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().b();
        if (GameHelper05.var_java_util_Vector_a == null) {
            MenuScreen.var_game_MenuScreen_a.b_();
            return;
        }
        GameHelper05.var_game_GameHelper05_a.b_();
    }
}

