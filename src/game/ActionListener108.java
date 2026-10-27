/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener131;
import game.ActionListener156;
import game.ActionListener201;
import game.ActionListener213;
import game.GameCanvas;
import game.GameCommand;
import game.GameHelper13;
import game.IActionListener;
import game.StringUtils;
import java.util.Vector;

final class ActionListener108
implements IActionListener {
    final GameHelper13 a;

    ActionListener108(GameHelper13 gameHelper13) {
        this.a = gameHelper13;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand(StringUtils.cfr_renamed_0(), new ActionListener156(this)));
        vector.addElement(new GameCommand(StringUtils.bJ(), new ActionListener213(this)));
        vector.addElement(new GameCommand(StringUtils.bI(), new ActionListener201()));
        vector.addElement(new GameCommand(StringUtils.cj(), new ActionListener131(this)));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

