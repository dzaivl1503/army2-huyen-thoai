/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ChatScreen {
    private static Image var_javax_microedition_lcdui_Image_l1ll11l1I;
    private static Image var_javax_microedition_lcdui_Image_IIIlII1lIl;
    private static Image var_javax_microedition_lcdui_Image_l1llIIlI;
    private static Image var_javax_microedition_lcdui_Image_IlI11I1I;
    private static Image var_javax_microedition_lcdui_Image_l1IIIIIlI;
    private static Image l1I1I11IlI;
    private static Image IlIlIII1;
    private static Image III111I1I1l1;
    private static Image lll11I11l;
    public static Image a;
    private static Image lI1Il11ll1lI;
    public static Image b;
    private static Image lIllll1I;
    private static Image llIll1llI1;
    private GameHelper29 var_game_GameHelper29_lI1llIIII1l;
    private int var_int_lI1llIIII1l;
    private int var_int_I1IllIlIIl;
    private int var_int_l1ll11l1I;
    private int var_int_IIIlII1lIl;
    private int var_int_l1llIIlI;
    private int var_int_IlI11I1I = 0;
    private byte var_byte_lI1llIIII1l;
    private byte var_byte_I1IllIlIIl;
    private byte var_byte_l1ll11l1I;
    private int var_int_l1IIIIIlI = 1;

    public ChatScreen(int n, int n2, int by) {
        this(n, n2, (byte)by);
    }

    public ChatScreen(int n, int n2, byte by) {
        this.var_int_lI1llIIII1l = n;
        this.var_int_I1IllIlIIl = n2;
        this.var_byte_l1ll11l1I = by;
        switch (by) {
            case 0: 
            case 13: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(var_javax_microedition_lcdui_Image_l1ll11l1I, 59, 64);
                break;
            }
            case 1: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(var_javax_microedition_lcdui_Image_IIIlII1lIl, 32, 32);
                break;
            }
            case 2: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(var_javax_microedition_lcdui_Image_l1llIIlI, 32, 48);
            }
            default: {
                break;
            }
            case 6: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(lIllll1I, 13, 7);
                break;
            }
            case 7: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(l1I1I11IlI, 48, 62);
                break;
            }
            case 8: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(IlIlIII1, 59, 64);
                break;
            }
            case 9: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(III111I1I1l1, 59, 64);
                break;
            }
            case 10: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(llIll1llI1, 12, 12);
                break;
            }
            case 11: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(RankingScreen.a, 27, 27);
                break;
            }
            case 14: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(lll11I11l, 40, 40);
                break;
            }
            case 15: {
                this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(lI1Il11ll1lI, 32, 32);
            }
        }
        BattleScreen.var_java_util_Vector_b.addElement(this);
    }

    public ChatScreen(int n, int n2, int by, int by2, int by3) {
        this(n, n2, (byte)by, (byte)by2, (byte)by3);
    }

    public ChatScreen(int n, int n2, byte by, byte by2, byte by3) {
        this.var_int_lI1llIIII1l = n;
        this.var_int_I1IllIlIIl = n2;
        this.var_byte_l1ll11l1I = by;
        this.var_byte_I1IllIlIIl = by3;
        this.var_byte_lI1llIIII1l = by2;
        if (by == 3) {
            this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(var_javax_microedition_lcdui_Image_IlI11I1I, 40, 40);
        } else if (by == 5) {
            this.var_int_I1IllIlIIl -= 24;
            this.var_int_l1ll11l1I = this.var_int_I1IllIlIIl - 50;
        }
        if (by3 == 4) {
            this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(var_javax_microedition_lcdui_Image_l1IIIIIlI, 24, 32);
        }
        if (by3 == 34) {
            this.var_game_GameHelper29_lI1llIIII1l = new GameHelper29(var_javax_microedition_lcdui_Image_l1IIIIIlI, 24, 32);
        }
        BattleScreen.var_java_util_Vector_b.addElement(this);
    }

    public final void a() {
        switch (this.var_byte_l1ll11l1I) {
            case 0: 
            case 11: 
            case 13: {
                if (this.var_int_IlI11I1I != 5) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 1: {
                if (this.var_int_IlI11I1I != 4) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 2: {
                if (this.var_int_IlI11I1I != 4) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 3: {
                if (BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l] != null) {
                    this.var_int_lI1llIIII1l = BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_int_g;
                    this.var_int_I1IllIlIIl = BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_int_h;
                }
                if (this.var_int_IlI11I1I != 4) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 4: {
                if (BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l] == null) break;
                this.var_int_lI1llIIII1l = BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_int_g;
                this.var_int_I1IllIlIIl = BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_int_h - 13;
                if (this.var_byte_I1IllIlIIl != 4 && this.var_byte_I1IllIlIIl != 34) {
                    if (this.var_byte_I1IllIlIIl != 3 || BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_boolean_y) break;
                    BattleScreen.var_java_util_Vector_b.removeElement(this);
                    return;
                }
                if (!BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_boolean_x) {
                    BattleScreen.var_java_util_Vector_b.removeElement(this);
                    return;
                }
                if (this.var_int_IlI11I1I != 4) break;
                this.var_int_IlI11I1I = 0;
                break;
            }
            case 5: {
                this.var_int_lI1llIIII1l = BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_int_g;
                --this.var_int_I1IllIlIIl;
                if (this.var_int_I1IllIlIIl >= this.var_int_l1ll11l1I) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 6: {
                if (this.var_int_IlI11I1I != 2) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                break;
            }
            case 7: {
                if (this.var_int_IlI11I1I == 3) {
                    BattleScreen.var_java_util_Vector_b.removeElement(this);
                    return;
                }
                this.var_int_l1IIIIIlI = 3;
                break;
            }
            case 8: 
            case 9: {
                this.var_int_l1IIIIIlI = 2;
                if (this.var_int_IlI11I1I != 7) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 10: {
                if (this.var_int_IlI11I1I == 3) {
                    BattleScreen.var_java_util_Vector_b.removeElement(this);
                    return;
                }
            }
            default: {
                break;
            }
            case 14: {
                this.var_int_l1IIIIIlI = 2;
                if (this.var_int_IlI11I1I != 4) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                break;
            }
            case 15: {
                this.var_int_l1IIIIIlI = 2;
                if (this.var_int_IlI11I1I != 4) break;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
            }
        }
        ++this.var_int_l1llIIlI;
        if (this.var_int_l1llIIlI > this.var_int_l1IIIIIlI) {
            ++this.var_int_IlI11I1I;
            this.var_int_l1llIIlI = 0;
        }
    }

    public final void a(Graphics graphics) {
        switch (this.var_byte_l1ll11l1I) {
            case 0: 
            case 1: 
            case 3: 
            case 7: 
            case 8: 
            case 9: 
            case 11: 
            case 14: 
            case 15: {
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 12, 0, 3, graphics);
                return;
            }
            case 2: {
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl + 6, 0, 33, graphics);
                return;
            }
            case 4: {
                if (this.var_byte_I1IllIlIIl != 4 && this.var_byte_I1IllIlIIl != 34) {
                    if (BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_boolean_x || GameCanvas.var_int_a % 10 <= 2) break;
                    GameHelper31.a(graphics, this.var_byte_I1IllIlIIl, this.var_int_lI1llIIII1l - 8, this.var_int_I1IllIlIIl - 37);
                    return;
                }
                if (BattleManager.var_game_PlayerEntity_arr_a[this.var_byte_lI1llIIII1l].var_boolean_b != BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_boolean_b && this.var_byte_lI1llIIII1l != BattleScreen.var_byte_b) break;
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 2, 0, 3, graphics);
                if (GameCanvas.var_int_a % 10 <= 2) break;
                GameHelper31.a(graphics, this.var_byte_I1IllIlIIl, this.var_int_lI1llIIII1l - 8, this.var_int_I1IllIlIIl - 37);
                return;
            }
            case 5: {
                GameHelper31.a(graphics, this.var_byte_I1IllIlIIl, this.var_int_lI1llIIII1l - 8, this.var_int_I1IllIlIIl);
                return;
            }
            case 6: {
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 5, 0, 3, graphics);
                return;
            }
            case 10: {
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 6, 0, 3, graphics);
                return;
            }
            case 12: {
                graphics.setColor(0xFFFFFF);
                graphics.fillArc(this.var_int_lI1llIIII1l - this.var_int_IIIlII1lIl / 2, this.var_int_I1IllIlIIl - this.var_int_IIIlII1lIl / 2, this.var_int_IIIlII1lIl, this.var_int_IIIlII1lIl, 0, 360);
                this.var_int_IIIlII1lIl += 60;
                if (this.var_int_IIIlII1lIl <= 1000) break;
                this.var_int_lI1llIIII1l = 0;
                this.var_int_IIIlII1lIl = 0;
                BattleScreen.var_java_util_Vector_b.removeElement(this);
                return;
            }
            case 13: {
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 12, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l + 10, this.var_int_I1IllIlIIl - 12 + 10, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l - 10, this.var_int_I1IllIlIIl - 12 + 10, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l + 10, this.var_int_I1IllIlIIl - 12 - 10, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l - 10, this.var_int_I1IllIlIIl - 12 - 10, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 12 + 20, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l, this.var_int_I1IllIlIIl - 12 - 20, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l + 20, this.var_int_I1IllIlIIl - 12, 0, 3, graphics);
                this.var_game_GameHelper29_lI1llIIII1l.a(this.var_int_IlI11I1I, this.var_int_lI1llIIII1l - 20, this.var_int_I1IllIlIIl - 12, 0, 3, graphics);
                return;
            }
        }
    }

    static {
        GameHelper28 gameHelper28 = new GameHelper28("/effect/effect");
        var_javax_microedition_lcdui_Image_l1ll11l1I = gameHelper28.a("ex3.png");
        var_javax_microedition_lcdui_Image_IIIlII1lIl = gameHelper28.a("teleport_eff.png");
        var_javax_microedition_lcdui_Image_l1llIIlI = gameHelper28.a("waterBum.png");
        var_javax_microedition_lcdui_Image_IlI11I1I = gameHelper28.a("Eff.png");
        var_javax_microedition_lcdui_Image_l1IIIIIlI = gameHelper28.a("tangHinhEffect.png");
        lIllll1I = gameHelper28.a("mua.png");
        l1I1I11IlI = gameHelper28.a("bomnguyentu.png");
        IlIlIII1 = gameHelper28.a("electric.png");
        III111I1I1l1 = gameHelper28.a("electric2.png");
        lll11I11l = gameHelper28.a("freeze.png");
        a = gameHelper28.a("dongbang.png");
        lI1Il11ll1lI = gameHelper28.a("khoidoc.png");
        b = gameHelper28.a("thuocno.png");
        try {
            llIll1llI1 = Image.createImage((String)"/effect/poison-attack.png");
        }
        catch (Exception exception) {}
    }
}

