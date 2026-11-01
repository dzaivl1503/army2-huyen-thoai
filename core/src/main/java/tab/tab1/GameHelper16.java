/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab1;

import javax.microedition.lcdui.Graphics;

public final class GameHelper16 {
    public static byte var_byte_a;
    public static int var_int_a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private int lI1IIIIIl1Il;
    private int lllI11Il1;
    private int lIlllIIl;
    private ShopScreen lIl1Il11l;
    private int lIl1llll11 = 0;
    public static int f;
    public static int g;
    private int l1111IIlIll = 20;

    public GameHelper16() {
        d = 0;
        e = 0;
        var_int_a = 0;
    }

    public final void a(int n) {
        var_byte_a = 1;
        this.lIlllIIl = n;
    }

    public final void a(ShopScreen shopScreen) {
        var_byte_a = (byte)2;
        this.lIl1Il11l = shopScreen;
    }

    public final void b(ShopScreen shopScreen) {
        var_byte_a = (byte)7;
        this.lIl1Il11l = shopScreen;
    }

    public final void c(ShopScreen shopScreen) {
        var_byte_a = (byte)6;
        this.lIl1Il11l = shopScreen;
    }

    public final void d(ShopScreen shopScreen) {
        var_byte_a = (byte)8;
        this.lIl1Il11l = shopScreen;
    }

    public final void a(int n, int n2) {
        var_byte_a = (byte)4;
        this.lI1IIIIIl1Il = n - GameCanvas.var_int_b / 2;
        this.lllI11Il1 = n2 - GameCanvas.var_int_c / 2;
    }

    public final void a() {
        int n;
        d = b;
        e = c;
        int n2 = 0;
        switch (var_byte_a) {
            case 0: {
                b += f;
                if (f != 0) {
                    f = 0;
                }
                c += g;
                if (g == 0) break;
                g = 0;
                break;
            }
            case 1: {
                if (BattleManager.var_game_PlayerEntity_arr_a[this.lIlllIIl] == null) break;
                if (BattleManager.var_game_PlayerEntity_arr_a[this.lIlllIIl].var_int_t == 0) {
                    n2 = BattleManager.var_game_PlayerEntity_arr_a[this.lIlllIIl].var_int_g - 40 - GameCanvas.var_int_b / 2;
                } else if (BattleManager.var_game_PlayerEntity_arr_a[this.lIlllIIl].var_int_t == 2) {
                    n2 = BattleManager.var_game_PlayerEntity_arr_a[this.lIlllIIl].var_int_g + 40 - GameCanvas.var_int_b / 2;
                }
                n = BattleManager.var_game_PlayerEntity_arr_a[this.lIlllIIl].var_int_h - GameCanvas.var_int_c / 2 - 12;
                GameHelper16.I11I1I1Il1ll(n2, n, 3);
                break;
            }
            case 2: {
                if (this.lIl1Il11l.var_byte_a == 37 && (this.lIl1Il11l.c == -90 || this.lIl1Il11l.c == 270) && this.lIl1Il11l.var_short_arr_b[this.lIl1Il11l.d] <= -300) break;
                n2 = this.lIl1Il11l.var_short_arr_a[this.lIl1Il11l.d] - GameCanvas.var_int_b / 2;
                n = this.lIl1Il11l.var_short_arr_b[this.lIl1Il11l.d] - GameCanvas.var_int_c / 2;
                if (this.lIl1Il11l.var_byte_a != 37) {
                    GameHelper16.I11I1I1Il1ll(n2, n, 2);
                    break;
                }
                GameHelper16.I11I1I1Il1ll(n2, n, 1);
                break;
            }
            case 3: {
                n2 = CharacterSelectScreen.d - GameCanvas.var_int_b / 4;
                n = CharacterSelectScreen.e - GameCanvas.var_int_c / 2;
                GameHelper16.I11I1I1Il1ll(n2, n, 2);
                break;
            }
            case 4: {
                n2 = this.lI1IIIIIl1Il;
                n = this.lllI11Il1;
                GameHelper16.I11I1I1Il1ll(n2, n, 2);
                break;
            }
            case 5: {
                n2 = this.lI1IIIIIl1Il;
                n = this.lllI11Il1;
                GameHelper16.I11I1I1Il1ll(n2, n, 3);
                break;
            }
            case 6: {
                n2 = this.lIl1Il11l.var_short_arr_a[this.lIl1Il11l.d] - GameCanvas.var_int_b / 2;
                n = this.lIl1Il11l.var_short_arr_b[this.lIl1Il11l.d] - GameCanvas.var_int_c / 3;
                GameHelper16.I11I1I1Il1ll(n2, n, 1);
                break;
            }
            case 7: {
                n2 = this.lIl1Il11l.var_short_arr_a[this.lIl1Il11l.d] - GameCanvas.var_int_b / 2;
                n = this.lIl1Il11l.var_short_arr_b[this.lIl1Il11l.d] - GameCanvas.var_int_c / 3;
                GameHelper16.I11I1I1Il1ll(n2, n, 1);
                break;
            }
            case 8: {
                n2 = BattleManager.game_PlayerEntity_a().var_int_g - GameCanvas.var_int_b / 2;
                n = this.lIl1Il11l.var_short_arr_b[this.lIl1Il11l.d] - GameCanvas.var_int_c / 2;
                GameHelper16.I11I1I1Il1ll(n2, n, 2);
            }
        }
        if (var_int_a != 0) {
            if (var_int_a == 1) {
                b += DataUtils.b(-5, 5);
                c += DataUtils.b(-5, 5);
            } else if (var_int_a == 2) {
                b += DataUtils.b(-20, 20);
                c += DataUtils.b(-20, 20);
            } else if (var_int_a == 3) {
                c = GameCanvas.var_int_a % 3 == 0 ? (c += this.l1111IIlIll) : (c -= this.l1111IIlIll);
                if (this.lIl1llll11 % 2 == 0) {
                    --this.l1111IIlIll;
                }
                if (this.l1111IIlIll < 0) {
                    this.l1111IIlIll = 0;
                }
            }
            ++this.lIl1llll11;
            if (this.lIl1llll11 > (var_int_a == 3 ? 30 : 10)) {
                this.l1111IIlIll = 20;
                var_int_a = 0;
                this.lIl1llll11 = 0;
            }
        }
        if (var_byte_a != 5) {
            n2 = GameHelper34.var_int_b;
            n = GameHelper34.var_int_a;
            if (c < -1000) {
                c = -1000;
            }
            if (c > n2 - GameCanvas.var_int_c) {
                e = c = n2 - GameCanvas.var_int_c;
            }
            if (b < 0) {
                b = 0;
            }
            if (b > n - GameCanvas.var_int_b) {
                b = n - GameCanvas.var_int_b;
            }
        }
    }

    private static void I11I1I1Il1ll(int n, int n2, int n3) {
        if (b != n) {
            n = b - n;
            b -= n >> n3;
        }
        if (c != n2) {
            n = c - n2;
            c -= n >> n3;
        }
    }

    public static void a(Graphics graphics) {
        graphics.translate(-b, -c);
    }

    static {
        var_int_a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
    }
}

