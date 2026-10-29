package screen;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import lib.LibGDXFloatingButton;
import lib.MapKey;
import lib.NetRequest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * LibGDX ApplicationListener implementation shared by PC Desktop and iOS.
 */
public class Main extends Game {
    public static Main instance;
    public InputMultiplexer inputMultiplexer;
    private MyInputProcessor inputProcessor;
    private MyGestureHandler gestureHandler;
    private static int WIDTH = 380;
    private static int HEIGHT = 680;
    public static NetRequest netRequest;
    public IMainTab screen;

    public OrthographicCamera camera;
    public Viewport viewport;
    public LibGDXFloatingButton floatingButton;
    public static Thread renderThread;

    public static void updateVirtualSize(int screenWidth, int screenHeight) {
        if (Gdx.app != null && Gdx.app.getType() == Application.ApplicationType.Android) {
            float targetWidth = 390.0f;
            if (screenWidth > 0 && screenHeight > 0) {
                float scale = (float) screenWidth / targetWidth;
                WIDTH = Math.round(targetWidth);
                HEIGHT = Math.round((float) screenHeight / scale);
                if (WIDTH < 320) WIDTH = 320;
                if (HEIGHT < 480) HEIGHT = 480;
                return;
            }
        }
        WIDTH = screenWidth;
        HEIGHT = screenHeight;
    }

    public static boolean isRenderThread() {
        return Thread.currentThread() == renderThread ||
                (Gdx.graphics != null && "Main".equalsIgnoreCase(Thread.currentThread().getName()));
    }

    @Override
    public void create() {
        renderThread = Thread.currentThread();
        if (!Objects.equals(Thread.currentThread().getName(), "Main")) {
            try {
                Thread.currentThread().setName("Main");
            } catch (Throwable ignored) {
            }
        }
        instance = this;
        netRequest = new NetRequest();

        int pWidth = Gdx.graphics.getWidth();
        int pHeight = Gdx.graphics.getHeight();
        if (pWidth <= 0)
            pWidth = 380;
        if (pHeight <= 0)
            pHeight = 680;
        updateVirtualSize(pWidth, pHeight);

        this.camera = new OrthographicCamera();
        this.camera.setToOrtho(true, WIDTH, HEIGHT);
        this.viewport = new ExtendViewport(WIDTH, HEIGHT, camera);
        if (viewport != null) {
            viewport.update(pWidth, pHeight, true);
        }
        this.camera.setToOrtho(true, WIDTH, HEIGHT);
        this.camera.position.set(WIDTH / 2f, HEIGHT / 2f, 0);
        this.camera.update();

        MapKey.load();
        try {
            floatingButton = new LibGDXFloatingButton(WIDTH - 50, 30.0f, camera);
        } catch (Throwable ignored) {
        }

        ScreenManager.instance.switchToTab(0);
    }

    public InputStream getResourceAsStream(String path) {
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        try {
            if (Gdx.files.internal(path).exists()) {
                return Gdx.files.internal(path).read();
            }
            if (Gdx.files.classpath(path).exists()) {
                return Gdx.files.classpath(path).read();
            }
        } catch (Exception ignored) {
        }
        return null;
    }

    public String readResource(String resourcePath) {
        try (InputStream isLoad = getResourceAsStream(resourcePath)) {
            if (isLoad != null) {
                return readStream(isLoad);
            }
        } catch (IOException ignored) {
        }
        return "";
    }

    public static String readStream(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, bytesRead, StandardCharsets.UTF_8));
        }
        return sb.toString();
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    @Override
    public void render() {
        if (getScreen() != null) {
            getScreen().render(Gdx.graphics.getDeltaTime());
        }
        if (floatingButton != null) {
            floatingButton.render();
        }
    }

    public void initaliseInputProcessors() {
        this.inputMultiplexer = new InputMultiplexer();
        Gdx.input.setInputProcessor(this.inputMultiplexer);
        this.inputProcessor = new MyInputProcessor();
        this.gestureHandler = new MyGestureHandler();
        this.inputMultiplexer.addProcessor(new GestureDetector(this.gestureHandler));
        this.inputMultiplexer.addProcessor(this.inputProcessor);
    }

    @Override
    public void dispose() {
        if (getScreen() != null) {
            getScreen().dispose();
        }
    }

    @Override
    public void resize(int width, int height) {
        updateVirtualSize(width, height);
        if (viewport != null) {
            viewport.update(width, height, true);
        }
        if (camera != null) {
            camera.setToOrtho(true, WIDTH, HEIGHT);
            camera.position.set(WIDTH / 2f, HEIGHT / 2f, 0);
            camera.update();
        }
        if (getScreen() != null) {
            getScreen().resize(WIDTH, HEIGHT);
        }
        if (floatingButton != null) {
            floatingButton.resize(WIDTH, HEIGHT);
        }
    }

    @Override
    public void pause() {
        if (getScreen() != null) {
            getScreen().pause();
        }
    }

    @Override
    public void resume() {
        if (getScreen() != null) {
            getScreen().resume();
        }
    }

    public class MyInputProcessor implements InputProcessor {
        @Override
        public boolean keyDown(int keycode) {
            if (screen == null)
                return false;
            int k = MapKey.map(keycode);
            screen.keyPressed(k);
            return false;
        }

        @Override
        public boolean keyUp(int keycode) {
            if (screen == null)
                return false;
            int k = MapKey.map(keycode);
            screen.keyReleased(k);
            return false;
        }

        @Override
        public boolean keyTyped(char character) {
            return false;
        }

        @Override
        public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            if (screen == null)
                return false;
            Vector3 touch = new Vector3(screenX, screenY, 0.0f);
            if (camera != null)
                camera.unproject(touch);
            int x = (int) touch.x;
            int y = (int) touch.y;
            if (pointer < 2) {
                if (floatingButton != null && floatingButton.touchDown(x, y)) {
                    return false;
                }
                screen.pointerPressed(x, y);
            }
            return false;
        }

        @Override
        public boolean touchUp(int screenX, int screenY, int pointer, int button) {
            if (screen == null)
                return false;
            Vector3 touch = new Vector3(screenX, screenY, 0.0f);
            if (camera != null)
                camera.unproject(touch);
            int x = (int) touch.x;
            int y = (int) touch.y;
            if (pointer < 2) {
                if (floatingButton != null && floatingButton.touchUp(x, y)) {
                    return false;
                }
                screen.pointerReleased(x, y);
            }
            return false;
        }

        @Override
        public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchDragged(int screenX, int screenY, int pointer) {
            if (screen == null)
                return false;
            Vector3 touch = new Vector3(screenX, screenY, 0.0f);
            if (camera != null)
                camera.unproject(touch);
            int x = (int) touch.x;
            int y = (int) touch.y;
            if (pointer < 2) {
                if (floatingButton != null && floatingButton.touchDragged(x, y)) {
                    return false;
                }
                screen.pointerDragged(x, y);
            }
            return false;
        }

        @Override
        public boolean mouseMoved(int screenX, int screenY) {
            return false;
        }

        @Override
        public boolean scrolled(float amountX, float amountY) {
            return false;
        }
    }

    public static class MyGestureHandler implements GestureDetector.GestureListener {
        @Override
        public boolean touchDown(float x, float y, int pointer, int button) {
            return false;
        }

        @Override
        public boolean tap(float x, float y, int count, int button) {
            return false;
        }

        @Override
        public boolean longPress(float x, float y) {
            return false;
        }

        @Override
        public boolean fling(float velocityX, float velocityY, int button) {
            return false;
        }

        @Override
        public boolean pan(float x, float y, float deltaX, float deltaY) {
            return false;
        }

        @Override
        public boolean panStop(float x, float y, int pointer, int button) {
            return false;
        }

        @Override
        public boolean zoom(float initialDistance, float distance) {
            return false;
        }

        @Override
        public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
            return false;
        }

        @Override
        public void pinchStop() {
        }
    }
}
