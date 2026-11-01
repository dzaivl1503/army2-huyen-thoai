/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class FloatingTextManager {
    private Hashtable var_java_util_Hashtable_l111lIlI1lIl = new Hashtable();
    private Vector var_java_util_Vector_l111lIlI1lIl = new Vector();

    public final void a(short s, String string, int n, int n2, boolean bl) {
        FloatingTextEntry floatingTextEntry = (FloatingTextEntry)this.var_java_util_Hashtable_l111lIlI1lIl.get(string);
        if (floatingTextEntry == null) {
            floatingTextEntry = new FloatingTextEntry(s, string, n, n2, bl);
            this.var_java_util_Hashtable_l111lIlI1lIl.put(string, floatingTextEntry);
            this.var_java_util_Vector_l111lIlI1lIl.addElement(floatingTextEntry);
            return;
        }
        floatingTextEntry.a(s);
        floatingTextEntry.a(n, n2);
        floatingTextEntry.a(bl);
    }

    public final void a() {
        Enumeration enumeration = this.var_java_util_Hashtable_l111lIlI1lIl.elements();
        while (enumeration.hasMoreElements()) {
            FloatingTextEntry floatingTextEntry = (FloatingTextEntry)enumeration.nextElement();
            floatingTextEntry.a();
        }
        this.var_java_util_Vector_l111lIlI1lIl.removeAllElements();
        this.var_java_util_Hashtable_l111lIlI1lIl.clear();
    }

    public final void b() {
        for (int i = 0; i < this.var_java_util_Vector_l111lIlI1lIl.size(); ++i) {
            FloatingTextEntry floatingTextEntry = (FloatingTextEntry)this.var_java_util_Vector_l111lIlI1lIl.elementAt(i);
            floatingTextEntry.b();
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        for (int i = 0; i < this.var_java_util_Vector_l111lIlI1lIl.size(); ++i) {
            FloatingTextEntry floatingTextEntry = (FloatingTextEntry)this.var_java_util_Vector_l111lIlI1lIl.elementAt(i);
            floatingTextEntry.a(graphics, n, n2, n3);
        }
    }
}

