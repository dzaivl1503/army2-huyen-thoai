/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.IActionListener;
import game.PlayerEntity;

final class ActionListener136
implements IActionListener {
    ActionListener136() {
    }

    public final void a() {
        PlayerEntity.var_boolean_I = !PlayerEntity.var_boolean_I;
        PlayerEntity.b();
    }
}

