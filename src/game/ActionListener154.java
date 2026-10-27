/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.PlayerEntity;

final class ActionListener154
implements IActionListener {
    ActionListener154() {
    }

    public final void a() {
        PlayerEntity.var_boolean_J = !PlayerEntity.var_boolean_J;
        PlayerEntity.b();
    }
}

