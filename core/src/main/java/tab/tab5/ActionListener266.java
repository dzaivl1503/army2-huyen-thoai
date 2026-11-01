/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener266
implements IActionListener {
    private ActionListener250 lI1Il1lIl1;

    ActionListener266(ActionListener250 actionListener250) {
        this.lI1Il1lIl1 = actionListener250;
    }

    public final void a() {
        ItemTemplate itemTemplate = this.lI1Il1lIl1.a.game_ItemTemplate_a();
        if (itemTemplate != null && !itemTemplate.var_boolean_d) {
            GameHelper41.a.a(itemTemplate);
            GameCanvas.var_game_GameHelper21_a = GameHelper41.a;
            ConnectionWatchdog.game_ConnectionWatchdog_a().h(itemTemplate.var_int_a);
        }
    }
}

