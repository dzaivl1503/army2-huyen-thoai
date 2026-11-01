/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;

public abstract class Point4D {
    public abstract void a(Graphics var1);

    public abstract void a();

    public void b() {
        GameCanvas.var_java_util_Vector_a.addElement(this);
    }
}

