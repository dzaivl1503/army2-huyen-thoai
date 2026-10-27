/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.BattleManager;
import game.BattleScreen;
import game.IActionListener;

final class ActionListener119
implements IActionListener {
    private BattleScreen lIllIllllII;

    ActionListener119(BattleScreen battleScreen) {
        this.lIllIllllII = battleScreen;
    }

    public final void a() {
        if (BattleManager.boolean_a()) {
            BattleScreen.void_a(this.lIllIllllII);
        }
    }
}

