/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;

public final class InputScreen
extends GameHelper21 {
    public MapEntity a;
    private String[] var_java_lang_String_arr_lIlI11I1lI1l;
    private IActionListener var_game_IActionListener_lIlI11I1lI1l;
    private IActionListener I1Il11I111I;
    private int var_int_lIlI11I1lI1l = GameCanvas.var_boolean_d ? 15 : 0;
    private int ignoreFrames = 0;

    public InputScreen() {
        this.a = new MapEntity();
        this.updateLayout();
        this.a.var_boolean_a = true;
        this.c = this.a.var_game_GameCommand_a;
    }

    private void updateLayout() {
        this.var_int_lIlI11I1lI1l = GameCanvas.var_boolean_d ? 15 : 0;
        this.a.var_int_a = 20;
        this.a.var_int_b = GameCanvas.var_int_c - BaseScreen.var_int_o - 48 - this.var_int_lIlI11I1lI1l;
        this.a.var_int_c = GameCanvas.var_int_b - 40;
        this.a.d = BaseScreen.var_int_o + 2;
    }

    public final void a(String string, IActionListener iActionListener, IActionListener iActionListener2, int n) {
        this.updateLayout();
        this.a.a("");
        this.a.void_a(n);
        this.var_java_lang_String_arr_lIlI11I1lI1l = FontRenderer.a.a(string, GameCanvas.var_int_b - 40);
        this.var_game_IActionListener_lIlI11I1lI1l = iActionListener;
        this.I1Il11I111I = iActionListener2;
        ((GameHelper21)this).a = new GameCommand(StringUtils.dI(), this.I1Il11I111I);
        this.b = new GameCommand("OK", this.var_game_IActionListener_lIlI11I1lI1l);
        this.ignoreFrames = 2;
    }

    public final void a(Graphics graphics) {
        this.updateLayout();
        BaseScreen.a(8, GameCanvas.var_int_c - 102 - this.var_int_lIlI11I1lI1l, GameCanvas.var_int_b - 16, 69, graphics);
        int n = GameCanvas.var_int_c - 35 - 50 - (this.var_java_lang_String_arr_lIlI11I1lI1l.length >> 1) * FontRenderer.a.a();
        int n2 = 0;
        while (n2 < this.var_java_lang_String_arr_lIlI11I1lI1l.length) {
            FontRenderer.a.a(graphics, this.var_java_lang_String_arr_lIlI11I1lI1l[n2], GameCanvas.var_int_d, n - this.var_int_lIlI11I1lI1l, 2);
            ++n2;
            n += FontRenderer.a.a();
        }
        this.a.a(graphics);
        super.a(graphics);
    }

    public final void a(int n) {
        this.a.boolean_a(n);
        super.a(n);
    }

    public final void void_a() {
        this.a.c();
        if (this.ignoreFrames > 0) {
            this.ignoreFrames--;
        } else if (GameCanvas.var_boolean_c && GameCanvas.a(this.a.var_int_a, this.a.var_int_b - 5, this.a.var_int_c, this.a.d + 10)) {
            GameCanvas.var_boolean_c = false;
            this.a.void_a();
        }
        super.void_a();
    }
}

