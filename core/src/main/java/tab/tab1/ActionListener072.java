/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener072
implements IActionListener {
    ActionListener072() {
    }

    public final void a() {
        int n;
        try {
            n = Short.parseShort(GameCanvas.var_game_InputScreen_a.a.java_lang_String_a());
        }
        catch (Exception exception) {
            n = 100;
        }
        PlayerEntity.var_short_b = (short)n;
        GameCanvas.d();
        PlayerEntity.b();
    }
}

