/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener249
implements IActionListener {
    private final InventoryScreen II1IlIlI;

    ActionListener249(InventoryScreen inventoryScreen) {
        this.II1IlIlI = inventoryScreen;
    }

    public final void a() {
        if (this.II1IlIlI.var_boolean_b) {
            return;
        }
        if (this.II1IlIlI.var_java_util_Vector_a.isEmpty()) {
            return;
        }
        final ItemTemplate itemTemplate = this.II1IlIlI.game_ItemTemplate_a();
        if (itemTemplate == null) {
            return;
        }
        if (itemTemplate.var_boolean_c) {
            itemTemplate.var_boolean_c = false;
            itemTemplate.var_int_c = 0;
            this.II1IlIlI.c = 0;
            return;
        }
        if (itemTemplate.var_int_b > 1) {
            GameCanvas.var_game_InputScreen_a.a("Nh\u1eadp s\u1ed1 l\u01b0\u1ee3ng (Max " + itemTemplate.var_int_b + "):", new IActionListener() {
                public final void a() {
                    int qty = 1;
                    try {
                        String text = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
                        qty = Integer.parseInt(text);
                    } catch (Exception ignored) {
                    }
                    if (qty <= 0) {
                        qty = 1;
                    }
                    if (qty > itemTemplate.var_int_b) {
                        qty = itemTemplate.var_int_b;
                    }
                    itemTemplate.var_int_c = qty;
                    itemTemplate.var_boolean_c = true;
                    ActionListener249.this.II1IlIlI.c = qty;
                    GameCanvas.var_game_GameHelper21_a = null;
                }
            }, new IActionListener() {
                public final void a() {
                    GameCanvas.var_game_GameHelper21_a = null;
                }
            }, 1);
            GameCanvas.var_game_InputScreen_a.a.a(String.valueOf(itemTemplate.var_int_b));
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
        } else {
            itemTemplate.var_int_c = 1;
            itemTemplate.var_boolean_c = true;
            this.II1IlIlI.c = 1;
        }
    }
}


