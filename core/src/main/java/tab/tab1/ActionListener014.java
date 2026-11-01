/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener014
implements IActionListener {
    private CharacterUpgradeScreen l11IIlIIIIIl;

    ActionListener014(CharacterUpgradeScreen characterUpgradeScreen) {
        this.l11IIlIIIIIl = characterUpgradeScreen;
    }

    public final void a() {
        int n;
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(CharacterUpgradeScreen.a(this.l11IIlIIIIIl));
        CharacterUpgradeScreen.a(this.l11IIlIIIIIl, TerrainMidlet.myInfo.var_short_a);
        for (n = 0; n < 5; ++n) {
            this.l11IIlIIIIIl.b[n] = 0;
        }
        if (TerrainMidlet.myInfo.var_short_a > 0) {
            for (n = 0; n < 5; ++n) {
                this.l11IIlIIIIIl.var_byte_arr_a[n] = 1;
            }
        }
        for (n = 0; n < 5; ++n) {
            CharacterUpgradeScreen.a((CharacterUpgradeScreen)this.l11IIlIIIIIl)[n] = 0;
            this.l11IIlIIIIIl.b[n] = 0;
        }
        GameCanvas.d();
    }
}

