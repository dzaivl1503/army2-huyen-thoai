/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package game;

import game.DataUtils;
import game.GameHelper28;
import game.GameHelper34;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class PetEntity {
    public static boolean var_boolean_a;
    public static Image var_javax_microedition_lcdui_Image_a;
    private static Image[] l111lIIl;
    private Image Ill1l1lII1;
    public int[] var_int_arr_a;
    public int var_int_a;
    public int var_int_b;
    public int c;
    public int d;
    public boolean var_boolean_b;
    public int e;
    private boolean I1lI11Illl = false;

    private static byte IIIllII1Il(int n) {
        switch (n) {
            case 0: 
            case 32: {
                return 3;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 0;
            }
            case 3: {
                return 9;
            }
            default: {
                return 0;
            }
            case 6: {
                return 6;
            }
            case 7: 
            case 31: 
            case 37: {
                return 7;
            }
            case 9: {
                return 5;
            }
            case 10: {
                return 4;
            }
            case 11: {
                return 2;
            }
            case 12: {
                return 6;
            }
            case 15: {
                return 7;
            }
            case 17: 
            case 18: {
                return 2;
            }
            case 19: {
                return 2;
            }
            case 20: {
                return 0;
            }
            case 21: {
                return 2;
            }
            case 22: {
                return 7;
            }
            case 24: {
                return 3;
            }
            case 25: {
                return 8;
            }
            case 27: {
                return 1;
            }
            case 30: {
                return 0;
            }
            case 42: 
            case 43: {
                return 7;
            }
            case 44: {
                return 2;
            }
            case 45: {
                return 7;
            }
            case 47: {
                return 8;
            }
            case 48: {
                return 3;
            }
            case 52: {
                return 3;
            }
            case 57: 
        }
        return 7;
    }

    public final void a(Image image) {
        this.Ill1l1lII1 = Image.createImage((Image)image);
        this.var_int_a = this.Ill1l1lII1.getWidth();
        this.var_int_b = this.Ill1l1lII1.getHeight();
        if (!GameHelper34.boolean_a(this.e)) {
            this.var_int_arr_a = new int[this.var_int_a * this.var_int_b];
            this.Ill1l1lII1.getRGB(this.var_int_arr_a, 0, this.var_int_a, 0, 0, this.var_int_a, this.var_int_b);
            System.out.println("[t] TOI DAY 1 ID= " + this.e);
            return;
        }
        this.var_int_arr_a = new int[this.var_int_a * this.var_int_b];
        System.arraycopy(GameHelper34.int_arr_a(this.e), 0, this.var_int_arr_a, 0, this.var_int_a * this.var_int_b);
        System.out.println("[t] TOI DAY 2 ID= " + this.e);
    }

    public PetEntity(int n, int n2, int n3, Image image, boolean bl) {
        this.c = n2;
        this.d = n3;
        this.e = n;
        this.var_boolean_b = bl;
        if (image != null) {
            this.a(image);
        }
    }

    public final void a(Graphics graphics) {
        if (this.Ill1l1lII1 != null) {
            graphics.drawImage(this.Ill1l1lII1, this.c, this.d, 0);
        }
    }

    public final void a() {
        if (this.I1lI11Illl) {
            this.Ill1l1lII1 = Image.createRGBImage((int[])this.var_int_arr_a, (int)this.var_int_a, (int)this.var_int_b, (boolean)true);
            this.I1lI11Illl = false;
        }
    }

    public final void a(int n, int n2, int n3) {
        System.out.println("make hole - x: " + this.c + " y: " + this.d + " bull: " + n3);
        n3 = PetEntity.IIIllII1Il(n3);
        int n4 = l111lIIl[n3].getWidth();
        int n5 = l111lIIl[n3].getHeight();
        int[] nArray = new int[n4 * n5];
        l111lIIl[n3].getRGB(nArray, 0, n4, 0, 0, n4, n5);
        n = n - this.c - n4 / 2;
        n2 = n2 - this.d - n5 / 2;
        for (n3 = 0; n3 < n5; ++n3) {
            for (int i = 0; i < n4; ++i) {
                if (!DataUtils.a(n + i, n2 + n3, 0, 0, this.var_int_a, this.var_int_b)) continue;
                if (nArray[n3 * n4 + i] == -65536 && DataUtils.boolean_a(this.a(n + i, n2 + n3))) {
                    this.var_int_arr_a[(n2 + n3) * this.var_int_a + n + i] = -16777216;
                    continue;
                }
                if (nArray[n3 * n4 + i] != -16777216) continue;
                this.var_int_arr_a[(n2 + n3) * this.var_int_a + n + i] = 0;
            }
        }
        this.I1lI11Illl = true;
    }

    public static int a(int n) {
        return l111lIIl[PetEntity.IIIllII1Il(n)].getWidth();
    }

    public static int b(int n) {
        return l111lIIl[PetEntity.IIIllII1Il(n)].getHeight();
    }

    public final int a(int n, int n2) {
        return this.var_int_arr_a[n2 * this.var_int_a + n];
    }

    static {
        l111lIIl = new Image[10];
        GameHelper28 gameHelper28 = new GameHelper28("/effect/Hole");
        var_javax_microedition_lcdui_Image_a = gameHelper28.a("mangnhen.png");
        PetEntity.l111lIIl[0] = gameHelper28.a("h32x26.png");
        PetEntity.l111lIIl[1] = gameHelper28.a("smallhole.png");
        PetEntity.l111lIIl[2] = gameHelper28.a("smallhole.png");
        PetEntity.l111lIIl[3] = gameHelper28.a("h36x30.png");
        PetEntity.l111lIIl[4] = gameHelper28.a("rocket.png");
        PetEntity.l111lIIl[5] = gameHelper28.a("rangehole.png");
        PetEntity.l111lIIl[6] = gameHelper28.a("hrangcua.png");
        PetEntity.l111lIIl[7] = gameHelper28.a("hgrenade.png");
        PetEntity.l111lIIl[8] = gameHelper28.a("h14x12.png");
        PetEntity.l111lIIl[9] = gameHelper28.a("h55x50.png");
    }
}

