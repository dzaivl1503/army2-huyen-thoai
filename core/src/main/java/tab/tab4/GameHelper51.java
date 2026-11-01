/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab4;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper51 {
    private short var_short_llIIl1111l11;
    private Image var_javax_microedition_lcdui_Image_llIIl1111l11;
    private GameHelper53 var_game_GameHelper53_llIIl1111l11;
    private int var_int_llIIl1111l11;
    private boolean var_boolean_llIIl1111l11;

    public GameHelper51(short s) {
        this.var_short_llIIl1111l11 = s;
        if (EffectCache.boolean_a(s)) {
            this.IIIIll11l(s);
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().c(s);
    }

    private void IIIIll11l(short s) {
        this.var_javax_microedition_lcdui_Image_llIIl1111l11 = EffectCache.javax_microedition_lcdui_Image_a(s);
        this.var_game_GameHelper53_llIIl1111l11 = EffectCache.game_GameHelper53_a(s);
        this.var_boolean_llIIl1111l11 = true;
    }

    public final void void_a() {
        if (this.var_boolean_llIIl1111l11) {
            ++this.var_int_llIIl1111l11;
            if (this.var_int_llIIl1111l11 >= this.var_game_GameHelper53_llIIl1111l11.var_short_arr_a.length) {
                this.var_int_llIIl1111l11 = 0;
                return;
            }
        } else if (EffectCache.boolean_a(this.var_short_llIIl1111l11)) {
            this.IIIIll11l(this.var_short_llIIl1111l11);
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        if (this.var_boolean_llIIl1111l11) {
            int n4 = n3;
            int n5 = n2;
            int n6 = n;
            n3 = this.var_int_llIIl1111l11;
            Image image = this.var_javax_microedition_lcdui_Image_llIIl1111l11;
            GameHelper53 gameHelper53 = this.var_game_GameHelper53_llIIl1111l11;
            if (gameHelper53 == null || image == null) {
                return;
            }
            if (n3 < 0 || n3 >= gameHelper53.var_short_arr_a.length) {
                return;
            }
            if ((n3 = gameHelper53.var_short_arr_a[n3]) < 0 || n3 >= gameHelper53.var_game_ClanRankEntry_arr_a.length) {
                return;
            }
            ClanRankEntry clanRankEntry = gameHelper53.var_game_ClanRankEntry_arr_a[n3];
            for (int i = 0; i < clanRankEntry.var_byte_arr_a.length; ++i) {
                int n7;
                Object object;
                int n8;
                GameHelper53 gameHelper532;
                int n9;
                block9: {
                    n9 = clanRankEntry.var_byte_arr_a[i];
                    gameHelper532 = gameHelper53;
                    for (n8 = 0; n8 < gameHelper532.var_game_ClanBattleSlot_arr_a.length; ++n8) {
                        if (gameHelper532.var_game_ClanBattleSlot_arr_a[n8].var_byte_a != n9) continue;
                        object = gameHelper532.var_game_ClanBattleSlot_arr_a[n8];
                        break block9;
                    }
                    object = gameHelper532 = null;
                }
                if (object == null) continue;
                n9 = clanRankEntry.var_short_arr_a[i];
                n8 = clanRankEntry.var_short_arr_b[i];
                int n10 = n7 = clanRankEntry.var_boolean_arr_a[i] ? 2 : 0;
                if (n4 == 0) {
                    if (n7 == 2) {
                        n7 = 0;
                        n9 += ((ClanBattleSlot)((Object)gameHelper532)).c;
                    } else {
                        n7 = 2;
                        n9 = -(n9 + ((ClanBattleSlot)((Object)gameHelper532)).c);
                    }
                }
                DataUtils.a(graphics, image, ((ClanBattleSlot)((Object)gameHelper532)).var_int_a, ((ClanBattleSlot)((Object)gameHelper532)).b, ((ClanBattleSlot)((Object)gameHelper532)).c, ((ClanBattleSlot)((Object)gameHelper532)).d, n7, n6 + n9, n5 + n8, 0);
            }
        }
    }

    public final short short_a() {
        return this.var_short_llIIl1111l11;
    }
}

