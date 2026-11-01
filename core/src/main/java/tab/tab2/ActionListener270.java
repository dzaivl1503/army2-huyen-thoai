/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener270
implements IActionListener {
    private GameHelper41 I1IlIll1;

    ActionListener270(GameHelper41 gameHelper41) {
        this.I1IlIll1 = gameHelper41;
    }

    public final void a() {
        ItemTemplate itemTemplate = this.I1IlIll1.game_ItemTemplate_a();
        if (itemTemplate != null) {
            int n = this.I1IlIll1.int_a();
            int n2 = this.I1IlIll1.int_b();
            GameHelper43[] gameHelper43Array = this.I1IlIll1.game_GameHelper43_arr_a();
            if (n > 0 && TerrainMidlet.myInfo.var_long_c < (long)n) {
                GameHelper41.a(this.I1IlIll1, false);
                GameHelper41.game_MarqueeNotice_a(this.I1IlIll1).void_a();
                GameHelper41.b(this.I1IlIll1).a("Kh\u00f4ng \u0111\u1ee7 xu!");
                GameHelper41.b(this.I1IlIll1, true);
                GameHelper41.void_a(this.I1IlIll1);
                return;
            }
            if (n2 > 0 && TerrainMidlet.myInfo.e < n2) {
                GameHelper41.a(this.I1IlIll1, false);
                GameHelper41.game_MarqueeNotice_a(this.I1IlIll1).void_a();
                GameHelper41.b(this.I1IlIll1).a("Kh\u00f4ng \u0111\u1ee7 l\u01b0\u1ee3ng!");
                GameHelper41.b(this.I1IlIll1, true);
                GameHelper41.void_a(this.I1IlIll1);
                return;
            }
            if (gameHelper43Array != null && gameHelper43Array.length > 0) {
                for (n = 0; n < gameHelper43Array.length; ++n) {
                    int n3;
                    GameHelper43 gameHelper43 = gameHelper43Array[n];
                    int n4 = gameHelper43.int_a();
                    if ((n4 = GameHelper41.a(this.I1IlIll1, n4)) >= (n3 = gameHelper43.b())) continue;
                    GameHelper41.a(this.I1IlIll1, false);
                    GameHelper41.game_MarqueeNotice_a(this.I1IlIll1).void_a();
                    GameHelper41.b(this.I1IlIll1).a("Kh\u00f4ng \u0111\u1ee7 " + gameHelper43.java_lang_String_a() + "!");
                    GameHelper41.b(this.I1IlIll1, true);
                    GameHelper41.void_a(this.I1IlIll1);
                    return;
                }
            }
            GameHelper41.game_MarqueeNotice_a(this.I1IlIll1).void_a();
            ConnectionWatchdog.game_ConnectionWatchdog_a().i(itemTemplate.var_int_a);
            GameHelper41.a(this.I1IlIll1, false);
            this.I1IlIll1.void_b();
        }
    }
}

