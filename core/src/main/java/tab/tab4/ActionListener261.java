/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener261
implements IActionListener {
    private final GameSetting I1Il111l;

    ActionListener261(GameSetting gameSetting) {
        this.I1Il111l = gameSetting;
    }

    public final void a() {
        DataUtils.a("speed", GameCanvas.l);
        this.I1Il111l.var_byte_a = 1;
        this.I1Il111l.var_boolean_b = true;
        this.I1Il111l.g = new GameCommand(StringUtils.dF(), new ActionListener262(this));
    }

    static GameSetting a(ActionListener261 actionListener261) {
        return actionListener261.I1Il111l;
    }
}

