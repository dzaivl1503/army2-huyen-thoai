package screen.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import screen.ScreenManager;

/**
 * Launches the desktop (LWJGL3) application for Army 2.
 */
public class Lwjgl3Launcher {
    public static void main(String[] args) {
        if (StartupHelper.startNewJvmIfRequired())
            return;
        createApplication();
    }

    private static void createApplication() {
        new Lwjgl3Application(ScreenManager.instance.gameScreen, getDefaultConfiguration());
    }

    private static Lwjgl3ApplicationConfiguration getDefaultConfiguration() {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
        configuration.setTitle("Army 2 - Tu\u1ed5i Th\u01a1");
        configuration.setForegroundFPS(60);
        configuration.setWindowedMode(380, 680);
        configuration.setWindowSizeLimits(320, 480, -1, -1);
        configuration.setOpenGLEmulation(Lwjgl3ApplicationConfiguration.GLEmulation.GL20, 2, 0);
        return configuration;
    }
}
