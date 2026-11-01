/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import javax.microedition.lcdui.Graphics;

public final class EquipmentLabel {
    private ItemTemplate var_game_ItemTemplate_IIIlII1ll1lI;
    private String var_java_lang_String_IIIlII1ll1lI;
    private FontRenderer var_game_FontRenderer_IIIlII1ll1lI;

    public final void a(ItemTemplate itemTemplate, FontRenderer fontRenderer) {
        this.var_game_ItemTemplate_IIIlII1ll1lI = itemTemplate;
        this.var_game_FontRenderer_IIIlII1ll1lI = fontRenderer;
        if (itemTemplate != null) {
            this.var_java_lang_String_IIIlII1ll1lI = itemTemplate.var_java_lang_String_a;
        }
    }

    public final void a(String string) {
        this.var_java_lang_String_IIIlII1ll1lI = string;
    }

    public final int a() {
        if (this.var_java_lang_String_IIIlII1ll1lI == null || this.var_game_FontRenderer_IIIlII1ll1lI == null) {
            return 16;
        }
        return Math.max(16, this.var_game_FontRenderer_IIIlII1ll1lI.a(this.var_java_lang_String_IIIlII1ll1lI));
    }

    public final int b() {
        int n = 16;
        if (this.var_java_lang_String_IIIlII1ll1lI != null && this.var_game_FontRenderer_IIIlII1ll1lI != null) {
            n = 16 + (4 + this.var_game_FontRenderer_IIIlII1ll1lI.a());
        }
        return n;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.var_game_ItemTemplate_IIIlII1ll1lI == null) {
            return;
        }
        int n3 = this.a();
        int n4 = n + (n3 - 16) / 2;
        this.var_game_ItemTemplate_IIIlII1ll1lI.a(graphics, n4, n2);
        if (this.var_java_lang_String_IIIlII1ll1lI != null && this.var_game_FontRenderer_IIIlII1ll1lI != null) {
            n4 = this.var_game_FontRenderer_IIIlII1ll1lI.a(this.var_java_lang_String_IIIlII1ll1lI);
            n2 = n2 + 16 + 4;
            this.var_game_FontRenderer_IIIlII1ll1lI.a(graphics, this.var_java_lang_String_IIIlII1ll1lI, n += (n3 - n4) / 2, n2, 0);
        }
    }
}

