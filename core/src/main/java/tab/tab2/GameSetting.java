/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameSetting
extends BaseScreen {
    public static GameSetting var_game_GameSetting_a;
    public MapEntity var_game_MapEntity_a;
    public MapEntity var_game_MapEntity_b;
    int var_int_a;
    private int var_int_l1I1lIII;
    private int var_int_II1IllIII111;
    private static Image var_javax_microedition_lcdui_Image_lII1I111;
    private static Image var_javax_microedition_lcdui_Image_l1ll1lIlI;
    private static Image var_javax_microedition_lcdui_Image_l11l1I11lll1;
    private int var_int_IIll11II1lll;
    private int lII1Il11l1;
    private int IIII1ll11Il;
    private int llIIIl1I;
    private int IlIl1III;
    private int Ill1IlI1I;
    private int Ill1IllIIlI;
    public static boolean var_boolean_a;
    public static int var_int_b;
    public static int var_int_c;
    public byte var_byte_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    private boolean var_boolean_l111I1l1I1;
    public static boolean var_boolean_d;
    String var_java_lang_String_a = "";
    private int I1111ll11I;
    private int llIllll1;
    private int IIlIllll11I = -1500;
    GameCommand var_game_GameCommand_a;
    GameCommand var_game_GameCommand_b;
    private GameCommand var_game_GameCommand_l11l1I11lll1;
    int var_int_d;
    private int II11lI1l;
    private int lIIl1l1ll11 = 0;
    private int l1I11III = 17;
    private int IIllll1lII;
    private int I1I111111I1;
    private boolean var_boolean_l1I1lIlI11I1;
    private boolean var_boolean_l1I1lIII;
    private boolean var_boolean_II1IllIII111;
    private int[] var_int_arr_lII1I111;
    private int[] var_int_arr_l1ll1lIlI;
    private int ll1IIll1;
    private int IllllIIlI;
    private int[] var_int_arr_l11l1I11lll1;
    private int[] var_int_arr_Il11lIlllI1;
    private int[] var_int_arr_l111I1l1I1;
    public static int e;
    private boolean var_boolean_IIll11II1lll = true;
    private int[] var_int_arr_l1I1lIlI11I1;
    private int[] var_int_arr_l1I1lIII = new int[]{40, 70, 90, 160};
    private int[] var_int_arr_II1IllIII111 = new int[]{-5, -3, -4, -3};
    private int[] var_int_arr_IIll11II1lll;
    public static int soundVolume;
    private static Image var_javax_microedition_lcdui_Image_Il11lIlllI1;
    private static Image var_javax_microedition_lcdui_Image_l111I1l1I1;
    private static String var_java_lang_String_l1ll1lIlI;

    public GameSetting() {
        this.var_int_arr_lII1I111 = new int[]{GameCanvas.var_int_b + 15, GameCanvas.var_int_b + 15};
        this.var_int_arr_l1ll1lIlI = new int[2];
        this.var_int_arr_l11l1I11lll1 = new int[]{-50, 0, 30, GameCanvas.var_int_b / 2, GameCanvas.var_int_b - 10, GameCanvas.var_int_b + 20, 100};
        this.var_int_arr_Il11lIlllI1 = new int[]{GameCanvas.var_int_b / 2 - 20, 50, GameCanvas.var_int_b / 2 + 40, 100, GameCanvas.var_int_b - 40, GameCanvas.var_int_b - 10, 100};
        this.var_int_arr_l111I1l1I1 = new int[]{GameCanvas.var_int_b - 80, GameCanvas.var_int_b / 2, GameCanvas.var_int_b / 2 - 50, 30};
        this.var_int_arr_l1I1lIlI11I1 = new int[]{GameCanvas.var_int_b, GameCanvas.var_int_b + 100, GameCanvas.var_int_b - 10, GameCanvas.var_int_b + 50};
        this.var_int_arr_IIll11II1lll = new int[4];
        soundVolume = DataUtils.int_a("sound");
        if (soundVolume <= 0) {
            soundVolume = 50;
            SoundManager.b(0);
        }
        SoundManager.b(soundVolume);
        this.var_byte_a = 0;
        this.var_boolean_b = true;
        var_javax_microedition_lcdui_Image_lII1I111 = BattleScreen.var_javax_microedition_lcdui_Image_g;
        if (BattleScreen.var_game_BattleGraphicHelper_a == null) {
            BattleScreen.var_game_BattleGraphicHelper_a = new BattleGraphicHelper();
        }
        BattleScreen.var_game_BattleGraphicHelper_a.a(-100, -100, (byte)19);
        BattleScreen.var_java_util_Vector_b = new Vector();
        new ChatScreen(-100, -100, 0);
        BattleScreen.var_byte_a = (byte)DataUtils.int_a("graphic");
        if (BattleScreen.var_byte_a == -1) {
            BattleScreen.var_byte_a = 0;
        }
        PetEntity.var_boolean_a = DataUtils.int_a("drawRGB") == 0;
        this.llIllll1 = GameCanvas.var_int_b < 200 ? GameCanvas.var_int_c - 125 : GameCanvas.var_int_c - BaseScreen.var_int_r - 125;
        this.var_int_IIll11II1lll = -100;
        this.lII1Il11l1 = this.IIlIllll11I + 60;
        this.llIIIl1I = -100;
        this.IIII1ll11Il = this.lII1Il11l1 + 120;
        this.var_int_arr_l1ll1lIlI[0] = this.IIII1ll11Il - 39;
        this.var_int_arr_l1ll1lIlI[1] = -1450;
        GameHelper34.var_int_b = GameCanvas.var_int_c;
        this.var_int_II1IllIII111 = GameCanvas.var_int_b - 30;
        if (this.var_int_II1IllIII111 < 70) {
            this.var_int_II1IllIII111 = 70;
        }
        if (this.var_int_II1IllIII111 > 99) {
            this.var_int_II1IllIII111 = 99;
        }
        if (GameCanvas.var_int_b < 200) {
            this.var_int_II1IllIII111 = 70;
        }
        this.var_int_l1I1lIII = (GameCanvas.var_int_b - this.var_int_II1IllIII111 >> 1) + 29;
        this.var_game_MapEntity_a = new MapEntity();
        this.var_game_MapEntity_a.var_int_b = GameCanvas.var_int_e - BaseScreen.var_int_o - 9;
        this.var_game_MapEntity_a.var_int_c = this.var_int_II1IllIII111;
        this.var_game_MapEntity_a.d = BaseScreen.var_int_o + 2;
        this.var_game_MapEntity_a.var_boolean_a = true;
        this.var_game_MapEntity_a.var_boolean_b = true;
        this.var_game_MapEntity_a.void_a(3);
        this.var_game_MapEntity_b = new MapEntity();
        this.var_game_MapEntity_b.var_int_b = GameCanvas.var_int_e - 4;
        this.var_game_MapEntity_b.var_int_c = this.var_int_II1IllIII111;
        this.var_game_MapEntity_b.d = BaseScreen.var_int_o + 2;
        this.var_game_MapEntity_b.var_boolean_a = false;
        this.var_game_MapEntity_b.var_boolean_b = true;
        this.var_game_MapEntity_b.void_a(2);
        this.var_game_MapEntity_a.a(DataUtils.java_lang_String_a("caroun_2"));
        this.var_game_MapEntity_b.a(DataUtils.java_lang_String_a("caropass_2"));
        e = DataUtils.int_a("remember_2");
        if (e == -1) {
            e = 0;
        }
        this.I1lllllIlIl1();
        this.IlIl1III = GameCanvas.var_int_b < 200 ? this.var_game_MapEntity_a.var_int_b - 40 : this.llIllll1 - 40;
        this.var_int_a = 0;
        this.var_game_GameCommand_a = new GameCommand(StringUtils.dn(), new ActionListener258(this));
        this.var_game_GameCommand_b = new GameCommand("Menu", new ActionListener259(this));
        this.var_game_GameCommand_l11l1I11lll1 = new GameCommand(StringUtils.az(), new ActionListener260(this));
        if (e == 1) {
            this.var_game_GameCommand_l11l1I11lll1.var_java_lang_String_a = StringUtils.dW();
        }
        this.g = new GameCommand(StringUtils.dF(), new ActionListener261(this));
    }

    public final void b_() {
        TerrainMidlet.loadServerList();
        this.I1lllllIlIl1();
        super.b_();
    }

    public static void e() {
        MessageHandler.game_MessageHandler_a().a(TerrainMidlet.serverHost, TerrainMidlet.serverPort);
        ConnectionWatchdog.game_ConnectionWatchdog_a().c(TerrainMidlet.providerId);
        System.out.println("[gi] DATA= " + var_java_lang_String_l1ll1lIlI);
        ConnectionWatchdog.game_ConnectionWatchdog_a().e(var_java_lang_String_l1ll1lIlI);
        ConnectionWatchdog.game_ConnectionWatchdog_a().n();
        GameCanvas.b(StringUtils.dr());
    }

    public final void f() {
        this.var_byte_a = (byte)3;
        this.h = this.var_game_MapEntity_a.var_game_GameCommand_a;
        this.g = this.var_game_GameCommand_a;
        ((BaseScreen)this).f = this.var_game_GameCommand_b;
        if (!MessageHandler.game_MessageHandler_a().var_boolean_a) {
            GameSetting.e();
        } else {
            GameCanvas.b(StringUtils.bW());
        }
        if (TerrainMidlet.providerId == -1) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().k();
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.var_game_MapEntity_a.java_lang_String_a().toLowerCase(), this.var_game_MapEntity_b.java_lang_String_a(), TerrainMidlet.version);
    }

    public final void c() {
        int n;
        if (this.IIlIllll11I > 0) {
            this.IIlIllll11I = 0;
        }
        this.ll1IIll1 = this.var_boolean_c ? 15 : 0;
        switch (this.var_byte_a) {
            case 0: {
                GameHelper18.a();
                break;
            }
            case 1: {
                GameHelper18.a();
                break;
            }
            case 2: {
                GameHelper18.a();
                break;
            }
            case 3: 
            case 4: {
                if (this.var_boolean_b) {
                    int n2;
                    int[] nArray;
                    for (n = 0; n < 4; ++n) {
                        int[] nArray2 = nArray = this.var_int_arr_l1I1lIlI11I1;
                        int n3 = n;
                        nArray2[n3] = nArray2[n3] + (this.var_int_arr_II1IllIII111[n] * (2 - n % 2) - this.ll1IIll1);
                        nArray = this.var_int_arr_l1I1lIII;
                        int[] nArray3 = nArray;
                        int n4 = n;
                        nArray3[n4] = nArray3[n4] + this.var_int_arr_IIll11II1lll[n] * (2 - n % 2);
                        if (this.var_int_arr_l1I1lIlI11I1[n] + GameHelper18.a[n % 2].getWidth() >= 0) continue;
                        this.var_int_arr_l1I1lIlI11I1[n] = GameCanvas.var_int_b + 50;
                    }
                    this.var_int_IIll11II1lll += 2 + this.ll1IIll1;
                    if (this.var_int_IIll11II1lll >= GameCanvas.var_int_b / 2 - 10) {
                        nArray = this.var_int_arr_lII1I111;
                        int[] nArray4 = nArray;
                        nArray4[0] = nArray4[0] - (10 + this.ll1IIll1);
                        if (!this.var_boolean_l1I1lIlI11I1) {
                            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_arr_lII1I111[0] + 20, this.var_int_arr_l1ll1lIlI[0] + 5, (byte)19);
                        }
                    }
                    if (this.var_int_arr_lII1I111[1] > -15 && this.var_int_IIll11II1lll > GameCanvas.var_int_b / 3) {
                        nArray = this.var_int_arr_lII1I111;
                        int[] nArray5 = nArray;
                        nArray5[1] = nArray5[1] - (12 + this.ll1IIll1);
                        if (!this.var_boolean_l1I1lIII && this.ll1IIll1 == 0) {
                            BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_arr_lII1I111[1] + 20, this.var_int_arr_l1ll1lIlI[1] + 5, (byte)19);
                        }
                    }
                    if (!this.var_boolean_l1I1lIlI11I1) {
                        this.llIIIl1I = this.var_int_IIll11II1lll + this.IIllll1lII;
                        this.Ill1IlI1I = this.llIIIl1I - 1;
                        this.Ill1IllIIlI = this.IIII1ll11Il - 40;
                        ++this.I1I111111I1;
                        if (this.I1I111111I1 == 30) {
                            this.I1I111111I1 = 0;
                        }
                        if (GameCanvas.var_int_a % 2 == 0) {
                            this.IIllll1lII = this.I1I111111I1 <= 15 ? --this.IIllll1lII : ++this.IIllll1lII;
                        }
                    }
                    if (this.var_int_arr_lII1I111[1] <= GameCanvas.var_int_b && this.var_int_IIll11II1lll >= 0 && this.var_int_arr_lII1I111[1] <= this.var_int_IIll11II1lll + 80 && !this.var_boolean_l1I1lIII) {
                        this.var_boolean_l1I1lIII = true;
                        new ChatScreen(this.var_int_IIll11II1lll + 80, this.lII1Il11l1, 0);
                        if (this.ll1IIll1 == 0) {
                            for (n = 0; n < 6; ++n) {
                                int n5 = DataUtils.d(n + 1);
                                n2 = DataUtils.b(-8, -5);
                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.var_int_IIll11II1lll + 80, this.lII1Il11l1, n5, n2, (byte)3);
                            }
                        }
                    }
                    if (this.var_int_arr_lII1I111[0] > GameCanvas.var_int_b || this.var_int_IIll11II1lll < 0 || this.var_int_arr_lII1I111[0] > this.var_int_IIll11II1lll - 12) break;
                    if (!this.var_boolean_l1I1lIlI11I1) {
                        this.var_boolean_l1I1lIlI11I1 = true;
                        new ChatScreen(this.Ill1IlI1I, this.Ill1IllIIlI, 0);
                        if (this.ll1IIll1 == 0) {
                            for (n = 0; n < 6; ++n) {
                                int n6 = DataUtils.d(n + 1);
                                n2 = DataUtils.b(-8, -5);
                                BattleScreen.var_game_BattleGraphicHelper_a.a(this.Ill1IlI1I, this.Ill1IllIIlI, n6, n2, (byte)3);
                            }
                        }
                    }
                    if (this.var_boolean_l1I1lIlI11I1) {
                        this.llIIIl1I -= 2 + this.ll1IIll1 / 3;
                    }
                    if (this.llIIIl1I <= GameCanvas.var_int_b / 2 - 10) {
                        this.llIIIl1I = GameCanvas.var_int_b / 2 - 10;
                    }
                    this.II11lI1l += 1 + this.ll1IIll1;
                    this.IIII1ll11Il += this.II11lI1l / 2 + this.ll1IIll1;
                    n = 0;
                    while (n < this.var_int_arr_l1I1lIII.length) {
                        int[] nArray6;
                        int[] nArray7 = nArray6 = this.var_int_arr_l1I1lIII;
                        int n7 = n++;
                        nArray7[n7] = nArray7[n7] - (2 + this.ll1IIll1);
                    }
                    if (BattleScreen.var_java_util_Vector_b.size() == 0 || this.ll1IIll1 != 0) {
                        this.IIlIllll11I += this.II11lI1l / 2 + 2 + this.ll1IIll1;
                    }
                    if (this.IIlIllll11I > 0) {
                        this.IIlIllll11I = 0;
                    }
                    this.Ill1IlI1I = this.var_int_IIll11II1lll + this.IIllll1lII - 1;
                    if (this.IIII1ll11Il <= this.IlIl1III + 10) break;
                    this.IIII1ll11Il = this.IlIl1III + 10;
                    this.lIIl1l1ll11 = -this.l1I11III;
                    this.l1I11III -= 4;
                    this.var_boolean_b = false;
                    this.var_boolean_l111I1l1I1 = true;
                    this.var_boolean_c = false;
                    this.var_boolean_II1IllIII111 = true;
                    this.IIlIllll11I = 0;
                    this.h = this.var_game_MapEntity_a.var_game_GameCommand_a;
                    this.f = this.var_game_GameCommand_b;
                    this.g = this.var_game_GameCommand_a;
                    break;
                }
                if (this.var_boolean_II1IllIII111) {
                    ++this.IllllIIlI;
                    if (this.IllllIIlI == 20) {
                        this.IllllIIlI = 0;
                        this.var_boolean_II1IllIII111 = false;
                        BattleScreen.var_game_BattleGraphicHelper_a.a(GameCanvas.var_int_b, 0, GameCanvas.var_int_b / 2 + 45, this.var_game_MapEntity_a.var_int_b - 50, 0);
                        if (!this.var_boolean_c) {
                            new ChatScreen(GameCanvas.var_int_b / 2 + 40, this.var_game_MapEntity_a.var_int_b - 80, 0);
                            new ChatScreen(GameCanvas.var_int_b / 2 + 40, this.var_game_MapEntity_a.var_int_b - 50, 0);
                            new ChatScreen(GameCanvas.var_int_b / 2 + 40, this.var_game_MapEntity_a.var_int_b - 20, 0);
                        }
                        for (n = 0; n < 6; ++n) {
                            BattleScreen.var_game_BattleGraphicHelper_a.a(GameCanvas.var_int_b / 2 + 40, this.var_game_MapEntity_a.var_int_b - 50, DataUtils.d(n + 1), DataUtils.b(-8, -5), (byte)3);
                        }
                        for (n = 0; n < 6; ++n) {
                            BattleScreen.var_game_BattleGraphicHelper_a.a(GameCanvas.var_int_b / 2 + 40, this.var_game_MapEntity_a.var_int_b - 50, -DataUtils.d(n + 1), DataUtils.b(-8, -5), (byte)2);
                        }
                        this.var_boolean_IIll11II1lll = false;
                    }
                }
                if (this.var_boolean_l111I1l1I1) {
                    this.lIIl1l1ll11 += 3;
                    this.IIII1ll11Il += this.lIIl1l1ll11;
                    if (this.IIII1ll11Il > this.IlIl1III) {
                        this.IIII1ll11Il = this.IlIl1III;
                        this.lIIl1l1ll11 = -this.l1I11III;
                        this.l1I11III -= 4;
                    }
                }
                GameHelper18.a();
                GameHelper18.b();
                this.var_game_MapEntity_a.c();
                this.var_game_MapEntity_b.c();
                if (!var_boolean_a || (var_int_b += 2) <= var_int_c) break;
                var_int_b = var_int_c;
            }
        }
        BattleScreen.var_game_BattleGraphicHelper_a.a();
        for (n = 0; n < BattleScreen.var_java_util_Vector_b.size(); ++n) {
            ((ChatScreen)BattleScreen.var_java_util_Vector_b.elementAt(n)).a();
        }
    }

    public final void b(int n) {
        if (GameCanvas.var_game_GameHelper21_a == null) {
            if (this.var_int_a == 0) {
                this.var_game_MapEntity_a.boolean_a(n);
                return;
            }
            this.var_game_MapEntity_b.boolean_a(n);
        }
    }

    public final void g() {
        if (e == 0) {
            e = 1;
            this.var_game_GameCommand_l11l1I11lll1.var_java_lang_String_a = StringUtils.dW();
        } else {
            e = 0;
            this.var_game_GameCommand_l11l1I11lll1.var_java_lang_String_a = StringUtils.az();
        }
        DataUtils.a("remember_2", e);
    }

    public final void a(Graphics graphics) {
        int n = 184;
        if (184 >= GameCanvas.var_int_b) {
            n = 152;
        }
        this.I1111ll11I = GameCanvas.var_int_b / 2 - n / 2;
        this.var_game_MapEntity_a.var_int_a = this.I1111ll11I + 70;
        this.var_game_MapEntity_a.var_int_b = this.llIllll1 + 25;
        this.var_game_MapEntity_b.var_int_a = this.I1111ll11I + 70;
        this.var_game_MapEntity_b.var_int_b = this.llIllll1 + 50;
        if (GameCanvas.var_boolean_d) {
            this.var_game_MapEntity_b.var_int_b = this.llIllll1 + 60;
        }
        switch (this.var_byte_a) {
            case 0: {
                ClanScreen.c(graphics);
                BaseScreen.c(graphics);
                n = GameCanvas.var_int_e - 38;
                FontRenderer.e.a(graphics, "T\u1ed1c \u0111\u1ed9 (Speed Game)", GameCanvas.var_int_d, n, 2);
                FontRenderer.e.a(graphics, String.valueOf(GameCanvas.l + 1), GameCanvas.var_int_d, n + 18, 2);
                DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 4, GameCanvas.var_int_d - 30 + GameCanvas.var_int_a % 3, n + 27, 3);
                DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 7, GameCanvas.var_int_d + 30 - GameCanvas.var_int_a % 3, n + 27, 3);
                FontRenderer.d.a(graphics, "C\u00f3 th\u1ec3 ch\u1ec9nh s\u1eeda sau trong c\u00e0i \u0111\u1eb7t c\u1ea5u h\u00ecnh", GameCanvas.var_int_d, n + 45, 2);
                break;
            }
            case 1: {
                ClanScreen.c(graphics);
                BaseScreen.c(graphics);
                n = GameCanvas.var_int_e - 38;
                FontRenderer.e.a(graphics, StringUtils.cv(), GameCanvas.var_int_d, n, 2);
                FontRenderer.e.a(graphics, ModAutoForm.var_java_lang_String_arr_a[BattleScreen.var_byte_a], GameCanvas.var_int_d, n + 18, 2);
                DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 4, GameCanvas.var_int_d - 30 + GameCanvas.var_int_a % 3, n + 27, 3);
                DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 7, GameCanvas.var_int_d + 30 - GameCanvas.var_int_a % 3, n + 27, 3);
                break;
            }
            case 2: {
                ClanScreen.c(graphics);
                BaseScreen.c(graphics);
                n = GameCanvas.var_int_e - 38;
                FontRenderer.e.a(graphics, StringUtils.dV(), GameCanvas.var_int_d, n, 2);
                FontRenderer.e.a(graphics, soundVolume + "%", GameCanvas.var_int_d, n + 18, 2);
                DataUtils.a(graphics, BattleScreen.var_javax_microedition_lcdui_Image_arr_a[3], 0, 0, 13, 11, 4, GameCanvas.var_int_d - 30 + GameCanvas.var_int_a % 3, n + 27, 3);
                DataUtils.a(graphics, BattleScreen.var_javax_microedition_lcdui_Image_arr_a[3], 0, 0, 13, 11, 7, GameCanvas.var_int_d + 30 - GameCanvas.var_int_a % 3, n + 27, 3);
                if (GameCanvas.var_int_b <= 200) break;
                graphics.drawImage(var_javax_microedition_lcdui_Image_l111I1l1I1, GameCanvas.var_int_d, 10, 3);
                break;
            }
            case 3: 
            case 4: {
                graphics.translate(0, -this.IIlIllll11I);
                if (this.var_boolean_b) {
                    graphics.setColor(6606845);
                    graphics.fillRect(0, this.IIlIllll11I, GameCanvas.var_int_b, GameCanvas.var_int_c);
                    graphics.setColor(7612928);
                    for (n = 0; n < 4; ++n) {
                        graphics.drawImage(GameHelper18.a[n % 2], this.var_int_arr_l1I1lIlI11I1[n], this.var_int_arr_l1I1lIII[n] - 1500, 0);
                    }
                    for (n = 0; n < 7; ++n) {
                        int[] nArray;
                        int n2 = -1200 + n * 120;
                        if (n2 < this.IIlIllll11I - 50 || n2 > this.IIlIllll11I + GameCanvas.var_int_c) continue;
                        graphics.drawImage(GameHelper18.a[0], this.var_int_arr_l11l1I11lll1[n], n2, 0);
                        int[] nArray2 = nArray = this.var_int_arr_l11l1I11lll1;
                        int n3 = n;
                        nArray2[n3] = nArray2[n3] + (1 + this.ll1IIll1);
                    }
                    for (n = 0; n < 7; ++n) {
                        int[] nArray;
                        int n4 = -1100 + n * 200;
                        if (n4 < this.IIlIllll11I - 50 || n4 > this.IIlIllll11I + GameCanvas.var_int_c) continue;
                        graphics.drawImage(GameHelper18.a[1], this.var_int_arr_Il11lIlllI1[n] + (n << 2) - 90, n4, 0);
                        if (GameCanvas.var_int_a % 2 != 0) continue;
                        int[] nArray3 = nArray = this.var_int_arr_Il11lIlllI1;
                        int n5 = n;
                        nArray3[n5] = nArray3[n5] + (1 + this.ll1IIll1);
                    }
                    for (n = 0; n < 4; ++n) {
                        int n6 = -700 + n * 300;
                        if (n6 < this.IIlIllll11I - 50 || n6 > this.IIlIllll11I + GameCanvas.var_int_c) continue;
                        graphics.drawImage(ClanScreen.var_javax_microedition_lcdui_Image_d, this.var_int_arr_l111I1l1I1[n] - 50, n6, 0);
                    }
                    graphics.drawLine(this.var_int_IIll11II1lll - 5, this.lII1Il11l1 + 48, this.Ill1IlI1I, this.Ill1IllIIlI);
                    graphics.drawLine(this.var_int_IIll11II1lll + 5, this.lII1Il11l1 + 48, this.Ill1IlI1I, this.Ill1IllIIlI);
                    graphics.drawImage(var_javax_microedition_lcdui_Image_l1ll1lIlI, this.var_int_IIll11II1lll, this.lII1Il11l1, 3);
                    if (!this.var_boolean_l1I1lIlI11I1) {
                        graphics.drawImage(ClanScreen.h, this.llIIIl1I, this.IIII1ll11Il - 39, 17);
                        DataUtils.a(graphics, var_javax_microedition_lcdui_Image_l11l1I11lll1, 0, 0, 15, 15, 2, this.var_int_arr_lII1I111[0], this.var_int_arr_l1ll1lIlI[0], 0);
                    }
                    if (!this.var_boolean_l1I1lIII) {
                        DataUtils.a(graphics, var_javax_microedition_lcdui_Image_l11l1I11lll1, 0, 0, 15, 15, 2, this.var_int_arr_lII1I111[1], this.var_int_arr_l1ll1lIlI[1], 0);
                    }
                }
                ClanScreen.c(graphics);
                GameHelper18.b(graphics);
                ClanScreen.b(graphics);
                FontRenderer.i.a(graphics, TerrainMidlet.version, GameCanvas.var_int_b - 2, 2, 1);
                n = GameCanvas.var_int_b < 200 ? 3 : 4;
                int n7 = GameCanvas.var_boolean_d ? 120 : 100;
                BaseScreen.a(graphics, this.llIllll1, n, n7, "");
                graphics.drawImage(var_javax_microedition_lcdui_Image_lII1I111, this.llIIIl1I, this.IIII1ll11Il, 3);
                graphics.drawImage(BattleScreen.var_javax_microedition_lcdui_Image_h, GameCanvas.var_int_b / 2 + 50, this.var_game_MapEntity_a.var_int_b - 50, 3);
                if (this.var_boolean_IIll11II1lll) {
                    graphics.drawImage(ClanScreen.f, GameCanvas.var_int_b / 2 + 20, this.var_game_MapEntity_a.var_int_b - 95, 0);
                    graphics.drawImage(ClanScreen.f, GameCanvas.var_int_b / 2 + 25, this.var_game_MapEntity_a.var_int_b - 70, 0);
                    graphics.drawImage(ClanScreen.f, GameCanvas.var_int_b / 2 + 17, this.var_game_MapEntity_a.var_int_b - 63, 0);
                }
                n = (GameCanvas.var_int_c - this.llIllll1 - GameCanvas.var_int_c - BaseScreen.var_int_r) / 21;
                for (n7 = 0; n7 < n + 1; ++n7) {
                    graphics.drawImage(ClanScreen.e, this.var_game_MapEntity_a.var_int_a + 65, this.llIllll1 + GameCanvas.var_int_c + n7 * 21, 0);
                }
                BattleScreen.var_game_BattleGraphicHelper_a.a(graphics);
                for (n7 = 0; n7 < BattleScreen.var_java_util_Vector_b.size(); ++n7) {
                    ((ChatScreen)BattleScreen.var_java_util_Vector_b.elementAt(n7)).a(graphics);
                }
                FontRenderer.e.a(graphics, StringUtils.dp() + ":", this.var_game_MapEntity_a.var_int_a - 59, this.var_game_MapEntity_a.var_int_b + 4, 0);
                this.var_game_MapEntity_a.a(graphics);
                graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
                FontRenderer.e.a(graphics, StringUtils.dq() + ":", this.var_game_MapEntity_b.var_int_a - 59, this.var_game_MapEntity_b.var_int_b + 4, 0);
                n7 = GameCanvas.var_int_b < 200 ? 30 : 0;
                n = GameCanvas.var_boolean_d ? 0 : 10;
                FontRenderer.e.a(graphics, StringUtils.az(), this.I1111ll11I + 120 - n7, this.var_game_MapEntity_b.var_int_b + 35 - n, 0);
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_Il11lIlllI1, 0, 16 * e, 18, 16, 0, this.I1111ll11I + 120 - n7 + 30, this.var_game_MapEntity_b.var_int_b + 35 - n, 0);
                this.var_game_MapEntity_b.a(graphics);
                if (var_boolean_a) {
                    GameCanvas.var_game_GameHelper20_a.a(StringUtils.aC() + " " + var_int_b + "%", null, null, null);
                }
                if (this.var_byte_a != 4) break;
                graphics.translate(0, 0);
                graphics.setColor(56064);
                graphics.fillRect(0, GameCanvas.var_int_c / 2 - 3, GameCanvas.var_int_b, ServerInfo.var_java_lang_String_arr_a == null ? BaseScreen.var_int_o : BaseScreen.var_int_o * ServerInfo.var_java_lang_String_arr_a.length);
                graphics.setColor(16767817);
                graphics.fillRect(0, GameCanvas.var_int_c / 2 + this.var_int_d * 20 - 3, GameCanvas.var_int_b, BaseScreen.var_int_o);
                if (ServerInfo.var_java_lang_String_arr_a != null) {
                    FontRenderer.e.a(graphics, "Ch\u1ecdn m\u00e1y ch\u1ee7", GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2 - ServerInfo.var_java_lang_String_arr_a.length * 20 / 2 - 10, 3);
                    for (n = 0; n < ServerInfo.var_java_lang_String_arr_a.length; ++n) {
                        FontRenderer.a.a(graphics, ServerInfo.var_java_lang_String_arr_a[n], GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2 + n * 20, 3);
                    }
                    break;
                }
                FontRenderer.e.a(graphics, "Ch\u1ecdn m\u00e1y ch\u1ee7", GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2 - 10 - 10, 3);
                FontRenderer.a.a(graphics, "<Ch\u01b0a c\u00f3 th\u00f4ng tin>", GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2, 3);
            }
        }
        super.a(graphics);
    }

    private void llIlllll1lII() {
        if (this.var_int_a == 0) {
            this.var_game_MapEntity_a.var_boolean_a = true;
            this.var_game_MapEntity_b.var_boolean_a = false;
            this.h = this.var_game_MapEntity_a.var_game_GameCommand_a;
            this.g = this.var_game_GameCommand_a;
        }
        if (this.var_int_a == 1) {
            this.var_game_MapEntity_a.var_boolean_a = false;
            this.var_game_MapEntity_b.var_boolean_a = true;
            this.h = this.var_game_MapEntity_b.var_game_GameCommand_a;
            this.g = this.var_game_GameCommand_a;
        }
        if (this.var_int_a == 2) {
            this.var_game_MapEntity_a.var_boolean_a = false;
            this.var_game_MapEntity_b.var_boolean_a = false;
            this.h = null;
            this.g = this.var_game_GameCommand_l11l1I11lll1;
        }
    }

    public final void void_b() {
        switch (this.var_byte_a) {
            case 0: {
                if (GameCanvas.var_boolean_arr_a[4]) {
                    if (--GameCanvas.l < 0) {
                        GameCanvas.l = 9;
                    }
                    GameCanvas.a();
                    BaseScreen.m();
                }
                if (GameCanvas.var_boolean_arr_a[6]) {
                    if (++GameCanvas.l > 9) {
                        GameCanvas.l = 0;
                    }
                    GameCanvas.a();
                    BaseScreen.m();
                }
                if (!GameCanvas.var_boolean_c) break;
                if (GameCanvas.a(GameCanvas.var_int_d - 50, GameCanvas.var_int_e - 25, 50, 50)) {
                    GameCanvas.var_boolean_arr_a[4] = true;
                }
                if (!GameCanvas.a(GameCanvas.var_int_d, GameCanvas.var_int_e - 25, 50, 50)) break;
                GameCanvas.var_boolean_arr_a[6] = true;
                break;
            }
            case 1: {
                if (GameCanvas.var_boolean_arr_a[4]) {
                    if ((BattleScreen.var_byte_a = (byte)(BattleScreen.var_byte_a + 1)) > 2) {
                        BattleScreen.var_byte_a = 0;
                    }
                    BaseScreen.m();
                }
                if (GameCanvas.var_boolean_arr_a[6]) {
                    if ((BattleScreen.var_byte_a = (byte)(BattleScreen.var_byte_a - 1)) < 0) {
                        BattleScreen.var_byte_a = (byte)2;
                    }
                    BaseScreen.m();
                }
                if (!GameCanvas.var_boolean_c) break;
                if (GameCanvas.a(GameCanvas.var_int_d - 50, GameCanvas.var_int_e - 25, 50, 50)) {
                    GameCanvas.var_boolean_arr_a[4] = true;
                }
                if (!GameCanvas.a(GameCanvas.var_int_d, GameCanvas.var_int_e - 25, 50, 50)) break;
                GameCanvas.var_boolean_arr_a[6] = true;
                break;
            }
            case 2: {
                if (GameCanvas.var_boolean_arr_a[4]) {
                    if (soundVolume > 0) {
                        soundVolume -= 10;
                    }
                    BaseScreen.m();
                }
                if (!GameCanvas.var_boolean_arr_a[6]) break;
                if (soundVolume < 100) {
                    soundVolume += 10;
                }
                BaseScreen.m();
                break;
            }
            case 3: {
                if (this.var_boolean_l111I1l1I1) {
                    if (GameCanvas.var_boolean_arr_a[2]) {
                        --this.var_int_a;
                        if (this.var_int_a < 0) {
                            this.var_int_a = 2;
                        }
                        this.llIlllll1lII();
                        BaseScreen.m();
                    }
                    if (GameCanvas.var_boolean_arr_a[8]) {
                        ++this.var_int_a;
                        if (this.var_int_a > 2) {
                            this.var_int_a = 0;
                        }
                        BaseScreen.m();
                        this.llIlllll1lII();
                    }
                    if (GameCanvas.var_boolean_c) {
                        if (GameCanvas.a(this.I1111ll11I + 140 - this.IIllll1lII, this.var_game_MapEntity_b.var_int_b + 28, 30, 30)) {
                            this.g();
                        }
                        if (GameCanvas.a(this.var_game_MapEntity_a.var_int_a, this.var_game_MapEntity_a.var_int_b, this.var_game_MapEntity_a.var_int_c, this.var_game_MapEntity_a.d)) {
                            this.var_int_a = 0;
                            this.llIlllll1lII();
                            this.var_game_MapEntity_a.void_a();
                        }
                        if (GameCanvas.a(this.var_game_MapEntity_b.var_int_a, this.var_game_MapEntity_b.var_int_b, this.var_game_MapEntity_b.var_int_c, this.var_game_MapEntity_b.d)) {
                            this.var_int_a = 1;
                            this.var_game_MapEntity_b.var_boolean_c = true;
                            this.llIlllll1lII();
                            this.var_game_MapEntity_b.void_a();
                        }
                    }
                }
                if (this.var_boolean_b) {
                    if (!GameCanvas.var_boolean_arr_a[13]) break;
                    this.var_boolean_c = true;
                    BaseScreen.m();
                    break;
                }
                if (!this.var_boolean_c) break;
                return;
            }
            case 4: {
                if (ServerInfo.var_java_lang_String_arr_a == null) break;
                if (GameCanvas.var_boolean_arr_a[8]) {
                    BaseScreen.m();
                    ++this.var_int_d;
                    if (this.var_int_d > ServerInfo.var_java_lang_String_arr_a.length - 1) {
                        this.var_int_d = 0;
                    }
                } else if (GameCanvas.var_boolean_arr_a[2]) {
                    BaseScreen.m();
                    --this.var_int_d;
                    if (this.var_int_d < 0) {
                        this.var_int_d = ServerInfo.var_java_lang_String_arr_a.length - 1;
                    }
                }
                if (!GameCanvas.var_boolean_c || Math.abs(GameCanvas.h - GameCanvas.g) >= 10) break;
                int n = (GameCanvas.g - GameCanvas.var_int_c / 2) / 20;
                if (n == this.var_int_d && this.g != null) {
                    this.g.var_game_IActionListener_a.a();
                }
                this.var_int_d = n;
                if (this.var_int_d < 0) {
                    this.var_int_d = 0;
                }
                if (this.var_int_d <= ServerInfo.var_java_lang_String_arr_a.length - 1) break;
                this.var_int_d = ServerInfo.var_java_lang_String_arr_a.length - 1;
            }
        }
        super.void_b();
    }

    private void I1lllllIlIl1() {
        this.var_game_MapEntity_a.var_int_a = -this.var_int_l1I1lIII;
        this.var_game_MapEntity_b.var_int_a = GameCanvas.var_int_b + this.var_int_l1I1lIII;
    }

    static {
        Object object;
        var_int_b = 0;
        var_int_c = 15;
        var_boolean_d = false;
        InputStream inputStream = DataUtils.java_io_InputStream_a("/agent.txt");
        try {
            object = new byte[inputStream.available()];
            inputStream.read((byte[])object);
            inputStream.close();
            var_java_lang_String_l1ll1lIlI = new String((byte[])object, "UTF-8");
        }
        catch (Exception exception) {
            var_java_lang_String_l1ll1lIlI = "";
        }
        try {
            var_javax_microedition_lcdui_Image_Il11lIlllI1 = Image.createImage((String)"/map/remember.png");
            var_javax_microedition_lcdui_Image_l111I1l1I1 = Image.createImage((String)"/bpa.png");
        } catch (Exception e) {}
        var_javax_microedition_lcdui_Image_l1ll1lIlI = ClanScreen.g;
        var_javax_microedition_lcdui_Image_l11l1I11lll1 = ShopScreen.var_javax_microedition_lcdui_Image_a;
    }
}

