/*
 * Gui ten nhan vat khi dang nhap lan dau (cmd -16).
 */
package tab.tab2;


final class ActionListener400
implements IActionListener {
    ActionListener400() {
    }

    public final void a() {
        String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
        if (string.length() < 3) {
            GameCanvas.void_a("Tên nhân vật phải từ 3 ký tự");
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().sendNickname(string);
        GameCanvas.var_game_GameHelper21_a = null;
    }
}
