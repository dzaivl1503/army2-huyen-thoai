/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class ActionListener197
implements IActionListener {
    private final String l1lllIlI11Il;

    ActionListener197(String string) {
        this.l1lllIlI11Il = string;
    }

    public final void a() {
        try {
            TerrainMidlet.instance.platformRequest(this.l1lllIlI11Il);
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

