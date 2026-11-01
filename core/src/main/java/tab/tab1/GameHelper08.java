/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package tab.tab1;

import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class GameHelper08 {
    private Vector IlI1lIIII1I = new Vector();

    public final void a(EquipItemEntry equipItemEntry) {
        if (this.IlI1lIIII1I.size() < 20) {
            this.IlI1lIIII1I.addElement(equipItemEntry);
            return;
        }
        this.IlI1lIIII1I.removeElementAt(19);
        this.IlI1lIIII1I.insertElementAt(equipItemEntry, 0);
    }

    public final boolean boolean_a(int n) {
        if (this.IlI1lIIII1I.size() == 0) {
            return false;
        }
        for (int i = 0; i < this.IlI1lIIII1I.size(); ++i) {
            if (((EquipItemEntry)this.IlI1lIIII1I.elementAt((int)i)).var_short_a != n) continue;
            return true;
        }
        return false;
    }

    public final Image javax_microedition_lcdui_Image_a(int n) {
        for (int i = 0; i < this.IlI1lIIII1I.size(); ++i) {
            EquipItemEntry equipItemEntry = (EquipItemEntry)this.IlI1lIIII1I.elementAt(i);
            if (equipItemEntry.var_short_a != n) continue;
            return equipItemEntry.var_javax_microedition_lcdui_Image_a;
        }
        return null;
    }
}

