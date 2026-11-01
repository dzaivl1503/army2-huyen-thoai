/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab4;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper25
extends ScrollDialogScreen {
    public static GameHelper25 a;
    private static Image var_javax_microedition_lcdui_Image_Il1l1IIl;
    private ShopItemEntry[] var_game_ShopItemEntry_arr_Il1l1IIl;
    private EquipUpgradeEntry[] var_game_EquipUpgradeEntry_arr_Il1l1IIl;
    private boolean var_boolean_Il1l1IIl = false;
    private String var_java_lang_String_ll1l1Il1l1I = null;
    private static int var_int_Il1l1IIl;
    private static int var_int_ll1l1Il1l1I;
    private static int Il1lI11I;
    private static int lI1lIIII1I;
    private static int II111l1l;
    private int lllIlIll;
    private int Ill11lI1III;
    private int lIlIll11 = 0;
    private boolean var_boolean_ll1l1Il1l1I = false;
    private int I1I1lllI11 = 0;

    public GameHelper25() {
        int n = GameCanvas.var_int_b - 40;
        int n2 = GameCanvas.var_int_c - BaseScreen.var_int_r - 40;
        this.var_int_h = (n - 56) / 32;
        if (this.var_int_h < 4) {
            this.var_int_h = 4;
        }
        this.n();
        this.d = GameCanvas.var_int_b / 2 - this.var_int_f / 2;
        this.var_int_g = n2;
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - this.var_int_g / 2;
        ((ScrollDialogScreen)this).a = StringUtils.S();
        this.lllIlIll = this.var_int_f - 10;
        this.Ill11lI1III = this.var_int_g - 70;
        this.g = new GameCommand(StringUtils.T(), new ActionListener242(this));
        this.f = new GameCommand("N\u00e2ng c\u1ea5p", new ActionListener241(this));
        this.h = new GameCommand(StringUtils.dH(), new ActionListener240());
    }

    public final void a(BaseScreen baseScreen) {
        super.a(baseScreen);
        this.lIlIll11 = 0;
        this.var_boolean_Il1l1IIl = true;
        this.var_java_lang_String_ll1l1Il1l1I = null;
        this.var_game_ShopItemEntry_arr_Il1l1IIl = null;
        this.var_game_EquipUpgradeEntry_arr_Il1l1IIl = null;
        var_int_ll1l1Il1l1I = 0;
        var_int_Il1l1IIl = 0;
        baseScreen = this;
        Object object = new Message(55);
        try {
            ((Message)object).java_io_DataOutputStream_a().writeByte(0);
            ((Message)object).java_io_DataOutputStream_a().writeInt(0);
            MessageHandler.game_MessageHandler_a().a((Message)object);
            ((Message)object).void_a();
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            ((GameHelper25)baseScreen).var_java_lang_String_ll1l1Il1l1I = "L\u1ed7i khi g\u1eedi y\u00eau c\u1ea7u";
            ((GameHelper25)baseScreen).var_boolean_Il1l1IIl = false;
            return;
        }
    }

    public final synchronized void a(ShopItemEntry[] shopItemEntryArray, EquipUpgradeEntry[] equipUpgradeEntryArray) {
        this.var_game_ShopItemEntry_arr_Il1l1IIl = shopItemEntryArray;
        this.var_game_EquipUpgradeEntry_arr_Il1l1IIl = equipUpgradeEntryArray;
        this.var_boolean_Il1l1IIl = false;
        this.var_java_lang_String_ll1l1Il1l1I = null;
    }

    public final synchronized void a(String string) {
        this.var_java_lang_String_ll1l1Il1l1I = string;
        this.var_boolean_Il1l1IIl = false;
    }

    public final void a(Graphics graphics) {
        super.a(graphics);
        int n = GameCanvas.var_int_b / 2 - this.lllIlIll / 2;
        int n2 = this.e + 29;
        graphics.setColor(3832504);
        graphics.fillRoundRect(n, this.e + 23, this.lllIlIll, this.Ill11lI1III + 10, 4, 4);
        graphics.setClip(n, n2, this.lllIlIll, this.Ill11lI1III);
        graphics.translate(0, -var_int_ll1l1Il1l1I);
        if (this.var_boolean_Il1l1IIl) {
            FontRenderer.a.a(graphics, "\u0110ang t\u1ea3i...", GameCanvas.var_int_b / 2, n2 + this.Ill11lI1III / 2 + var_int_ll1l1Il1l1I, 2);
        } else if (this.var_java_lang_String_ll1l1Il1l1I != null) {
            FontRenderer.a.a(graphics, this.var_java_lang_String_ll1l1Il1l1I, GameCanvas.var_int_b / 2, n2 + this.Ill11lI1III / 2 + var_int_ll1l1Il1l1I, 2);
        } else if (this.var_game_ShopItemEntry_arr_Il1l1IIl == null || this.var_game_ShopItemEntry_arr_Il1l1IIl.length == 0) {
            FontRenderer.a.a(graphics, "Ch\u01b0a c\u00f3 b\u1ed9 s\u01b0u t\u1eadp", GameCanvas.var_int_b / 2, n2 + this.Ill11lI1III / 2 + var_int_ll1l1Il1l1I, 2);
        } else {
            n2 += 4;
            for (int i = 0; i < this.var_game_ShopItemEntry_arr_Il1l1IIl.length; ++i) {
                int n3;
                int n4 = i == this.lIlIll11 ? 1 : 0;
                int n5 = n2;
                int n6 = n + 5;
                ShopItemEntry shopItemEntry = this.var_game_ShopItemEntry_arr_Il1l1IIl[i];
                Graphics graphics2 = graphics;
                GameHelper25 gameHelper25 = this;
                int n7 = gameHelper25.lllIlIll - 10;
                graphics2.setColor(n4 != 0 ? 16776679 : 0xFFFFFF);
                graphics2.fillRoundRect(n6, n5, n7, 58, 3, 3);
                if (n4 != 0) {
                    n4 = ActionListener045.a(shopItemEntry.c);
                    graphics2.setColor(n4);
                    graphics2.drawRoundRect(n6, n5, n7, 58, 3, 3);
                    graphics2.drawRoundRect(n6 + 1, n5 + 1, n7 - 2, 56, 3, 3);
                }
                graphics2.setColor(0);
                n4 = n5 + 6;
                FontRenderer.a.a(graphics2, shopItemEntry.var_java_lang_String_a, n6 + 6, n4, 0);
                int n8 = FontRenderer.a.a(shopItemEntry.var_java_lang_String_a);
                n8 = n6 + 10 + n8;
                if (var_javax_microedition_lcdui_Image_Il1l1IIl != null) {
                    int n9 = var_javax_microedition_lcdui_Image_Il1l1IIl.getWidth();
                    for (n3 = 0; n3 < shopItemEntry.c; ++n3) {
                        graphics2.drawImage(var_javax_microedition_lcdui_Image_Il1l1IIl, n8 + n3 * (n9 + 2), n4, 0);
                    }
                }
                graphics2.setColor(0);
                Object object = "C\u1ea5p \u0111\u1ed9: +" + shopItemEntry.var_int_b;
                FontRenderer.a.a(graphics2, (String)object, n6 + n7 - 6, n4, 1);
                n3 = n5 + 28;
                n5 = n6 + 6;
                for (n4 = 0; n4 < shopItemEntry.var_byte_a && n4 < shopItemEntry.var_short_arr_a.length; ++n4) {
                    n8 = n5 + n4 * 24;
                    object = new GameHelper26(shopItemEntry.var_short_arr_a[n4], shopItemEntry.var_boolean_arr_a[n4], shopItemEntry.var_byte_arr_a[n4]);
                    ((GameHelper26)object).a(graphics2, n8, n3);
                }
                graphics2.setColor(0);
                if (shopItemEntry.var_byte_b == shopItemEntry.var_byte_a) {
                    FontRenderer.c.a(graphics2, "\u0110\u00e3 k\u00edch ho\u1ea1t", n6 + n7 - 6, n3 + 6, 1);
                } else {
                    String string = "\u0110\u00e3 s\u1edf h\u1eefu: " + shopItemEntry.var_byte_b + "/" + shopItemEntry.var_byte_a;
                    FontRenderer.a.a(graphics2, string, n6 + n7 - 6, n3 + 6, 1);
                }
                n2 += 63;
            }
        }
        graphics.setClip(0, 0, 1000, 1000);
        graphics.translate(0, -graphics.getTranslateY());
        this.d(graphics);
    }

    public final void c() {
        super.c();
        if (this.var_game_ShopItemEntry_arr_Il1l1IIl != null && this.var_game_ShopItemEntry_arr_Il1l1IIl.length > 0) {
            int n = 4 + this.var_game_ShopItemEntry_arr_Il1l1IIl.length * 58 + (this.var_game_ShopItemEntry_arr_Il1l1IIl.length - 1) * 5 + 4;
            II111l1l = n - this.Ill11lI1III;
            if (II111l1l < 0) {
                II111l1l = 0;
            }
            if (var_int_ll1l1Il1l1I != var_int_Il1l1IIl) {
                lI1lIIII1I = var_int_Il1l1IIl - var_int_ll1l1Il1l1I << 2;
                var_int_ll1l1Il1l1I += (Il1lI11I += lI1lIIII1I) >> 4;
                Il1lI11I &= 0xF;
            }
            if (var_int_ll1l1Il1l1I > II111l1l) {
                var_int_ll1l1Il1l1I = II111l1l;
            }
            if (var_int_ll1l1Il1l1I < 0) {
                var_int_ll1l1Il1l1I = 0;
            }
        }
    }

    public final void void_b() {
        int n;
        super.void_b();
        if (this.var_game_ShopItemEntry_arr_Il1l1IIl == null || this.var_game_ShopItemEntry_arr_Il1l1IIl.length == 0) {
            return;
        }
        this.lllIIlII();
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            if (--this.lIlIll11 < 0) {
                this.lIlIll11 = this.var_game_ShopItemEntry_arr_Il1l1IIl.length - 1;
            }
            this.llIl1lI1II();
            this.lllIIlII();
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            if (++this.lIlIll11 >= this.var_game_ShopItemEntry_arr_Il1l1IIl.length) {
                this.lIlIll11 = 0;
            }
            this.llIl1lI1II();
            this.lllIIlII();
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.var_boolean_ll1l1Il1l1I) {
                this.I1I1lllI11 = var_int_ll1l1Il1l1I;
                this.var_boolean_ll1l1Il1l1I = true;
            }
            if (Math.abs(n = GameCanvas.h - GameCanvas.g) > 5) {
                var_int_Il1l1IIl = this.I1I1lllI11 + n;
                if (var_int_Il1l1IIl < 0) {
                    var_int_Il1l1IIl = 0;
                }
                if (var_int_Il1l1IIl > II111l1l) {
                    var_int_Il1l1IIl = II111l1l;
                }
            }
        }
        if (!GameCanvas.var_boolean_b && this.var_boolean_ll1l1Il1l1I) {
            this.var_boolean_ll1l1Il1l1I = false;
            n = GameCanvas.h - GameCanvas.g;
            if (Math.abs(n) <= 5) {
                int n2 = GameCanvas.g;
                int n3 = GameCanvas.f;
                GameHelper25 gameHelper25 = this;
                if (gameHelper25.var_game_ShopItemEntry_arr_Il1l1IIl != null && gameHelper25.var_game_ShopItemEntry_arr_Il1l1IIl.length != 0) {
                    int n4 = GameCanvas.var_int_b / 2 - gameHelper25.lllIlIll / 2;
                    int n5 = gameHelper25.e + 29;
                    if (n3 >= n4 && n3 <= n4 + gameHelper25.lllIlIll && n2 >= n5 && n2 <= n5 + gameHelper25.Ill11lI1III) {
                        n3 = n2 - n5 + var_int_ll1l1Il1l1I;
                        if ((n3 = (n3 - 4) / 63) >= 0 && n3 < gameHelper25.var_game_ShopItemEntry_arr_Il1l1IIl.length) {
                            if (n3 == gameHelper25.lIlIll11) {
                                if (gameHelper25.var_game_EquipUpgradeEntry_arr_Il1l1IIl != null && gameHelper25.lIlIll11 < gameHelper25.var_game_EquipUpgradeEntry_arr_Il1l1IIl.length) {
                                    GameHelper24 gameHelper24 = new GameHelper24();
                                    gameHelper24.a(gameHelper25.var_game_EquipUpgradeEntry_arr_Il1l1IIl[gameHelper25.lIlIll11]);
                                    GameCanvas.var_game_GameHelper21_a = gameHelper24;
                                }
                            } else {
                                gameHelper25.lIlIll11 = n3;
                                gameHelper25.llIl1lI1II();
                            }
                        }
                    }
                }
                this.lllIIlII();
            }
        }
    }

    private void lllIIlII() {
        if (this.var_game_ShopItemEntry_arr_Il1l1IIl != null && this.lIlIll11 < this.var_game_ShopItemEntry_arr_Il1l1IIl.length) {
            ShopItemEntry shopItemEntry = this.var_game_ShopItemEntry_arr_Il1l1IIl[this.lIlIll11];
            if (shopItemEntry.var_boolean_a && shopItemEntry.var_int_b < 10) {
                this.f = new GameCommand("N\u00e2ng c\u1ea5p", new ActionListener241(this));
                return;
            }
            this.f = null;
        }
    }

    private void llIl1lI1II() {
        int n = this.lIlIll11 * 63;
        var_int_Il1l1IIl = n - this.Ill11lI1III / 2 + 29;
        if (var_int_Il1l1IIl < 0) {
            var_int_Il1l1IIl = 0;
        }
        if (var_int_Il1l1IIl > II111l1l) {
            var_int_Il1l1IIl = II111l1l;
        }
    }

    static ShopItemEntry[] game_ShopItemEntry_arr_a(GameHelper25 gameHelper25) {
        return gameHelper25.var_game_ShopItemEntry_arr_Il1l1IIl;
    }

    static int int_a(GameHelper25 gameHelper25) {
        return gameHelper25.lIlIll11;
    }

    static EquipUpgradeEntry[] game_EquipUpgradeEntry_arr_a(GameHelper25 gameHelper25) {
        return gameHelper25.var_game_EquipUpgradeEntry_arr_Il1l1IIl;
    }

    static {
        try {
            var_javax_microedition_lcdui_Image_Il1l1IIl = Image.createImage((String)"/effect/star.png");
        }
        catch (Exception iOException) {
            Exception iOException2 = iOException;
            iOException.printStackTrace();
        }
    }
}

