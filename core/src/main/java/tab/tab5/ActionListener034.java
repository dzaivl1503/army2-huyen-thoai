/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener034
implements IActionListener {
    final ActionListener057 a;

    ActionListener034(ActionListener057 actionListener057) {
        this.a = actionListener057;
    }

    public final void a() {
        GameCanvas.var_game_InputScreen_a.a(StringUtils.bC(), new ActionListener181(this), new ActionListener080(), 1);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

