package screen;

import com.badlogic.gdx.Gdx;

public class ScreenManager {
    public static ScreenManager instance = new ScreenManager();

    public Main gameScreen = new Main();
    public final ArmyTab armyTab = new ArmyTab();

    public void switchToTab(int currentTab) {
        if (Main.isRenderThread()) {
            switchTab(currentTab);
        } else {
            Gdx.app.postRunnable(() -> switchTab(currentTab));
        }
    }

    private void switchTab(int currentTab) {
        Main target = Main.instance != null ? Main.instance : gameScreen;
        if (target != null) {
            target.screen = armyTab;
            target.setScreen(armyTab);
            target.initaliseInputProcessors();
        }
    }
}
