/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab4;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class AchievementScreen
extends BaseScreen {
    public static AchievementScreen var_game_AchievementScreen_a;
    public int var_int_a;
    public int var_int_b;
    public long var_long_a;
    public long var_int_c;
    public long var_long_b;
    public long var_long_c;
    public int d;
    public String var_java_lang_String_a;
    public Image var_javax_microedition_lcdui_Image_a;

    public AchievementScreen() {
        this.h = new GameCommand(StringUtils.dH(), new ActionListener100());
    }

    public final void a(Graphics graphics) {
        ClanScreen.c(graphics);
        FontRenderer.f.a(graphics, "TH\u00c0NH T\u00cdCH", GameCanvas.var_int_b / 2, 10, 3);
        Object object = TerrainMidlet.myInfo.var_java_lang_String_a;
        if (this.var_javax_microedition_lcdui_Image_a != null) {
            graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, GameCanvas.var_int_b / 2 - FontRenderer.e.a((String)object) / 2 - 20, 41, 0);
        }
        FontRenderer.e.a(graphics, (String)object, GameCanvas.var_int_b / 2, 40, 2);
        graphics.drawImage(BaseScreen.s, GameCanvas.var_int_b / 2 - 20, 60, 0);
        FontRenderer.e.a(graphics, String.valueOf(this.d), GameCanvas.var_int_b / 2 + 3, 62, 0);
        FontRenderer.e.a(graphics, "(" + this.var_java_lang_String_a + ")", GameCanvas.var_int_b / 2, 80, 2);
        FontRenderer.a.a(graphics, DataUtils.a(this.var_long_a) + " " + StringUtils.aq() + " - " + DataUtils.a((long)this.var_int_c) + " " + StringUtils.ar(), GameCanvas.var_int_b / 2, 100, 2);
        object = TerrainMidlet.myInfo;
        FontRenderer.e.a(graphics, "Level " + ((PlayerAccountInfo)object).var_int_b + (this.var_int_a + this.var_int_b < 0 ? " " : " +") + this.var_int_b + "%", GameCanvas.var_int_b / 2, 120, 2);
        graphics.setColor(1521982);
        graphics.fillRect(GameCanvas.var_int_b / 2 - 50, 145, 102, 17);
        graphics.setColor(2378093);
        graphics.fillRect(GameCanvas.var_int_b / 2 - 50 + 1, 146, 100, 15);
        graphics.setColor(16767817);
        graphics.fillRect(GameCanvas.var_int_b / 2 - 50 + 1, 146, ((PlayerAccountInfo)object).var_int_c, 15);
        FontRenderer.e.a(graphics, this.var_long_b + "/" + this.var_long_c, GameCanvas.var_int_b / 2, 145, 2);
        super.a(graphics);
    }

    public final void c() {
    }

    public final void void_b() {
        super.void_b();
    }
}

