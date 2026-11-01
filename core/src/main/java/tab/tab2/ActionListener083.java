/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener083
implements IActionListener {
    ActionListener083() {
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().length() < 4) {
            GameCanvas.void_a(StringUtils.cg());
            return;
        }
        GameCanvas.b(StringUtils.ce());
        ConnectionWatchdog.game_ConnectionWatchdog_a().d(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
    }
}

