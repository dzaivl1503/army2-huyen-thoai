/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ClanScreen {
    public static Image var_javax_microedition_lcdui_Image_a;
    private static Image llI11IIll;
    private static Image Il11l11l;
    private static Image l1ll1l1IIIl;
    public static Image var_javax_microedition_lcdui_Image_b;
    public static Image var_javax_microedition_lcdui_Image_c;
    private static Image I1IlIlII1;
    private static Image I11I1llIllI;
    private static Image lI1l1I111I1l;
    private static Image lll1llII;
    private static Image l11lllI1l;
    private static Image lI1IIl11I;
    private static Image II11lIl1lI;
    private static Image IIllI1ll1llI;
    private static Image llIl1I1lIll;
    private static Image III1lIII;
    private static Image lII1l1111;
    private static Image III11III1I1;
    private static Image II1l1IIlI;
    private static Image IIll11lIlI;
    private static Image l11II111I11;
    private static Image lllIII11l;
    private static Image Il11IllIlI;
    private static Image Il1I11l1;
    private static Image ll1lllI1I;
    public static Image var_javax_microedition_lcdui_Image_d;
    public static Image e;
    public static Image f;
    public static Image g;
    public static Image h;
    private static Image lllII1I1lI;
    private static Image IlIllIl1;
    public static Image i;
    private static Image lIIllIIlI;
    private static Image ll1l1lI11;
    private static Image lI111lll;
    private static GameHelper29 var_game_GameHelper29_lIll1lIl;
    private static int var_int_lII1lI1Illl;
    private static int var_int_l111I1ll11I;
    private int var_int_lllllII1l;
    private int IlII1Il1l11l;
    public static int var_int_a;
    public static int var_int_b;
    private int[] var_int_arr_lIll1lIl = new int[]{52, 110, 250};
    private int[] IlIlII11ll = new int[]{100, 180, 150};
    private int[] lIl1Il1I11l = new int[]{45, 40, 50};
    private int[] l1lll1Ill1Il = new int[]{100, 200, 300};
    private int[] var_int_arr_lII1lI1Illl = new int[]{80, 50, 100};
    private TrainingScreen var_game_TrainingScreen_lIll1lIl;
    private int l1I1I1lI1l;
    private static int[] var_int_arr_l111I1ll11I;
    private static int[] var_int_arr_lllllII1l;
    public static byte var_byte_a;
    public int var_int_c = 0;
    public int var_int_d = 130;

    public static void a() {
        Il11l11l = null;
        I1IlIlII1 = null;
        lll1llII = null;
        l11lllI1l = null;
        lI1IIl11I = null;
        II11lIl1lI = null;
        IIllI1ll1llI = null;
        llIl1I1lIll = null;
        III1lIII = null;
        lII1l1111 = null;
        III11III1I1 = null;
        II1l1IIlI = null;
        IIll11lIlI = null;
        l11II111I11 = null;
        lllIII11l = null;
        Il11IllIlI = null;
        Il1I11l1 = null;
        ll1lllI1I = null;
        lllII1I1lI = null;
        IlIllIl1 = null;
        lIIllIIlI = null;
        ll1l1lI11 = null;
        lI111lll = null;
    }

    public ClanScreen(byte by) {
        ClanScreen.a();
        var_byte_a = by;
        var_game_GameHelper29_lIll1lIl = new GameHelper29(var_javax_microedition_lcdui_Image_b, 24, 24);
        var_int_b = GameHelper34.var_int_b - I11I1llIllI.getHeight();
        var_int_lII1lI1Illl = GameCanvas.var_int_b - 60;
        var_int_l111I1ll11I = GameCanvas.var_int_c - 210;
        switch (by) {
            case 0: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 128;
                break;
            }
            case 1: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 72;
                break;
            }
            case 2: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 64;
                break;
            }
            case 3: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 72;
                break;
            }
            case 4: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 241;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 226;
                break;
            }
            case 5: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 241;
                break;
            }
            case 6: 
            case 10: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 238;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 225;
                break;
            }
            case 7: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 219;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 218;
                break;
            }
            case 8: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 219;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 210;
            }
            default: {
                break;
            }
            case 12: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 108;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 108;
                this.var_game_TrainingScreen_lIll1lIl = new TrainingScreen();
                this.var_game_TrainingScreen_lIll1lIl.b = 300;
                this.var_game_TrainingScreen_lIll1lIl.c = 400;
                this.var_game_TrainingScreen_lIll1lIl.d = 5;
                this.var_game_TrainingScreen_lIll1lIl.e = 7;
                this.var_game_TrainingScreen_lIll1lIl.f = 3;
                this.var_game_TrainingScreen_lIll1lIl.a = 150;
                this.var_game_TrainingScreen_lIll1lIl.a(1);
                this.var_game_TrainingScreen_lIll1lIl.a = -50;
                break;
            }
            case 13: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 219;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 218;
                break;
            }
            case 14: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 128;
                this.IlII1Il1l11l = GameCanvas.var_int_b / 128;
                break;
            }
            case 15: {
                this.var_int_lllllII1l = GameCanvas.var_int_b / 241;
                this.var_int_lllllII1l = GameCanvas.var_int_b / 241;
            }
        }
        try {
            switch (by) {
                case 0: {
                    Il11l11l = Image.createImage((String)"/map/bgItem/halongkaka.png");
                    return;
                }
                case 1: {
                    I1IlIlII1 = Image.createImage((String)"/map/bgItem/canhdong.png");
                    return;
                }
                case 2: {
                    l11lllI1l = Image.createImage((String)"/map/bgItem/bang.png");
                    return;
                }
                case 3: {
                    lll1llII = Image.createImage((String)"/map/bgItem/rungRam.png");
                    return;
                }
                case 4: {
                    lI1IIl11I = Image.createImage((String)"/map/bgItem/back1.png");
                    II11lIl1lI = Image.createImage((String)"/map/bgItem/back2.png");
                    return;
                }
                case 5: {
                    IIllI1ll1llI = Image.createImage((String)"/map/bgItem/back3.png");
                    llIl1I1lIll = Image.createImage((String)"/map/bgItem/back4.png");
                    return;
                }
                case 6: {
                    III1lIII = Image.createImage((String)"/map/bgItem/back5.png");
                    lII1l1111 = Image.createImage((String)"/map/bgItem/back6.png");
                    return;
                }
                case 7: {
                    III11III1I1 = Image.createImage((String)"/map/bgItem/back7.png");
                    II1l1IIlI = Image.createImage((String)"/map/bgItem/back8.png");
                    return;
                }
                case 9: {
                    III1lIII = Image.createImage((String)"/map/bgItem/back5.png");
                    lII1l1111 = Image.createImage((String)"/map/bgItem/back6.png");
                    return;
                }
                case 10: {
                    IIll11lIlI = Image.createImage((String)"/map/bgItem/back11.png");
                    l11II111I11 = Image.createImage((String)"/map/bgItem/back12.png");
                    return;
                }
                case 12: {
                    lllIII11l = Image.createImage((String)"/map/bgItem/back14.png");
                    Il11IllIlI = Image.createImage((String)"/map/bgItem/back15.png");
                    return;
                }
                case 13: {
                    lIIllIIlI = Image.createImage((String)"/map/bgItem/rock_up.png");
                    ll1l1lI11 = Image.createImage((String)"/map/bgItem/map_spider_layout.png");
                    lI111lll = Image.createImage((String)"/map/bgItem/rock_down.png");
                    return;
                }
                case 14: {
                    lllII1I1lI = Image.createImage((String)"/map/bgItem/bg-cloud.png");
                    IlIllIl1 = Image.createImage((String)"/map/bgItem/bg_cloud1.png");
                    return;
                }
                case 15: {
                    Il1I11l1 = Image.createImage((String)"/map/bgItem/back16.png");
                    ll1lllI1I = Image.createImage((String)"/map/bgItem/back17.png");
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b() {
        if (BattleScreen.var_byte_a != 2 && var_byte_a != 3) {
            for (int i = 0; i < this.var_int_arr_lIll1lIl.length; ++i) {
                int[] nArray;
                int[] nArray2 = nArray = this.var_int_arr_lIll1lIl;
                int n = i;
                nArray2[n] = nArray2[n] - (GameHelper16.b - GameHelper16.d) * this.lIl1Il1I11l[i] / 100;
                nArray = this.IlIlII11ll;
                int[] nArray3 = nArray;
                int n2 = i;
                nArray3[n2] = nArray3[n2] - (GameHelper16.c - GameHelper16.e) * this.lIl1Il1I11l[i] / 100;
                nArray = this.l1lll1Ill1Il;
                int[] nArray4 = nArray;
                int n3 = i;
                nArray4[n3] = nArray4[n3] - (GameHelper16.b - GameHelper16.d) * this.lIl1Il1I11l[i] / 100;
                nArray = this.var_int_arr_lII1lI1Illl;
                int[] nArray5 = nArray;
                int n4 = i;
                nArray5[n4] = nArray5[n4] - (GameHelper16.c - GameHelper16.e) * this.lIl1Il1I11l[i] / 100;
            }
        }
        if (this.var_game_TrainingScreen_lIll1lIl != null) {
            this.var_game_TrainingScreen_lIll1lIl.a();
        }
    }

    public final void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
        switch (var_byte_a) {
            case 0: {
                graphics.setColor(8831994);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a != 2) {
                    int n = (GameHelper16.b >> 2) % 128;
                    int n2 = GameCanvas.var_int_c - (GameHelper16.c + GameCanvas.var_int_c >> 2) + this.var_int_c;
                    graphics.setColor(2002158);
                    graphics.fillRect(0, n2, GameCanvas.var_int_b, GameCanvas.var_int_c - n2);
                    for (int i = 0; i <= this.var_int_lllllII1l + 1; ++i) {
                        graphics.drawImage(Il11l11l, -n + (i << 7), n2, 6);
                    }
                    graphics.drawImage(var_javax_microedition_lcdui_Image_a, var_int_lII1lI1Illl, n2 - 100, 0);
                    graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                    this.lI1llI1lI(graphics);
                    break;
                }
                graphics.setColor(8438010);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                break;
            }
            case 1: {
                graphics.setColor(8180459);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n = (GameHelper16.b >> 2) % 64;
                int n3 = GameCanvas.var_int_c - (GameHelper16.c + GameCanvas.var_int_c >> 2) + this.var_int_c;
                for (int i = 0; i <= this.var_int_lllllII1l + 1; ++i) {
                    graphics.drawImage(I1IlIlII1, -n + (i << 6), n3, 36);
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_a, var_int_lII1lI1Illl, n3 - 200, 0);
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                this.lI1llI1lI(graphics);
                break;
            }
            case 2: {
                graphics.setColor(8180459);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n = (GameHelper16.b >> 2) % 64;
                int n4 = GameCanvas.var_int_c - (GameHelper16.c + GameCanvas.var_int_c >> 2) + 150 + this.var_int_c;
                for (int i = 0; i <= this.var_int_lllllII1l + 1; ++i) {
                    graphics.drawImage(l11lllI1l, -n + (i << 6), n4, 36);
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_a, var_int_lII1lI1Illl, n4 - 200, 0);
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                this.lI1llI1lI(graphics);
                graphics.setColor(18797);
                graphics.fillRect(0, n4, GameCanvas.var_int_b, 500);
                break;
            }
            case 3: {
                graphics.setColor(8711932);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n = (GameHelper16.b >> 2) % 72;
                int n5 = GameCanvas.var_int_c - (GameHelper16.c + GameCanvas.var_int_c >> 2) + this.var_int_c;
                for (int i = 0; i <= this.var_int_lllllII1l + 1; ++i) {
                    graphics.drawImage(lll1llII, -n + i * 72, n5, 36);
                }
                break;
            }
            case 4: {
                int n;
                graphics.setColor(14282750);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n6 = (GameHelper16.b >> 3) % 241;
                int n7 = (GameHelper16.b >> 2) % 226;
                int n8 = GameCanvas.var_int_c - (GameHelper16.c + GameCanvas.var_int_c >> 2) + this.var_int_c;
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(II11lIl1lI, -n6 + n * 241, n8 - 5, 36);
                }
                for (n = 0; n <= this.IlII1Il1l11l + 1; ++n) {
                    graphics.drawImage(lI1IIl11I, -n7 + n * 226, n8, 36);
                }
                graphics.setColor(0x717171);
                graphics.fillRect(0, n8, GameCanvas.var_int_b, 100);
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                this.lI1llI1lI(graphics);
                break;
            }
            case 5: {
                int n;
                graphics.setColor(0xFFF7F0);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n9 = (GameHelper16.b >> 3) % 241;
                int n10 = (GameHelper16.b >> 2) % 241;
                int n11 = GameCanvas.var_int_c - GameHelper16.c / 2 + this.var_int_c;
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(llIl1I1lIll, -n9 + n * 241, n11, 36);
                }
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(IIllI1ll1llI, -n10 + n * 241, n11, 36);
                }
                graphics.setColor(7905231);
                graphics.fillRect(0, n11, GameCanvas.var_int_b, 100);
                break;
            }
            case 6: {
                int n;
                graphics.setColor(16706268);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n12 = (GameHelper16.b >> 3) % 238;
                int n13 = (GameHelper16.b >> 2) % 225;
                int n14 = GameCanvas.var_int_c - GameHelper16.c / 2 + this.var_int_c;
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(lII1l1111, -n12 + n * 238, n14, 36);
                }
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(III1lIII, -n13 + n * 225, n14, 36);
                }
                graphics.setColor(10268132);
                graphics.fillRect(0, n14, GameCanvas.var_int_b, 600);
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                this.lI1llI1lI(graphics);
                break;
            }
            case 7: {
                graphics.setColor(15267327);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a != 2) {
                    int n;
                    int n15 = (GameHelper16.b >> 3) % 269;
                    int n16 = (GameHelper16.b >> 2) % 368;
                    int n17 = GameCanvas.var_int_c - GameHelper16.c / 3 + this.var_int_c - 100;
                    int n18 = GameCanvas.var_int_c - GameHelper16.c / 2 + this.var_int_c;
                    for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                        graphics.drawImage(II1l1IIlI, -n15 + n * 269, n17, 36);
                    }
                    for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                        graphics.drawImage(II1l1IIlI, -n15 + n * 269 + 30, n17 + 150, 36);
                    }
                    for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                        graphics.drawImage(III11III1I1, -n16 + n * 368 + 50, n18, 36);
                    }
                }
            }
            default: {
                break;
            }
            case 9: {
                int n;
                graphics.setColor(16752448);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n19 = (GameHelper16.b >> 3) % 238;
                int n20 = (GameHelper16.b >> 2) % 225;
                int n21 = GameCanvas.var_int_c - GameHelper16.c / 2 + this.var_int_c;
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(lII1l1111, -n19 + n * 238, n21, 36);
                }
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(III1lIII, -n20 + n * 225, n21, 36);
                }
                graphics.setColor(0xBCCCFF);
                graphics.fillRect(0, n21, GameCanvas.var_int_b, 100);
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                this.lI1llI1lI(graphics);
                break;
            }
            case 10: {
                int n;
                graphics.setColor(7106965);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n22 = (GameHelper16.b >> 3) % 238;
                int n23 = (GameHelper16.b >> 2) % 225;
                int n24 = GameCanvas.var_int_c - GameHelper16.c / 2 + this.var_int_c;
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(l11II111I11, -n22 + n * 238, n24, 36);
                }
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(IIll11lIlI, -n23 + n * 225, n24, 36);
                }
                graphics.setColor(3093573);
                graphics.fillRect(0, n24, GameCanvas.var_int_b, 600);
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                break;
            }
            case 12: {
                int n;
                boolean bl = false;
                if (GameCanvas.var_int_a % 200 == 0) {
                    bl = true;
                }
                graphics.setColor(530454);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n25 = (GameHelper16.b >> 4) % 108;
                int n26 = (GameHelper16.b >> 3) % 108;
                int n27 = GameCanvas.var_int_c - (GameHelper16.c + GameCanvas.var_int_c >> 2) + this.var_int_c;
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(Il11IllIlI, -n25 + n * 108, n27, 6);
                }
                if (bl) {
                    if (++this.l1I1I1lI1l == 10) {
                        this.l1I1I1lI1l = 0;
                    }
                    if (this.l1I1I1lI1l % 2 == 0) {
                        graphics.setColor(0xFFFFFF);
                        graphics.fillRect(0, n27 - 60, GameCanvas.var_int_b, 130);
                    }
                }
                if (this.var_game_TrainingScreen_lIll1lIl != null) {
                    graphics.setClip(0, n27 - 50, 1000, 120);
                    this.var_game_TrainingScreen_lIll1lIl.b(graphics);
                    graphics.setClip(0, 0, 2000, 2000);
                }
                graphics.setClip(0, n27 - 50, 1000, 100);
                graphics.setClip(0, 0, 2000, 2000);
                for (n = 0; n <= this.var_int_lllllII1l + 1; ++n) {
                    graphics.drawImage(lllIII11l, -n26 + n * 108, n27, 6);
                }
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY() + 1);
                break;
            }
            case 13: {
                int n;
                graphics.setColor(8229794);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n28 = (GameHelper16.b >> 2) % 144;
                int n29 = (GameHelper16.b >> 2) % 176;
                int n30 = (GameHelper16.b >> 3) % 69;
                int n31 = GameCanvas.var_int_c - GameHelper16.c / 3 + this.var_int_c;
                int n32 = GameCanvas.var_int_c - GameHelper16.c / 4 + this.var_int_c - 80;
                for (n = 0; n <= GameCanvas.var_int_b / 69 + 1; ++n) {
                    graphics.drawImage(ll1l1lI11, -n30 + n * 69, n32, 36);
                }
                graphics.setColor(9728620);
                graphics.fillRect(0, n32, GameCanvas.var_int_b, 300);
                for (n = 0; n <= GameCanvas.var_int_b / 144 + 1; ++n) {
                    graphics.drawImage(lI111lll, -n28 + n * 144, n31, 36);
                }
                graphics.setColor(0x313131);
                graphics.fillRect(0, -500, GameCanvas.var_int_b, -GameHelper16.c / 3 + 120 + 500 - 88);
                for (n = 0; n <= GameCanvas.var_int_b / 176 + 1; ++n) {
                    graphics.drawImage(lIIllIIlI, -n29 + n * 176, -GameHelper16.c / 3 + 120, 36);
                }
                graphics.setColor(4996403);
                graphics.fillRect(0, n31, GameCanvas.var_int_b, 300);
                break;
            }
            case 14: {
                int n;
                graphics.setColor(6606845);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                int n33 = (GameHelper16.b >> 2) % 128;
                int n34 = (GameHelper16.b >> 3) % 128;
                int n35 = GameCanvas.var_int_c;
                for (n = 0; n <= GameCanvas.var_int_b / 128 + 1; ++n) {
                    graphics.drawImage(IlIllIl1, -n34 + (n << 7), n35 + 10, 36);
                }
                for (n = 0; n <= GameCanvas.var_int_b / 128 + 1; ++n) {
                    graphics.drawImage(lllII1I1lI, -n33 + (n << 7), n35, 36);
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_a, var_int_lII1lI1Illl, var_int_l111I1ll11I, 0);
                break;
            }
            case 15: {
                int n;
                graphics.setColor(16694934);
                graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                if (BattleScreen.var_byte_a == 2) break;
                graphics.drawImage(llI11IIll, var_int_lII1lI1Illl, var_int_l111I1ll11I, 0);
                int n36 = (GameHelper16.b >> 2) % 241;
                int n37 = (GameHelper16.b >> 3) % 241;
                int n38 = GameCanvas.var_int_c - GameHelper16.c / 3 - this.var_int_c;
                int n39 = GameCanvas.var_int_c - 10 - GameHelper16.c / 4 - this.var_int_c;
                for (n = 0; n <= GameCanvas.var_int_b / 241 + 1; ++n) {
                    graphics.drawImage(Il1I11l1, -n37 + n * 241, n39, 36);
                }
                graphics.setColor(7628133);
                graphics.fillRect(0, n39, GameCanvas.var_int_b, 200);
                for (n = 0; n <= GameCanvas.var_int_b / 241 + 1; ++n) {
                    graphics.drawImage(ll1lllI1I, -n36 + n * 241, n38, 36);
                }
                graphics.setColor(0x260606);
                graphics.fillRect(0, n38, GameCanvas.var_int_b, 200);
            }
        }
        graphics.translate(-GameHelper16.b, -GameHelper16.c);
    }

    private void lI1llI1lI(Graphics graphics) {
        for (int i = 0; i < this.var_int_arr_lIll1lIl.length; ++i) {
            graphics.drawImage(l1ll1l1IIIl, this.var_int_arr_lIll1lIl[i], this.IlIlII11ll[i] + this.var_int_d, 0);
        }
    }

    public static void a(byte by, Graphics graphics) {
        block4: {
            block5: {
                block3: {
                    if (by != 0) break block3;
                    int n = (GameHelper16.b + GameCanvas.var_int_b) / 24;
                    for (by = (byte)(GameHelper16.b / 24); by <= n; by = (byte)(by + 1)) {
                        var_game_GameHelper29_lIll1lIl.a(GameCanvas.var_int_a % 8 <= 4 ? 1 : 0, by * 24, var_int_a - 12 + var_javax_microedition_lcdui_Image_c.getHeight() / 2, 0, 0, graphics);
                        graphics.drawImage(var_javax_microedition_lcdui_Image_c, by * 24, var_int_a - 12 + 24 + var_javax_microedition_lcdui_Image_c.getHeight() / 2, 0);
                    }
                    break block4;
                }
                if (by != 1) break block5;
                int n = (GameHelper16.b + GameCanvas.var_int_b) / 64;
                for (by = (byte)(GameHelper16.b / 64); by <= n; by = (byte)(by + 1)) {
                    graphics.drawImage(I11I1llIllI, by << 6, var_int_b, 0);
                }
                break block4;
            }
            if (by != 2) break block4;
            int n = (GameHelper16.b + GameCanvas.var_int_b) / 64;
            for (by = (byte)(GameHelper16.b / 64); by <= n; by = (byte)(by + 1)) {
                graphics.drawImage(lI1l1I111I1l, by << 6, var_int_b, 0);
            }
        }
    }

    public static void b(Graphics graphics) {
        for (int i = 0; i < 7; ++i) {
            if (var_int_arr_l111I1ll11I[i] >= 0 && var_int_arr_l111I1ll11I[i] <= GameCanvas.var_int_b) {
                graphics.drawImage(f, var_int_arr_l111I1ll11I[i], var_int_arr_lllllII1l[i], 3);
            }
            for (int j = 0; j < (GameCanvas.var_int_c - var_int_arr_lllllII1l[i]) / 21 + 1; ++j) {
                graphics.drawImage(e, var_int_arr_l111I1ll11I[i], var_int_arr_lllllII1l[i] + j * 21 + f.getHeight() / 2, 17);
            }
        }
    }

    public static void c(Graphics graphics) {
        graphics.setColor(6606845);
        graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        for (int i = 0; i <= GameCanvas.var_int_b; i += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, i, GameCanvas.var_int_c - 62, 0);
        }
    }

    static {
        int n;
        GameHelper28 gameHelper28 = new GameHelper28("/map/bg");
        BoardScreen.d = gameHelper28.a("cloud1.png");
        l1ll1l1IIIl = gameHelper28.a("cl2.png");
        var_javax_microedition_lcdui_Image_a = gameHelper28.a("sun0.png");
        llI11IIll = gameHelper28.a("sun1.png");
        var_javax_microedition_lcdui_Image_b = gameHelper28.a("wts.png");
        I11I1llIllI = gameHelper28.a("co.png");
        i = gameHelper28.a("lg.png");
        PlayerEntity.var_javax_microedition_lcdui_Image_u = gameHelper28.a("web.png");
        lI1l1I111I1l = gameHelper28.a("co2.png");
        var_javax_microedition_lcdui_Image_c = gameHelper28.a("inWater.png");
        BoardScreen.e = gameHelper28.a("sun0.png");
        BoardScreen.var_javax_microedition_lcdui_Image_arr_b = new Image[3];
        for (n = 1; n < 4; ++n) {
            BoardScreen.var_javax_microedition_lcdui_Image_arr_b[n - 1] = gameHelper28.a("cl" + n + ".png");
        }
        var_javax_microedition_lcdui_Image_d = gameHelper28.a("miniballoon.png");
        e = gameHelper28.a("a.png");
        f = gameHelper28.a("b.png");
        g = gameHelper28.a("bigballoon.png");
        h = gameHelper28.a("mocxich.png");
        var_int_arr_l111I1ll11I = new int[]{GameCanvas.var_int_b / 2 - 150, GameCanvas.var_int_b / 2 - 110, GameCanvas.var_int_b / 2 - 80, GameCanvas.var_int_b / 2 - 10, GameCanvas.var_int_b / 2 + 90, GameCanvas.var_int_b / 2 + 110, GameCanvas.var_int_b / 2 + 140};
        n = GameCanvas.var_int_c < 320 ? -(320 - GameCanvas.var_int_c) : GameCanvas.var_int_c - 320;
        var_int_arr_lllllII1l = new int[]{n + 221, n + 201, n + 240, n + 271, n + 223, n + 265, n + 243};
    }
}

