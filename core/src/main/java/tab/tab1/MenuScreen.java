/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;

public final class MenuScreen
extends BaseScreen {
    public static MenuScreen var_game_MenuScreen_a;
    private int var_int_I11Il1ll = 0;
    private static byte var_byte_IllII11I1I1;
    private static byte var_byte_l1lllIlI;
    private static byte var_byte_III1llIll;
    private static byte var_byte_I1I1lII1l;
    private static byte var_byte_lI1ll1I1;
    public static byte var_byte_a;
    public static String var_java_lang_String_a;
    public static String var_java_lang_String_b;
    public static String var_java_lang_String_c;
    private int var_int_IllII11I1I1;
    private int var_int_l1lllIlI;
    private int var_int_III1llIll;
    public static String[][] var_java_lang_String_arr_arr_a;
    private static int var_int_I1I1lII1l;
    private static int var_int_lI1ll1I1;
    public static boolean var_boolean_a;
    public static String[] var_java_lang_String_arr_a;
    private static int[] var_int_arr_I11Il1ll;
    private GameCommand var_game_GameCommand_I11Il1ll;
    private GameCommand var_game_GameCommand_IllII11I1I1;
    private int var_int_Ill1lI1Ill1I;
    private int lIl1I1Il1ll1;
    private int I1ll1l1lI;
    private GameHelper40 var_game_GameHelper40_I11Il1ll = new GameHelper40(0, 1);
    private boolean var_boolean_III1llIll = false;
    private boolean var_boolean_I1I1lII1l = false;
    private boolean var_boolean_lI1ll1I1;
    public boolean var_boolean_b;
    public static boolean var_boolean_c;
    private int II1IlI1Il;
    private int I1lI11II1ll;
    private int II1IIIlIIIlI;
    private int lIlIIllll111;
    private int lIl1l11111;
    private int lll1llll1lI;
    private int I11I11IlI;
    private int llI1Il11lIl1 = 0;
    private boolean var_boolean_Ill1lI1Ill1I = false;
    public FloatingTextManager var_game_FloatingTextManager_a;

    public static void a(int n) {
        if (n == 0) {
            var_byte_IllII11I1I1 = 1;
            var_byte_l1lllIlI = (byte)2;
            var_byte_III1llIll = (byte)3;
            var_byte_I1I1lII1l = (byte)4;
            var_byte_lI1ll1I1 = (byte)5;
            var_java_lang_String_arr_a = new String[]{StringUtils.dt(), StringUtils.w(), StringUtils.dw(), StringUtils.x(), StringUtils.dx(), StringUtils.dy()};
        }
        if (n == 1) {
            var_byte_IllII11I1I1 = 1;
            var_byte_a = (byte)2;
            var_byte_l1lllIlI = (byte)3;
            var_byte_III1llIll = (byte)4;
            var_byte_I1I1lII1l = (byte)5;
            var_byte_lI1ll1I1 = (byte)6;
            var_java_lang_String_arr_a = new String[]{StringUtils.dt(), StringUtils.w(), "", StringUtils.dw(), StringUtils.x(), StringUtils.dx(), StringUtils.dy()};
        }
        MenuScreen.var_java_lang_String_arr_arr_a[0] = new String[]{StringUtils.dz(), StringUtils.dA(), StringUtils.dB(), StringUtils.A(), StringUtils.ao(), StringUtils.dC(), StringUtils.z()};
        MenuScreen.var_java_lang_String_arr_arr_a[MenuScreen.var_byte_I1I1lII1l] = new String[]{StringUtils.cK(), StringUtils.cJ(), StringUtils.X(), StringUtils.cI(), "B\u1ea2N TH\u00c2N", StringUtils.cH(), StringUtils.cG()};
        MenuScreen.var_java_lang_String_arr_arr_a[6] = new String[]{StringUtils.aD(), StringUtils.aE(), "1 VS 1", "2 VS 2", "3 VS 3", "4 VS 4", StringUtils.aB()};
        MenuScreen.var_java_lang_String_arr_arr_a[MenuScreen.var_byte_IllII11I1I1] = new String[]{StringUtils.du(), StringUtils.dv(), StringUtils.y(), StringUtils.k()};
    }

    public MenuScreen() {
        var_int_I1I1lII1l = 0;
        var_int_lI1ll1I1 = 0;
        this.I1lllIIlll1(var_int_I1I1lII1l, var_int_lI1ll1I1);
        Object object = new ActionListener002(this);
        this.var_game_GameCommand_I11Il1ll = new GameCommand(StringUtils.dH(), new ActionListener106(this));
        this.var_game_GameCommand_IllII11I1I1 = new GameCommand(StringUtils.dG(), new ActionListener042(this));
        this.f = new GameCommand(StringUtils.dF(), (IActionListener)object);
        this.g = new GameCommand("", (IActionListener)object);
        this.h = this.var_game_GameCommand_IllII11I1I1;
        object = TerrainMidlet.myInfo;
        ((PlayerAccountInfo)object).b();
        if (TerrainMidlet.isVip[((PlayerAccountInfo)object).var_byte_a]) {
            ((PlayerAccountInfo)object).c();
        }
        this.j = true;
        this.var_int_Ill1lI1Ill1I = GameCanvas.var_boolean_d ? 32 : 20;
        this.var_game_FloatingTextManager_a = new FloatingTextManager();
    }

    private void IllllII11() {
        int n;
        this.lIl1I1Il1ll1 = GameCanvas.var_boolean_d ? 80 : (GameCanvas.var_int_c >> 1) - 10;
        this.var_int_IllII11I1I1 = this.lIl1I1Il1ll1 - 25;
        this.I1ll1l1lI = (GameCanvas.var_int_e - 20) / this.var_int_Ill1lI1Ill1I;
        if (GameCanvas.var_boolean_d) {
            this.I1ll1l1lI = (GameCanvas.var_int_c - this.lIl1I1Il1ll1 - BaseScreen.var_int_r - 10) / this.var_int_Ill1lI1Ill1I;
        }
        if (this.I1ll1l1lI >= var_int_arr_I11Il1ll.length) {
            this.I1ll1l1lI = var_int_arr_I11Il1ll.length;
        }
        this.var_int_III1llIll = n = this.I1ll1l1lI * this.var_int_Ill1lI1Ill1I + 35;
        if (this.var_int_III1llIll > (GameCanvas.var_boolean_d ? GameCanvas.var_int_c - BaseScreen.var_int_r + 15 - this.lIl1I1Il1ll1 : 154)) {
            this.var_int_III1llIll = GameCanvas.var_boolean_d ? GameCanvas.var_int_c - BaseScreen.var_int_r + 15 - this.lIl1I1Il1ll1 : 154;
        }
    }

    public final void b_() {
        GameSetting.var_boolean_d = true;
        this.var_boolean_b = false;
        this.IllllII11();
        this.e();
        super.b_();
    }

    private void I1lllIIlll1(int n, int n2) {
        int n3;
        if (n == 0) {
            var_int_arr_I11Il1ll = new int[var_java_lang_String_arr_a.length];
        } else if (n == 1) {
            var_int_arr_I11Il1ll = new int[var_java_lang_String_arr_arr_a[n2].length];
        } else if (n == 2) {
            var_int_arr_I11Il1ll = new int[var_java_lang_String_arr_arr_a[n2].length];
        }
        var_int_I1I1lII1l = n;
        for (n3 = 0; n3 < var_int_arr_I11Il1ll.length; ++n3) {
            MenuScreen.var_int_arr_I11Il1ll[n3] = GameCanvas.var_int_b >> 1;
        }
        if (n == 0) {
            this.var_int_I11Il1ll = n2;
            this.lI1lIlII(n2, var_int_arr_I11Il1ll.length);
            this.h = this.var_game_GameCommand_IllII11I1I1;
        } else if (n == 1) {
            var_int_lI1ll1I1 = n2;
            this.var_int_I11Il1ll = 0;
            this.lI1lIlII(0, var_int_arr_I11Il1ll.length + 2);
            this.h = this.var_game_GameCommand_I11Il1ll;
        }
        n3 = (byte)(GameCanvas.var_boolean_d ? 5 : 0);
        this.lIl1l11111 = this.lIl1I1Il1ll1 + var_int_arr_I11Il1ll.length * this.var_int_Ill1lI1Ill1I - (GameCanvas.var_int_c - BaseScreen.var_int_r - 30 - n3);
    }

    public final void e() {
        this.var_boolean_b = false;
        this.var_boolean_I1I1lII1l = true;
        this.var_int_l1lllIlI = 50;
        byte by = (byte)(GameCanvas.var_boolean_d ? 5 : 0);
        this.lIl1l11111 = this.lIl1I1Il1ll1 + var_int_arr_I11Il1ll.length * this.var_int_Ill1lI1Ill1I - (GameCanvas.var_int_c - BaseScreen.var_int_r - 30 - by);
    }

    public final void a(boolean bl) {
        this.var_boolean_b = false;
        this.var_boolean_III1llIll = true;
        this.var_boolean_lI1ll1I1 = bl;
    }

    public final void c() {
        GameHelper16.b += 3;
        BattleScreen.var_game_BattleGraphicHelper_a.a();
        this.void_a();
        GameHelper18.a();
        this.var_game_FloatingTextManager_a.b();
        if (this.var_boolean_I1I1lII1l) {
            if (this.I1ll1l1lI > 6) {
                this.I1ll1l1lI = 6;
            }
            int n = this.I1ll1l1lI * this.var_int_Ill1lI1Ill1I;
            this.var_int_l1lllIlI += this.var_int_III1llIll / 4;
            this.lll1llll1lI = this.var_int_l1lllIlI - 30;
            if (this.lll1llll1lI > n) {
                this.lll1llll1lI = n;
            }
            if (this.var_int_l1lllIlI > this.var_int_III1llIll) {
                this.var_int_l1lllIlI = this.var_int_III1llIll;
                this.lll1llll1lI = n;
                this.var_boolean_I1I1lII1l = false;
            }
        }
        if (this.var_boolean_III1llIll) {
            this.var_int_l1lllIlI -= this.var_int_III1llIll / 4;
            this.lll1llll1lI = this.var_int_l1lllIlI - 30;
            if (this.lll1llll1lI < 40) {
                this.lll1llll1lI = 0;
            }
            if (this.var_int_l1lllIlI < 38) {
                this.var_int_l1lllIlI = 38;
                this.lll1llll1lI = 0;
                if (this.var_boolean_lI1ll1I1) {
                    new StringBuffer("[hq] currMenu= ").append(var_int_I1I1lII1l).append(" select= ").append(this.var_int_I11Il1ll);
                    if (var_int_I1I1lII1l == 0) {
                        if (this.var_int_I11Il1ll == 0) {
                            this.var_boolean_b = false;
                            this.I1lllIIlll1(1, this.var_int_I11Il1ll);
                        } else if (this.var_int_I11Il1ll == var_byte_IllII11I1I1) {
                            this.var_boolean_b = false;
                            this.I1lllIIlll1(1, this.var_int_I11Il1ll);
                        } else if (this.var_int_I11Il1ll == var_byte_l1lllIlI) {
                            this.var_boolean_b = true;
                            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)0, "");
                            GameCanvas.b(StringUtils.ds());
                        } else if (this.var_int_I11Il1ll == var_byte_a) {
                            UpdateScreen.var_game_UpdateScreen_a.b_();
                        } else if (this.var_int_I11Il1ll == var_byte_III1llIll) {
                            this.var_boolean_b = true;
                            PlayerAccountInfo myPlayerInfo = TerrainMidlet.myInfo;
                            if (myPlayerInfo.var_short_b > 0) {
                                ConnectionWatchdog.game_ConnectionWatchdog_a().b(myPlayerInfo.var_short_b);
                                ProfileScreen.var_boolean_a = true;
                            } else {
                                GameCanvas.void_a(StringUtils.v());
                            }
                        } else if (this.var_int_I11Il1ll == var_byte_I1I1lII1l) {
                            this.I1lllIIlll1(1, this.var_int_I11Il1ll);
                        } else if (this.var_int_I11Il1ll == var_byte_lI1ll1I1) {
                            this.var_boolean_b = true;
                            if (ModAutoForm.var_game_ModAutoForm_a == null) {
                                ModAutoForm.var_game_ModAutoForm_a = new ModAutoForm();
                            }
                            ModAutoForm.var_game_ModAutoForm_a.b_();
                        }
                    } else if (var_int_I1I1lII1l == 1) {
                        if (var_int_lI1ll1I1 == 0) {
                            this.var_boolean_b = true;
                            switch (this.var_int_I11Il1ll) {
                                case 0: {
                                    this.var_boolean_b = false;
                                    this.I1lllIIlll1(2, 6);
                                    break;
                                }
                                case 1: {
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().void_a();
                                    GameCanvas.b(StringUtils.ds());
                                    break;
                                }
                                case 2: {
                                    ChatEntity.var_game_ChatEntity_a.a((BaseScreen)this);
                                    break;
                                }
                                case 3: {
                                    this.var_boolean_b = true;
                                    var_boolean_a = true;
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().m();
                                    GameCanvas.void_a(StringUtils.ds());
                                    break;
                                }
                                case 4: {
                                    this.var_boolean_b = true;
                                    EquipScreen.var_game_EquipScreen_a.j();
                                    EquipScreen.var_game_EquipScreen_a.a((BaseScreen)this);
                                    break;
                                }
                                case 5: {
                                    BattleScreen.var_boolean_f = true;
                                    var_boolean_c = true;
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().f();
                                    GameCanvas.void_a(StringUtils.ds());
                                    break;
                                }
                                case 6: {
                                    if (LuckyDrawScreen.var_game_LuckyDrawScreen_a == null) {
                                        LuckyDrawScreen.var_game_LuckyDrawScreen_a = new LuckyDrawScreen();
                                    }
                                    LuckyDrawScreen.var_game_LuckyDrawScreen_a.a(var_game_MenuScreen_a);
                                }
                            }
                        } else if (var_int_lI1ll1I1 == var_byte_I1I1lII1l) {
                            this.var_boolean_b = true;
                            switch (this.var_int_I11Il1ll) {
                                case 0: {
                                    this.var_boolean_b = false;
                                    this.I1lllIIlll1(2, 7);
                                    break;
                                }
                                case 1: {
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().c();
                                    GameCanvas.b(StringUtils.ds());
                                    break;
                                }
                                case 2: {
                                    ProfileScreen.var_boolean_a = false;
                                    GameCanvas.void_a(StringUtils.ds());
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().i((byte)0);
                                    break;
                                }
                                case 3: {
                                    if (MissionScreen.a == null) {
                                        MissionScreen.a = new MissionScreen();
                                    }
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().c((byte)0, (byte)-1);
                                    GameCanvas.void_a(StringUtils.ds());
                                    break;
                                }
                                case 4: {
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().g(TerrainMidlet.myInfo.var_int_a);
                                    GameCanvas.void_a(StringUtils.ds());
                                    break;
                                }
                                case 5: {
                                    GameHelper13.var_game_GameHelper13_a.a((BaseScreen)this);
                                    break;
                                }
                                case 6: {
                                    String[] stringArray = new String[3];
                                    String[] stringArray2 = new String[3];
                                    String[] stringArray3 = stringArray2;
                                    stringArray2[0] = StringUtils.bO();
                                    stringArray3[1] = StringUtils.bP();
                                    stringArray3[2] = StringUtils.bQ();
                                    GameCanvas.var_game_InputScreen_a.a(stringArray3[0], new ActionListener198((MenuScreen)this, stringArray, stringArray3), new ActionListener145((MenuScreen)this), 2);
                                    GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
                                }
                            }
                        } else if (var_int_I1I1lII1l == var_byte_IllII11I1I1) {
                            this.var_boolean_b = true;
                            switch (this.var_int_I11Il1ll) {
                                case 0: {
                                    this.var_boolean_b = true;
                                    if (ExplosionEffect.var_game_ExplosionEffect_a == null) {
                                        ExplosionEffect.var_game_ExplosionEffect_a = new ExplosionEffect();
                                    }
                                    ExplosionEffect.e();
                                    ExplosionEffect.var_game_ExplosionEffect_a.a((BaseScreen)this);
                                    break;
                                }
                                case 1: {
                                    this.var_boolean_b = true;
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().l();
                                    GameCanvas.void_a(StringUtils.ds());
                                    break;
                                }
                                case 2: {
                                    this.var_boolean_b = true;
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)0, (byte)-1, (short)-1, (byte)-1);
                                    GameCanvas.void_a(StringUtils.ds());
                                    break;
                                }
                                case 3: {
                                    this.var_boolean_b = true;
                                    ConnectionWatchdog.game_ConnectionWatchdog_a().c((byte)0, (byte)-1, (byte)-1);
                                    GameCanvas.void_a(StringUtils.ds());
                                }
                                default: {
                                    break;
                                }
                            }
                        }
                    } else if (var_int_I1I1lII1l == 2) {
                        this.var_boolean_b = true;
                        if (var_int_lI1ll1I1 == 0) {
                            byte by = (byte)(this.var_int_I11Il1ll - 1);
                            ConnectionWatchdog.game_ConnectionWatchdog_a().b(by);
                            GameCanvas.b(StringUtils.ds());
                        } else if (var_int_lI1ll1I1 == var_byte_I1I1lII1l) {
                            ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)this.var_int_I11Il1ll, 0);
                        }
                    }
                    this.IllllII11();
                } else {
                    int n = var_int_I1I1lII1l - 1;
                    if (n < 0) {
                        n = 0;
                    }
                    this.I1lllIIlll1(n, var_int_lI1ll1I1);
                    this.IllllII11();
                }
                this.var_boolean_III1llIll = false;
                if (!this.var_boolean_b) {
                    this.var_boolean_I1I1lII1l = true;
                }
            }
        }
    }

    protected final void f() {
        this.a(true);
    }

    public static void a(byte by, short[] sArray, short[] sArray2, int[] nArray, short[] sArray3) {
        int n;
        BoardScreen.var_game_BoardScreen_a.var_java_util_Vector_a.removeAllElements();
        PlayerAccountInfo playerAccountInfo = new PlayerAccountInfo();
        playerAccountInfo.var_java_lang_String_a = "";
        playerAccountInfo.var_byte_a = TerrainMidlet.myInfo.var_byte_a;
        playerAccountInfo.var_int_b = 1;
        playerAccountInfo.f();
        for (n = 0; n < 5; ++n) {
            playerAccountInfo.var_short_arr_arr_a[playerAccountInfo.var_byte_a][n] = sArray3[n];
        }
        playerAccountInfo.b();
        BoardScreen.var_game_BoardScreen_a.var_java_util_Vector_a.addElement(playerAccountInfo);
        playerAccountInfo = new PlayerAccountInfo();
        playerAccountInfo.var_java_lang_String_a = "Enemy";
        playerAccountInfo.var_byte_a = TerrainMidlet.myInfo.var_byte_a;
        playerAccountInfo.var_int_b = 1;
        playerAccountInfo.f();
        for (n = 0; n < 5; ++n) {
            playerAccountInfo.var_short_arr_arr_a[playerAccountInfo.var_byte_a][n] = sArray3[n];
        }
        playerAccountInfo.b();
        BoardScreen.var_game_BoardScreen_a.var_java_util_Vector_a.addElement(playerAccountInfo);
        if (BattleScreen.var_game_BattleScreen_a == null) {
            BattleScreen.var_game_BattleScreen_a = new BattleScreen();
        }
        BattleScreen.var_game_BattleScreen_a.a(by, sArray, sArray2, nArray, 0);
        BattleScreen.var_game_BattleScreen_a.b_();
        BattleScreen.var_boolean_f = true;
        BattleScreen.var_game_GameHelper16_a.a(0);
        BattleManager.a((byte)0);
        BattleManager.var_game_PlayerEntity_arr_a[0].var_boolean_B = false;
        BattleManager.var_game_PlayerEntity_arr_a[0].var_int_arr_a = BoardScreen.int_arr_a();
        BattleScreen.var_int_n = 0;
        BattleManager.var_game_PlayerEntity_arr_a[0].var_int_w = 70;
        BattleScreen.var_byte_b = 0;
    }

    public final void g() {
        if (ItemEffect.var_game_ItemEffect_a == null) {
            ItemEffect.var_game_ItemEffect_a = new ItemEffect();
        }
        ItemEffect.var_game_ItemEffect_a.a(this);
    }

    public final void void_a() {
        if (this.I1lI11II1ll != this.II1IlI1Il) {
            this.lIlIIllll111 = this.II1IlI1Il - this.I1lI11II1ll << 2;
            this.II1IIIlIIIlI += this.lIlIIllll111;
            this.I1lI11II1ll += this.II1IIIlIIIlI >> 4;
            this.II1IIIlIIIlI &= 0xF;
        }
    }

    public final void a(Graphics graphics) {
        ClanScreen.c(graphics);
        ClanScreen.b(graphics);
        GameHelper18.b(graphics);
        super.a(graphics);
        if (!this.var_boolean_b) {
            int n;
            int n2;
            int n3;
            BaseScreen.a(graphics, this.var_int_IllII11I1I1, 3, this.var_int_l1lllIlI, null);
            FontRenderer.i.a(graphics, TerrainMidlet.version, GameCanvas.var_int_b - 2, 2, 1);
            if (var_int_I1I1lII1l == 1 || var_int_I1I1lII1l == 2) {
                if (!GameCanvas.var_boolean_d) {
                    n3 = GameCanvas.var_int_c / 2 - 80;
                    n2 = GameCanvas.var_int_b >> 1;
                } else {
                    n2 = GameCanvas.var_int_b >> 1;
                    n3 = 10;
                }
                if (var_int_lI1ll1I1 == 0 && GameCanvas.var_int_b >= 200) {
                    BoardScreen.a(graphics, TerrainMidlet.myInfo.g, n2 - 60, n3 + 5, 17);
                    PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
                    EquipSlotSet equipSlotSet = TerrainMidlet.isVip[playerAccountInfo.var_byte_a] ? playerAccountInfo.var_game_EquipSlotSet_b : playerAccountInfo.var_game_EquipSlotSet_a;
                    PlayerEntity.a(graphics, playerAccountInfo.var_byte_a, GameCanvas.var_int_a % 5 <= 2 ? 4 : 5, n2 - 60, n3 + 40, 0, equipSlotSet);
                    boolean bl = false;
                    int n4 = n3 + 40;
                    int n5 = n2 - 60;
                    Graphics graphics2 = graphics;
                    MenuScreen menuScreen = this;
                    menuScreen.var_game_FloatingTextManager_a.a(graphics2, n5, n4, 0);
                    n = n2 - 30;
                    FontRenderer.e.a(graphics, StringUtils.dD() + ": " + TerrainMidlet.myInfo.var_java_lang_String_a, n - 10, n3 - 20, 0);
                    graphics.drawImage(BaseScreen.s, n - 10, n3 - 2, 0);
                    FontRenderer.e.a(graphics, String.valueOf(playerAccountInfo.var_int_d), n + 10, n3, 0);
                    FontRenderer.e.a(graphics, "Level: " + TerrainMidlet.myInfo.var_int_b, n - 10, n3 + 14, 0);
                    FontRenderer.e.a(graphics, DataUtils.a(TerrainMidlet.myInfo.var_long_c) + " " + StringUtils.aq() + " - " + DataUtils.a(TerrainMidlet.myInfo.e) + " " + StringUtils.ar(), n - 10, n3 + 28, 0);
                }
                if (!GameCanvas.var_boolean_d) {
                    FontRenderer.f.a(graphics, var_java_lang_String_arr_a[var_int_lI1ll1I1], GameCanvas.var_int_b >> 1, 5, 2);
                }
            }
            this.I11I11IlI = 152;
            n3 = GameCanvas.var_int_b / 2 - this.I11I11IlI / 2;
            graphics.setClip(n3 + 5, this.lIl1I1Il1ll1, this.I11I11IlI - 10, this.lll1llll1lI);
            graphics.translate(0, -this.I1lI11II1ll);
            n2 = (byte)(GameCanvas.var_boolean_d ? 5 : 0);
            if (!this.var_boolean_III1llIll) {
                graphics.setColor(3374591);
                graphics.fillRect(n3, this.lIl1I1Il1ll1 + this.var_int_I11Il1ll * this.var_int_Ill1lI1Ill1I + n2, this.I11I11IlI, 22);
                int n6 = this.lIl1I1Il1ll1 + this.var_int_I11Il1ll * this.var_int_Ill1lI1Ill1I + n2;
                graphics.drawImage(BattleScreen.p, n3, n6, 0);
                DataUtils.a(graphics, BattleScreen.p, 0, 0, 14, 21, 3, n3 + this.I11I11IlI, n6, 24);
            }
            for (int i = 0; i < var_int_arr_I11Il1ll.length; ++i) {
                if (var_int_I1I1lII1l == 0) {
                    String string = var_java_lang_String_arr_a[i];
                    n = FontRenderer.a.a(string);
                    if (n > 85) {
                        int n7 = n - 85;
                        GameHelper40 gameHelper40 = this.var_game_GameHelper40_I11Il1ll;
                        this.var_game_GameHelper40_I11Il1ll.a += gameHelper40.b;
                        if (gameHelper40.b == -1 && Math.abs(gameHelper40.a) > n7) {
                            gameHelper40.b = -gameHelper40.b;
                        }
                        if (gameHelper40.b == 1 && gameHelper40.a > 5) {
                            gameHelper40.b = -gameHelper40.b;
                        }
                    }
                    int n8 = this.var_game_GameHelper40_I11Il1ll.a;
                    FontRenderer.f.a(graphics, var_java_lang_String_arr_a[i], n <= 85 ? var_int_arr_I11Il1ll[i] : n3 + 8 + n8, this.lIl1I1Il1ll1 + i * this.var_int_Ill1lI1Ill1I + n2, n <= 85 ? 2 : 0);
                    continue;
                }
                if (var_int_I1I1lII1l == 1) {
                    FontRenderer.f.a(graphics, var_java_lang_String_arr_arr_a[var_int_lI1ll1I1][i], var_int_arr_I11Il1ll[i], this.lIl1I1Il1ll1 + i * this.var_int_Ill1lI1Ill1I + n2, 2);
                    continue;
                }
                if (var_int_I1I1lII1l != 2) continue;
                if (var_int_lI1ll1I1 == 0) {
                    FontRenderer.f.a(graphics, var_java_lang_String_arr_arr_a[6][i], var_int_arr_I11Il1ll[i], this.lIl1I1Il1ll1 + i * this.var_int_Ill1lI1Ill1I + n2, 2);
                }
                if (var_int_lI1ll1I1 != var_byte_I1I1lII1l) continue;
                FontRenderer.f.a(graphics, var_java_lang_String_arr_arr_a[7][i], var_int_arr_I11Il1ll[i], this.lIl1I1Il1ll1 + i * this.var_int_Ill1lI1Ill1I + n2, 2);
            }
            if (TerrainMidlet.myInfo.var_short_a != 0) {
                BaseScreen.b(graphics);
            }
        }
    }

    public final void void_b() {
        if (!this.var_boolean_I1I1lII1l && !this.var_boolean_III1llIll) {
            boolean bl = false;
            if (GameCanvas.var_boolean_arr_a[2]) {
                GameCanvas.var_boolean_arr_a[2] = true;
                bl = true;
                this.var_int_I11Il1ll = this.var_int_I11Il1ll - 1 >= 0 ? this.var_int_I11Il1ll - 1 : var_int_arr_I11Il1ll.length - 1;
            } else if (GameCanvas.var_boolean_arr_a[8]) {
                bl = true;
                GameCanvas.var_boolean_arr_a[8] = false;
                int n = this.var_int_I11Il1ll = this.var_int_I11Il1ll + 1 <= var_int_arr_I11Il1ll.length - 1 ? this.var_int_I11Il1ll + 1 : 0;
            }
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_Ill1lI1Ill1I) {
                    this.llI1Il11lIl1 = this.I1lI11II1ll;
                    this.var_boolean_Ill1lI1Ill1I = true;
                }
                this.II1IlI1Il = this.llI1Il11lIl1 + (GameCanvas.h - GameCanvas.g);
                if (this.II1IlI1Il > this.lIl1l11111) {
                    this.II1IlI1Il = this.lIl1l11111;
                }
                if (this.II1IlI1Il < 0) {
                    this.II1IlI1Il = 0;
                }
            }
            if (GameCanvas.var_boolean_c) {
                this.var_boolean_Ill1lI1Ill1I = false;
                if (Math.abs(GameCanvas.h - GameCanvas.g) < 10 && GameCanvas.a(0, this.lIl1I1Il1ll1, GameCanvas.var_int_b, this.I1ll1l1lI * this.var_int_Ill1lI1Ill1I)) {
                    int n = (GameCanvas.g - this.lIl1I1Il1ll1 + this.I1lI11II1ll) / this.var_int_Ill1lI1Ill1I;
                    if (n < 0) {
                        n = 0;
                    }
                    if (n > var_int_arr_I11Il1ll.length - 1) {
                        n = var_int_arr_I11Il1ll.length - 1;
                    }
                    if (this.var_int_I11Il1ll != n) {
                        this.var_int_I11Il1ll = n;
                    } else {
                        this.a(true);
                    }
                }
            }
            if (bl) {
                this.lI1lIlII(this.var_int_I11Il1ll, var_int_arr_I11Il1ll.length);
            }
            super.void_b();
            BaseScreen.m();
        }
    }

    private void lI1lIlII(int n, int n2) {
        this.II1IlI1Il = n * this.var_int_Ill1lI1Ill1I - this.lll1llll1lI / 2;
        if (GameCanvas.var_boolean_d && n != 0) {
            this.II1IlI1Il += 10;
        }
        if (this.II1IlI1Il > n2 * this.var_int_Ill1lI1Ill1I - (n = this.I1ll1l1lI * this.var_int_Ill1lI1Ill1I)) {
            this.II1IlI1Il = n2 * this.var_int_Ill1lI1Ill1I - n;
        }
        if (this.II1IlI1Il < 0) {
            this.II1IlI1Il = 0;
        }
    }

    static {
        var_java_lang_String_arr_arr_a = new String[8][];
        var_boolean_c = false;
    }
}

