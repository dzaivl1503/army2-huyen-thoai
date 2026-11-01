/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener245
implements IActionListener {
    private GameHelper27 lllllIll11;

    ActionListener245(GameHelper27 gameHelper27) {
        this.lllllIll11 = gameHelper27;
    }

    public final void a() {
        ShopItemEntry shopItemEntry = this.lllllIll11.game_ShopItemEntry_a();
        if (shopItemEntry != null) {
            int n = this.lllllIll11.int_a();
            int n2 = this.lllllIll11.int_b();
            GameHelper43[] gameHelper43Array = this.lllllIll11.game_GameHelper43_arr_a();
            if (n > 0 && TerrainMidlet.myInfo.var_long_c < (long)n) {
                GameHelper27.a(this.lllllIll11, false);
                GameHelper27.game_MarqueeNotice_a(this.lllllIll11).void_a();
                GameHelper27.b(this.lllllIll11).a("Kh\u00f4ng \u0111\u1ee7 xu!");
                GameHelper27.b(this.lllllIll11, true);
                GameHelper27.void_a(this.lllllIll11);
                return;
            }
            if (n2 > 0 && TerrainMidlet.myInfo.e < n2) {
                GameHelper27.a(this.lllllIll11, false);
                GameHelper27.game_MarqueeNotice_a(this.lllllIll11).void_a();
                GameHelper27.b(this.lllllIll11).a("Kh\u00f4ng \u0111\u1ee7 l\u01b0\u1ee3ng!");
                GameHelper27.b(this.lllllIll11, true);
                GameHelper27.void_a(this.lllllIll11);
                return;
            }
            if (gameHelper43Array != null && gameHelper43Array.length > 0) {
                for (n = 0; n < gameHelper43Array.length; ++n) {
                    int n3;
                    GameHelper43 gameHelper43 = gameHelper43Array[n];
                    int n4 = gameHelper43.int_a();
                    if ((n4 = GameHelper27.a(this.lllllIll11, n4)) >= (n3 = gameHelper43.b())) continue;
                    GameHelper27.a(this.lllllIll11, false);
                    GameHelper27.game_MarqueeNotice_a(this.lllllIll11).void_a();
                    GameHelper27.b(this.lllllIll11).a("Kh\u00f4ng \u0111\u1ee7 " + gameHelper43.java_lang_String_a() + "!");
                    GameHelper27.b(this.lllllIll11, true);
                    GameHelper27.void_a(this.lllllIll11);
                    return;
                }
            }
            GameHelper27.game_MarqueeNotice_a(this.lllllIll11).void_a();
            Message message = new Message(55);
            try {
                message.java_io_DataOutputStream_a().writeByte(1);
                message.java_io_DataOutputStream_a().writeInt(shopItemEntry.var_int_a);
                MessageHandler.game_MessageHandler_a().a(message);
                message.void_a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
            GameHelper27.a(this.lllllIll11, false);
            this.lllllIll11.void_b();
        }
    }
}

