/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener060
implements IActionListener {
    private final IActionListener llI1l1Illl1;

    ActionListener060(IActionListener iActionListener) {
        this.llI1l1Illl1 = iActionListener;
    }

    public final void a() {
        GameCanvas.var_game_GameHelper21_a = null;
        if (GameCanvas.var_game_BaseScreen_a.j) {
            MenuScreen.var_game_MenuScreen_a.e();
        }
        this.llI1l1Illl1.a();
    }
}

