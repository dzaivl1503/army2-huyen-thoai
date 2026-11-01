/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab2;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper27
extends GameHelper21 {
    public static final GameHelper27 a = new GameHelper27();
    private ShopItemEntry var_game_ShopItemEntry_I1IlIlIllIl;
    private GameHelper43[] var_game_GameHelper43_arr_I1IlIlIllIl;
    private static Image var_javax_microedition_lcdui_Image_I1IlIlIllIl;
    private static GameHelper29 var_game_GameHelper29_I1IlIlIllIl;
    private int var_int_I1IlIlIllIl = 0;
    private int var_int_IlI11II1IlIl = 0;
    private double var_double_I1IlIlIllIl = 0.0;
    private final MarqueeNotice var_game_MarqueeNotice_I1IlIlIllIl = new MarqueeNotice();
    private final MarqueeNotice var_game_MarqueeNotice_IlI11II1IlIl = new MarqueeNotice();
    private boolean var_boolean_I1IlIlIllIl = false;
    private boolean var_boolean_IlI11II1IlIl = false;
    private boolean var_boolean_lI1lI1l1II1 = false;
    private int var_int_lI1lI1l1II1 = 0;
    private Boolean var_java_lang_Boolean_I1IlIlIllIl = null;
    private static final int[] var_int_arr_I1IlIlIllIl;
    private static final int[] var_int_arr_IlI11II1IlIl;
    private int lllll1l1III = 0;
    private int IIll111II = 0;

    public final void a(ShopItemEntry shopItemEntry) {
        this.var_game_ShopItemEntry_I1IlIlIllIl = shopItemEntry;
        this.var_boolean_I1IlIlIllIl = false;
        this.var_boolean_IlI11II1IlIl = false;
        this.var_boolean_lI1lI1l1II1 = false;
        this.var_int_lI1lI1l1II1 = 0;
        this.var_java_lang_Boolean_I1IlIlIllIl = null;
        this.var_game_MarqueeNotice_I1IlIlIllIl.void_a();
        this.var_game_MarqueeNotice_IlI11II1IlIl.void_a();
        if (shopItemEntry != null) {
            this.II1I1II1();
        }
        this.I1II1Illll();
    }

    private void II1I1II1() {
        Object object = new Message(55);
        try {
            ((Message)object).java_io_DataOutputStream_a().writeByte(3);
            ((Message)object).java_io_DataOutputStream_a().writeInt(this.var_game_ShopItemEntry_I1IlIlIllIl.var_int_a);
            MessageHandler.game_MessageHandler_a().a((Message)object);
            ((Message)object).void_a();
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(int n, int n2, double d, GameHelper43[] gameHelper43Array) {
        this.var_int_I1IlIlIllIl = n;
        this.var_int_IlI11II1IlIl = n2;
        this.var_double_I1IlIlIllIl = d;
        this.var_game_GameHelper43_arr_I1IlIlIllIl = gameHelper43Array;
        this.I1II1Illll();
    }

    private void I1II1Illll() {
        boolean bl;
        if (this.var_boolean_lI1lI1l1II1) {
            ((GameHelper21)this).a = null;
            this.b = null;
            this.c = null;
            return;
        }
        if (this.var_boolean_IlI11II1IlIl) {
            ((GameHelper21)this).a = null;
            this.b = new GameCommand("OK", new ActionListener246(this));
            this.c = null;
            return;
        }
        boolean bl2 = bl = this.var_int_I1IlIlIllIl > 0 || this.var_int_IlI11II1IlIl > 0;
        if (this.var_boolean_I1IlIlIllIl) {
            ((GameHelper21)this).a = new GameCommand(StringUtils.cr(), new ActionListener245(this));
            this.b = null;
            this.c = new GameCommand(StringUtils.cq(), new ActionListener243(this));
            return;
        }
        this.c = new GameCommand(StringUtils.dH(), new ActionListener244((byte)0));
        this.b = this.var_game_ShopItemEntry_I1IlIlIllIl != null && this.var_game_ShopItemEntry_I1IlIlIllIl.var_int_b < 10 && bl ? new GameCommand("N\u00e2ng c\u1ea5p", new ActionListener247(this)) : null;
        ((GameHelper21)this).a = null;
    }

    public final ShopItemEntry game_ShopItemEntry_a() {
        return this.var_game_ShopItemEntry_I1IlIlIllIl;
    }

    public final int int_a() {
        return this.var_int_I1IlIlIllIl;
    }

    public final int int_b() {
        return this.var_int_IlI11II1IlIl;
    }

    public final GameHelper43[] game_GameHelper43_arr_a() {
        return this.var_game_GameHelper43_arr_I1IlIlIllIl;
    }

    public final void void_b() {
        this.var_boolean_lI1lI1l1II1 = true;
        this.var_int_lI1lI1l1II1 = 0;
        this.var_java_lang_Boolean_I1IlIlIllIl = null;
        this.I1II1Illll();
    }

    public final void a(boolean bl, String string) {
        this.var_java_lang_Boolean_I1IlIlIllIl = new Boolean(bl);
        this.var_game_MarqueeNotice_IlI11II1IlIl.a(string);
    }

    private void I1I1Ill1l(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int[] nArray = var_int_arr_I1IlIlIllIl;
        for (n7 = 0; n7 < 3; ++n7) {
            n6 = n7 * 20;
            int n8 = this.var_int_lI1lI1l1II1 - n6 << 1;
            if (n8 <= 0 || n8 >= 60 || (n5 = 255 - (n8 << 2)) <= 0) continue;
            graphics.setColor(nArray[n7 % nArray.length]);
            graphics.drawArc(n - n8, n2 - n8, n8 << 1, n8 << 1, 0, 360);
            graphics.drawArc(n - n8 + 1, n2 - n8 + 1, (n8 << 1) - 2, (n8 << 1) - 2, 0, 360);
        }
        for (n6 = 0; n6 < 12; ++n6) {
            double d = (double)n6 * Math.PI * 2.0 / 12.0;
            n7 = this.var_int_lI1lI1l1II1 / 3;
            n4 = n7 - n7 * n7 / 60;
            if (n4 < 0) {
                n4 = 0;
            }
            n3 = n + (int)(Math.cos(d) * (double)n4);
            n7 = n2 + (int)(Math.sin(d) * (double)n4);
            int n9 = (n6 + this.var_int_lI1lI1l1II1 / 10) % nArray.length;
            graphics.setColor(nArray[n9]);
            n9 = var_int_arr_IlI11II1IlIl[0] - this.var_int_lI1lI1l1II1 / 20;
            if (n9 <= 0) {
                n9 = 1;
            }
            graphics.fillRect(n3 - n9 / 2, n7 - n9 / 2, n9, n9);
            if (n4 <= 5) continue;
            n7 = n4 - 5;
            n4 = n + (int)(Math.cos(d) * (double)n7);
            n7 = n2 + (int)(Math.sin(d) * (double)n7);
            graphics.fillRect(n4 - 1, n7 - 1, 2, 2);
        }
        if (this.var_int_lI1lI1l1II1 % 8 < 4) {
            n6 = 8 + this.var_int_lI1lI1l1II1 % 8;
            graphics.setColor(nArray[0]);
            for (int i = 0; i < 4; ++i) {
                if (i == 0) {
                    n5 = n;
                    n7 = n2 - n6;
                    n4 = n;
                    n3 = n2 - 2;
                } else if (i == 1) {
                    n5 = n + n6;
                    n7 = n2;
                    n4 = n + 2;
                    n3 = n2;
                } else if (i == 2) {
                    n5 = n;
                    n7 = n2 + n6;
                    n4 = n;
                    n3 = n2 + 2;
                } else {
                    n5 = n - n6;
                    n7 = n2;
                    n4 = n - 2;
                    n3 = n2;
                }
                graphics.drawLine(n5, n7, n4, n3);
            }
            graphics.fillRect(n - 2, n2 - 2, 4, 4);
        }
        if (this.var_int_lI1lI1l1II1 % 3 == 0) {
            for (n6 = 0; n6 < 5; ++n6) {
                int n10 = (this.var_int_lI1lI1l1II1 * 7 + n6 * 73) % 360;
                n5 = 15 + (this.var_int_lI1lI1l1II1 + n6 * 13) % 20;
                n7 = n + (int)(Math.cos((double)n10 * Math.PI / 180.0) * (double)n5);
                n4 = n2 + (int)(Math.sin((double)n10 * Math.PI / 180.0) * (double)n5);
                graphics.setColor(nArray[(n6 + this.var_int_lI1lI1l1II1 / 5) % nArray.length]);
                graphics.fillRect(n7, n4, 2, 2);
            }
        }
    }

    private static int I1I1Ill1l(int n) {
        Vector vector = EquipScreen.var_java_util_Vector_a;
        if (vector == null) {
            return 0;
        }
        for (int i = 0; i < vector.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate)vector.elementAt(i);
            if (!itemTemplate.var_boolean_d || itemTemplate.var_short_a != n) continue;
            return itemTemplate.var_int_b;
        }
        return 0;
    }

    private void IIlI1III(Graphics graphics, int n, int n2) {
        if (this.var_game_GameHelper43_arr_I1IlIlIllIl == null || this.var_game_GameHelper43_arr_I1IlIlIllIl.length == 0) {
            return;
        }
        int n3 = this.var_game_GameHelper43_arr_I1IlIlIllIl.length;
        int n4 = n3 * 18 + (n3 - 1 << 2);
        n -= n4 / 2;
        for (n4 = 0; n4 < n3; ++n4) {
            GameHelper43 gameHelper43 = this.var_game_GameHelper43_arr_I1IlIlIllIl[n4];
            int n5 = n + n4 * 22;
            int n6 = gameHelper43.int_a();
            int n7 = GameHelper27.I1I1Ill1l(n6);
            int n8 = gameHelper43.b();
            graphics.setColor(16767817);
            graphics.fillRoundRect(n5, n2, 18, 18, 3, 3);
            graphics.setColor(2378093);
            graphics.drawRoundRect(n5, n2, 17, 17, 3, 3);
            if (GameHelper37.boolean_a(n6)) {
                Image image = GameHelper37.javax_microedition_lcdui_Image_a(n6);
                if (image != null) {
                    graphics.drawImage(image, n5 + 9, n2 + 9, 3);
                }
            } else {
                ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, (short)n6, (byte)-1);
            }
            String string = Math.min(n7, n8) + "/" + n8;
            if (n7 >= n8) {
                FontRenderer.i.a(graphics, string, n5 + 9, n2 + 18 + 1, 2);
                continue;
            }
            FontRenderer.j.a(graphics, string, n5 + 9, n2 + 18 + 1, 2);
        }
    }

    public final void a(Graphics graphics) {
        int n;
        int n2;
        int n3;
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_game_ShopItemEntry_I1IlIlIllIl == null) {
            super.a(graphics);
            return;
        }
        int n4 = this.var_game_ShopItemEntry_I1IlIlIllIl.var_byte_a > 0 ? 46 : 0;
        int n5 = this.var_game_GameHelper43_arr_I1IlIlIllIl != null && this.var_game_GameHelper43_arr_I1IlIlIllIl.length > 0 ? 24 : 0;
        n4 = n4 + 140 + n5;
        n5 = GameCanvas.var_int_b / 2 - 100;
        int n6 = GameCanvas.var_int_c / 2 - n4 / 2 - 20;
        BaseScreen.a(n5, n6, 200, n4, graphics);
        n4 = n6 + 8;
        n5 = GameCanvas.var_int_b / 2;
        n6 = FontRenderer.b.a("N\u00e2ng c\u1ea5p BST") + 16;
        graphics.setColor(3832504);
        graphics.fillRoundRect(n5 - n6 / 2, n4 - 2, n6, 20, 4, 4);
        FontRenderer.b.a(graphics, "N\u00e2ng c\u1ea5p BST", n5, n4, 2);
        n6 = ActionListener045.a(this.var_game_ShopItemEntry_I1IlIlIllIl.c);
        graphics.setColor(n6);
        FontRenderer.a.a(graphics, this.var_game_ShopItemEntry_I1IlIlIllIl.var_java_lang_String_a, n5, n4 += 22, 2);
        n4 += 18;
        if (this.var_game_ShopItemEntry_I1IlIlIllIl.var_byte_a > 0) {
            int n7 = n4;
            int n8 = n5;
            Graphics graphics2 = graphics;
            GameHelper27 gameHelper27 = this;
            if (gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl != null && gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_byte_a != 0) {
                n3 = gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_byte_a * 24;
                n8 -= n3 / 2;
                for (n3 = 0; n3 < gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_byte_a && n3 < gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_short_arr_a.length; ++n3) {
                    n2 = n8 + n3 * 24;
                    GameHelper26 gameHelper26 = new GameHelper26(gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_short_arr_a[n3], gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_boolean_arr_a[n3], gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_byte_arr_a[n3]);
                    gameHelper26.a(graphics2, n2, n7);
                }
            }
            n4 += 24;
            if (var_javax_microedition_lcdui_Image_I1IlIlIllIl != null) {
                int n9 = var_javax_microedition_lcdui_Image_I1IlIlIllIl.getWidth();
                int n10 = this.var_game_ShopItemEntry_I1IlIlIllIl.c * n9 + (this.var_game_ShopItemEntry_I1IlIlIllIl.c - 1 << 1);
                n8 = n5 - n10 / 2;
                for (n7 = 0; n7 < this.var_game_ShopItemEntry_I1IlIlIllIl.c; ++n7) {
                    graphics.drawImage(var_javax_microedition_lcdui_Image_I1IlIlIllIl, n8 + n7 * (n9 + 2), n4, 0);
                }
            }
            n7 = 200;
            n8 = n4 += 18;
            n = n5;
            Graphics graphics3 = graphics;
            graphics3.setColor(0xDDDDDD);
            graphics3.drawLine(n - 100 + 10, n8, n + 100 - 10, n8);
            n4 += 6;
        }
        graphics.setColor(0);
        int n11 = this.var_game_ShopItemEntry_I1IlIlIllIl.var_int_b;
        n = n11 + 1;
        String string = "C\u1ea5p \u0111\u1ed9: ";
        String string2 = ActionListener045.a("+%d", new Integer(n11));
        String string3 = ActionListener045.a("+%d", new Integer(n));
        n3 = FontRenderer.a.a(string);
        n2 = FontRenderer.a.a(string2);
        int n12 = FontRenderer.a.a(string3);
        n12 = n3 + n2 + 4 + 12 + 4 + n12;
        n12 = n5 - n12 / 2;
        FontRenderer.a.a(graphics, string, n12, n4, 0);
        int n13 = n12 + n3;
        if (n11 >= 10) {
            FontRenderer.c.a(graphics, string2, n13, n4, 0);
        } else {
            FontRenderer.a.a(graphics, string2, n13, n4, 0);
        }
        n13 += n2 + 4;
        if (n11 < 10 && var_game_GameHelper29_I1IlIlIllIl != null) {
            var_game_GameHelper29_I1IlIlIllIl.a(0, n13 + 6, n4 + 7, 2, 3, graphics);
            FontRenderer.c.a(graphics, string3, n13 += 16, n4, 0);
        }
        this.lllll1l1III = n5;
        this.IIll111II = (n4 += 20) + 40;
        n11 = this.var_int_I1IlIlIllIl > 0 ? 1 : 0;
        boolean bl = this.var_int_IlI11II1IlIl > 0;
        int n14 = n13 = n11 != 0 || bl ? 1 : 0;
        if (this.var_game_ShopItemEntry_I1IlIlIllIl.var_int_b < 10) {
            if (n13 != 0) {
                String string4 = "T\u1ec9 l\u1ec7: " + this.var_double_I1IlIlIllIl + "%";
                FontRenderer.a.a(graphics, string4, n5, n4, 2);
                n4 += 16;
                if (n11 != 0 && bl) {
                    String string5 = "Ph\u00ed: " + DataUtils.a((long)this.var_int_I1IlIlIllIl) + " xu + " + DataUtils.a((long)this.var_int_IlI11II1IlIl) + " l\u01b0\u1ee3ng";
                    FontRenderer.a.a(graphics, string5, n5, n4, 2);
                } else if (n11 != 0) {
                    String string6 = "Ph\u00ed: " + DataUtils.a((long)this.var_int_I1IlIlIllIl) + " xu";
                    FontRenderer.a.a(graphics, string6, n5, n4, 2);
                } else if (bl) {
                    String string7 = "Ph\u00ed: " + DataUtils.a((long)this.var_int_IlI11II1IlIl) + " l\u01b0\u1ee3ng";
                    FontRenderer.a.a(graphics, string7, n5, n4, 2);
                }
                n4 += 16;
                if (this.var_game_GameHelper43_arr_I1IlIlIllIl != null && this.var_game_GameHelper43_arr_I1IlIlIllIl.length > 0) {
                    this.IIlI1III(graphics, n5, n4);
                }
            } else {
                FontRenderer.a.a(graphics, "\u0110ang t\u1ea3i...", n5, n4, 2);
            }
        } else {
            FontRenderer.c.a(graphics, "\u0110\u00e3 \u0111\u1ea1t c\u1ea5p t\u1ed1i \u0111a!", n5, n4, 2);
        }
        if (this.var_boolean_I1IlIlIllIl) {
            this.var_game_MarqueeNotice_I1IlIlIllIl.a("X\u00e1c nh\u1eadn n\u00e2ng c\u1ea5p?");
            this.var_game_MarqueeNotice_I1IlIlIllIl.a(graphics);
        }
        if (this.var_boolean_IlI11II1IlIl) {
            this.var_game_MarqueeNotice_IlI11II1IlIl.a(graphics);
        }
        if (this.var_boolean_lI1lI1l1II1) {
            this.I1I1Ill1l(graphics, this.lllll1l1III, this.IIll111II);
        }
        super.a(graphics);
    }

    public final void void_a() {
        super.void_a();
        this.I1II1Illll();
        if (this.var_boolean_lI1lI1l1II1) {
            ++this.var_int_lI1lI1l1II1;
            if (this.var_java_lang_Boolean_I1IlIlIllIl != null && this.var_int_lI1lI1l1II1 >= 100) {
                GameHelper27 gameHelper27 = this;
                this.var_boolean_lI1lI1l1II1 = false;
                gameHelper27.var_int_lI1lI1l1II1 = 0;
                if (gameHelper27.var_java_lang_Boolean_I1IlIlIllIl != null && gameHelper27.var_java_lang_Boolean_I1IlIlIllIl.booleanValue()) {
                    if (gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl != null) {
                        ++gameHelper27.var_game_ShopItemEntry_I1IlIlIllIl.var_int_b;
                        gameHelper27.II1I1II1();
                    }
                    if (!gameHelper27.var_game_MarqueeNotice_IlI11II1IlIl.boolean_a()) {
                        gameHelper27.var_game_MarqueeNotice_IlI11II1IlIl.a("N\u00e2ng c\u1ea5p th\u00e0nh c\u00f4ng!");
                    }
                    gameHelper27.var_boolean_IlI11II1IlIl = true;
                } else if (gameHelper27.var_java_lang_Boolean_I1IlIlIllIl != null) {
                    if (!gameHelper27.var_game_MarqueeNotice_IlI11II1IlIl.boolean_a()) {
                        gameHelper27.var_game_MarqueeNotice_IlI11II1IlIl.a("N\u00e2ng c\u1ea5p th\u1ea5t b\u1ea1i!");
                    }
                    gameHelper27.var_boolean_IlI11II1IlIl = true;
                }
                gameHelper27.var_java_lang_Boolean_I1IlIlIllIl = null;
                gameHelper27.I1II1Illll();
            }
        }
    }

    static boolean a(GameHelper27 gameHelper27, boolean bl) {
        gameHelper27.var_boolean_I1IlIlIllIl = bl;
        return gameHelper27.var_boolean_I1IlIlIllIl;
    }

    static MarqueeNotice game_MarqueeNotice_a(GameHelper27 gameHelper27) {
        return gameHelper27.var_game_MarqueeNotice_I1IlIlIllIl;
    }

    static void void_a(GameHelper27 gameHelper27) {
        gameHelper27.I1II1Illll();
    }

    static boolean b(GameHelper27 gameHelper27, boolean bl) {
        gameHelper27.var_boolean_IlI11II1IlIl = bl;
        return gameHelper27.var_boolean_IlI11II1IlIl;
    }

    static MarqueeNotice b(GameHelper27 gameHelper27) {
        return gameHelper27.var_game_MarqueeNotice_IlI11II1IlIl;
    }

    static int a(GameHelper27 gameHelper27, int n) {
        return GameHelper27.I1I1Ill1l(n);
    }

    static {
        try {
            var_javax_microedition_lcdui_Image_I1IlIlIllIl = Image.createImage((String)"/effect/star.png");
            var_game_GameHelper29_I1IlIlIllIl = new GameHelper29(Image.createImage((String)"/arrow2.png"), 4, 6);
        }
        catch (Exception iOException) {
            Exception iOException2 = iOException;
            iOException.printStackTrace();
        }
        var_int_arr_I1IlIlIllIl = new int[]{0xFFFFFF, 16768329, 0xFF9900, 0xFF6600, 0xFF3300, 0xFF0000};
        var_int_arr_IlI11II1IlIl = new int[]{4, 3, 3, 2, 2, 1};
    }
}

