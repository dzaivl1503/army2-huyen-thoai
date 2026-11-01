/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import javax.microedition.lcdui.Graphics;

public final class TurnTimer {
    public int a;
    private int lIIIIllI11;
    private long var_long_IIlIllIl11I = System.currentTimeMillis();
    private boolean var_boolean_IIlIllIl11I = true;

    public final void a(byte by) {
        this.lIIIIllI11 = by;
    }

    public final void a() {
        this.a = this.lIIIIllI11;
        new StringBuffer("[z] second= ").append(this.a);
        this.var_boolean_IIlIllIl11I = true;
    }

    public final void b() {
        if (BattleManager.boolean_a()) {
            BattleManager.var_game_PlayerEntity_arr_a[BattleScreen.var_byte_b].var_boolean_v = false;
            ConnectionWatchdog.game_ConnectionWatchdog_a().h();
            this.var_boolean_IIlIllIl11I = false;
        }
    }

    public final void c() {
        boolean bl;
        if (System.currentTimeMillis() - this.var_long_IIlIllIl11I >= 1000L) {
            this.var_long_IIlIllIl11I = System.currentTimeMillis();
            bl = true;
        } else {
            bl = false;
        }
        if (bl && this.var_boolean_IIlIllIl11I) {
            --this.a;
            if (this.a < -10 && this.a % 5 == 0) {
                Object object = GameHelper01.b;
                synchronized (object) {
                    GameHelper01.b.notifyAll();
                }
            }
            if (GameCanvas.var_game_BaseScreen_a == BattleScreen.var_game_BattleScreen_a && this.a == 0) {
                if (BattleManager.game_PlayerEntity_a() != null && BattleManager.game_PlayerEntity_a().var_int_k != -1) {
                    BattleManager.game_PlayerEntity_a().var_int_k = -1;
                }
                return;
            }
        }
    }

    public final void a(Graphics graphics) {
        if (this.var_boolean_IIlIllIl11I) {
            if (GameCanvas.var_game_BaseScreen_a == BattleScreen.var_game_BattleScreen_a) {
                FontRenderer.f.a(graphics, Integer.toString(this.a), GameCanvas.var_int_b - 16, 2 + (GameCanvas.var_boolean_d ? 25 : 0), 2);
            }
            if (GameCanvas.var_game_BaseScreen_a == UpgradeScreen.var_game_UpgradeScreen_a) {
                FontRenderer.f.a(graphics, Integer.toString(this.a), GameCanvas.var_int_b - 16, 2, 2);
            }
        }
    }

    public final void d() {
        this.var_boolean_IIlIllIl11I = false;
    }
}

