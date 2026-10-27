/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.CharacterUpgradeScreen;
import game.DataUtils;
import game.FontRenderer;
import game.ItemTemplate;
import game.StringUtils;
import javax.microedition.lcdui.Graphics;

public final class GameHelper54 {
    private static final String[] var_java_lang_String_arr_l1IlIlIll;
    private ItemTemplate var_game_ItemTemplate_l1IlIlIll;
    private int var_int_l1IlIlIll = 150;

    public final void a(ItemTemplate itemTemplate) {
        this.var_game_ItemTemplate_l1IlIlIll = itemTemplate;
    }

    public final void a(int n) {
        this.var_int_l1IlIlIll = n;
    }

    public static int a() {
        return 80;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (this.var_game_ItemTemplate_l1IlIlIll == null) {
            return;
        }
        int n5 = n + 20;
        int n6 = n + 90;
        int n7 = n + this.var_int_l1IlIlIll - 4;
        for (int i = 0; i < 5; ++i) {
            int n8 = n2 + (i << 4) - n3;
            if (n8 + 16 < n2 || n8 > n2 + n4) continue;
            graphics.setColor(2378093);
            graphics.fillRect(n - 2, n8, this.var_int_l1IlIlIll + 4, 15);
            DataUtils.a(graphics, CharacterUpgradeScreen.var_javax_microedition_lcdui_Image_a, 0, i << 4, 16, 16, 0, n, n8, 0);
            FontRenderer.b.a(graphics, var_java_lang_String_arr_l1IlIlIll[i], n5, n8, 0);
            int n9 = this.var_game_ItemTemplate_l1IlIlIll.var_int_arr_a[i];
            if (n9 != 0) {
                FontRenderer.c.a(graphics, "+" + n9, n6, n8, 0);
            }
            if ((n9 = this.var_game_ItemTemplate_l1IlIlIll.var_int_arr_b[i]) == 0) continue;
            FontRenderer.c.a(graphics, "+" + n9 + "%", n7, n8, 1);
        }
    }

    static {
        String[] stringArray = new String[5];
        var_java_lang_String_arr_l1IlIlIll = stringArray;
        stringArray[0] = StringUtils.as();
        GameHelper54.var_java_lang_String_arr_l1IlIlIll[1] = StringUtils.at();
        GameHelper54.var_java_lang_String_arr_l1IlIlIll[2] = StringUtils.au();
        GameHelper54.var_java_lang_String_arr_l1IlIlIll[3] = StringUtils.av();
        GameHelper54.var_java_lang_String_arr_l1IlIlIll[4] = StringUtils.aw();
    }
}

