/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener110
implements IActionListener {
    private BoardScreen I1l1lIIIllI;

    ActionListener110(BoardScreen boardScreen) {
        this.I1l1lIIIllI = boardScreen;
    }

    public final void a() {
        if (BoardScreen.boolean_a(this.I1l1lIIIllI)) {
            BoardScreen.a(this.I1l1lIIIllI, false);
            return;
        }
        if (BoardScreen.boolean_b(this.I1l1lIIIllI)) {
            BoardScreen.void_c(this.I1l1lIIIllI);
            return;
        }
        if (BoardScreen.var_byte_c < 2) {
            BoardScreen.var_byte_c = (byte)(BoardScreen.var_byte_c + 1);
            return;
        }
        BoardScreen.var_byte_c = 0;
    }
}

