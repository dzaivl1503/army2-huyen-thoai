/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;

import java.util.Vector;

final class GameHelper46
implements Runnable {
    private final Vector var_java_util_Vector_lIllllIll1;
    private MessageHandler var_game_MessageHandler_lIllllIll1;

    public GameHelper46(MessageHandler messageHandler) {
        this.var_game_MessageHandler_lIllllIll1 = messageHandler;
        this.var_java_util_Vector_lIllllIll1 = new Vector();
    }

    public final void a(Message message) {
        this.var_java_util_Vector_lIllllIll1.addElement(message);
    }

    public final void run() {
        try {
            while (this.var_game_MessageHandler_lIllllIll1.var_boolean_a) {
                if (this.var_game_MessageHandler_lIllllIll1.c) {
                    while (this.var_java_util_Vector_lIllllIll1.size() > 0) {
                        MessageHandler.a(this.var_game_MessageHandler_lIllllIll1, (Message)this.var_java_util_Vector_lIllllIll1.elementAt(0));
                        this.var_java_util_Vector_lIllllIll1.removeElementAt(0);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException interruptedException) {}
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

