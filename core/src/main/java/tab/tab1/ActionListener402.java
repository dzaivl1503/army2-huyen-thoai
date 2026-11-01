/*
 * Gui mat khau cap 2 (cmd -13) khi ban trang bi / mo khoa ruong.
 */
package tab.tab1;


final class ActionListener402
implements IActionListener {
    ActionListener402() {
    }

    public final void a() {
        String string = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
        if (string.length() < 4 || string.length() > 20) {
            GameCanvas.void_a("Mật khẩu cấp 2 phải từ 4 đến 20 ký tự, không khoảng trắng");
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().sendPassword2(string);
        GameCanvas.var_game_GameHelper21_a = null;
    }
}
