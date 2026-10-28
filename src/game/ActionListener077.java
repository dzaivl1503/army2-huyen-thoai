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
            return;
        }
        final GameHelper31 item = ExplosionEffect.game_GameHelper31_a();
        if (item == null) {
            return;
        }
        GameCanvas.var_game_InputScreen_a.a("Nhập số lượng:", new IActionListener() {
            public final void a() {
                int qty = 1;
                try {
                    String text = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
                    qty = Integer.parseInt(text);
                } catch (Exception ignored) {
                }
                if (qty <= 0) {
                    qty = 1;
                }
                ExplosionEffect.var_int_a = qty;
                GameCanvas.var_game_GameHelper21_a = null;
                if (item.var_int_a != -1 && item.var_int_b != -1) {
                    Vector<GameCommand> vector = new Vector<GameCommand>();
                    vector.addElement(new GameCommand(StringUtils.af(), new ActionListener298(ActionListener077.this)));
                    vector.addElement(new GameCommand(StringUtils.ae(), new ActionListener065(ActionListener077.this)));
                    GameCanvas.var_game_GameHelper10_a.a(vector, 2);
                    return;
                }
                if (item.var_int_a != -1) {
                    ActionListener077.this.a.a((byte)0, item.var_byte_a, ExplosionEffect.var_int_a);
                    return;
                }
                if (item.var_int_b != -1) {
                    ActionListener077.this.a.a((byte)1, item.var_byte_a, ExplosionEffect.var_int_a);
                }
            }
        }, new IActionListener() {
            public final void a() {
                GameCanvas.var_game_GameHelper21_a = null;
            }
        }, 1);
        GameCanvas.var_game_InputScreen_a.a.a("1");
        GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
    }
}

