/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener073
implements IActionListener {
    final ItemEffect a;

    ActionListener073(ItemEffect itemEffect) {
        this.a = itemEffect;
    }

    public final void a() {
        GameCanvas.b(StringUtils.t() + DataUtils.a((long)this.a.var_game_ItemTemplate_a.var_int_f) + " " + StringUtils.ar(), new ActionListener056(this));
    }
}

