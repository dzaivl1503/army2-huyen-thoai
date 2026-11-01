/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener142
implements IActionListener {
    private ActionListener049 I11lIIl1Il;

    ActionListener142(ActionListener049 actionListener049) {
        this.I11lIIl1Il = actionListener049;
    }

    public final void a() {
        ClanGroupEntry clanGroupEntry = (ClanGroupEntry)this.I11lIIl1Il.a.a.var_java_util_Vector_a.elementAt(this.I11lIIl1Il.a.a.var_int_a);
        String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        if (string.length() != 0) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(clanGroupEntry.var_int_a, string);
            clanGroupEntry.var_boolean_a = true;
            GameCanvas.void_a(StringUtils.cb());
            GameCanvas.k = 100;
        }
    }
}

