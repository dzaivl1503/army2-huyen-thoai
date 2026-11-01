/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener071
implements IActionListener {
    private GameSetting lI11IlIlIlI;

    ActionListener071(GameSetting gameSetting) {
        this.lI11IlIlIlI = gameSetting;
    }

    public final void a() {
        GameCanvas.d();
        this.lI11IlIlIlI.var_int_a = 1;
        this.lI11IlIlIlI.var_game_MapEntity_a.var_boolean_a = false;
        this.lI11IlIlIlI.var_game_MapEntity_b.var_boolean_a = true;
        this.lI11IlIlIlI.h = this.lI11IlIlIlI.var_game_MapEntity_b.var_game_GameCommand_a;
    }
}

