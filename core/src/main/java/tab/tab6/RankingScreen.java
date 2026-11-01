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

public final class RankingScreen {
    private GameHelper29 var_game_GameHelper29_IlIl11lI111I;
    private int var_int_IlIl11lI111I;
    private int var_int_I1Il1IIlI;
    private int var_int_llll1II11ll1;
    private int var_int_lIl1l111l;
    private int var_int_IlI1lI1lIlll;
    private int var_int_I1lllIIIIl1I;
    private int var_int_lllIlII1l;
    private boolean var_boolean_IlIl11lI111I;
    private int var_int_Il1lIIl1Ill;
    private boolean var_boolean_I1Il1IIlI;
    private static Image var_javax_microedition_lcdui_Image_llll1II11ll1;
    private static Image var_javax_microedition_lcdui_Image_lIl1l111l;
    private static Image var_javax_microedition_lcdui_Image_IlI1lI1lIlll;
    private static Image var_javax_microedition_lcdui_Image_I1lllIIIIl1I;
    private static Image var_javax_microedition_lcdui_Image_lllIlII1l;
    private static Image var_javax_microedition_lcdui_Image_Il1lIIl1Ill;
    private static Image var_javax_microedition_lcdui_Image_IIIl1lI1;
    private static Image var_javax_microedition_lcdui_Image_IlII1lIIl1I;
    private static Image var_javax_microedition_lcdui_Image_I11I11I1lI;
    private static Image var_javax_microedition_lcdui_Image_lII11lI1111;
    private static Image var_javax_microedition_lcdui_Image_lI11II1Illl;
    private static Image var_javax_microedition_lcdui_Image_Il11I1ll;
    private static Image var_javax_microedition_lcdui_Image_l1IllllII1I;
    private static Image var_javax_microedition_lcdui_Image_IIlIl11l;
    public static Image a;
    private static Image var_javax_microedition_lcdui_Image_lIllllIII;
    private static Image var_javax_microedition_lcdui_Image_ll11llll1;
    public static Image b;
    private static Image IIIIllII;
    private byte var_byte_IlIl11lI111I;
    private int var_int_IIIl1lI1;
    private int var_int_IlII1lIIl1I;
    private int var_int_I11I11I1lI;
    private int[] var_int_arr_IlIl11lI111I;
    private int[] var_int_arr_I1Il1IIlI;
    private int[] var_int_arr_llll1II11ll1;
    private int var_int_lII11lI1111;
    private int var_int_lI11II1Illl;
    private int var_int_Il11I1ll;
    private int var_int_l1IllllII1I;
    private int var_int_IIlIl11l;
    private boolean var_boolean_llll1II11ll1 = false;
    private int var_int_lIllllIII;
    private boolean var_boolean_lIl1l111l;
    private int var_int_ll11llll1;

    public RankingScreen(int n, int n2, int n3, int n4, int n5) {
        this.var_int_IIIl1lI1 = n;
        this.var_int_IlII1lIIl1I = n2;
        this.var_int_IlIl11lI111I = n3;
        this.var_int_I1Il1IIlI = n4;
        this.var_int_lI11II1Illl = n5;
        this.var_int_lllIlII1l = 0;
        this.var_byte_IlIl11lI111I = (byte)16;
        this.var_boolean_lIl1l111l = true;
        if (n5 == 0) {
            this.var_int_ll11llll1 = 25;
        }
        if (n5 == 1) {
            this.var_int_ll11llll1 = 15;
        }
    }

    public RankingScreen(int n, int n2, byte by) {
        this.var_int_IlIl11lI111I = n;
        this.var_int_I1Il1IIlI = n2;
        this.var_int_IlI1lI1lIlll = n2 - DataUtils.b(60, 80);
        this.var_int_lllIlII1l = 0;
        this.var_byte_IlIl11lI111I = by;
        switch (by) {
            case 0: {
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_llll1II11ll1, 14, 15);
                return;
            }
            case 1: {
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_IlI1lI1lIlll, 12, 13);
                return;
            }
            default: {
                return;
            }
            case 4: 
            case 5: 
            case 18: {
                int n3 = 10;
                if (by == 5) {
                    n3 = 6;
                }
                if (BattleScreen.var_byte_a == 1) {
                    n3 = (byte)(n3 - 4);
                } else if (BattleScreen.var_byte_a == 2) {
                    n3 = (byte)(n3 - 6);
                }
                if (n3 < 3) {
                    n3 = 3;
                }
                this.var_int_I11I11I1lI = DataUtils.b(n3 / 2, n3);
                this.var_int_llll1II11ll1 = BattleScreen.var_int_k / 12;
                this.var_int_lIl1l111l = DataUtils.b(-3, -1);
                this.var_int_lII11lI1111 = 25;
                this.var_int_arr_IlIl11lI111I = new int[this.var_int_I11I11I1lI];
                this.var_int_arr_I1Il1IIlI = new int[this.var_int_I11I11I1lI];
                this.var_int_arr_llll1II11ll1 = new int[this.var_int_I11I11I1lI];
                n3 = 20;
                int n4 = 16;
                if (by == 5) {
                    n3 = 4;
                    n4 = 8;
                }
                for (by = 0; by < this.var_int_I11I11I1lI; by = (byte)(by + 1)) {
                    this.var_int_arr_IlIl11lI111I[by] = DataUtils.b(n - n3, n + n3);
                    this.var_int_arr_I1Il1IIlI[by] = DataUtils.b(n2 - n3 / 2, n2 + n3 / 2);
                    this.var_int_arr_llll1II11ll1[by] = DataUtils.b(6, n4);
                }
                return;
            }
            case 7: {
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_I11I11I1lI, 10, 10);
                return;
            }
            case 11: {
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_l1IllllII1I, 3, 3);
                return;
            }
            case 13: {
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_lII11lI1111, 10, 10);
                return;
            }
            case 15: {
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(a, 27, 27);
                return;
            }
            case 16: {
                this.var_int_IIIl1lI1 = DataUtils.b(GameHelper16.b, GameHelper16.b + GameCanvas.var_int_b);
                this.var_int_IlII1lIIl1I = GameHelper16.c;
                this.var_boolean_lIl1l111l = true;
                return;
            }
            case 19: {
                this.var_int_I1lllIIIIl1I = DataUtils.b(0, 4);
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_lIl1l111l, 14, 15);
                return;
            }
            case 21: {
                this.var_int_I1lllIIIIl1I = DataUtils.b(1, 2);
                this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_ll11llll1, 14, 15);
                return;
            }
            case 22: 
        }
        this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(IIIIllII, 32, 32);
    }

    public RankingScreen(int n, int n2, int n3, int n4, byte by) {
        this.var_int_IlIl11lI111I = n;
        this.var_int_I1Il1IIlI = n2;
        this.var_int_llll1II11ll1 = n3;
        this.var_int_lIl1l111l = n4;
        this.var_byte_IlIl11lI111I = by;
        if (by == 3) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_lllIlII1l, 12, 12);
        } else if (by == 6) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_Il1lIIl1Ill, 16, 10);
        } else if (by == 8) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_IIIl1lI1, 16, 10);
        } else if (by == 12) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_IlII1lIIl1I, 8, 5);
        } else if (by == 9) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_lI11II1Illl, 22, 18);
        } else if (by == 10) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_Il11I1ll, 19, 17);
        } else if (by == 14) {
            this.var_game_GameHelper29_IlIl11lI111I = new GameHelper29(var_javax_microedition_lcdui_Image_IIlIl11l, 16, 10);
        }
        this.var_boolean_IlIl11lI111I = DataUtils.d(3) == 0;
    }

    public static int a(int n, int n2, int n3, int n4) {
        int n5 = -1;
        if (n3 >= n && n4 <= n2) {
            n5 = n3 - n > n2 - n4 ? 1 : 2;
        }
        if (n3 >= n && n4 >= n2) {
            n5 = n3 - n > n4 - n2 ? 1 : 3;
        }
        if (n3 <= n && n4 <= n2) {
            n5 = n - n3 > n2 - n4 ? 0 : 2;
        }
        if (n3 <= n && n4 >= n2) {
            n5 = n - n3 > n4 - n2 ? 0 : 3;
        }
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        int var1_2 = 0;
        int var2_4 = 0;
        int var3_5 = 0;
        switch (this.var_byte_IlIl11lI111I) {
            case 0: 
            case 7: 
            case 11: 
            case 13: {
                if (this.var_int_I1lllIIIIl1I == 3) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.lIl1I1l111();
                return;
            }
            case 1: {
                if (this.var_int_I1lllIIIIl1I == 3) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.lIl1I1l111();
                return;
            }
            case 2: 
            case 3: {
                if (this.var_byte_IlIl11lI111I == 3) {
                    this.lIl1I1l111();
                    if (this.var_int_I1lllIIIIl1I > 3) {
                        this.var_int_I1lllIIIIl1I = 0;
                    }
                }
                if (this.var_int_I1Il1IIlI > GameHelper34.var_int_b) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.var_int_IlIl11lI111I += this.var_int_llll1II11ll1;
                this.var_int_I1Il1IIlI += this.var_int_lIl1l111l;
                ++this.var_int_lIl1l111l;
                if (GameHelper34.var_boolean_a && !this.var_boolean_I1Il1IIlI && GameHelper34.boolean_a(this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, (byte)0)) {
                    this.var_boolean_I1Il1IIlI = true;
                }
                if (!this.var_boolean_IlIl11lI111I) break;
                ++this.var_int_Il1lIIl1Ill;
                if (this.var_int_Il1lIIl1Ill > 2) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, (byte)1);
                    this.var_int_Il1lIIl1Ill = 0;
                }
                return;
            }
            case 4: 
            case 5: 
            case 18: {
                for (int var1_1 = 0; var1_1 < this.var_int_I11I11I1lI; ++var1_1) {
                    this.var_int_arr_IlIl11lI111I[var1_1] += this.var_int_llll1II11ll1;
                    this.var_int_arr_I1Il1IIlI[var1_1] += this.var_int_lIl1l111l;
                    if (this.var_int_arr_I1Il1IIlI[var1_1] >= this.var_int_IlI1lI1lIlll) continue;
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.var_int_lII11lI1111 += 5;
                if (this.var_int_lII11lI1111 <= 255) break;
                this.var_int_lII11lI1111 = 255;
                return;
            }
                        case 6: 
            case 8: 
            case 12: 
            case 14: {
                this.lIl1I1l111();
                if (this.var_int_lIl1l111l > 0) {
                    this.var_int_llll1II11ll1 = BattleScreen.var_int_k / 20;
                    if (this.var_int_I1lllIIIIl1I > 3) {
                        this.var_int_I1lllIIIIl1I = 0;
                    }
                } else {
                    this.var_int_I1lllIIIIl1I = 0;
                }

                if (this.var_int_I1Il1IIlI > GameHelper34.var_int_b) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.var_int_IlIl11lI111I += this.var_int_llll1II11ll1;
                this.var_int_I1Il1IIlI += this.var_int_lIl1l111l;
                if (this.var_int_lIl1l111l >= 2) break;
                ++this.var_int_lIl1l111l;
                return;
            }
            case 9: 
            case 10: 
            case 20: {
                if (this.var_int_I1Il1IIlI > GameHelper34.var_int_b) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.var_int_IlIl11lI111I += this.var_int_llll1II11ll1;
                this.var_int_I1Il1IIlI += this.var_int_lIl1l111l;
                ++this.var_int_lIl1l111l;
                return;
            }
            case 15: {
                if (this.var_int_I1lllIIIIl1I == 3) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                this.lIl1I1l111();
                return;
            }
            case 16: {
                return;
            }
            case 17: {
                ++this.var_int_lllIlII1l;
                if (this.var_int_lllIlII1l == 10) {
                    this.var_int_lllIlII1l = 0;
                }
                this.var_int_I1lllIIIIl1I = this.var_int_lllIlII1l < 5 ? 0 : 1;
                var1_2 = 0 - this.var_int_IlIl11lI111I;
                var2_4 = 0 - this.var_int_I1Il1IIlI;
                if (Math.abs(var1_2) < 16 && Math.abs(var2_4) < 16) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                var3_5 = DataUtils.a(var1_2, var2_4);
                if (Math.abs(var3_5 - this.var_int_Il11I1ll) < 90 || var1_2 * var1_2 + var2_4 * var2_4 > 4096) {
                    this.var_int_Il11I1ll = Math.abs(var3_5 - this.var_int_Il11I1ll) < 15 ? var3_5 : ((var3_5 - this.var_int_Il11I1ll < 0 || var3_5 - this.var_int_Il11I1ll >= 180) && var3_5 - this.var_int_Il11I1ll >= -180 ? DataUtils.c(this.var_int_Il11I1ll - 15) : DataUtils.c(this.var_int_Il11I1ll + 15));
                }
                if (this.var_int_IIlIl11l < 8192) {
                    this.var_int_IIlIl11l += 1024;
                }
                this.var_int_llll1II11ll1 = this.var_int_IIlIl11l * DataUtils.b(this.var_int_Il11I1ll) >> 10;
                this.var_int_lIl1l111l = this.var_int_IIlIl11l * DataUtils.b(this.var_int_Il11I1ll) >> 10;
                var1_2 = var1_2 + this.var_int_llll1II11ll1 >> 10;
                this.var_int_IlIl11lI111I += var1_2;
                var1_2 = var2_4 + this.var_int_lIl1l111l >> 10;
                this.var_int_I1Il1IIlI += var1_2;
                return;
            }
            case 19: {
                if (!this.var_boolean_llll1II11ll1) {
                    ++this.var_int_lIllllIII;
                    if (this.var_int_lIllllIII == 10) {
                        this.var_int_lIllllIII = 0;
                        this.var_boolean_llll1II11ll1 = true;
                    }
                    if (this.var_int_I1lllIIIIl1I > 4) {
                        this.var_int_I1lllIIIIl1I = 0;
                    }
                    if (GameCanvas.var_int_a % 2 != 0) break;
                    ++this.var_int_I1lllIIIIl1I;
                    return;
                }
                if (GameCanvas.var_int_a % 2 != 0) break;
                if (this.var_int_I1lllIIIIl1I == 7) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                ++this.var_int_I1lllIIIIl1I;
                return;
            }
            case 21: {
                if (this.var_int_I1lllIIIIl1I == 7) {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                    return;
                }
                ++this.var_int_I1lllIIIIl1I;
                return;
            }
            case 22: {
                if (this.var_int_I1lllIIIIl1I == 3) {
                    this.var_int_I1lllIIIIl1I = 0;
                }
                ++this.var_int_l1IllllII1I;
                if (this.var_int_l1IllllII1I == 50) {
                    this.var_int_l1IllllII1I = 0;
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this);
                }
                this.lIl1I1l111();
                return;
            }
        }
    }

    private void lIl1I1l111() {
        ++this.var_int_lllIlII1l;
        if (this.var_int_lllIlII1l > 1) {
            ++this.var_int_I1lllIIIIl1I;
            this.var_int_lllIlII1l = 0;
        }
    }

    public final void a(Graphics graphics) {
        switch (this.var_byte_IlIl11lI111I) {
            case 0: 
            case 1: 
            case 7: 
            case 13: 
            case 15: 
            case 19: 
            case 21: {
                this.var_game_GameHelper29_IlIl11lI111I.a(this.var_int_I1lllIIIIl1I, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 0, 3, graphics);
                return;
            }
            case 2: {
                graphics.drawImage(var_javax_microedition_lcdui_Image_I1lllIIIIl1I, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 3);
                return;
            }
            case 3: {
                this.var_game_GameHelper29_IlIl11lI111I.a(this.var_int_I1lllIIIIl1I, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 0, 3, graphics);
                return;
            }
            case 4: 
            case 5: {
                for (int i = 0; i < this.var_int_I11I11I1lI; ++i) {
                    int n = DataUtils.b(this.var_int_lII11lI1111 - 20, this.var_int_lII11lI1111);
                    graphics.setColor(n, n, n);
                    graphics.fillArc(this.var_int_arr_IlIl11lI111I[i], this.var_int_arr_I1Il1IIlI[i], this.var_int_arr_llll1II11ll1[i], this.var_int_arr_llll1II11ll1[i], 0, 360);
                }
                return;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: {
                this.var_game_GameHelper29_IlIl11lI111I.a(this.var_int_I1lllIIIIl1I, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 0, 3, graphics);
                return;
            }
            case 16: {
                if (!this.var_boolean_lIl1l111l) break;
                for (int i = 0; i < this.var_int_ll11llll1; ++i) {
                    if (i < this.var_int_ll11llll1 / 2 + this.var_int_ll11llll1 / 4 && i > this.var_int_ll11llll1 / 2 - this.var_int_ll11llll1 / 4) {
                        graphics.setColor(0xFFFFFF);
                    } else {
                        if (this.var_int_lI11II1Illl == 1) {
                            graphics.setColor(718162);
                        }
                        if (this.var_int_lI11II1Illl == 0) {
                            graphics.setColor(0xFF4646);
                        }
                    }
                    graphics.drawLine(this.var_int_IIIl1lI1 - this.var_int_ll11llll1 / 2 + i, this.var_int_IlII1lIIl1I, this.var_int_IlIl11lI111I - this.var_int_ll11llll1 / 2 + i, this.var_int_I1Il1IIlI);
                }
                --this.var_int_ll11llll1;
                if (this.var_int_ll11llll1 != 0) break;
                this.var_boolean_lIl1l111l = false;
                BattleScreen.var_game_BattleGraphicHelper_a.a(graphics);
                return;
            }
            case 17: {
                this.var_game_GameHelper29_IlIl11lI111I.a(this.var_int_I1lllIIIIl1I, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 0, 3, graphics);
                return;
            }
            case 18: {
                for (int i = 0; i < this.var_int_I11I11I1lI; ++i) {
                    int n = DataUtils.b(190, 200);
                    graphics.setColor(n, n, n);
                    graphics.fillArc(this.var_int_arr_IlIl11lI111I[i], this.var_int_arr_I1Il1IIlI[i], this.var_int_arr_llll1II11ll1[i], this.var_int_arr_llll1II11ll1[i], 0, 360);
                }
                return;
            }
            case 20: {
                graphics.drawImage(var_javax_microedition_lcdui_Image_lIllllIII, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 3);
                return;
            }
            case 22: {
                this.var_game_GameHelper29_IlIl11lI111I.a(this.var_int_I1lllIIIIl1I, this.var_int_IlIl11lI111I, this.var_int_I1Il1IIlI, 0, 33, graphics);
            }
        }
    }

    static {
        Object object = new GameHelper28("/effect/effect");
        var_javax_microedition_lcdui_Image_llll1II11ll1 = ((GameHelper28)object).a("smoke.png");
        var_javax_microedition_lcdui_Image_lIl1l111l = ((GameHelper28)object).a("smoke2.png");
        var_javax_microedition_lcdui_Image_IIIl1lI1 = ((GameHelper28)object).a("longga.png");
        var_javax_microedition_lcdui_Image_IlI1lI1lIlll = ((GameHelper28)object).a("blacksmoke.png");
        var_javax_microedition_lcdui_Image_I11I11I1lI = ((GameHelper28)object).a("blueSmoke.png");
        var_javax_microedition_lcdui_Image_lI11II1Illl = ((GameHelper28)object).a("chuotbay.png");
        var_javax_microedition_lcdui_Image_Il11I1ll = ((GameHelper28)object).a("gatruilong.png");
        var_javax_microedition_lcdui_Image_l1IllllII1I = ((GameHelper28)object).a("water.png");
        GameHelper09.var_javax_microedition_lcdui_Image_a = ((GameHelper28)object).a("locxoay.png");
        var_javax_microedition_lcdui_Image_IlII1lIIl1I = ((GameHelper28)object).a("lacay.png");
        var_javax_microedition_lcdui_Image_lII11lI1111 = ((GameHelper28)object).a("blueSmoke2.png");
        var_javax_microedition_lcdui_Image_IIlIl11l = ((GameHelper28)object).a("lacay2.png");
        a = ((GameHelper28)object).a("khoi.png");
        var_javax_microedition_lcdui_Image_ll11llll1 = ((GameHelper28)object).a("smokeFire.png");
        b = ((GameHelper28)object).a("lua.png");
        object = new GameHelper28("/map/bg");
        var_javax_microedition_lcdui_Image_I1lllIIIIl1I = ((GameHelper28)object).a("rock1.png");
        var_javax_microedition_lcdui_Image_lllIlII1l = ((GameHelper28)object).a("rock2.png");
        var_javax_microedition_lcdui_Image_Il1lIIl1Ill = ((GameHelper28)object).a("cobay.png");
        try {
            var_javax_microedition_lcdui_Image_lIllllIII = Image.createImage((String)"/effect/star.png");
            IIIIllII = Image.createImage((String)"/effect/locxoay.png");
        } catch (Exception e) {
        }
    }
}

