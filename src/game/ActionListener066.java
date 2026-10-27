/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener202;
import game.DataUtils;
import game.GameCanvas;
import game.IActionListener;
import game.ItemEffect;
import game.StringUtils;

final class ActionListener066
implements IActionListener {
    final ItemEffect a;

    ActionListener066(ItemEffect itemEffect) {
        this.a = itemEffect;
    }

    public final void a() {
        GameCanvas.b(StringUtils.t() + DataUtils.a((long)this.a.var_game_ItemTemplate_a.var_int_e) + " " + StringUtils.aq(), new ActionListener202(this));
    }
}

