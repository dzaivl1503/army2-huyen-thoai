/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab3;

import javax.microedition.lcdui.Graphics;

public abstract class GameHelper39
extends SettingItem {
    protected int a;
    private String[] lIIIIIl1l;

    public GameHelper39(String string, int n, String[] stringArray) {
        super(string);
        this.a = n;
        this.lIIIIIl1l = stringArray;
    }

    public final void a(Graphics graphics, int n, int n2) {
        FontRenderer.e.a(graphics, super.a + ":", n, n2, 0);
        FontRenderer.e.a(graphics, this.lIIIIIl1l[this.a], GameCanvas.var_int_d, n2 + 16, 2);
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
        this.a += n;
        if (this.a < 0) {
            this.a = this.lIIIIIl1l.length - 1;
        }
        if (this.a >= this.lIIIIIl1l.length) {
            this.a = 0;
        }
        return true;
    }
}

