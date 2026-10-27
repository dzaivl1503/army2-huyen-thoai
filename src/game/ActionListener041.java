/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.PlayerEntity;

final class ActionListener041
implements IActionListener {
    ActionListener041() {
    }

    public final void a() {
        PlayerEntity.var_boolean_K = !PlayerEntity.var_boolean_K;
        PlayerEntity.b();
    }
}

