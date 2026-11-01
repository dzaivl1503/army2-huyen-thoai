/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;

import java.io.IOException;

final class GameHelper15
implements Runnable {
    private MessageHandler I1Il11IIl;

    GameHelper15(MessageHandler messageHandler) {
        this.I1Il11IIl = messageHandler;
    }

    /*
     * WARNING - void declaration
     */
    public final void run() {
        try {
            while (this.I1Il11IIl.var_boolean_a) {
                int by;
                int by2;
                byte[] byArray;
                GameHelper15 gameHelper15 = this;
                byte by3 = this.I1Il11IIl.var_java_io_DataInputStream_a.readByte();
                if (this.I1Il11IIl.c) {
                    by3 = MessageHandler.a(this.I1Il11IIl, by3);
                }
                if (by3 == 90) {
                    int by4 = this.I1Il11IIl.var_java_io_DataInputStream_a.readInt();
                    byArray = new byte[by4];
                    by2 = 0;
                    by = 0;
                    while (by2 != -1 && by < by4) {
                        by2 = gameHelper15.I1Il11IIl.var_java_io_DataInputStream_a.read(byArray, by, by4 - by);
                        if (by2 <= 0) continue;
                        by += by2;
                    }
                    MessageHandler messageHandler = gameHelper15.I1Il11IIl;
                    messageHandler.var_int_a += by + 5;
                } else {
                                        int var3_9;
                    if (this.I1Il11IIl.c) {
                        byte b1 = this.I1Il11IIl.var_java_io_DataInputStream_a.readByte();
                        byte b2 = this.I1Il11IIl.var_java_io_DataInputStream_a.readByte();
                        byte b3 = this.I1Il11IIl.var_java_io_DataInputStream_a.readByte();
                        byte b4 = this.I1Il11IIl.var_java_io_DataInputStream_a.readByte();
                        var3_9 = (MessageHandler.a(this.I1Il11IIl, b1) & 0xFF) << 24 | (MessageHandler.a(this.I1Il11IIl, b2) & 0xFF) << 16 | (MessageHandler.a(this.I1Il11IIl, b3) & 0xFF) << 8 | MessageHandler.a(this.I1Il11IIl, b4) & 0xFF;
                    } else {
                        var3_9 = this.I1Il11IIl.var_java_io_DataInputStream_a.readInt();
                    }
                    byArray = new byte[var3_9];
                    by2 = 0;
                    by = 0;
                    while (by2 != -1 && by < var3_9) {
                        by2 = gameHelper15.I1Il11IIl.var_java_io_DataInputStream_a.read(byArray, by, var3_9 - by);
                        if (by2 <= 0) continue;
                        by += by2;
                    }
                    MessageHandler messageHandler = gameHelper15.I1Il11IIl;
                    messageHandler.var_int_a += by + 5;
                    if (gameHelper15.I1Il11IIl.c) {
                        int var3_12 = 0;
                        boolean bl = false;
                        while (var3_12 < byArray.length) {
                            byArray[var3_12] = MessageHandler.a(gameHelper15.I1Il11IIl, byArray[var3_12]);
                            ++var3_12;
                        }
                    }
                }
                Message message = new Message(by3, byArray);
                try {
                    new StringBuffer("Receive Message command=").append(message.a);
                    if (message.a == -27) {
                        this.l1Il11l11l(message);
                        continue;
                    }
                    this.I1Il11IIl.var_game_INetworkCallback_a.a(message);
                }
                catch (Exception exception) {}
            }
        }
        catch (Exception exception) {}
        if (this.I1Il11IIl.var_boolean_a) {
            if (this.I1Il11IIl.var_game_INetworkCallback_a != null) {
                this.I1Il11IIl.var_game_INetworkCallback_a.b();
            }
            if (MessageHandler.javax_microedition_io_SocketConnection_a(this.I1Il11IIl) != null) {
                MessageHandler.void_a(this.I1Il11IIl);
            }
        }
    }

    private void l1Il11l11l(Message object) {
        try {
            int n;
            int n2 = ((Message)object).java_io_DataInputStream_a().readByte();
            this.I1Il11IIl.var_byte_arr_a = new byte[n2];
            for (n = 0; n < n2; ++n) {
                this.I1Il11IIl.var_byte_arr_a[n] = ((Message)object).java_io_DataInputStream_a().readByte();
            }
            for (n = 0; n < this.I1Il11IIl.var_byte_arr_a.length - 1; ++n) {
                byte[] byArray = this.I1Il11IIl.var_byte_arr_a;
                int n3 = n + 1;
                byArray[n3] = (byte)(byArray[n3] ^ this.I1Il11IIl.var_byte_arr_a[n]);
            }
            this.I1Il11IIl.c = true;
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }
}

