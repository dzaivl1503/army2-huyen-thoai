/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener296
implements IActionListener {
    private UpgradeScreen I1l1lIllIlI;

    ActionListener296(UpgradeScreen upgradeScreen) {
        this.I1l1lIllIlI = upgradeScreen;
    }

    public final void a() {
        if (this.I1l1lIllIlI.var_boolean_a) {
            if (this.I1l1lIllIlI.b != null) {
                this.I1l1lIllIlI.b.b_();
                return;
            }
            ChallengeScreen.var_game_ChallengeScreen_a.b_();
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().k((byte)-2);
    }
}

