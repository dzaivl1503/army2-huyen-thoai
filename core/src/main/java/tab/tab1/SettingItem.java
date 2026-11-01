/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;

public abstract class SettingItem {
    protected String a;

    public SettingItem(String string) {
        this.a = string;
    }

    public abstract void a(Graphics var1, int var2, int var3);

    public abstract boolean a(int var1);

    public boolean a(int n, int n2, int n3, int n4) {
        return n >= n3 - 50 && n <= n3 + 150 && n2 >= n4 && n2 < n4 + 35;
    }

    public abstract void a();
}

