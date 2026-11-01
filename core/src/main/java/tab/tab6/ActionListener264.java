/*
 * Decompiled with CFR 0.152.
 */
package tab.tab6;


final class ActionListener264
implements IActionListener {
    public ActionListener264(int n) {
    }

    public final void a() {
        if (GameHelper25.a != null) {
            Object object = new Message(55);
            try {
                ((Message)object).java_io_DataOutputStream_a().writeByte(0);
                ((Message)object).java_io_DataOutputStream_a().writeInt(0);
                MessageHandler.game_MessageHandler_a().a((Message)object);
                ((Message)object).void_a();
                return;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
    }
}

