package screen.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import screen.ScreenManager;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

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
        configuration.setTitle("Army2promax");
        configuration.setForegroundFPS(60);
        configuration.setWindowedMode(380, 680);
        configuration.setWindowSizeLimits(320, 480, -1, -1);
        configuration.setOpenGLEmulation(Lwjgl3ApplicationConfiguration.GLEmulation.GL20, 2, 0);
        setWindowIcon(configuration);
        return configuration;
    }

    /** Extract /icon.png from the jar resources to a temp file so GLFW can load it. */
    private static void setWindowIcon(Lwjgl3ApplicationConfiguration configuration) {
        try (InputStream in = Lwjgl3Launcher.class.getResourceAsStream("/icon.png")) {
            if (in == null)
                return;
            File iconFile = File.createTempFile("army2promax-icon", ".png");
            iconFile.deleteOnExit();
            Files.copy(in, iconFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            configuration.setWindowIcon(iconFile.getAbsolutePath());
        } catch (Exception ignored) {
        }
    }
}
