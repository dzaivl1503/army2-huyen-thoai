/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper29 {
    public int a;
    private int lI11l111I;
    private int I11III111II;
    private Image var_javax_microedition_lcdui_Image_I111lIllIlI;
    private Image[] var_javax_microedition_lcdui_Image_arr_I111lIllIlI;
    private boolean var_boolean_I111lIllIlI;

    public GameHelper29(Image image, int n, int n2) {
        this.var_javax_microedition_lcdui_Image_I111lIllIlI = image;
        this.lI11l111I = n;
        this.I11III111II = n2;
        this.a = image.getHeight() / n2;
        this.var_boolean_I111lIllIlI = false;
    }

    public GameHelper29(Image image, int n) {
        this.var_javax_microedition_lcdui_Image_I111lIllIlI = image;
        this.lI11l111I = image.getWidth();
        this.I11III111II = image.getHeight();
        this.a = n;
        this.var_javax_microedition_lcdui_Image_arr_I111lIllIlI = new Image[this.a];
        this.var_boolean_I111lIllIlI = true;
        n = 360 / n;
        for (int i = 1; i < this.a; ++i) {
            int n2 = i * n;
            if (n2 == 0 || n2 == 90 || n2 == 180 || n2 == 270) continue;
            this.var_javax_microedition_lcdui_Image_arr_I111lIllIlI[i] = GameCanvas.a(image, i * n, null, -1, -1, false);
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_I111lIllIlI, 0, (n4 * n5 + n) * this.var_javax_microedition_lcdui_Image_I111lIllIlI.getWidth(), this.var_javax_microedition_lcdui_Image_I111lIllIlI.getWidth(), this.var_javax_microedition_lcdui_Image_I111lIllIlI.getWidth(), 0, n2, n3, 3);
    }

    public final void a(int n, int n2, int n3, int n4, int n5, Graphics graphics) {
        if (!this.var_boolean_I111lIllIlI) {
            if (n >= 0 && n < this.a) {
                DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_I111lIllIlI, 0, n * this.I11III111II, this.lI11l111I, this.I11III111II, n4, n2, n3, n5);
                return;
            }
        } else if (n >= 0 && n < this.a) {
            int n6 = n * (360 / this.a);
            if (n6 == 0) {
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_I111lIllIlI, n2, n3, 3);
                return;
            }
            if (n6 == 90) {
                DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_I111lIllIlI, 0, 0, this.lI11l111I, this.I11III111II, 5, n2, n3, n5);
                return;
            }
            if (n6 == 270) {
                DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_I111lIllIlI, 0, 0, this.lI11l111I, this.I11III111II, 6, n2, n3, n5);
                return;
            }
            if (n6 == 180) {
                DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_I111lIllIlI, 0, 0, this.lI11l111I, this.I11III111II, 3, n2, n3, n5);
                return;
            }
            DataUtils.a(graphics, this.var_javax_microedition_lcdui_Image_arr_I111lIllIlI[n], 0, 0, this.lI11l111I, this.I11III111II, n4, n2, n3, n5);
        }
    }
}

