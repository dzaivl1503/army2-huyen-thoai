package tab.tab5;


final class ActionListener097
implements IActionListener {
    final GameHelper48 a;

    ActionListener097(GameHelper48 gameHelper48) {
        this.a = gameHelper48;
    }

    public final void a() {
        if (this.a.var_int_a > 0 && this.a.var_boolean_a) {
            int qty = this.a.var_int_a;
            String string = StringUtils.t() + (long)this.a.var_game_ItemTemplate_a.var_int_e * qty + " " + StringUtils.aq();
            GameCanvas.b(string, new ActionListener003(this));
            return;
        }
        if (this.a.game_ItemTemplate_a().var_boolean_b) {
            GameCanvas.var_game_InputScreen_a.a("Nh\u1eadp s\u1ed1 l\u01b0\u1ee3ng:", new IActionListener() {
                public final void a() {
                    int qty = 1;
                    try {
                        String text = GameCanvas.var_game_InputScreen_a.a.java_lang_String_a().trim();
                        qty = Integer.parseInt(text);
                    } catch (Exception ignored) {
                    }
                    if (qty <= 0) {
                        qty = 1;
                    }
                    ActionListener097.this.a.var_boolean_a = true;
                    ActionListener097.this.a.var_int_a = qty;
                    ActionListener097.this.a.game_ItemTemplate_a().var_int_c = qty;
                    ActionListener097.this.a.game_ItemTemplate_a().var_boolean_c = true;
                    GameCanvas.var_game_GameHelper21_a = null;
                    String string = StringUtils.t() + (long)ActionListener097.this.a.var_game_ItemTemplate_a.var_int_e * qty + " " + StringUtils.aq();
                    GameCanvas.b(string, new ActionListener003(ActionListener097.this));
                }
            }, new IActionListener() {
                public final void a() {
                    GameCanvas.var_game_GameHelper21_a = null;
                }
            }, 1);
            GameCanvas.var_game_InputScreen_a.a.a(this.a.var_int_a > 1 ? String.valueOf(this.a.var_int_a) : "1");
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_InputScreen_a;
        } else {
            this.a.var_int_a = 1;
            String string = StringUtils.t() + this.a.var_game_ItemTemplate_a.var_int_e + " " + StringUtils.aq();
            GameCanvas.b(string, new ActionListener003(this));
        }
    }
}
