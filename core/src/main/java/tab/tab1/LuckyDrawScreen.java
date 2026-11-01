/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab1;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class LuckyDrawScreen
extends BaseScreen {
    public static LuckyDrawScreen var_game_LuckyDrawScreen_a;
    private GameCommand var_game_GameCommand_I11I11lI11I1;
    private GameCommand var_game_GameCommand_l1111Ill;
    private GameCommand var_game_GameCommand_l1IllI1lIll;
    private int var_int_II1I1lIl;
    private int var_int_ll1l1ll1l11;
    private int var_int_Ill11IIlI1I = 170;
    private int I1ll111IIlll = 170;
    private int II1lIlII;
    private int l1lI1IllIIl;
    private int Il1llll1I;
    private int lII1l111l = 0;
    private int l1l1lllllll1 = 0;
    private int IIIIIll1Il = 0;
    private int lIlI1I1111;
    public int var_int_a;
    private Vector var_java_util_Vector_I11I11lI11I1;
    private int[] var_int_arr_I11I11lI11I1 = new int[]{239, 203, 167, 131, 95, 59, 23, 0, 311, 275};
    private int[] var_int_arr_l1111Ill = GameHelper19.b;
    private boolean var_boolean_l1111Ill;
    private boolean var_boolean_l1IllI1lIll;
    private boolean var_boolean_II1I1lIl;
    private boolean var_boolean_ll1l1ll1l11;
    private static Image var_javax_microedition_lcdui_Image_I11I11lI11I1;
    private static Image var_javax_microedition_lcdui_Image_l1111Ill;
    int var_int_b;
    int c;
    private int IllIl1lII;
    private int Il1l1lII1;
    private int lI1111Ill;
    private int l1Il1lIIl;
    private GameHelper29 var_game_GameHelper29_I11I11lI11I1;
    private int IlIlllIIl1lI;
    private int l11llI11llI;
    private boolean var_boolean_Ill11IIlI1I;
    boolean var_boolean_a;

    public LuckyDrawScreen() {
        this.var_int_II1I1lIl = GameCanvas.var_int_b / 2 - 85;
        this.var_int_ll1l1ll1l11 = GameCanvas.var_int_c / 2 - 85;
        this.l1lI1IllIIl = this.var_int_Ill11IIlI1I / 2;
        this.var_java_util_Vector_I11I11lI11I1 = new Vector();
        int[] nArray = new int[5];
        int[] nArray2 = nArray;
        nArray[0] = 200;
        nArray2[1] = 500;
        nArray2[2] = 1000;
        nArray2[3] = 1500;
        nArray2[4] = 2000;
        this.var_int_b = 1000;
        this.c = 1;
        this.IllIl1lII = 250;
        this.Il1l1lII1 = 290;
        this.lI1111Ill = 270;
        this.var_game_GameHelper29_I11I11lI11I1 = BattleScreen.var_game_GameHelper29_a;
        this.var_int_a = this.var_int_b;
        this.var_game_GameCommand_I11I11lI11I1 = new GameCommand(StringUtils.E(), new ActionListener185());
        this.var_game_GameCommand_l1IllI1lIll = new GameCommand(StringUtils.D(), new ActionListener303(this));
        this.var_game_GameCommand_l1111Ill = new GameCommand(StringUtils.dH(), new ActionListener035());
        if (!GameCanvas.var_boolean_d) {
            this.g = this.var_game_GameCommand_I11I11lI11I1;
        }
        this.h = this.var_game_GameCommand_l1111Ill;
        this.f = this.var_game_GameCommand_l1IllI1lIll;
        if (this.var_int_ll1l1ll1l11 + this.var_int_Ill11IIlI1I > GameCanvas.var_int_c - BaseScreen.var_int_r) {
            this.var_int_ll1l1ll1l11 = 5;
        }
    }

    public final void a(BaseScreen baseScreen) {
        this.b = baseScreen;
        this.var_int_a = this.var_int_b;
        super.b_();
    }

    public final void a(Vector vector, int n) {
        this.var_java_util_Vector_I11I11lI11I1 = vector;
        this.lIlI1I1111 = n;
        this.g = null;
        this.h = null;
        this.f = null;
        this.var_boolean_l1111Ill = true;
        this.II1lIlII = 0;
    }

    public final void a(Graphics graphics) {
        int n;
        int n2;
        int n3;
        ClanScreen.c(graphics);
        graphics.setColor(0x545454);
        graphics.fillArc(this.var_int_II1I1lIl - 4, this.var_int_ll1l1ll1l11 - 4, this.var_int_Ill11IIlI1I + 8, this.I1ll111IIlll + 8, 0, 360);
        int n4 = this.var_int_II1I1lIl + this.var_int_Ill11IIlI1I / 2;
        int n5 = this.var_int_ll1l1ll1l11 + this.var_int_Ill11IIlI1I / 2;
        for (int i = 0; i < 10; ++i) {
            if (this.II1lIlII > 360) {
                this.II1lIlII -= 360;
            }
            n3 = this.II1lIlII + i * 36;
            n2 = 4 * this.l1lI1IllIIl / 5 * DataUtils.b(n3) >> 10;
            graphics.setColor(this.var_int_arr_l1111Ill[i]);
            graphics.fillArc(this.var_int_II1I1lIl, this.var_int_ll1l1ll1l11, this.var_int_Ill11IIlI1I, this.I1ll111IIlll, this.II1lIlII + i * 36, 36);
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_I11I11lI11I1, 0, 0, 90, 90, 0, this.var_int_II1I1lIl - 5, this.var_int_ll1l1ll1l11 - 5, 0);
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_I11I11lI11I1, 0, 0, 90, 90, 2, this.var_int_II1I1lIl + 90 - 5, this.var_int_ll1l1ll1l11 - 5, 0);
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_I11I11lI11I1, 0, 0, 90, 90, 1, this.var_int_II1I1lIl - 5, this.var_int_ll1l1ll1l11 + 90 - 5, 0);
            DataUtils.a(graphics, var_javax_microedition_lcdui_Image_I11I11lI11I1, 0, 0, 90, 90, 7, this.var_int_II1I1lIl + 90 - 5, this.var_int_ll1l1ll1l11 + 90 - 5, 0);
            if (!this.var_boolean_l1IllI1lIll && !this.var_boolean_II1I1lIl) continue;
            int n6 = n = this.l1l1lllllll1 < 10 ? this.l1l1lllllll1 + 1 : 15;
            if (n2 > 0 || n2 + n < 0) continue;
            this.var_boolean_ll1l1ll1l11 = true;
        }
        for (n3 = 0; n3 < 10; ++n3) {
            QuestReward questReward;
            if (this.II1lIlII > 360) {
                this.II1lIlII -= 360;
            }
            n2 = this.II1lIlII + n3 * 36 + 18;
            n = 4 * this.l1lI1IllIIl / 5 * DataUtils.b(n2) >> 10;
            n2 = -(4 * this.l1lI1IllIIl / 5 * DataUtils.int_a(n2)) >> 10;
            n += this.var_int_II1I1lIl + this.var_int_Ill11IIlI1I / 2;
            n2 = this.var_int_ll1l1ll1l11 + this.var_int_Ill11IIlI1I / 2 + n2 - FontRenderer.e.a() / 2;
            if (this.var_java_util_Vector_I11I11lI11I1.size() == 0) continue;
            QuestReward questReward2 = questReward = (QuestReward)this.var_java_util_Vector_I11I11lI11I1.elementAt(n3);
            if (questReward.var_byte_a == 0) {
                DataUtils.a(graphics, BattleScreen.var_javax_microedition_lcdui_Image_f, 0, questReward2.b + 2 << 4, 16, 16, 0, n, n2, 3);
                FontRenderer.e.a(graphics, String.valueOf(questReward2.var_int_a), n, n2 + 10, 3);
            }
            if (questReward2.var_byte_a == 1) {
                FontRenderer.e.a(graphics, DataUtils.a((long)questReward2.var_int_a) + " " + StringUtils.aq(), n, n2, 3);
            }
            if (questReward2.var_byte_a != 2) continue;
            FontRenderer.e.a(graphics, questReward2.var_int_a + "XP", n, n2, 3);
        }
        graphics.setColor(16610328);
        graphics.fillArc(this.var_int_II1I1lIl + this.l1lI1IllIIl - this.l1lI1IllIIl / 4, this.var_int_ll1l1ll1l11 + this.l1lI1IllIIl - this.l1lI1IllIIl / 4, 2 * this.l1lI1IllIIl / 4, 2 * this.l1lI1IllIIl / 4, 0, 360);
        graphics.drawImage(var_javax_microedition_lcdui_Image_l1111Ill, n4, n5, 3);
        if (GameCanvas.var_int_c >= 200) {
            FontRenderer.e.a(graphics, DataUtils.a(TerrainMidlet.myInfo.var_long_c) + " " + StringUtils.aq(), 5, GameCanvas.var_int_c - BaseScreen.var_int_r - 40, 0);
            FontRenderer.e.a(graphics, DataUtils.a(TerrainMidlet.myInfo.e) + " " + StringUtils.ar(), 5, GameCanvas.var_int_c - BaseScreen.var_int_r - 20, 0);
        } else {
            FontRenderer.e.a(graphics, DataUtils.a(TerrainMidlet.myInfo.var_long_c) + StringUtils.aq() + "-" + DataUtils.a(TerrainMidlet.myInfo.e) + StringUtils.ar(), 5, GameCanvas.var_int_c - BaseScreen.var_int_r - 20, 0);
        }
        n3 = GameCanvas.var_int_b / 2;
        n2 = GameCanvas.var_int_c > 220 ? 10 : GameCanvas.var_int_c / 2 - 30;
        if (GameCanvas.var_int_b >= 320) {
            n3 = 35;
            n2 = GameCanvas.var_int_c / 2 - 30;
        }
        this.var_game_GameHelper29_I11I11lI11I1.a(3, n3, n2, 0, 3, graphics);
        graphics.setClip(n3 - 27, n2 - 10, this.l1Il1lIIl * 54 / 200, 80);
        this.var_game_GameHelper29_I11I11lI11I1.a(2, n3, n2, 0, 3, graphics);
        graphics.setClip(0, 0, 1000, 1000);
        super.a(graphics);
    }

    private void IlllIllI() {
        if (this.var_boolean_Ill11IIlI1I) {
            this.var_boolean_Ill11IIlI1I = false;
            new StringBuffer("[he] QUAY SO money= ").append(this.var_int_a);
            if (this.l1Il1lIIl > 20) {
                if (this.var_int_a == this.var_int_b) {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().h((byte)0);
                    this.var_boolean_a = true;
                }
                if (this.var_int_a == this.c) {
                    this.var_boolean_a = true;
                    ConnectionWatchdog.game_ConnectionWatchdog_a().h((byte)1);
                }
            }
        }
    }

    public final void void_b() {
        super.void_b();
        if (!GameCanvas.var_boolean_d) {
            if (!this.var_boolean_a && GameCanvas.var_boolean_arr_b[5]) {
                this.var_boolean_Ill11IIlI1I = true;
                this.l1Il1lIIl += 5;
                if (this.l1Il1lIIl > 200) {
                    this.l1Il1lIIl = 200;
                }
            }
            if (!GameCanvas.var_boolean_arr_b[5]) {
                this.IlllIllI();
            }
        }
        if (GameCanvas.var_boolean_d) {
            if (!this.var_boolean_a && GameCanvas.var_boolean_b && GameCanvas.a(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c - BaseScreen.var_int_r)) {
                this.var_boolean_Ill11IIlI1I = true;
                this.l1Il1lIIl += 5;
                if (this.l1Il1lIIl > 200) {
                    this.l1Il1lIIl = 200;
                }
            }
            if (!GameCanvas.var_boolean_b) {
                this.IlllIllI();
            }
        }
    }

    public final void c() {
        int n;
        if (this.var_boolean_l1111Ill) {
            ++this.Il1llll1I;
            if (this.Il1llll1I == 20) {
                this.var_boolean_l1IllI1lIll = true;
                this.var_boolean_l1111Ill = false;
                this.Il1llll1I = 0;
                n = this.lIlI1I1111;
                this.IlIlllIIl1lI = Math.abs(this.var_int_arr_I11I11lI11I1[n]);
                this.l11llI11llI = this.IlIlllIIl1lI + (n == 7 ? 13 : 26);
                DataUtils.b(15, 18);
            }
        }
        if (this.var_boolean_l1IllI1lIll) {
            if (this.l1l1lllllll1 == 19) {
                this.l1Il1lIIl -= 2;
                if (this.l1Il1lIIl <= 0) {
                    if (!(this.II1lIlII >= this.IlIlllIIl1lI && this.II1lIlII <= this.l11llI11llI || this.lIlI1I1111 == 7 && (this.II1lIlII >= this.IlIlllIIl1lI && this.II1lIlII <= this.l11llI11llI || this.II1lIlII >= 347 && this.II1lIlII <= 360))) {
                        this.II1lIlII += 19;
                    } else {
                        this.l1l1lllllll1 = 19;
                        this.IIIIIll1Il = 0;
                        this.var_boolean_l1IllI1lIll = false;
                        this.var_boolean_II1I1lIl = true;
                        this.l1Il1lIIl = 0;
                    }
                } else {
                    this.II1lIlII += 19;
                }
            } else {
                this.II1lIlII += this.l1l1lllllll1;
                ++this.l1l1lllllll1;
            }
        }
        if (this.var_boolean_II1I1lIl) {
            if (this.IIIIIll1Il < 2850) {
                this.IIIIIll1Il += this.l1l1lllllll1;
                this.II1lIlII += this.l1l1lllllll1;
                ++this.lII1l111l;
                if (this.lII1l111l == 15) {
                    this.lII1l111l = 0;
                    --this.l1l1lllllll1;
                }
            } else {
                n = this.Il1llll1I >= 15 ? 4 : 2;
                if (GameCanvas.var_int_a % n == 0) {
                    ++this.Il1llll1I;
                    ++this.II1lIlII;
                }
                if (this.Il1llll1I == 30) {
                    this.Il1llll1I = 0;
                    this.IIIIIll1Il = 0;
                    this.l1l1lllllll1 = 0;
                    this.var_boolean_II1I1lIl = false;
                    this.g = this.var_game_GameCommand_I11I11lI11I1;
                    this.h = this.var_game_GameCommand_l1111Ill;
                    this.f = this.var_game_GameCommand_l1IllI1lIll;
                    GameCanvas.a(((QuestReward)this.var_java_util_Vector_I11I11lI11I1.elementAt((int)this.lIlI1I1111)).var_java_lang_String_a, new ActionListener210(this));
                    Object object = GameHelper01.b;
                    synchronized (object) {
                        GameHelper01.b.notify();
                    }
                }
            }
        }
        if (this.var_boolean_ll1l1ll1l11) {
            this.var_boolean_ll1l1ll1l11 = false;
            if (this.IIIIIll1Il < 2850) {
                n = this.l1l1lllllll1 + 1;
                if (n < 3) {
                    n = 3;
                }
                this.IllIl1lII += n;
                if (this.IllIl1lII > 260) {
                    this.IllIl1lII = 260;
                }
                this.Il1l1lII1 += n;
                if (this.Il1l1lII1 >= 300) {
                    this.Il1l1lII1 = 300;
                }
                this.lI1111Ill += n;
                if (this.lI1111Ill >= 280) {
                    this.lI1111Ill = 280;
                }
            }
        }
        if (this.l1Il1lIIl < 0) {
            this.l1Il1lIIl = 0;
        }
        if (this.l1Il1lIIl > 200) {
            this.l1Il1lIIl = 200;
        }
        if (this.IllIl1lII != 250) {
            this.IllIl1lII -= 2;
        }
        if (this.IllIl1lII < 250) {
            this.IllIl1lII = 250;
        }
        if (this.Il1l1lII1 != 290) {
            this.Il1l1lII1 -= 2;
        }
        if (this.Il1l1lII1 < 290) {
            this.Il1l1lII1 = 290;
        }
        if (this.lI1111Ill != 270) {
            this.lI1111Ill -= 2;
        }
        if (this.lI1111Ill < 270) {
            this.lI1111Ill = 270;
        }
        if (this.b != null) {
            this.b.c();
        }
    }

    static {
        try {
            var_javax_microedition_lcdui_Image_I11I11lI11I1 = Image.createImage((String)"/vong.png");
            var_javax_microedition_lcdui_Image_l1111Ill = Image.createImage((String)"/kim.png");
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

