/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ModAutoForm
extends BaseScreen {
    public static ModAutoForm var_game_ModAutoForm_a;
    private int var_int_lII1lI1Ill11;
    public static String[] var_java_lang_String_arr_a;
    private Vector var_java_util_Vector_lII1lI1Ill11 = new Vector();

    public ModAutoForm() {
        this.g = new GameCommand("OK", new ActionListener276());
    }

    public final void b_() {
        this.var_java_util_Vector_lII1lI1Ill11.removeAllElements();
        this.var_java_util_Vector_lII1lI1Ill11.addElement(new SettingSpeedItem(this, "T\u1ed1c \u0111\u1ed9 game", GameCanvas.l, 10));
        this.var_java_util_Vector_lII1lI1Ill11.addElement(new SettingSoundItem(this, StringUtils.cx(), DataUtils.int_a("sound") / 10, 10));
        this.var_java_util_Vector_lII1lI1Ill11.addElement(new SettingVibrateItem(this, StringUtils.cw(), DataUtils.int_a("vibrate"), 10));
        byte by = BattleScreen.var_byte_a;
        if (by == -1) {
            by = 1;
        }
        this.var_java_util_Vector_lII1lI1Ill11.addElement(new GameHelper47(this, StringUtils.cu(), by, var_java_lang_String_arr_a));
        this.var_java_util_Vector_lII1lI1Ill11.addElement(new SettingDrawRGBItem(this, StringUtils.cv(), DataUtils.int_a("drawRGB") == 0));
        this.var_java_util_Vector_lII1lI1Ill11.addElement(new SettingBlockInviteItem(this, StringUtils.dY(), DataUtils.int_a("blockInvite") == 1));
        super.b_();
    }

    public final void a(Graphics graphics) {
        int n;
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (n = 0; n <= GameCanvas.var_int_b; n += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, n, GameCanvas.var_int_c - 62, 0);
        }
        FontRenderer.f.a(graphics, StringUtils.dy(), GameCanvas.var_int_b >> 1, 5, 2);
        n = GameCanvas.var_int_d - 50;
        int n2 = GameCanvas.var_int_e - 100;
        if (GameCanvas.var_int_a % 10 > 2) {
            FontRenderer.e.a(graphics, "$", n - 15, n2 + 10 + 35 * this.var_int_lII1lI1Ill11, 0);
            FontRenderer.e.a(graphics, "#", n + 103, n2 + 10 + 35 * this.var_int_lII1lI1Ill11, 0);
        }
        for (int i = 0; i < this.var_java_util_Vector_lII1lI1Ill11.size(); ++i) {
            SettingItem settingItem = (SettingItem)this.var_java_util_Vector_lII1lI1Ill11.elementAt(i);
            settingItem.a(graphics, n, n2 + i * 35);
        }
        super.a(graphics);
    }

    public final void void_b() {
        boolean bl = false;
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            if (++this.var_int_lII1lI1Ill11 >= this.var_java_util_Vector_lII1lI1Ill11.size()) {
                this.var_int_lII1lI1Ill11 = 0;
            }
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            if (--this.var_int_lII1lI1Ill11 < 0) {
                this.var_int_lII1lI1Ill11 = this.var_java_util_Vector_lII1lI1Ill11.size() - 1;
            }
        } else if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            SettingItem settingItem = (SettingItem)this.var_java_util_Vector_lII1lI1Ill11.elementAt(this.var_int_lII1lI1Ill11);
            bl = settingItem.a(-1);
        } else if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            SettingItem settingItem = (SettingItem)this.var_java_util_Vector_lII1lI1Ill11.elementAt(this.var_int_lII1lI1Ill11);
            bl = settingItem.a(1);
        }
        if (bl) {
            SettingItem settingItem = (SettingItem)this.var_java_util_Vector_lII1lI1Ill11.elementAt(this.var_int_lII1lI1Ill11);
            settingItem.a();
            BaseScreen.m();
        }
        if (GameCanvas.var_boolean_c) {
            int n = GameCanvas.var_int_d - 50;
            int n2 = GameCanvas.var_int_e - 140;
            for (int i = 0; i < this.var_java_util_Vector_lII1lI1Ill11.size(); ++i) {
                int n3 = n2 + i * 35;
                SettingItem settingItem = (SettingItem)this.var_java_util_Vector_lII1lI1Ill11.elementAt(i);
                if (!settingItem.a(GameCanvas.f, GameCanvas.g, n, n3)) continue;
                this.var_int_lII1lI1Ill11 = i;
                BaseScreen.m();
                break;
            }
        }
        super.void_b();
    }

    public final void c() {
        GameHelper18.a();
    }

    static {
        var_java_lang_String_arr_a = StringUtils.java_lang_String_arr_a();
    }
}

