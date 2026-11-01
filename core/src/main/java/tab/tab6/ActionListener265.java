/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener265
implements IActionListener {
    private ActionListener232 ll1l1111llI;

    ActionListener265(ActionListener232 actionListener232) {
        this.ll1l1111llI = actionListener232;
    }

    public final void a() {
        if (GameHelper25.a == null) {
            GameHelper25.a = new GameHelper25();
        }
        this.ll1l1111llI.a.c = true;
        GameHelper25.a.a(MenuScreen.var_game_MenuScreen_a);
    }
}

