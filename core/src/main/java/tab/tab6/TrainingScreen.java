/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab6;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class TrainingScreen {
    private int[] var_int_arr_IllIlI11l;
    private int[] Il111IIlI1l1;
    private int[] lIllIl11Ill;
    private int[] Ill11IlllII;
    private static Image var_javax_microedition_lcdui_Image_IllIlI11l;
    private int[] II1I1lIIII;
    private int Illl1ll1;
    private int I1IIlIIl1l;
    private boolean[] var_boolean_arr_IllIlI11l;
    public int a = 0;
    public int b = 99;
    public int c = 100;
    public int d = 15;
    public int e = 20;
    public int f = 7;

    public final void a(int n) {
        this.I1IIlIIl1l = n;
        if (this.I1IIlIIl1l == 0) {
            this.Illl1ll1 = DataUtils.b(150, 200);
        }
        if (this.I1IIlIIl1l == 1) {
            this.Illl1ll1 = DataUtils.b(this.b, this.c);
        }
        if (var_javax_microedition_lcdui_Image_IllIlI11l == null) {
            try {
                var_javax_microedition_lcdui_Image_IllIlI11l = Image.createImage((String)"/tuyet.png");
            } catch (Exception e) {
            }
        }
        this.var_int_arr_IllIlI11l = new int[this.Illl1ll1];
        this.Il111IIlI1l1 = new int[this.Illl1ll1];
        this.lIllIl11Ill = new int[this.Illl1ll1];
        this.Ill11IlllII = new int[this.Illl1ll1];
        this.II1I1lIIII = new int[this.Illl1ll1];
        this.var_boolean_arr_IllIlI11l = new boolean[this.Illl1ll1];
        for (n = 0; n < this.Illl1ll1; ++n) {
            this.var_int_arr_IllIlI11l[n] = DataUtils.b(-10, GameHelper34.var_int_a);
            this.Il111IIlI1l1[n] = DataUtils.b(-100, GameHelper34.var_int_b - this.a);
            this.lIllIl11Ill[n] = 0;
            if (this.I1IIlIIl1l == 0) {
                this.Ill11IlllII[n] = DataUtils.b(1, 3);
            }
            if (this.I1IIlIIl1l == 1) {
                this.Ill11IlllII[n] = DataUtils.b(this.d, this.e);
            }
            this.II1I1lIIII[n] = DataUtils.b(1, 3);
            if (this.II1I1lIIII[n] != 2 || n % 2 != 0) continue;
            this.var_boolean_arr_IllIlI11l[n] = true;
        }
    }

    public final void a() {
        for (int i = 0; i < this.Illl1ll1; ++i) {
            int[] nArray;
            int[] nArray2 = nArray = this.Il111IIlI1l1;
            int n = i;
            nArray2[n] = nArray2[n] + this.Ill11IlllII[i];
            if (this.I1IIlIIl1l == 0) {
                this.lIllIl11Ill[i] = BattleScreen.var_int_k >> 4;
            }
            if (this.I1IIlIIl1l == 1) {
                this.lIllIl11Ill[i] = BattleScreen.var_int_k == 0 ? 1 : (BattleScreen.var_int_k <= 0 ? -this.f : this.f);
                continue;
            }
            nArray = this.var_int_arr_IllIlI11l;
            int[] nArray3 = nArray;
            int n2 = i;
            nArray3[n2] = nArray3[n2] + this.lIllIl11Ill[i];
            if (this.Il111IIlI1l1[i] >= -200 && this.Il111IIlI1l1[i] <= ClanScreen.var_int_a + 40 && this.var_int_arr_IllIlI11l[i] <= GameHelper34.var_int_a && this.var_int_arr_IllIlI11l[i] >= -10) continue;
            if (this.Il111IIlI1l1[i] > ClanScreen.var_int_a + 40) {
                new ChatScreen(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], 6);
            }
            this.var_int_arr_IllIlI11l[i] = DataUtils.b(-10, GameHelper34.var_int_a);
            this.Il111IIlI1l1[i] = DataUtils.b(-100, ClanScreen.var_int_a + 40);
        }
    }

    public final void a(Graphics graphics) {
        for (int i = 0; i < this.Illl1ll1; ++i) {
            if (this.II1I1lIIII[i] != 2) continue;
            if (this.I1IIlIIl1l == 0) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_IllIlI11l, this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], 0);
            }
            if (this.I1IIlIIl1l != 1) continue;
            graphics.setColor(0xF3F3F3);
            int n = Math.abs(BattleScreen.var_int_k);
            int n2 = BattleScreen.var_int_k;
            if (n == 0) {
                graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + 1, this.Il111IIlI1l1[i] + 4);
            }
            if (n <= 0) continue;
            graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + (n2 <= 0 ? -4 : 4), this.Il111IIlI1l1[i] + 4);
            graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + (n2 <= 0 ? -3 : 3), this.Il111IIlI1l1[i] + 4);
        }
    }

    public final void b(Graphics graphics) {
        for (int i = 0; i < this.Illl1ll1; ++i) {
            if (this.I1IIlIIl1l != 1) continue;
            graphics.setColor(0xA6A6A6);
            int n = Math.abs(BattleScreen.var_int_k);
            int n2 = BattleScreen.var_int_k;
            if (n == 0) {
                graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + 1, this.Il111IIlI1l1[i] + 2);
            }
            if (n <= 0) continue;
            graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + (n2 <= 0 ? -2 : 2), this.Il111IIlI1l1[i] + 2);
        }
    }

    public final void c(Graphics graphics) {
        graphics.setColor(10742731);
        for (int i = 0; i < this.Illl1ll1; ++i) {
            if (this.II1I1lIIII[i] == 2) continue;
            if (this.I1IIlIIl1l == 0) {
                graphics.fillRect(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], 2, 2);
            }
            if (this.I1IIlIIl1l != 1) continue;
            graphics.setColor(0xB5B6B6);
            int n = Math.abs(BattleScreen.var_int_k);
            int n2 = BattleScreen.var_int_k;
            if (n == 0) {
                graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + 1, this.Il111IIlI1l1[i] + 2);
            }
            if (n <= 0) continue;
            graphics.drawLine(this.var_int_arr_IllIlI11l[i], this.Il111IIlI1l1[i], this.var_int_arr_IllIlI11l[i] + (n2 <= 0 ? -2 : 2), this.Il111IIlI1l1[i] + 2);
        }
    }
}

