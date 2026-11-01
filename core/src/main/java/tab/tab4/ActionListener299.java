/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener299
implements IActionListener {
    private final String[] l1I1l11lI1;

    ActionListener299(String[] stringArray) {
        this.l1I1l11lI1 = stringArray;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals("")) {
            GameCanvas.a(StringUtils.bM(), new ActionListener221());
            return;
        }
        this.l1I1l11lI1[2] = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        if (this.l1I1l11lI1[2].equals(this.l1I1l11lI1[1])) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().b(this.l1I1l11lI1[0], this.l1I1l11lI1[1]);
            GameCanvas.d();
            GameCanvas.void_a(StringUtils.ds());
            return;
        }
        GameCanvas.void_a(StringUtils.bN());
    }
}

