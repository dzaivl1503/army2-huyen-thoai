/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener262
implements IActionListener {
    private final ActionListener261 l1IIlIllI;

    ActionListener262(ActionListener261 actionListener261) {
        this.l1IIlIllI = actionListener261;
    }

    public final void a() {
        DataUtils.a("graphic", (int)BattleScreen.var_byte_a);
        if (BattleScreen.var_byte_a != 2) {
            BattleScreen.var_game_GameHelper34_a.a();
        }
        ActionListener261.a((ActionListener261)this.l1IIlIllI).var_byte_a = (byte)2;
        ActionListener261.a((ActionListener261)this.l1IIlIllI).var_boolean_b = true;
        ActionListener261.a((ActionListener261)this.l1IIlIllI).g = null;
        ActionListener261.a((ActionListener261)this.l1IIlIllI).f = new GameCommand(StringUtils.dj(), new ActionListener025(ActionListener261.a(this.l1IIlIllI)));
        ActionListener261.a((ActionListener261)this.l1IIlIllI).h = new GameCommand(StringUtils.cL(), new ActionListener138(ActionListener261.a(this.l1IIlIllI)));
    }
}

