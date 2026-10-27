package javax.microedition.lcdui;

import com.badlogic.gdx.Gdx;
import javax.microedition.midlet.MIDlet;

public class Display {
    private static Display instance;
    private Displayable currentDisplayable;

    public static Display getDisplay(MIDlet m) {
        if (instance == null) {
            instance = new Display();
        }
        return instance;
    }

    public void setCurrent(Displayable nextDisplayable) {
        this.currentDisplayable = nextDisplayable;
    }

    public Displayable getCurrent() {
        return currentDisplayable;
    }

    public void vibrate(int duration) {
        try {
            if (Gdx.input != null) {
                Gdx.input.vibrate(duration);
            }
        } catch (Throwable ignored) {
        }
    }

    public void callSerially(Runnable r) {
        if (r != null) {
            if (Gdx.app != null) {
                Gdx.app.postRunnable(r);
            } else {
                new Thread(r).start();
            }
        }
    }

    public boolean isColor() { return true; }
    public int numColors() { return 65536; }
    public int numAlphaLevels() { return 256; }
}
