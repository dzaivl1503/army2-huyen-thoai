/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;

public final class UpdateScreen
extends BaseScreen {
    public static UpdateScreen var_game_UpdateScreen_a;
    public static String var_java_lang_String_a;
    public static String b;
    private static String[] ll1lllI11;

    public final void d() {
        ll1lllI11 = FontRenderer.e.a(var_java_lang_String_a, GameCanvas.var_int_b - 30);
        this.h = new GameCommand(StringUtils.dG(), new ActionListener151());
        this.g = new GameCommand("T\u1ea3i game", new ActionListener155());
    }

    public final void a(Graphics graphics) {
        ClanScreen.c(graphics);
        if (ll1lllI11 != null) {
            for (int i = 0; i < ll1lllI11.length; ++i) {
                FontRenderer.e.a(graphics, ll1lllI11[i], GameCanvas.var_int_b / 2, 30 + i * 20, 2);
            }
        }
        super.a(graphics);
    }

    public final void c() {
    }
}

