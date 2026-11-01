/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener012
implements IActionListener {
    private GameSetting lIIIl111;

    ActionListener012(GameSetting gameSetting) {
        this.lIIIl111 = gameSetting;
    }

    public final void a() {
        String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a();
        if (!string.equals("")) {
            this.lIIIl111.var_game_MapEntity_a.a(string);
        }
    }
}

