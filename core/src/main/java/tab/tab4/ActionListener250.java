/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;

import java.util.Vector;

final class ActionListener250
implements IActionListener {
    final InventoryScreen a;

    ActionListener250(InventoryScreen inventoryScreen) {
        this.a = inventoryScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(this.a.var_game_GameCommand_a);
        vector.addElement(new GameCommand(StringUtils.ax(), new ActionListener295(this)));
        ItemTemplate itemTemplate = this.a.game_ItemTemplate_a();
        if (itemTemplate != null && !itemTemplate.var_boolean_d) {
            vector.addElement(new GameCommand("\u0110\u1ee5c l\u1ed7", new ActionListener266(this)));
            if (itemTemplate.var_byte_d == 0) {
                vector.addElement(new GameCommand("N\u00e2ng c\u1ea5p", new ActionListener267(this.a)));
            }
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

