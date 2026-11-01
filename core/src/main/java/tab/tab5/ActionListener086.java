/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener086
implements IActionListener {
    ActionListener086() {
    }

    public final void a() {
        if (TerrainMidlet.myInfo.e >= ChatEntity.var_int_arr_b[ChatEntity.var_int_a]) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)(ChatEntity.var_int_a - ChatEntity.var_int_b), (byte)1);
            GameCanvas.c(StringUtils.cn());
            return;
        }
        GameCanvas.void_a(StringUtils.cm());
    }
}

