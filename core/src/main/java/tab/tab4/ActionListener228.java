/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener228
implements IActionListener {
    private GameHelper48 IIIl111l111;

    ActionListener228(GameHelper48 gameHelper48) {
        this.IIIl111l111 = gameHelper48;
    }

    public final void a() {
        if (!this.IIIl111l111.var_boolean_a) {
            this.IIIl111l111.c = true;
            return;
        }
        this.IIIl111l111.var_boolean_a = false;
        this.IIIl111l111.game_ItemTemplate_a().var_int_c = 0;
        this.IIIl111l111.g = this.IIIl111l111.var_game_GameCommand_a;
    }
}

