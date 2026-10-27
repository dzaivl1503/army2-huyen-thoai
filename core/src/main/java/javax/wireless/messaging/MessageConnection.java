package javax.wireless.messaging;

import java.io.IOException;

public interface MessageConnection extends javax.microedition.io.Connection {
    String TEXT_MESSAGE = "text";
    String BINARY_MESSAGE = "binary";

    Message newMessage(String type);
    Message newMessage(String type, String addr);
    void send(Message msg) throws IOException;
    Message receive() throws IOException;
}
