package javax.microedition.midlet;

import com.badlogic.gdx.Gdx;

public abstract class MIDlet {
    public MIDlet() {}

    public abstract void startApp() throws MIDletStateChangeException;
    public abstract void pauseApp();
    public abstract void destroyApp(boolean unconditional) throws MIDletStateChangeException;

    public void notifyDestroyed() {
        if (Gdx.app != null) {
            Gdx.app.exit();
        } else {
            System.exit(0);
        }
    }

    public void notifyPaused() {}

    public String getAppProperty(String key) {
        return "";
    }

    public boolean platformRequest(String url) {
        if (Gdx.net != null) {
            return Gdx.net.openURI(url);
        }
        return false;
    }
}
