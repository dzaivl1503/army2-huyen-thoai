/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener111
implements IActionListener {
    ActionListener111() {
    }

    public final void a() {
        if (!GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals("")) {
            String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(string);
            GameHelper05.var_java_lang_String_a = string;
            GameCanvas.void_a(StringUtils.bz());
        }
    }
}

