/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab4;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class TopupScreen
extends BaseScreen {
    public static TopupScreen a;
    private Vector var_java_util_Vector_lllI1l11l1Il;
    private int var_int_lllI1l11l1Il;
    private int I1II1lIIlI1I;
    private int lIl1IIIIl1;
    private int Il111Il1I11;
    private int IIl11l11l1l;
    private int llllll1IlIII;
    private int l1ll1lIIl1II;
    private static Image var_javax_microedition_lcdui_Image_lllI1l11l1Il;
    private int I1llll1I1 = 0;
    private boolean var_boolean_lllI1l11l1Il = false;

    public TopupScreen() {
        ActionListener010 actionListener010 = new ActionListener010(this);
        this.f = new GameCommand(StringUtils.dF(), actionListener010);
        this.g = new GameCommand("", actionListener010);
        this.h = new GameCommand(StringUtils.dI(), new ActionListener030());
    }

    protected final void e() {
        Object object = (GameHelper17)this.var_java_util_Vector_lllI1l11l1Il.elementAt(this.var_int_lllI1l11l1Il);
        if (((GameHelper17)object).c.indexOf("http://") != -1) {
            object = FontRenderer.a(((GameHelper17)object).c, "@username", TerrainMidlet.myInfo.var_java_lang_String_a);
            GameCanvas.a(StringUtils.aZ(), new ActionListener197((String)object));
            return;
        }
        if (((GameHelper17)object).c.indexOf("napthe:") != -1) {
            object = FontRenderer.a(((GameHelper17)object).c, ((GameHelper17)object).c.substring(0, ((GameHelper17)object).c.indexOf("napthe:") + 7), "");
            String[] stringArray = new String[2];
            String[] stringArray2 = new String[2];
            String[] stringArray3 = stringArray2;
            stringArray2[0] = StringUtils.bk() + ":";
            stringArray3[1] = StringUtils.bj() + ":";
            GameCanvas.var_game_InputScreen_a.a(stringArray3[0], new ActionListener183(stringArray, (String)object, stringArray3), new ActionListener055(), 0);
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
            return;
        }
        GameCanvas.void_a(StringUtils.ds());
        ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, ((GameHelper17)this.var_java_util_Vector_lllI1l11l1Il.elementAt((int)this.var_int_lllI1l11l1Il)).a);
    }

    public final void void_a() {
        if (this.lIl1IIIIl1 != this.I1II1lIIlI1I) {
            this.IIl11l11l1l = this.I1II1lIIlI1I - this.lIl1IIIIl1 << 2;
            this.Il111Il1I11 += this.IIl11l11l1l;
            this.lIl1IIIIl1 += this.Il111Il1I11 >> 4;
            this.Il111Il1I11 &= 0xF;
        }
    }

    public final void a(Graphics graphics) {
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        ClanScreen.c(graphics);
        GameHelper18.a(graphics);
        for (int i = 0; i <= GameCanvas.var_int_b; i += 32) {
            graphics.drawImage(BoardScreen.var_javax_microedition_lcdui_Image_a, i, GameCanvas.var_int_c - 62, 0);
        }
        graphics.translate(this.l1ll1lIIl1II, 0);
        FontRenderer.f.a(graphics, StringUtils.dw(), 10, 3, 0);
        graphics.setColor(1407674);
        graphics.fillRect(0, 25, GameCanvas.var_int_b, BaseScreen.var_int_o);
        FontRenderer.b.a(graphics, StringUtils.cp(), 10, 28, 0);
        Graphics graphics2 = graphics;
        graphics.translate(0, BaseScreen.var_int_o + 25);
        graphics.setClip(0, 1, GameCanvas.var_int_b, GameCanvas.var_int_c - 25 - 28 - BaseScreen.var_int_o);
        graphics.translate(0, -this.lIl1IIIIl1);
        int n = 0;
        for (int i = 0; i < this.var_java_util_Vector_lllI1l11l1Il.size(); ++i) {
            if (i == this.var_int_lllI1l11l1Il) {
                graphics2.setColor(16765440);
                graphics2.fillRect(0, n, GameCanvas.var_int_b, 20);
            }
            GameHelper17 gameHelper17 = (GameHelper17)this.var_java_util_Vector_lllI1l11l1Il.elementAt(i);
            graphics2.drawImage(var_javax_microedition_lcdui_Image_lllI1l11l1Il, 10, n + 2, 0);
            FontRenderer.e.a(graphics2, gameHelper17.b, 40, n + 2, 0);
            if (!GameCanvas.var_boolean_d) {
                n += 20;
                continue;
            }
            n += 30;
        }
        super.a(graphics);
    }

    public final void void_b() {
        int n = 0;
        if (GameCanvas.var_boolean_arr_a[8]) {
            BaseScreen.m();
            ++this.var_int_lllI1l11l1Il;
            if (this.var_int_lllI1l11l1Il == this.var_java_util_Vector_lllI1l11l1Il.size()) {
                this.var_int_lllI1l11l1Il = 0;
            }
            n = 1;
        } else if (GameCanvas.var_boolean_arr_a[2]) {
            BaseScreen.m();
            --this.var_int_lllI1l11l1Il;
            if (this.var_int_lllI1l11l1Il < 0) {
                this.var_int_lllI1l11l1Il = this.var_java_util_Vector_lllI1l11l1Il.size() - 1;
            }
            n = 1;
        }
        if (n != 0) {
            this.I1II1lIIlI1I = this.var_int_lllI1l11l1Il * 20 - (GameCanvas.var_int_e - 40);
            if (this.I1II1lIIlI1I < 0) {
                this.I1II1lIIlI1I = 0;
            }
            if (this.I1II1lIIlI1I > this.llllll1IlIII) {
                this.I1II1lIIlI1I = this.llllll1IlIII;
            }
            if (this.var_int_lllI1l11l1Il >= this.var_java_util_Vector_lllI1l11l1Il.size() - 1 || this.var_int_lllI1l11l1Il == 0) {
                this.lIl1IIIIl1 = this.I1II1lIIlI1I;
            }
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.var_boolean_lllI1l11l1Il) {
                this.I1llll1I1 = this.lIl1IIIIl1;
                this.var_boolean_lllI1l11l1Il = true;
            }
            this.I1II1lIIlI1I = this.I1llll1I1 + (GameCanvas.h - GameCanvas.g);
            if (this.I1II1lIIlI1I < 0) {
                this.I1II1lIIlI1I = 0;
            }
            if (this.I1II1lIIlI1I > this.llllll1IlIII) {
                this.I1II1lIIlI1I = this.llllll1IlIII;
            }
            if (this.var_int_lllI1l11l1Il >= this.var_java_util_Vector_lllI1l11l1Il.size() - 1 || this.var_int_lllI1l11l1Il == 0) {
                this.lIl1IIIIl1 = this.I1II1lIIlI1I;
            }
        }
        if (GameCanvas.var_boolean_c) {
            this.var_boolean_lllI1l11l1Il = false;
            if (Math.abs(GameCanvas.h - GameCanvas.g) < 10) {
                n = (this.I1II1lIIlI1I + GameCanvas.g - BaseScreen.var_int_o - 25) / 30;
                if (n == this.var_int_lllI1l11l1Il && this.f != null) {
                    this.f.var_game_IActionListener_a.a();
                }
                this.var_int_lllI1l11l1Il = n;
                if (this.var_int_lllI1l11l1Il < 0) {
                    this.var_int_lllI1l11l1Il = 0;
                }
                if (this.var_int_lllI1l11l1Il > this.var_java_util_Vector_lllI1l11l1Il.size() - 1) {
                    this.var_int_lllI1l11l1Il = this.var_java_util_Vector_lllI1l11l1Il.size() - 1;
                }
            }
        }
        super.void_b();
    }

    public final void c() {
        if (this.l1ll1lIIl1II != 0) {
            this.l1ll1lIIl1II += -this.l1ll1lIIl1II >> 1;
        }
        if (this.l1ll1lIIl1II == -1) {
            this.l1ll1lIIl1II = 0;
        }
        this.void_a();
    }

    public final void a(Vector vector) {
        this.var_java_util_Vector_lllI1l11l1Il = vector;
        this.var_int_lllI1l11l1Il = 0;
        this.I1II1lIIlI1I = 0;
        this.lIl1IIIIl1 = 0;
        this.llllll1IlIII = vector.size() * 20 - (GameCanvas.var_int_e - 40);
        if (this.llllll1IlIII < 0) {
            this.llllll1IlIII = 0;
        }
    }

    static {
        try {
            var_javax_microedition_lcdui_Image_lllI1l11l1Il = Image.createImage((String)"/coin.png");
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

