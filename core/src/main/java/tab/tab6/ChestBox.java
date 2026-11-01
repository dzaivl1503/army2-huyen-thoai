/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ChestBox {
    public int var_int_a;
    public String var_java_lang_String_a;
    public Image var_javax_microedition_lcdui_Image_a;
    public int var_int_b;
    public int c = -1;
    private int l1Ill1l11I = 0;
    private int lIIll111lIlI = DataUtils.b(0, 5);
    public boolean var_boolean_a = false;
    public boolean var_boolean_b = false;
    private boolean I1I1l111I = false;
    private int[] I11lI1lI111 = new int[]{-2, 2, -2, 2, -2, 2, 0, 0, 0, 0};
    private int lIll1lI1;
    private int IllI1l1I1I1;

    public final void a(Graphics graphics, int n, int n2) {
        this.lIll1lI1 = n;
        this.IllI1l1I1I1 = n2;
        if (this.I1I1l111I) {
            if (this.var_int_b == 0 || this.var_int_b == 1) {
                FontRenderer.e.a(graphics, this.var_java_lang_String_a, n, n2, 3);
            }
            if (this.var_int_b == 3) {
                GameHelper31.a(graphics, this.c, n - 8, n2 - 8);
                FontRenderer.e.a(graphics, this.var_java_lang_String_a, n + 8, n2 + 6, 3);
            }
            if (this.var_int_b == 2 && this.var_javax_microedition_lcdui_Image_a != null) {
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, n, n2, 3);
                FontRenderer.e.a(graphics, this.var_java_lang_String_a, n + 8, n2 + 6, 3);
                return;
            }
        } else {
            graphics.drawImage(PopupDialog.var_javax_microedition_lcdui_Image_a, n + this.I11lI1lI111[this.lIIll111lIlI], n2, 3);
        }
    }

    public final void a() {
        if (this.var_boolean_a) {
            ++this.l1Ill1l11I;
            ++this.lIIll111lIlI;
            if (this.lIIll111lIlI == this.I11lI1lI111.length) {
                this.lIIll111lIlI = 0;
            }
            if (this.var_int_b != 2) {
                if (this.l1Ill1l11I > 15 && this.var_boolean_b) {
                    this.var_boolean_a = false;
                    this.I1I1l111I = true;
                    this.var_boolean_b = false;
                    new ChatScreen(this.lIll1lI1, this.IllI1l1I1I1 + 6, 1);
                    return;
                }
            } else if (this.l1Ill1l11I > 15 && this.var_javax_microedition_lcdui_Image_a != null && this.var_boolean_b) {
                this.var_boolean_a = false;
                this.I1I1l111I = true;
                this.var_boolean_b = false;
                new ChatScreen(this.lIll1lI1, this.IllI1l1I1I1 + 6, 1);
            }
        }
    }
}

