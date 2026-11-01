/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class GameHelper33
extends BaseScreen {
    public static GameHelper33 var_game_GameHelper33_a;
    public Vector var_java_util_Vector_a;
    public int var_int_a;
    public int var_int_b;
    private int I1llIIlll11l;
    private int lIlIlllI11lI;
    private int lIIllllI;
    private int lI1l1l1Il1;
    public int var_int_c = 0;
    GameCommand var_game_GameCommand_a = new GameCommand(StringUtils.cj(), new ActionListener004());
    GameCommand var_game_GameCommand_b = new GameCommand(StringUtils.cl(), new ActionListener051(this));
    GameCommand var_game_GameCommand_c = new GameCommand(StringUtils.dJ(), new ActionListener117(this));
    GameCommand d = new GameCommand(StringUtils.cr(), new ActionListener063(this));
    private GameCommand var_game_GameCommand_I111ll1l = new GameCommand(StringUtils.bY(), new ActionListener102(this));
    GameCommand e = new GameCommand(StringUtils.ca(), new ActionListener149(this));
    private String[] Il1llll1 = StringUtils.java_lang_String_arr_b();
    private int I111lI1I = 40;
    boolean var_boolean_a;
    public String var_java_lang_String_a;
    private int var_int_I111ll1l = 0;
    private boolean llllIlI1lIl = false;
    private int lIl1I1IlII;

    public final void void_a() {
        if (this.lIlIlllI11lI != this.I1llIIlll11l) {
            this.lIIllllI = this.I1llIIlll11l - this.lIlIlllI11lI >> 2;
            this.lIlIlllI11lI += this.lIIllllI;
        }
    }

    protected final void e() {
        this.var_boolean_a = true;
        if (this.var_int_c != 2 && this.var_int_c != 3) {
            if (this.var_int_c <= 0) {
                ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)(-this.var_int_c), this.var_int_b + 1);
                return;
            }
            if (this.var_int_c == 5) {
                ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)(this.var_int_b + 1), ProfileScreen.var_game_ProfileScreen_b.var_game_EquipItemEntry_a.var_short_a);
                GameCanvas.b(StringUtils.ci());
                return;
            }
            ConnectionWatchdog.game_ConnectionWatchdog_a().c(this.var_int_b + 1);
            GameCanvas.b(StringUtils.ci());
        }
    }

    private void lI111ll1I1lI() {
        this.var_boolean_a = true;
        if (this.var_int_c != 2 && this.var_int_c != 3 && this.var_int_b >= 0) {
            if (this.var_int_c <= 0) {
                ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)(-this.var_int_c), this.var_int_b - 1);
                return;
            }
            if (this.var_int_c == 5) {
                ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)(this.var_int_b - 1), ProfileScreen.var_game_ProfileScreen_b.var_game_EquipItemEntry_a.var_short_a);
                GameCanvas.b(StringUtils.ci());
                return;
            }
            ConnectionWatchdog.game_ConnectionWatchdog_a().c(this.var_int_b - 1);
            GameCanvas.b(StringUtils.ci());
        }
    }

    public final void a(Graphics graphics) {
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (int i = 0; i <= GameCanvas.var_int_b; i += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, i, GameCanvas.var_int_c - 62, 0);
        }
        graphics.setColor(1407674);
        graphics.fillRect(0, 25, GameCanvas.var_int_b, BaseScreen.var_int_o);
        if (this.var_int_c != 5) {
            if (this.var_int_c > 0) {
                FontRenderer.f.a(graphics, this.Il1llll1[this.var_int_c], GameCanvas.var_int_b / 2, 3, 17);
                FontRenderer.b.a(graphics, StringUtils.dD(), 10, 28, 0);
            } else {
                FontRenderer.f.a(graphics, MenuScreen.var_java_lang_String_arr_arr_a[7][-this.var_int_c], GameCanvas.var_int_b / 2, 3, 17);
                if (MenuScreen.var_java_lang_String_arr_arr_a[7][-this.var_int_c].equals("DANH D\u1ef0")) {
                    graphics.drawImage(BaseScreen.s, GameCanvas.var_int_b / 2 - 60, 4, 0);
                }
                FontRenderer.b.a(graphics, StringUtils.dD(), 10, 28, 0);
                FontRenderer.b.a(graphics, this.var_java_lang_String_a, GameCanvas.var_int_b - 10, 28, 1);
            }
        } else {
            String string = ProfileScreen.var_game_ProfileScreen_b.var_game_EquipItemEntry_a.var_java_lang_String_a;
            FontRenderer.f.a(graphics, StringUtils.G(), 10, 3, 0);
            if (FontRenderer.b.a(string) > GameCanvas.var_int_b - 20) {
                string = FontRenderer.b.a(string, GameCanvas.var_int_b - 20)[0] + "...";
            }
            FontRenderer.b.a(graphics, string, 10, 28, 0);
        }
        if (this.var_java_util_Vector_a.isEmpty() && this.var_int_c == 2) {
            FontRenderer.e.a(graphics, StringUtils.cR(), GameCanvas.var_int_d, 50, 2);
            FontRenderer.e.a(graphics, StringUtils.cS(), GameCanvas.var_int_d, 75, 2);
            FontRenderer.e.a(graphics, StringUtils.cT(), GameCanvas.var_int_d, 90, 2);
        }
        this.ll1l1I1IIIlI(graphics);
        super.a(graphics);
    }

    private void ll1l1I1IIIlI(Graphics graphics) {
        graphics.translate(0, BaseScreen.var_int_o + 25);
        graphics.setClip(0, 1, GameCanvas.var_int_b, GameCanvas.var_int_c - 25 - 21 - BaseScreen.var_int_o);
        graphics.translate(0, -this.lIlIlllI11lI);
        int n = 0;
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            if (i == this.var_int_a) {
                graphics.setColor(16765440);
                graphics.fillRect(0, n, GameCanvas.var_int_b, this.I111lI1I);
            }
            if (i * this.I111lI1I + this.I111lI1I > -graphics.getTranslateY() && i * this.I111lI1I < -graphics.getTranslateY() + GameCanvas.var_int_c) {
                PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.var_java_util_Vector_a.elementAt(i);
                String string = playerAccountInfo.var_java_lang_String_a;
                byte by = (byte)(this.var_int_c != 2 && this.var_int_c != 5 ? 0 : 9);
                String string2 = playerAccountInfo.f + "." + PlayerAccountInfo.var_java_lang_String_arr_a[playerAccountInfo.g];
                if (playerAccountInfo.var_int_b != 0) {
                    string2 = string2 + " (" + playerAccountInfo.var_int_b + (playerAccountInfo.var_int_c < 0 ? "" : "+") + playerAccountInfo.var_int_c + "%)";
                }
                FontRenderer.e.a(graphics, string2, by + 30, n + 3, 0);
                if (playerAccountInfo.var_java_lang_String_b != null && !playerAccountInfo.var_java_lang_String_b.equals("")) {
                    FontRenderer.e.a(graphics, playerAccountInfo.var_java_lang_String_b, GameCanvas.var_int_b - 5, n + 19, 1);
                }
                if (playerAccountInfo.var_javax_microedition_lcdui_Image_a != null) {
                    graphics.drawImage(playerAccountInfo.var_javax_microedition_lcdui_Image_a, 30, n + 20, 0);
                    FontRenderer.e.a(graphics, string, 45, n + 19, 0);
                } else {
                    FontRenderer.e.a(graphics, string, 30, n + 19, 0);
                }
                PlayerEntity.a(graphics, playerAccountInfo.var_byte_a, 0, 12, n + (this.var_int_c == 5 ? 30 : 35), 2, playerAccountInfo.var_game_EquipSlotSet_a);
                BoardScreen.a(graphics, playerAccountInfo.g, 22, n + (this.var_int_c == 5 ? 5 : 10), 3);
                if (this.var_int_c == 2 || this.var_int_c == 5) {
                    graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_arr_c[playerAccountInfo.var_boolean_b ? 0 : 1], 33, n + 12, 3);
                }
                if (this.var_int_c == 5) {
                    FontRenderer.e.a(graphics, playerAccountInfo.var_java_lang_String_c, 5, n + 35, 0);
                    FontRenderer.e.a(graphics, playerAccountInfo.var_java_lang_String_d, 5, n + 51, 0);
                    graphics.drawImage(BaseScreen.s, GameCanvas.var_int_b - 5, n + 20, 24);
                    FontRenderer.e.a(graphics, String.valueOf(playerAccountInfo.var_int_d), GameCanvas.var_int_b - 10, n + 40, 1);
                }
            }
            n += this.I111lI1I;
        }
    }

    public final void void_b() {
        super.void_b();
        int n = 0;
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            ++this.var_int_a;
            if (this.var_int_a == this.var_java_util_Vector_a.size()) {
                this.var_int_a = 0;
            }
            n = 1;
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            --this.var_int_a;
            if (this.var_int_a < 0) {
                this.var_int_a = this.var_java_util_Vector_a.size() - 1;
            }
            n = 1;
        } else if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            this.lI111ll1I1lI();
        } else if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            this.e();
        }
        if (n != 0) {
            this.I1llIIlll11l = this.var_int_a * this.I111lI1I - (GameCanvas.var_int_e - 3 * BaseScreen.var_int_o);
            if (this.I1llIIlll11l < 0) {
                this.I1llIIlll11l = 0;
            }
            if (this.I1llIIlll11l > this.lI1l1l1Il1) {
                this.I1llIIlll11l = this.lI1l1l1Il1;
            }
            if (this.var_int_a == this.var_java_util_Vector_a.size() - 1 || this.var_int_a == 0) {
                this.lIlIlllI11lI = this.I1llIIlll11l;
            }
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.llllIlI1lIl) {
                this.var_int_I111ll1l = this.lIlIlllI11lI;
                this.llllIlI1lIl = true;
                this.lIl1I1IlII = GameCanvas.f;
            }
            this.I1llIIlll11l = this.var_int_I111ll1l + (GameCanvas.h - GameCanvas.g);
            if (this.I1llIIlll11l > this.lI1l1l1Il1) {
                this.I1llIIlll11l = this.lI1l1l1Il1;
            }
            if (this.I1llIIlll11l < 0) {
                this.I1llIIlll11l = 0;
            }
        }
        if (GameCanvas.var_boolean_c) {
            this.llllIlI1lIl = false;
            if (Math.abs(GameCanvas.f - this.lIl1I1IlII) > 50) {
                if (GameCanvas.f > this.lIl1I1IlII) {
                    this.e();
                    return;
                }
                this.lI111ll1I1lI();
                return;
            }
            n = GameCanvas.h - GameCanvas.g;
            if (GameCanvas.a(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c - BaseScreen.var_int_r) && Math.abs(n) < 10) {
                n = 2 * BaseScreen.var_int_o;
                if ((n = (this.I1llIIlll11l + GameCanvas.g - n) / this.I111lI1I) == this.var_int_a) {
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

    public final void c() {
        GameHelper18.a();
        this.void_a();
    }

    public final void a(BaseScreen baseScreen) {
        if (this.var_boolean_a) {
            this.I1llIIlll11l = 0;
            this.lIlIlllI11lI = 0;
            this.var_int_a = 0;
        }
        super.a(baseScreen);
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo playerAccountInfo = (PlayerAccountInfo)this.var_java_util_Vector_a.elementAt(i);
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(playerAccountInfo.var_short_b);
        }
    }

    public final void a(int n, Vector vector) {
        this.var_int_c = n;
        this.var_java_util_Vector_a = vector;
        this.var_int_a = 0;
        if (this.lI1l1l1Il1 < 0) {
            this.lI1l1l1Il1 = 0;
        }
        if (!this.boolean_a()) {
            this.g = GameCanvas.var_game_BaseScreen_a instanceof BoardScreen ? this.var_game_GameCommand_I111ll1l : this.e;
            this.f = n == 2 ? new GameCommand("Menu", new ActionListener006(this)) : this.var_game_GameCommand_c;
            this.h = new GameCommand(StringUtils.dI(), new ActionListener029(this));
        }
        this.I111lI1I = 40 + (n == 5 ? 30 : 0);
        this.lI1l1l1Il1 = this.var_java_util_Vector_a.size() * this.I111lI1I - (GameCanvas.var_int_c - ((BaseScreen.var_int_o << 1) + BaseScreen.var_int_r)) + 10;
        if (this.lI1l1l1Il1 < 0) {
            this.lI1l1l1Il1 = 0;
        }
    }

    public final void a(Vector vector) {
        this.var_int_c = 3;
        this.var_java_util_Vector_a = vector;
        this.lI1l1l1Il1 = vector.size() * 57 - (GameCanvas.var_int_c - BaseScreen.var_int_o * 3 - 7);
        if (this.lI1l1l1Il1 < 0) {
            this.lI1l1l1Il1 = 0;
        }
        this.var_int_a = 0;
        this.I1llIIlll11l = 0;
        this.lIlIlllI11lI = 0;
        this.g = this.var_game_GameCommand_I111ll1l;
        this.f = this.var_game_GameCommand_c;
        this.h = new GameCommand(StringUtils.dI(), new ActionListener028(this));
    }

    static void a(GameHelper33 gameHelper33) {
        GameCanvas.var_game_BaseScreen_a = null;
        if (gameHelper33.b != null) {
            gameHelper33.b.b_();
        }
    }
}

