/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.EquipSlotSet;
import game.ItemTemplate;
import javax.microedition.lcdui.Graphics;

public final class GameHelper26 {
    private boolean var_boolean_IIII1lI111II;
    private ItemTemplate var_game_ItemTemplate_IIII1lI111II;

    public GameHelper26(short s, boolean bl, byte by) {
        this.var_boolean_IIII1lI111II = bl;
        this.var_game_ItemTemplate_IIII1lI111II = EquipSlotSet.a((byte)0, (byte)1, s);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.var_boolean_IIII1lI111II) {
            graphics.setColor(0x90EE90);
            graphics.fillRoundRect(n, n2, 20, 20, 3, 3);
            graphics.setColor(3329330);
            graphics.drawRoundRect(n, n2, 19, 19, 3, 3);
        } else {
            graphics.setColor(0xFF9999);
            graphics.fillRoundRect(n, n2, 20, 20, 3, 3);
            graphics.setColor(0xCC0000);
            graphics.drawRoundRect(n, n2, 19, 19, 3, 3);
        }
        if (this.var_game_ItemTemplate_IIII1lI111II != null) {
            this.var_game_ItemTemplate_IIII1lI111II.a(graphics, n += 2, n2 += 2);
            return;
        }
        graphics.setColor(0x666666);
        graphics.drawLine(n + 4, n2 + 4, n + 15, n2 + 15);
        graphics.drawLine(n + 15, n2 + 4, n + 4, n2 + 15);
    }
}

