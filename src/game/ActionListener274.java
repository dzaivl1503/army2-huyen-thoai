/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.CharacterUpgradeScreen;
import game.GameCanvas;
import game.IActionListener;

final class ActionListener274
implements IActionListener {
    private CharacterUpgradeScreen I1IIl1Il;

    ActionListener274(CharacterUpgradeScreen characterUpgradeScreen) {
        this.I1IIl1Il = characterUpgradeScreen;
    }

    public final void a() {
        this.I1IIl1Il.a_();
        GameCanvas.var_game_GameHelper10_a.var_boolean_a = false;
    }
}

