/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.ActionListener235;
import game.BaseScreen;
import game.EquipmentLabel;
import game.FontRenderer;
import game.GameCanvas;
import game.GameCommand;
import game.GameHelper21;
import game.GameHelper54;
import game.GameHelper55;
import game.ItemTemplate;
import javax.microedition.lcdui.Graphics;

public final class EquipDurationEntry
extends GameHelper21 {
    private ItemTemplate var_game_ItemTemplate_IlIll1II1I;
    private String var_java_lang_String_IlIll1II1I;
    private String var_java_lang_String_lI11IIIIII;
    private FontRenderer var_game_FontRenderer_IlIll1II1I;
    private int var_int_IlIll1II1I = 0;
    private int var_int_lI11IIIIII = 0;
    private int IlI11Il1l1l = 0;
    private int lllIl1Il = 0;
    private boolean var_boolean_IlIll1II1I = false;
    private final EquipmentLabel var_game_EquipmentLabel_IlIll1II1I = new EquipmentLabel();
    private final GameHelper55 var_game_GameHelper55_IlIll1II1I = new GameHelper55();
    private final GameHelper54 var_game_GameHelper54_IlIll1II1I = new GameHelper54();

    public final void a(ItemTemplate itemTemplate) {
        this.var_game_ItemTemplate_IlIll1II1I = itemTemplate;
        this.var_int_IlIll1II1I = 0;
        if (itemTemplate != null) {
            this.var_java_lang_String_IlIll1II1I = itemTemplate.h > 0 ? itemTemplate.var_java_lang_String_a + " +" + itemTemplate.h : itemTemplate.var_java_lang_String_a;
            int n = itemTemplate.h;
            FontRenderer fontRenderer = n <= 0 ? FontRenderer.a : (n <= 3 ? FontRenderer.b : (this.var_game_FontRenderer_IlIll1II1I = n <= 7 ? FontRenderer.c : FontRenderer.d));
            this.var_java_lang_String_lI11IIIIII = itemTemplate.var_boolean_e ? "V\u0129nh vi\u1ec5n" : (itemTemplate.var_byte_e > 0 ? itemTemplate.var_byte_e + " ng\u00e0y" : "H\u1ebft h\u1ea1n s\u1eed d\u1ee5ng");
            this.var_game_EquipmentLabel_IlIll1II1I.a(itemTemplate, this.var_game_FontRenderer_IlIll1II1I);
            this.var_game_EquipmentLabel_IlIll1II1I.a(this.var_java_lang_String_IlIll1II1I);
            n = itemTemplate.var_int_arr_c != null ? itemTemplate.var_int_arr_c.length : 0;
            this.var_game_GameHelper55_IlIll1II1I.a(itemTemplate, n);
            this.var_game_GameHelper54_IlIll1II1I.a(itemTemplate);
        }
        this.b = new GameCommand("OK", new ActionListener235((byte)0));
    }

    public final void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        if (this.var_game_ItemTemplate_IlIll1II1I == null) {
            super.a(graphics);
            return;
        }
        int n = this.var_game_GameHelper55_IlIll1II1I.int_a();
        int n2 = 14 + this.var_game_EquipmentLabel_IlIll1II1I.b();
        if (this.var_game_ItemTemplate_IlIll1II1I.var_java_lang_String_c != null && this.var_game_ItemTemplate_IlIll1II1I.var_java_lang_String_c.length() > 0) {
            n2 += 16;
        }
        n2 += 18;
        n2 += n + 6;
        EquipDurationEntry equipDurationEntry = this;
        n2 += equipDurationEntry.var_game_GameHelper54_IlIll1II1I.a();
        n2 += 20;
        int n3 = this.var_game_GameHelper55_IlIll1II1I.int_b();
        int n4 = GameCanvas.var_int_b / 2 - n3 / 2;
        int n5 = GameCanvas.var_int_c / 2 - n2 / 2 - 10;
        BaseScreen.a(n4, n5, n3, n2, graphics);
        int n6 = n4 + 14;
        int n7 = n5 + 14;
        int n8 = n3 - 28;
        int n9 = GameCanvas.var_int_b / 2;
        this.var_game_EquipmentLabel_IlIll1II1I.a(graphics, n9 - this.var_game_EquipmentLabel_IlIll1II1I.a() / 2, n7);
        n7 += this.var_game_EquipmentLabel_IlIll1II1I.b();
        if (this.var_game_ItemTemplate_IlIll1II1I.var_java_lang_String_c != null && this.var_game_ItemTemplate_IlIll1II1I.var_java_lang_String_c.length() > 0) {
            FontRenderer.a.a(graphics, this.var_game_ItemTemplate_IlIll1II1I.var_java_lang_String_c, n9, n7, 2);
            n7 += 16;
        }
        String string = "H\u1ea1n s\u1eed d\u1ee5ng: ";
        int n10 = FontRenderer.a.a(string);
        int n11 = FontRenderer.a.a(this.var_java_lang_String_lI11IIIIII);
        n11 = n10 + n11;
        n11 = n9 - n11 / 2;
        FontRenderer.a.a(graphics, string, n11, n7, 0);
        int n12 = n11 + n10;
        if (this.var_game_ItemTemplate_IlIll1II1I.var_boolean_e) {
            FontRenderer.a.a(graphics, this.var_java_lang_String_lI11IIIIII, n12, n7, 0);
        } else if (this.var_game_ItemTemplate_IlIll1II1I.var_byte_e > 0) {
            FontRenderer.c.a(graphics, this.var_java_lang_String_lI11IIIIII, n12, n7, 0);
        } else {
            FontRenderer.d.a(graphics, this.var_java_lang_String_lI11IIIIII, n12, n7, 0);
        }
        this.var_game_GameHelper55_IlIll1II1I.a(graphics, n9, n7 += 18);
        n7 += n + 6;
        n = n7;
        n2 = n2 - (n7 - n5) - 20;
        EquipDurationEntry equipDurationEntry2 = this;
        this.var_int_lI11IIIIII = Math.max(0, equipDurationEntry2.var_game_GameHelper54_IlIll1II1I.a() - n2);
        graphics.setClip(n4 + 8, n, n3 - 16, n2);
        this.var_game_GameHelper54_IlIll1II1I.a(n8);
        this.var_game_GameHelper54_IlIll1II1I.a(graphics, n6, n, this.var_int_IlIll1II1I, n2);
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        super.a(graphics);
    }

    public final void void_a() {
        super.void_a();
        this.var_game_GameHelper55_IlIll1II1I.void_b();
        if (GameCanvas.var_boolean_arr_a[2]) {
            GameCanvas.var_boolean_arr_a[2] = false;
            this.var_int_IlIll1II1I -= 16;
            if (this.var_int_IlIll1II1I < 0) {
                this.var_int_IlIll1II1I = 0;
            }
        }
        if (GameCanvas.var_boolean_arr_a[8]) {
            GameCanvas.var_boolean_arr_a[8] = false;
            this.var_int_IlIll1II1I += 16;
            if (this.var_int_IlIll1II1I > this.var_int_lI11IIIIII) {
                this.var_int_IlIll1II1I = this.var_int_lI11IIIIII;
            }
        }
        if (GameCanvas.var_boolean_d) {
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_IlIll1II1I) {
                    this.IlI11Il1l1l = GameCanvas.g;
                    this.lllIl1Il = this.var_int_IlIll1II1I;
                    this.var_boolean_IlIll1II1I = true;
                }
                this.var_int_IlIll1II1I = this.lllIl1Il + (this.IlI11Il1l1l - GameCanvas.g);
                if (this.var_int_IlIll1II1I < 0) {
                    this.var_int_IlIll1II1I = 0;
                }
                if (this.var_int_IlIll1II1I > this.var_int_lI11IIIIII) {
                    this.var_int_IlIll1II1I = this.var_int_lI11IIIIII;
                    return;
                }
            } else {
                this.var_boolean_IlIll1II1I = false;
            }
        }
    }
}

