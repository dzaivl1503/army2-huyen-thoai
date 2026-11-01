/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab2;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ProfileScreen
extends BaseScreen {
    public static ProfileScreen var_game_ProfileScreen_a;
    public static ProfileScreen var_game_ProfileScreen_b;
    Vector var_java_util_Vector_a = new Vector();
    public int var_int_a;
    private int var_int_Ill111lll;
    private int var_int_I1I11I1IlIl;
    private int var_int_I11lI1lI1lI;
    private int llIIllIl;
    private int IlIl1II1;
    private int lllll111ll;
    public EquipItemEntry var_game_EquipItemEntry_a;
    public static boolean var_boolean_a;
    public static boolean var_boolean_b;
    private long[] var_long_arr_IllI1II11;
    private long[] var_long_arr_Ill111lll;
    private String[] var_java_lang_String_arr_IllI1II11;
    private GameHelper40 var_game_GameHelper40_IllI1II11 = new GameHelper40(0, 1);
    private GameHelper40 var_game_GameHelper40_Ill111lll = new GameHelper40(0, 1);
    private GameHelper40 var_game_GameHelper40_I1I11I1IlIl = new GameHelper40(0, 1);
    private GameHelper40 var_game_GameHelper40_I11lI1lI1lI = new GameHelper40(0, 1);
    public byte var_byte_a;
    private int l1I11111 = 0;
    private boolean var_boolean_I1I11I1IlIl = false;

    private static GameHelper40 IlI11IIl11l(GameHelper40 gameHelper40, int n) {
        gameHelper40.a += gameHelper40.b;
        if (gameHelper40.b == -1 && Math.abs(gameHelper40.a) > n) {
            gameHelper40.b = -gameHelper40.b;
        }
        if (gameHelper40.b == 1 && gameHelper40.a > 5) {
            gameHelper40.b = -gameHelper40.b;
        }
        return gameHelper40;
    }

    public final void void_a() {
        if (this.var_int_I1I11I1IlIl != this.var_int_Ill111lll) {
            this.llIIllIl = this.var_int_Ill111lll - this.var_int_I1I11I1IlIl << 2;
            this.var_int_I11lI1lI1lI += this.llIIllIl;
            this.var_int_I1I11I1IlIl += this.var_int_I11lI1lI1lI >> 4;
            this.var_int_I11lI1lI1lI &= 0xF;
        }
    }

    public ProfileScreen(int n) {
        this.lllll111ll = n;
    }

    public final void a(byte by, Vector vector) {
        this.var_java_util_Vector_a = vector;
        this.var_byte_a = by;
        for (by = 0; by < this.var_java_util_Vector_a.size(); by = (byte)(by + 1)) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(((EquipItemEntry)this.var_java_util_Vector_a.elementAt((int)by)).var_short_a);
        }
        this.IlIl1II1 = this.var_java_util_Vector_a.size() * 50 - (GameCanvas.var_int_c - (BaseScreen.var_int_o + BaseScreen.var_int_r) - 12);
    }

    public final void a(Graphics graphics) {
        String string;
        String[] stringArray;
        int n;
        int n2;
        int n3;
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        if (this.lllll111ll == 0) {
            FontRenderer.f.a(graphics, StringUtils.X(), GameCanvas.var_int_b / 2, 3, 3);
            graphics.translate(0, BaseScreen.var_int_o + 5);
            graphics.translate(0, -this.var_int_I1I11I1IlIl);
            n3 = 0;
            for (n2 = 0; n2 < this.var_java_util_Vector_a.size(); ++n2) {
                graphics.setClip(0, this.var_int_I1I11I1IlIl, GameCanvas.var_int_b, GameCanvas.var_int_c - 2 * BaseScreen.var_int_o - 5 + this.var_int_I1I11I1IlIl);
                if (n2 == this.var_int_a) {
                    graphics.setColor(16765440);
                    graphics.fillRect(0, n3, GameCanvas.var_int_b, 49);
                }
                EquipItemEntry equipItemEntry = (EquipItemEntry)this.var_java_util_Vector_a.elementAt(n2);
                if (equipItemEntry.var_javax_microedition_lcdui_Image_a != null) {
                    graphics.drawImage(equipItemEntry.var_javax_microedition_lcdui_Image_a, 4, n3 + 1, 0);
                }
                n = 0;
                int n4 = FontRenderer.a.a(equipItemEntry.var_java_lang_String_a);
                int n5 = 0;
                int n6 = FontRenderer.a.a(StringUtils.aa() + ": " + equipItemEntry.var_java_lang_String_b);
                if (n2 == this.var_int_a) {
                    if (n4 > GameCanvas.var_int_b - 30) {
                        ProfileScreen.IlI11IIl11l(this.var_game_GameHelper40_Ill111lll, n4 - (GameCanvas.var_int_b - 30));
                    }
                    n = this.var_game_GameHelper40_Ill111lll.a;
                    if (n6 > GameCanvas.var_int_b - 20) {
                        ProfileScreen.IlI11IIl11l(this.var_game_GameHelper40_I1I11I1IlIl, n6 - (GameCanvas.var_int_b - 20));
                    }
                    n5 = this.var_game_GameHelper40_I1I11I1IlIl.a;
                }
                String strTitle = equipItemEntry.var_java_lang_String_a;
                String string2 = "Level: " + equipItemEntry.var_byte_a + "+" + equipItemEntry.var_byte_b + "%";
                string = StringUtils.aa() + ": " + equipItemEntry.var_java_lang_String_b;
                graphics.setClip(20, this.var_int_I1I11I1IlIl, GameCanvas.var_int_b, GameCanvas.var_int_c - 2 * BaseScreen.var_int_o - 5 + this.var_int_I1I11I1IlIl);
                FontRenderer.e.a(graphics, strTitle, n + 20, n3, 0);
                graphics.setClip(5, this.var_int_I1I11I1IlIl, GameCanvas.var_int_b, GameCanvas.var_int_c - 2 * BaseScreen.var_int_o - 5 + this.var_int_I1I11I1IlIl);
                FontRenderer.a.a(graphics, string2, 7, n3 + 34, 0);
                graphics.setClip(0, this.var_int_I1I11I1IlIl, GameCanvas.var_int_b, GameCanvas.var_int_c - 2 * BaseScreen.var_int_o - 5 + this.var_int_I1I11I1IlIl);
                FontRenderer.a.a(graphics, string, n5 + 7, n3 + 17, 0);
                graphics.drawImage(BaseScreen.s, GameCanvas.var_int_b - 25, n3 + 16, 0);
                FontRenderer.e.a(graphics, String.valueOf(equipItemEntry.var_int_d), GameCanvas.var_int_b - 30, n3 + 17, 1);
                n3 += 50;
            }
        }
        if (this.lllll111ll == 1) {
            graphics.translate(0, -this.var_int_I1I11I1IlIl);
            n3 = FontRenderer.a.a(this.var_game_EquipItemEntry_a.var_java_lang_String_a);
            n2 = FontRenderer.a.a("( " + this.var_game_EquipItemEntry_a.var_java_lang_String_c + " )");
            if (n3 > GameCanvas.var_int_b - 20) {
                ProfileScreen.IlI11IIl11l(this.var_game_GameHelper40_IllI1II11, n3 - (GameCanvas.var_int_b - 40));
            }
            if (n2 > GameCanvas.var_int_b - 20) {
                ProfileScreen.IlI11IIl11l(this.var_game_GameHelper40_I11lI1lI1lI, n2 - (GameCanvas.var_int_b - 40));
            }
            int n7 = this.var_game_GameHelper40_IllI1II11.a;
            n = this.var_game_GameHelper40_I11lI1lI1lI.a;
            if (n3 > GameCanvas.var_int_b - 20) {
                FontRenderer.e.a(graphics, this.var_game_EquipItemEntry_a.var_java_lang_String_a, n7 + 20, 15, 0);
            } else {
                FontRenderer.e.a(graphics, this.var_game_EquipItemEntry_a.var_java_lang_String_a, GameCanvas.var_int_b / 2 + 5, 15, 3);
            }
            if (n2 > GameCanvas.var_int_b - 20) {
                FontRenderer.e.a(graphics, "( " + this.var_game_EquipItemEntry_a.var_java_lang_String_c + " )", n + 20, 35, 0);
            } else {
                FontRenderer.e.a(graphics, "( " + this.var_game_EquipItemEntry_a.var_java_lang_String_c + " )", GameCanvas.var_int_b / 2, 35, 3);
            }
            if (this.var_game_EquipItemEntry_a.var_javax_microedition_lcdui_Image_a != null) {
                int n8 = FontRenderer.e.a(this.var_game_EquipItemEntry_a.var_java_lang_String_a);
                if (n3 > GameCanvas.var_int_b - 20) {
                    graphics.drawImage(this.var_game_EquipItemEntry_a.var_javax_microedition_lcdui_Image_a, n7 + 5, 17, 0);
                } else {
                    graphics.drawImage(this.var_game_EquipItemEntry_a.var_javax_microedition_lcdui_Image_a, GameCanvas.var_int_b / 2 - n8 / 2 - 10, 17, 0);
                }
            }
            graphics.drawImage(BaseScreen.s, GameCanvas.var_int_b / 2 - 20, 55, 0);
            FontRenderer.e.a(graphics, String.valueOf(this.var_game_EquipItemEntry_a.var_int_d), GameCanvas.var_int_b / 2 + 2, 56, 0);
            String string3 = StringUtils.ad() + ": " + this.var_game_EquipItemEntry_a.var_int_a + "/" + this.var_game_EquipItemEntry_a.var_int_b;
            String string4 = StringUtils.ab() + ": " + DataUtils.a(this.var_game_EquipItemEntry_a.var_long_a) + " " + StringUtils.aq() + " - " + DataUtils.a((long)this.var_game_EquipItemEntry_a.var_int_c) + " " + StringUtils.ar();
            string = "Level: " + this.var_game_EquipItemEntry_a.var_byte_a + "+" + this.var_game_EquipItemEntry_a.var_byte_b + "%";
            String strClan = StringUtils.ac() + ": " + this.var_game_EquipItemEntry_a.var_java_lang_String_d;
            FontRenderer.a.a(graphics, string3, GameCanvas.var_int_b / 2, 75, 3);
            FontRenderer.a.a(graphics, string4, GameCanvas.var_int_b / 2, 90, 3);
            FontRenderer.a.a(graphics, string, GameCanvas.var_int_b / 2, 105, 3);
            graphics.setColor(1521982);
            graphics.fillRect(GameCanvas.var_int_b / 2 - 54, 120, 110, 17);
            graphics.setColor(2378093);
            graphics.fillRect(GameCanvas.var_int_b / 2 - 54 + 1, 121, 108, 15);
            int n9 = this.var_game_EquipItemEntry_a.var_byte_b * 108 / 100;
            graphics.setColor(16767817);
            graphics.fillRect(GameCanvas.var_int_b / 2 - 54 + 1, 121, n9, 15);
            FontRenderer.e.a(graphics, this.var_game_EquipItemEntry_a.e + "/" + this.var_game_EquipItemEntry_a.f, GameCanvas.var_int_b / 2 - 54 + 55, 120, 2);
            FontRenderer.a.a(graphics, strClan, GameCanvas.var_int_b / 2, 140, 3);
            if (this.var_game_EquipItemEntry_a.var_java_lang_String_arr_a.length == 0) {
                string = StringUtils.Z();
                stringArray = FontRenderer.a.a(string, GameCanvas.var_int_b - 50);
                for (int i = 0; i < stringArray.length; ++i) {
                    FontRenderer.e.a(graphics, stringArray[i], GameCanvas.var_int_b / 2, 185 + i * 15, 3);
                }
            } else {
                int[] durations = new int[this.var_game_EquipItemEntry_a.var_java_lang_String_arr_a.length];
                for (n3 = 0; n3 < this.var_game_EquipItemEntry_a.var_java_lang_String_arr_a.length; ++n3) {
                    if (this.var_long_arr_IllI1II11[n3] != 0L) {
                        this.var_long_arr_Ill111lll[n3] = System.currentTimeMillis() / 1000L;
                        if (this.var_long_arr_Ill111lll[n3] > this.var_long_arr_IllI1II11[n3]) {
                            this.var_long_arr_IllI1II11[n3] = 0L;
                        }
                        long l = this.var_long_arr_Ill111lll[n3] - this.var_long_arr_IllI1II11[n3];
                        durations[n3] = (int)((long)durations[n3] - l);
                        this.var_java_lang_String_arr_IllI1II11[n3] = DataUtils.java_lang_String_a(durations[n3]);
                    }
                    FontRenderer.e.a(graphics, this.var_game_EquipItemEntry_a.var_java_lang_String_arr_a[n3], GameCanvas.var_int_b / 2, 165 + n3 * 30, 3);
                    FontRenderer.a.a(graphics, StringUtils.Y() + ": " + this.var_java_lang_String_arr_IllI1II11[n3], GameCanvas.var_int_b / 2, 180 + n3 * 30, 3);
                }
            }
        }
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        super.a(graphics);
    }

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        if (this.lllll111ll == 0) {
            this.g = new GameCommand(StringUtils.ax(), new ActionListener150(this));
            this.h = new GameCommand(StringUtils.dH(), new ActionListener204());
            this.f = new GameCommand("Menu", new ActionListener048(this));
        }
        if (this.lllll111ll == 1) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.var_game_EquipItemEntry_a.var_short_a);
            this.f = new GameCommand("Menu", new ActionListener179(this));
            this.h = new GameCommand(StringUtils.dH(), new ActionListener172());
        }
        if (this.lllll111ll == 1) {
            this.var_long_arr_Ill111lll = new long[this.var_game_EquipItemEntry_a.var_int_arr_a.length];
            this.var_long_arr_IllI1II11 = new long[this.var_game_EquipItemEntry_a.var_int_arr_a.length];
            this.var_java_lang_String_arr_IllI1II11 = new String[this.var_game_EquipItemEntry_a.var_int_arr_a.length];
            for (int i = 0; i < this.var_game_EquipItemEntry_a.var_int_arr_a.length; ++i) {
                this.var_long_arr_Ill111lll[i] = System.currentTimeMillis();
                this.var_long_arr_IllI1II11[i] = System.currentTimeMillis() / 1000L + (long)this.var_game_EquipItemEntry_a.var_int_arr_a[i];
            }
            this.IlIl1II1 = 165 + this.var_game_EquipItemEntry_a.var_java_lang_String_arr_a.length * 30 - (GameCanvas.var_int_c - BaseScreen.var_int_r - 25);
            if (this.IlIl1II1 < 0) {
                this.IlIl1II1 = 0;
                return;
            }
        } else {
            this.var_int_a = 0;
            this.var_int_Ill111lll = 0;
        }
    }

    public final void void_b() {
        super.void_b();
        if (this.lllll111ll == 1) {
            if (GameCanvas.var_boolean_arr_b[8]) {
                new StringBuffer("[dh] cmyLim= ").append(this.IlIl1II1);
                this.var_int_Ill111lll += 20;
                if (this.var_int_Ill111lll > this.IlIl1II1) {
                    this.var_int_Ill111lll = this.IlIl1II1;
                }
            }
            if (GameCanvas.var_boolean_arr_b[2]) {
                this.var_int_Ill111lll = -20;
                if (this.var_int_Ill111lll < 0) {
                    this.var_int_Ill111lll = 0;
                }
            }
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_I1I11I1IlIl) {
                    this.l1I11111 = this.var_int_I1I11I1IlIl;
                    this.var_boolean_I1I11I1IlIl = true;
                }
                this.var_int_Ill111lll = this.l1I11111 + (GameCanvas.h - GameCanvas.g);
                if (this.var_int_Ill111lll < 0) {
                    this.var_int_Ill111lll = 0;
                }
                if (this.var_int_Ill111lll > this.IlIl1II1) {
                    this.var_int_Ill111lll = this.IlIl1II1;
                }
            }
        }
        if (this.lllll111ll == 0 && this.var_java_util_Vector_a.size() > 0) {
            int n = 0;
            if (GameCanvas.var_boolean_arr_a[8]) {
                GameCanvas.var_boolean_arr_a[8] = false;
                ++this.var_int_a;
                if (this.var_int_a == this.var_java_util_Vector_a.size()) {
                    this.var_int_a = 0;
                }
                n = 1;
                this.var_game_GameHelper40_Ill111lll.a = 0;
                this.var_game_GameHelper40_I1I11I1IlIl.a = 0;
            } else if (GameCanvas.var_boolean_arr_a[2]) {
                GameCanvas.var_boolean_arr_a[2] = false;
                --this.var_int_a;
                if (this.var_int_a < 0) {
                    this.var_int_a = this.var_java_util_Vector_a.size() - 1;
                }
                n = 1;
                this.var_game_GameHelper40_Ill111lll.a = 0;
                this.var_game_GameHelper40_I1I11I1IlIl.a = 0;
            }
            if (n != 0) {
                this.var_int_Ill111lll = this.var_int_a * 50 - (GameCanvas.var_int_e - 2 * BaseScreen.var_int_o);
                if (this.var_int_Ill111lll > this.IlIl1II1) {
                    this.var_int_Ill111lll = this.IlIl1II1;
                }
                if (this.var_int_Ill111lll < 0) {
                    this.var_int_Ill111lll = 0;
                }
                if (this.var_int_a == this.var_java_util_Vector_a.size() - 1 || this.var_int_a == 0) {
                    this.var_int_I1I11I1IlIl = this.var_int_Ill111lll;
                }
            }
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_I1I11I1IlIl) {
                    this.l1I11111 = this.var_int_I1I11I1IlIl;
                    this.var_boolean_I1I11I1IlIl = true;
                }
                this.var_int_Ill111lll = this.l1I11111 + (GameCanvas.h - GameCanvas.g);
                if (this.var_int_Ill111lll < 0) {
                    this.var_int_Ill111lll = 0;
                }
                if (this.var_int_Ill111lll > this.IlIl1II1) {
                    this.var_int_Ill111lll = this.IlIl1II1;
                }
            }
            if (GameCanvas.var_boolean_c) {
                this.var_boolean_I1I11I1IlIl = false;
                n = GameCanvas.h - GameCanvas.g;
                if (GameCanvas.a(0, BaseScreen.var_int_o, GameCanvas.var_int_b, GameCanvas.var_int_c - 2 * BaseScreen.var_int_o) && Math.abs(n) < 10) {
                    n = BaseScreen.var_int_o;
                    if ((n = (this.var_int_Ill111lll + GameCanvas.g - n) / 50) == this.var_int_a) {
                        if (this.g != null) {
                            this.g.var_game_IActionListener_a.a();
                        } else if (this.f != null) {
                            this.f.var_game_IActionListener_a.a();
                        }
                    }
                    this.var_int_a = n;
                    if (this.var_int_a < 0) {
                        this.var_int_a = 0;
                    }
                    if (this.var_int_a >= this.var_java_util_Vector_a.size()) {
                        this.var_int_a = this.var_java_util_Vector_a.size() - 1;
                    }
                }
            }
        }
    }

    public final void c() {
        GameHelper18.a();
        this.void_a();
    }
}

