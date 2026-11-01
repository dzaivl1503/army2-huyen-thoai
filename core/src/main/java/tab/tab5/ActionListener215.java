/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener215
implements IActionListener {
    private BoardScreen IlIIlIllI1I;

    ActionListener215(BoardScreen boardScreen) {
        this.IlIIlIllI1I = boardScreen;
    }

    public final void a() {
        String string;
        if (BoardScreen.int_c(this.IlIIlIllI1I) == 0 && !(string = BoardScreen.var_game_MapEntity_a.java_lang_String_a()).trim().equals("")) {
            BoardScreen.var_game_MapEntity_a.a("");
            ConnectionWatchdog.game_ConnectionWatchdog_a().c(string);
            this.IlIIlIllI1I.a(TerrainMidlet.myInfo.var_int_a, string);
            BoardScreen.void_a(this.IlIIlIllI1I);
        }
    }
}

