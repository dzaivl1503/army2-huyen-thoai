/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener183
implements IActionListener {
    private final String[] var_java_lang_String_arr_Ill1lIlIll1I;
    private final String var_java_lang_String_Ill1lIlIll1I;
    private final String[] I1lIlIII1Il;

    ActionListener183(String[] stringArray, String string, String[] stringArray2) {
        this.var_java_lang_String_arr_Ill1lIlIll1I = stringArray;
        this.var_java_lang_String_Ill1lIlIll1I = string;
        this.I1lIlIII1Il = stringArray2;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals("")) {
            GameCanvas.a(StringUtils.bi(), new ActionListener079());
            return;
        }
        this.var_java_lang_String_arr_Ill1lIlIll1I[0] = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        if (this.var_java_lang_String_Ill1lIlIll1I.equals(" giftcode")) {
            System.out.println("[in] String card= " + this.var_java_lang_String_Ill1lIlIll1I);
            ConnectionWatchdog.game_ConnectionWatchdog_a().b(this.var_java_lang_String_Ill1lIlIll1I, this.var_java_lang_String_arr_Ill1lIlIll1I[0], "");
            GameCanvas.void_a(StringUtils.ds());
            return;
        }
        GameCanvas.var_game_InputScreen_a.a(this.I1lIlIII1Il[1], new ActionListener112(this.var_java_lang_String_arr_Ill1lIlIll1I, this.var_java_lang_String_Ill1lIlIll1I), new ActionListener021(), 1);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

