/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;

public final class GameHelper14 {
    private String var_java_lang_String_I1IIl1II1l;
    private ItemTemplate var_game_ItemTemplate_I1IIl1II1l;
    private int var_int_I1IIl1II1l;
    private int lI1Il1Ill1;
    private int llIl11Il = 0;
    public boolean a;

    public GameHelper14(String string, ItemTemplate itemTemplate) {
        this.var_java_lang_String_I1IIl1II1l = string;
        this.var_game_ItemTemplate_I1IIl1II1l = itemTemplate;
        this.var_int_I1IIl1II1l = GameCanvas.var_int_b / 2;
        this.lI1Il1Ill1 = GameCanvas.var_int_c - 50;
    }

    public final void a(Graphics graphics) {
        if (this.a) {
            if (this.var_game_ItemTemplate_I1IIl1II1l == null) {
                FontRenderer.e.a(graphics, this.var_java_lang_String_I1IIl1II1l, this.var_int_I1IIl1II1l + GameHelper16.b, this.lI1Il1Ill1 + GameHelper16.c, 3);
            }
            if (this.var_game_ItemTemplate_I1IIl1II1l != null) {
                FontRenderer.e.a(graphics, this.var_java_lang_String_I1IIl1II1l, this.var_int_I1IIl1II1l + GameHelper16.b, this.lI1Il1Ill1 + GameHelper16.c, 3);
                int n = GameCanvas.var_int_b / 2 + GameHelper16.b;
                int n2 = this.lI1Il1Ill1 + GameHelper16.c + 17;
                graphics.setColor(4156571);
                graphics.fillRoundRect(n - 2, n2 - 2, 20, 20, 4, 4);
                graphics.setColor(16774532);
                graphics.fillRect(n - 1, n2 - 1, 18, 18);
                this.var_game_ItemTemplate_I1IIl1II1l.a(graphics, n, n2);
            }
        }
    }

    public final void a() {
        if (this.a) {
            ++this.llIl11Il;
            this.lI1Il1Ill1 -= 2;
            if (this.llIl11Il == 80) {
                this.llIl11Il = 0;
                BattleScreen.var_game_BattleScreen_a.var_java_util_Vector_c.removeElement(this);
            }
        }
    }
}

