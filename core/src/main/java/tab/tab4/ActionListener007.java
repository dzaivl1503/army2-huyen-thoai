/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener007
implements IActionListener {
    private final PlayerAccountInfo ll1ll1lIl111;

    ActionListener007(PlayerAccountInfo playerAccountInfo) {
        this.ll1ll1lIl111 = playerAccountInfo;
    }

    public final void a() {
        ConnectionWatchdog.game_ConnectionWatchdog_a().d(this.ll1ll1lIl111.var_int_a);
        GameCanvas.b(StringUtils.aW() + " " + this.ll1ll1lIl111.var_java_lang_String_a);
    }
}

