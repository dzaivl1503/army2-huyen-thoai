/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener157
implements IActionListener {
    ActionListener157() {
    }

    public final void a() {
        if (TerrainMidlet.myInfo.var_long_c >= (long)ChatEntity.var_int_arr_a[ChatEntity.var_int_a]) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)(ChatEntity.var_int_a - ChatEntity.var_int_b), (byte)0);
            GameCanvas.c(StringUtils.cn());
            return;
        }
        GameCanvas.void_a(StringUtils.cm());
    }
}

