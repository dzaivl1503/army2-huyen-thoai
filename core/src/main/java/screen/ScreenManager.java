package screen;

import com.badlogic.gdx.Gdx;

/**
 * Quan ly 6 tab, moi tab la mot phien game rieng (GameCanvas + ket noi + nick rieng).
 * Tab duoc tao lazily khi nguoi dung bam vao lan dau de tiet kiem RAM.
 */
public class ScreenManager {

    public static final int TAB_COUNT = 6;

    public static ScreenManager instance = new ScreenManager();

    public Main gameScreen = new Main();

    private final IGameTab[] tabs = new IGameTab[TAB_COUNT];
    private int activeTab = -1;

    public int getActiveTab() {
        return activeTab;
    }

    public IGameTab getTab(int index) {
        if (index < 0 || index >= TAB_COUNT) {
            return null;
        }
        return tabs[index];
    }

    private static IGameTab createTab(int index) {
        switch (index) {
            case 0:
                return new tab.tab1.ArmyTab();
            case 1:
                return new tab.tab2.ArmyTab();
            case 2:
                return new tab.tab3.ArmyTab();
            case 3:
                return new tab.tab4.ArmyTab();
            case 4:
                return new tab.tab5.ArmyTab();
            case 5:
                return new tab.tab6.ArmyTab();
            default:
                return null;
        }
    }

    public void switchToTab(int currentTab) {
        if (Main.isRenderThread()) {
            switchTab(currentTab);
        } else {
            Gdx.app.postRunnable(() -> switchTab(currentTab));
        }
    }

    /** Bam lai dung tab dang mo = bat/tat ban phim ao. */
    public void toggleKeypad() {
        IGameTab tab = getTab(activeTab);
        if (tab != null) {
            tab.toggleKeypad();
        }
    }

    private void switchTab(int currentTab) {
        if (currentTab < 0 || currentTab >= TAB_COUNT) {
            return;
        }
        IGameTab target = tabs[currentTab];
        if (target == null) {
            target = createTab(currentTab);
            if (target == null) {
                return;
            }
            tabs[currentTab] = target;
        }
        if (currentTab == activeTab) {
            target.toggleKeypad();
            return;
        }
        Main app = Main.instance != null ? Main.instance : gameScreen;
        activeTab = currentTab;
        if (app != null) {
            app.screen = target;
            app.setScreen(target);
            app.initaliseInputProcessors();
            target.resize(Main.getWidth(), Main.getHeight());
        }
    }
}
