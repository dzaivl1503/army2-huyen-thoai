/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener126
implements IActionListener {
    private final byte var_byte_I1l1l1IlIll;
    private final String var_java_lang_String_I1l1l1IlIll;

    ActionListener126(byte by, String string) {
        this.var_byte_I1l1l1IlIll = by;
        this.var_java_lang_String_I1l1l1IlIll = string;
    }

    public final void a() {
        Object object = new ActionListener137(this.var_java_lang_String_I1l1l1IlIll);
        if (this.var_byte_I1l1l1IlIll == 0) {
            if (GameCanvas.var_boolean_a) {
                GameCanvas.var_game_GameHelper20_a.a(StringUtils.aF(), null, new GameCommand(StringUtils.dG(), (IActionListener)object), new GameCommand(StringUtils.cq(), new ActionListener196(this.var_java_lang_String_I1l1l1IlIll)));
                return;
            }
            GameCanvas.var_game_GameHelper20_a.a(StringUtils.aF(), new GameCommand(StringUtils.dG(), (IActionListener)object), new GameCommand("", (IActionListener)object), new GameCommand(StringUtils.cq(), new ActionListener189(this.var_java_lang_String_I1l1l1IlIll)));
            return;
        }
        if (this.var_byte_I1l1l1IlIll == 1) {
            try {
                TerrainMidlet.instance.platformRequest(this.var_java_lang_String_I1l1l1IlIll);
                TerrainMidlet.instance.notifyDestroyed();
                return;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                return;
            }
        }
        if (this.var_byte_I1l1l1IlIll == 2) {
            try {
                TerrainMidlet.instance.platformRequest(this.var_java_lang_String_I1l1l1IlIll);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
            GameCanvas.d();
        }
    }
}

