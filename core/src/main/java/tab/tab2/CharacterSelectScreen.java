/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab2;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class CharacterSelectScreen {
    private static Image var_javax_microedition_lcdui_Image_IIIlIIIl;
    public Vector var_java_util_Vector_a = new Vector();
    private byte var_byte_ll1Il1l11l1 = 0;
    private int var_int_lIIlI1lIl1;
    private int var_int_l1IlI1I1l;
    public static int var_int_a;
    private byte var_byte_I1lllll11lI;
    private byte var_byte_ll111II1l;
    private byte var_byte_lllIIIIl1IIl = (byte)-1;
    private byte var_byte_lIIlI1lIl1 = (byte)-1;
    private int var_int_I1III11II = 1;
    private int var_int_Illl1l1II1II = 0;
    private int var_int_lll1l1ll = 0;
    private boolean var_boolean_I1lllll11lI = true;
    public static boolean var_boolean_a;
    private static boolean var_boolean_ll111II1l;
    private static boolean var_boolean_lllIIIIl1IIl;
    private static boolean var_boolean_lIIlI1lIl1;
    private static boolean var_boolean_l1IlI1I1l;
    private static boolean var_boolean_I1III11II;
    private static boolean var_boolean_Illl1l1II1II;
    private static boolean var_boolean_lll1l1ll;
    private static boolean var_boolean_l1lIIllII1;
    private static boolean var_boolean_l11I1lIlll;
    public int var_int_b;
    private static int var_int_l1lIIllII1;
    public static int var_int_c;
    private static int[] var_int_arr_IIIlIIIl;
    private static int[] var_int_arr_l1lII11I1I;
    private static int[] var_int_arr_ll1Il1l11l1;
    private static int[] var_int_arr_I1lllll11lI;
    private static int var_int_l11I1lIlll;
    public static int d;
    public static int e;
    private static int var_int_lIIIII1l;
    private static int var_int_llIl111lllll;
    public static Vector var_java_util_Vector_b;
    public static boolean var_boolean_b;
    private static int IlIIIl111;
    private static int II1IlII11l;
    private int I11l1IIIII;
    private static int llII1lllIlI;
    private static int IIl1IlII;
    public static int f;
    public static boolean var_boolean_c;
    public static Vector var_java_util_Vector_c;
    private short[][] var_short_arr_arr_IIIlIIIl;
    private short[][] var_short_arr_arr_l1lII11I1I;
    private short[][] var_short_arr_arr_ll1Il1l11l1;
    private short[][] var_short_arr_arr_I1lllll11lI;
    private int lI1111l1 = 0;
    public byte var_byte_a;
    private static boolean var_boolean_lIIIII1l;
    public byte var_byte_b;
    private int Il1lI11l;
    private boolean var_boolean_llIl111lllll;

    public CharacterSelectScreen() {
        var_boolean_a = false;
        this.var_int_b = 0;
    }

    public final void a(byte by, byte by2, byte by3, short[][] sArray, short[][] sArray2, byte by4, byte by5, short[][] sArray3, short[][] sArray4, int n) {
        this.var_byte_I1lllll11lI = by3;
        this.var_short_arr_arr_IIIlIIIl = sArray;
        this.var_short_arr_arr_l1lII11I1I = sArray2;
        this.var_short_arr_arr_ll1Il1l11l1 = sArray3;
        this.var_short_arr_arr_I1lllll11lI = sArray4;
        this.var_byte_b = by;
        this.var_byte_ll111II1l = by2;
        this.Il1lI11l = n;
        this.var_byte_ll1Il1l11l1 = by4;
        this.var_byte_a = by5;
        llII1lllIlI = this.var_int_lIIlI1lIl1;
        IIl1IlII = this.var_int_l1IlI1I1l;
        var_boolean_a = true;
        this.I11l1IIIII = 1;
        this.lI1111l1 = 0;
        var_boolean_b = false;
        this.var_boolean_llIl111lllll = false;
        var_boolean_lIIIII1l = false;
        if (by3 == 43) {
            var_boolean_lIIIII1l = true;
        }
    }

    private void I1ll1Il1I(byte by) {
        switch (by) {
            case 0: 
            case 49: 
            case 59: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 1: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 2: {
                int n = this.var_byte_b != 0 ? 7 : 3;
                for (int i = 0; i < n; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i + this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[i + this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                }
                this.lI1111l1 += 3;
                return;
            }
            case 3: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[1], this.var_short_arr_arr_l1lII11I1I[1], this.var_byte_ll111II1l));
                BattleScreen.var_boolean_g = false;
                return;
            }
            case 4: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 5: 
            case 36: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 6: {
                for (int i = 0; i < 3; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i], this.var_short_arr_arr_l1lII11I1I[i], this.var_byte_ll111II1l, this.Il1lI11l));
                }
                return;
            }
            case 7: 
            case 31: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 8: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 9: {
                for (int i = 0; i < 4; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i + this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[i + this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                }
                this.lI1111l1 += 4;
                return;
            }
            case 10: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 11: {
                System.out.println("[o] ID BULLET= " + this.Il1lI11l);
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 12: {
                for (int i = 1; i <= 6; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i], this.var_short_arr_arr_l1lII11I1I[i], this.var_byte_ll111II1l));
                }
                return;
            }
            case 13: 
            case 17: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 14: 
            case 40: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 15: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[1], this.var_short_arr_arr_l1lII11I1I[1], this.var_byte_ll111II1l));
                return;
            }
            case 16: {
                this.var_java_util_Vector_a.addElement(new ShopScreen((byte)16, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 18: {
                if (this.var_boolean_llIl111lllll) break;
                for (int i = 0; i < 3; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                    ++this.lI1111l1;
                }
                return;
            }
            case 19: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 20: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l));
                ++this.var_int_b;
                ++this.lI1111l1;
                return;
            }
            case 21: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.Il1lI11l));
                ++this.lI1111l1;
                return;
            }
            case 22: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l));
                return;
            }
            case 23: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 24: {
                for (int i = 1; i <= 7; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i], this.var_short_arr_arr_l1lII11I1I[i], this.var_byte_ll111II1l));
                }
                return;
            }
            case 25: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 26: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 27: {
                for (int i = 1; i <= 4; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i], this.var_short_arr_arr_l1lII11I1I[i], this.var_byte_ll111II1l));
                }
                return;
            }
            case 28: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 29: {
                for (int i = 1; i <= 13; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i], this.var_short_arr_arr_l1lII11I1I[i], this.var_byte_ll111II1l));
                }
                return;
            }
            case 30: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[0], this.var_short_arr_arr_l1lII11I1I[0], this.var_byte_ll111II1l));
                return;
            }
            case 32: 
            case 34: 
            case 35: 
            case 37: 
            case 41: 
            case 42: 
            case 45: 
            case 50: 
            case 51: 
            case 52: 
            case 54: 
            case 55: 
            case 57: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l));
                ++this.lI1111l1;
                return;
            }
            case 33: 
            case 44: 
            case 47: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l));
                ++this.lI1111l1;
                return;
            }
            default: {
                return;
            }
            case 43: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l));
                ++this.lI1111l1;
                return;
            }
            case 48: {
                this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[this.lI1111l1], this.var_byte_ll111II1l, this.var_short_arr_arr_ll1Il1l11l1[this.lI1111l1], this.var_short_arr_arr_I1lllll11lI[this.lI1111l1]));
                ++this.lI1111l1;
                return;
            }
            case 56: {
                for (int i = 0; i < 3; ++i) {
                    this.var_java_util_Vector_a.addElement(new ShopScreen(by, this.var_short_arr_arr_IIIlIIIl[i + this.lI1111l1], this.var_short_arr_arr_l1lII11I1I[i + this.lI1111l1], this.var_byte_ll111II1l));
                }
                this.lI1111l1 += 3;
                return;
            }
        }
    }

    public final void a() {
        try {
            int n;
            for (n = 0; n < this.var_java_util_Vector_a.size(); ++n) {
                ((ShopScreen)this.var_java_util_Vector_a.elementAt(n)).a();
            }
            if (!this.var_boolean_I1lllll11lI) {
                if (!var_boolean_lIIIII1l) {
                    this.var_byte_lllIIIIl1IIl = (byte)(this.var_byte_lllIIIIl1IIl - 1);
                    if (this.var_byte_lllIIIIl1IIl == 0 && this.var_int_I1III11II > 0) {
                        this.I1ll1Il1I(this.var_byte_I1lllll11lI);
                        this.var_byte_lllIIIIl1IIl = this.var_byte_lIIlI1lIl1;
                        --this.var_int_I1III11II;
                        if (this.var_int_I1III11II <= 1) {
                            this.var_boolean_I1lllll11lI = true;
                        }
                    }
                } else {
                    PlayerEntity playerEntity = BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_ll111II1l];
                    if (this.var_short_arr_arr_IIIlIIIl[this.lI1111l1][0] <= playerEntity.var_int_g + 10 && this.var_short_arr_arr_IIIlIIIl[this.lI1111l1][0] >= playerEntity.var_int_g - 10) {
                        this.I1ll1Il1I(this.var_byte_I1lllll11lI);
                        --this.var_int_I1III11II;
                        if (this.var_int_I1III11II <= 1) {
                            this.var_boolean_I1lllll11lI = true;
                        }
                    }
                }
            } else if (this.var_java_util_Vector_a.size() == 0 && this.var_int_b <= 0 && this.var_byte_ll1Il1l11l1 > 0 && !var_boolean_b) {
                System.out.println("[co] CReateBullet nShoot: " + this.var_byte_ll1Il1l11l1);
                this.var_boolean_I1lllll11lI = true;
                var_int_c = 0;
                for (n = 0; n < var_int_l1lIIllII1; ++n) {
                    CharacterSelectScreen.var_int_arr_IIIlIIIl[n] = -1;
                    CharacterSelectScreen.var_int_arr_l1lII11I1I[n] = -1;
                    CharacterSelectScreen.var_int_arr_ll1Il1l11l1[n] = -1;
                    CharacterSelectScreen.var_int_arr_I1lllll11lI[n] = -1;
                }
                this.I1ll1Il1I(this.var_byte_I1lllll11lI);
                n = 0;
                switch (this.var_byte_I1lllll11lI) {
                    case 0: 
                    case 32: 
                    case 40: 
                    case 41: 
                    case 48: 
                    case 49: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 1: {
                        this.var_byte_lIIlI1lIl1 = (byte)5;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = this.var_byte_b != 0 ? 6 : 2;
                        break;
                    }
                    case 2: {
                        n = 1;
                        this.var_int_b = this.var_byte_b != 0 ? 7 : 3;
                    }
                    default: {
                        break;
                    }
                    case 4: {
                        var_boolean_ll111II1l = false;
                        var_boolean_lllIIIIl1IIl = false;
                        d = 400;
                        e = var_int_l11I1lIlll;
                        this.var_int_b = 2;
                        break;
                    }
                    case 5: 
                    case 36: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 6: {
                        n = 1;
                        this.var_int_b = 3;
                        break;
                    }
                    case 7: 
                    case 31: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 8: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 9: {
                        this.var_int_b = 4;
                        break;
                    }
                    case 10: {
                        if (this.var_byte_b != 0 && this.var_byte_b != 1) break;
                        this.var_byte_lIIlI1lIl1 = (byte)3;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = 3;
                        break;
                    }
                    case 11: {
                        this.var_byte_lIIlI1lIl1 = (byte)5;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = 5;
                        break;
                    }
                    case 13: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 14: {
                        this.var_int_b = 2;
                        break;
                    }
                    case 16: {
                        this.var_int_b = 7;
                        break;
                    }
                    case 17: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 19: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 21: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 22: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 23: {
                        this.var_int_b = 8;
                        break;
                    }
                    case 25: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 26: {
                        this.var_int_b = 5;
                        break;
                    }
                    case 28: {
                        this.var_int_b = 14;
                        break;
                    }
                    case 30: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 33: {
                        this.var_byte_lIIlI1lIl1 = (byte)5;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = 5;
                        break;
                    }
                    case 34: 
                    case 35: 
                    case 37: 
                    case 42: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 43: {
                        this.var_byte_lIIlI1lIl1 = (byte)11;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = 10;
                        break;
                    }
                    case 44: {
                        this.var_byte_lIIlI1lIl1 = (byte)3;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = 15;
                        break;
                    }
                    case 45: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 47: {
                        this.var_byte_lIIlI1lIl1 = (byte)2;
                        this.var_boolean_I1lllll11lI = false;
                        this.var_int_b = 5;
                        break;
                    }
                    case 50: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 51: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 52: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 54: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 55: {
                        this.var_int_b = 1;
                        break;
                    }
                    case 56: {
                        this.var_int_b = 3;
                        break;
                    }
                    case 57: {
                        this.var_int_b = 1;
                    }
                }
                if (this.var_byte_I1lllll11lI != 43) {
                    BattleScreen.var_game_GameHelper16_a.a((ShopScreen)this.var_java_util_Vector_a.elementAt(n));
                }
                this.var_int_I1III11II = this.var_int_b;
                this.var_byte_lllIIIIl1IIl = this.var_byte_lIIlI1lIl1;
                this.var_byte_ll1Il1l11l1 = (byte)(this.var_byte_ll1Il1l11l1 - 1);
                ++this.I11l1IIIII;
                if (this.I11l1IIIII == this.var_byte_ll1Il1l11l1) {
                    this.I11l1IIIII = 0;
                }
            }
            if (var_boolean_ll111II1l) {
                if (!var_boolean_lllIIIIl1IIl && (d += var_int_l11I1lIlll) >= this.var_int_lIIlI1lIl1 - 165) {
                    this.I1ll1Il1I((byte)3);
                    BattleScreen.var_game_GameHelper16_a.a((ShopScreen)this.var_java_util_Vector_a.elementAt(0));
                    var_boolean_lllIIIIl1IIl = true;
                }
                if (d >= GameHelper34.var_int_a) {
                    var_boolean_ll111II1l = false;
                }
            }
            if (var_boolean_lIIlI1lIl1) {
                ++this.var_int_Illl1l1II1II;
                if (this.var_int_Illl1l1II1II == 10) {
                    BattleScreen.var_game_GameHelper16_a.a(var_int_lIIIII1l, 100);
                }
                if (this.var_int_Illl1l1II1II == 20) {
                    this.var_int_Illl1l1II1II = 0;
                    var_boolean_lIIlI1lIl1 = false;
                    this.I1ll1Il1I((byte)15);
                    BattleScreen.var_game_GameHelper16_a.c((ShopScreen)this.var_java_util_Vector_a.elementAt(0));
                }
            }
            if (var_java_util_Vector_b.size() != 0) {
                var_boolean_l1IlI1I1l = true;
                for (n = 0; n < var_java_util_Vector_b.size(); ++n) {
                    ((GameHelper09)var_java_util_Vector_b.elementAt(n)).a();
                }
            } else {
                var_boolean_l1IlI1I1l = false;
            }
            if (var_boolean_I1III11II) {
                var_boolean_I1III11II = false;
                this.I1ll1Il1I((byte)18);
                BattleScreen.var_game_GameHelper16_a.a((ShopScreen)this.var_java_util_Vector_a.elementAt(0));
            }
            if (var_boolean_Illl1l1II1II) {
                var_boolean_Illl1l1II1II = false;
                this.I1ll1Il1I((byte)20);
                if (IlIIIl111 > -500 && II1IlII11l > -500) {
                    BattleScreen.var_game_GameHelper16_a.a((ShopScreen)this.var_java_util_Vector_a.elementAt(this.var_java_util_Vector_a.size() - 1));
                }
            }
            if (var_boolean_lll1l1ll) {
                ++this.var_int_lll1l1ll;
                if (this.var_int_lll1l1ll == 20) {
                    this.var_int_lll1l1ll = 0;
                    var_boolean_lll1l1ll = false;
                    this.I1ll1Il1I((byte)24);
                    BattleScreen.var_game_GameHelper16_a.b((ShopScreen)this.var_java_util_Vector_a.elementAt(0));
                }
            }
            if (var_boolean_l1lIIllII1) {
                var_boolean_l1lIIllII1 = false;
                this.I1ll1Il1I((byte)27);
                BattleScreen.var_game_GameHelper16_a.a((ShopScreen)this.var_java_util_Vector_a.elementAt(0));
            }
            if (var_boolean_l11I1lIlll) {
                var_boolean_l11I1lIlll = false;
                this.I1ll1Il1I((byte)29);
                BattleScreen.var_game_GameHelper16_a.d((ShopScreen)this.var_java_util_Vector_a.elementAt(0));
            }
            if (var_boolean_c && GameCanvas.var_int_a % 3 == 0) {
                if (var_java_util_Vector_c.size() != 0) {
                    GameHelper40 gameHelper40 = (GameHelper40)var_java_util_Vector_c.elementAt(0);
                    BattleScreen.var_game_BattleGraphicHelper_a.a(gameHelper40.c, gameHelper40.d, gameHelper40.e, gameHelper40.f, 1);
                    int n2 = gameHelper40.e + DataUtils.b(-35, 35);
                    int n3 = gameHelper40.f + DataUtils.b(-10, 10);
                    new ChatScreen(gameHelper40.e, gameHelper40.f, 9);
                    new ChatScreen(n2, n3, 9);
                    new ChatScreen(n2 + DataUtils.b(-30, 30), n3 + DataUtils.b(-10, 10), 9);
                    var_java_util_Vector_c.removeElement(gameHelper40);
                    return;
                }
                var_boolean_c = false;
                return;
            }
            return;
        }
        catch (Exception exception) {
            this.l1lI1IlIlI1l();
            return;
        }
    }

    public final void a(Graphics graphics) {
        int n;
        for (n = 0; n < this.var_java_util_Vector_a.size(); ++n) {
            ((ShopScreen)this.var_java_util_Vector_a.elementAt(n)).a(graphics);
        }
        if (var_boolean_ll111II1l) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_IIIlIIIl, d, e + GameCanvas.var_int_a % 3, 3);
        }
        if (var_boolean_lIIlI1lIl1 && this.var_int_Illl1l1II1II > 5 && this.var_int_Illl1l1II1II < 20) {
            graphics.setColor(16771821);
            graphics.fillRect(var_int_lIIIII1l - 2, -100, 4, var_int_llIl111lllll + 100);
        }
        if (var_boolean_l1IlI1I1l) {
            for (n = 0; n < var_java_util_Vector_b.size(); ++n) {
                ((GameHelper09)var_java_util_Vector_b.elementAt(n)).a(graphics);
            }
        }
    }

    public final void a(ShopScreen shopScreen, boolean bl, int n, int n2, int n3, int n4, byte by) {
        this.var_java_util_Vector_a.removeElement(shopScreen);
        if (shopScreen.var_byte_a == 45) {
            this.l1lI1IlIlI1l();
            return;
        }
        if (!this.var_java_util_Vector_a.isEmpty()) {
            ShopScreen shopScreen2 = (ShopScreen)this.var_java_util_Vector_a.elementAt(0);
            if (shopScreen2.var_byte_a != 19 && shopScreen2.var_byte_a != 43) {
                if (shopScreen2.var_byte_a == 29) {
                    BattleScreen.var_game_GameHelper16_a.d(shopScreen2);
                } else {
                    BattleScreen.var_game_GameHelper16_a.a(shopScreen2);
                }
            }
        }
        if (!ShopScreen.a((int)shopScreen.var_byte_a) || this.var_byte_I1lllll11lI == 14) {
            int n5 = ++var_int_c - 1;
            if (bl) {
                CharacterSelectScreen.var_int_arr_IIIlIIIl[n5] = n;
                CharacterSelectScreen.var_int_arr_l1lII11I1I[n5] = n2;
                CharacterSelectScreen.var_int_arr_ll1Il1l11l1[n5] = n3;
                CharacterSelectScreen.var_int_arr_I1lllll11lI[n5] = n4;
            } else {
                CharacterSelectScreen.var_int_arr_IIIlIIIl[n5] = -1;
                CharacterSelectScreen.var_int_arr_l1lII11I1I[n5] = -1;
                CharacterSelectScreen.var_int_arr_ll1Il1l11l1[n5] = -1;
                CharacterSelectScreen.var_int_arr_I1lllll11lI[n5] = -1;
            }
        }
        if (ShopScreen.a((int)shopScreen.var_byte_a)) {
            if (bl) {
                this.var_int_lIIlI1lIl1 = n;
                this.var_int_l1IlI1I1l = n2;
            } else {
                this.var_int_b = 1;
            }
        }
        if (this.var_byte_I1lllll11lI == 19) {
            this.var_int_lIIlI1lIl1 = llII1lllIlI;
            this.var_int_l1IlI1I1l = IIl1IlII;
        }
        --this.var_int_b;
        if (this.var_int_b <= 0 && this.var_byte_ll1Il1l11l1 <= 0) {
            if (by == BattleScreen.var_byte_b) {
                var_boolean_b = true;
            }
            this.l1lI1IlIlI1l();
            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)var_int_c, var_int_arr_ll1Il1l11l1, var_int_arr_I1lllll11lI);
        }
        System.out.println("[o] REMOVE " + this.var_java_util_Vector_a.size() + " nShoot= " + this.var_byte_ll1Il1l11l1 + " nBull= " + this.var_int_b + " nBoom= " + var_int_c + " X= " + n + " Y= " + n2 + " lastX= " + n3 + " lastY= " + n4);
    }

    public static void b() {
        var_java_util_Vector_b.removeAllElements();
    }

    private void l1lI1IlIlI1l() {
        var_boolean_a = false;
        this.var_int_b = 0;
        this.var_byte_ll1Il1l11l1 = 0;
        this.var_boolean_llIl111lllll = true;
        PlayerEntity.var_boolean_G = false;
        if (var_boolean_l1IlI1I1l) {
            for (int i = 0; i < var_java_util_Vector_b.size(); ++i) {
                --((GameHelper09)CharacterSelectScreen.var_java_util_Vector_b.elementAt((int)i)).var_int_a;
            }
        }
        GameCanvas.var_boolean_e = true;
        GameCanvas.j = 0;
        PlayerEntity.var_boolean_H = true;
    }

    public static void a(int n, int n2) {
        var_boolean_ll111II1l = true;
        d = n - 400;
        e = n2 - 320;
        BattleScreen.var_game_GameHelper16_a.a(n - 180, n2 - 320);
        BattleScreen.var_boolean_g = false;
    }

    public static void b(int n, int n2) {
        var_boolean_lIIlI1lIl1 = true;
        var_int_lIIIII1l = n;
        var_int_llIl111lllll = n2;
        BattleScreen.var_game_GameHelper16_a.a(n, n2);
    }

    public static void a(int n) {
        var_java_util_Vector_b.addElement(new GameHelper09(n));
    }

    public final void c(int n, int n2) {
        var_boolean_I1III11II = true;
        System.out.println("Apa arg=" + DataUtils.a(this.var_int_lIIlI1lIl1 - n, this.var_int_l1IlI1I1l - n2));
    }

    public static void d(int n, int n2) {
        var_boolean_Illl1l1II1II = true;
        IlIIIl111 = n;
        II1IlII11l = n2;
    }

    public final void e(int n, int n2) {
        this.var_int_lIIlI1lIl1 = n;
        this.var_int_l1IlI1I1l = n2 - 500;
        this.I1ll1Il1I((byte)12);
    }

    public static void c() {
        var_boolean_l1lIIllII1 = true;
    }

    public static void d() {
        var_boolean_lll1l1ll = true;
    }

    public static void e() {
        var_boolean_l11I1lIlll = true;
    }

    static {
        var_boolean_a = false;
        var_int_c = 0;
        var_int_l11I1lIlll = 20;
        var_java_util_Vector_b = new Vector();
        var_boolean_b = false;
        var_java_util_Vector_c = new Vector();
        var_javax_microedition_lcdui_Image_IIIlIIIl = BattleScreen.var_javax_microedition_lcdui_Image_a;
        var_int_l1lIIllII1 = 20;
        var_int_arr_IIIlIIIl = new int[20];
        var_int_arr_l1lII11I1I = new int[var_int_l1lIIllII1];
        var_int_arr_ll1Il1l11l1 = new int[var_int_l1lIIllII1];
        var_int_arr_I1lllll11lI = new int[var_int_l1lIIllII1];
    }
}

