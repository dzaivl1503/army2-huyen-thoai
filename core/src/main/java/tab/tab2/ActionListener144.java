/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener144
implements IActionListener {
    private GameSetting II1lIIIlIl1l;

    ActionListener144(GameSetting gameSetting) {
        this.II1lIIIlIl1l = gameSetting;
    }

    public final void a() {
        GameCanvas.d();
        this.II1lIIIlIl1l.var_int_a = 1;
        this.II1lIIIlIl1l.var_game_MapEntity_b.a("");
        this.II1lIIIlIl1l.var_game_MapEntity_a.var_boolean_a = false;
        this.II1lIIIlIl1l.var_game_MapEntity_b.var_boolean_a = true;
        this.II1lIIIlIl1l.h = this.II1lIIIlIl1l.var_game_MapEntity_b.var_game_GameCommand_a;
    }
}

