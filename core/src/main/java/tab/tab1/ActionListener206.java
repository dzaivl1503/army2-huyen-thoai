/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener206
implements IActionListener {
    ActionListener206() {
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a() != null && GameCanvas.var_game_InputScreen_a.a.java_lang_String_a() != "") {
            ConnectionWatchdog.game_ConnectionWatchdog_a().c((byte)0, Integer.parseInt(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a()));
            GameCanvas.d();
        }
    }
}

