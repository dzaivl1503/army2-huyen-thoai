/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener013
implements IActionListener {
    final ActionListener198 a;
    private final String[] IlIl1lIlI;
    private final String[] IIIl1I1Il;

    ActionListener013(ActionListener198 actionListener198, String[] stringArray, String[] stringArray2) {
        this.a = actionListener198;
        this.IlIl1lIlI = stringArray;
        this.IIIl1I1Il = stringArray2;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().equals("")) {
            GameCanvas.a(StringUtils.bL(), new ActionListener075());
            return;
        }
        this.IlIl1lIlI[1] = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        GameCanvas.var_game_InputScreen_a.a(this.IIIl1I1Il[2], new ActionListener299(this.IlIl1lIlI), new ActionListener191(this), 2);
    }
}

