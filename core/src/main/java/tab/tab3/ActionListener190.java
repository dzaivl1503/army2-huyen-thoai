/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener190
implements IActionListener {
    private GameSetting I1l1Il1I1I;

    ActionListener190(GameSetting gameSetting) {
        this.I1l1Il1I1I = gameSetting;
    }

    public final void a() {
        this.I1l1Il1I1I.var_int_a = 1;
        this.I1l1Il1I1I.var_game_MapEntity_a.var_boolean_a = false;
        this.I1l1Il1I1I.var_game_MapEntity_b.var_boolean_a = true;
        this.I1l1Il1I1I.h = this.I1l1Il1I1I.var_game_MapEntity_b.var_game_GameCommand_a;
        GameCanvas.d();
    }
}

