/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;

import java.util.Vector;

public final class PopupMenu {
    public boolean var_boolean_a;
    public Vector var_java_util_Vector_a;
    public int var_int_a;
    public int b;
    private int l1lIII11;
    public int c;
    public int d;

    public final void a(Vector vector) {
        byte by = (byte)(GameCanvas.var_boolean_d ? 30 : 24);
        this.var_java_util_Vector_a = vector;
        this.l1lIII11 = 0;
        this.c = 0;
        for (int i = 0; i < vector.size(); ++i) {
            GameCommand gameCommand = (GameCommand)vector.elementAt(i);
            int n = FontRenderer.f.a(gameCommand.var_java_lang_String_a);
            if (n > this.l1lIII11) {
                this.l1lIII11 = n;
            }
            this.c += by;
        }
        this.l1lIII11 += 10;
        if (this.l1lIII11 < 100) {
            this.l1lIII11 = 100;
        }
        this.c += 4;
        this.b = GameCanvas.var_int_c - this.c >> 1;
        this.d = GameCanvas.var_int_c - 24;
        this.var_boolean_a = true;
        this.var_int_a = 0;
    }
}

