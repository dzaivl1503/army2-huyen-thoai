package javax.microedition.io;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnection implements ContentConnection {
    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String HEAD = "HEAD";
    public static final int HTTP_OK = 200;
    public static final int HTTP_CREATED = 201;
    public static final int HTTP_ACCEPTED = 202;
    public static final int HTTP_NO_CONTENT = 204;
    public static final int HTTP_MOVED_PERM = 301;
    public static final int HTTP_MOVED_TEMP = 302;
    public static final int HTTP_NOT_MODIFIED = 304;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_NOT_FOUND = 404;
    public static final int HTTP_INTERNAL_ERROR = 500;

    private final HttpURLConnection connection;

    public HttpConnection(HttpURLConnection connection) {
        this.connection = connection;
    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    public void setRequestMethod(String method) throws IOException {
        connection.setRequestMethod(method);
    }

    public String getRequestMethod() {
        return connection.getRequestMethod();
    }

    public void setRequestProperty(String key, String value) throws IOException {
        connection.setRequestProperty(key, value);
    }

    public String getRequestProperty(String key) {
        return connection.getRequestProperty(key);
    }

    public int getResponseCode() throws IOException {
        return connection.getResponseCode();
    }

    public String getResponseMessage() throws IOException {
        return connection.getResponseMessage();
    }

    public String getHeaderField(String name) throws IOException {
        return connection.getHeaderField(name);
    }

    public String getHeaderField(int n) throws IOException {
        return connection.getHeaderField(n);
    }

    public String getHeaderFieldKey(int n) throws IOException {
        return connection.getHeaderFieldKey(n);
    }

    @Override
    public String getType() {
        return connection.getContentType();
    }

    @Override
    public String getEncoding() {
        return connection.getContentEncoding();
    }

    @Override
    public long getLength() {
        return connection.getContentLengthLong();
    }

    @Override
    public InputStream openInputStream() throws IOException {
        try {
            return connection.getInputStream();
        } catch (IOException e) {
            InputStream es = connection.getErrorStream();
            if (es != null) return es;
            throw e;
        }
    }

    @Override
    public DataInputStream openDataInputStream() throws IOException {
        return new DataInputStream(openInputStream());
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        connection.setDoOutput(true);
        return connection.getOutputStream();
    }

    @Override
    public DataOutputStream openDataOutputStream() throws IOException {
        return new DataOutputStream(openOutputStream());
    }

    @Override
    public void close() throws IOException {
        connection.disconnect();
    }
}
