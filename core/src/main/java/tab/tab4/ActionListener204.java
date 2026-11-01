/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener204
implements IActionListener {
    ActionListener204() {
    }

    public final void a() {
        System.out.println("[dp] isFrommenu= " + ProfileScreen.var_boolean_a);
        if (ProfileScreen.var_boolean_a) {
            GameCanvas.void_a(StringUtils.ds());
            ConnectionWatchdog.game_ConnectionWatchdog_a().b(TerrainMidlet.myInfo.var_short_b);
            ProfileScreen.var_boolean_b = false;
            return;
        }
        MenuScreen.var_game_MenuScreen_a.b_();
    }
}

