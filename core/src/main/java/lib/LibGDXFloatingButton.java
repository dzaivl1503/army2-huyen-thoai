package lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import screen.Main;
import screen.ScreenManager;

public class LibGDXFloatingButton {
    private float x, y;
    private final float buttonSize = 50;
    private boolean menuOpen = false;

    private final int NUM_TABS = 6;
    private final Rectangle[] subButtonBounds = new Rectangle[NUM_TABS];

    private Texture menuButtonTexture;
    private final Texture[] tabTextures = new Texture[NUM_TABS];

    private final SpriteBatch batch;
    private final OrthographicCamera mainCamera;

    private boolean isDragging = false;
    private boolean hasMoved = false;
    private float dragOffsetX;
    private float dragOffsetY;

    public LibGDXFloatingButton(float x, float y, OrthographicCamera mainCamera) {
        this.x = x;
        this.y = y;
        this.mainCamera = mainCamera;

        for (int i = 0; i < NUM_TABS; i++) {
            subButtonBounds[i] = new Rectangle();
        }

        batch = new SpriteBatch();
        loadResources();
    }

    private void loadResources() {
        try {
            if (Gdx.files.internal("menu.png").exists()) {
                menuButtonTexture = new Texture(Gdx.files.internal("menu.png"));
            } else if (Gdx.files.internal("res/menu.png").exists()) {
                menuButtonTexture = new Texture(Gdx.files.internal("res/menu.png"));
            } else if (Gdx.files.internal("controlTab.png").exists()) {
                menuButtonTexture = new Texture(Gdx.files.internal("controlTab.png"));
            }

            for (int i = 0; i < NUM_TABS; i++) {
                String p1 = "pb" + (i + 1) + ".png";
                String p2 = "res/pb" + (i + 1) + ".png";
                if (Gdx.files.internal(p1).exists()) {
                    tabTextures[i] = new Texture(Gdx.files.internal(p1));
                } else if (Gdx.files.internal(p2).exists()) {
                    tabTextures[i] = new Texture(Gdx.files.internal(p2));
                } else if (Gdx.files.internal("tab.png").exists()) {
                    tabTextures[i] = new Texture(Gdx.files.internal("tab.png"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading tab button resources: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void drawTexture(SpriteBatch b, Texture tex, float dx, float dy, float dw, float dh) {
        if (tex != null) {
            b.draw(tex, dx, dy, dw, dh);
        }
    }

    public void render() {
        boolean blendEnabled = Gdx.gl.glIsEnabled(GL20.GL_BLEND);

        if (!blendEnabled) {
            Gdx.gl.glEnable(GL20.GL_BLEND);
            Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }

        batch.setProjectionMatrix(mainCamera.combined);
        batch.begin();

        // 1. Vẽ nút Menu chính (menu.png) size 50x50
        drawTexture(batch, menuButtonTexture, x, y, buttonSize, buttonSize);

        // 2. Vẽ các nút đổi Tab (pb1.png -> pb6.png) chuẩn theo ButtonGroup của ios_new
        if (menuOpen) {
            int subW = 42;
            int subH = 42;
            int totalW = subW * NUM_TABS;
            int startW = (Main.getWidth() - totalW) / 2;
            float subY = 80.0f; // Vị trí Y dịch xuống thêm 10px (70.0f -> 80.0f)

            for (int i = 0; i < NUM_TABS; i++) {
                float subX = startW + (i * subW);
                subButtonBounds[i].set(subX, subY, subW, subH);

                if (tabTextures[i] != null) {
                    drawTexture(batch, tabTextures[i], subX, subY, subW, subH);
                }
            }
        }

        batch.end();

        if (!blendEnabled) {
            Gdx.gl.glDisable(GL20.GL_BLEND);
        }
    }

    private boolean isInsideMainButton(float touchX, float touchY) {
        return touchX >= x && touchX <= x + buttonSize && touchY >= y && touchY <= y + buttonSize;
    }

    public boolean touchDown(float touchX, float touchY) {
        if (isInsideMainButton(touchX, touchY)) {
            isDragging = true;
            hasMoved = false;
            dragOffsetX = touchX - x;
            dragOffsetY = touchY - y;
            return true;
        }

        if (menuOpen) {
            for (int i = 0; i < NUM_TABS; i++) {
                if (subButtonBounds[i].contains(touchX, touchY)) {
                    handleSubButtonClick(i);
                    menuOpen = false;
                    return true;
                }
            }
            menuOpen = false;
        }

        return false;
    }

    public boolean touchDragged(float touchX, float touchY) {
        if (isDragging) {
            float newX = touchX - dragOffsetX;
            float newY = touchY - dragOffsetY;

            if (Math.abs(newX - x) > 2 || Math.abs(newY - y) > 2) {
                hasMoved = true;
            }

            x = Math.max(0, Math.min(Main.getWidth() - buttonSize, newX));
            y = Math.max(0, Math.min(Main.getHeight() - buttonSize, newY));
            return true;
        }

        return false;
    }

    public boolean touchUp(float touchX, float touchY) {
        if (isDragging) {
            if (!hasMoved) {
                menuOpen = !menuOpen;
            }
            isDragging = false;
            return true;
        }

        if (menuOpen) {
            for (int i = 0; i < NUM_TABS; i++) {
                if (subButtonBounds[i].contains(touchX, touchY)) {
                    handleSubButtonClick(i);
                    menuOpen = false;
                    return true;
                }
            }
        }

        return false;
    }

        private void handleSubButtonClick(int index) {
        if (index == 2) {
            if (screen.ArmyTab.instance != null && screen.ArmyTab.instance.keypad != null) {
                screen.ArmyTab.instance.keypad.isVisible = !screen.ArmyTab.instance.keypad.isVisible;
            }
        } else {
            ScreenManager.instance.switchToTab(index);
        }
    }

    public void resize(int width, int height) {
        if (x > Main.getWidth() - buttonSize) {
            x = Math.max(0, Main.getWidth() - buttonSize);
        }
        if (y > Main.getHeight() - buttonSize) {
            y = Math.max(0, Main.getHeight() - buttonSize);
        }
    }

    public void dispose() {
        if (batch != null) batch.dispose();
        if (menuButtonTexture != null) menuButtonTexture.dispose();
        for (Texture t : tabTextures) {
            if (t != null) t.dispose();
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
