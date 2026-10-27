package javax.microedition.lcdui;

import java.util.Vector;

public abstract class Displayable {
    private String title;
    private CommandListener commandListener;
    private final Vector<Command> commands = new Vector<>();

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public boolean isShown() { return true; }
    public int getWidth() { return screen.Main.getWidth(); }
    public int getHeight() { return screen.Main.getHeight(); }

    public void addCommand(Command cmd) {
        if (cmd != null && !commands.contains(cmd)) {
            commands.addElement(cmd);
        }
    }

    public void removeCommand(Command cmd) {
        if (cmd != null) {
            commands.removeElement(cmd);
        }
    }

    public void setCommandListener(CommandListener l) {
        this.commandListener = l;
    }

    public CommandListener getCommandListener() {
        return commandListener;
    }

    public Vector<Command> getCommands() {
        return commands;
    }
}
