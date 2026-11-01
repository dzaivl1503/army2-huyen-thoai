/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab2;

import javax.microedition.lcdui.Graphics;

public abstract class SettingToggleItem
extends SettingBooleanItem {
    public SettingToggleItem(String string, boolean bl) {
        super(string, bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        FontRenderer.e.a(graphics, this.a + ":", n, n2, 0);
        FontRenderer.e.a(graphics, this.a ? StringUtils.dj() : StringUtils.dk(), GameCanvas.var_int_d, n2 + 16, 2);
    }
}

