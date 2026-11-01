/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener203
implements IActionListener {
    private GameSetting I1l1llIlIIl;

    ActionListener203(GameSetting gameSetting) {
        this.I1l1llIlIIl = gameSetting;
    }

    public final void a() {
        if (GameCanvas.var_game_InputScreen_a.a.equals(this.I1l1llIlIIl.var_game_MapEntity_a)) {
            GameCanvas.var_game_InputScreen_a.a(StringUtils.dp(), new ActionListener012(this.I1l1llIlIIl), new ActionListener087(), 3);
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
            return;
        }
        this.I1l1llIlIIl.var_game_MapEntity_a.a(TerrainMidlet.myInfo.var_java_lang_String_a);
    }
}

