/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import javax.microedition.lcdui.Graphics;

public abstract class SettingBooleanItem
extends SettingItem {
    protected boolean a;

    public SettingBooleanItem(String string, boolean bl) {
        super(string);
        this.a = bl;
    }

    public void a(Graphics graphics, int n, int n2) {
        FontRenderer.e.a(graphics, super.a + ":", n, n2, 0);
        FontRenderer.e.a(graphics, this.a ? StringUtils.cs() : StringUtils.ct(), GameCanvas.var_int_d, n2 + 16, 2);
    }

    public final boolean a(int n, int n2, int n3, int n4) {
        if (super.a(n, n2, n3, n4)) {
            this.a(0);
            this.a();
            return true;
        }
        return false;
    }

    public final boolean a(int n) {
        this.a = !this.a;
        return true;
    }
}

