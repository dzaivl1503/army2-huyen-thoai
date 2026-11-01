/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener156
implements IActionListener {
    private ActionListener108 IlI11Ill1l;

    ActionListener156(ActionListener108 actionListener108) {
        this.IlI11Ill1l = actionListener108;
    }

    public final void a() {
        if (this.IlI11Ill1l.a.var_int_a >= 0 && this.IlI11Ill1l.a.var_int_a < this.IlI11Ill1l.a.var_java_util_Vector_a.size()) {
            this.IlI11Ill1l.a.var_java_util_Vector_a.removeElementAt(this.IlI11Ill1l.a.var_int_a);
        }
        this.IlI11Ill1l.a.b = this.IlI11Ill1l.a.var_java_util_Vector_a.size() * 40 - (GameCanvas.var_int_c - 100);
    }
}

