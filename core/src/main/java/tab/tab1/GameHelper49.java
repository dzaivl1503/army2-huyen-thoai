/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper49
extends GameHelper21 {
    private static Image[] var_javax_microedition_lcdui_Image_arr_lIllIIIII;
    private String[] var_java_lang_String_arr_lIllIIIII;
    private IActionListener var_game_IActionListener_lIllIIIII;
    private IActionListener var_game_IActionListener_lIl11I1IllIl;
    private int var_int_lIllIIIII;
    private int var_int_lIl11I1IllIl = 1;
    private int III11Ill1 = 10;
    private int IlIlll1Ill1 = GameCanvas.var_boolean_d ? 15 : 0;

    public final void a(String string, int n, IActionListener iActionListener, IActionListener iActionListener2) {
        this.var_java_lang_String_arr_lIllIIIII = FontRenderer.a.a(string, GameCanvas.var_int_b - 40);
        this.var_int_lIllIIIII = n;
        if (this.var_int_lIllIIIII < this.var_int_lIl11I1IllIl) {
            this.var_int_lIllIIIII = this.var_int_lIl11I1IllIl;
        }
        if (this.var_int_lIllIIIII > this.III11Ill1) {
            this.var_int_lIllIIIII = this.III11Ill1;
        }
        this.var_game_IActionListener_lIllIIIII = iActionListener;
        this.var_game_IActionListener_lIl11I1IllIl = iActionListener2;
        this.a = new GameCommand(StringUtils.dI(), this.var_game_IActionListener_lIl11I1IllIl);
        this.b = new GameCommand("OK", this.var_game_IActionListener_lIllIIIII);
        this.c = null;
    }

    public final int int_a() {
        return this.var_int_lIllIIIII;
    }

    public final void a(Graphics graphics) {
        int n;
        BaseScreen.a(8, GameCanvas.var_int_c - 130 - this.IlIlll1Ill1, GameCanvas.var_int_b - 16, 97, graphics);
        int n2 = GameCanvas.var_int_c - 115 - (this.var_java_lang_String_arr_lIllIIIII.length >> 1) * FontRenderer.a.a();
        for (n = 0; n < this.var_java_lang_String_arr_lIllIIIII.length; ++n) {
            FontRenderer.a.a(graphics, this.var_java_lang_String_arr_lIllIIIII[n], GameCanvas.var_int_d, n2 - this.IlIlll1Ill1, 2);
        }
        FontRenderer.e.a(graphics, String.valueOf(this.var_int_lIllIIIII), GameCanvas.var_int_d, n2 += 10, 2);
        n = n2 + 15;
        n2 = GameCanvas.var_int_d - this.III11Ill1 * 10 / 2;
        for (int i = 0; i < this.III11Ill1; ++i) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_lIllIIIII[i >= this.var_int_lIllIIIII ? 1 : 0], n2 + i * 10, n, 0);
        }
        if (GameCanvas.var_int_a % 10 > 2) {
            FontRenderer.e.a(graphics, "$", n2 - 15, n - 5, 0);
            FontRenderer.e.a(graphics, "#", n2 + this.III11Ill1 * 10 + 5, n - 5, 0);
        }
        super.a(graphics);
    }

    public final void a(int n) {
        if ((n == -3 || n == 21) && this.var_int_lIllIIIII > this.var_int_lIl11I1IllIl) {
            --this.var_int_lIllIIIII;
        }
        if ((n == -4 || n == 22) && this.var_int_lIllIIIII < this.III11Ill1) {
            ++this.var_int_lIllIIIII;
        }
        super.a(n);
    }

    public final void void_a() {
        if (GameCanvas.var_boolean_d && GameCanvas.var_boolean_c) {
            int n = GameCanvas.var_int_c - 60;
            int n2 = GameCanvas.var_int_d - this.III11Ill1 * 10 / 2;
            if (GameCanvas.g >= n - 10 && GameCanvas.g <= n + 20 && GameCanvas.f >= n2 && GameCanvas.f <= n2 + this.III11Ill1 * 10 && (n = (GameCanvas.f - n2) / 10 + 1) >= this.var_int_lIl11I1IllIl && n <= this.III11Ill1) {
                this.var_int_lIllIIIII = n;
            }
        }
        super.void_a();
    }

    static {
        var_javax_microedition_lcdui_Image_arr_lIllIIIII = new Image[2];
        try {
            GameHelper49.var_javax_microedition_lcdui_Image_arr_lIllIIIII[0] = Image.createImage((String)"/tick0.png");
            GameHelper49.var_javax_microedition_lcdui_Image_arr_lIllIIIII[1] = Image.createImage((String)"/tick1.png");
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

