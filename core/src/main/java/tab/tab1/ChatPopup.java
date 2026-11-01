/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ChatPopup
extends Point4D {
    private static Image var_javax_microedition_lcdui_Image_ll1I1II1;
    private int var_int_ll1I1II1;
    private int I1IlI1llI1I;
    private int IllllIIlI1l1;
    private int I11II11I1Il;
    private int lII11l1lI1;
    private int l1lllI1IlIl;
    private int I1ll1IlIII1 = 60;
    private String[] var_java_lang_String_arr_ll1I1II1;

    public final void a(int n, int n2, int n3, String string) {
        this.var_java_lang_String_arr_ll1I1II1 = FontRenderer.h.a(string, this.I1ll1IlIII1);
        this.l1lllI1IlIl = 10 * this.var_java_lang_String_arr_ll1I1II1.length + 4;
        this.I1IlI1llI1I = n2 - 2;
        this.IllllIIlI1l1 = n3 - 4;
        this.I11II11I1Il = this.I1IlI1llI1I - this.I1ll1IlIII1 / 2;
        this.lII11l1lI1 = this.IllllIIlI1l1 - this.l1lllI1IlIl;
        this.var_int_ll1I1II1 = 90;
        super.b();
    }

    public final void a() {
        if (this.var_int_ll1I1II1 > 0) {
            --this.var_int_ll1I1II1;
            if (this.var_int_ll1I1II1 == 0) {
                GameCanvas.var_java_util_Vector_a.removeElement(this);
            }
        }
    }

    public final void a(Graphics graphics) {
        graphics.setColor(16711553);
        graphics.fillRect(this.I11II11I1Il, this.lII11l1lI1, this.I1ll1IlIII1, this.l1lllI1IlIl);
        graphics.setColor(0);
        graphics.drawRect(this.I11II11I1Il, this.lII11l1lI1, this.I1ll1IlIII1, this.l1lllI1IlIl);
        graphics.drawImage(var_javax_microedition_lcdui_Image_ll1I1II1, this.I1IlI1llI1I, this.IllllIIlI1l1, 0);
        int n = this.lII11l1lI1 + 2;
        for (int i = 0; i < this.var_java_lang_String_arr_ll1I1II1.length; ++i) {
            FontRenderer.i.a(graphics, this.var_java_lang_String_arr_ll1I1II1[i], this.I11II11I1Il + this.I1ll1IlIII1 / 2, n, 2);
            n += 10;
        }
    }

    static {
        var_javax_microedition_lcdui_Image_ll1I1II1 = BattleScreen.var_javax_microedition_lcdui_Image_n;
    }
}

