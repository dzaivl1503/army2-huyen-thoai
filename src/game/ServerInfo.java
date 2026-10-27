/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.BattleScreen;
import game.ChatScreen;
import game.GameHelper16;
import game.GameHelper34;
import game.ShopScreen;

public final class ServerInfo {
    public int var_int_a;
    public int var_int_b;
    public int c;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    private boolean I11111ll;
    private int lI11lIl1lI1;
    public static String[] var_java_lang_String_arr_a;
    public static String[] var_java_lang_String_arr_b;
    public static short[] var_short_arr_a;

    public ServerInfo(int n, int n2, int n3) {
        this.var_int_a = n;
        this.var_int_b = n2;
        this.c = n3;
        new ChatScreen(n2, n3, 1);
    }

    public final void a() {
        int n;
        if (this.var_boolean_a) {
            GameHelper16.var_int_a = 2;
            int[][] nArray = BattleScreen.int_arr_arr_a(this.var_int_b, this.c);
            for (n = 0; n < 7; ++n) {
                new ChatScreen(nArray[0][n], nArray[1][n], 7);
            }
            BattleScreen.var_java_util_Vector_a.removeElement(this);
        }
        if (this.var_boolean_b) {
            this.I11111ll = true;
            for (int i = 0; i < 14; ++i) {
                if (!GameHelper34.a(this.var_int_b - 7 + i, this.c)) continue;
                this.I11111ll = false;
                this.lI11lIl1lI1 = 0;
                break;
            }
            this.var_boolean_b = false;
        }
        if (this.I11111ll) {
            int n2 = this.var_int_b;
            n = this.c;
            ++this.lI11lIl1lI1;
            this.c += this.lI11lIl1lI1;
            for (int i = 0; i < 14; ++i) {
                if (!GameHelper34.a(this.var_int_b - 7 + i, this.c)) continue;
                this.I11111ll = false;
                this.lI11lIl1lI1 = 0;
                int[] nArray = ShopScreen.a(n2, n, this.var_int_b, this.c);
                if (nArray == null) break;
                this.c = nArray[1];
                return;
            }
        }
    }
}

