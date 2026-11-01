/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener196
implements IActionListener {
    private final String llIl1l1lI;

    ActionListener196(String string) {
        this.llIl1l1lI = string;
    }

    public final void a() {
        GameCanvas.d();
        try {
            TerrainMidlet.instance.platformRequest(this.llIl1l1lI);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

