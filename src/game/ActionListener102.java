/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ConnectionWatchdog;
import game.GameCanvas;
import game.GameHelper33;
import game.IActionListener;
import game.PlayerAccountInfo;
import game.StringUtils;

final class ActionListener102
implements IActionListener {
    private GameHelper33 I1IlIl11l;

    ActionListener102(GameHelper33 gameHelper33) {
        this.I1IlIl11l = gameHelper33;
    }

    public final void a() {
        PlayerAccountInfo playerAccountInfo;
        if (this.I1IlIl11l.var_java_util_Vector_a != null && this.I1IlIl11l.var_java_util_Vector_a.size() > this.I1IlIl11l.var_int_a && (playerAccountInfo = (PlayerAccountInfo)this.I1IlIl11l.var_java_util_Vector_a.elementAt(this.I1IlIl11l.var_int_a)) != null) {
            new StringBuffer("[fy] ID invite = ").append(playerAccountInfo.var_int_a);
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(false, playerAccountInfo.var_int_a);
            GameCanvas.void_a(StringUtils.bZ());
        }
    }
}

