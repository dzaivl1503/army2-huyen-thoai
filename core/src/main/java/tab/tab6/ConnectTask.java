/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ConnectTask
implements Runnable {
    private final IActionListener lI1111Il1;
    private final IActionListener llllI11I11;

    ConnectTask(String string, String string2, IActionListener iActionListener, IActionListener iActionListener2) {
        this.llllI11I11 = iActionListener2;
        this.lI1111Il1 = iActionListener;
    }

    public final void run() {
        try {
            this.lI1111Il1.a();
            return;
        }
        catch (Exception exception) {
            this.llllI11I11.a();
            return;
        }
    }
}

