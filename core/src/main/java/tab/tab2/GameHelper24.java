/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab2;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper24
extends GameHelper21 {
    private EquipUpgradeEntry var_game_EquipUpgradeEntry_ll1II1IIlI;
    private int var_int_ll1II1IIlI = 0;
    private int l1II1IllI = 0;
    private int IlIl1llIl = 0;
    private int I111lI1I = 0;
    private boolean var_boolean_ll1II1IIlI = false;
    private static Image var_javax_microedition_lcdui_Image_ll1II1IIlI;

    public final void a(EquipUpgradeEntry equipUpgradeEntry) {
        this.var_game_EquipUpgradeEntry_ll1II1IIlI = equipUpgradeEntry;
        this.var_int_ll1II1IIlI = 0;
        this.b = new GameCommand("OK", new ActionListener239((byte)0));
    }

    public final void a(Graphics graphics) {
        int n;
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_game_EquipUpgradeEntry_ll1II1IIlI == null || this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_game_ShopItemEntry_a == null) {
            super.a(graphics);
            return;
        }
        ShopItemEntry shopItemEntry = this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_game_ShopItemEntry_a;
        int n2 = GameCanvas.var_int_b - 40;
        if (n2 > 224) {
            n2 = 224;
        }
        int n3 = GameCanvas.var_int_c - BaseScreen.var_int_r - 60;
        int n4 = GameCanvas.var_int_b / 2 - n2 / 2;
        BaseScreen.a(n4, 40, n2, n3, graphics);
        int n5 = GameCanvas.var_int_b / 2;
        int n6 = n4 + 10;
        int n7 = n = n2 - 20;
        ShopItemEntry shopItemEntry2 = shopItemEntry;
        GameHelper24 gameHelper24 = this;
        int n8 = 40 + (shopItemEntry2.var_byte_a * 24 + 6);
        n8 += 4;
        n8 += 17;
        if (shopItemEntry2.var_boolean_a) {
            n8 += 99;
            if (gameHelper24.var_game_EquipUpgradeEntry_ll1II1IIlI != null && gameHelper24.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b != null && gameHelper24.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b.length > 0) {
                n8 += 4;
                n8 += 19;
                for (int i = 0; i < gameHelper24.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b.length; ++i) {
                    String rawStr = gameHelper24.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b[i];
                    if (rawStr == null || rawStr.length() <= 0) continue;
                    String[] stringArray = gameHelper24.lIIllI1l1I1(rawStr, FontRenderer.a, n7 - 12 - 10);
                    int n9 = stringArray.length * 15 + 12;
                    n8 += n9 + 4;
                }
                n8 += 2;
            }
        } else {
            n8 += 32;
        }
        int n10 = n8;
        this.l1II1IllI = Math.max(0, n10 - (n3 -= 12));
        graphics.setClip(n4 + 4, 46, n2 - 8, n3);
        graphics.translate(0, -this.var_int_ll1II1IIlI);
        String string = shopItemEntry.var_java_lang_String_a + " C\u1ea5p " + shopItemEntry.var_int_b;
        n3 = FontRenderer.b.a(string) + 16;
        graphics.setColor(3832504);
        graphics.fillRoundRect(n5 - n3 / 2, 44, n3, 20, 4, 4);
        FontRenderer.b.a(graphics, string, n5, 46, 2);
        if (var_javax_microedition_lcdui_Image_ll1II1IIlI != null) {
            int n11 = var_javax_microedition_lcdui_Image_ll1II1IIlI.getWidth();
            n3 = shopItemEntry.c * n11 + (shopItemEntry.c - 1 << 1);
            n3 = n5 - n3 / 2;
            for (n4 = 0; n4 < shopItemEntry.c; ++n4) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_ll1II1IIlI, n3 + n4 * (n11 + 2), 66, 0);
            }
        }
        int n12 = this.lIIllI1l1I1(graphics, shopItemEntry, n6, 86, n);
        GameHelper24.void_lIIllI1l1I1(graphics, n6, n12, n);
        FontRenderer.a.a(graphics, StringUtils.V() + ":", n5, n12 += 4, 2);
        n12 += 17;
        if (shopItemEntry.var_boolean_a) {
            n12 = this.int_lIIllI1l1I1(graphics, n6, n12, n);
            if (this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b != null && this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b.length > 0) {
                GameHelper24.void_lIIllI1l1I1(graphics, n6, n12, n);
                FontRenderer.a.a(graphics, "M\u00f4 t\u1ea3:", n5, n12 += 4, 2);
                this.I1lII1Il(graphics, n6, n12 += 19, n);
            }
        } else {
            graphics.setColor(0x666666);
            FontRenderer.d.a(graphics, "C\u1ea7n thu th\u1eadp \u0111\u1ee7 b\u1ed9 s\u01b0u t\u1eadp", n5, n12, 2);
            FontRenderer.d.a(graphics, "\u0111\u1ec3 k\u00edch ho\u1ea1t ch\u1ec9 s\u1ed1 k\u00edch \u1ea9n", n5, n12 += 15, 2);
        }
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        graphics.translate(0, -graphics.getTranslateY());
        super.a(graphics);
    }

    private int lIIllI1l1I1(Graphics graphics, ShopItemEntry shopItemEntry, int n, int n2, int n3) {
        n2 = 86;
        for (int i = 0; i < shopItemEntry.var_byte_a && i < this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_a.length; ++i) {
            ItemTemplate itemTemplate;
            String string = this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_a[i];
            if (string == null) {
                string = "Unknown";
            }
            boolean bl = shopItemEntry.var_boolean_arr_a[i];
            graphics.setColor(2378093);
            graphics.fillRoundRect(n - 2, n2, n3 + 4, 22, 3, 3);
            int n4 = n + 2;
            int n5 = n2 + 1;
            if (bl) {
                graphics.setColor(0x90EE90);
                graphics.fillRoundRect(n4, n5, 20, 20, 3, 3);
                graphics.setColor(3329330);
                graphics.drawRoundRect(n4, n5, 19, 19, 3, 3);
            } else {
                graphics.setColor(0xFF9999);
                graphics.fillRoundRect(n4, n5, 20, 20, 3, 3);
                graphics.setColor(0xCC0000);
                graphics.drawRoundRect(n4, n5, 19, 19, 3, 3);
            }
            if (shopItemEntry.var_short_arr_a[i] >= 0 && (itemTemplate = EquipSlotSet.a((byte)0, (byte)1, shopItemEntry.var_short_arr_a[i])) != null) {
                itemTemplate.a(graphics, n4 + 2, n5 + 2);
            }
            int n6 = n4 + 20 + 4;
            graphics.setColor(0);
            FontRenderer.b.a(graphics, string, n6, n2 + 3, 0);
            if (bl) {
                if (var_javax_microedition_lcdui_Image_ll1II1IIlI != null) {
                    int n7 = var_javax_microedition_lcdui_Image_ll1II1IIlI.getWidth();
                    byte by = shopItemEntry.var_byte_arr_a[i];
                    n4 = by * n7 + (by - 1 << 1);
                    n5 = n + n3;
                    n4 = n5 - n4 - 4;
                    for (n5 = 0; n5 < by; ++n5) {
                        graphics.drawImage(var_javax_microedition_lcdui_Image_ll1II1IIlI, n4 + n5 * (n7 + 2), n2 + 3, 0);
                    }
                }
            } else {
                int n8 = n + n3 - 4;
                FontRenderer.d.a(graphics, "Ch\u01b0a s\u1edf h\u1eefu", n8, n2 + 3, 1);
            }
            n2 += 24;
        }
        return n2 + 6;
    }

    private int int_lIIllI1l1I1(Graphics graphics, int n, int n2, int n3) {
        int n4 = n + 2;
        int n5 = n + 20;
        int n6 = n + 90;
        int n7 = n + n3 - 4;
        String[] stringArray = new String[]{StringUtils.as(), StringUtils.at(), StringUtils.au(), StringUtils.av(), StringUtils.aw()};
        for (int i = 0; i < 5; ++i) {
            short s;
            graphics.setColor(2378093);
            graphics.fillRoundRect(n - 2, n2, n3 + 4, 17, 3, 3);
            DataUtils.a(graphics, CharacterUpgradeScreen.var_javax_microedition_lcdui_Image_a, 0, i << 4, 16, 16, 0, n4, n2, 0);
            FontRenderer.b.a(graphics, stringArray[i], n5, n2 + 1, 0);
            if (this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_short_arr_a != null && i < this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_short_arr_a.length) {
                s = this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_short_arr_a[i];
                if (s == 0) {
                    FontRenderer.d.a(graphics, "+0", n6, n2 + 1, 0);
                } else {
                    FontRenderer.c.a(graphics, "+" + s, n6, n2 + 1, 0);
                }
            }
            if (this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_short_arr_b != null && i < this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_short_arr_b.length) {
                s = this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_short_arr_b[i];
                if (s == 0) {
                    FontRenderer.d.a(graphics, "+0%", n7, n2 + 1, 1);
                } else {
                    FontRenderer.c.a(graphics, "+" + s + "%", n7, n2 + 1, 1);
                }
            }
            n2 += 19;
        }
        return n2 + 4;
    }

    private int I1lII1Il(Graphics graphics, int n, int n2, int n3) {
        for (int i = 0; i < this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b.length; ++i) {
            String rawStr = this.var_game_EquipUpgradeEntry_ll1II1IIlI.var_java_lang_String_arr_b[i];
            if (rawStr == null || rawStr.length() <= 0) continue;
            String[] stringArray = this.lIIllI1l1I1(rawStr, FontRenderer.a, n3 - 12 - 10);
            int n4 = stringArray.length * 15 + 12;
            graphics.setColor(16775393);
            graphics.fillRoundRect(n - 2, n2, n3 + 4, n4, 3, 3);
            graphics.setColor(16758605);
            graphics.drawRoundRect(n - 2, n2, n3 + 3, n4 - 1, 3, 3);
            int n5 = n2 + 6;
            graphics.setColor(16750592);
            graphics.fillRect(n + 4, n5 + 5, 3, 3);
            for (int j = 0; j < stringArray.length; ++j) {
                graphics.setColor(5125166);
                FontRenderer.a.a(graphics, stringArray[j], n + 12, n5, 0);
                n5 += 15;
            }
            n2 += n4 + 2;
        }
        return n2 + 2;
    }

    private static void void_lIIllI1l1I1(Graphics graphics, int n, int n2, int n3) {
        graphics.setColor(0xDDDDDD);
        graphics.drawLine(n + 10, n2, n + n3 - 10, n2);
    }

    private String[] lIIllI1l1I1(String text, FontRenderer fontRenderer, int n) {
        int n2;
        if (text == null || text.length() == 0) {
            return new String[]{""};
        }
        if (fontRenderer.a(text) <= n) {
            return new String[]{text};
        }
        int n4 = 1;
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) != ' ') continue;
            ++n4;
        }
        String[] words = new String[n4];
        n4 = 0;
        int n5 = 0;
        for (n2 = 0; n2 < text.length(); ++n2) {
            if (text.charAt(n2) != ' ') continue;
            words[n4++] = text.substring(n5, n2);
            n5 = n2 + 1;
        }
        words[n4] = text.substring(n5);
        String[] stringArray2 = words;
        n4 = 0;
        String[] stringArray3 = new String[10];
        String string = "";
        for (n2 = 0; n2 < stringArray2.length; ++n2) {
            String string2;
            String string3 = string2 = string.length() == 0 ? stringArray2[n2] : string + " " + stringArray2[n2];
            if (fontRenderer.a(string2) <= n) {
                string = string2;
                continue;
            }
            if (string.length() > 0) {
                stringArray3[n4++] = string;
            }
            string = stringArray2[n2];
        }
        if (string.length() > 0) {
            stringArray3[n4++] = string;
        }
        String[] stringArray4 = new String[n4];
        for (int i = 0; i < n4; ++i) {
            stringArray4[i] = stringArray3[i];
        }
        return stringArray4;
    }

    public final void void_a() {
        super.void_a();
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            this.var_int_ll1II1IIlI -= 16;
            if (this.var_int_ll1II1IIlI < 0) {
                this.var_int_ll1II1IIlI = 0;
            }
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            this.var_int_ll1II1IIlI += 16;
            if (this.var_int_ll1II1IIlI > this.l1II1IllI) {
                this.var_int_ll1II1IIlI = this.l1II1IllI;
            }
        }
        if (GameCanvas.var_boolean_d) {
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_ll1II1IIlI) {
                    this.IlIl1llIl = GameCanvas.g;
                    this.I111lI1I = this.var_int_ll1II1IIlI;
                    this.var_boolean_ll1II1IIlI = true;
                }
                this.var_int_ll1II1IIlI = this.I111lI1I + (this.IlIl1llIl - GameCanvas.g);
                if (this.var_int_ll1II1IIlI < 0) {
                    this.var_int_ll1II1IIlI = 0;
                }
                if (this.var_int_ll1II1IIlI > this.l1II1IllI) {
                    this.var_int_ll1II1IIlI = this.l1II1IllI;
                    return;
                }
            } else {
                this.var_boolean_ll1II1IIlI = false;
            }
        }
    }

    static {
        try {
            var_javax_microedition_lcdui_Image_ll1II1IIlI = Image.createImage((String)"/effect/star.png");
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

