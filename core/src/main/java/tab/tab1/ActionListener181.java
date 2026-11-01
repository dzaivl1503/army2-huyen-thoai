/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener181
implements IActionListener {
    private ActionListener034 I1l1l11l;

    ActionListener181(ActionListener034 actionListener034) {
        this.I1l1l11l = actionListener034;
    }

    public final void a() {
        int n;
        try {
            n = Integer.parseInt(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
            if (n < 0) {
                return;
            }
        }
        catch (Exception exception) {
            return;
        }
        GameCanvas.d();
        if ((long)n > TerrainMidlet.myInfo.var_long_c) {
            GameCanvas.void_a(StringUtils.bB() + TerrainMidlet.myInfo.var_long_c);
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(n);
        for (n = 0; n < this.I1l1l11l.a.a.a.var_java_util_Vector_a.size(); ++n) {
            ((PlayerAccountInfo)this.I1l1l11l.a.a.a.var_java_util_Vector_a.elementAt((int)n)).var_boolean_b = false;
        }
    }
}

