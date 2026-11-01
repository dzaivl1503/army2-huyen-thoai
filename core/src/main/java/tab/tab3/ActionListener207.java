/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener207
implements IActionListener {
    private final byte var_byte_lI1lII1l1ll;
    private final byte IIIlIII1II;
    private final String var_java_lang_String_lI1lII1l1ll;

    ActionListener207(byte by, byte by2, String string) {
        this.var_byte_lI1lII1l1ll = by;
        this.IIIlIII1II = by2;
        this.var_java_lang_String_lI1lII1l1ll = string;
    }

    public final void a() {
        BoardScreen.var_byte_a = this.var_byte_lI1lII1l1ll;
        GameHelper05.a(this.IIIlIII1II, this.var_java_lang_String_lI1lII1l1ll);
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.var_byte_lI1lII1l1ll, this.IIIlIII1II, "");
    }
}

