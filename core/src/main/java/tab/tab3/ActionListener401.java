/*
 * Gui ten moi khi dung The Doi Ten (cmd -11).
 */
package tab.tab3;


final class ActionListener401
implements IActionListener {
    ActionListener401() {
    }

    public final void a() {
        String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
        if (string.length() < 3) {
            GameCanvas.void_a("Tên nhân vật phải từ 3 ký tự");
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().sendRename(string);
        GameCanvas.var_game_GameHelper21_a = null;
    }
}
