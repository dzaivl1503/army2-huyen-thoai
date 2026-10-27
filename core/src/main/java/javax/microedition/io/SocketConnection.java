package javax.microedition.io;

import java.io.*;
import java.net.Socket;

public class SocketConnection implements StreamConnection {
    public static final byte DELAY = 0;
    public static final byte LINGER = 1;
    public static final byte KEEPALIVE = 2;
    public static final byte RCVBUF = 3;
    public static final byte SNDBUF = 4;

    private final Socket socket;

    public SocketConnection(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public String getAddress() throws IOException {
        return socket.getInetAddress().getHostAddress();
    }

    public String getLocalAddress() throws IOException {
        return socket.getLocalAddress().getHostAddress();
    }

    public int getPort() throws IOException {
        return socket.getPort();
    }

    public int getLocalPort() throws IOException {
        return socket.getLocalPort();
    }

    public void setSocketOption(byte option, int value) throws IllegalArgumentException, IOException {
        switch (option) {
            case DELAY: socket.setTcpNoDelay(value == 0); break;
            case LINGER: socket.setSoLinger(value > 0, value); break;
            case KEEPALIVE: socket.setKeepAlive(value != 0); break;
            case RCVBUF: socket.setReceiveBufferSize(value); break;
            case SNDBUF: socket.setSendBufferSize(value); break;
        }
    }

    public int getSocketOption(byte option) throws IllegalArgumentException, IOException {
        switch (option) {
            case DELAY: return socket.getTcpNoDelay() ? 0 : 1;
            case LINGER: return socket.getSoLinger();
            case KEEPALIVE: return socket.getKeepAlive() ? 1 : 0;
            case RCVBUF: return socket.getReceiveBufferSize();
            case SNDBUF: return socket.getSendBufferSize();
            default: return 0;
        }
    }

    @Override
    public InputStream openInputStream() throws IOException {
        return socket.getInputStream();
    }

    @Override
    public DataInputStream openDataInputStream() throws IOException {
        return new DataInputStream(openInputStream());
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        return socket.getOutputStream();
    }

    @Override
    public DataOutputStream openDataOutputStream() throws IOException {
        return new DataOutputStream(openOutputStream());
    }

    @Override
    public void close() throws IOException {
        socket.close();
    }
}
