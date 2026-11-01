/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab6;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper41
extends GameHelper21 {
    public static final GameHelper41 a = new GameHelper41();
    private ItemTemplate var_game_ItemTemplate_lIlll11IlllI;
    private int var_int_lIlll11IlllI;
    private int var_int_Illll1l1 = 3;
    private GameHelper43[] var_game_GameHelper43_arr_lIlll11IlllI;
    private int var_int_Il1IlI11IIl1 = 0;
    private int IIl1IlI1 = 0;
    private double var_double_lIlll11IlllI = 0.0;
    private final EquipmentLabel var_game_EquipmentLabel_lIlll11IlllI = new EquipmentLabel();
    private final GameHelper55 var_game_GameHelper55_lIlll11IlllI = new GameHelper55();
    private final MarqueeNotice var_game_MarqueeNotice_lIlll11IlllI = new MarqueeNotice();
    private final MarqueeNotice var_game_MarqueeNotice_Illll1l1 = new MarqueeNotice();
    private boolean var_boolean_lIlll11IlllI = false;
    private boolean var_boolean_Illll1l1 = false;
    private boolean var_boolean_Il1IlI11IIl1 = false;
    private int ll111IlIlIII = 0;
    private Boolean var_java_lang_Boolean_lIlll11IlllI = null;
    private static final int[] var_int_arr_lIlll11IlllI;
    private static final int[] var_int_arr_Illll1l1;

    public GameHelper41() {
        this.var_game_GameHelper55_lIlll11IlllI.a(new GameHelper42(this));
    }

    public final void a(ItemTemplate itemTemplate) {
        this.var_game_ItemTemplate_lIlll11IlllI = itemTemplate;
        this.var_boolean_lIlll11IlllI = false;
        this.var_boolean_Illll1l1 = false;
        this.var_boolean_Il1IlI11IIl1 = false;
        this.ll111IlIlIII = 0;
        this.var_java_lang_Boolean_lIlll11IlllI = null;
        this.var_game_MarqueeNotice_lIlll11IlllI.void_a();
        this.var_game_MarqueeNotice_Illll1l1.void_a();
        if (itemTemplate != null) {
            this.var_int_lIlll11IlllI = itemTemplate.var_int_arr_c != null ? itemTemplate.var_int_arr_c.length : 0;
            this.var_game_EquipmentLabel_lIlll11IlllI.a(itemTemplate, FontRenderer.a);
            this.var_game_GameHelper55_lIlll11IlllI.a(itemTemplate, this.var_int_Illll1l1);
        }
        this.IIl11ll1lI();
    }

    public final void a(int n, int n2, double d, int n3, GameHelper43[] gameHelper43Array) {
        this.var_int_Il1IlI11IIl1 = n;
        this.IIl1IlI1 = n2;
        this.var_double_lIlll11IlllI = d;
        this.var_int_Illll1l1 = n3;
        this.var_game_GameHelper43_arr_lIlll11IlllI = gameHelper43Array;
        this.var_game_GameHelper55_lIlll11IlllI.a(this.var_game_ItemTemplate_lIlll11IlllI, this.var_int_Illll1l1);
        this.IIl11ll1lI();
    }

    private void IIl11ll1lI() {
        boolean bl;
        if (this.var_boolean_Il1IlI11IIl1) {
            ((GameHelper21)this).a = null;
            this.b = null;
            this.c = null;
            return;
        }
        if (this.var_boolean_Illll1l1) {
            ((GameHelper21)this).a = null;
            this.b = new GameCommand("OK", new ActionListener271(this));
            this.c = null;
            return;
        }
        boolean bl2 = bl = this.var_int_Il1IlI11IIl1 > 0 || this.IIl1IlI1 > 0;
        if (this.var_boolean_lIlll11IlllI) {
            ((GameHelper21)this).a = new GameCommand(StringUtils.cr(), new ActionListener270(this));
            this.b = null;
            this.c = new GameCommand(StringUtils.cq(), new ActionListener268(this));
            return;
        }
        this.c = new GameCommand(StringUtils.dH(), new ActionListener269((byte)0));
        this.b = this.var_game_ItemTemplate_lIlll11IlllI != null && this.var_int_lIlll11IlllI < this.var_int_Illll1l1 && bl ? new GameCommand(StringUtils.f(), new ActionListener272(this)) : null;
        ((GameHelper21)this).a = null;
    }

    public final ItemTemplate game_ItemTemplate_a() {
        return this.var_game_ItemTemplate_lIlll11IlllI;
    }

    public final int int_a() {
        return this.var_int_Il1IlI11IIl1;
    }

    public final int int_b() {
        return this.IIl1IlI1;
    }

    public final GameHelper43[] game_GameHelper43_arr_a() {
        return this.var_game_GameHelper43_arr_lIlll11IlllI;
    }

    public final void void_b() {
        this.var_boolean_Il1IlI11IIl1 = true;
        this.ll111IlIlIII = 0;
        this.var_java_lang_Boolean_lIlll11IlllI = null;
        this.var_game_GameHelper55_lIlll11IlllI.a(this.var_int_lIlll11IlllI);
        this.IIl11ll1lI();
    }

    public final void a(boolean bl, String string) {
        this.var_java_lang_Boolean_lIlll11IlllI = new Boolean(bl);
        this.var_game_MarqueeNotice_Illll1l1.a(string);
    }

    private static int ll1IIlll(int n) {
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

    private void ll1IIlll(Graphics graphics, int n, int n2) {
        if (this.var_game_GameHelper43_arr_lIlll11IlllI == null || this.var_game_GameHelper43_arr_lIlll11IlllI.length == 0) {
            return;
        }
        int n3 = this.var_game_GameHelper43_arr_lIlll11IlllI.length;
        int n4 = n3 * 18 + (n3 - 1 << 2);
        n -= n4 / 2;
        for (n4 = 0; n4 < n3; ++n4) {
            GameHelper43 gameHelper43 = this.var_game_GameHelper43_arr_lIlll11IlllI[n4];
            int n5 = n + n4 * 22;
            int n6 = gameHelper43.int_a();
            int n7 = GameHelper41.ll1IIlll(n6);
            int n8 = gameHelper43.b();
            graphics.setColor(16767817);
            graphics.fillRect(n5, n2, 18, 18);
            graphics.setColor(2378093);
            graphics.drawRect(n5, n2, 17, 17);
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
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_game_ItemTemplate_lIlll11IlllI == null) {
            super.a(graphics);
            return;
        }
        int n = this.var_game_GameHelper55_lIlll11IlllI.int_a();
        int n2 = this.var_game_GameHelper55_lIlll11IlllI.int_b();
        int n3 = this.var_game_GameHelper43_arr_lIlll11IlllI != null && this.var_game_GameHelper43_arr_lIlll11IlllI.length > 0 ? 24 : 0;
        n3 = n + 80 + 64 + n3;
        int n4 = GameCanvas.var_int_b / 2 - n2 / 2;
        int n5 = GameCanvas.var_int_c / 2 - n3 / 2 - 20;
        BaseScreen.a(n4, n5, n2, n3, graphics);
        n2 = n5 + 8;
        n3 = GameCanvas.var_int_b / 2;
        n4 = FontRenderer.b.a(StringUtils.f()) + 16;
        graphics.setColor(3832504);
        graphics.fillRect(n3 - n4 / 2, n2 - 2, n4, 20);
        FontRenderer.b.a(graphics, StringUtils.f(), n3, n2, 2);
        this.var_game_EquipmentLabel_lIlll11IlllI.a(graphics, n3 - this.var_game_EquipmentLabel_lIlll11IlllI.a() / 2, n2 += 20);
        n2 += this.var_game_EquipmentLabel_lIlll11IlllI.b();
        String string = "L\u1ed7 \u0111\u00e3 \u0111\u1ee5c: " + this.var_int_lIlll11IlllI + "/" + this.var_int_Illll1l1;
        if (this.var_int_lIlll11IlllI == this.var_int_Illll1l1) {
            FontRenderer.c.a(graphics, string, n3, n2, 2);
        } else {
            FontRenderer.a.a(graphics, string, n3, n2, 2);
        }
        this.var_game_GameHelper55_lIlll11IlllI.a(graphics, n3, n2 += 18);
        n2 += n + 6;
        n = this.var_int_Il1IlI11IIl1 > 0 ? 1 : 0;
        boolean bl = this.IIl1IlI1 > 0;
        int n6 = n5 = n != 0 || bl ? 1 : 0;
        if (this.var_int_lIlll11IlllI < this.var_int_Illll1l1) {
            if (n5 != 0) {
                String string2 = "T\u1ec9 l\u1ec7: " + this.var_double_lIlll11IlllI + "%";
                FontRenderer.a.a(graphics, string2, n3, n2, 2);
                n2 += 16;
                if (n != 0 && bl) {
                    String string3 = "Ph\u00ed: " + DataUtils.a((long)this.var_int_Il1IlI11IIl1) + " xu + " + DataUtils.a((long)this.IIl1IlI1) + " l\u01b0\u1ee3ng";
                    FontRenderer.a.a(graphics, string3, n3, n2, 2);
                } else if (n != 0) {
                    String string4 = "Ph\u00ed: " + DataUtils.a((long)this.var_int_Il1IlI11IIl1) + " xu";
                    FontRenderer.a.a(graphics, string4, n3, n2, 2);
                } else if (bl) {
                    String string5 = "Ph\u00ed: " + DataUtils.a((long)this.IIl1IlI1) + " l\u01b0\u1ee3ng";
                    FontRenderer.a.a(graphics, string5, n3, n2, 2);
                }
                n2 += 16;
                if (this.var_game_GameHelper43_arr_lIlll11IlllI != null && this.var_game_GameHelper43_arr_lIlll11IlllI.length > 0) {
                    this.ll1IIlll(graphics, n3, n2);
                }
            } else {
                FontRenderer.a.a(graphics, "\u0110ang t\u1ea3i...", n3, n2, 2);
            }
        } else {
            FontRenderer.c.a(graphics, "\u0110\u00e3 \u0111\u1ee5c \u0111\u1ee7 slot!", n3, n2, 2);
        }
        if (this.var_boolean_lIlll11IlllI) {
            this.var_game_MarqueeNotice_lIlll11IlllI.a("X\u00e1c nh\u1eadn \u0111\u1ee5c l\u1ed7?");
            this.var_game_MarqueeNotice_lIlll11IlllI.a(graphics);
        }
        if (this.var_boolean_Illll1l1) {
            this.var_game_MarqueeNotice_Illll1l1.a(graphics);
        }
        super.a(graphics);
    }

    public final void void_a() {
        super.void_a();
        this.IIl11ll1lI();
        if (this.var_boolean_Il1IlI11IIl1) {
            ++this.ll111IlIlIII;
            if (this.var_java_lang_Boolean_lIlll11IlllI != null && this.ll111IlIlIII >= 100) {
                GameHelper41 gameHelper41 = this;
                this.var_boolean_Il1IlI11IIl1 = false;
                gameHelper41.ll111IlIlIII = 0;
                gameHelper41.var_game_GameHelper55_lIlll11IlllI.void_a();
                if (gameHelper41.var_java_lang_Boolean_lIlll11IlllI != null && gameHelper41.var_java_lang_Boolean_lIlll11IlllI.booleanValue()) {
                    if (gameHelper41.var_game_ItemTemplate_lIlll11IlllI != null) {
                        int n = gameHelper41.var_game_ItemTemplate_lIlll11IlllI.var_int_arr_c != null ? gameHelper41.var_game_ItemTemplate_lIlll11IlllI.var_int_arr_c.length : 0;
                        int[] nArray = new int[n + 1];
                        for (int i = 0; i < n; ++i) {
                            nArray[i] = gameHelper41.var_game_ItemTemplate_lIlll11IlllI.var_int_arr_c[i];
                        }
                        nArray[n] = -1;
                        gameHelper41.var_game_ItemTemplate_lIlll11IlllI.var_int_arr_c = nArray;
                        gameHelper41.var_int_lIlll11IlllI = gameHelper41.var_game_ItemTemplate_lIlll11IlllI.var_int_arr_c.length;
                        gameHelper41.var_game_GameHelper55_lIlll11IlllI.a(gameHelper41.var_game_ItemTemplate_lIlll11IlllI, gameHelper41.var_int_Illll1l1);
                    }
                    ConnectionWatchdog.game_ConnectionWatchdog_a().h(gameHelper41.var_game_ItemTemplate_lIlll11IlllI.var_int_a);
                    if (!gameHelper41.var_game_MarqueeNotice_Illll1l1.boolean_a()) {
                        gameHelper41.var_game_MarqueeNotice_Illll1l1.a("\u0110\u1ee5c l\u1ed7 th\u00e0nh c\u00f4ng!");
                    }
                    gameHelper41.var_boolean_Illll1l1 = true;
                } else if (gameHelper41.var_java_lang_Boolean_lIlll11IlllI != null) {
                    if (!gameHelper41.var_game_MarqueeNotice_Illll1l1.boolean_a()) {
                        gameHelper41.var_game_MarqueeNotice_Illll1l1.a("\u0110\u1ee5c l\u1ed7 th\u1ea5t b\u1ea1i!");
                    }
                    gameHelper41.var_boolean_Illll1l1 = true;
                }
                gameHelper41.var_java_lang_Boolean_lIlll11IlllI = null;
                gameHelper41.IIl11ll1lI();
            }
        }
        this.var_game_GameHelper55_lIlll11IlllI.void_b();
    }

    static void a(GameHelper41 gameHelper41, Graphics graphics, int n, int n2, int n3) {
        int[] nArray = var_int_arr_lIlll11IlllI;
        int n4 = n3 + 4;
        for (int i = 0; i < var_int_arr_Illll1l1.length; ++i) {
            int n5 = gameHelper41.ll111IlIlIII - i * 3;
            int n6 = n4 << 2;
            if ((n5 %= n6) < 0) {
                n5 += n6;
            }
            if (n5 < n4) {
                n6 = n - n4 / 2 + n5;
                n5 = n2 - n4 / 2;
            } else if (n5 < n4 << 1) {
                n6 = n + n4 / 2;
                n5 = n2 - n4 / 2 + (n5 - n4);
            } else if (n5 < n4 * 3) {
                n6 = n + n4 / 2 - (n5 - (n4 << 1));
                n5 = n2 + n4 / 2;
            } else {
                n6 = n - n4 / 2;
                n5 = n2 + n4 / 2 - (n5 - n4 * 3);
            }
            graphics.setColor(nArray[i % nArray.length]);
            int n7 = var_int_arr_Illll1l1[i];
            graphics.fillRect(n6 - n7 / 2, n5 - n7 / 2, n7, n7);
        }
        if (gameHelper41.ll111IlIlIII % 6 < 3) {
            graphics.setColor(nArray[0]);
            graphics.drawRect(n - n3 / 2 - 1, n2 - n3 / 2 - 1, n3 + 1, n3 + 1);
        }
    }

    static boolean a(GameHelper41 gameHelper41, boolean bl) {
        gameHelper41.var_boolean_lIlll11IlllI = bl;
        return gameHelper41.var_boolean_lIlll11IlllI;
    }

    static MarqueeNotice game_MarqueeNotice_a(GameHelper41 gameHelper41) {
        return gameHelper41.var_game_MarqueeNotice_lIlll11IlllI;
    }

    static void void_a(GameHelper41 gameHelper41) {
        gameHelper41.IIl11ll1lI();
    }

    static boolean b(GameHelper41 gameHelper41, boolean bl) {
        gameHelper41.var_boolean_Illll1l1 = bl;
        return gameHelper41.var_boolean_Illll1l1;
    }

    static MarqueeNotice b(GameHelper41 gameHelper41) {
        return gameHelper41.var_game_MarqueeNotice_Illll1l1;
    }

    static int a(GameHelper41 gameHelper41, int n) {
        return GameHelper41.ll1IIlll(n);
    }

    static {
        var_int_arr_lIlll11IlllI = new int[]{0xFFFFFF, 16768329, 0xFF9900, 0xFF6600, 0xFF3300, 0xFF0000};
        var_int_arr_Illll1l1 = new int[]{4, 3, 3, 2, 2, 1};
    }
}

