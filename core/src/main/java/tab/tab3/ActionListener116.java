/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener116
implements IActionListener {
    ActionListener116() {
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a() != null && GameCanvas.var_game_InputScreen_a.a.java_lang_String_a() != "") {
            ConnectionWatchdog.game_ConnectionWatchdog_a().c((byte)1, Integer.parseInt(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a()));
            GameCanvas.d();
        }
    }
}

