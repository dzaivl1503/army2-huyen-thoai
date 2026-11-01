/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;

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

