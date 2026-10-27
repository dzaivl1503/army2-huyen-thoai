/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener065;
import game.ActionListener166;
import game.ActionListener199;
import game.ActionListener298;
import game.ExplosionEffect;
import game.GameCanvas;
import game.GameCommand;
import game.IActionListener;
import game.StringUtils;
import java.util.Vector;

final class ActionListener077
implements IActionListener {
    final ExplosionEffect a;

    ActionListener077(ExplosionEffect explosionEffect) {
        this.a = explosionEffect;
    }

    public final void a() {
        if (!(this.a.var_boolean_a || ExplosionEffect.game_GameHelper31_a().var_byte_a != 36 && ExplosionEffect.game_GameHelper31_a().var_byte_a != 37)) {
            GameCanvas.a(StringUtils.r(), new ActionListener166(this), new ActionListener199(this));
        }
        if (!this.a.var_boolean_a) {
            if (!this.a.var_boolean_a && !ExplosionEffect.game_GameHelper31_a().var_boolean_b) {
                ExplosionEffect.game_GameHelper31_a();
                int cfr_ignored_0 = ExplosionEffect.game_GameHelper31_a().g;
                this.a.var_boolean_a = true;
                ExplosionEffect.var_int_a = 99;
                return;
            }
        } else {
            if (ExplosionEffect.game_GameHelper31_a().var_int_a != -1 && ExplosionEffect.game_GameHelper31_a().var_int_b != -1) {
                Vector<GameCommand> vector = new Vector<GameCommand>();
                vector.addElement(new GameCommand(StringUtils.af(), new ActionListener298(this)));
                vector.addElement(new GameCommand(StringUtils.ae(), new ActionListener065(this)));
                GameCanvas.var_game_GameHelper10_a.a(vector, 2);
                return;
            }
            if (ExplosionEffect.game_GameHelper31_a().var_int_a != -1) {
                this.a.a((byte)0, ExplosionEffect.game_GameHelper31_a().var_byte_a, ExplosionEffect.var_int_a);
                return;
            }
            if (ExplosionEffect.game_GameHelper31_a().var_int_b != -1) {
                this.a.a((byte)1, ExplosionEffect.game_GameHelper31_a().var_byte_a, ExplosionEffect.var_int_a);
            }
        }
    }
}

