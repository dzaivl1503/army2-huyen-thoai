/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class InventoryScreen
extends ScrollDialogScreen {
    public static InventoryScreen var_game_InventoryScreen_a;
    private int I1lIII11IIIl;
    private static int llI1l1l1II;
    private static int I1II1I1llIl;
    private static int I1llI11I1;
    private static int ll1IlIll1Il;
    private static int lI1lll1lI11;
    private int lIII1l1l = 0;
    private int II11Il1l = 8;
    Vector var_java_util_Vector_a = new Vector();
    GameCommand var_game_GameCommand_a;
    private GameCommand var_game_GameCommand_IIll1l1l11;
    int var_int_a;
    boolean var_boolean_a = false;
    private GameHelper40 var_game_GameHelper40_llIlI1ll1 = new GameHelper40(0, 1);
    public int var_int_b;
    private ItemTemplate var_game_ItemTemplate_llIlI1ll1;
    private String var_java_lang_String_IIll1l1l11;
    private String var_java_lang_String_IllI1llI11I1;
    int c = 1;
    boolean var_boolean_b;
    private int IIIl1l1lI1I;
    private int lI1l1llI1 = 0;
    private boolean Il11111I = false;
    private GameCommand var_game_GameCommand_IllI1llI11I1;
    private int III1ll11Ill1;
    private int II1I1lll1I;

    public InventoryScreen() {
        int n = GameCanvas.var_int_b - 40;
        int n2 = GameCanvas.var_int_c - BaseScreen.var_int_r - 40;
        this.var_int_h = (n - 56) / 32;
        if (this.var_int_h < 4) {
            this.var_int_h = 4;
        }
        this.n();
        this.d = GameCanvas.var_int_b / 2 - this.var_int_f / 2;
        this.var_int_g = n2;
        if (this.var_int_g < 180) {
            this.var_int_g = 180;
        }
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - this.var_int_g / 2;
        ((ScrollDialogScreen)this).a = StringUtils.R();
        this.III1ll11Ill1 = this.var_int_f - 10;
        this.II1I1lll1I = this.var_int_g - 70;
        this.I1lIII11IIIl = GameCanvas.var_boolean_d ? 32 : 24;
        this.II11Il1l = (this.III1ll11Ill1 - 14) / this.I1lIII11IIIl;
        if (this.II11Il1l < 4) {
            this.II11Il1l = 4;
        }
        this.var_game_GameCommand_IllI1llI11I1 = new GameCommand(StringUtils.dF(), new ActionListener249(this));
    }

    public final ItemTemplate game_ItemTemplate_a() {
        if (this.var_java_util_Vector_a.size() != 0) {
            return (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.var_int_b);
        }
        return null;
    }

    public final void e() {
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            ((ItemTemplate)this.var_java_util_Vector_a.elementAt((int)i)).var_boolean_c = false;
            ((ItemTemplate)this.var_java_util_Vector_a.elementAt((int)i)).var_int_c = 0;
        }
        this.var_int_a = 0;
    }

    public final void a(String string) {
        GameCanvas.a(string, new ActionListener212(this), new ActionListener058(this));
    }

    public final void a(Graphics graphics) {
        Object object;
        super.a(graphics);
        int n = GameCanvas.var_int_b / 2 - this.III1ll11Ill1 / 2;
        int n2 = this.e + 29;
        graphics.setColor(3832504);
        graphics.fillRoundRect(GameCanvas.var_int_b / 2 - this.III1ll11Ill1 / 2, this.e + 23, this.III1ll11Ill1, this.II1I1lll1I + 10, 6, 6);
        int n3 = 0;
        int n4 = 0;
        graphics.setClip(n, n2, this.III1ll11Ill1, this.II1I1lll1I);
        graphics.translate(0, -I1II1I1llIl);
        graphics.setColor(16767817);
        int n5 = this.II11Il1l * this.I1lIII11IIIl;
        int n6 = n + (this.III1ll11Ill1 - n5) / 2;
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            graphics.setColor(16767817);
            object = (ItemTemplate)this.var_java_util_Vector_a.elementAt(i);
            int n7 = n6 + n3 * this.I1lIII11IIIl;
            int n8 = n2 + n4 * this.I1lIII11IIIl;
            n = n7 + (this.I1lIII11IIIl - 16) / 2;
            n5 = n8 + (this.I1lIII11IIIl - 16) / 2;
            if (i == this.var_int_b) {
                graphics.fillRect(n7, n8, this.I1lIII11IIIl, this.I1lIII11IIIl);
                if (!GameCanvas.var_boolean_d) {
                    llI1l1l1II = n8 + this.I1lIII11IIIl / 2 - (n2 + this.II1I1lll1I / 2);
                }
            }
            if (((ItemTemplate)object).var_boolean_c) {
                graphics.setColor(5612786);
                graphics.fillRect(n, n5, 16, 16);
            }
            ((ItemTemplate)object).a(graphics, n, n5);
            if (!((ItemTemplate)object).var_boolean_d && ((ItemTemplate)object).var_int_arr_c != null) {
                n7 = 0;
                for (n8 = 0; n8 < ((ItemTemplate)object).var_int_arr_c.length; ++n8) {
                    int n9 = ((ItemTemplate)object).var_int_arr_c[n8];
                    if (n9 == -1) continue;
                    ++n7;
                }
                if (n7 > 0) {
                    n8 = i != this.var_int_b ? 16767817 : 0xFFFFFF;
                    graphics.setColor(n8);
                    int[][] nArrayArray = new int[][]{{n + 1, n5 - 2}, {n + 7, n5 - 2}, {n + 13, n5 - 2}, {n + 18, n5 + 4}, {n + 18, n5 + 10}, {n + 13, n5 + 17}, {n + 7, n5 + 17}, {n + 1, n5 + 17}, {n - 3, n5 + 10}, {n - 3, n5 + 4}};
                    n = Math.min(n7, 10);
                    for (n5 = 0; n5 < n; ++n5) {
                        int n10 = nArrayArray[n5][0];
                        n7 = nArrayArray[n5][1];
                        graphics.fillRect(n10, n7, 2, 2);
                    }
                }
            }
            if (++n3 != this.II11Il1l) continue;
            n3 = 0;
            ++n4;
        }
        graphics.setClip(0, 0, 1000, 1000);
        graphics.translate(0, -graphics.getTranslateY());
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        object = StringUtils.dE() + ": " + DataUtils.a(playerAccountInfo.var_long_c) + " " + StringUtils.aq() + "-" + DataUtils.a(playerAccountInfo.e) + " " + StringUtils.ar();
        FontRenderer.a.a(graphics, (String)object, GameCanvas.var_int_b / 2, this.e + this.var_int_g - 18, 3);
        FontRenderer.a.a(graphics, this.var_java_lang_String_IllI1llI11I1, GameCanvas.var_int_b / 2, this.e + this.var_int_g - 36, 3);
        if (this.var_boolean_b) {
            n = GameCanvas.var_int_c / 2;
            n5 = GameCanvas.var_int_b / 2;
            BaseScreen.a(n5 - 75, n - 30, 150, 60, graphics);
            FontRenderer.a.a(graphics, StringUtils.K(), GameCanvas.var_int_d, n - 15, 2);
            FontRenderer.a.a(graphics, this.c + " " + StringUtils.cP(), n5, n + 18 - 15, 2);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 4, n5 - 40 + GameCanvas.var_int_a % 3, n + 20 - 15, 0);
            DataUtils.a(graphics, BoardScreen.var_javax_microedition_lcdui_Image_arr_c[3], 0, 0, 13, 11, 7, n5 + 30 - GameCanvas.var_int_a % 3, n + 20 - 15, 0);
        }
        this.d(graphics);
    }

    public final void b(String string) {
        GameCanvas.a(string, new ActionListener194(this), new ActionListener263(this));
    }

    public final void f() {
        this.var_game_ItemTemplate_llIlI1ll1 = (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.var_int_b);
        this.var_java_lang_String_IIll1l1l11 = this.var_game_ItemTemplate_llIlI1ll1.java_lang_String_b();
        new StringBuffer("[fe] equip Detail= ").append(this.var_java_lang_String_IIll1l1l11);
        this.var_java_lang_String_IllI1llI11I1 = this.var_game_ItemTemplate_llIlI1ll1.var_java_lang_String_a;
        new StringBuffer("[fe] ").append(StringUtils.ai()).append(": ").append(this.var_game_ItemTemplate_llIlI1ll1.var_byte_e);
        this.var_game_GameHelper40_llIlI1ll1.a = 0;
    }

    public final void c() {
        super.c();
        this.var_java_util_Vector_a = EquipScreen.var_java_util_Vector_a;
        this.lIII1l1l = this.var_java_util_Vector_a.size();
        if (this.lIII1l1l != 0) {
            lI1lll1lI11 = this.IIIl1l1lI1I * this.I1lIII11IIIl - this.II1I1lll1I;
            if (I1II1I1llIl != llI1l1l1II) {
                ll1IlIll1Il = llI1l1l1II - I1II1I1llIl << 2;
                I1II1I1llIl += (I1llI11I1 += ll1IlIll1Il) >> 4;
                I1llI11I1 &= 0xF;
            }
            if (I1II1I1llIl > lI1lll1lI11) {
                I1II1I1llIl = lI1lll1lI11;
            }
            if (I1II1I1llIl < 0) {
                I1II1I1llIl = 0;
            }
            if (this.var_boolean_b) {
                this.f = null;
                return;
            }
            this.f = this.var_game_GameCommand_IIll1l1l11;
        }
    }

    public final void a(int n, int n2) {
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate)this.var_java_util_Vector_a.elementAt(i);
            if (!itemTemplate.var_boolean_d) {
                if (itemTemplate.var_int_a != n) continue;
                itemTemplate.var_int_b -= n2;
                if (itemTemplate.var_int_b <= 0) {
                    itemTemplate.var_int_b = 0;
                    this.var_java_util_Vector_a.removeElement(itemTemplate);
                }
                return;
            }
            if (itemTemplate.var_short_a != n) continue;
            itemTemplate.var_int_b -= n2;
            if (itemTemplate.var_int_b <= 0) {
                itemTemplate.var_int_b = 0;
                this.var_java_util_Vector_a.removeElement(itemTemplate);
            }
            return;
        }
    }

    public final ItemTemplate a(int n) {
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate)this.var_java_util_Vector_a.elementAt(i);
            new StringBuffer("[fe] DB KEY E= ").append(itemTemplate.var_int_a);
            if (itemTemplate.var_int_a != n) continue;
            return itemTemplate;
        }
        return null;
    }

    public final void b_() {
        super.b_();
        this.lll1lll1IIlI();
    }

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        this.lll1lll1IIlI();
    }

    private void lll1lll1IIlI() {
        this.var_int_b = 0;
        this.j = false;
        if (this.var_java_util_Vector_a.size() == 0) {
            ItemEffect.var_int_a = 0;
        }
        this.var_java_util_Vector_a = EquipScreen.var_java_util_Vector_a;
        this.IIIl1l1lI1I = this.var_java_util_Vector_a.size() / this.II11Il1l;
        if (this.var_java_util_Vector_a.size() % this.II11Il1l != 0) {
            ++this.IIIl1l1lI1I;
        }
        this.g = this.var_game_GameCommand_IllI1llI11I1;
        this.var_game_GameCommand_IIll1l1l11 = new GameCommand("Menu", new ActionListener250(this));
        this.var_game_GameCommand_a = new GameCommand(StringUtils.cM(), new ActionListener292(this));
        this.h = new GameCommand(StringUtils.dH(), new ActionListener045(this));
        if (this.var_java_util_Vector_a.size() != 0) {
            this.f();
        }
    }

    public final void void_b() {
        super.void_b();
        if (this.var_java_util_Vector_a.size() != 0) {
            if (!this.var_boolean_b) {
                if (GameCanvas.var_boolean_arr_a[4]) {
                    GameCanvas.var_boolean_arr_a[4] = false;
                    --this.var_int_b;
                    if (this.var_int_b < 0) {
                        this.var_int_b = this.lIII1l1l - 1;
                    }
                    this.f();
                }
                if (GameCanvas.var_boolean_arr_a[6]) {
                    GameCanvas.var_boolean_arr_a[6] = false;
                    ++this.var_int_b;
                    if (this.var_int_b > this.lIII1l1l - 1) {
                        this.var_int_b = 0;
                    }
                    this.f();
                }
                if (GameCanvas.var_boolean_arr_a[8]) {
                    GameCanvas.var_boolean_arr_a[8] = false;
                    this.var_int_b += this.II11Il1l;
                    if (this.var_int_b > this.lIII1l1l - 1) {
                        this.var_int_b = this.lIII1l1l - 1;
                    }
                    this.f();
                }
                if (GameCanvas.var_boolean_arr_a[2]) {
                    GameCanvas.var_boolean_arr_a[2] = false;
                    this.var_int_b -= this.II11Il1l;
                    if (this.var_int_b < 0) {
                        this.var_int_b = 0;
                    }
                    this.f();
                }
                if (GameCanvas.var_boolean_b) {
                    if (!this.Il11111I) {
                        this.lI1l1llI1 = I1II1I1llIl;
                        this.Il11111I = true;
                    }
                    if ((llI1l1l1II = this.lI1l1llI1 + (GameCanvas.h - GameCanvas.g)) < 0) {
                        llI1l1l1II = 0;
                    }
                    if (llI1l1l1II > this.IIIl1l1lI1I * this.I1lIII11IIIl - this.II1I1lll1I) {
                        llI1l1l1II = this.IIIl1l1lI1I * this.I1lIII11IIIl - this.II1I1lll1I;
                    }
                }
                if (GameCanvas.var_boolean_c && GameCanvas.a(this.d, this.e, this.var_int_f, this.var_int_g)) {
                    int n = GameCanvas.h - GameCanvas.g;
                    this.Il11111I = false;
                    if (Math.abs(n) < 10) {
                        n = this.II11Il1l * this.I1lIII11IIIl;
                        int n2 = GameCanvas.var_int_b / 2 - this.III1ll11Ill1 / 2 + (this.III1ll11Ill1 - n) / 2;
                        int n3 = this.e + 29;
                        if (GameCanvas.f >= n2 && GameCanvas.f < n2 + n && GameCanvas.g >= n3 && GameCanvas.g < n3 + this.II1I1lll1I) {
                            n = GameCanvas.f - n2;
                            n2 = GameCanvas.g - n3 + I1II1I1llIl;
                            n /= this.I1lIII11IIIl;
                            n = (n2 /= this.I1lIII11IIIl) * this.II11Il1l + n;
                        } else {
                            n = -1;
                        }
                        if (n == -1) {
                            return;
                        }
                        if (n == this.var_int_b && this.g != null) {
                            this.g.var_game_IActionListener_a.a();
                        }
                        this.var_int_b = n;
                        if (this.var_int_b < 0) {
                            this.var_int_b = 0;
                        }
                        if (this.var_int_b > this.var_java_util_Vector_a.size() - 1) {
                            this.var_int_b = this.var_java_util_Vector_a.size() - 1;
                        }
                        this.f();
                    }
                    return;
                }
            } else {
                ItemTemplate itemTemplate = this.game_ItemTemplate_a();
                if (GameCanvas.var_boolean_arr_a[4] || GameCanvas.var_boolean_c && GameCanvas.a(GameCanvas.var_int_b / 2 - 100, GameCanvas.var_int_c / 2 - 100, 100, 200)) {
                    GameCanvas.var_boolean_arr_a[4] = false;
                    this.c = itemTemplate.var_int_b > 5 ? (this.c -= 5) : --this.c;
                    if (this.c <= 0) {
                        itemTemplate.var_boolean_c = false;
                        this.c = 0;
                    }
                    itemTemplate.var_int_c = this.c;
                }
                if (GameCanvas.var_boolean_arr_a[6] || GameCanvas.var_boolean_c && GameCanvas.a(GameCanvas.var_int_b / 2, GameCanvas.var_int_c / 2 - 100, 100, 200)) {
                    GameCanvas.var_boolean_arr_a[6] = false;
                    if (itemTemplate.var_int_b > 5) {
                        this.c += this.c != 1 ? 5 : 4;
                        if (this.c > itemTemplate.var_int_b) {
                            this.c -= 5;
                        }
                    } else {
                        this.c = this.c >= itemTemplate.var_int_b ? itemTemplate.var_int_b : ++this.c;
                    }
                    itemTemplate.var_int_c = this.c;
                    itemTemplate.var_boolean_c = true;
                }
            }
        }
    }
}

