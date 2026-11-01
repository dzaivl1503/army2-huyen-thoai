/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener295
implements IActionListener {
    private ActionListener250 II11llIl1I1l;

    ActionListener295(ActionListener250 actionListener250) {
        this.II11llIl1I1l = actionListener250;
    }

    public final void a() {
        ItemTemplate itemTemplate = this.II11llIl1I1l.a.game_ItemTemplate_a();
        if (!itemTemplate.var_boolean_d) {
            EquipScreen.var_game_EquipDurationEntry_a.a(itemTemplate);
            GameCanvas.var_game_GameHelper21_a = EquipScreen.var_game_EquipDurationEntry_a;
            return;
        }
        if (itemTemplate.var_java_lang_String_b.startsWith(StringUtils.j())) {
            GameCanvas.void_a(StringUtils.ds());
            ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)itemTemplate.var_short_a, (byte)1, (byte)-1);
            return;
        }
        GameCanvas.void_a(itemTemplate.var_java_lang_String_b);
    }
}

