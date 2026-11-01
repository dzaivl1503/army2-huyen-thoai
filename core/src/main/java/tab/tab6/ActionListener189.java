/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener189
implements IActionListener {
    private final String IIlllIlllI;

    ActionListener189(String string) {
        this.IIlllIlllI = string;
    }

    public final void a() {
        GameCanvas.d();
        try {
            TerrainMidlet.instance.platformRequest(this.IIlllIlllI);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

