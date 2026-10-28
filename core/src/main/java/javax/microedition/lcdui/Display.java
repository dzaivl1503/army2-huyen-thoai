package javax.microedition.lcdui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
        if (nextDisplayable instanceof TextBox) {
            final TextBox textBox = (TextBox) nextDisplayable;
            if (Gdx.input != null) {
                Gdx.app.postRunnable(new Runnable() {
                    @Override
                    public void run() {
                        String title = textBox.getTitle();
                        if (title == null || title.trim().isEmpty()) {
                            if ((textBox.getConstraints() & TextBox.PASSWORD) != 0) {
                                title = "Nhập mật khẩu";
                            } else if ((textBox.getConstraints() & TextBox.NUMERIC) != 0) {
                                title = "Nhập số";
                            } else {
                                title = "Nhập nội dung";
                            }
                        }

                        Input.TextInputListener listener = new Input.TextInputListener() {
                            @Override
                            public void input(String text) {
                                textBox.setString(text);
                                CommandListener cl = textBox.getCommandListener();
                                if (cl != null) {
                                    cl.commandAction(new Command("OK", Command.OK, 0), textBox);
                                }
                            }

                            @Override
                            public void canceled() {
                                CommandListener cl = textBox.getCommandListener();
                                if (cl != null) {
                                    cl.commandAction(new Command("Cancel", Command.CANCEL, 0), textBox);
                                }
                            }
                        };

                        try {
                            Input.OnscreenKeyboardType keyboardType = Input.OnscreenKeyboardType.Default;
                            if ((textBox.getConstraints() & TextBox.PASSWORD) != 0) {
                                keyboardType = Input.OnscreenKeyboardType.Password;
                            } else if ((textBox.getConstraints() & TextBox.NUMERIC) != 0 || (textBox.getConstraints() & TextBox.PHONENUMBER) != 0) {
                                keyboardType = Input.OnscreenKeyboardType.NumberPad;
                            }
                            Gdx.input.getTextInput(listener, title, textBox.getString(), "", keyboardType);
                        } catch (Throwable t) {
                            try {
                                Gdx.input.getTextInput(listener, title, textBox.getString(), "");
                            } catch (Throwable ignored) {
                            }
                        }
                    }
                });
            }
        }
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
