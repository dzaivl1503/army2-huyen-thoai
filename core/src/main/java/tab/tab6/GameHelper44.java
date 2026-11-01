/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;

public final class GameHelper44
extends BaseScreen {
    public static GameHelper44 var_game_GameHelper44_a;
    private int var_int_IIl11ll11;
    private int var_int_IlIlllI1I1l;
    private int I1IlIll1Il;
    private int I1IlllII1l;
    private int IIlI11ll1;
    private int Il1lIlII1l;
    private int lll1llll1l;
    private int IlIIl111I1;
    private int I11IlllI;
    private static int IIIl1III1;
    private static int lII1l1I1;
    private static int[] var_int_arr_IIl11ll11;
    private static int lIl1IIlIIIl;
    private static int IIIIll1l11;
    private static int IIllI1l1Il;
    private static int I1l11llll;
    private static int[] var_int_arr_IlIlllI1I1l;
    private int I1l1l1IIl1;
    public boolean var_boolean_a;
    private int lllIl1IIII1l = 0;
    private boolean var_boolean_IlIlllI1I1l = false;

    public final void void_a() {
        if (this.var_int_IlIlllI1I1l != this.var_int_IIl11ll11) {
            this.I1IlllII1l = this.var_int_IIl11ll11 - this.var_int_IlIlllI1I1l << 2;
            this.I1IlIll1Il += this.I1IlllII1l;
            this.var_int_IlIlllI1I1l += this.I1IlIll1Il >> 4;
            this.I1IlIll1Il &= 0xF;
        }
    }

    public final void b_() {
        int n;
        this.I1l1l1IIl1 = this.var_boolean_a ? BoardScreen.var_byte_arr_a.length : GameHelper34.var_byte_a - BoardScreen.var_byte_arr_a.length;
        new StringBuffer("M: ").append(this.I1l1l1IIl1);
        IIIl1III1 = this.I1l1l1IIl1;
        this.Il1lIlII1l = GameCanvas.var_int_b / 90;
        this.lll1llll1l = (GameCanvas.var_int_b - this.Il1lIlII1l * 90 >> 1) + 40;
        BattleScreen.var_game_GameHelper16_a = new GameHelper16();
        for (n = 0; n < IIIl1III1; ++n) {
            GameHelper44.var_int_arr_IIl11ll11[n] = n * IIIIll1l11;
        }
        lIl1IIlIIIl = GameCanvas.var_int_b >> 1;
        lII1l1I1 = IIIl1III1 / 2;
        this.I11IlllI = (lIl1IIlIIIl - var_int_arr_IIl11ll11[lII1l1I1]) / 2;
        if (var_int_arr_IlIlllI1I1l == null) {
            int[] nArray = new int[3];
            int[] nArray2 = nArray;
            nArray[1] = 1;
            nArray2[2] = 1;
            var_int_arr_IlIlllI1I1l = new int[]{-50, 100, 190};
            int[] nArray3 = new int[3];
            nArray2 = nArray3;
            nArray3[0] = -20;
            nArray2[2] = 130;
        }
        this.g = new GameCommand(StringUtils.dF(), new ActionListener031(this));
        this.h = new GameCommand(StringUtils.dI(), new ActionListener219());
        this.I11IlllI = GameCanvas.var_int_c - (5 + BaseScreen.var_int_r);
        this.IlIIl111I1 = this.I1l1l1IIl1 / this.Il1lIlII1l;
        if (this.I1l1l1IIl1 % this.Il1lIlII1l != 0) {
            ++this.IlIIl111I1;
        }
        n = this.IlIIl111I1 * 57 + 40;
        this.IIlI11ll1 = n - this.I11IlllI;
        if (this.IIlI11ll1 < 0) {
            this.IIlI11ll1 = 0;
        }
        this.l1llIll1IlII();
        super.b_();
    }

    protected final void e() {
        int n;
        GameCanvas.b(StringUtils.aV());
        int n2 = n = this.var_boolean_a ? GameHelper34.var_byte_a - BoardScreen.var_byte_arr_a.length : 0;
        if (lII1l1I1 < this.I1l1l1IIl1 && (n += lII1l1I1) != -1) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().e((byte)n);
            GameCanvas.c(StringUtils.ds());
        }
    }

    public final void a(Graphics graphics) {
        ClanScreen.c(graphics);
        graphics.setClip(0, 20, GameCanvas.var_int_b, GameCanvas.var_int_c - 20);
        graphics.translate(0, -this.var_int_IlIlllI1I1l);
        int n = this.var_boolean_a ? GameHelper34.var_byte_a - BoardScreen.var_byte_arr_a.length : 0;
        for (int i = 0; i < this.I1l1l1IIl1; ++i) {
            int n2 = i % this.Il1lIlII1l;
            int n3 = i / this.Il1lIlII1l;
            n2 = n2 * 90 + this.lll1llll1l;
            n3 = n3 * 57 + 60;
            if (i == lII1l1I1) {
                graphics.setColor(3684546);
                graphics.fillRect(n2 - (IIllI1l1Il >> 1) - 5, n3 - (I1l11llll >> 1) - 5, IIllI1l1Il + 10, I1l11llll + 10);
            }
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(n2 - (IIllI1l1Il >> 1) + 1, n3 - (I1l11llll >> 1) + 1, IIllI1l1Il - 2, I1l11llll - 2);
            try {
                if (BoardScreen.var_javax_microedition_lcdui_Image_arr_a[i + n] == null) continue;
                graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_arr_a[i + n], n2, n3, 3);
                graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_b, n2, n3, 3);
                continue;
            }
            catch (Exception exception) {}
        }
        graphics.setClip(0, 0, 1000, 1000);
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setColor(1133755);
        graphics.fillRect(0, 0, GameCanvas.var_int_b, 20);
        if (lII1l1I1 >= 0) {
            FontRenderer.e.a(graphics, lII1l1I1 + 1 + ". " + GameHelper34.var_java_lang_String_arr_a[lII1l1I1 + n], GameCanvas.var_int_b >> 1, 2, 2);
        }
        super.a(graphics);
    }

    private void l1llIll1IlII() {
        int n;
        this.var_int_IIl11ll11 = n = lII1l1I1 / this.Il1lIlII1l * 57 + 60 - (GameCanvas.var_int_c / 2 - BaseScreen.var_int_r);
        if (this.var_int_IIl11ll11 > this.IIlI11ll1) {
            this.var_int_IIl11ll11 = this.IIlI11ll1;
        }
        if (this.var_int_IIl11ll11 < 0) {
            this.var_int_IIl11ll11 = 0;
        }
        if (lII1l1I1 == this.I1l1l1IIl1 - 1 || lII1l1I1 == 0) {
            this.var_int_IlIlllI1I1l = this.var_int_IIl11ll11;
        }
    }

    public final void void_b() {
        try {
            super.void_b();
            if (GameCanvas.var_boolean_arr_a[2]) {
                if ((lII1l1I1 -= this.Il1lIlII1l) < 0) {
                    lII1l1I1 = this.I1l1l1IIl1 - 1;
                }
                this.l1llIll1IlII();
            }
            if (GameCanvas.var_boolean_arr_a[8]) {
                if ((lII1l1I1 += this.Il1lIlII1l) > this.I1l1l1IIl1 - 1) {
                    lII1l1I1 = 0;
                }
                this.l1llIll1IlII();
            }
            if (GameCanvas.var_boolean_arr_a[4]) {
                if (--lII1l1I1 < 0) {
                    lII1l1I1 = IIIl1III1 - 1;
                }
                this.I11IlllI = (lIl1IIlIIIl - var_int_arr_IIl11ll11[lII1l1I1]) / 2;
                this.l1llIll1IlII();
            }
            if (GameCanvas.var_boolean_arr_a[6]) {
                if (++lII1l1I1 >= IIIl1III1) {
                    lII1l1I1 = 0;
                }
                this.I11IlllI = (lIl1IIlIIIl - var_int_arr_IIl11ll11[lII1l1I1]) / 2;
                this.l1llIll1IlII();
            }
            BaseScreen.m();
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_IlIlllI1I1l) {
                    this.lllIl1IIII1l = this.var_int_IlIlllI1I1l;
                    this.var_boolean_IlIlllI1I1l = true;
                }
                this.var_int_IIl11ll11 = this.lllIl1IIII1l + (GameCanvas.h - GameCanvas.g);
                if (this.var_int_IIl11ll11 < 0) {
                    this.var_int_IIl11ll11 = 0;
                }
                if (this.var_int_IIl11ll11 > this.IIlI11ll1) {
                    this.var_int_IIl11ll11 = this.IIlI11ll1;
                }
            }
            if (GameCanvas.var_boolean_c) {
                this.var_boolean_IlIlllI1I1l = false;
                if (Math.abs(GameCanvas.h - GameCanvas.g) < 10) {
                    int n = BaseScreen.var_int_o + 5;
                    if ((n = (this.var_int_IIl11ll11 + GameCanvas.g - n) / 57 * this.Il1lIlII1l + (GameCanvas.f - 10) / 90) == lII1l1I1) {
                        if (this.g != null) {
                            this.g.var_game_IActionListener_a.a();
                        } else if (this.f != null) {
                            this.f.var_game_IActionListener_a.a();
                        }
                    }
                    lII1l1I1 = n;
                    if (n < 0) {
                        lII1l1I1 = 0;
                    }
                    if (lII1l1I1 >= 0) {
                        lII1l1I1 = -1;
                        return;
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void c() {
        this.void_a();
    }

    static {
        lII1l1I1 = 0;
        IIIIll1l11 = 100;
        IIllI1l1Il = 80;
        I1l11llll = 50;
        IIIl1III1 = GameHelper34.var_byte_a;
        var_int_arr_IIl11ll11 = new int[GameHelper34.var_byte_a];
    }
}

