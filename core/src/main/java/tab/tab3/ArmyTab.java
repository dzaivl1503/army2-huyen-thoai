package tab.tab3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screen.IGameTab;
import screen.Main;
import screen.ScreenChild;

import javax.microedition.lcdui.Graphics;

/**
 * Template sinh ra tab.tabN.ArmyTab bang tools/generate_tabs.ps1.
 * Sau khi sinh: GameCanvas / TerrainMidlet / ArmyKeypad nam cung package.
 */
public class ArmyTab implements Screen, InputProcessor, IGameTab {
    public static ArmyTab instance;
    public GameCanvas gameCanvas;
    public boolean isCreated;
    private Graphics graphics;
    public ScreenChild screenChild;
    public ArmyKeypad keypad;

    public ArmyTab() {
        instance = this;
    }

    @Override
    public void show() {
        if (!isCreated) {
            instance = this;
            SpriteBatch batch = new SpriteBatch();
            graphics = new Graphics(batch);

            try {
                TerrainMidlet midlet = new TerrainMidlet();
                midlet.startApp();
                this.gameCanvas = TerrainMidlet.canvas != null ? TerrainMidlet.canvas : GameCanvas.var_game_GameCanvas_a;
            } catch (Throwable t) {
                t.printStackTrace();
            }

            if (this.gameCanvas == null) {
                try {
                    this.gameCanvas = new GameCanvas();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }

            keypad = new ArmyKeypad();
            isCreated = true;
        }
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Main.instance != null && Main.instance.camera != null) {
            Main.instance.camera.position.set(Main.getWidth() / 2f, Main.getHeight() / 2f, 0);
            Main.instance.camera.update();
            this.graphics.graphics.setProjectionMatrix(Main.instance.camera.combined);
        }

        if (screenChild != null && screenChild.isVisible()) {
            screenChild.render();
        } else if (graphics != null) {
            try {
                this.graphics.begin();

                // 1. Reset all translation & clip before rendering Game
                this.graphics.resetTranslate();
                this.graphics.resetClip();

                if (gameCanvas != null) {
                    gameCanvas.paint(this.graphics);
                }

                // 2. Reset translation & clip before rendering Keypad
                this.graphics.resetTranslate();
                this.graphics.resetClip();

                if (keypad != null && keypad.isVisible) {
                    keypad.paint(this.graphics);
                }
            } catch (Throwable t) {
                t.printStackTrace();
            } finally {
                try {
                    this.graphics.end();
                } catch (Throwable ignored) {
                }
            }
        }
    }

    @Override
    public void resize(int width, int height) {
        if (Main.instance != null && Main.instance.camera != null) {
            Main.instance.camera.setToOrtho(true, width, height);
            Main.instance.camera.position.set(width / 2f, height / 2f, 0);
            Main.instance.camera.update();
        }
        int gameH = height - ArmyKeypad.KEYPAD_TOTAL_HEIGHT;
        if (gameH <= 0) gameH = 324;
        GameCanvas.var_int_b = width;
        GameCanvas.var_int_c = gameH;
        GameCanvas.var_int_d = width / 2;
        GameCanvas.var_int_e = gameH / 2;
        if (gameCanvas != null) {
            gameCanvas.sizeChanged(width, gameH);
        }
        if (keypad != null) {
            keypad.updatePosition(width, height);
        }
        if (screenChild != null && screenChild.isVisible()) {
            screenChild.resize(width, height);
        }
    }

    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
    @Override public void dispose() {}

    @Override
    public void keyPressed(int k) {
        if (gameCanvas != null) {
            gameCanvas.keyPressed(k);
        }
    }

    @Override
    public void keyReleased(int k) {
        if (gameCanvas != null) {
            gameCanvas.keyReleased(k);
        }
    }

    @Override
    public void pointerPressed(int x, int y) {
        int gameH = Main.getHeight() - ArmyKeypad.KEYPAD_TOTAL_HEIGHT;
        if (keypad != null && keypad.isVisible && y >= gameH) {
            if (keypad.onTouchDown(x, y)) {
                return;
            }
        }
        if (gameCanvas != null) {
            gameCanvas.pointerPressed(x, y);
        }
    }

    @Override
    public void pointerReleased(int x, int y) {
        if (keypad != null && keypad.isVisible) {
            if (keypad.onTouchUp(x, y)) {
                return;
            }
        }
        if (gameCanvas != null) {
            gameCanvas.pointerReleased(x, y);
        }
    }

    @Override
    public void pointerDragged(int x, int y) {
        if (keypad != null && keypad.isVisible) {
            if (keypad.onTouchDragged(x, y)) {
                return;
            }
        }
        if (gameCanvas != null) {
            gameCanvas.pointerDragged(x, y);
        }
    }

    @Override public boolean keyDown(int keycode) { return false; }
    @Override public boolean keyUp(int keycode) { return false; }
    @Override public boolean keyTyped(char character) { return false; }
    @Override public boolean touchDown(int screenX, int screenY, int pointer, int button) { return false; }
    @Override public boolean touchUp(int screenX, int screenY, int pointer, int button) { return false; }
    @Override public boolean touchCancelled(int screenX, int screenY, int pointer, int button) { return false; }
    @Override public boolean touchDragged(int screenX, int screenY, int pointer) { return false; }
    @Override public boolean mouseMoved(int screenX, int screenY) { return false; }
    @Override public boolean scrolled(float amountX, float amountY) { return false; }
    @Override
    public void toggleKeypad() {
        if (keypad != null) {
            keypad.isVisible = !keypad.isVisible;
        }
    }

    @Override
    public String getNick() {
        try {
            return TerrainMidlet.myInfo != null ? TerrainMidlet.myInfo.var_java_lang_String_a : null;
        } catch (Throwable t) {
            return null;
        }
    }

    @Override public int getWidth() { return Main.getWidth(); }
    @Override public int getHeight() { return Main.getHeight(); }
}