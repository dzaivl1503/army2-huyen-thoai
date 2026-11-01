/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;

import java.util.Vector;

final class ActionListener303
implements IActionListener {
    final LuckyDrawScreen a;

    ActionListener303(LuckyDrawScreen luckyDrawScreen) {
        this.a = luckyDrawScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand("1000 " + StringUtils.aq(), new ActionListener134(this)));
        vector.addElement(new GameCommand("1 " + StringUtils.ar(), new ActionListener103(this)));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

