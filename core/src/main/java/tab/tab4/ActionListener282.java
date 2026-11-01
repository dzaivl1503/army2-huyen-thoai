/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener282
implements IActionListener {
    ActionListener282() {
    }

    public final void a() {
        int n = GameCanvas.var_game_GameHelper49_a.int_a();
        if (n < 1) {
            n = 1;
        }
        if (n > 10) {
            n = 10;
        }
        GameCanvas.l = n - 1;
        GameCanvas.a();
        DataUtils.a("speed", GameCanvas.l);
        GameCanvas.d();
    }
}

