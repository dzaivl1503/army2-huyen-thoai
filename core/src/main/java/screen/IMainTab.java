package screen;

public interface IMainTab {
    void keyPressed(int k);
    void keyReleased(int k);
    void pointerPressed(int x, int y);
    void pointerReleased(int x, int y);
    void pointerDragged(int x, int y);
    int getWidth();
    int getHeight();
    void render(float delta);
    void resize(int w, int h);
    void dispose();
}
