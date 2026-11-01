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

public final class ChatEntity
extends BaseScreen {
    public static ChatEntity var_game_ChatEntity_a;
    private BaseScreen var_game_BaseScreen_lII11IIIll1;
    private static String[] var_java_lang_String_arr_lII11IIIll1;
    private static int[][] var_int_arr_arr_lII11IIIll1;
    private static Image var_javax_microedition_lcdui_Image_lII11IIIll1;
    public static int var_int_a;
    private int var_int_I11lIlll1Il = GameCanvas.var_int_b / 2 - 50;
    private int[] var_int_arr_I11lIlll1Il;
    private int l111I1111IlI;
    private int I1IIlIll = 10;
    public static int var_int_b;
    public static byte[] var_byte_arr_a;
    public static int[] var_int_arr_a;
    public static int[] var_int_arr_b;
    public static byte[] var_byte_arr_b;
    public static byte[] c;
    private EquipSlotSet[] var_game_EquipSlotSet_arr_lII11IIIll1 = new EquipSlotSet[10];
    private boolean var_boolean_lII11IIIll1;

    public ChatEntity() {
        ChatEntity.var_int_arr_arr_lII11IIIll1[0] = new int[]{c[0], var_byte_arr_b[0], ShopScreen.var_byte_arr_a[0]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[1] = new int[]{c[1], var_byte_arr_b[1], ShopScreen.var_byte_arr_a[1]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[2] = new int[]{c[2], var_byte_arr_b[2], ShopScreen.var_byte_arr_a[2]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[3] = new int[]{c[3], var_byte_arr_b[3], ShopScreen.var_byte_arr_a[3]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[4] = new int[]{c[4], var_byte_arr_b[4], ShopScreen.var_byte_arr_a[4]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[5] = new int[]{c[5], var_byte_arr_b[5], ShopScreen.var_byte_arr_a[5]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[6] = new int[]{c[6], var_byte_arr_b[6], ShopScreen.var_byte_arr_a[6]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[7] = new int[]{c[7], var_byte_arr_b[7], ShopScreen.var_byte_arr_a[7]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[8] = new int[]{c[8], var_byte_arr_b[8], ShopScreen.var_byte_arr_a[8]};
        ChatEntity.var_int_arr_arr_lII11IIIll1[9] = new int[]{c[9], var_byte_arr_b[9], 0};
        this.h = new GameCommand(StringUtils.dI(), new ActionListener115(this));
        int n = (GameCanvas.var_int_b >> 1) - this.I1IIlIll * (24 + this.var_int_I11lIlll1Il) / 2;
        this.var_int_arr_I11lIlll1Il = new int[this.I1IIlIll];
        for (int i = 0; i < this.I1IIlIll; ++i) {
            this.var_int_arr_I11lIlll1Il[i] = n + i * this.var_int_I11lIlll1Il;
        }
        this.l111I1111IlI = GameCanvas.var_int_b >> 1;
    }

    protected final void d() {
        this.var_game_BaseScreen_lII11IIIll1.b_();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e() {
        if (var_byte_arr_a[var_int_a] != 0) {
            this.g = new GameCommand(StringUtils.dF(), new ActionListener182());
            return;
        }
        GameCommand gameCommand = new GameCommand(StringUtils.af(), new ActionListener094());
        GameCommand gameCommand2 = new GameCommand(StringUtils.ae(), new ActionListener158());
        gameCommand2 = new GameCommand(StringUtils.dF(), new ActionListener187(gameCommand, gameCommand2));
        if (var_int_arr_b[var_int_a] != -1) {
            this.g = gameCommand2;
            return;
        }
        this.g = gameCommand;
    }

    public final void a(BaseScreen screen) {
        this.var_game_BaseScreen_lII11IIIll1 = screen;
        GameCanvas.var_java_util_Vector_a.removeAllElements();
        GameCanvas.var_game_TimerHUD_a.var_int_a = 0;
        PlayerAccountInfo myInfo = TerrainMidlet.myInfo;
        for (short s = 0; s < 10; s = (short)((short)(s + 1))) {
            boolean bl = TerrainMidlet.isVip[s];
            this.var_game_EquipSlotSet_arr_lII11IIIll1[s] = new EquipSlotSet(new short[][]{{s, 0, bl ? myInfo.var_short_arr_arr_b[s][0] : myInfo.var_short_arr_arr_a[s][0]}, {s, 1, bl ? myInfo.var_short_arr_arr_b[s][1] : myInfo.var_short_arr_arr_a[s][1]}, {s, 2, bl ? myInfo.var_short_arr_arr_b[s][2] : myInfo.var_short_arr_arr_a[s][2]}, {s, 3, bl ? myInfo.var_short_arr_arr_b[s][3] : myInfo.var_short_arr_arr_a[s][3]}, {s, 4, bl ? myInfo.var_short_arr_arr_b[s][4] : myInfo.var_short_arr_arr_a[s][4]}});
        }
        this.e();
        super.b_();
    }

    public final void void_b() {
        int n;
        int n2;
        if (GameCanvas.var_boolean_arr_a[4]) {
            var_int_a = this.IllI1111II(var_int_a);
            n2 = this.IllI1111II(var_int_a);
            n = this.IllI1111II(n2);
            this.var_int_arr_I11lIlll1Il[n2] = this.var_int_arr_I11lIlll1Il[var_int_a] - this.var_int_I11lIlll1Il;
            this.var_int_arr_I11lIlll1Il[n] = this.var_int_arr_I11lIlll1Il[var_int_a] - (this.var_int_I11lIlll1Il << 1);
            this.e();
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            var_int_a = this.I1111l11(var_int_a);
            n2 = this.I1111l11(var_int_a);
            n = this.I1111l11(n2);
            this.var_int_arr_I11lIlll1Il[n2] = this.var_int_arr_I11lIlll1Il[var_int_a] + this.var_int_I11lIlll1Il;
            this.var_int_arr_I11lIlll1Il[n] = this.var_int_arr_I11lIlll1Il[var_int_a] + (this.var_int_I11lIlll1Il << 1);
            this.e();
        }
        if (GameCanvas.var_boolean_c) {
            if (GameCanvas.a(0, 0, GameCanvas.var_int_b / 2 - 30, GameCanvas.var_int_c - BaseScreen.var_int_r)) {
                var_int_a = this.IllI1111II(var_int_a);
                n2 = this.IllI1111II(var_int_a);
                n = this.IllI1111II(n2);
                this.var_int_arr_I11lIlll1Il[n2] = this.var_int_arr_I11lIlll1Il[var_int_a] - this.var_int_I11lIlll1Il;
                this.var_int_arr_I11lIlll1Il[n] = this.var_int_arr_I11lIlll1Il[var_int_a] - (this.var_int_I11lIlll1Il << 1);
                this.e();
            }
            if (GameCanvas.a(GameCanvas.var_int_b / 2 + 30, 0, GameCanvas.var_int_b / 2 - 30, GameCanvas.var_int_c - BaseScreen.var_int_r)) {
                var_int_a = this.I1111l11(var_int_a);
                n2 = this.I1111l11(var_int_a);
                n = this.I1111l11(n2);
                this.var_int_arr_I11lIlll1Il[n2] = this.var_int_arr_I11lIlll1Il[var_int_a] + this.var_int_I11lIlll1Il;
                this.var_int_arr_I11lIlll1Il[n] = this.var_int_arr_I11lIlll1Il[var_int_a] + (this.var_int_I11lIlll1Il << 1);
                this.e();
            }
            if (GameCanvas.a(GameCanvas.var_int_b / 2 - 30, 0, 60, GameCanvas.var_int_c - BaseScreen.var_int_r)) {
                this.g.var_game_IActionListener_a.a();
            }
        }
        super.void_b();
        BaseScreen.m();
    }

    public final void c() {
        GameHelper18.a();
        this.var_boolean_lII11IIIll1 = false;
        int n = Math.max(Math.abs(this.l111I1111IlI - this.var_int_arr_I11lIlll1Il[var_int_a] >> 1), 1);
        if (this.var_int_arr_I11lIlll1Il[var_int_a] < this.l111I1111IlI) {
            int n2 = 0;
            while (n2 < this.I1IIlIll) {
                int[] nArray;
                int[] nArray2 = nArray = this.var_int_arr_I11lIlll1Il;
                int n3 = n2++;
                nArray2[n3] = nArray2[n3] + n;
            }
        } else {
            if (this.var_int_arr_I11lIlll1Il[var_int_a] <= this.l111I1111IlI) {
                this.var_boolean_lII11IIIll1 = true;
                return;
            }
            int n4 = 0;
            while (n4 < this.I1IIlIll) {
                int[] nArray;
                int[] nArray3 = nArray = this.var_int_arr_I11lIlll1Il;
                int n5 = n4++;
                nArray3[n5] = nArray3[n5] - n;
            }
        }
    }

    public final void a(Graphics graphics) {
        int n;
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        int n2 = GameCanvas.var_int_c >> 1;
        FontRenderer.f.a(graphics, BoardScreen.var_java_lang_String_arr_a[var_int_a], GameCanvas.var_int_b / 2, n2 - 62, 2);
        int n3 = n2 - 11;
        for (n = 0; n < this.I1IIlIll; ++n) {
            this.var_game_EquipSlotSet_arr_lII11IIIll1[n].a(graphics, 0, 0, this.var_int_arr_I11lIlll1Il[n], n3);
            if (var_byte_arr_a[n] != 0) continue;
            graphics.drawImage(var_javax_microedition_lcdui_Image_lII11IIIll1, this.var_int_arr_I11lIlll1Il[n], n3 + 5, 17);
            if (var_int_a != n) continue;
            String string = DataUtils.a((long)var_int_arr_a[var_int_a]) + " " + StringUtils.aq();
            String string2 = DataUtils.a((long)var_int_arr_b[var_int_a]) + " " + StringUtils.ar();
            if (var_int_arr_b[var_int_a] == -1) {
                string2 = "";
            }
            FontRenderer.e.a(graphics, string + "-" + string2, this.var_int_arr_I11lIlll1Il[n], n3 + 30, 2);
            this.var_boolean_lII11IIIll1 = false;
        }
        if (this.var_boolean_lII11IIIll1) {
            n = GameCanvas.var_int_b / 2 - 60;
            FontRenderer.e.a(graphics, var_java_lang_String_arr_lII11IIIll1[0] + var_int_arr_arr_lII11IIIll1[var_int_a][0], n, (n2 -= 4) + 20, 0);
            FontRenderer.e.a(graphics, var_java_lang_String_arr_lII11IIIll1[1], n, n2 + 34, 0);
            FontRenderer.e.a(graphics, var_java_lang_String_arr_lII11IIIll1[2], n, n2 + 48, 0);
            graphics.setColor(0);
            graphics.fillRect(n + 70, n2 + 38, 50, 10);
            graphics.fillRect(n + 70, n2 + 52, 50, 10);
            graphics.setColor(0x4A4A4A);
            graphics.fillRect(n + 72, n2 + 40, 46, 6);
            graphics.fillRect(n + 72, n2 + 54, 46, 6);
            graphics.setColor(16741888);
            graphics.fillRect(n + 72, n2 + 40, var_int_arr_arr_lII11IIIll1[var_int_a][1] * 46 / 35, 6);
            graphics.fillRect(n + 72, n2 + 54, var_int_arr_arr_lII11IIIll1[var_int_a][2] * 46 / 100, 6);
        }
        graphics.setColor(0xFFFFFF);
        super.a(graphics);
    }

    public final void f() {
        if (!TerrainMidlet.isVip[TerrainMidlet.myInfo.var_byte_a]) {
            TerrainMidlet.myInfo.var_game_EquipSlotSet_a = this.var_game_EquipSlotSet_arr_lII11IIIll1[var_int_a];
        } else {
            TerrainMidlet.myInfo.var_game_EquipSlotSet_b = this.var_game_EquipSlotSet_arr_lII11IIIll1[var_int_a];
        }
        this.var_game_BaseScreen_lII11IIIll1.b_();
    }

    private int I1111l11(int n) {
        if (n + 1 > this.I1IIlIll - 1) {
            return 0;
        }
        return n + 1;
    }

    private int IllI1111II(int n) {
        if (n - 1 < 0) {
            return this.I1IIlIll - 1;
        }
        return n - 1;
    }

    static {
        var_java_lang_String_arr_lII11IIIll1 = new String[]{StringUtils.de() + "          ", StringUtils.dd() + "   ", StringUtils.dc() + "  "};
        var_int_arr_arr_lII11IIIll1 = new int[10][];
        var_int_a = 2;
        var_int_b = 3;
        var_byte_arr_a = new byte[10];
        var_int_arr_a = new int[10];
        var_int_arr_b = new int[10];
        var_javax_microedition_lcdui_Image_lII11IIIll1 = BattleScreen.var_javax_microedition_lcdui_Image_d;
    }
}

