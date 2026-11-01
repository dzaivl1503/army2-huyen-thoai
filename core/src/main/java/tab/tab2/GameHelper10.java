/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;

import java.util.Vector;

public final class GameHelper10 {
    public boolean var_boolean_a;
    public Vector var_java_util_Vector_a;
    public int var_int_a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public int l;
    private int IIIlll1I = 0;
    private boolean IIIIllI111 = false;

    public final void a(Vector vector, int n) {
        int n2;
        int n3;
        this.var_java_util_Vector_a = vector;
        this.l = GameCanvas.var_boolean_d ? 10 : 0;
        this.d = 0;
        this.e = 0;
        for (n3 = 0; n3 < vector.size(); ++n3) {
            GameCommand gameCommand = (GameCommand)vector.elementAt(n3);
            n2 = FontRenderer.a.a(gameCommand.var_java_lang_String_a);
            if (n2 > this.d) {
                this.d = n2;
            }
            this.e += BaseScreen.var_int_o + this.l;
        }
        this.d += 10;
        if (this.d < 115) {
            this.d = 115;
        }
        this.e += 4;
        this.b = n == 0 ? 2 : (n == 1 ? GameCanvas.var_int_b - this.d - 2 : (GameCanvas.var_int_b >> 1) - (this.d >> 1));
        this.c = GameCanvas.var_int_c - 21 - this.e - 6 - this.l;
        this.f = GameCanvas.var_int_c - (BaseScreen.var_int_o + this.l);
        n3 = (GameCanvas.var_int_c - BaseScreen.var_int_r - 10) / (BaseScreen.var_int_o + this.l);
        int n4 = n2 = GameCanvas.var_boolean_d ? n3 : 7;
        if (vector.size() > n2) {
            this.c = GameCanvas.var_int_c - (BaseScreen.var_int_o + this.l) * n2 - 31 - this.l;
            this.e = (BaseScreen.var_int_o + this.l) * n2 + 4;
        }
        if (GameCanvas.var_int_c < 200 && !GameCanvas.var_boolean_d) {
            this.c += 10;
        }
        this.var_boolean_a = true;
        this.var_int_a = 0;
        k = this.var_java_util_Vector_a.size() * (BaseScreen.var_int_o + this.l) - (BaseScreen.var_int_o + this.l) * n2;
        if (k < 0) {
            k = 0;
        }
        g = 0;
        h = 0;
    }

    public final void a() {
        if (GameCanvas.var_boolean_arr_a[2]) {
            --this.var_int_a;
            if (this.var_int_a < 0) {
                this.var_int_a = this.var_java_util_Vector_a.size() - 1;
            }
            g = this.var_int_a * (BaseScreen.var_int_o + this.l) - 2 * (BaseScreen.var_int_o + this.l);
        } else if (GameCanvas.var_boolean_arr_a[8]) {
            ++this.var_int_a;
            if (this.var_int_a > this.var_java_util_Vector_a.size() - 1) {
                this.var_int_a = 0;
            }
            g = this.var_int_a * (BaseScreen.var_int_o + this.l) - 2 * (BaseScreen.var_int_o + this.l);
        } else if (!(GameCanvas.var_boolean_arr_a[5] || GameCanvas.var_boolean_arr_a[12] || BaseScreen.boolean_a((byte)2) || BaseScreen.boolean_a((byte)0))) {
            if (GameCanvas.var_boolean_arr_a[13] || BaseScreen.boolean_a((byte)1)) {
                this.var_boolean_a = false;
            }
        } else {
            this.var_boolean_a = false;
            if (this.var_java_util_Vector_a.size() > 0) {
                ((GameCommand)this.var_java_util_Vector_a.elementAt((int)this.var_int_a)).var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_b) {
            if (!this.IIIIllI111) {
                this.IIIlll1I = h;
                this.IIIIllI111 = true;
            }
            g = this.IIIlll1I + (GameCanvas.h - GameCanvas.g);
        }
        if (GameCanvas.var_boolean_c) {
            this.IIIIllI111 = false;
            if (Math.abs(GameCanvas.h - GameCanvas.g) < 10 && GameCanvas.a(this.b, this.c, this.d, this.e)) {
                this.IIIIllI111 = false;
                int n = (GameCanvas.g - this.f + h) / (BaseScreen.var_int_o + this.l);
                if (this.var_int_a != n) {
                    this.var_int_a = n;
                } else {
                    this.var_boolean_a = false;
                    if (this.var_java_util_Vector_a.size() > 0) {
                        ((GameCommand)this.var_java_util_Vector_a.elementAt((int)this.var_int_a)).var_game_IActionListener_a.a();
                    }
                }
            }
        }
        if (g > k) {
            g = k;
        }
        if (g < 0) {
            g = 0;
        }
        if (this.var_int_a == this.var_java_util_Vector_a.size() - 1 || this.var_int_a == 0) {
            h = g;
        }
        BaseScreen.m();
    }
}

