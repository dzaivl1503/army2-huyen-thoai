/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.InventoryScreen;
import game.ItemTemplate;

final class ActionListener249
implements IActionListener {
    private final InventoryScreen II1IlIlI;

    ActionListener249(InventoryScreen inventoryScreen) {
        this.II1IlIlI = inventoryScreen;
    }

    public final void a() {
        boolean bl;
        ItemTemplate itemTemplate;
        if (this.II1IlIlI.var_boolean_b) {
            return;
        }
        if (this.II1IlIlI.var_java_util_Vector_a.isEmpty()) {
            return;
        }
        ItemTemplate itemTemplate2 = this.II1IlIlI.game_ItemTemplate_a();
        if (itemTemplate2 == null) {
            return;
        }
        itemTemplate2.var_int_c = 1;
        if (itemTemplate2.var_int_b > 1) {
            this.II1IlIlI.var_boolean_b = true;
            this.II1IlIlI.c = 1;
            itemTemplate = itemTemplate2;
            bl = true;
        } else {
            itemTemplate = itemTemplate2;
            bl = !itemTemplate2.var_boolean_c;
        }
        itemTemplate.var_boolean_c = bl;
    }
}

