/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener175
implements IActionListener {
    final OptionScreen a;

    ActionListener175(OptionScreen optionScreen) {
        this.a = optionScreen;
    }

    public final void a() {
        GameCanvas.b(StringUtils.aA(), new ActionListener098(this));
    }
}

