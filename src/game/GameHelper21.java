/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.BaseScreen;
import game.FontRenderer;
import game.GameCanvas;
import game.GameCommand;
import javax.microedition.lcdui.Graphics;

public abstract class GameHelper21 {
    protected GameCommand a;
    protected GameCommand b;
    protected GameCommand c;

    public void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        int n = GameCanvas.var_boolean_d ? 10 : 3;
        if (this.a != null) {
            FontRenderer.a.a(graphics, this.a.var_java_lang_String_a, 5, GameCanvas.var_int_c - FontRenderer.a.a() - n, 0);
        }
        if (this.b != null) {
            FontRenderer.a.a(graphics, this.b.var_java_lang_String_a, GameCanvas.var_int_d, GameCanvas.var_int_c - FontRenderer.a.a() - n, 2);
        }
        if (this.c != null) {
            FontRenderer.a.a(graphics, this.c.var_java_lang_String_a, GameCanvas.var_int_b - 5, GameCanvas.var_int_c - FontRenderer.a.a() - n, 1);
        }
    }

    public void a(int n) {
    }

    public void void_a() {
        if (GameCanvas.var_boolean_arr_a[5] || BaseScreen.boolean_a((byte)2)) {
            GameCanvas.var_boolean_arr_a[5] = false;
            if (this.b != null && this.b.var_game_IActionListener_a != null) {
                this.b.var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_arr_a[12] || BaseScreen.boolean_a((byte)0)) {
            GameCanvas.var_boolean_arr_a[12] = false;
            if (this.a != null && this.a.var_game_IActionListener_a != null) {
                this.a.var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_arr_a[13] || BaseScreen.boolean_a((byte)1)) {
            GameCanvas.var_boolean_arr_a[13] = false;
            if (this.c != null && this.c.var_game_IActionListener_a != null) {
                this.c.var_game_IActionListener_a.a();
            }
        }
    }
}

