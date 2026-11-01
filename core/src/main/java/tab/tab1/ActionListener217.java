package tab.tab1;


final class ActionListener217
implements IActionListener {
    final GameHelper48 a;

    ActionListener217(GameHelper48 gameHelper48) {
        this.a = gameHelper48;
    }

    public final void a() {
        if (this.a.var_int_a > 0 && this.a.var_boolean_a) {
            int qty = this.a.var_int_a;
            String string = StringUtils.t() + DataUtils.a((long)this.a.var_game_ItemTemplate_a.var_int_f * qty) + " " + StringUtils.ar();
            GameCanvas.b(string, new ActionListener132(this));
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
                    ActionListener217.this.a.var_boolean_a = true;
                    ActionListener217.this.a.var_int_a = qty;
                    ActionListener217.this.a.game_ItemTemplate_a().var_int_c = qty;
                    ActionListener217.this.a.game_ItemTemplate_a().var_boolean_c = true;
                    GameCanvas.var_game_GameHelper21_a = null;
                    String string = StringUtils.t() + DataUtils.a((long)ActionListener217.this.a.var_game_ItemTemplate_a.var_int_f * qty) + " " + StringUtils.ar();
                    GameCanvas.b(string, new ActionListener132(ActionListener217.this));
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
            String string = StringUtils.t() + DataUtils.a((long)this.a.var_game_ItemTemplate_a.var_int_f) + " " + StringUtils.ar();
            GameCanvas.b(string, new ActionListener132(this));
        }
    }
}
