/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab6;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class GameHelper32
extends GameHelper21 {
    protected ItemTemplate var_game_ItemTemplate_a;
    private int[] var_int_arr_Ill1l11l = new int[0];
    protected Vector var_java_util_Vector_a = new Vector();
    protected Vector var_java_util_Vector_b = new Vector();
    protected int var_int_a = 32;
    protected int var_int_b = 5;
    protected int var_int_c = 5;
    protected int d = 180;
    protected int e = 180;
    protected int f = 0;
    protected int g = 0;
    protected int h = 0;
    protected int i = 0;
    protected int j = 0;
    protected int k = 0;
    private int l111IlI1Il1 = 0;
    private int II11IllI1I = 0;
    private boolean var_boolean_lIII1ll11 = false;
    protected int l = 0;
    protected boolean var_boolean_a = false;
    protected int m = 1;
    protected ItemTemplate var_game_ItemTemplate_b = null;
    private String var_java_lang_String_lIII1ll11 = "Menu";
    private MarqueeNotice var_game_MarqueeNotice_Ill1l11l = new MarqueeNotice();
    private boolean ll111IIl1ll = false;
    protected String var_java_lang_String_a = "Ch\u1ecdn v\u1eadt ph\u1ea9m";
    protected int n = 0;

    public final void void_a(ItemTemplate itemTemplate) {
        this.var_game_ItemTemplate_a = itemTemplate;
        this.l = 0;
        this.f = 0;
        this.g = 0;
        this.var_boolean_a = false;
        this.m = 1;
        this.var_game_ItemTemplate_b = null;
        this.ll111IIl1ll = false;
        this.b();
        this.var_game_MarqueeNotice_Ill1l11l.void_a();
        this.Il111111II1();
        this.c();
    }

    public final void a(int[] nArray) {
        this.var_int_arr_Ill1l11l = nArray != null ? nArray : new int[]{};
        this.Il111111II1();
    }

    private int l11l1IlIl() {
        int n = 0;
        for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
            n += gameHelper45.var_int_a;
        }
        return n;
    }

    public final void b() {
        for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
            ((GameHelper45)this.var_java_util_Vector_b.elementAt(i)).var_game_ItemTemplate_a.var_boolean_c = false;
            gameHelper45.var_game_ItemTemplate_a.var_int_c = 0;
        }
        this.var_java_util_Vector_b.removeAllElements();
    }

    private void Il111111II1() {
        int n;
        this.var_java_util_Vector_a.removeAllElements();
        Vector vector = EquipScreen.var_java_util_Vector_a;
        if (vector == null) {
            return;
        }
        block0: for (n = 0; n < vector.size(); ++n) {
            ItemTemplate itemTemplate = (ItemTemplate)vector.elementAt(n);
            if (!itemTemplate.var_boolean_d || itemTemplate.var_int_b <= 0) continue;
            for (int i = 0; i < this.var_int_arr_Ill1l11l.length; ++i) {
                if (itemTemplate.var_short_a != this.var_int_arr_Ill1l11l[i]) continue;
                this.var_java_util_Vector_a.addElement(itemTemplate);
                continue block0;
            }
        }
        n = (this.var_java_util_Vector_a.size() + this.var_int_b - 1) / this.var_int_b;
        this.i = n * this.var_int_a;
    }

    protected final int int_a(ItemTemplate itemTemplate) {
        for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
            if (gameHelper45.var_game_ItemTemplate_a != itemTemplate) continue;
            return gameHelper45.var_int_a;
        }
        return 0;
    }

    protected final int int_b(ItemTemplate itemTemplate) {
        return itemTemplate.var_int_b - this.int_a(itemTemplate);
    }

    protected void a(ItemTemplate itemTemplate, int n) {
        int n2;
        if (itemTemplate == null) {
            return;
        }
        if (n <= 0) {
            for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
                GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
                if (gameHelper45.var_game_ItemTemplate_a != itemTemplate) continue;
                this.var_java_util_Vector_b.removeElementAt(i);
                break;
            }
            itemTemplate.var_boolean_c = false;
            itemTemplate.var_int_c = 0;
            return;
        }
        int n3 = itemTemplate.var_int_b;
        if (this.n > 0) {
            n2 = this.l11l1IlIl();
            int n4 = this.int_a(itemTemplate);
            if ((n2 = this.n - n2 + n4) < n3) {
                n3 = n2;
            }
        }
        if (n > n3) {
            n = n3;
        }
        for (n2 = 0; n2 < this.var_java_util_Vector_b.size(); ++n2) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(n2);
            if (gameHelper45.var_game_ItemTemplate_a != itemTemplate) continue;
            gameHelper45.var_int_a = n;
            itemTemplate.var_boolean_c = true;
            itemTemplate.var_int_c = n;
            return;
        }
        this.var_java_util_Vector_b.addElement(new GameHelper45(itemTemplate, n));
        itemTemplate.var_boolean_c = true;
        itemTemplate.var_int_c = n;
    }

    protected void c() {
        if (this.var_boolean_a) {
            this.a = new GameCommand("-", new ActionListener253(this, (byte)0));
            this.b = new GameCommand("OK", new ActionListener252(this, (byte)0));
            this.c = new GameCommand("+", new ActionListener254(this, (byte)0));
            return;
        }
        this.a = new GameCommand(this.var_java_lang_String_lIII1ll11, new ActionListener255(this, (byte)0));
        this.b = new GameCommand(StringUtils.dF(), new ActionListener256(this, (byte)0));
        this.c = new GameCommand(StringUtils.dH(), new ActionListener251(this, (byte)0));
    }

    public void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        int n = GameCanvas.var_int_b / 2 - this.d / 2;
        int n2 = GameCanvas.var_int_c / 2 - this.e / 2 - 10;
        BaseScreen.a(n, n2, this.d, this.e, graphics);
        int n3 = n2 + 8;
        int n4 = GameCanvas.var_int_b / 2;
        FontRenderer.e.a(graphics, this.var_java_lang_String_a, n4, n3, 2);
        n3 += 16;
        n3 = this.int_a(graphics, n3, n4);
        int n5 = this.d - (this.var_int_c << 1);
        this.var_int_b = n5 / this.var_int_a;
        if (this.var_int_b < 4) {
            this.var_int_b = 4;
        }
        n5 = this.var_int_b * this.var_int_a;
        this.k = n3;
        this.j = n2 + this.e - this.k - 10;
        graphics.setColor(2771562);
        graphics.fillRect((n += (this.d - n5) / 2) - 2, this.k - 2, n5 + 4, this.j + 4);
        graphics.setClip(n, this.k, n5, this.j);
        graphics.translate(0, -this.f);
        for (n2 = 0; n2 < this.var_java_util_Vector_a.size(); ++n2) {
            n3 = n2 % this.var_int_b;
            n5 = n2 / this.var_int_b;
            n3 = n + n3 * this.var_int_a;
            n5 = this.k + n5 * this.var_int_a;
            ItemTemplate itemTemplate = (ItemTemplate)this.var_java_util_Vector_a.elementAt(n2);
            boolean bl = n2 == this.l;
            int n6 = this.int_a(itemTemplate);
            this.int_b(itemTemplate);
            this.a(graphics, n3, n5, itemTemplate, bl, n6);
        }
        graphics.translate(0, this.f);
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_boolean_a && this.var_game_ItemTemplate_b != null) {
            this.void_a(graphics, n4, GameCanvas.var_int_c / 2);
        }
        super.a(graphics);
    }

    public void paintCommands(Graphics graphics) {
        super.a(graphics);
    }

    protected int int_a(Graphics graphics, int n, int n2) {
        if (this.var_game_ItemTemplate_a == null) {
            return n;
        }
        int n3 = n2 - 8;
        graphics.setColor(3832504);
        graphics.fillRect(n3 - 4, n - 4, 24, 24);
        this.var_game_ItemTemplate_a.a(graphics, n3, n);
        FontRenderer.a.a(graphics, this.var_game_ItemTemplate_a.var_java_lang_String_a, n2, n += 22, 2);
        String string = "Da chon: " + this.l11l1IlIl() + " vat pham";
        FontRenderer.a.a(graphics, string, n2, n += 14, 2);
        return n += 18;
    }

    protected void a(Graphics graphics, int n, int n2, ItemTemplate itemTemplate, boolean bl, int n3) {
        int n4 = n + (this.var_int_a - 16) / 2;
        int n5 = n2 + (this.var_int_a - 16) / 2;
        if (bl) {
            graphics.setColor(16767817);
            graphics.fillRect(n, n2, this.var_int_a, this.var_int_a);
        }
        if (n3 > 0) {
            graphics.setColor(5612786);
            graphics.fillRect(n4, n5, 16, 16);
        }
        itemTemplate.a(graphics, n4, n5);
    }

    protected final void void_a(Graphics graphics, int n, int n2) {
        BaseScreen.a(n - 75, n2 - 30, 150, 60, graphics);
        FontRenderer.a.a(graphics, StringUtils.K(), n, n2 - 15, 2);
        FontRenderer.a.a(graphics, this.m + " " + StringUtils.cP(), n, n2 + 3, 2);
        if (BoardScreen.var_javax_microedition_lcdui_Image_arr_c != null && BoardScreen.var_javax_microedition_lcdui_Image_arr_c.length > 3 && BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3] != null) {
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 4, n - 40 + GameCanvas.var_int_a % 3, n2 + 5, 0);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 7, n + 30 - GameCanvas.var_int_a % 3, n2 + 5, 0);
        }
    }

    public void void_a() {
        int n;
        super.void_a();
        if (this.f != this.g) {
            n = this.g - this.f << 2;
            this.h += n;
            this.f += this.h >> 4;
            this.h &= 0xF;
        }
        if (this.f > (n = Math.max(0, this.i - this.j))) {
            this.f = n;
        }
        if (this.f < 0) {
            this.f = 0;
        }
        if (this.g > n) {
            this.g = n;
        }
        if (this.g < 0) {
            this.g = 0;
        }
        if (this.var_boolean_a) {
            this.f();
            return;
        }
        this.d();
        this.e();
    }

    protected final void d() {
        int n = this.var_java_util_Vector_a.size() - 1;
        if (n < 0) {
            return;
        }
        if (GameCanvas.var_boolean_arr_a[4]) {
            GameCanvas.var_boolean_arr_a[4] = false;
            if (this.l > 0) {
                --this.l;
            }
            this.ll111III();
        }
        if (GameCanvas.var_boolean_arr_a[6]) {
            GameCanvas.var_boolean_arr_a[6] = false;
            if (this.l < n) {
                ++this.l;
            }
            this.ll111III();
        }
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            if (this.l >= this.var_int_b) {
                this.l -= this.var_int_b;
                this.ll111III();
            }
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            if (this.l + this.var_int_b <= n) {
                this.l += this.var_int_b;
                this.ll111III();
            }
        }
        if (GameCanvas.var_boolean_arr_a[1]) {
            GameCanvas.var_boolean_arr_a[1] = false;
            if (this.l >= 0 && this.l < this.var_java_util_Vector_a.size()) {
                ItemTemplate itemTemplate = (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.l);
                boolean bl = true;
                ItemTemplate itemTemplate2 = itemTemplate;
                GameHelper32 gameHelper32 = this;
                if (itemTemplate2 == null) {
                    return;
                }
                for (int i = 0; i < gameHelper32.var_java_util_Vector_b.size(); ++i) {
                    GameHelper45 gameHelper45 = (GameHelper45)gameHelper32.var_java_util_Vector_b.elementAt(i);
                    if (gameHelper45.var_game_ItemTemplate_a != itemTemplate2) continue;
                    --gameHelper45.var_int_a;
                    if (gameHelper45.var_int_a <= 0) {
                        gameHelper32.var_java_util_Vector_b.removeElementAt(i);
                    }
                    return;
                }
            }
        }
    }

    private void ll111III() {
        int n = this.l / this.var_int_b;
        int n2 = (n *= this.var_int_a) + this.var_int_a;
        if (n < this.g) {
            this.g = n;
            return;
        }
        if (n2 > this.g + this.j) {
            this.g = n2 - this.j;
        }
    }

    protected final void e() {
        int n;
        if (!GameCanvas.var_boolean_d) {
            return;
        }
        int n2 = GameCanvas.var_int_b / 2 - this.d / 2;
        int n3 = this.d - (this.var_int_c << 1);
        if ((n3 /= this.var_int_a) < 4) {
            n3 = 4;
        }
        n2 += (this.d - (n3 *= this.var_int_a)) / 2;
        if (GameCanvas.var_boolean_b) {
            if (!this.var_boolean_lIII1ll11) {
                this.l111IlI1Il1 = this.f;
                this.II11IllI1I = GameCanvas.g;
                this.var_boolean_lIII1ll11 = true;
            }
            n = this.II11IllI1I - GameCanvas.g;
            this.g = this.l111IlI1Il1 + n;
        }
        if (GameCanvas.var_boolean_c) {
            this.var_boolean_lIII1ll11 = false;
            n = Math.abs(GameCanvas.g - this.II11IllI1I);
            if (n < 10 && GameCanvas.f >= n2 && GameCanvas.f < n2 + n3 && GameCanvas.g >= this.k && GameCanvas.g < this.k + this.j) {
                n2 = GameCanvas.f - n2;
                n3 = GameCanvas.g - this.k + this.f;
                n2 /= this.var_int_a;
                if ((n2 = (n3 /= this.var_int_a) * this.var_int_b + n2) >= 0 && n2 < this.var_java_util_Vector_a.size()) {
                    if (n2 == this.l) {
                        this.g();
                        return;
                    }
                    this.l = n2;
                }
            }
        }
    }

    protected final void f() {
        if (this.var_game_ItemTemplate_b == null) {
            return;
        }
        if (GameCanvas.var_boolean_arr_a[4] || GameCanvas.var_boolean_c && GameCanvas.a(GameCanvas.var_int_b / 2 - 100, GameCanvas.var_int_c / 2 - 50, 100, 100)) {
            GameCanvas.var_boolean_arr_a[4] = false;
            this.k();
        }
        if (GameCanvas.var_boolean_arr_a[6] || GameCanvas.var_boolean_c && GameCanvas.a(GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2 - 50, 100, 100)) {
            GameCanvas.var_boolean_arr_a[6] = false;
            this.j();
        }
    }

    protected void g() {
        if (this.l < 0 || this.l >= this.var_java_util_Vector_a.size()) {
            return;
        }
        this.var_game_ItemTemplate_b = (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.l);
        this.m = this.int_a(this.var_game_ItemTemplate_b);
        if (this.m <= 0) {
            this.m = 1;
        }
        this.var_boolean_a = true;
        this.c();
    }

    protected void h() {
        if (this.var_game_ItemTemplate_b != null) {
            this.a(this.var_game_ItemTemplate_b, this.m);
        }
        this.var_boolean_a = false;
        this.var_game_ItemTemplate_b = null;
        this.c();
    }

    protected final void i() {
        this.var_boolean_a = false;
        this.var_game_ItemTemplate_b = null;
        this.c();
    }

    protected final void j() {
        if (this.var_game_ItemTemplate_b == null) {
            return;
        }
        int n = this.var_game_ItemTemplate_b.var_int_b;
        if (this.n > 0) {
            int n2 = this.l11l1IlIl();
            int n3 = this.int_a(this.var_game_ItemTemplate_b);
            if ((n2 = this.n - n2 + n3) < n) {
                n = n2;
            }
        }
        if (this.m >= n) {
            return;
        }
        if (this.m < n) {
            ++this.m;
        }
    }

    protected final void k() {
        if (this.var_game_ItemTemplate_b == null) {
            return;
        }
        --this.m;
        if (this.m < 0) {
            this.m = 0;
        }
    }
}

