/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab3;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper55 {
    private ItemTemplate var_game_ItemTemplate_I111Il1III;
    private int var_int_I111Il1III;
    private Image[] var_javax_microedition_lcdui_Image_arr_I111Il1III;
    private boolean var_boolean_I111Il1III = false;
    private int ll1llIIl = -1;
    private GameGraphics var_game_GameGraphics_I111Il1III;

    public final void a(ItemTemplate itemTemplate, int n) {
        this.var_game_ItemTemplate_I111Il1III = itemTemplate;
        this.var_int_I111Il1III = n;
        if (this.var_game_ItemTemplate_I111Il1III != null && this.var_game_ItemTemplate_I111Il1III.var_int_arr_c != null) {
            this.var_javax_microedition_lcdui_Image_arr_I111Il1III = new Image[this.var_game_ItemTemplate_I111Il1III.var_int_arr_c.length];
            for (n = 0; n < this.var_game_ItemTemplate_I111Il1III.var_int_arr_c.length; ++n) {
                int n2 = this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[n];
                if (n2 != -1) {
                    if (GameHelper37.boolean_a(n2)) {
                        this.var_javax_microedition_lcdui_Image_arr_I111Il1III[n] = GameHelper37.javax_microedition_lcdui_Image_a(n2);
                        continue;
                    }
                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, (short)n2, (byte)-1);
                }
                this.var_javax_microedition_lcdui_Image_arr_I111Il1III[n] = null;
            }
            return;
        }
        this.var_javax_microedition_lcdui_Image_arr_I111Il1III = null;
    }

    public final void a(GameGraphics gameGraphics) {
        this.var_game_GameGraphics_I111Il1III = gameGraphics;
    }

    public final void a(int n) {
        this.var_boolean_I111Il1III = true;
        this.ll1llIIl = n;
    }

    public final void void_a() {
        this.var_boolean_I111Il1III = false;
        this.ll1llIIl = -1;
    }

    public final void void_b() {
        if (this.var_javax_microedition_lcdui_Image_arr_I111Il1III != null && this.var_game_ItemTemplate_I111Il1III != null && this.var_game_ItemTemplate_I111Il1III.var_int_arr_c != null) {
            for (int i = 0; i < this.var_javax_microedition_lcdui_Image_arr_I111Il1III.length; ++i) {
                if (this.var_javax_microedition_lcdui_Image_arr_I111Il1III[i] != null || this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[i] == -1 || !GameHelper37.boolean_a(this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[i])) continue;
                this.var_javax_microedition_lcdui_Image_arr_I111Il1III[i] = GameHelper37.javax_microedition_lcdui_Image_a(this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[i]);
            }
        }
    }

    private int l11Il11IlI1() {
        if (this.var_int_I111Il1III <= 5) {
            if (this.var_int_I111Il1III > 0) {
                return this.var_int_I111Il1III;
            }
            return 1;
        }
        return 5;
    }

    public final int int_a() {
        GameHelper55 gameHelper55 = this;
        int n = gameHelper55.l11Il11IlI1();
        int n2 = gameHelper55.var_int_I111Il1III > 0 ? (gameHelper55.var_int_I111Il1III + n - 1) / n : 1;
        return n2 * 18 + (n2 - 1 << 2);
    }

    public final int int_b() {
        int n = this.l11Il11IlI1();
        return Math.max(180, n * 22 + 40);
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3 = this.l11Il11IlI1();
        GameHelper55 gameHelper55 = this;
        int n4 = gameHelper55.var_game_ItemTemplate_I111Il1III != null && gameHelper55.var_game_ItemTemplate_I111Il1III.var_int_arr_c != null ? gameHelper55.var_game_ItemTemplate_I111Il1III.var_int_arr_c.length : 0;
        for (int i = 0; i < this.var_int_I111Il1III; ++i) {
            int n5 = i / n3;
            int n6 = i % n3;
            int n7 = Math.min(n3, this.var_int_I111Il1III - n5 * n3);
            n7 = n7 * 18 + (n7 - 1 << 2);
            n7 = n - n7 / 2;
            n6 = n7 + n6 * 22;
            n5 = n2 + n5 * 22;
            if (i < n4) {
                graphics.setColor(5612786);
                graphics.fillRect(n6, n5, 18, 18);
                graphics.setColor(16767817);
                graphics.drawRect(n6, n5, 17, 17);
                if (this.var_game_ItemTemplate_I111Il1III.var_int_arr_c == null || i >= this.var_game_ItemTemplate_I111Il1III.var_int_arr_c.length || this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[i] == -1) continue;
                if (this.var_javax_microedition_lcdui_Image_arr_I111Il1III != null && this.var_javax_microedition_lcdui_Image_arr_I111Il1III[i] == null && GameHelper37.boolean_a(this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[i])) {
                    this.var_javax_microedition_lcdui_Image_arr_I111Il1III[i] = GameHelper37.javax_microedition_lcdui_Image_a(this.var_game_ItemTemplate_I111Il1III.var_int_arr_c[i]);
                }
                if (this.var_javax_microedition_lcdui_Image_arr_I111Il1III == null || this.var_javax_microedition_lcdui_Image_arr_I111Il1III[i] == null) continue;
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_I111Il1III[i], n6 + 9, n5 + 9, 3);
                continue;
            }
            graphics.setColor(1521982);
            graphics.fillRect(n6, n5, 18, 18);
            graphics.setColor(2378093);
            graphics.drawRect(n6, n5, 17, 17);
            if (!this.var_boolean_I111Il1III || i != this.ll1llIIl || this.var_game_GameGraphics_I111Il1III == null) continue;
            this.var_game_GameGraphics_I111Il1III.a(graphics, n6 + 9, n5 + 9, 18);
        }
    }
}

