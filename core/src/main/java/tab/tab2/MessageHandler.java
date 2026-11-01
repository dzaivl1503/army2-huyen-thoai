/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.SocketConnection
 */
package tab.tab2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.io.SocketConnection;

public final class MessageHandler
implements IServerListener {
    private static MessageHandler var_game_MessageHandler_l1l111Il1II;
    private DataOutputStream var_java_io_DataOutputStream_l1l111Il1II;
    public DataInputStream var_java_io_DataInputStream_a;
    public INetworkCallback var_game_INetworkCallback_a;
    private SocketConnection var_javax_microedition_io_SocketConnection_l1l111Il1II;
    public boolean var_boolean_a;
    public boolean b;
    private final GameHelper46 var_game_GameHelper46_l1l111Il1II = new GameHelper46(this);
    private Thread var_java_lang_Thread_l11ll11Il1I;
    public Thread var_java_lang_Thread_a;
    private int var_int_l11ll11Il1I;
    public int var_int_a;
    boolean c;
    public byte[] var_byte_arr_a = null;
    private byte var_byte_l1l111Il1II;
    private byte var_byte_l11ll11Il1I;
    public static boolean d;

    public static MessageHandler game_MessageHandler_a() {
        return var_game_MessageHandler_l1l111Il1II;
    }

    public final void a(String string, int n) {
        if (!this.var_boolean_a && !this.b) {
            this.c = false;
            this.var_javax_microedition_io_SocketConnection_l1l111Il1II = null;
            this.var_java_lang_Thread_l11ll11Il1I = new Thread(new GameHelper38(this, string, n));
            this.var_java_lang_Thread_l11ll11Il1I.start();
        }
    }

    public final void a(Message message) {
        this.var_game_GameHelper46_l1l111Il1II.a(message);
    }

    private synchronized void II1IlllIl11(Message message) {
        System.out.println("Send mesage command=" + message.a);
        byte[] byArray = message.byte_arr_a();
        try {
            if (this.c) {
                this.var_java_io_DataOutputStream_l1l111Il1II.writeByte(this.I1I1Il1lIII1(message.a));
            } else {
                this.var_java_io_DataOutputStream_l1l111Il1II.writeByte(message.a);
            }
            if (byArray != null) {
                int n = byArray.length;
                if (this.c) {
                    this.var_java_io_DataOutputStream_l1l111Il1II.writeByte(this.I1I1Il1lIII1((byte)(n >> 24)));
                    this.var_java_io_DataOutputStream_l1l111Il1II.writeByte(this.I1I1Il1lIII1((byte)(n >> 16)));
                    this.var_java_io_DataOutputStream_l1l111Il1II.writeByte(this.I1I1Il1lIII1((byte)(n >> 8)));
                    this.var_java_io_DataOutputStream_l1l111Il1II.writeByte(this.I1I1Il1lIII1((byte)n));
                } else {
                    this.var_java_io_DataOutputStream_l1l111Il1II.writeInt(n);
                }
                if (this.c) {
                    for (n = 0; n < byArray.length; ++n) {
                        byArray[n] = this.I1I1Il1lIII1(byArray[n]);
                    }
                }
                this.var_java_io_DataOutputStream_l1l111Il1II.write(byArray);
                this.var_int_l11ll11Il1I += 5 + byArray.length;
            } else {
                this.var_java_io_DataOutputStream_l1l111Il1II.writeInt(0);
                this.var_int_l11ll11Il1I += 5;
            }
            this.var_java_io_DataOutputStream_l1l111Il1II.flush();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private byte I1I1Il1lIII1(byte by) {
        byte[] byArray = this.var_byte_arr_a;
        byte by2 = this.var_byte_l11ll11Il1I;
        this.var_byte_l11ll11Il1I = (byte)(by2 + 1);
        by = (byte)(byArray[by2] & 0xFF ^ by & 0xFF);
        if (this.var_byte_l11ll11Il1I >= this.var_byte_arr_a.length) {
            this.var_byte_l11ll11Il1I = (byte)(this.var_byte_l11ll11Il1I % this.var_byte_arr_a.length);
        }
        return by;
    }

    public final void void_a() {
        this.II1IlllIl11();
    }

    private void II1IlllIl11() {
        this.var_byte_arr_a = null;
        this.var_byte_l1l111Il1II = 0;
        this.var_byte_l11ll11Il1I = 0;
        try {
            this.var_boolean_a = false;
            this.b = false;
            if (this.var_javax_microedition_io_SocketConnection_l1l111Il1II != null) {
                this.var_javax_microedition_io_SocketConnection_l1l111Il1II.close();
                this.var_javax_microedition_io_SocketConnection_l1l111Il1II = null;
            }
            if (this.var_java_io_DataOutputStream_l1l111Il1II != null) {
                this.var_java_io_DataOutputStream_l1l111Il1II.close();
                this.var_java_io_DataOutputStream_l1l111Il1II = null;
            }
            if (this.var_java_io_DataInputStream_a != null) {
                this.var_java_io_DataInputStream_a.close();
                this.var_java_io_DataInputStream_a = null;
            }
            this.var_java_lang_Thread_a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static SocketConnection javax_microedition_io_SocketConnection_a(MessageHandler messageHandler) {
        return messageHandler.var_javax_microedition_io_SocketConnection_l1l111Il1II;
    }

    static void a(MessageHandler messageHandler, SocketConnection socketConnection) {
        messageHandler.var_javax_microedition_io_SocketConnection_l1l111Il1II = socketConnection;
    }

    static void a(MessageHandler messageHandler, DataOutputStream dataOutputStream) {
        messageHandler.var_java_io_DataOutputStream_l1l111Il1II = dataOutputStream;
    }

    static GameHelper46 game_GameHelper46_a(MessageHandler messageHandler) {
        return messageHandler.var_game_GameHelper46_l1l111Il1II;
    }

    static void a(MessageHandler messageHandler, Message message) {
        messageHandler.II1IlllIl11(message);
    }

    static void void_a(MessageHandler messageHandler) {
        messageHandler.II1IlllIl11();
    }

    static byte a(MessageHandler messageHandler, byte by) {
        byte[] byArray = messageHandler.var_byte_arr_a;
        byte by2 = messageHandler.var_byte_l1l111Il1II;
        messageHandler.var_byte_l1l111Il1II = (byte)(by2 + 1);
        by = (byte)(byArray[by2] & 0xFF ^ by & 0xFF);
        if (messageHandler.var_byte_l1l111Il1II >= messageHandler.var_byte_arr_a.length) {
            messageHandler.var_byte_l1l111Il1II = (byte)(messageHandler.var_byte_l1l111Il1II % messageHandler.var_byte_arr_a.length);
        }
        return by;
    }

    static {
        var_game_MessageHandler_l1l111Il1II = new MessageHandler();
    }
}

