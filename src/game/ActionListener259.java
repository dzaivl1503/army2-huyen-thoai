/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener122;
import game.ActionListener169;
import game.ActionListener203;
import game.ActionListener225;
import game.ActionListener273;
import game.GameCanvas;
import game.GameCommand;
import game.GameSetting;
import game.IActionListener;
import game.StringUtils;
import java.util.Vector;

final class ActionListener259
implements IActionListener {
    private final GameSetting III1IlI11I;

    ActionListener259(GameSetting gameSetting) {
        this.III1IlI11I = gameSetting;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand(StringUtils.dm(), new ActionListener273(this.III1IlI11I)));
        vector.addElement(new GameCommand(StringUtils.aH(), new ActionListener203(this.III1IlI11I)));
        vector.addElement(new GameCommand(StringUtils.aG(), new ActionListener169(this.III1IlI11I)));
        vector.addElement(new GameCommand(StringUtils.F(), new ActionListener225()));
        vector.addElement(new GameCommand(StringUtils.dG(), new ActionListener122()));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

