/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ConnectRetryTask
implements Runnable {
    private GameHelper38 I1II1I1Ill1l;

    ConnectRetryTask(GameHelper38 gameHelper38) {
        this.I1II1I1Ill1l = gameHelper38;
    }

    public final void run() {
        try {
            Thread.sleep(15000L);
        }
        catch (InterruptedException interruptedException) {}
        if (this.I1II1I1Ill1l.a.b) {
            try {
                MessageHandler.javax_microedition_io_SocketConnection_a(this.I1II1I1Ill1l.a).close();
            }
            catch (Exception exception) {}
            MessageHandler.d = true;
            this.I1II1I1Ill1l.a.b = false;
            this.I1II1I1Ill1l.a.var_boolean_a = false;
            this.I1II1I1Ill1l.a.var_game_INetworkCallback_a.a();
        }
    }
}

