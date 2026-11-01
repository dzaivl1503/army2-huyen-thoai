/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
package tab.tab4;

import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class GameHelper38
implements Runnable {
    private final String var_java_lang_String_lll1ll1l1;
    private final int var_int_lll1ll1l1;
    final MessageHandler a;

    GameHelper38(MessageHandler messageHandler, String string, int n) {
        this.a = messageHandler;
        this.var_java_lang_String_lll1ll1l1 = string;
        this.var_int_lll1ll1l1 = n;
    }

    public final void run() {
        MessageHandler.d = false;
        new StringBuffer("Connect: ").append(this.var_java_lang_String_lll1ll1l1).append(":").append(this.var_int_lll1ll1l1);
        new Thread(new ConnectRetryTask(this)).start();
        this.a.b = true;
        Thread.currentThread().setPriority(1);
        this.a.var_boolean_a = true;
        try {
            int n = this.var_int_lll1ll1l1;
            String string = this.var_java_lang_String_lll1ll1l1;
            MessageHandler.a(this.a, (SocketConnection)Connector.open((String)("socket://" + string + ":" + n)));
            MessageHandler.a(this.a, MessageHandler.javax_microedition_io_SocketConnection_a(this.a).openDataOutputStream());
            this.a.var_java_io_DataInputStream_a = MessageHandler.javax_microedition_io_SocketConnection_a(this.a).openDataInputStream();
            new Thread(MessageHandler.game_GameHelper46_a(this.a)).start();
            this.a.var_java_lang_Thread_a = new Thread(new GameHelper15(this.a));
            this.a.var_java_lang_Thread_a.start();
            MessageHandler.a(this.a, new Message(-27));
            this.a.b = false;
            this.a.var_game_INetworkCallback_a.c();
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            if (!MessageHandler.d) {
                new StringBuffer("cannot connect to ").append(this.var_java_lang_String_lll1ll1l1).append(":").append(this.var_int_lll1ll1l1);
                if (this.a.var_game_INetworkCallback_a != null) {
                    this.a.void_a();
                    this.a.var_game_INetworkCallback_a.a();
                }
            }
            return;
        }
    }
}

