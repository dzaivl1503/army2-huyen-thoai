/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener042
implements IActionListener {
    private MenuScreen l111Illl;

    ActionListener042(MenuScreen menuScreen) {
        this.l111Illl = menuScreen;
    }

    public final void a() {
        ActionListener064 actionListener064 = new ActionListener064();
        GameCanvas.var_game_GameHelper20_a.a(StringUtils.aZ(), new GameCommand(StringUtils.cr(), actionListener064), new GameCommand("", actionListener064), new GameCommand(StringUtils.cq(), new ActionListener220()));
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_GameHelper20_a;
    }
}

