/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;

import java.util.Vector;

final class ActionListener278
implements IActionListener {
    final GameHelper48 a;
    private final GameCommand Illll11llI;
    private final GameCommand III111lIIlI;

    ActionListener278(GameHelper48 gameHelper48, GameCommand gameCommand, GameCommand gameCommand2) {
        this.a = gameHelper48;
        this.Illll11llI = gameCommand;
        this.III111lIIlI = gameCommand2;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        if (this.a.game_ItemTemplate_a().var_java_lang_String_b.startsWith(StringUtils.j())) {
            vector.addElement(new GameCommand(StringUtils.ax(), new ActionListener279(this)));
        }
        vector.addElement(this.Illll11llI);
        vector.addElement(this.III111lIIlI);
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

