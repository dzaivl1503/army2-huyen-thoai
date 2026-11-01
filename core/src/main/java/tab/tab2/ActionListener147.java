/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener147
implements IActionListener {
    private ExplosionEffect lIllll111;

    ActionListener147(ExplosionEffect explosionEffect) {
        this.lIllll111 = explosionEffect;
    }

    public final void a() {
        if (this.lIllll111.var_boolean_a) {
            this.lIllll111.var_boolean_a = false;
            return;
        }
        this.lIllll111.c = true;
    }
}

