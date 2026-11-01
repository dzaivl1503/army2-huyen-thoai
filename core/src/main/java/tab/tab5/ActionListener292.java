/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener292
implements IActionListener {
    private InventoryScreen IIlllIIl1I;

    ActionListener292(InventoryScreen inventoryScreen) {
        this.IIlllIIl1I = inventoryScreen;
    }

    public final void a() {
        if (this.IIlllIIl1I.var_java_util_Vector_a.size() != 0) {
            int n;
            this.IIlllIIl1I.var_boolean_a = false;
            for (int i = 0; i < this.IIlllIIl1I.var_java_util_Vector_a.size(); ++i) {
                if (!((ItemTemplate)this.IIlllIIl1I.var_java_util_Vector_a.elementAt((int)i)).var_boolean_c) continue;
                ++this.IIlllIIl1I.var_int_a;
            }
            int[] nArray = new int[this.IIlllIIl1I.var_int_a];
            byte[] byArray = new byte[this.IIlllIIl1I.var_int_a];
            int n2 = 0;
            for (n = 0; n < this.IIlllIIl1I.var_java_util_Vector_a.size(); ++n) {
                ItemTemplate itemTemplate = (ItemTemplate)this.IIlllIIl1I.var_java_util_Vector_a.elementAt(n);
                if (!itemTemplate.var_boolean_c) continue;
                if (itemTemplate.var_boolean_d) {
                    this.IIlllIIl1I.var_boolean_a = true;
                    nArray[n2] = itemTemplate.var_short_a;
                } else {
                    nArray[n2] = itemTemplate.var_int_a;
                }
                byArray[n2] = (byte)itemTemplate.var_int_c;
                ++n2;
                itemTemplate.var_boolean_c = false;
            }
            if (this.IIlllIIl1I.var_boolean_a) {
                ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)0, (byte)this.IIlllIIl1I.var_int_a, nArray, byArray);
            } else {
                for (n = 0; n < nArray.length; ++n) {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)1, nArray, (short)-1, (byte)-1);
                }
            }
            this.IIlllIIl1I.var_int_a = 0;
        }
    }
}

