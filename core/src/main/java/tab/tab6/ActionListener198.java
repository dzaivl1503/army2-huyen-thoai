/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener198
implements IActionListener {
    final MenuScreen a;
    private final String[] II1I1IIII1I;
    private final String[] lll1lIII;

    ActionListener198(MenuScreen menuScreen, String[] stringArray, String[] stringArray2) {
        this.a = menuScreen;
        this.II1I1IIII1I = stringArray;
        this.lll1lIII = stringArray2;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals("")) {
            GameCanvas.a(StringUtils.bK(), new ActionListener146());
            return;
        }
        this.II1I1IIII1I[0] = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        GameCanvas.var_game_InputScreen_a.a(this.lll1lIII[1], new ActionListener013(this, this.II1I1IIII1I, this.lll1lIII), new ActionListener123(this), 2);
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

