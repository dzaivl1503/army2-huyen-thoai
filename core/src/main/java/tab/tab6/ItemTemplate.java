/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab6;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ItemTemplate {
    private int[][] III1Ill1 = GameHelper19.var_int_arr_arr_a;
    private int[] l11IIIl1 = new int[]{2, 1, 1, 1, 1, 1};
    private static int ll1I11Il = 21;
    private int[] I1l1I11l1 = GameHelper19.var_int_arr_a;
    public int var_int_a;
    public short var_short_a;
    public short[] var_short_arr_a;
    public short[] var_short_arr_b;
    public byte[] var_byte_arr_a;
    public byte[] var_byte_arr_b;
    public byte[] var_byte_arr_c;
    public byte[] var_byte_arr_d;
    public short var_short_b;
    public byte var_byte_a;
    public byte var_byte_b;
    public byte var_byte_c;
    public byte var_byte_d;
    public boolean var_boolean_a;
    public int var_int_b = 1;
    public int var_int_c = 1;
    public boolean var_boolean_b = false;
    public short[] var_short_arr_c = new short[5];
    public int[] var_int_arr_a = new int[5];
    public int[] var_int_arr_b = new int[5];
    private int[] Il11lIlI1I = new int[5];
    private int[] ll11I1I1l1l = new int[5];
    public int var_int_d;
    public byte var_byte_e;
    public String var_java_lang_String_a;
    public int var_int_e;
    public int var_int_f;
    public byte var_byte_f;
    public int var_int_g;
    public boolean var_boolean_c = false;
    public byte var_byte_g;
    public boolean var_boolean_d = false;
    public String var_java_lang_String_b;
    public Image var_javax_microedition_lcdui_Image_a;
    public byte h;
    public boolean var_boolean_e;
    public String var_java_lang_String_c;
    public int[] var_int_arr_c;

    public ItemTemplate(short s, byte by, short[] sArray, short[] sArray2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, short s2, byte by2) {
        this.var_short_a = s;
        this.var_byte_a = by;
        this.var_short_arr_a = new short[6];
        this.var_short_arr_b = new short[6];
        this.var_byte_arr_a = new byte[6];
        this.var_byte_arr_b = new byte[6];
        this.var_byte_arr_c = new byte[6];
        this.var_byte_arr_d = new byte[6];
        for (s = 0; s < 6; s = (short)(s + 1)) {
            this.var_short_arr_a[s] = sArray[s];
            this.var_short_arr_b[s] = sArray2[s];
            this.var_byte_arr_a[s] = byArray[s];
            this.var_byte_arr_b[s] = byArray2[s];
            this.var_byte_arr_c[s] = byArray3[s];
            this.var_byte_arr_d[s] = byArray4[s];
        }
        this.var_short_b = s2;
        this.var_byte_g = by2;
    }

    public ItemTemplate() {
    }

    public final void void_a() {
        for (int i = 0; i < 5; ++i) {
            this.var_short_arr_c[i] = 0;
            short[] sArray = this.var_short_arr_c;
            this.var_short_arr_c[i] = (short)(sArray[i] + this.var_int_arr_a[i]);
            sArray = this.var_short_arr_c;
            this.var_short_arr_c[i] = (short)(sArray[i] + TerrainMidlet.myInfo.var_short_arr_b[i] * this.var_int_arr_b[i] / 100);
        }
    }

    public final void void_b() {
        for (int i = 0; i < 5; ++i) {
            this.var_short_arr_c[i] = 0;
            this.var_int_arr_b[i] = 0;
            this.var_int_arr_a[i] = 0;
        }
    }

    public final void a(ItemTemplate itemTemplate) {
        for (int i = 0; i < 5; ++i) {
            this.var_int_arr_a[i] = itemTemplate.var_int_arr_a[i];
            this.var_short_arr_c[i] = itemTemplate.var_short_arr_c[i];
            this.var_int_arr_b[i] = itemTemplate.var_int_arr_b[i];
        }
    }

    public final void a(int[] nArray) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (n = 0; n < nArray.length; ++n) {
            short[] sArray;
            this.var_short_arr_c[n2] = 0;
            if (n % 2 == 0) {
                sArray = this.var_short_arr_c;
                this.var_short_arr_c[n2] = (short)(sArray[n2] + nArray[n]);
                continue;
            }
            sArray = this.var_short_arr_c;
            this.var_short_arr_c[n2] = (short)(sArray[n2] + TerrainMidlet.myInfo.var_short_arr_b[n2] * nArray[n] / 100);
            ++n2;
        }
        for (n = 0; n < nArray.length; ++n) {
            if (n % 2 == 0) {
                this.var_int_arr_a[n3] = nArray[n];
                ++n3;
                continue;
            }
            this.var_int_arr_b[n4] = nArray[n];
            ++n4;
        }
    }

    public final void b(int[] nArray) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                this.Il11lIlI1I[n] = nArray[i];
                ++n;
                continue;
            }
            this.ll11I1I1l1l[n2] = nArray[i];
            ++n2;
        }
    }

    public final void b(ItemTemplate itemTemplate) {
        this.var_short_b = itemTemplate.var_short_b;
        this.var_byte_b = itemTemplate.var_byte_b;
        this.var_byte_a = itemTemplate.var_byte_a;
        this.var_short_a = itemTemplate.var_short_a;
        this.var_byte_e = itemTemplate.var_byte_e;
        int n = itemTemplate.var_short_arr_a.length;
        this.var_short_arr_a = new short[n];
        this.var_short_arr_b = new short[n];
        this.var_byte_arr_a = new byte[n];
        this.var_byte_arr_b = new byte[n];
        this.var_byte_arr_c = new byte[n];
        this.var_byte_arr_d = new byte[n];
        for (int i = 0; i < n; ++i) {
            this.var_short_arr_a[i] = itemTemplate.var_short_arr_a[i];
            this.var_short_arr_b[i] = itemTemplate.var_short_arr_b[i];
            this.var_byte_arr_a[i] = itemTemplate.var_byte_arr_a[i];
            this.var_byte_arr_b[i] = itemTemplate.var_byte_arr_b[i];
            this.var_byte_arr_c[i] = itemTemplate.var_byte_arr_c[i];
            this.var_byte_arr_d[i] = itemTemplate.var_byte_arr_d[i];
        }
        this.var_byte_g = itemTemplate.var_byte_g;
        this.var_int_a = itemTemplate.var_int_a;
        this.var_byte_f = itemTemplate.var_byte_f;
        this.h = itemTemplate.h;
        this.var_boolean_e = itemTemplate.var_boolean_e;
        this.var_java_lang_String_c = itemTemplate.var_java_lang_String_c;
        this.var_byte_c = itemTemplate.var_byte_c;
        this.var_int_arr_c = itemTemplate.var_int_arr_c;
        this.a(itemTemplate);
    }

    public final String java_lang_String_a() {
        String string = this.var_java_lang_String_c;
        if (this.var_int_arr_a[0] != 0) {
            string = string + StringUtils.aj() + " +" + this.var_int_arr_a[0] + ".";
        }
        if (this.var_int_arr_a[1] != 0) {
            string = string + " " + StringUtils.ak() + " +" + this.var_int_arr_a[1] + ".";
        }
        if (this.var_int_arr_a[2] != 0) {
            string = string + " " + StringUtils.al() + " +" + this.var_int_arr_a[2] + ".";
        }
        if (this.var_int_arr_a[3] != 0) {
            string = string + " " + StringUtils.am() + " +" + this.var_int_arr_a[3] + ".";
        }
        if (this.var_int_arr_a[4] != 0) {
            string = string + " " + StringUtils.an() + " +" + this.var_int_arr_a[4] + ".";
        }
        if (this.var_int_arr_b[0] != 0) {
            string = string + " " + StringUtils.aj() + " +" + this.var_int_arr_b[0] + "%.";
        }
        if (this.var_int_arr_b[1] != 0) {
            string = string + " " + StringUtils.ak() + " +" + this.var_int_arr_b[1] + "%.";
        }
        if (this.var_int_arr_b[2] != 0) {
            string = string + " " + StringUtils.al() + " +" + this.var_int_arr_b[2] + "%.";
        }
        if (this.var_int_arr_b[3] != 0) {
            string = string + " " + StringUtils.am() + " +" + this.var_int_arr_b[3] + "%.";
        }
        if (this.var_int_arr_b[4] != 0) {
            string = string + " " + StringUtils.an() + " +" + this.var_int_arr_b[4] + "%.";
        }
        string = this.var_boolean_e ? string + " V\u0129nh vi\u1ec5n." : (this.var_byte_e != 0 ? string + " " + StringUtils.ai() + ": " + this.var_byte_e + "." : string + " H\u1ebft h\u1ea1n s\u1eed d\u1ee5ng.");
        return string + " " + StringUtils.ah() + " " + this.var_byte_c + ".";
    }

    public final String java_lang_String_b() {
        String string = "";
        if (this.Il11lIlI1I[0] != 0) {
            string = string + StringUtils.aj() + " +" + this.Il11lIlI1I[0] + " ";
        }
        if (this.Il11lIlI1I[1] != 0) {
            string = string + " " + StringUtils.ak() + " +" + this.Il11lIlI1I[1] + " ";
        }
        if (this.Il11lIlI1I[2] != 0) {
            string = string + " " + StringUtils.al() + " +" + this.Il11lIlI1I[2] + " ";
        }
        if (this.Il11lIlI1I[3] != 0) {
            string = string + " " + StringUtils.am() + " +" + this.Il11lIlI1I[3] + " ";
        }
        if (this.Il11lIlI1I[4] != 0) {
            string = string + " " + StringUtils.an() + " +" + this.Il11lIlI1I[4] + " ";
        }
        if (this.ll11I1I1l1l[0] != 0) {
            string = string + " " + StringUtils.aj() + " +" + this.ll11I1I1l1l[0] + "% ";
        }
        if (this.ll11I1I1l1l[1] != 0) {
            string = string + " " + StringUtils.ak() + " +" + this.ll11I1I1l1l[1] + "% ";
        }
        if (this.ll11I1I1l1l[2] != 0) {
            string = string + " " + StringUtils.al() + " +" + this.ll11I1I1l1l[2] + "% ";
        }
        if (this.ll11I1I1l1l[3] != 0) {
            string = string + " " + StringUtils.am() + " +" + this.ll11I1I1l1l[3] + "% ";
        }
        if (this.ll11I1I1l1l[4] != 0) {
            string = string + " " + StringUtils.an() + " +" + this.ll11I1I1l1l[4] + "%";
        }
        return string;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        if (this.var_byte_b == 0 || this.var_byte_b == 1 || this.var_byte_b == 2 || this.var_byte_b == 4 || this.var_byte_b == 5 || this.var_byte_b == 8 || this.var_byte_b == 9) {
            n5 = 24;
            n6 = 24;
        }
        if (this.var_byte_b == 3) {
            n5 = 30;
            n6 = 32;
        }
        if (this.var_byte_b == 6) {
            n5 = 29;
            n6 = 24;
        }
        if (this.var_byte_b == 7) {
            n5 = 32;
            n6 = 32;
        }
        if (n2 < 6) {
            if (n == 0) {
                DataUtils.a(graphics, EquipSlotSet.var_javax_microedition_lcdui_Image_arr_a[this.var_byte_b], this.var_short_arr_a[n2], this.var_short_arr_b[n2], this.var_byte_arr_a[n2], this.var_byte_arr_b[n2], n, n3 - n5 / 2 + this.var_byte_arr_c[n2] + 18, n4 - n6 + this.var_byte_arr_d[n2] + 40, 0);
            }
            if (n == 2) {
                DataUtils.a(graphics, EquipSlotSet.var_javax_microedition_lcdui_Image_arr_a[this.var_byte_b], this.var_short_arr_a[n2], this.var_short_arr_b[n2], this.var_byte_arr_a[n2], this.var_byte_arr_b[n2], n, n3 + n5 / 2 - (this.var_byte_arr_c[n2] + 18), n4 - n6 + this.var_byte_arr_d[n2] + 40, 24);
            }
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        try {
            if (!this.var_boolean_d) {
                if (EquipScreen.var_javax_microedition_lcdui_Image_arr_a == null || EquipScreen.var_javax_microedition_lcdui_Image_arr_a.length == 0 || EquipScreen.var_javax_microedition_lcdui_Image_arr_a[0] == null) {
                    return;
                }
                int n3 = EquipScreen.var_javax_microedition_lcdui_Image_arr_a[0].getWidth();
                n3 = this.var_short_b * n3;
                int n4 = n3 / 1024;
                n3 %= 1024;
                if (n4 >= EquipScreen.var_javax_microedition_lcdui_Image_arr_a.length || EquipScreen.var_javax_microedition_lcdui_Image_arr_a[n4] == null) {
                    return;
                }
                if (this.h > 0) {
                    int n5;
                    int n6;
                    int n7;
                    n -= 3;
                    n2 -= 3;
                    if (this.h >= 4) {
                        graphics.setColor(this.I1l1I11l1[this.h <= 16 ? (int)this.h : 16]);
                        graphics.fillRect(n + 1 + 1, n2 + 1 + 1, ll1I11Il - 1 - 2, ll1I11Il - 1 - 2);
                    }
                    Graphics graphics2 = graphics;
                    byte by = this.h;
                    int n8 = n2 + ll1I11Il / 2;
                    int n9 = n + ll1I11Il / 2;
                    ItemTemplate itemTemplate = this;
                    int n10 = ll1I11Il - 2;
                    int n11 = by >= 4 ? (by < 8 ? 1 : (by < 12 ? 2 : (by > 14 ? 4 : 3))) : 0;
                    for (n7 = 0; n7 < itemTemplate.l11IIIl1.length; ++n7) {
                        n6 = n9 - n10 / 2 + ItemTemplate.lIlllIl1l(GameCanvas.var_int_a - (n7 << 2));
                        n5 = n8 - n10 / 2 + ItemTemplate.I1ll1Il1Il(GameCanvas.var_int_a - (n7 << 2));
                        graphics2.setColor(itemTemplate.III1Ill1[n11][n7]);
                        graphics2.fillRect(n6 - itemTemplate.l11IIIl1[n7] / 2, n5 - itemTemplate.l11IIIl1[n7] / 2, itemTemplate.l11IIIl1[n7], itemTemplate.l11IIIl1[n7]);
                    }
                    if (by == 4 || by == 8) {
                        for (n7 = 0; n7 < itemTemplate.l11IIIl1.length; ++n7) {
                            n6 = n9 - n10 / 2 + ItemTemplate.lIlllIl1l(GameCanvas.var_int_a - (n10 << 1) - (n7 << 2));
                            n5 = n8 - n10 / 2 + ItemTemplate.I1ll1Il1Il(GameCanvas.var_int_a - (n10 << 1) - (n7 << 2));
                            graphics2.setColor(itemTemplate.III1Ill1[n11 - 1][n7]);
                            graphics2.fillRect(n6 - itemTemplate.l11IIIl1[n7] / 2, n5 - itemTemplate.l11IIIl1[n7] / 2, itemTemplate.l11IIIl1[n7], itemTemplate.l11IIIl1[n7]);
                        }
                    }
                    if (by != 1 && by != 4 && by != 8) {
                        for (n7 = 0; n7 < itemTemplate.l11IIIl1.length; ++n7) {
                            n6 = n9 - n10 / 2 + ItemTemplate.lIlllIl1l(GameCanvas.var_int_a - (n10 << 1) - (n7 << 2));
                            n5 = n8 - n10 / 2 + ItemTemplate.I1ll1Il1Il(GameCanvas.var_int_a - (n10 << 1) - (n7 << 2));
                            graphics2.setColor(itemTemplate.III1Ill1[n11][n7]);
                            graphics2.fillRect(n6 - itemTemplate.l11IIIl1[n7] / 2, n5 - itemTemplate.l11IIIl1[n7] / 2, itemTemplate.l11IIIl1[n7], itemTemplate.l11IIIl1[n7]);
                        }
                    }
                    if (by != 1 && by != 4 && by != 8 && by != 12 && by != 2 && by != 5 && by != 9) {
                        for (n7 = 0; n7 < itemTemplate.l11IIIl1.length; ++n7) {
                            n6 = n9 - n10 / 2 + ItemTemplate.lIlllIl1l(GameCanvas.var_int_a - n10 - (n7 << 2));
                            n5 = n8 - n10 / 2 + ItemTemplate.I1ll1Il1Il(GameCanvas.var_int_a - n10 - (n7 << 2));
                            graphics2.setColor(itemTemplate.III1Ill1[n11][n7]);
                            graphics2.fillRect(n6 - itemTemplate.l11IIIl1[n7] / 2, n5 - itemTemplate.l11IIIl1[n7] / 2, itemTemplate.l11IIIl1[n7], itemTemplate.l11IIIl1[n7]);
                        }
                    }
                    if (by != 1 && by != 4 && by != 8 && by != 12 && by != 2 && by != 5 && by != 9 && by != 13 && by != 3 && by != 6 && by != 10 && by != 15) {
                        for (n7 = 0; n7 < itemTemplate.l11IIIl1.length; ++n7) {
                            n6 = n9 - n10 / 2 + ItemTemplate.lIlllIl1l(GameCanvas.var_int_a - n10 * 3 - (n7 << 2));
                            n5 = n8 - n10 / 2 + ItemTemplate.I1ll1Il1Il(GameCanvas.var_int_a - n10 * 3 - (n7 << 2));
                            graphics2.setColor(itemTemplate.III1Ill1[n11][n7]);
                            graphics2.fillRect(n6 - itemTemplate.l11IIIl1[n7] / 2, n5 - itemTemplate.l11IIIl1[n7] / 2, itemTemplate.l11IIIl1[n7], itemTemplate.l11IIIl1[n7]);
                        }
                    }
                    n += 3;
                    n2 += 3;
                }
                DataUtils.a(graphics, EquipScreen.var_javax_microedition_lcdui_Image_arr_a[n4], 0, n3, 16, 16, 0, n, n2, 0);
                if (this.h > 0) {
                    FontRenderer.g.a(graphics, "+" + this.h, n + 11, n2 - 3, 0);
                }
                return;
            }
            if (this.var_javax_microedition_lcdui_Image_a != null) {
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, n + 8, n2 + 8, 3);
            }
            if (this.var_int_b > 1) {
                FontRenderer.h.a(graphics, String.valueOf(this.var_int_b), n + 11, n2 + 11, 0);
            }
            if (this.var_int_c > 1 && !this.var_boolean_c || this.var_int_c > 0 && this.var_boolean_c) {
                FontRenderer.g.a(graphics, String.valueOf(this.var_int_c), n + 11, n2, 0);
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static int I1ll1Il1Il(int n) {
        int n2 = ll1I11Il - 2;
        if ((n %= n2 << 2) >= 0 && n < n2) {
            return 0;
        }
        if (n2 <= n && n < n2 << 1) {
            return n % n2;
        }
        if (n2 << 1 <= n && n < n2 * 3) {
            return n2;
        }
        return n2 - n % n2;
    }

    private static int lIlllIl1l(int n) {
        int n2 = ll1I11Il - 2;
        if ((n %= n2 << 2) >= 0 && n < n2) {
            return n % n2;
        }
        if (n2 <= n && n < n2 << 1) {
            return n2;
        }
        if (n2 << 1 <= n && n < n2 * 3) {
            return n2 - n % n2;
        }
        return 0;
    }
}

