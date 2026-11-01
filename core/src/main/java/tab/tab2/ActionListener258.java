/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener258
implements IActionListener {
    private final GameSetting lll1l1l1IlI;

    ActionListener258(GameSetting gameSetting) {
        this.lll1l1l1IlI = gameSetting;
    }

    public final void a() {
        String string = this.lll1l1l1IlI.var_game_MapEntity_a.java_lang_String_a().toLowerCase().trim();
        String string2 = this.lll1l1l1IlI.var_game_MapEntity_b.java_lang_String_a();
        if (string.equals("")) {
            GameCanvas.void_a(StringUtils.bR());
            return;
        }
        if (string2.equals("")) {
            GameCanvas.var_game_GameHelper20_a.a(StringUtils.bX(), null, new GameCommand("OK", new ActionListener071(this.lll1l1l1IlI)), null);
            GameCanvas.var_game_GameHelper21_a = GameCanvas.var_game_GameHelper20_a;
            return;
        }
        if (ServerInfo.var_java_lang_String_arr_a != null && ServerInfo.var_java_lang_String_arr_a.length != 0) {
            this.lll1l1l1IlI.var_byte_a = (byte)4;
            this.lll1l1l1IlI.var_int_d = DataUtils.int_a("mcntn_data");
            if (this.lll1l1l1IlI.var_int_d < 0) {
                this.lll1l1l1IlI.var_int_d = 0;
            }
            this.lll1l1l1IlI.g = new GameCommand(StringUtils.dF(), new ActionListener101(this.lll1l1l1IlI));
            this.lll1l1l1IlI.f = new GameCommand(StringUtils.dJ(), new ActionListener032());
            this.lll1l1l1IlI.h = new GameCommand(StringUtils.dH(), new ActionListener218(this.lll1l1l1IlI));
            return;
        }
        new Thread(new GameHelper04(this.lll1l1l1IlI)).start();
        this.lll1l1l1IlI.var_int_d = 0;
    }
}

