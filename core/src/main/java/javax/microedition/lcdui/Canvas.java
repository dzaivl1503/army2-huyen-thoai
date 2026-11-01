package javax.microedition.lcdui;

public abstract class Canvas extends Displayable {
    public static final int UP = 1;
    public static final int DOWN = 6;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int FIRE = 8;
    public static final int GAME_A = 9;
    public static final int GAME_B = 10;
    public static final int GAME_C = 11;
    public static final int GAME_D = 12;

    public static final int KEY_NUM0 = 48;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;

    public static final int KEY_UP = -1;
    public static final int KEY_DOWN = -2;
    public static final int KEY_LEFT = -3;
    public static final int KEY_RIGHT = -4;
    public static final int KEY_FIRE = -5;

    public boolean isDoubleBuffered() { return true; }
    public boolean hasPointerEvents() { return true; }
    public boolean hasPointerMotionEvents() { return true; }
    public boolean hasRepeatEvents() { return true; }

    @Override
    public int getWidth() {
        return screen.Main.getWidth();
    }

    @Override
    public int getHeight() {
        int h = screen.Main.getHeight() - screen.Main.KEYPAD_TOTAL_HEIGHT;
        return (h > 0) ? h : 324;
    }

    public void repaint() {
    }

    public void repaint(int x, int y, int width, int height) {
    }

    public void serviceRepaints() {
    }

    public void setFullScreenMode(boolean mode) {
    }

    public int getGameAction(int keyCode) {
        switch (keyCode) {
            case KEY_UP: case '2': return UP;
            case KEY_DOWN: case '8': return DOWN;
            case KEY_LEFT: case '4': return LEFT;
            case KEY_RIGHT: case '6': return RIGHT;
            case KEY_FIRE: case '5': return FIRE;
            default: return 0;
        }
    }

    public int getKeyCode(int gameAction) {
        switch (gameAction) {
            case UP: return KEY_UP;
            case DOWN: return KEY_DOWN;
            case LEFT: return KEY_LEFT;
            case RIGHT: return KEY_RIGHT;
            case FIRE: return KEY_FIRE;
            default: return 0;
        }
    }

    public abstract void paint(Graphics g);

    public void keyPressed(int keyCode) {}
    public void keyReleased(int keyCode) {}
    public void keyRepeated(int keyCode) {}
    public void pointerPressed(int x, int y) {}
    public void pointerReleased(int x, int y) {}
    public void pointerDragged(int x, int y) {}
    public void sizeChanged(int w, int h) {}
}
