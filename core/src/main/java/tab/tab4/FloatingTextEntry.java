/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import javax.microedition.lcdui.Graphics;

public final class FloatingTextEntry {
    private short var_short_I1I111Il1IlI;
    private GameHelper51 var_game_GameHelper51_I1I111Il1IlI;
    private int var_int_I1I111Il1IlI;
    private int lIIlI1111;
    private boolean var_boolean_I1I111Il1IlI;

    public FloatingTextEntry(short s, String string, int n, int n2, boolean bl) {
        this.var_short_I1I111Il1IlI = s;
        this.var_int_I1I111Il1IlI = n;
        this.lIIlI1111 = n2;
        this.var_boolean_I1I111Il1IlI = bl;
    }

    public final void a(short s) {
        if (this.var_short_I1I111Il1IlI != s) {
            this.var_short_I1I111Il1IlI = s;
            this.var_game_GameHelper51_I1I111Il1IlI = null;
        }
    }

    public final void a() {
        this.var_short_I1I111Il1IlI = (short)-1;
        this.var_game_GameHelper51_I1I111Il1IlI = null;
    }

    public final void b() {
        if (this.var_short_I1I111Il1IlI == -1) {
            return;
        }
        if (this.var_game_GameHelper51_I1I111Il1IlI == null || this.var_game_GameHelper51_I1I111Il1IlI.short_a() != this.var_short_I1I111Il1IlI) {
            this.var_game_GameHelper51_I1I111Il1IlI = new GameHelper51(this.var_short_I1I111Il1IlI);
            return;
        }
        this.var_game_GameHelper51_I1I111Il1IlI.void_a();
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        if (this.var_short_I1I111Il1IlI == -1 || this.var_game_GameHelper51_I1I111Il1IlI == null) {
            return;
        }
        n3 = this.var_boolean_I1I111Il1IlI ? n3 : 1;
        this.var_game_GameHelper51_I1I111Il1IlI.a(graphics, n + this.var_int_I1I111Il1IlI, n2 + this.lIIlI1111, n3);
    }

    public final void a(int n, int n2) {
        this.var_int_I1I111Il1IlI = n;
        this.lIIlI1111 = n2;
    }

    public final void a(boolean bl) {
        this.var_boolean_I1I111Il1IlI = bl;
    }
}

