/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener043;
import game.ActionListener300;
import game.GameCanvas;
import game.GameCommand;
import game.IActionListener;
import game.ProfileScreen;
import game.StringUtils;
import java.util.Vector;

final class ActionListener048
implements IActionListener {
    final ProfileScreen a;

    ActionListener048(ProfileScreen profileScreen) {
        this.a = profileScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand(StringUtils.dJ(), new ActionListener043(this)));
        vector.addElement(new GameCommand(StringUtils.ck(), new ActionListener300(this)));
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

