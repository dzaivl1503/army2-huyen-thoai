package javax.microedition.media;

public interface Player {
    int UNREALIZED = 100;
    int REALIZED = 200;
    int PREFETCHED = 300;
    int STARTED = 400;
    int CLOSED = 0;
    long TIME_UNKNOWN = -1;

    void realize() throws MediaException;
    void prefetch() throws MediaException;
    void start() throws MediaException;
    void stop() throws MediaException;
    void deallocate();
    void close();
    void setMediaTime(long now) throws MediaException;
    long getMediaTime();
    int getState();
    void setLoopCount(int count);
    Control getControl(String type);
    Control[] getControls();
}
