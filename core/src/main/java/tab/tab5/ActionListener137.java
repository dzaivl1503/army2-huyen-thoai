/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener137
implements IActionListener {
    private final String l1lIIIII11I;

    ActionListener137(String string) {
        this.l1lIIIII11I = string;
    }

    public final void a() {
        GameCanvas.d();
        try {
            TerrainMidlet.instance.platformRequest(this.l1lIIIII11I);
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

