/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package game;

import game.BattleManager;
import game.BattleScreen;
import game.CharacterSelectScreen;
import game.ChatScreen;
import game.DataUtils;
import game.EquipSlotSet;
import game.GameCanvas;
import game.GameHelper16;
import game.GameHelper28;
import game.GameHelper29;
import game.GameHelper34;
import game.GameHelper40;
import game.PetEntity;
import game.PlayerEntity;
import game.RankingScreen;
import game.SoundManager;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ShopScreen {
    private int var_int_I111111l1l1;
    private int var_int_IlIIIlI1;
    private int var_int_I111llllIl1I;
    private int var_int_l1llll1l11l;
    private int var_int_IIlIIIII1;
    private int var_int_lIlII1Il = 0;
    private boolean var_boolean_Ill1l1ll = false;
    private boolean var_boolean_l1IlIII1I1l1 = false;
    private boolean var_boolean_I1lIII1Il = false;
    private byte var_byte_l1IlIII1I1l1;
    private int var_int_Il1ll1l11l;
    private boolean var_boolean_IIll11lIl = false;
    private boolean var_boolean_llllI111l = false;
    private Image var_javax_microedition_lcdui_Image_I1lIII1Il = null;
    private GameHelper29 var_game_GameHelper29_Ill1l1ll = null;
    private int var_int_I11lI1IlIl = 0;
    private int var_int_IllI1I1Il = 0;
    private boolean var_boolean_I111111l1l1 = false;
    private boolean var_boolean_IlIIIlI1 = false;
    private boolean var_boolean_I111llllIl1I = false;
    private boolean var_boolean_l1llll1l11l = false;
    private boolean var_boolean_IIlIIIII1 = false;
    private boolean var_boolean_lIlII1Il = false;
    private boolean var_boolean_Il1ll1l11l = false;
    private boolean var_boolean_I11lI1IlIl;
    private boolean var_boolean_IllI1I1Il = false;
    private boolean var_boolean_IllII1Il1 = true;
    private boolean var_boolean_lIlIl1II = false;
    private boolean var_boolean_l11lIIIl1 = false;
    public static int var_int_a;
    public static int var_int_b;
    public int c;
    private boolean var_boolean_IlI1llIl1I1;
    private int var_int_IllII1Il1 = 0;
    public byte var_byte_a;
    public static byte[] var_byte_arr_a;
    public short[] var_short_arr_a;
    public short[] var_short_arr_b;
    public int d = 0;
    private Vector var_java_util_Vector_Ill1l1ll;
    private Image var_javax_microedition_lcdui_Image_IIll11lIl;
    private int var_int_lIlIl1II;
    private int var_int_l11lIIIl1;
    private int var_int_IlI1llIl1I1;
    private int var_int_II1lIlIl11II = 10;
    private boolean var_boolean_II1lIlIl11II;
    private int var_int_l1IIIllllI;
    private int var_int_IlI1l1Il1111;
    private int var_int_Il1ll111II1I;
    private int var_int_lIl11l11III;
    private int var_int_IlI1III11;
    private boolean var_boolean_l1IIIllllI = false;
    private int var_int_l1ll1IIIl1 = 0;
    private int var_int_I1II11lIl1l = 0;
    private int var_int_IlI11lllII = 4;
    private int l1IIIlI1 = 0;
    private int IIlI1IlII;
    private int I111I1l1l;
    private int llI1I1llIIIl;
    private boolean var_boolean_IlI1l1Il1111;
    private boolean var_boolean_Il1ll111II1I = false;
    private int IlllI1Il1l1;
    public static int e;
    private boolean var_boolean_lIl11l11III = false;
    private int IIlI1Illl1Il;
    private static Image var_javax_microedition_lcdui_Image_llllI111l;
    private static Image var_javax_microedition_lcdui_Image_I111111l1l1;
    private static Image var_javax_microedition_lcdui_Image_IlIIIlI1;
    private static Image var_javax_microedition_lcdui_Image_I111llllIl1I;
    private static Image var_javax_microedition_lcdui_Image_l1llll1l11l;
    private static Image var_javax_microedition_lcdui_Image_IIlIIIII1;
    public static Image var_javax_microedition_lcdui_Image_a;
    private static Image var_javax_microedition_lcdui_Image_lIlII1Il;
    private static Image var_javax_microedition_lcdui_Image_Il1ll1l11l;
    private static Image var_javax_microedition_lcdui_Image_I11lI1IlIl;
    private static Image var_javax_microedition_lcdui_Image_IllI1I1Il;
    private static Image var_javax_microedition_lcdui_Image_IllII1Il1;
    private static Image var_javax_microedition_lcdui_Image_lIlIl1II;
    private static Image var_javax_microedition_lcdui_Image_l11lIIIl1;
    private static Image var_javax_microedition_lcdui_Image_IlI1llIl1I1;
    private static Image var_javax_microedition_lcdui_Image_II1lIlIl11II;
    private static Image var_javax_microedition_lcdui_Image_l1IIIllllI;
    private static Image var_javax_microedition_lcdui_Image_IlI1l1Il1111;
    private static Image var_javax_microedition_lcdui_Image_Il1ll111II1I;
    private static Image var_javax_microedition_lcdui_Image_lIl11l11III;
    public static Image var_javax_microedition_lcdui_Image_b;
    private static Image var_javax_microedition_lcdui_Image_IlI1III11;
    private static Image var_javax_microedition_lcdui_Image_l1ll1IIIl1;
    private static Image var_javax_microedition_lcdui_Image_I1II11lIl1l;
    private static Image var_javax_microedition_lcdui_Image_IlI11lllII;

    public ShopScreen(byte by, short[] sArray, short[] sArray2, byte by2) {
        this.lI1I1I1l1(by, sArray, sArray2, by2);
    }

    public ShopScreen(byte by, short[] sArray, short[] sArray2, byte by2, int n) {
        this.var_int_lIlIl1II = n;
        this.lI1I1I1l1(by, sArray, sArray2, by2);
    }

    public ShopScreen(byte by, short[] sArray, short[] sArray2, byte by2, short[] sArray3, short[] sArray4) {
        this.lI1I1I1l1(by, sArray, sArray2, by2);
        this.void_lI1I1I1l1(sArray3, sArray4);
    }

    private void lI1I1I1l1(byte by, short[] sArray, short[] sArray2, byte by2) {
        this.var_byte_a = by;
        this.var_byte_l1IlIII1I1l1 = by2;
        this.var_short_arr_a = sArray;
        this.var_short_arr_b = sArray2;
        this.var_int_I111111l1l1 = sArray[0];
        this.var_int_IlIIIlI1 = sArray2[0];
        this.var_javax_microedition_lcdui_Image_IIll11lIl = null;
        by2 = BattleScreen.var_game_CharacterSelectScreen_a.var_byte_b;
        switch (by) {
            case 0: {
                if (by2 == 0) {
                    this.var_javax_microedition_lcdui_Image_I1lIII1Il = EquipSlotSet.b[0];
                    this.var_boolean_IlIIIlI1 = true;
                    this.var_game_GameHelper29_Ill1l1ll = null;
                }
                if (by2 != 1) break;
                this.var_boolean_I111llllIl1I = true;
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IlI11lllII, 14, 14);
                this.var_boolean_IIlIIIII1 = true;
                this.var_javax_microedition_lcdui_Image_I1lIII1Il = null;
                break;
            }
            case 1: {
                this.var_javax_microedition_lcdui_Image_IIll11lIl = GameCanvas.a(EquipSlotSet.b[1], this.var_int_lIlIl1II);
                this.var_boolean_IIll11lIl = true;
                this.var_boolean_I111111l1l1 = true;
                break;
            }
            case 2: {
                if (by2 == 0) {
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(EquipSlotSet.b[2], 16, 16);
                    this.var_game_GameHelper29_Ill1l1ll.a = 2;
                    this.var_boolean_IIlIIIII1 = true;
                }
                if (by2 != 1) break;
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(EquipSlotSet.b[2], 16, 16);
                this.var_game_GameHelper29_Ill1l1ll.a = 2;
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 3: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_llllI111l, 24, 24);
                this.var_boolean_IIlIIIII1 = true;
                this.var_boolean_l1llll1l11l = true;
                break;
            }
            case 4: 
            case 16: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_I111111l1l1, 32, 32);
                this.var_boolean_I111111l1l1 = true;
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 5: 
            case 36: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_I111111l1l1, 32, 32);
                if (BattleManager.game_PlayerEntity_a().var_boolean_m) break;
                this.var_boolean_I111111l1l1 = true;
                break;
            }
            case 6: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(EquipSlotSet.b[5], 20, 20);
                this.var_game_GameHelper29_Ill1l1ll.a = 4;
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 7: 
            case 31: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IlIIIlI1, 8);
                this.llllll11l();
                this.var_boolean_I111111l1l1 = true;
                break;
            }
            case 8: 
            case 56: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_I111llllIl1I, 12, 12);
                this.llllll11l();
                this.var_boolean_I111111l1l1 = true;
                break;
            }
            case 9: {
                if (by2 == 0) {
                    Image image = GameCanvas.a(EquipSlotSet.b[3], this.var_int_lIlIl1II);
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(image, 4);
                }
                if (by2 == 1) {
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_l1llll1l11l, 4);
                }
                this.ll1Il1I11l();
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 10: {
                Image image;
                if (by2 == 0) {
                    this.var_javax_microedition_lcdui_Image_IIll11lIl = image = GameCanvas.a(EquipSlotSet.b[4], this.var_int_lIlIl1II);
                    this.var_boolean_IIll11lIl = true;
                }
                if (by2 != 1) break;
                this.var_javax_microedition_lcdui_Image_IIll11lIl = image = GameCanvas.a(EquipSlotSet.b[4], this.var_int_lIlIl1II);
                this.var_boolean_IIll11lIl = true;
                this.var_boolean_I111llllIl1I = true;
                break;
            }
            case 11: {
                if (by2 == 0) {
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(EquipSlotSet.b[5], 20, 20);
                    this.var_game_GameHelper29_Ill1l1ll.a = 4;
                    this.var_boolean_l1llll1l11l = true;
                    this.var_boolean_IIlIIIII1 = true;
                }
                if (by2 != 1) break;
                this.var_int_lIlIl1II = 0;
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_Il1ll111II1I, 18, 18);
                this.var_boolean_I111111l1l1 = true;
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 12: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(EquipSlotSet.b[5], 20, 20);
                this.var_game_GameHelper29_Ill1l1ll.a = 4;
                this.var_boolean_l1llll1l11l = true;
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 13: {
                this.var_boolean_lIlIl1II = true;
                break;
            }
            case 14: 
            case 40: {
                this.var_boolean_lIlII1Il = true;
                break;
            }
            case 15: {
                this.var_boolean_IllI1I1Il = true;
                this.var_boolean_IllII1Il1 = false;
                break;
            }
            case 17: 
            case 18: {
                Image image;
                if (by2 == 0) {
                    image = GameCanvas.a(EquipSlotSet.b[8], this.var_int_lIlIl1II);
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(image, 8);
                }
                if (by2 == 1) {
                    image = GameCanvas.a(EquipSlotSet.b[8], this.var_int_lIlIl1II);
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(image, 8);
                    this.var_boolean_I111llllIl1I = true;
                }
                this.var_boolean_IIlIIIII1 = true;
                this.var_boolean_llllI111l = true;
                break;
            }
            case 19: {
                if (by2 == 0) {
                    this.var_javax_microedition_lcdui_Image_IIll11lIl = GameCanvas.a(EquipSlotSet.b[6], this.var_int_lIlIl1II);
                }
                if (by2 == 1) {
                    this.var_javax_microedition_lcdui_Image_IIll11lIl = var_javax_microedition_lcdui_Image_lIlII1Il;
                    this.var_boolean_l11lIIIl1 = true;
                    this.var_boolean_IlIIIlI1 = true;
                }
                this.var_boolean_IIll11lIl = true;
                break;
            }
            case 20: {
                if (by2 == 0) {
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_Il1ll1l11l, 12, 11);
                }
                if (by2 == 1) {
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_I11lI1IlIl, 20, 20);
                }
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 21: {
                if (by2 == 0) {
                    Image image = GameCanvas.a(EquipSlotSet.b[7], this.var_int_lIlIl1II);
                    this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(image, 4);
                    this.var_boolean_IIlIIIII1 = true;
                }
                if (by2 != 1) break;
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_lIl11l11III, 4);
                this.var_boolean_IIlIIIII1 = true;
                this.var_boolean_I111llllIl1I = true;
                break;
            }
            case 22: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IllI1I1Il, 25, 13);
                this.var_boolean_IIlIIIII1 = true;
                this.var_boolean_llllI111l = true;
                break;
            }
            case 23: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_l1IIIllllI, 15, 15);
                this.var_boolean_IIlIIIII1 = true;
                this.var_boolean_IIll11lIl = true;
                break;
            }
            case 24: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IllII1Il1, 27, 28);
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 25: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IlI1llIl1I1, 16, 16);
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 26: 
            case 27: 
            case 33: {
                this.var_javax_microedition_lcdui_Image_IIll11lIl = var_javax_microedition_lcdui_Image_a;
                this.var_boolean_IIll11lIl = true;
                this.var_boolean_I111111l1l1 = true;
                break;
            }
            case 28: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_lIlIl1II, 23, 23);
                this.var_boolean_IIlIIIII1 = false;
                break;
            }
            case 29: {
                this.var_javax_microedition_lcdui_Image_IIll11lIl = var_javax_microedition_lcdui_Image_a;
                this.var_boolean_IIll11lIl = true;
                break;
            }
            case 30: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_l11lIIIl1, 32, 32);
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 32: 
            case 41: {
                this.var_javax_microedition_lcdui_Image_I1lIII1Il = null;
                this.var_boolean_I111111l1l1 = true;
                break;
            }
            case 34: {
                this.var_boolean_lIlIl1II = true;
            }
            default: {
                break;
            }
            case 37: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IlI1III11, 18, 39);
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 43: {
                this.var_javax_microedition_lcdui_Image_I1lIII1Il = PlayerEntity.var_javax_microedition_lcdui_Image_h;
                break;
            }
            case 44: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_l1ll1IIIl1, 19, 19);
                this.var_boolean_IIll11lIl = true;
                break;
            }
            case 47: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_I1II11lIl1l, 15, 15);
                this.var_boolean_IIll11lIl = true;
                break;
            }
            case 48: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(null, 14, 14);
                break;
            }
            case 49: {
                System.out.println("[p] ID BULLET= " + this.var_int_lIlIl1II);
                this.var_javax_microedition_lcdui_Image_I1lIII1Il = EquipSlotSet.b[9];
                if (BattleScreen.var_byte_a == 0) {
                    this.var_boolean_IlIIIlI1 = true;
                }
                Image image = GameCanvas.a(this.var_javax_microedition_lcdui_Image_I1lIII1Il, this.var_int_lIlIl1II);
                by2 = (byte)image.getWidth();
                int n = image.getHeight();
                int[] nArray = new int[by2 * n];
                image.getRGB(nArray, 0, (int)by2, 0, 0, (int)by2, n);
                this.var_int_Il1ll1l11l = nArray[5];
                break;
            }
            case 51: 
            case 53: {
                this.var_boolean_IlIIIlI1 = true;
                break;
            }
            case 52: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_II1lIlIl11II, 24, 24);
                this.var_boolean_IIlIIIII1 = true;
                break;
            }
            case 54: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_l1IIIllllI, 15, 15);
                this.var_boolean_IIlIIIII1 = true;
                this.var_boolean_IIll11lIl = true;
                break;
            }
            case 55: {
                this.var_game_GameHelper29_Ill1l1ll = new GameHelper29(var_javax_microedition_lcdui_Image_IlI1l1Il1111, 20, 20);
                this.var_boolean_IIlIIIII1 = true;
                this.var_javax_microedition_lcdui_Image_I1lIII1Il = null;
                break;
            }
            case 57: {
                this.var_boolean_lIlIl1II = true;
            }
        }
        if (by == 49) {
            int[] nArray = ShopScreen.int_arr_lI1I1I1l1(sArray, sArray2);
            this.var_int_l11lIIIl1 = nArray[0];
            this.var_int_IlI1llIl1I1 = nArray[1];
        }
        GameHelper16.var_int_a = 0;
        if (by == 31 || by == 32 || by == 35) {
            this.IIIl11I1ll1();
            if (BattleManager.game_PlayerEntity_a().var_byte_c != 15) {
                GameHelper16.var_int_a = 2;
            }
        }
        if (BattleManager.game_PlayerEntity_a().var_byte_c == 13) {
            BattleManager.game_PlayerEntity_a().var_int_H = -5;
            BattleManager.game_PlayerEntity_a().var_int_I = 5;
            if (by == 36) {
                BattleManager.game_PlayerEntity_a().var_int_f = 1;
                BattleManager.game_PlayerEntity_a().var_int_d = this.var_short_arr_a[this.var_short_arr_a.length - 1];
                this.var_boolean_lIl11l11III = true;
            }
        }
        if (BattleManager.game_PlayerEntity_a().var_byte_c == 14 && by == 36) {
            BattleManager.game_PlayerEntity_a().var_int_d = this.var_short_arr_a[this.var_short_arr_a.length - 1];
            BattleManager.game_PlayerEntity_a().var_boolean_h = true;
            this.var_boolean_lIl11l11III = true;
        }
        if (BattleScreen.var_game_CharacterSelectScreen_a.var_byte_b == 1) {
            if (by != 11 && by != 18) {
                new ChatScreen(this.var_short_arr_a[0], this.var_short_arr_b[0], 0);
            }
        } else if (by != 42 && by != 47) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_short_arr_a[0], this.var_short_arr_b[0], (byte)0);
        }
        if (by == 45) {
            GameCanvas.var_boolean_e = true;
            GameCanvas.j = 0;
        }
        SoundManager.a(1);
    }

    private void void_lI1I1I1l1(short[] sArray, short[] sArray2) {
        this.var_java_util_Vector_Ill1l1ll = new Vector();
        if (this.var_byte_a == 48) {
            for (int i = 0; i < sArray.length; ++i) {
                this.var_java_util_Vector_Ill1l1ll.addElement(new GameHelper40(sArray[i], sArray2[i]));
            }
        }
        new StringBuffer("[p] POSTION LENGHT= ").append(this.var_java_util_Vector_Ill1l1ll.size());
    }

    private static int[] int_arr_lI1I1I1l1(short[] sArray, short[] sArray2) {
        int n;
        short s = sArray2[0];
        for (n = 1; n < sArray2.length; ++n) {
            if (sArray2[n] >= s) continue;
            s = sArray2[n];
        }
        for (n = 0; n < sArray2.length; ++n) {
            if (sArray2[n] != s) continue;
            return new int[]{sArray[n], sArray2[n]};
        }
        return null;
    }

    public static byte a(byte by) {
        switch (by) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 9;
            }
            case 4: {
                return 10;
            }
            case 5: {
                return 11;
            }
            case 6: {
                return 19;
            }
            case 7: {
                return 21;
            }
            case 8: {
                return 17;
            }
            case 9: {
                return 49;
            }
            case 10: {
                return 48;
            }
            default: {
                return 0;
            }
            case 14: {
                return 33;
            }
            case 15: 
        }
        return 37;
    }

    private void ll1Il1I11l() {
        if (this.var_int_I111111l1l1 > BattleManager.game_PlayerEntity_a().var_int_g) {
            this.var_int_lIlII1Il = 0;
            return;
        }
        this.var_int_lIlII1Il = 2;
    }

    private void llllll11l() {
        if (this.var_int_I111111l1l1 > BattleManager.game_PlayerEntity_a().var_int_g) {
            this.var_boolean_IIlIIIII1 = true;
            return;
        }
        this.var_boolean_Il1ll1l11l = true;
    }

    private void lI1I1I1l1(int n) {
        this.var_int_l1ll1IIIl1 = this.var_boolean_l1IIIllllI ? (this.var_int_l1ll1IIIl1 += this.var_int_IlI11lllII) : (this.var_int_l1ll1IIIl1 -= this.var_int_IlI11lllII);
        this.var_int_IlI11lllII = 2;
        int n2 = this.var_int_I111111l1l1 + (DataUtils.b(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 10);
        int n3 = this.var_int_IlIIIlI1 - (DataUtils.int_a(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 10);
        int n4 = this.var_int_I111111l1l1 - (DataUtils.b(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 10);
        int n5 = this.var_int_IlIIIlI1 + (DataUtils.int_a(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 10);
        BattleScreen.var_game_BattleGraphicHelper_a.a(n2, n3, (byte)(n != 0 ? 13 : 7));
        BattleScreen.var_game_BattleGraphicHelper_a.a(n4, n5, (byte)(n != 0 ? 13 : 7));
        if (n == 1) {
            n = this.var_int_I111111l1l1 + (DataUtils.b(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 9);
            n2 = this.var_int_IlIIIlI1 - (DataUtils.int_a(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 9);
            n3 = this.var_int_I111111l1l1 - (DataUtils.b(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 9);
            n4 = this.var_int_IlIIIlI1 + (DataUtils.int_a(CharacterSelectScreen.var_int_a) * this.var_int_l1ll1IIIl1 >> 9);
            BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, (byte)7);
            BattleScreen.var_game_BattleGraphicHelper_a.a(n3, n4, (byte)7);
        }
        ++this.var_int_I1II11lIl1l;
        if (this.var_int_I1II11lIl1l == 3) {
            this.var_int_I1II11lIl1l = 0;
            this.var_boolean_l1IIIllllI = !this.var_boolean_l1IIIllllI;
        }
    }

    private void IlI1IIIIlI() {
        ++this.l1IIIlI1;
        if (GameHelper34.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1)) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)2);
            GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_byte_a);
        }
        if (this.var_int_I111111l1l1 < 0 || this.var_int_I111111l1l1 > GameHelper34.var_int_a || this.var_int_IlIIIlI1 > GameHelper34.var_int_b || this.var_int_IlIIIlI1 < 100) {
            this.IIIl11I1ll1();
        }
    }

    private void I11l1I11ll() {
        if (this.var_boolean_I1lIII1Il && ++this.l1IIIlI1 == 20) {
            this.l1IIIlI1 = 0;
            this.IIIl11I1ll1();
        }
    }

    private void III1I11ll() {
        this.var_int_IlIIIlI1 += 2;
        if (GameHelper34.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1)) {
            GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1 - 5, this.var_byte_a);
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(5), DataUtils.d(5), (byte)2);
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, -DataUtils.d(5), DataUtils.d(5), (byte)2);
        }
        ++this.l1IIIlI1;
        if (this.l1IIIlI1 == 0) {
            this.IIIl11I1ll1();
        }
    }

    private void lIl1l11II1l() {
        if (this.var_byte_a == 26) {
            this.var_boolean_Ill1l1ll = false;
            BattleScreen.var_game_CharacterSelectScreen_a.var_int_b = 1;
        }
        if (this.var_byte_a == 17) {
            this.var_boolean_l1IlIII1I1l1 = false;
            BattleScreen.var_game_CharacterSelectScreen_a.var_int_b = 1;
        }
    }

    public final void a() {
        short s;
        int n;
        int n2;
        int n3 = this.var_int_I111111l1l1;
        int n4 = this.var_int_IlIIIlI1;
        this.var_int_I111111l1l1 = this.var_short_arr_a[this.d];
        this.var_int_IlIIIlI1 = this.var_short_arr_b[this.d];
        if (this.var_byte_a == 49) {
            if (var_int_a != 0 && var_int_b != 0) {
                if (this.d == this.var_short_arr_a.length - 2) {
                    this.var_int_l11lIIIl1 = this.var_short_arr_a[this.d];
                    this.var_int_IlI1llIl1I1 = this.var_short_arr_b[this.d];
                    if (this.var_int_l11lIIIl1 < 0 || this.var_int_l11lIIIl1 > GameHelper34.var_int_a) {
                        this.IIIl11I1ll1();
                    }
                    ++this.var_int_l1IIIllllI;
                    if (this.var_int_l1IIIllllI == 10) {
                        this.var_int_l1IIIllllI = 0;
                        this.var_boolean_IlI1l1Il1111 = true;
                    }
                    return;
                }
            } else if (this.d == this.var_short_arr_a.length - 1) {
                this.IIIl11I1ll1();
                return;
            }
        }
        if (BattleScreen.var_byte_a != 2 && this.var_boolean_IlIIIlI1) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 + DataUtils.b(-3, 3), this.var_int_IlIIIlI1 + DataUtils.b(-3, 3), (byte)19);
        }
        if (this.var_byte_a == 36) {
            if (this.d <= 0) {
                this.d = 1;
            }
            if (BattleManager.game_PlayerEntity_a().var_boolean_m) {
                BattleManager.game_PlayerEntity_a().var_int_g = this.var_short_arr_a[this.d - 1];
                BattleManager.game_PlayerEntity_a().var_int_h = this.var_short_arr_b[this.d - 1];
            }
        }
        if (this.d > this.var_short_arr_a.length - 1) {
            this.d = this.var_short_arr_a.length - 1;
            if (this.var_byte_a == 27) {
                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
            }
            this.lIl1l11II1l();
            this.var_int_I111111l1l1 = this.var_short_arr_a[this.d];
            this.var_int_IlIIIlI1 = this.var_short_arr_b[this.d];
            if (this.var_byte_a != 28) {
                this.IIIl11I1ll1();
            }
            if (this.var_byte_a == 28) {
                this.var_boolean_I1lIII1Il = true;
                this.var_boolean_IIlIIIII1 = true;
            }
        }
        if (this.var_boolean_I111111l1l1) {
            this.lI1I1I1l1((byte)0);
        }
        if (this.var_boolean_l1llll1l11l) {
            this.lI1I1I1l1((byte)1);
        }
        if (this.var_boolean_I111llllIl1I) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 + DataUtils.b(-7, 7), this.var_int_IlIIIlI1 + DataUtils.b(-7, 7), (byte)21);
        }
        if (this.var_int_I111111l1l1 == PlayerEntity.var_int_J && this.var_int_IlIIIlI1 == PlayerEntity.var_int_K) {
            new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
            this.var_boolean_IlI1llIl1I1 = true;
        }
        if (this.var_byte_a == 48 && this.IIlI1IlII < this.var_java_util_Vector_Ill1l1ll.size()) {
            GameHelper40 gameHelper40 = (GameHelper40)this.var_java_util_Vector_Ill1l1ll.elementAt(this.IIlI1IlII);
            n2 = gameHelper40.a;
            n = gameHelper40.b;
            int n5 = RankingScreen.a(n3, n4, this.var_int_I111111l1l1, this.var_int_IlIIIlI1);
            n5 = n5 != 0 && n5 != 1 ? 1 : 3;
            if (this.var_int_I111111l1l1 == n2 && this.var_int_IlIIIlI1 == n) {
                this.IlllI1Il1l1 = n5;
                this.var_boolean_Il1ll111II1I = true;
                ++this.IIlI1IlII;
                this.I111I1l1l += 4;
            }
        }
        if (this.var_boolean_Il1ll111II1I) {
            this.var_int_I11lI1IlIl = 0 + this.IlllI1Il1l1 + this.I111I1l1l;
            if (++this.llI1I1llIIIl == 3) {
                this.llI1I1llIIIl = 0;
                this.var_boolean_Il1ll111II1I = false;
                this.var_int_I11lI1IlIl = this.I111I1l1l;
            }
            new StringBuffer("[p] CURR FRAME= ").append(this.var_int_I11lI1IlIl);
        }
        if (this.var_boolean_IlIIIlI1 && (Math.abs(this.var_int_I111111l1l1 - n3) >= 10 || Math.abs(this.var_int_IlIIIlI1 - n4) >= 10)) {
            BattleScreen.var_game_BattleGraphicHelper_a.a((this.var_int_I111111l1l1 + n3) / 2 + DataUtils.b(-3, 3), (this.var_int_IlIIIlI1 + n4) / 2 + DataUtils.b(-3, 3), (byte)19);
        }
        if (this.var_boolean_l11lIIIl1 && GameCanvas.var_int_a % 10 == 0) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)8);
        }
        if (this.var_boolean_I111llllIl1I) {
            n = DataUtils.b(-7, 7);
            n2 = DataUtils.b(-7, 7);
            if (Math.abs(this.var_int_I111111l1l1 - n3) >= 10 || Math.abs(this.var_int_IlIIIlI1 - n4) >= 10) {
                BattleScreen.var_game_BattleGraphicHelper_a.a((this.var_int_I111111l1l1 + n3) / 2 + n, (this.var_int_IlIIIlI1 + n4) / 2 + n2, (byte)21);
            }
        }
        if (ShopScreen.b(this.var_byte_a)) {
            ++this.l1IIIlI1;
            new StringBuffer("[p] TIME COUNT= ").append(this.l1IIIlI1).append(" FORCE2= ").append(BattleScreen.var_game_CharacterSelectScreen_a.var_byte_a);
            if (CharacterSelectScreen.f > 1) {
                if (this.l1IIIlI1 == BattleScreen.var_game_CharacterSelectScreen_a.var_byte_a && this.var_byte_a == 17) {
                    this.var_boolean_l1IlIII1I1l1 = true;
                    CharacterSelectScreen characterSelectScreen = BattleScreen.var_game_CharacterSelectScreen_a;
                    characterSelectScreen.var_int_b += 3;
                    this.IIIl11I1ll1();
                }
                if (this.l1IIIlI1 == BattleScreen.var_game_CharacterSelectScreen_a.var_byte_a && this.var_byte_a == 19) {
                    CharacterSelectScreen.d(this.var_int_I111111l1l1, this.var_int_IlIIIlI1);
                }
            }
        }
        if (this.var_boolean_lIlII1Il) {
            if (this.var_byte_a == 14) {
                this.lI1I1I1l1(0);
            }
            if (this.var_byte_a == 40) {
                this.lI1I1I1l1(1);
            }
        }
        if (this.var_byte_a == 25) {
            this.IlI1IIIIlI();
        }
        if (this.var_byte_a == 52 && GameHelper34.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1)) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)2);
            new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
            GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_byte_a);
        }
        if (this.var_byte_a == 28) {
            this.I11l1I11ll();
        }
        if (this.var_byte_a == 30) {
            this.III1I11ll();
        }
        if (this.var_boolean_lIlIl1II) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (byte)1);
        }
        if (this.var_boolean_IIll11lIl) {
            n = DataUtils.a(this.var_int_I111111l1l1 - n3, this.var_int_IlIIIlI1 - n4);
            this.var_int_I11lI1IlIl = (n << 1) / 45;
            this.IIlI1Illl1Il = n;
            if (this.var_byte_a == 44 && this.var_int_I11lI1IlIl > 7) {
                this.var_int_I11lI1IlIl = 15 - this.var_int_I11lI1IlIl;
            }
        }
        if (this.var_boolean_llllI111l) {
            this.ll1Il1I11l();
        }
        if (this.var_boolean_IIlIIIII1) {
            if (this.var_byte_a == 37) {
                this.c = DataUtils.a(this.var_int_I111111l1l1 - n3, this.var_int_IlIIIlI1 - n4);
                if (this.c == -90 || this.c == 270) {
                    this.var_int_lIlII1Il = 0;
                    if (GameCanvas.var_int_a % 2 == 0) {
                        BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1 + 15, (byte)15);
                    }
                }
                if (this.c == 90) {
                    this.var_int_lIlII1Il = 3;
                    if (GameCanvas.var_int_a % 2 == 0) {
                        BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1 - 15, (byte)15);
                    }
                }
            }
            this.lI1I1I1l1(false);
        } else if (this.var_boolean_Il1ll1l11l) {
            this.lI1I1I1l1(true);
        }
        if (this.var_byte_a == 4 && BattleScreen.var_byte_a == 0) {
            BattleScreen.var_boolean_g = true;
        }
        if (this.var_byte_a == 23 || this.var_byte_a == 54) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 - DataUtils.d(5), this.var_int_IlIIIlI1 - DataUtils.d(5), (byte)11);
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 + DataUtils.d(5), this.var_int_IlIIIlI1 + DataUtils.d(5), (byte)11);
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 + DataUtils.d(5), this.var_int_IlIIIlI1 - DataUtils.d(5), (byte)11);
        }
        if (this.var_byte_a == 15) {
            if (!this.var_boolean_IllII1Il1) {
                if (++this.var_int_IIlIIIII1 == 26) {
                    BattleScreen.var_game_CharacterSelectScreen_a.a(this, true, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_int_I111llllIl1I, this.var_int_l1llll1l11l, this.var_byte_l1IlIII1I1l1);
                    return;
                }
                if (this.var_int_IIlIIIII1 == 5 || this.var_int_IIlIIIII1 == 8) {
                    this.var_boolean_IllI1I1Il = true;
                }
            }
            if (this.var_boolean_IllI1I1Il) {
                this.var_boolean_IllI1I1Il = false;
                this.IIIl11I1ll1();
            }
        }
        if (GameHelper34.var_boolean_a && !this.var_boolean_I11lI1IlIl) {
            byte by = 0;
            if (this.var_byte_a == 0) {
                by = 1;
            }
            if (GameHelper34.boolean_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, by)) {
                this.var_boolean_I11lI1IlIl = true;
            }
        }
        if (this.var_int_I111111l1l1 >= -(s = (short)(this.var_byte_a == 19 ? 500 : 64)) && this.var_int_I111111l1l1 <= GameHelper34.var_int_a + s && this.var_int_IlIIIlI1 <= GameHelper34.var_int_b + 100) {
            if (this.d < this.var_short_arr_a.length - 1) {
                ++this.d;
                return;
            }
            if (this.var_byte_a == 26) {
                if (CharacterSelectScreen.f != 1) {
                    this.var_boolean_Ill1l1ll = true;
                    BattleScreen.var_game_CharacterSelectScreen_a.var_int_b = 4;
                } else {
                    BattleScreen.var_game_CharacterSelectScreen_a.var_int_b = 1;
                }
            }
            this.IIIl11I1ll1();
            return;
        }
        if (BattleScreen.var_boolean_g) {
            BattleScreen.var_boolean_g = false;
        }
        this.var_int_I111llllIl1I = this.var_int_I111111l1l1;
        this.var_int_l1llll1l11l = this.var_int_IlIIIlI1;
        this.lIl1l11II1l();
        BattleScreen.var_game_CharacterSelectScreen_a.a(this, false, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_int_I111llllIl1I, this.var_int_l1llll1l11l, this.var_byte_l1IlIII1I1l1);
    }

    /*
     * Unable to fully structure code
     */
    private void IIIl11I1ll1() {
        int var2_1 = 0;
        int var1_3 = 0;
        int var3_4 = 0;
        PlayerEntity var2_2 = null;
        block35: {
            block45: {
                block46: {
                    block50: {
                        block67: {
                            block66: {
                                block65: {
                                    block64: {
                                        block63: {
                                            block62: {
                                                block61: {
                                                    block60: {
                                                        block59: {
                                                            block58: {
                                                                block57: {
                                                                    block56: {
                                                                        block55: {
                                                                            block54: {
                                                                                block53: {
                                                                                    block52: {
                                                                                        block51: {
                                                                                            block49: {
                                                                                                block48: {
                                                                                                    block47: {
                                                                                                        block44: {
                                                                                                            block43: {
                                                                                                                block42: {
                                                                                                                    block41: {
                                                                                                                        block40: {
                                                                                                                            block39: {
                                                                                                                                block38: {
                                                                                                                                    block37: {
                                                                                                                                        block36: {
                                                                                                                                            block34: {
                                                                                                                                                if (this.var_byte_a != 6 && this.var_byte_a != 5 && this.var_byte_a != 22 && this.var_byte_a != 30) {
                                                                                                                                                    for (var2_1 = 0; var2_1 < BattleManager.var_game_PlayerEntity_arr_a.length; ++var2_1) {
                                                                                                                                                        if (BattleManager.var_game_PlayerEntity_arr_a[var2_1] == null || !DataUtils.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (var1_3 = BattleManager.var_game_PlayerEntity_arr_a[var2_1].var_int_g - 12) - 5, (var3_4 = BattleManager.var_game_PlayerEntity_arr_a[var2_1].var_int_h - 24) - 5, 34, 34)) continue;
                                                                                                                                                        BattleManager.var_game_PlayerEntity_arr_a[var2_1].e(BattleManager.var_game_PlayerEntity_arr_a[var2_1].var_int_t != 0 ? 2 : 0);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (this.var_byte_a != 34) break block34;
                                                                                                                                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 1);
                                                                                                                                                break block35;
                                                                                                                                            }
                                                                                                                                            if (this.var_byte_a != 4) break block36;
                                                                                                                                            CharacterSelectScreen.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1);
                                                                                                                                            break block35;
                                                                                                                                        }
                                                                                                                                        if (this.var_byte_a != 14) break block37;
                                                                                                                                        CharacterSelectScreen.b(this.var_int_I111111l1l1, this.var_int_IlIIIlI1);
                                                                                                                                        break block35;
                                                                                                                                    }
                                                                                                                                    if (this.var_byte_a != 13) break block38;
                                                                                                                                    CharacterSelectScreen.a(this.var_int_I111111l1l1);
                                                                                                                                    break block35;
                                                                                                                                }
                                                                                                                                if (this.var_byte_a != 23) break block39;
                                                                                                                                CharacterSelectScreen.d();
                                                                                                                                break block35;
                                                                                                                            }
                                                                                                                            if (this.var_byte_a != 16) break block40;
                                                                                                                            new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                                                            BattleScreen.var_game_CharacterSelectScreen_a.e(this.var_int_I111111l1l1, this.var_int_IlIIIlI1);
                                                                                                                            break block35;
                                                                                                                        }
                                                                                                                        if (this.var_byte_a != 17) break block41;
                                                                                                                        if (this.var_boolean_l1IlIII1I1l1) {
                                                                                                                            BattleScreen.var_game_CharacterSelectScreen_a.c(this.var_int_I111111l1l1, this.var_int_IlIIIlI1);
                                                                                                                        }
                                                                                                                        new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                                                        GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_byte_a);
                                                                                                                        break block35;
                                                                                                                    }
                                                                                                                    if (this.var_byte_a != 26) break block42;
                                                                                                                    if (this.var_boolean_Ill1l1ll) {
                                                                                                                        CharacterSelectScreen.c();
                                                                                                                    }
                                                                                                                    new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                                                    GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_byte_a);
                                                                                                                    break block35;
                                                                                                                }
                                                                                                                if (this.var_byte_a != 28) break block43;
                                                                                                                CharacterSelectScreen.e();
                                                                                                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                                                break block35;
                                                                                                            }
                                                                                                            if (this.var_byte_a != 30) break block44;
                                                                                                            new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 1);
                                                                                                            break block35;
                                                                                                        }
                                                                                                        if (this.var_byte_a == 5 || this.var_byte_a == 36) break block45;
                                                                                                        if (this.var_byte_a == 8 || this.var_byte_a == 56) break block46;
                                                                                                        if (this.var_byte_a != 57) break block47;
                                                                                                        new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 1);
                                                                                                        break block35;
                                                                                                    }
                                                                                                    if (this.var_byte_a == 53) break block35;
                                                                                                    if (this.var_byte_a != 47) break block48;
                                                                                                    new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 10);
                                                                                                    GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_byte_a);
                                                                                                    break block35;
                                                                                                }
                                                                                                new StringBuffer("[p] x Last= ").append(this.var_int_I111111l1l1).append(" y Last= ").append(this.var_int_IlIIIlI1);
                                                                                                GameHelper34.void_a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_byte_a);
                                                                                                var3_4 = 3;
                                                                                                if (this.var_byte_a == 0 || this.var_byte_a == 7 || this.var_byte_a == 3 || this.var_byte_a == 31 || this.var_byte_a == 32) {
                                                                                                    if (this.var_byte_a == 31 || this.var_byte_a == 32) {
                                                                                                        BattleManager.game_PlayerEntity_a().var_boolean_g = false;
                                                                                                    }
                                                                                                    var3_4 = 2;
                                                                                                }
                                                                                                if (this.var_byte_a == 31) {
                                                                                                    new ChatScreen(this.var_int_I111111l1l1 - 30, this.var_int_IlIIIlI1 + 5, 0);
                                                                                                    new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                                    new ChatScreen(this.var_int_I111111l1l1 + 30, this.var_int_IlIIIlI1 + 5, 0);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 - 30, this.var_int_IlIIIlI1 + 5, (byte)4);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (byte)4);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 + 30, this.var_int_IlIIIlI1 + 5, (byte)4);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)3);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(3), DataUtils.b(-8, -4), (byte)3);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(2), DataUtils.b(-8, -4), (byte)3);
                                                                                                }
                                                                                                for (var1_3 = 0; var1_3 < 2; ++var1_3) {
                                                                                                    var2_1 = (byte)(DataUtils.d(var3_4) > 0 ? 2 : 3);
                                                                                                    if (this.var_byte_a == 19) {
                                                                                                        var2_1 = 8;
                                                                                                    }
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, Math.abs(DataUtils.d(4)), -DataUtils.b(8, 10), var2_1);
                                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, -Math.abs(DataUtils.d(4)), -DataUtils.b(8, 10), var2_1);
                                                                                                }
                                                                                                if (this.var_byte_a != 3) break block49;
                                                                                                new ChatScreen(this.var_int_I111111l1l1 - 30, this.var_int_IlIIIlI1 + 5, 0);
                                                                                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                                new ChatScreen(this.var_int_I111111l1l1 + 30, this.var_int_IlIIIlI1 + 5, 0);
                                                                                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 - 30, this.var_int_IlIIIlI1 + 5, (byte)4);
                                                                                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (byte)4);
                                                                                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1 + 30, this.var_int_IlIIIlI1 + 5, (byte)4);
                                                                                                break block50;
                                                                                            }
                                                                                            if (this.var_byte_a != 15) break block51;
                                                                                            new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1 + 20, 0);
                                                                                            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (byte)4);
                                                                                            break block50;
                                                                                        }
                                                                                        if (this.var_byte_a == 13) break block50;
                                                                                        if (this.var_byte_a != 19) break block52;
                                                                                        BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)10);
                                                                                        break block50;
                                                                                    }
                                                                                    if (this.var_byte_a != 22) break block53;
                                                                                    new ChatScreen(this.var_int_I111111l1l1 - 30, this.var_int_IlIIIlI1 + 5, 0);
                                                                                    new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                                                                    new ChatScreen(this.var_int_I111111l1l1 + 30, this.var_int_IlIIIlI1 + 5, 0);
                                                                                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)9);
                                                                                    break block50;
                                                                                }
                                                                                if (this.var_byte_a != 35) break block54;
                                                                                if (BattleManager.game_PlayerEntity_a().var_byte_c != 15) {
                                                                                    new ChatScreen(this.var_int_I111111l1l1 - 15, this.var_int_IlIIIlI1 + 15, 0);
                                                                                    new ChatScreen(this.var_int_I111111l1l1 + 15, this.var_int_IlIIIlI1 + 15, 0);
                                                                                }
                                                                                break block50;
                                                                            }
                                                                            if (this.var_byte_a != 37) break block55;
                                                                            BattleScreen.var_boolean_a = true;
                                                                            BattleScreen.var_int_a = this.var_int_I111111l1l1;
                                                                            BattleScreen.var_int_b = this.var_int_IlIIIlI1;
                                                                            break block50;
                                                                        }
                                                                        if (this.var_byte_a != 40) break block56;
                                                                        BattleScreen.var_boolean_b = true;
                                                                        BattleScreen.var_int_c = this.var_int_I111111l1l1;
                                                                        BattleScreen.var_int_d = this.var_int_IlIIIlI1;
                                                                        break block50;
                                                                    }
                                                                    if (this.var_byte_a != 54) break block57;
                                                                    BattleScreen.var_boolean_c = true;
                                                                    BattleScreen.var_int_e = this.var_int_I111111l1l1;
                                                                    BattleScreen.var_int_f = this.var_int_IlIIIlI1;
                                                                    break block50;
                                                                }
                                                                if (this.var_byte_a != 50) break block58;
                                                                BattleScreen.var_boolean_d = true;
                                                                BattleScreen.var_int_g = this.var_int_I111111l1l1;
                                                                BattleScreen.var_int_h = this.var_int_IlIIIlI1;
                                                                GameHelper16.var_int_a = 2; break block50;
                                                            }
                                                            if (this.var_byte_a != 55) break block59;
                                                            BattleScreen.var_boolean_e = true;
                                                            BattleScreen.var_int_i = this.var_int_I111111l1l1;
                                                            BattleScreen.var_int_j = this.var_int_IlIIIlI1;
                                                            break block50;
                                                        }
                                                        if (this.var_byte_a != 55) break block60;
                                                        new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 15);
                                                        break block50;
                                                    }
                                                    if (this.var_byte_a != 54) break block61;
                                                    new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 14);
                                                    break block50;
                                                }
                                                if (this.var_byte_a != 42) break block62;
                                                for (var1_3 = 0; var1_3 < BattleManager.var_game_PlayerEntity_arr_a.length; ++var1_3) {
                                                    var2_2 = BattleManager.var_game_PlayerEntity_arr_a[var1_3];
                                                    if (var2_2 == null || var2_2.var_byte_c != 16 || var2_2.var_byte_f == 5) continue;
                                                    CharacterSelectScreen.var_java_util_Vector_c.addElement(new GameHelper40(var2_2.var_int_g, var2_2.var_int_h, this.var_int_I111111l1l1, this.var_int_IlIIIlI1));
                                                }
                                                CharacterSelectScreen.var_boolean_c = true;
                                                break block50;
                                            }
                                            if (this.var_byte_a != 45) break block63;
                                            BattleScreen.var_game_BattleGraphicHelper_a.a(BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_l1IlIII1I1l1].var_int_g, BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_l1IlIII1I1l1].var_int_h, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                            BattleScreen.var_boolean_b = true;
                                            BattleScreen.var_int_c = this.var_int_I111111l1l1;
                                            BattleScreen.var_int_d = this.var_int_IlIIIlI1;
                                            break block50;
                                        }
                                        if (this.var_byte_a != 43) break block64;
                                        new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 7);
                                        break block50;
                                    }
                                    if (this.var_byte_a != 44) break block65;
                                    new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 9);
                                    break block50;
                                }
                                if (this.var_byte_a != 48) break block66;
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 7);
                                break block50;
                            }
                            if (this.var_byte_a != 51) break block67;
                            new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 12);
                            break block50;
                        }
                        if (this.var_byte_a == 53) break block50;
                        if (BattleScreen.var_game_CharacterSelectScreen_a.var_byte_b == 0) {
                            if (this.var_byte_a == 49) {
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 9);
                            } else {
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (byte)4);
                            }
                        } else {
                            if (this.var_byte_a == 0) {
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                new ChatScreen(this.var_int_I111111l1l1 - 35, this.var_int_IlIIIlI1, 0);
                                new ChatScreen(this.var_int_I111111l1l1 + 35, this.var_int_IlIIIlI1, 0);
                            } else if (this.var_byte_a == 10) {
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 7);
                            } else if (this.var_byte_a == 49) {
                                for (var1_3 = 0; var1_3 < 3; ++var1_3) {
                                    CharacterSelectScreen.var_java_util_Vector_c.addElement(new GameHelper40(DataUtils.b(GameHelper16.b, GameCanvas.var_int_b + GameHelper16.b), 0, this.var_int_I111111l1l1, this.var_int_IlIIIlI1));
                                }
                                CharacterSelectScreen.var_boolean_c = true;
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                            } else if (this.var_byte_a != 20 && this.var_byte_a != 9) {
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 0);
                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, (byte)4);
                            } else {
                                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 7);
                            }
lbl227:
                            // 6 sources

                            GameHelper16.var_int_a = 2;
                        }
                    }
                    SoundManager.a(0);
                    break block35;
                }
                GameHelper34.a(new PetEntity(ShopScreen.e++, this.var_int_I111111l1l1 - 21, this.var_int_IlIIIlI1 - 20, PetEntity.var_javax_microedition_lcdui_Image_a, true));
                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 1);
                break block35;
            }
            BattleManager.c(this.var_byte_l1IlIII1I1l1, (short)this.var_int_I111111l1l1, (short)this.var_int_IlIIIlI1);
            BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_l1IlIII1I1l1].var_boolean_n = true;
            BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_l1IlIII1I1l1].var_boolean_v = false;
            if (!BattleManager.game_PlayerEntity_a().var_boolean_m) {
                new ChatScreen(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 1);
            } else {
                if (BattleManager.game_PlayerEntity_a().var_byte_c == 13) {
                    BattleManager.game_PlayerEntity_a().var_int_f = 0;
                    BattleManager.game_PlayerEntity_a().var_int_I = 8;
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(4), DataUtils.b(-8, -5), (byte)3);
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(3), DataUtils.b(-8, -4), (byte)3);
                    BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, DataUtils.d(2), DataUtils.b(-8, -4), (byte)3);
                }
                if (BattleManager.game_PlayerEntity_a().var_byte_c == 14) {
                    BattleManager.game_PlayerEntity_a().var_boolean_i = false;
                    BattleManager.game_PlayerEntity_a().var_boolean_h = false;
                }
            }
        }
        if (this.var_byte_a != 15) {
            BattleScreen.var_game_CharacterSelectScreen_a.a(this, true, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_int_I111llllIl1I, this.var_int_l1llll1l11l, this.var_byte_l1IlIII1I1l1);
        }
        if (PlayerEntity.var_boolean_e) {
            BattleManager.void_a();
            PlayerEntity.var_boolean_e = false;
        }
    }

    public static boolean a(int n) {
        return n == 4 || n == 14 || n == 16 || n == 23 || n == 28;
    }

    public static boolean b(int n) {
        return n == 17 || n == 19;
    }

    private void lI1I1I1l1(boolean bl) {
        if (!bl) {
            if (this.var_byte_a == 3) {
                this.var_int_I11lI1IlIl = BattleScreen.var_int_m / 2 % 2;
            } else if (this.var_byte_a == 4) {
                this.var_int_I11lI1IlIl = BattleScreen.var_int_m / 2 % 2;
            } else if (this.var_byte_a == 20) {
                this.var_int_I11lI1IlIl = BattleScreen.var_int_m / 2 % 2;
            } else if (this.var_byte_a != 55 || GameCanvas.var_int_a % 2 == 0) {
                ++this.var_int_I11lI1IlIl;
            }
            if (this.var_int_I11lI1IlIl == this.var_game_GameHelper29_Ill1l1ll.a) {
                this.var_int_I11lI1IlIl = 0;
                return;
            }
        } else {
            if (this.var_int_I11lI1IlIl < 0) {
                this.var_int_I11lI1IlIl = this.var_game_GameHelper29_Ill1l1ll.a - 1;
                return;
            }
            if (this.var_byte_a == 4) {
                this.var_int_I11lI1IlIl = BattleScreen.var_int_m / 2 % 2;
                return;
            }
            --this.var_int_I11lI1IlIl;
        }
    }

    private void lI1I1I1l1(byte by) {
        ++this.var_int_IllI1I1Il;
        if (this.var_int_IllI1I1Il > 3) {
            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_I111111l1l1, this.var_int_IlIIIlI1, by);
            this.var_int_IllI1I1Il = 0;
        }
    }

    public final void a(Graphics graphics) {
        if (!this.var_boolean_lIl11l11III && this.var_byte_a != 31) {
            int n;
            if (this.var_boolean_IlI1llIl1I1) {
                ++this.var_int_IllII1Il1;
                if (this.var_int_IllII1Il1 == 5) {
                    this.var_int_IllII1Il1 = 0;
                }
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_IIlIIIII1, 0, 32 * this.var_int_IllII1Il1, 32, 32, 0, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 3);
            }
            if (this.var_javax_microedition_lcdui_Image_IIll11lIl != null) {
                GameCanvas.a(this.var_javax_microedition_lcdui_Image_IIll11lIl, this.IIlI1Illl1Il, graphics, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, true);
            } else if (this.var_game_GameHelper29_Ill1l1ll != null) {
                if (this.var_byte_a != 2 && this.var_byte_a != 11) {
                    this.var_game_GameHelper29_Ill1l1ll.a(this.var_int_I11lI1IlIl, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_int_lIlII1Il, 3, graphics);
                } else if (this.var_byte_a == 2) {
                    this.var_game_GameHelper29_Ill1l1ll.a(graphics, this.var_int_I11lI1IlIl, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_int_lIlIl1II, 2);
                } else {
                    this.var_game_GameHelper29_Ill1l1ll.a(graphics, this.var_int_I11lI1IlIl, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, this.var_int_lIlIl1II, 4);
                }
            } else if (this.var_javax_microedition_lcdui_Image_I1lIII1Il != null) {
                if ((this.var_byte_a < 0 || this.var_byte_a > 8) && this.var_byte_a != 49) {
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_I1lIII1Il, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 3);
                } else {
                    DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_I1lIII1Il, 0, this.var_int_lIlIl1II * this.var_javax_microedition_lcdui_Image_I1lIII1Il.getWidth(), this.var_javax_microedition_lcdui_Image_I1lIII1Il.getWidth(), this.var_javax_microedition_lcdui_Image_I1lIII1Il.getWidth(), 0, this.var_int_I111111l1l1, this.var_int_IlIIIlI1, 3);
                }
            } else if (!this.var_boolean_IllII1Il1) {
                n = this.var_int_I111111l1l1 - 10;
                if (this.var_int_IIlIIIII1 < 15) {
                    graphics.setColor(16771821);
                    graphics.fillRect(n, -500, 20, this.var_int_IlIIIlI1 + 20 - -500);
                    graphics.setColor(16756407);
                    graphics.fillRect(n + 2, -500, 16, this.var_int_IlIIIlI1 + 20 - -500);
                    graphics.setColor(16737907);
                    graphics.fillRect(n + 5, -500, 10, this.var_int_IlIIIlI1 + 20 - -500);
                    graphics.setColor(15745615);
                    graphics.fillRect(n + 8, -500, 4, this.var_int_IlIIIlI1 + 20 - -500);
                }
                if (this.var_int_IIlIIIII1 >= 15 && this.var_int_IIlIIIII1 < 17) {
                    graphics.setColor(16771821);
                    graphics.fillRect(n + 3, -500, 14, this.var_int_IlIIIlI1 + 20 - -500);
                    graphics.setColor(16737907);
                    graphics.fillRect(n + 5, -500, 10, this.var_int_IlIIIlI1 + 20 - -500);
                    graphics.setColor(15745615);
                    graphics.fillRect(n + 8, -500, 4, this.var_int_IlIIIlI1 + 20 - -500);
                }
                if (this.var_int_IIlIIIII1 >= 17 && this.var_int_IIlIIIII1 < 20) {
                    graphics.setColor(16771821);
                    graphics.fillRect(n + 6, -500, 8, this.var_int_IlIIIlI1 + 20 - -500);
                    graphics.setColor(15745615);
                    graphics.fillRect(n + 8, -500, 4, this.var_int_IlIIIlI1 + 20 - -500);
                }
                if (this.var_int_IIlIIIII1 >= 20 && this.var_int_IIlIIIII1 < 23) {
                    graphics.setColor(16771821);
                    graphics.fillRect(n + 8, -500, 4, this.var_int_IlIIIlI1 + 20 - -500);
                }
            }
            if (this.var_byte_a == 49 && this.var_boolean_IlI1l1Il1111) {
                int n2 = n = BattleScreen.var_game_CharacterSelectScreen_a.var_byte_b != 1 ? this.var_int_Il1ll1l11l : 718162;
                if (!this.var_boolean_II1lIlIl11II) {
                    this.var_int_IlI1l1Il1111 += var_int_a;
                    this.var_int_Il1ll111II1I += var_int_b;
                    BattleScreen.var_game_GameHelper16_a.a(this.var_short_arr_a[0] + this.var_int_IlI1l1Il1111, this.var_short_arr_b[0] + this.var_int_Il1ll111II1I);
                    if (this.var_short_arr_b[0] + this.var_int_Il1ll111II1I < this.var_int_IlI1llIl1I1) {
                        this.var_int_Il1ll111II1I = this.var_int_IlI1llIl1I1 - this.var_short_arr_b[0];
                        this.var_int_IlI1l1Il1111 = this.var_int_l11lIIIl1 - this.var_short_arr_a[0];
                        this.var_boolean_II1lIlIl11II = true;
                    }
                } else {
                    this.var_int_lIl11l11III += var_int_a;
                    this.var_int_IlI1III11 += var_int_b;
                    BattleScreen.var_game_GameHelper16_a.a(this.var_int_l11lIIIl1 + this.var_int_lIl11l11III, this.var_int_IlI1llIl1I1 - this.var_int_IlI1III11);
                    if (this.var_int_IlI1llIl1I1 - this.var_int_IlI1III11 >= this.var_short_arr_b[this.var_short_arr_b.length - 1]) {
                        this.var_int_I111111l1l1 = this.var_short_arr_a[this.var_short_arr_a.length - 1];
                        this.var_int_IlIIIlI1 = this.var_short_arr_b[this.var_short_arr_b.length - 1];
                        this.IIIl11I1ll1();
                    }
                }
                if (BattleScreen.var_byte_a != 2) {
                    int n3;
                    for (n3 = 0; n3 < this.var_int_II1lIlIl11II; ++n3) {
                        if (n3 < this.var_int_II1lIlIl11II / 2 + this.var_int_II1lIlIl11II / 4 && n3 > this.var_int_II1lIlIl11II / 2 - this.var_int_II1lIlIl11II / 4) {
                            graphics.setColor(0xFFFFFF);
                        } else {
                            graphics.setColor(n);
                        }
                        graphics.drawLine(this.var_short_arr_a[0] - this.var_int_II1lIlIl11II / 2 + n3, (int)this.var_short_arr_b[0], this.var_short_arr_a[0] - this.var_int_II1lIlIl11II / 2 + n3 + this.var_int_IlI1l1Il1111, this.var_short_arr_b[0] + this.var_int_Il1ll111II1I);
                    }
                    for (n3 = 0; n3 < this.var_int_II1lIlIl11II; ++n3) {
                        if (n3 < this.var_int_II1lIlIl11II / 2 + this.var_int_II1lIlIl11II / 4 && n3 > this.var_int_II1lIlIl11II / 2 - this.var_int_II1lIlIl11II / 4) {
                            graphics.setColor(0xFFFFFF);
                        } else {
                            graphics.setColor(n);
                        }
                        graphics.drawLine(this.var_int_l11lIIIl1 - this.var_int_II1lIlIl11II / 2 + n3, this.var_int_IlI1llIl1I1, this.var_int_l11lIIIl1 - this.var_int_II1lIlIl11II / 2 + n3 + this.var_int_lIl11l11III, this.var_int_IlI1llIl1I1 - this.var_int_IlI1III11);
                    }
                    return;
                }
                graphics.setColor(n);
                graphics.drawLine((int)this.var_short_arr_a[0], (int)this.var_short_arr_b[0], this.var_short_arr_a[0] + this.var_int_IlI1l1Il1111, this.var_short_arr_b[0] + this.var_int_Il1ll111II1I);
                graphics.setColor(n);
                graphics.drawLine(this.var_int_l11lIIIl1, this.var_int_IlI1llIl1I1, this.var_int_l11lIIIl1 + this.var_int_lIl11l11III, this.var_int_IlI1llIl1I1 - this.var_int_IlI1III11);
            }
        }
    }

    public static int[] a(int n, int n2, int n3, int n4) {
        n3 -= n;
        n4 -= n2;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (n3 < 0) {
            n7 = -1;
            n5 = -1;
        } else if (n3 > 0) {
            n7 = 1;
            n5 = 1;
        }
        if (n4 < 0) {
            n6 = -1;
        } else if (n4 > 0) {
            n6 = 1;
        }
        int n9 = Math.abs(n3);
        int n10 = Math.abs(n4);
        if (n9 <= n10) {
            n9 = Math.abs(n4);
            n10 = Math.abs(n3);
            if (n4 < 0) {
                n8 = -1;
            } else if (n4 > 0) {
                n8 = 1;
            }
            n7 = 0;
        }
        n3 = n9 >> 1;
        for (n4 = 0; n4 <= n9; ++n4) {
            if (GameHelper34.a(n, n2)) {
                return new int[]{n, n2};
            }
            if ((n3 += n10) >= n9) {
                n3 -= n9;
                n += n5;
                n2 += n6;
                continue;
            }
            n += n7;
            n2 += n8;
        }
        return null;
    }

    static {
        Object object = new GameHelper28("/item/item");
        var_javax_microedition_lcdui_Image_llllI111l = ((GameHelper28)object).a("bomb.png");
        var_javax_microedition_lcdui_Image_I111111l1l1 = ((GameHelper28)object).a("specialbullet.png");
        var_javax_microedition_lcdui_Image_IlIIIlI1 = ((GameHelper28)object).a("grenade.png");
        var_javax_microedition_lcdui_Image_I111llllIl1I = ((GameHelper28)object).a("web.png");
        var_javax_microedition_lcdui_Image_l1llll1l11l = ((GameHelper28)object).a("chuoi2.png");
        var_javax_microedition_lcdui_Image_lIlII1Il = ((GameHelper28)object).a("gaBull2.png");
        var_javax_microedition_lcdui_Image_a = ((GameHelper28)object).a("rocket2.png");
        var_javax_microedition_lcdui_Image_Il1ll1l11l = ((GameHelper28)object).a("trungvang.png");
        var_javax_microedition_lcdui_Image_I11lI1IlIl = ((GameHelper28)object).a("trung2.png");
        var_javax_microedition_lcdui_Image_IllI1I1Il = ((GameHelper28)object).a("chuotBull.png");
        var_javax_microedition_lcdui_Image_IllII1Il1 = ((GameHelper28)object).a("thienthach.png");
        var_javax_microedition_lcdui_Image_Il1ll111II1I = ((GameHelper28)object).a("dan.png");
        var_javax_microedition_lcdui_Image_lIlIl1II = ((GameHelper28)object).a("13Missile.png");
        var_javax_microedition_lcdui_Image_l11lIIIl1 = ((GameHelper28)object).a("khoang.png");
        var_javax_microedition_lcdui_Image_IlI1llIl1I1 = ((GameHelper28)object).a("daodat.png");
        var_javax_microedition_lcdui_Image_II1lIlIl11II = ((GameHelper28)object).a("daodat2.png");
        var_javax_microedition_lcdui_Image_l1IIIllllI = ((GameHelper28)object).a("saobang.png");
        var_javax_microedition_lcdui_Image_b = ((GameHelper28)object).a("gunIcon.png");
        var_javax_microedition_lcdui_Image_IlI1III11 = ((GameHelper28)object).a("bigMissile.png");
        var_javax_microedition_lcdui_Image_l1ll1IIIl1 = ((GameHelper28)object).a("laser.png");
        var_javax_microedition_lcdui_Image_IlI11lllII = ((GameHelper28)object).a("cannon.png");
        var_javax_microedition_lcdui_Image_IlI1l1Il1111 = ((GameHelper28)object).a("chatlong.png");
        var_javax_microedition_lcdui_Image_lIl11l11III = ((GameHelper28)object).a("boomerang-big.png");
        try {
            var_javax_microedition_lcdui_Image_IIlIIIII1 = Image.createImage((String)"/effect/no.png");
            var_javax_microedition_lcdui_Image_I1II11lIl1l = Image.createImage((String)"/item/axit.png");
        } catch (Exception e) {
        }
        var_byte_arr_a = null;
        e = 200;
    }
}

