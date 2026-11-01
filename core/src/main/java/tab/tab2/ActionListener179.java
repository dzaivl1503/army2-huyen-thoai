/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;

import java.util.Vector;

final class ActionListener179
implements IActionListener {
    final ProfileScreen a;

    ActionListener179(ProfileScreen profileScreen) {
        this.a = profileScreen;
    }

    public final void a() {
        Vector<GameCommand> vector = new Vector<GameCommand>();
        vector.addElement(new GameCommand(StringUtils.W(), new ActionListener174()));
        vector.addElement(new GameCommand(StringUtils.ad(), new ActionListener046(this)));
        if (this.a.var_game_EquipItemEntry_a.var_short_a == TerrainMidlet.myInfo.var_short_b) {
            vector.addElement(new GameCommand(StringUtils.java_lang_String_c(), new ActionListener067()));
            vector.addElement(new GameCommand(StringUtils.d(), new ActionListener114()));
        }
        GameCanvas.var_game_GameHelper10_a.a(vector, 0);
    }
}

