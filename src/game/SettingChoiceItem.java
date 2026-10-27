/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package game;

import game.FontRenderer;
import game.SettingItem;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class SettingChoiceItem
extends SettingItem {
    private static Image[] lllIIllI = new Image[2];
    protected int a;
    private int IIII11lIl;

    public SettingChoiceItem(String string, int n, int n2) {
        super(string);
        this.a = n;
        this.IIII11lIl = n2;
    }

    public final void a(Graphics graphics, int n, int n2) {
        FontRenderer.e.a(graphics, super.a + ":", n, n2, 0);
        n2 += 16;
        for (int i = 0; i < this.IIII11lIl; ++i) {
            graphics.drawImage(lllIIllI[i >= this.a ? 1 : 0], n + i * 10, n2, 0);
        }
    }

    public final boolean a(int n, int n2, int n3, int n4) {
        if (super.a(n, n2, n3, n4)) {
            if (n < n3 + 50) {
                this.a(-1);
            } else {
                this.a(1);
            }
            this.a();
            return true;
        }
        return false;
    }

    public final boolean a(int n) {
        int n2 = this.a;
        this.a += n;
        if (this.a < 0) {
            this.a = 0;
        }
        if (this.a > this.IIII11lIl) {
            this.a = this.IIII11lIl;
        }
        return this.a != n2;
    }

    static {
        try {
            SettingChoiceItem.lllIIllI[0] = Image.createImage((String)"/tick0.png");
            SettingChoiceItem.lllIIllI[1] = Image.createImage((String)"/tick1.png");
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

