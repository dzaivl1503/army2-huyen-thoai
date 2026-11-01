/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener230
implements IActionListener {
    private final CharacterUpgradeScreen var_game_CharacterUpgradeScreen_l1I1Il111lI;
    private final int var_int_l1I1Il111lI;
    private final short var_short_l1I1Il111lI;

    ActionListener230(CharacterUpgradeScreen characterUpgradeScreen, int n, short s) {
        this.var_game_CharacterUpgradeScreen_l1I1Il111lI = characterUpgradeScreen;
        this.var_int_l1I1Il111lI = n;
        this.var_short_l1I1Il111lI = s;
    }

    public final void a() {
        int n;
        try {
            n = Integer.parseInt(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
        }
        catch (Exception exception) {
            n = 0;
        }
        this.var_game_CharacterUpgradeScreen_l1I1Il111lI.a(this.var_int_l1I1Il111lI, n, this.var_short_l1I1Il111lI);
    }
}

