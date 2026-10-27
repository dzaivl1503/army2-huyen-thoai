/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener297;
import game.DailyGiftScreen;
import game.GameCanvas;
import game.GameCommand;
import game.IActionListener;
import game.StringUtils;
import java.util.Vector;

final class ActionListener208
implements IActionListener {
    final DailyGiftScreen a;

    ActionListener208(DailyGiftScreen dailyGiftScreen) {
        this.a = dailyGiftScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        for (int i = 0; i < this.a.var_java_util_Vector_a.size(); ++i) {
            vector.addElement(new GameCommand(StringUtils.g() + " " + (i + 1), new ActionListener297(this, i)));
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

