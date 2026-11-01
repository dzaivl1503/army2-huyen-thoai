/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class TimerHUD
extends Point4D {
    public static Image[] var_javax_microedition_lcdui_Image_arr_a;
    public int var_int_a;

    public TimerHUD() {
        if (var_javax_microedition_lcdui_Image_arr_a == null) {
            var_javax_microedition_lcdui_Image_arr_a = new Image[2];
        }
        TimerHUD.var_javax_microedition_lcdui_Image_arr_a[0] = BattleScreen.var_javax_microedition_lcdui_Image_arr_b[0];
        TimerHUD.var_javax_microedition_lcdui_Image_arr_a[1] = BattleScreen.var_javax_microedition_lcdui_Image_arr_b[1];
    }

    public final void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        graphics.setColor(14279153);
        graphics.fillRoundRect(GameCanvas.var_int_b - 60, 5, 34, 20, 6, 6);
        graphics.setColor(4682453);
        graphics.fillRect(GameCanvas.var_int_b - 60 + 2, 7, 30, 16);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_a[0], GameCanvas.var_int_b - 60 + 4, 9, 0);
        FontRenderer.a.a(graphics, String.valueOf(this.var_int_a), GameCanvas.var_int_b - 60 + 28, 9, 2);
    }

    public final void a() {
    }
}

