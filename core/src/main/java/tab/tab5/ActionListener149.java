/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener149
implements IActionListener {
    final GameHelper33 a;

    ActionListener149(GameHelper33 gameHelper33) {
        this.a = gameHelper33;
    }

    public final void a() {
        if (this.a.var_int_a >= 0 && this.a.var_int_a < this.a.var_java_util_Vector_a.size()) {
            if (GameCanvas.k > 0) {
                GameCanvas.void_a(StringUtils.cd());
                return;
            }
            PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.a.var_java_util_Vector_a.elementAt(this.a.var_int_a);
            GameCanvas.var_game_InputScreen_a.a(StringUtils.cc() + playerAccountInfo.var_java_lang_String_a + ":", new ActionListener186(this), new ActionListener170(), 0);
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
        }
    }
}

