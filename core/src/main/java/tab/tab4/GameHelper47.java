/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class GameHelper47
extends GameHelper39 {
    GameHelper47(ModAutoForm modAutoForm, String string, int n, String[] stringArray) {
        super(string, n, stringArray);
    }

    public final void a() {
        BattleScreen.var_byte_a = (byte)this.a;
        DataUtils.a("graphic", this.a);
        if (BattleScreen.var_byte_a != 2) {
            BattleScreen.var_game_GameHelper34_a.a();
            return;
        }
        GameHelper34.b();
    }
}

