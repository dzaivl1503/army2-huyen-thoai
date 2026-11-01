/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab4;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ItemManager
extends GameHelper32 {
    private static int[] var_int_arr_l11l111lI1l;
    private static int[] var_int_arr_IIl111I1;
    private static int[] var_int_arr_IlIlIIlI;
    private static int[] var_int_arr_l1l111lI1I1;
    private static int[] I111l11l;
    private static int[] lI1I1II1l;
    public static final ItemManager a;
    private final MarqueeNotice var_game_MarqueeNotice_l11l111lI1l = new MarqueeNotice();
    private final MarqueeNotice var_game_MarqueeNotice_IIl111I1 = new MarqueeNotice();
    private boolean var_boolean_IIl111I1 = false;
    private boolean var_boolean_IlIlIIlI = false;
    private boolean var_boolean_l1l111lI1I1 = false;
    private int I1Illl1I1lIl = 0;
    private Boolean var_java_lang_Boolean_l11l111lI1l = null;
    private byte var_byte_l11l111lI1l = 0;
    private static final int[] llI1IIl111I;
    private static Image var_javax_microedition_lcdui_Image_l11l111lI1l;

    public ItemManager() {
        this.var_java_lang_String_a = "N\u00e2ng c\u1ea5p trang b\u1ecb";
        this.n = 20;
        this.e = 190;
    }

    public final void void_b(ItemTemplate itemTemplate) {
        super.void_a(itemTemplate);
        this.var_boolean_IIl111I1 = false;
        this.var_boolean_IlIlIIlI = false;
        this.var_boolean_l1l111lI1I1 = false;
        this.I1Illl1I1lIl = 0;
        this.var_java_lang_Boolean_l11l111lI1l = null;
        this.var_game_MarqueeNotice_l11l111lI1l.void_a();
        this.var_game_MarqueeNotice_IIl111I1.void_a();
        this.IlIIlIlI();
        this.c();
    }

    private void IlIIlIlI() {
        int n;
        int[] nArray = new int[18];
        for (n = 0; n < 10; ++n) {
            nArray[n] = n + 135;
        }
        for (n = 0; n < 4; ++n) {
            nArray[n + 10] = n + 117;
        }
        for (n = 0; n < 4; ++n) {
            nArray[n + 14] = n + 131;
        }
        super.a(nArray);
    }

    private int int_l1II1lI1l() {
        int n = 0;
        for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
            if (!ItemManager.l1I1l1l1lI1(gameHelper45.var_game_ItemTemplate_a)) continue;
            n += gameHelper45.var_int_a;
        }
        return n;
    }

    private int l1I1l1l1lI1() {
        int n;
        int n2;
        ItemManager itemManager = this;
        if (itemManager.var_game_ItemTemplate_a == null) {
            return 0;
        }
        long l = 0L;
        for (n2 = 0; n2 < itemManager.var_java_util_Vector_b.size(); ++n2) {
            GameHelper45 gameHelper45 = (GameHelper45)itemManager.var_java_util_Vector_b.elementAt(n2);
            if (!ItemManager.l1I1l1l1lI1(gameHelper45.var_game_ItemTemplate_a) || (n = gameHelper45.var_game_ItemTemplate_a.var_short_a - 135) < 0 || n >= var_int_arr_l11l111lI1l.length) continue;
            l += (long)var_int_arr_l11l111lI1l[n] * (long)gameHelper45.var_int_a;
        }
        byte by = itemManager.var_game_ItemTemplate_a.h;
        n2 = by;
        if (by < 0) {
            n2 = 0;
        }
        int n3 = (n = itemManager.var_game_ItemTemplate_a.var_byte_a) == 0 || n == 5 ? (n2 < var_int_arr_l1l111lI1I1.length ? var_int_arr_l1l111lI1I1[n2] : var_int_arr_l1l111lI1I1[var_int_arr_l1l111lI1I1.length - 1]) : (n == 1 || n == 2 ? (n2 < var_int_arr_IIl111I1.length ? var_int_arr_IIl111I1[n2] : var_int_arr_IIl111I1[var_int_arr_IIl111I1.length - 1]) : (n2 < var_int_arr_IlIlIIlI.length ? var_int_arr_IlIlIIlI[n2] : var_int_arr_IlIlIIlI[var_int_arr_IlIlIIlI.length - 1]));
        int n4 = (int)(l * 100L / (long)n3);
        int n5 = n2 < lI1I1II1l.length ? lI1I1II1l[n2] : lI1I1II1l[lI1I1II1l.length - 1];
        return Math.min(n4, n5);
    }

    private String java_lang_String_l1II1lI1l() {
        int n = this.l1l11111I();
        if (n < 1000) {
            return String.valueOf(n);
        }
        StringBuffer stringBuffer = new StringBuffer();
        String string = String.valueOf(n);
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            if (i > 0 && (n2 - i) % 3 == 0) {
                stringBuffer.append('.');
            }
            stringBuffer.append(string.charAt(i));
        }
        return stringBuffer.toString();
    }

    private int l1l11111I() {
        if (this.var_game_ItemTemplate_a == null) {
            return 0;
        }
        byte by = this.var_game_ItemTemplate_a.h;
        if (by < 0) {
            by = 0;
        }
        if (by >= I111l11l.length) {
            return I111l11l[I111l11l.length - 1];
        }
        return I111l11l[by];
    }

    private boolean boolean_l1II1lI1l() {
        if (this.var_game_ItemTemplate_a == null) {
            return false;
        }
        return this.var_game_ItemTemplate_a.h >= lI1I1II1l.length;
    }

    private static boolean l1II1lI1l(ItemTemplate itemTemplate) {
        if (itemTemplate == null) {
            return false;
        }
        return (itemTemplate.var_short_a >= 117 && itemTemplate.var_short_a <= 120) || (itemTemplate.var_short_a >= 131 && itemTemplate.var_short_a <= 134);
    }

    private static boolean l1I1l1l1lI1(ItemTemplate itemTemplate) {
        return itemTemplate.var_short_a >= 135 && itemTemplate.var_short_a <= 144;
    }

    private ItemTemplate game_ItemTemplate_l1II1lI1l() {
        for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
            if (!ItemManager.l1II1lI1l(gameHelper45.var_game_ItemTemplate_a)) continue;
            return gameHelper45.var_game_ItemTemplate_a;
        }
        return null;
    }

    private int lI11l11IlI() {
        int n = 0;
        for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
            if (!ItemManager.l1I1l1l1lI1(gameHelper45.var_game_ItemTemplate_a)) continue;
            ++n;
        }
        return n;
    }

    protected final void a(ItemTemplate itemTemplate, int n) {
        if (itemTemplate == null) {
            return;
        }
        if (ItemManager.l1II1lI1l(itemTemplate)) {
            for (int i = 0; i < this.var_java_util_Vector_b.size(); ++i) {
                GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(i);
                if (!ItemManager.l1II1lI1l(gameHelper45.var_game_ItemTemplate_a)) continue;
                gameHelper45.var_game_ItemTemplate_a.var_boolean_c = false;
                gameHelper45.var_game_ItemTemplate_a.var_int_c = 0;
                this.var_java_util_Vector_b.removeElementAt(i);
                break;
            }
            if (n > 0) {
                this.var_java_util_Vector_b.addElement(new GameHelper45(itemTemplate, 1));
                itemTemplate.var_boolean_c = true;
                itemTemplate.var_int_c = 1;
                return;
            }
            itemTemplate.var_boolean_c = false;
            itemTemplate.var_int_c = 0;
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
        int n2 = itemTemplate.var_int_b;
        int n3 = this.int_l1II1lI1l();
        int n4 = this.int_a(itemTemplate);
        if ((n3 = 20 - n3 + n4) < n2) {
            n2 = n3;
        }
        if (n > n2) {
            n = n2;
        }
        if (n <= 0) {
            itemTemplate.var_boolean_c = false;
            itemTemplate.var_int_c = 0;
            return;
        }
        for (n2 = 0; n2 < this.var_java_util_Vector_b.size(); ++n2) {
            GameHelper45 gameHelper45 = (GameHelper45)this.var_java_util_Vector_b.elementAt(n2);
            if (gameHelper45.var_game_ItemTemplate_a != itemTemplate) continue;
            gameHelper45.var_int_a = n;
            itemTemplate.var_boolean_c = true;
            itemTemplate.var_int_c = n;
            return;
        }
        if (this.lI11l11IlI() < 4) {
            this.var_java_util_Vector_b.addElement(new GameHelper45(itemTemplate, n));
            itemTemplate.var_boolean_c = true;
            itemTemplate.var_int_c = n;
        }
    }

    public final void l() {
        this.var_boolean_l1l111lI1I1 = true;
        this.I1Illl1I1lIl = 0;
        this.var_java_lang_Boolean_l11l111lI1l = null;
        this.c();
    }

    public final void a(boolean bl, byte by, String string) {
        this.var_java_lang_Boolean_l11l111lI1l = new Boolean(bl);
        this.var_byte_l11l111lI1l = by;
        System.out.println("Upgrade result: " + bl + " " + by + " " + string);
        this.var_game_MarqueeNotice_IIl111I1.a(string);
    }

    protected final void c() {
        if (this.var_boolean_l1l111lI1I1) {
            ((GameHelper21)this).a = null;
            ((GameHelper21)this).b = null;
            ((GameHelper21)this).c = null;
            return;
        }
        if (this.var_boolean_IlIlIIlI) {
            ((GameHelper21)this).a = null;
            ((GameHelper21)this).b = new GameCommand("OK", new ActionListener289(this, (byte)0));
            ((GameHelper21)this).c = null;
            return;
        }
        if (this.var_boolean_IIl111I1) {
            ((GameHelper21)this).a = new GameCommand(StringUtils.cr(), new ActionListener288(this, (byte)0));
            ((GameHelper21)this).b = null;
            ((GameHelper21)this).c = new GameCommand(StringUtils.cq(), new ActionListener284(this, (byte)0));
            return;
        }
        if (this.var_boolean_a) {
            ((GameHelper21)this).a = null;
            ((GameHelper21)this).b = new GameCommand("OK", new ActionListener287(this, (byte)0));
            ((GameHelper21)this).c = new GameCommand("H\u1ee7y", new ActionListener285(this, (byte)0));
            return;
        }
        ((GameHelper21)this).a = this.boolean_l1II1lI1l() ? null : new GameCommand("N\u00e2ng c\u1ea5p", new ActionListener291(this, (byte)0));
        ((GameHelper21)this).b = new GameCommand(StringUtils.dF(), new ActionListener290(this, (byte)0));
        ((GameHelper21)this).c = new GameCommand(StringUtils.dH(), new ActionListener286(this, (byte)0));
    }

    protected final int int_a(Graphics graphics, int n, int n2) {
        if (this.var_game_ItemTemplate_a == null) {
            return n;
        }
        n += 4;
        if (this.boolean_l1II1lI1l()) {
            int n3 = n2 - 12;
            int n4 = n3 + 4;
            int n5 = n + 4;
            graphics.setColor(3832504);
            graphics.fillRect(n3, n, 24, 24);
            this.var_game_ItemTemplate_a.a(graphics, n4, n5);
            n += 28;
        } else {
            int n6;
            int n7 = n2 - 38;
            int n8 = n7 + 4;
            int n9 = n + 4;
            graphics.setColor(3832504);
            graphics.fillRect(n7, n, 24, 24);
            this.var_game_ItemTemplate_a.a(graphics, n8, n9);
            if (this.var_boolean_l1l111lI1I1) {
                int n10 = n8 + 8;
                n8 = 16;
                int n11 = n9 + 8;
                n6 = n10;
                Graphics graphics2 = graphics;
                ItemManager itemManager = this;
                for (int i = 0; i < 6; ++i) {
                    int n12;
                    int n13 = itemManager.I1Illl1I1lIl - (i << 2);
                    if ((n13 %= 104) < 0) {
                        n13 += 104;
                    }
                    if (n13 < 26) {
                        n12 = n6 - 13 + n13;
                        n13 = n11 - 13;
                    } else if (n13 < 52) {
                        n12 = n6 + 13;
                        n13 = n11 - 13 + (n13 - 26);
                    } else if (n13 < 78) {
                        n12 = n6 + 13 - (n13 - 52);
                        n13 = n11 + 13;
                    } else {
                        n12 = n6 - 13;
                        n13 = n11 + 13 - (n13 - 78);
                    }
                    graphics2.setColor(llI1IIl111I[i % llI1IIl111I.length]);
                    int n14 = 4 - i / 2;
                    graphics2.fillRect(n12 - n14 / 2, n13 - n14 / 2, n14, n14);
                }
                if (itemManager.I1Illl1I1lIl % 8 < 4) {
                    graphics2.setColor(llI1IIl111I[0]);
                    graphics2.drawRect(n6 - 8 - 2, n11 - 8 - 2, 19, 19);
                }
            }
            int n15 = n7 + 24 + 8;
            n7 = n + 8;
            if (var_javax_microedition_lcdui_Image_l11l111lI1l != null) {
                int n16 = var_javax_microedition_lcdui_Image_l11l111lI1l.getWidth();
                n6 = var_javax_microedition_lcdui_Image_l11l111lI1l.getHeight();
                DataUtils.a(graphics, var_javax_microedition_lcdui_Image_l11l111lI1l, 0, 0, n16, n6, 2, n15, n7, 0);
            }
            int n17 = n15 + 12 + 8;
            n6 = n17 + 4;
            graphics.setColor(5612786);
            graphics.fillRect(n17, n, 24, 24);
            n15 = this.var_game_ItemTemplate_a.h;
            this.var_game_ItemTemplate_a.h = (byte)(n15 + 1);
            this.var_game_ItemTemplate_a.a(graphics, n6, n9);
            this.var_game_ItemTemplate_a.h = (byte)n15;
            n += 28;
        }
        FontRenderer.a.a(graphics, this.var_game_ItemTemplate_a.var_java_lang_String_a, n2, n, 2);
        n += 14;
        if (this.boolean_l1II1lI1l()) {
            FontRenderer.c.a(graphics, "Trang b\u1ecb \u0111\u00e3 \u0111\u1ea1t", n2, n, 2);
            FontRenderer.c.a(graphics, "c\u1ea5p \u0111\u1ed9 t\u1ed1i \u0111a", n2, n += 14, 2);
            n += 18;
        } else {
            FontRenderer.a.a(graphics, "T\u1ec9 l\u1ec7: " + this.l1I1l1l1lI1() + "%", n2, n, 2);
            FontRenderer.a.a(graphics, "Ph\u00ed: " + this.java_lang_String_l1II1lI1l() + " xu", n2, n += 14, 2);
            n += 18;
        }
        return n;
    }

    protected final void a(Graphics graphics, int n, int n2, ItemTemplate itemTemplate, boolean bl, int n3) {
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
        if (ItemManager.l1II1lI1l(itemTemplate)) {
            graphics.setColor(65280);
            graphics.fillRect(n + 1, n2 + 1, 4, 4);
        }
    }

    public final void a(Graphics object) {
        object.translate(-object.getTranslateX(), -object.getTranslateY());
        object.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_game_ItemTemplate_a == null) {
            super.a(object);
            return;
        }
        int n = GameCanvas.var_int_b / 2 - this.d / 2;
        int n2 = GameCanvas.var_int_c / 2 - this.e / 2 - 10;
        BaseScreen.a(n, n2, this.d, this.e, object);
        int n3 = n2 + 8;
        int n4 = GameCanvas.var_int_b / 2;
        int n5 = FontRenderer.b.a(this.var_java_lang_String_a) + 16;
        object.setColor(3832504);
        object.fillRect(n4 - n5 / 2, n3 - 2, n5, 18);
        FontRenderer.b.a(object, this.var_java_lang_String_a, n4, n3, 2);
        n3 += 18;
        n3 = this.int_a(object, n3, n4);
        n5 = this.d - (this.var_int_c << 1);
        this.var_int_b = n5 / this.var_int_a;
        if (this.var_int_b < 4) {
            this.var_int_b = 4;
        }
        n5 = this.var_int_b * this.var_int_a;
        n += (this.d - n5) / 2;
        this.k = n3;
        this.j = n2 + this.e - this.k - 10;
        n2 = (this.var_java_util_Vector_a.size() + this.var_int_b - 1) / this.var_int_b;
        this.i = n2 * this.var_int_a;
        object.setColor(2771562);
        object.fillRect(n - 2, this.k - 2, n5 + 4, this.j + 4);
        object.setClip(n, this.k, n5, this.j);
        object.translate(0, -this.f);
        for (n2 = 0; n2 < this.var_java_util_Vector_a.size(); ++n2) {
            n3 = n2 % this.var_int_b;
            n5 = n2 / this.var_int_b;
            n3 = n + n3 * this.var_int_a;
            n5 = this.k + n5 * this.var_int_a;
            ItemTemplate itemTemplate = (ItemTemplate)this.var_java_util_Vector_a.elementAt(n2);
            boolean bl = n2 == this.l;
            int n6 = this.int_a(itemTemplate);
            this.int_b(itemTemplate);
            this.a(object, n3, n5, itemTemplate, bl, n6);
        }
        object.translate(0, this.f);
        object.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_boolean_a && this.var_game_ItemTemplate_b != null) {
            this.void_a(object, n4, GameCanvas.var_int_c / 2);
        }
        this.paintCommands(object);
        if (this.var_boolean_IIl111I1) {
            String string = "B\u1ea1n c\u00f3 ch\u1eafc mu\u1ed1n n\u00e2ng c\u1ea5p " + this.var_game_ItemTemplate_a.var_java_lang_String_a + " l\u00ean c\u1ea5p " + (this.var_game_ItemTemplate_a.h + 1) + " v\u1edbi ph\u00ed " + this.java_lang_String_l1II1lI1l() + " xu kh\u00f4ng?\nT\u1ec9 l\u1ec7 th\u00e0nh c\u00f4ng: " + this.l1I1l1l1lI1() + "%";
            this.var_game_MarqueeNotice_l11l111lI1l.a(string);
            this.var_game_MarqueeNotice_l11l111lI1l.a(object);
            this.paintCommands(object);
        }
        if (this.var_boolean_IlIlIIlI) {
            this.var_game_MarqueeNotice_IIl111I1.a(object);
            this.paintCommands(object);
        }
    }

    public final void void_a() {
        int n;
        if (GameCanvas.var_boolean_arr_a[5] || BaseScreen.boolean_a((byte)2)) {
            GameCanvas.var_boolean_arr_a[5] = false;
            if (((GameHelper21)this).b != null && ((GameHelper21)this).b.var_game_IActionListener_a != null) {
                ((GameHelper21)this).b.var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_arr_a[12] || BaseScreen.boolean_a((byte)0)) {
            GameCanvas.var_boolean_arr_a[12] = false;
            if (((GameHelper21)this).a != null && ((GameHelper21)this).a.var_game_IActionListener_a != null) {
                ((GameHelper21)this).a.var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_arr_a[13] || BaseScreen.boolean_a((byte)1)) {
            GameCanvas.var_boolean_arr_a[13] = false;
            if (((GameHelper21)this).c != null && ((GameHelper21)this).c.var_game_IActionListener_a != null) {
                ((GameHelper21)this).c.var_game_IActionListener_a.a();
            }
        }
        if (this.var_boolean_l1l111lI1I1) {
            ++this.I1Illl1I1lIl;
            if (this.var_java_lang_Boolean_l11l111lI1l != null && this.I1Illl1I1lIl >= 100) {
                ItemManager itemManager = this;
                this.var_boolean_l1l111lI1I1 = false;
                itemManager.I1Illl1I1lIl = 0;
                if (itemManager.var_game_ItemTemplate_a != null) {
                    itemManager.var_game_ItemTemplate_a.h = itemManager.var_byte_l11l111lI1l;
                }
                if (itemManager.var_java_lang_Boolean_l11l111lI1l != null && itemManager.var_java_lang_Boolean_l11l111lI1l.booleanValue()) {
                    if (!itemManager.var_game_MarqueeNotice_IIl111I1.boolean_a()) {
                        itemManager.var_game_MarqueeNotice_IIl111I1.a("N\u00e2ng c\u1ea5p th\u00e0nh c\u00f4ng!");
                    }
                } else if (itemManager.var_java_lang_Boolean_l11l111lI1l != null && !itemManager.var_game_MarqueeNotice_IIl111I1.boolean_a()) {
                    itemManager.var_game_MarqueeNotice_IIl111I1.a("N\u00e2ng c\u1ea5p th\u1ea5t b\u1ea1i!");
                }
                itemManager.var_boolean_IlIlIIlI = true;
                itemManager.var_java_lang_Boolean_l11l111lI1l = null;
                itemManager.b();
                itemManager.IlIIlIlI();
                itemManager.c();
            }
            return;
        }
        if (this.var_boolean_IlIlIIlI || this.var_boolean_IIl111I1) {
            return;
        }
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

    protected final void g() {
        if (this.l < 0 || this.l >= this.var_java_util_Vector_a.size()) {
            return;
        }
        this.var_game_ItemTemplate_b = (ItemTemplate)this.var_java_util_Vector_a.elementAt(this.l);
        if (ItemManager.l1II1lI1l(this.var_game_ItemTemplate_b)) {
            ItemTemplate itemTemplate = this.game_ItemTemplate_l1II1lI1l();
            if (itemTemplate == this.var_game_ItemTemplate_b) {
                this.a(this.var_game_ItemTemplate_b, 0);
            } else {
                this.a(this.var_game_ItemTemplate_b, 1);
            }
            this.var_game_ItemTemplate_b = null;
            return;
        }
        this.m = this.int_a(this.var_game_ItemTemplate_b);
        if (this.m <= 0) {
            this.m = 1;
        }
        this.var_boolean_a = true;
        this.c();
    }

    protected final void h() {
        if (this.var_game_ItemTemplate_b != null) {
            this.a(this.var_game_ItemTemplate_b, this.m);
        }
        this.var_boolean_a = false;
        this.var_game_ItemTemplate_b = null;
        this.c();
    }

    static int int_a(ItemManager itemManager) {
        return itemManager.int_l1II1lI1l();
    }

    static MarqueeNotice game_MarqueeNotice_a(ItemManager itemManager) {
        return itemManager.var_game_MarqueeNotice_IIl111I1;
    }

    static boolean a(ItemManager itemManager, boolean bl) {
        itemManager.var_boolean_IlIlIIlI = bl;
        return itemManager.var_boolean_IlIlIIlI;
    }

    static boolean b(ItemManager itemManager, boolean bl) {
        itemManager.var_boolean_IIl111I1 = bl;
        return itemManager.var_boolean_IIl111I1;
    }

    static MarqueeNotice game_MarqueeNotice_b(ItemManager itemManager) {
        return itemManager.var_game_MarqueeNotice_l11l111lI1l;
    }

    static int int_b(ItemManager itemManager) {
        return itemManager.l1l11111I();
    }

    static int c(ItemManager itemManager) {
        return itemManager.lI11l11IlI();
    }

    static boolean a(ItemManager itemManager, ItemTemplate itemTemplate) {
        return ItemManager.l1I1l1l1lI1(itemTemplate);
    }

    static ItemTemplate game_ItemTemplate_a(ItemManager itemManager) {
        return itemManager.game_ItemTemplate_l1II1lI1l();
    }

    static {
        var_int_arr_l11l111lI1l = new int[]{1, 4, 16, 64, 256, 1024, 4096, 16384, 65536, 262144, 0x100000, 0x400000};
        var_int_arr_IIl111I1 = new int[]{4, 9, 33, 132, 177, 256, 656, 2880, 3968, 6016, 13440, 54144, 71680, 108544, 225280, 1032192};
        var_int_arr_IlIlIIlI = new int[]{6, 14, 50, 256, 320, 512, 1024, 5120, 6016, 9088, 19904, 86016, 108544, 166912, 360448, 1589248};
        var_int_arr_l1l111lI1I1 = new int[]{18, 42, 132, 627, 864, 1360, 2816, 13824, 17792, 26880, 54016, 267264, 315392, 489472, 1032192, 0x460000};
        I111l11l = new int[]{15540, 31260, 53960, 98810, 155920, 220800, 304480, 354720, 433760, 506400, 1120480, 2017920, 3461760, 5684160, 12026240, 15039360};
        lI1I1II1l = new int[]{80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5};
        a = new ItemManager();
        llI1IIl111I = new int[]{0xFFFFFF, 16768329, 0xFF9900, 0xFF6600, 0xFF3300, 0xFF0000};
        try {
            var_javax_microedition_lcdui_Image_l11l111lI1l = Image.createImage((String)"/map/arrow.png");
        }
        catch (Exception iOException) {
            Exception iOException2 = iOException;
            iOException.printStackTrace();
        }
    }
}

