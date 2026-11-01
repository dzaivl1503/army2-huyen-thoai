/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener186
implements IActionListener {
    private ActionListener149 lll11lII1;

    ActionListener186(ActionListener149 actionListener149) {
        this.lll11lII1 = actionListener149;
    }

    public final void a() {
        PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.lll11lII1.a.var_java_util_Vector_a.elementAt(this.lll11lII1.a.var_int_a);
        String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        if (string.length() != 0) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(playerAccountInfo.var_int_a, string);
            GameCanvas.void_a(StringUtils.cb());
        }
    }
}

