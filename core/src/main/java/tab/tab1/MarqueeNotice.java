/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;

public final class MarqueeNotice {
    private String var_java_lang_String_ll11Illl1ll;
    private FontRenderer var_game_FontRenderer_ll11Illl1ll = FontRenderer.a;
    private boolean var_boolean_ll11Illl1ll = false;

    public final void a(String string) {
        this.var_java_lang_String_ll11Illl1ll = string;
        this.var_boolean_ll11Illl1ll = true;
    }

    public final void void_a() {
        this.var_boolean_ll11Illl1ll = false;
        this.var_java_lang_String_ll11Illl1ll = null;
    }

    public final boolean boolean_a() {
        return this.var_boolean_ll11Illl1ll;
    }

    public final void a(Graphics graphics) {
        if (!this.var_boolean_ll11Illl1ll || this.var_java_lang_String_ll11Illl1ll == null) {
            return;
        }
        String[] stringArray = FontRenderer.a.a(this.var_java_lang_String_ll11Illl1ll, GameCanvas.var_int_b - 50);
        int n = 0;
        if (stringArray.length > 3) {
            n = stringArray.length - 3 << 3;
        }
        int n2 = GameCanvas.var_int_c - 112 - n;
        int n3 = GameCanvas.var_int_b - 16;
        n = 69 + (n << 1);
        BaseScreen.a(8, n2, n3, n, graphics);
        n = GameCanvas.var_int_c - 20 - 50 - (stringArray.length * FontRenderer.a.a() >> 1);
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            this.var_game_FontRenderer_ll11Illl1ll.a(graphics, stringArray[n2], GameCanvas.var_int_d, n - 10, 2);
            n += this.var_game_FontRenderer_ll11Illl1ll.a();
        }
    }
}

