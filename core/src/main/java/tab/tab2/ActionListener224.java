/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener224
implements IActionListener {
    final OptionScreen a;

    ActionListener224(OptionScreen optionScreen) {
        this.a = optionScreen;
    }

    public final void a() {
        GameCanvas.b(StringUtils.aA(), new ActionListener248(this));
    }
}

