package javax.microedition.io;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;

public class Connector {
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int READ_WRITE = 3;

    public static Connection open(String name) throws IOException {
        return open(name, READ_WRITE, false);
    }

    public static Connection open(String name, int mode) throws IOException {
        return open(name, mode, false);
    }

    public static Connection open(String name, int mode, boolean timeouts) throws IOException {
        if (name == null) {
            throw new IllegalArgumentException("Connection URL cannot be null");
        }

        if (name.startsWith("socket://")) {
            String target = name.substring("socket://".length());
            int colon = target.indexOf(':');
            if (colon <= 0) {
                throw new IllegalArgumentException("Invalid socket URL: " + name);
            }
            String host = target.substring(0, colon);
            int port = Integer.parseInt(target.substring(colon + 1));
            Socket socket = new Socket();
            socket.setKeepAlive(true);
            socket.setTcpNoDelay(true);
            try {
                System.out.println("[Connector] Ket noi socket toi " + host + ":" + port + " (timeout 10s)...");
                socket.connect(new java.net.InetSocketAddress(host, port), 10000);
            } catch (Exception ex) {
                System.out.println("[Connector] Ket noi toi " + host + ":" + port + " that bai (" + ex + "), thu fallback IP 45.119.215.59...");
                if (host.contains("mobiarmy2d") || host.contains("mobarmy2d")) {
                    socket = new Socket();
                    socket.setKeepAlive(true);
                    socket.setTcpNoDelay(true);
                    socket.connect(new java.net.InetSocketAddress("45.119.215.59", port), 10000);
                } else {
                    throw ex;
                }
            }
            System.out.println("[Connector] Ket noi socket thanh cong: " + socket.getRemoteSocketAddress());
            return new SocketConnection(socket);
        } else if (name.startsWith("http://") || name.startsWith("https://")) {
            URL url = new URL(name);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setInstanceFollowRedirects(true);
            conn.setConnectTimeout(timeouts ? 15000 : 8000);
            conn.setReadTimeout(timeouts ? 15000 : 8000);
            return new HttpConnection(conn);
        } else if (name.startsWith("sms://")) {
            return new javax.wireless.messaging.MessageConnection() {
                @Override public void close() {}
                @Override public javax.wireless.messaging.Message newMessage(String type) { return null; }
                @Override public javax.wireless.messaging.Message newMessage(String type, String addr) { return null; }
                @Override public void send(javax.wireless.messaging.Message msg) {}
                @Override public javax.wireless.messaging.Message receive() { return null; }
            };
        }

        throw new ConnectionNotFoundException("Protocol not supported: " + name);
    }

    public static InputStream openInputStream(String name) throws IOException {
        Connection c = open(name, READ);
        if (c instanceof InputConnection) {
            return ((InputConnection) c).openInputStream();
        }
        throw new IOException("Cannot open input stream for: " + name);
    }

    public static DataInputStream openDataInputStream(String name) throws IOException {
        return new DataInputStream(openInputStream(name));
    }

    public static OutputStream openOutputStream(String name) throws IOException {
        Connection c = open(name, WRITE);
        if (c instanceof OutputConnection) {
            return ((OutputConnection) c).openOutputStream();
        }
        throw new IOException("Cannot open output stream for: " + name);
    }

    public static DataOutputStream openDataOutputStream(String name) throws IOException {
        return new DataOutputStream(openOutputStream(name));
    }
}
