package screen;

import com.badlogic.gdx.Screen;

/**
 * Mot phien game doc lap (1 tab = 1 nick).
 * Moi tab la mot ban sao day du cua package game trong tab.tabN,
 * nen static state khong bi dung chung giua cac tab.
 */
public interface IGameTab extends IMainTab, Screen {
    void toggleKeypad();

    String getNick();
}
