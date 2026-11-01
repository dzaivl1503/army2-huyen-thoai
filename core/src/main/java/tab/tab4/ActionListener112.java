/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener112
implements IActionListener {
    private final String[] var_java_lang_String_arr_II11111lIlI;
    private final String var_java_lang_String_II11111lIlI;

    ActionListener112(String[] stringArray, String string) {
        this.var_java_lang_String_arr_II11111lIlI = stringArray;
        this.var_java_lang_String_II11111lIlI = string;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals("")) {
            GameCanvas.a(StringUtils.bh(), new ActionListener127());
            return;
        }
        this.var_java_lang_String_arr_II11111lIlI[1] = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        new StringBuffer("[ip] String card= ").append(this.var_java_lang_String_II11111lIlI);
        ConnectionWatchdog.game_ConnectionWatchdog_a().b(this.var_java_lang_String_II11111lIlI, this.var_java_lang_String_arr_II11111lIlI[0], this.var_java_lang_String_arr_II11111lIlI[1]);
        GameCanvas.void_a(StringUtils.ds());
    }
}

