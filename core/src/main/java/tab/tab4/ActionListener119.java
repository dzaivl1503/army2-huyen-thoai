/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener119
implements IActionListener {
    private BattleScreen lIllIllllII;

    ActionListener119(BattleScreen battleScreen) {
        this.lIllIllllII = battleScreen;
    }

    public final void a() {
        if (BattleManager.boolean_a()) {
            BattleScreen.void_a(this.lIllIllllII);
        }
    }
}

