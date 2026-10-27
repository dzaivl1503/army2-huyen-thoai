/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.BattleScreen;
import game.DataUtils;
import game.GameHelper34;
import game.GameHelper39;
import game.ModAutoForm;

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

