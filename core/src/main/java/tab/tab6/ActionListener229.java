/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener229
implements IActionListener {
    private CharacterUpgradeScreen IIllll1lll;

    ActionListener229(CharacterUpgradeScreen characterUpgradeScreen) {
        this.IIllll1lll = characterUpgradeScreen;
    }

    public final void a() {
        GameCanvas.a(StringUtils.aA(), new ActionListener014(this.IIllll1lll), new ActionListener018(this.IIllll1lll));
    }
}

