/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab3;

import javax.microedition.lcdui.Graphics;

public final class GameHelper11 {
    private int[] var_int_arr_I11l11lIlI;
    public int a;
    private int lIlIIIlIII;
    private int I11IlIl1l1l;
    private int IlI1l11IlI;
    private int II11lllIlI;
    public int b;
    private int lllIlIlIIll;
    private int ll11III11;
    private int lll11IlI1Ill;
    private int Il1l1Ill11l;
    private boolean var_boolean_I11l11lIlI;
    private int II1I111I = 4;
    private int IIlIlIll1l = 0;
    private boolean llIIIl1lIlll = false;
    private static int I11I1lllIIl;
    private static int llIIIlIl1;
    private static int I1I1I1I1l1ll;
    private static int ll1lIIl1lIl;
    private int l1IlIl1II;
    private int I11l1II1I1Il;

    public GameHelper11(int[] nArray, int n, int n2) {
        this.var_int_arr_I11l11lIlI = nArray;
        this.lIlIIIlIII = 4;
        this.Il1l1Ill11l = this.var_int_arr_I11l11lIlI.length;
        this.I11IlIl1l1l = this.lIlIIIlIII / 2;
        if (!GameCanvas.var_boolean_d) {
            this.ll11III11 = 16;
            this.II1I111I = 0;
        } else {
            this.ll11III11 = 37;
            this.II1I111I = 9;
        }
        this.lll11IlI1Ill = this.lIlIIIlIII + this.ll11III11;
        this.IlI1l11IlI = n;
        this.II11lllIlI = this.var_int_arr_I11l11lIlI.length / this.IlI1l11IlI;
        if (nArray.length % this.IlI1l11IlI != 0) {
            ++this.II11lllIlI;
        }
        this.b = this.IlI1l11IlI * (this.lIlIIIlIII + this.ll11III11);
        this.lllIlIlIIll = n2 * (this.lIlIIIlIII + this.ll11III11);
        if (GameCanvas.var_boolean_d) {
            this.lllIlIlIIll -= 2;
        }
        this.var_boolean_I11l11lIlI = true;
    }

    public final void a() {
        int n;
        if (GameCanvas.var_boolean_arr_a[2]) {
            BaseScreen.l = false;
            this.a -= this.IlI1l11IlI;
            if (this.a < 0) {
                this.a = 0;
            }
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            BaseScreen.m = false;
            this.a += this.IlI1l11IlI;
            if (this.a > this.var_int_arr_I11l11lIlI.length - 1) {
                this.a = this.var_int_arr_I11l11lIlI.length - 1;
            }
        }
        if (GameCanvas.var_boolean_arr_a[4]) {
            BaseScreen.n = false;
            --this.a;
            if (this.a < 0) {
                this.a = this.var_int_arr_I11l11lIlI.length - 1;
            }
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            BaseScreen.var_boolean_o = false;
            ++this.a;
            if (this.a > this.var_int_arr_I11l11lIlI.length - 1) {
                this.a = 0;
            }
        }
        if (this.var_boolean_I11l11lIlI && (GameCanvas.var_boolean_arr_a[2] || GameCanvas.var_boolean_arr_a[4] || GameCanvas.var_boolean_arr_a[6] || GameCanvas.var_boolean_arr_a[8])) {
            int n2 = this.lIlIIIlIII + this.ll11III11;
            n = this.a / this.IlI1l11IlI * n2;
            if (n + n2 > llIIIlIl1 + this.lllIlIlIIll) {
                I11I1lllIIl = n + n2 - this.lllIlIlIIll;
            } else if (n < llIIIlIl1) {
                I11I1lllIIl = n;
            }
        }
        n = 37 + this.lIlIIIlIII;
        if (GameCanvas.var_boolean_b) {
            if (!this.llIIIl1lIlll) {
                this.IIlIlIll1l = llIIIlIl1;
                this.llIIIl1lIlll = true;
            }
            if ((I11I1lllIIl = this.IIlIlIll1l + (GameCanvas.h - GameCanvas.g)) < 0) {
                I11I1lllIIl = 0;
            }
            if (I11I1lllIIl > this.II11lllIlI * n - this.lllIlIlIIll) {
                I11I1lllIIl = this.II11lllIlI * n - this.lllIlIlIIll;
            }
        }
        if (GameCanvas.var_boolean_c) {
            this.llIIIl1lIlll = false;
            if (Math.abs(GameCanvas.h - GameCanvas.g) < 10 && GameCanvas.a(this.l1IlIl1II, this.I11l1II1I1Il, this.b, this.lllIlIlIIll)) {
                if ((n = (I11I1lllIIl + GameCanvas.g - this.I11l1II1I1Il - this.I11IlIl1l1l) / n * this.IlI1l11IlI + (GameCanvas.f - this.l1IlIl1II - this.I11IlIl1l1l) / n) == this.a) {
                    if (GameCanvas.var_game_BaseScreen_a == ExplosionEffect.var_game_ExplosionEffect_a && ExplosionEffect.var_game_ExplosionEffect_a.f != null) {
                        ExplosionEffect.var_game_ExplosionEffect_a.f.var_game_IActionListener_a.a();
                    }
                    if (GameCanvas.var_game_BaseScreen_a == BoardScreen.var_game_BoardScreen_a && BoardScreen.var_game_BoardScreen_a.g != null) {
                        BoardScreen.var_game_BoardScreen_a.g.var_game_IActionListener_a.a();
                    }
                }
                this.a = n;
                if (this.a < 0) {
                    this.a = 0;
                }
                if (this.a > this.var_int_arr_I11l11lIlI.length - 1) {
                    this.a = this.var_int_arr_I11l11lIlI.length - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.var_boolean_I11l11lIlI && llIIIlIl1 != I11I1lllIIl) {
            ll1lIIl1lIl = I11I1lllIIl - llIIIlIl1 << 2;
            llIIIlIl1 += (I1I1I1I1l1ll += ll1lIIl1lIl) >> 4;
            I1I1I1I1l1ll &= 0xF;
        }
    }

    public final void a(int n, int n2, Graphics graphics, int[] nArray) {
        this.l1IlIl1II = n;
        this.I11l1II1I1Il = n2;
        if (this.var_boolean_I11l11lIlI) {
            graphics.setClip(n - 2, n2 - 2, this.b + 4, this.lllIlIlIIll + 18);
            graphics.setColor(4156571);
            graphics.fillRoundRect(n - 2, n2 - 2, this.b + 4, this.lllIlIlIIll + 6, 6, 7);
            graphics.translate(0, -llIIIlIl1);
        }
        graphics.setColor(GameCanvas.var_boolean_d ? 16765769 : (GameCanvas.var_int_a % 5 <= 2 ? 0 : 0xFFFFFF));
        int n3 = GameCanvas.var_boolean_d ? 37 + this.lIlIIIlIII : this.lll11IlI1Ill;
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < this.Il1l1Ill11l; ++i) {
            int n6 = n + n4 * n3 + this.I11IlIl1l1l;
            int n7 = n2 + n5 * n3 + this.I11IlIl1l1l;
            if (this.a == i) {
                graphics.fillRect(n6 - (GameCanvas.var_boolean_d ? 2 : 1), n7 - (GameCanvas.var_boolean_d ? 2 : 1), this.ll11III11 + this.I11IlIl1l1l, this.ll11III11 + this.I11IlIl1l1l);
            }
            graphics.setClip(n, n2 + llIIIlIl1, this.b, this.lllIlIlIIll);
            GameHelper31.a(graphics, this.var_int_arr_I11l11lIlI[i], n6 + this.II1I111I, n7 + this.II1I111I);
            if (nArray[i] >= 0 && i <= nArray.length - 1) {
                FontRenderer.h.a(graphics, String.valueOf(nArray[i]), n6 + 9 + this.II1I111I, n7 + 10 + this.II1I111I, 0);
            }
            if (++n4 <= this.IlI1l11IlI - 1) continue;
            n4 = 0;
            ++n5;
        }
        if (this.var_boolean_I11l11lIlI) {
            graphics.translate(0, llIIIlIl1);
            graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        }
    }
}

