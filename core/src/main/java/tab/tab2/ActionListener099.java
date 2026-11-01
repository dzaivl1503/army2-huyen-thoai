/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener099
implements IActionListener {
    private final String l1llIll1l;

    ActionListener099(String string) {
        this.l1llIll1l = string;
    }

    public final void a() {
        try {
            TerrainMidlet.instance.platformRequest(this.l1llIll1l);
            TerrainMidlet.instance.notifyDestroyed();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

