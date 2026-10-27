package screen;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

/**
 * Launches the iOS (RoboVM) application for Army 2.
 */
public class IOSLauncher extends IOSApplication.Delegate {
    @Override
    public IOSApplication createApplication() {
        IOSApplicationConfiguration configuration = new IOSApplicationConfiguration();
        configuration.preferredFramesPerSecond = 60;
        return new IOSApplication(ScreenManager.instance.gameScreen, configuration);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }
}
