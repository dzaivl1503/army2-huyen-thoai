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

public final class ChallengeScreen
extends BaseScreen {
    public static ChallengeScreen var_game_ChallengeScreen_a;
    private int var_int_IlllIIl1;
    private int var_int_lll11lII1lI;
    private int lll1I1III1l;
    private int I1I111Il;
    private int I1lIl1lIIlll;
    public int var_int_a;
    public static String[] var_java_lang_String_arr_a;
    private static Image var_javax_microedition_lcdui_Image_l1lIIll1I;
    private static Image var_javax_microedition_lcdui_Image_IlllIIl1;
    private static Image var_javax_microedition_lcdui_Image_lll11lII1lI;
    public Vector var_java_util_Vector_a;
    private int lIlIIIIl11l = 0;
    private boolean var_boolean_l1lIIll1I = false;

    public ChallengeScreen() {
        this.g = new GameCommand(StringUtils.dK(), new ActionListener304(this));
        this.f = new GameCommand(StringUtils.dJ(), new ActionListener283(this));
        this.h = new GameCommand(StringUtils.dI(), new ActionListener302());
    }

    public final void a(Graphics graphics) {
        int n;
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (n = 0; n <= GameCanvas.var_int_b; n += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, n, GameCanvas.var_int_c - 62, 0);
        }
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c - 15 - BaseScreen.var_int_o + (GameCanvas.var_int_b >= 150 ? 0 : 10));
        if (GameCanvas.var_boolean_d) {
            graphics.translate(0, 6);
        }
        graphics.translate(0, -this.var_int_lll11lII1lI);
        n = 0;
        byte by = (byte)(GameCanvas.var_boolean_d ? 10 : 0);
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            ClanMemberEntry clanMemberEntry = (ClanMemberEntry)this.var_java_util_Vector_a.elementAt(i);
            if (i == this.var_int_a && clanMemberEntry.var_byte_a != -1) {
                graphics.setColor(16767817);
                graphics.fillRect(1, n + 3 - by, GameCanvas.var_int_b - 2, BaseScreen.var_int_o + (by << 1));
            }
            if (clanMemberEntry.var_byte_a == -1) {
                int n2;
                if (!GameCanvas.var_boolean_d) {
                    for (n2 = 0; n2 <= GameCanvas.var_int_b / var_javax_microedition_lcdui_Image_IlllIIl1.getWidth(); ++n2) {
                        graphics.drawImage(var_javax_microedition_lcdui_Image_IlllIIl1, n2 * var_javax_microedition_lcdui_Image_IlllIIl1.getWidth(), n + 2, 0);
                    }
                } else {
                    for (n2 = 0; n2 <= GameCanvas.var_int_b / var_javax_microedition_lcdui_Image_IlllIIl1.getWidth(); ++n2) {
                        graphics.drawImage(var_javax_microedition_lcdui_Image_IlllIIl1, n2 * var_javax_microedition_lcdui_Image_IlllIIl1.getWidth(), n - 9, 0);
                    }
                    for (n2 = 0; n2 <= GameCanvas.var_int_b / var_javax_microedition_lcdui_Image_IlllIIl1.getWidth(); ++n2) {
                        graphics.drawImage(var_javax_microedition_lcdui_Image_IlllIIl1, n2 * var_javax_microedition_lcdui_Image_IlllIIl1.getWidth(), n + 13, 0);
                    }
                }
                FontRenderer.f.a(graphics, var_java_lang_String_arr_a[clanMemberEntry.c], 10, n + 3, 0);
                n += GameCanvas.var_boolean_d ? 43 : BaseScreen.var_int_o + 3;
                continue;
            }
            try {
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_lll11lII1lI, 0, 14 * clanMemberEntry.c, 12, 14, 0, 10, n + 6, 0);
            }
            catch (Exception exception) {
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_lll11lII1lI, 0, 0 * clanMemberEntry.c, 12, 14, 0, 10, n + 6, 0);
            }
            if (clanMemberEntry.var_java_lang_String_a != null && clanMemberEntry.var_java_lang_String_a != "") {
                FontRenderer.e.a(graphics, clanMemberEntry.var_java_lang_String_a, 30, n + 5, 0);
            } else {
                FontRenderer.e.a(graphics, StringUtils.dL() + " " + clanMemberEntry.var_byte_a, 30, n + 5, 0);
            }
            if (clanMemberEntry.b >= 0 && clanMemberEntry.b <= 2) {
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_l1lIIll1I, 0, clanMemberEntry.b * 7, 7, 7, 0, GameCanvas.var_int_b - 20, n + 9, 0);
            }
            n += GameCanvas.var_boolean_d ? 40 : BaseScreen.var_int_o;
        }
        super.a(graphics);
    }

    public final void a(int n, String string) {
        ((ClanMemberEntry)this.var_java_util_Vector_a.elementAt((int)n)).var_java_lang_String_a = string;
    }

    public final void void_b() {
        int n;
        super.void_b();
        boolean bl = false;
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            ++this.var_int_a;
            if (this.var_int_a >= this.var_java_util_Vector_a.size()) {
                this.var_int_a = 1;
            }
            if (((ClanMemberEntry)this.var_java_util_Vector_a.elementAt((int)this.var_int_a)).var_byte_a == -1) {
                ++this.var_int_a;
            }
            if (this.var_int_a >= this.var_java_util_Vector_a.size()) {
                this.var_int_a = 1;
            }
            bl = true;
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            --this.var_int_a;
            if (this.var_int_a < 0) {
                this.var_int_a = this.var_java_util_Vector_a.size() - 1;
            }
            if (((ClanMemberEntry)this.var_java_util_Vector_a.elementAt((int)this.var_int_a)).var_byte_a == -1) {
                --this.var_int_a;
            }
            if (this.var_int_a < 0) {
                this.var_int_a = this.var_java_util_Vector_a.size() - 1;
            }
            bl = true;
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.var_boolean_l1lIIll1I) {
                this.lIlIIIIl11l = this.var_int_lll11lII1lI;
                this.var_boolean_l1lIIll1I = true;
            }
            this.var_int_IlllIIl1 = this.lIlIIIIl11l + (GameCanvas.h - GameCanvas.g);
            if (this.var_int_IlllIIl1 > this.I1lIl1lIIlll) {
                this.var_int_IlllIIl1 = this.I1lIl1lIIlll;
            }
            if (this.var_int_IlllIIl1 < 0) {
                this.var_int_IlllIIl1 = 0;
            }
        }
        int n2 = n = GameCanvas.var_boolean_d ? 40 : BaseScreen.var_int_o;
        if (GameCanvas.var_boolean_c) {
            this.var_boolean_l1lIIll1I = false;
            if (Math.abs(GameCanvas.h - GameCanvas.g) < 10) {
                int n3 = (this.var_int_IlllIIl1 + GameCanvas.g - 5) / n;
                if (n3 == this.var_int_a) {
                    if (this.g != null) {
                        this.g.var_game_IActionListener_a.a();
                    } else if (this.f != null) {
                        this.f.var_game_IActionListener_a.a();
                    }
                }
                this.var_int_a = n3;
                if (this.var_int_a < 0) {
                    this.var_int_a = 0;
                }
                if (this.var_int_a >= this.var_java_util_Vector_a.size()) {
                    this.var_int_a = this.var_java_util_Vector_a.size() - 1;
                }
            }
        }
        if (bl) {
            this.var_int_IlllIIl1 = this.var_int_a * n - (GameCanvas.var_int_c - 35 - BaseScreen.var_int_o) / 2;
            if (this.var_int_IlllIIl1 > this.I1lIl1lIIlll) {
                this.var_int_IlllIIl1 = this.I1lIl1lIIlll;
            }
            if (this.var_int_IlllIIl1 < 0) {
                this.var_int_IlllIIl1 = 0;
            }
            if (this.var_int_a == this.var_java_util_Vector_a.size() - 1 || this.var_int_a == 0) {
                this.var_int_lll11lII1lI = this.var_int_IlllIIl1;
            }
        }
    }

    public final void void_a() {
        if (this.var_int_lll11lII1lI != this.var_int_IlllIIl1) {
            this.I1I111Il = this.var_int_IlllIIl1 - this.var_int_lll11lII1lI << 2;
            this.lll1I1III1l += this.I1I111Il;
            this.var_int_lll11lII1lI += this.lll1I1III1l >> 4;
            this.lll1I1III1l &= 0xF;
        }
    }

    public final void c() {
        GameHelper18.a();
        this.void_a();
        if (Math.abs(this.var_int_IlllIIl1 - this.var_int_lll11lII1lI) < 15 && this.var_int_lll11lII1lI < 0) {
            this.var_int_IlllIIl1 = 0;
        }
        if (Math.abs(this.var_int_IlllIIl1 - this.var_int_lll11lII1lI) < 10 && this.var_int_lll11lII1lI > this.I1lIl1lIIlll) {
            this.var_int_IlllIIl1 = this.I1lIl1lIIlll;
        }
    }

    public final void a(Vector vector) {
        int n;
        this.var_java_util_Vector_a = new Vector();
        byte by = -1;
        ChallengeScreen.ll1llll1I1(vector, 0, vector.size() - 1);
        for (n = 0; n < vector.size(); ++n) {
            int n2;
            ClanMemberEntry clanMemberEntry = (ClanMemberEntry)vector.elementAt(n);
            byte by2 = clanMemberEntry.c;
            if (by < by2) {
                this.var_java_util_Vector_a.addElement(new ClanMemberEntry(by2));
                by = by2;
            }
            for (n2 = this.var_java_util_Vector_a.size() - 1; n2 > 0; --n2) {
                ClanMemberEntry clanMemberEntry2 = (ClanMemberEntry)this.var_java_util_Vector_a.elementAt(n2);
                if (clanMemberEntry2.var_byte_a == -1 || clanMemberEntry2.var_byte_a <= clanMemberEntry.var_byte_a) break;
            }
            this.var_java_util_Vector_a.insertElementAt(clanMemberEntry, n2 + 1);
        }
        this.var_int_IlllIIl1 = 0;
        this.var_int_lll11lII1lI = 0;
        this.var_int_a = 1;
        n = GameCanvas.var_boolean_d ? 40 : BaseScreen.var_int_o;
        this.I1lIl1lIIlll = this.var_java_util_Vector_a.size() * n - (GameCanvas.var_int_c - 70);
        if (this.I1lIl1lIIlll < 0) {
            this.I1lIl1lIIlll = 0;
        }
    }

    private static void ll1llll1I1(Vector vector, int n, int n2) {
        block0: while (n2 - n > 0) {
            byte by = ((ClanMemberEntry)vector.elementAt((int)n2)).c;
            Vector vector2 = vector;
            int n3 = n - 1;
            int n4 = n2;
            while (true) {
                if (((ClanMemberEntry)vector2.elementAt((int)(++n3))).c < by) {
                    continue;
                }
                while (n4 > 0 && ((ClanMemberEntry)vector2.elementAt((int)(--n4))).c > by) {
                }
                if (n3 >= n4) {
                    ChallengeScreen.l1lIIl111ll1(vector2, n3, n2);
                    ChallengeScreen.ll1llll1I1(vector, n, n3 - 1);
                    n = n3 + 1;
                    continue block0;
                }
                ChallengeScreen.l1lIIl111ll1(vector2, n3, n4);
            }
        }
    }

    private static void l1lIIl111ll1(Vector vector, int n, int n2) {
        Object e = vector.elementAt(n2);
        vector.setElementAt(vector.elementAt(n), n2);
        vector.setElementAt(e, n);
    }

    static void d() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().void_a();
        GameCanvas.b(StringUtils.ds());
    }

    static {
        var_java_lang_String_arr_a = null;
        var_javax_microedition_lcdui_Image_l1lIIll1I = BattleScreen.var_javax_microedition_lcdui_Image_k;
        var_javax_microedition_lcdui_Image_IlllIIl1 = BattleScreen.var_javax_microedition_lcdui_Image_l;
        var_javax_microedition_lcdui_Image_lll11lII1lI = BattleScreen.var_javax_microedition_lcdui_Image_m;
    }
}

