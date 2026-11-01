/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener051
implements IActionListener {
    private GameHelper33 l1l1II1llll;

    ActionListener051(GameHelper33 gameHelper33) {
        this.l1l1II1llll = gameHelper33;
    }

    public final void a() {
        int n = ((PlayerAccountInfo)this.l1l1II1llll.var_java_util_Vector_a.elementAt((int)this.l1l1II1llll.var_int_a)).var_int_a;
        ConnectionWatchdog.game_ConnectionWatchdog_a().e(n);
        GameCanvas.b(StringUtils.ch());
    }
}

