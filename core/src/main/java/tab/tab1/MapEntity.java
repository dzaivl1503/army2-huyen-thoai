/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
package tab.tab1;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;

public final class MapEntity {
    public int var_int_a;
    public int var_int_b;
    public int var_int_c;
    public int d;
    public boolean var_boolean_a;
    private boolean IlllIIllI1 = true;
    private static int Il1lll1l111l = 2;
    private static final int[] var_int_arr_lIl11IIlII;
    private static int ll1lllll1II1;
    private static String[] var_java_lang_String_arr_lIl11IIlII;
    private static String[] var_java_lang_String_arr_IlIll1I11II;
    private String var_java_lang_String_lIl11IIlII = "";
    private String var_java_lang_String_IlIll1I11II = "";
    private String lIlIlIlll = "";
    private int I111lIllIl = 0;
    private int IlI1111II = 0;
    private int I1I1l11I11ll = 500;
    private int lIII111lIll1 = 0;
    private static int l11I11ll1l1;
    private int I1lllIl11IIl = 0;
    private int Ill11lII = 0;
    private int II1l1ll1II = 10;
    private int I1II11lI1 = 0;
    private static boolean II11I1Ill;
    private static int ll1II1IllI;
    public static int e;
    private static int llIIl11I1l;
    public static Canvas var_javax_microedition_lcdui_Canvas_a;
    public static MIDlet var_javax_microedition_midlet_MIDlet_a;
    private static FontRenderer var_game_FontRenderer_lIl11IIlII;
    public GameCommand var_game_GameCommand_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;

    public final void void_a() {
        var_javax_microedition_lcdui_Canvas_a = GameCanvas.var_game_GameCanvas_a;
        var_javax_microedition_midlet_MIDlet_a = TerrainMidlet.instance;
        String title = "Nhập nội dung";
        if (this.I1II11lI1 == 2) {
            title = "Nhập mật khẩu";
        } else if (this.I1II11lI1 == 1) {
            title = "Nhập số";
        } else if (this.I1II11lI1 == 3) {
            title = "Nhập tài khoản";
        }
        TextBox textBox = new TextBox(title, this.var_java_lang_String_lIl11IIlII, this.I1I1l11I11ll, this.I1II11lI1 == 2 ? 65536 : (this.I1II11lI1 == 1 ? 2 : 0));
        textBox.addCommand(new Command("OK", 4, 0));
        textBox.addCommand(new Command("Cancel", 3, 0));
        textBox.setCommandListener((CommandListener)new GameHelper03(this, textBox));
        Display.getDisplay((MIDlet)var_javax_microedition_midlet_MIDlet_a).setCurrent((Displayable)textBox);
    }

    public MapEntity() {
        ll1lllll1II1 = var_game_FontRenderer_lIl11IIlII.a() + 1;
        this.var_game_GameCommand_a = new GameCommand(StringUtils.cfr_renamed_0(), new ActionListener001(this));
        ll1II1IllI = this.var_int_c - 13;
    }

    public final void b() {
        if (this.I111lIllIl > 0 && !this.var_java_lang_String_lIl11IIlII.equals("")) {
            this.var_java_lang_String_lIl11IIlII = this.var_java_lang_String_lIl11IIlII.substring(0, this.I111lIllIl - 1) + this.var_java_lang_String_lIl11IIlII.substring(this.I111lIllIl, this.var_java_lang_String_lIl11IIlII.length());
            --this.I111lIllIl;
            this.l1lIIlI1();
            this.l1I111lI111();
        }
    }

    private void l1lIIlI1() {
        this.lIlIlIlll = this.I1II11lI1 == 2 ? this.var_java_lang_String_IlIll1I11II : this.var_java_lang_String_lIl11IIlII;
        if (this.lIII111lIll1 < 0 && var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll) + this.lIII111lIll1 < this.var_int_c - 4 - 13 - ll1II1IllI) {
            this.lIII111lIll1 = this.var_int_c - 10 - ll1II1IllI - var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll);
        }
        if (this.lIII111lIll1 + var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll.substring(0, this.I111lIllIl)) <= 0) {
            this.lIII111lIll1 = -var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll.substring(0, this.I111lIllIl));
            this.lIII111lIll1 += 40;
        } else if (this.lIII111lIll1 + var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll.substring(0, this.I111lIllIl)) >= this.var_int_c - 12 - ll1II1IllI) {
            this.lIII111lIll1 = this.var_int_c - 10 - ll1II1IllI - var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll.substring(0, this.I111lIllIl)) - 8;
        }
        if (this.lIII111lIll1 > 0) {
            this.lIII111lIll1 = 0;
        }
    }

    private void lll1IlII1l(int n) {
        if ((this.I1II11lI1 != 2 && this.I1II11lI1 != 3 || n >= 48 && n <= 57 || n >= 65 && n <= 90 || n >= 97 && n <= 122) && this.var_java_lang_String_lIl11IIlII.length() < this.I1I1l11I11ll) {
            String string = this.var_java_lang_String_lIl11IIlII.substring(0, this.I111lIllIl) + (char)n;
            if (this.I111lIllIl < this.var_java_lang_String_lIl11IIlII.length()) {
                string = string + this.var_java_lang_String_lIl11IIlII.substring(this.I111lIllIl, this.var_java_lang_String_lIl11IIlII.length());
            }
            this.var_java_lang_String_lIl11IIlII = string;
            ++this.I111lIllIl;
            this.l1I111lI111();
            this.l1lIIlI1();
        }
    }

    public final boolean boolean_a(int n) {
        if (n != 8 && n != -8 && n != 204) {
            if (n >= 65 && n <= 122) {
                II11I1Ill = true;
                ll1II1IllI = 0;
            }
            if (II11I1Ill) {
                if (n == 45) {
                    if (n == l11I11ll1l1 && this.I1lllIl11IIl < var_int_arr_lIl11IIlII[Il1lll1l111l]) {
                        this.lIlIlIlll = this.var_java_lang_String_lIl11IIlII = this.var_java_lang_String_lIl11IIlII.substring(0, this.I111lIllIl - 1) + '_';
                        this.l1I111lI111();
                        this.l1lIIlI1();
                        l11I11ll1l1 = -1984;
                        return false;
                    }
                    l11I11ll1l1 = 45;
                }
                if (n >= 32) {
                    this.lll1IlII1l(n);
                    return false;
                }
            }
            if (n == llIIl11I1l) {
                if (++e > 3) {
                    e = 0;
                }
                this.I1lllIl11IIl = 1;
                l11I11ll1l1 = n;
                return false;
            }
            if (n == 42) {
                n = 58;
            }
            if (n == 35) {
                n = 59;
            }
            if (n >= 48 && n <= 59) {
                if (this.I1II11lI1 != 0 && this.I1II11lI1 != 2 && this.I1II11lI1 != 3) {
                    if (this.I1II11lI1 == 1) {
                        this.lll1IlII1l(n);
                        this.I1lllIl11IIl = 1;
                    }
                } else {
                    String[] strKeys = this.I1II11lI1 != 2 && this.I1II11lI1 != 3 ? var_java_lang_String_arr_lIl11IIlII : var_java_lang_String_arr_IlIll1I11II;
                    if (n == l11I11ll1l1) {
                        this.Ill11lII = (this.Ill11lII + 1) % strKeys[n - 48].length();
                        char c = strKeys[n - 48].charAt(this.Ill11lII);
                        c = e == 0 ? Character.toLowerCase(c) : (e == 1 ? Character.toUpperCase(c) : (e == 2 ? Character.toUpperCase(c) : strKeys[n - 48].charAt(strKeys[n - 48].length() - 1)));
                        String text = this.var_java_lang_String_lIl11IIlII.substring(0, this.I111lIllIl - 1) + c;
                        if (this.I111lIllIl < this.var_java_lang_String_lIl11IIlII.length()) {
                            text = text + this.var_java_lang_String_lIl11IIlII.substring(this.I111lIllIl, this.var_java_lang_String_lIl11IIlII.length());
                        }
                        this.var_java_lang_String_lIl11IIlII = text;
                        this.I1lllIl11IIl = var_int_arr_lIl11IIlII[Il1lll1l111l];
                        this.l1I111lI111();
                    } else if (this.var_java_lang_String_lIl11IIlII.length() < this.I1I1l11I11ll) {
                        if (e == 1 && l11I11ll1l1 != -1984) {
                            e = 0;
                        }
                        this.Ill11lII = 0;
                        char c = strKeys[n - 48].charAt(this.Ill11lII);
                        c = e == 0 ? Character.toLowerCase(c) : (e == 1 ? Character.toUpperCase(c) : (e == 2 ? Character.toUpperCase(c) : strKeys[n - 48].charAt(strKeys[n - 48].length() - 1)));
                        String text = this.var_java_lang_String_lIl11IIlII.substring(0, this.I111lIllIl) + c;
                        if (this.I111lIllIl < this.var_java_lang_String_lIl11IIlII.length()) {
                            text = text + this.var_java_lang_String_lIl11IIlII.substring(this.I111lIllIl, this.var_java_lang_String_lIl11IIlII.length());
                        }
                        this.var_java_lang_String_lIl11IIlII = text;
                        this.I1lllIl11IIl = var_int_arr_lIl11IIlII[Il1lll1l111l];
                        ++this.I111lIllIl;
                        this.l1I111lI111();
                        this.l1lIIlI1();
                    }
                    l11I11ll1l1 = n;
                }
            } else {
                this.Ill11lII = 0;
                l11I11ll1l1 = -1984;
                if (n == 14) {
                    if (this.I111lIllIl > 0) {
                        --this.I111lIllIl;
                        this.l1lIIlI1();
                        this.II1l1ll1II = 10;
                        return false;
                    }
                } else if (n == 15) {
                    if (this.I111lIllIl < this.var_java_lang_String_lIl11IIlII.length()) {
                        ++this.I111lIllIl;
                        this.l1lIIlI1();
                        this.II1l1ll1II = 10;
                        return false;
                    }
                } else {
                    if (n == 19) {
                        this.b();
                        return false;
                    }
                    l11I11ll1l1 = n;
                }
            }
            return true;
        }
        this.b();
        return true;
    }

    public final void a(Graphics graphics) {
        boolean bl = this.var_boolean_a;
        this.lIlIlIlll = this.I1II11lI1 == 2 ? this.var_java_lang_String_IlIll1I11II : this.var_java_lang_String_lIl11IIlII;
        graphics.setColor(1521982);
        if (bl) {
            if (this.IlllIIllI1) {
                graphics.setColor(4156571);
                graphics.fillRect(this.var_int_a + 1, this.var_int_b + 1, this.var_int_c - 1, this.d - 1);
                graphics.setColor(1521982);
                graphics.drawRect(this.var_int_a + 1, this.var_int_b + 1, this.var_int_c - 1, this.d - 1);
            }
        } else {
            graphics.setColor(1521982);
            graphics.fillRect(this.var_int_a + 1, this.var_int_b + 1, this.var_int_c - 1, this.d - 1);
        }
        graphics.setClip(this.var_int_a + 3, this.var_int_b + 1, this.var_int_c - ll1II1IllI - 8, this.d - 4);
        graphics.setColor(0);
        var_game_FontRenderer_lIl11IIlII.a(graphics, this.lIlIlIlll, 4 + this.lIII111lIll1 + this.var_int_a, this.var_int_b + (this.d - var_game_FontRenderer_lIl11IIlII.a()) / 2 + 1, 0);
        if (this.var_boolean_a && this.I1lllIl11IIl == 0 && (this.II1l1ll1II > 0 || this.IlI1111II / 5 % 2 == 0)) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(4 + this.lIII111lIll1 + this.var_int_a + var_game_FontRenderer_lIl11IIlII.a(this.lIlIlIlll.substring(0, this.I111lIllIl)) - 1 + 1, this.var_int_b + (this.d - ll1lllll1II1) / 2 + 1, 1, ll1lllll1II1);
        }
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
    }

    private void l1I111lI111() {
        if (this.I1II11lI1 == 2) {
            this.var_java_lang_String_IlIll1I11II = "";
            for (int i = 0; i < this.var_java_lang_String_lIl11IIlII.length(); ++i) {
                this.var_java_lang_String_IlIll1I11II = this.var_java_lang_String_IlIll1I11II + "*";
            }
            if (this.I1lllIl11IIl > 0 && this.I111lIllIl > 0) {
                this.var_java_lang_String_IlIll1I11II = this.var_java_lang_String_IlIll1I11II.substring(0, this.I111lIllIl - 1) + this.var_java_lang_String_lIl11IIlII.charAt(this.I111lIllIl - 1) + this.var_java_lang_String_IlIll1I11II.substring(this.I111lIllIl, this.var_java_lang_String_IlIll1I11II.length());
            }
        }
    }

    public final void c() {
        ++this.IlI1111II;
        if (this.I1lllIl11IIl > 0) {
            --this.I1lllIl11IIl;
            if (this.I1lllIl11IIl == 0) {
                this.Ill11lII = 0;
                if (e == 1 && l11I11ll1l1 != llIIl11I1l) {
                    e = 0;
                }
                l11I11ll1l1 = -1984;
                this.l1I111lI111();
            }
        }
        if (this.II1l1ll1II > 0) {
            --this.II1l1ll1II;
        }
    }

    public final String java_lang_String_a() {
        return this.var_java_lang_String_lIl11IIlII;
    }

    public final void a(String string) {
        if (string != null) {
            l11I11ll1l1 = -1984;
            this.I1lllIl11IIl = 0;
            this.Ill11lII = 0;
            this.var_java_lang_String_lIl11IIlII = string;
            this.lIlIlIlll = string;
            this.l1I111lI111();
            this.I111lIllIl = string.length();
            this.l1lIIlI1();
        }
    }

    public final void void_a(int n) {
        this.I1II11lI1 = n;
    }

    static {
        var_int_arr_lIl11IIlII = new int[]{18, 14, 11, 9, 6, 4, 2};
        ll1lllll1II1 = 0;
        var_java_lang_String_arr_lIl11IIlII = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb72", "def3\u0111\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec73", "ghi4\u00ed\u00ec\u1ec9\u0129\u1ecb4", "jkl5", "mno6\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee36", "pqrs7", "tuv8\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef18", "wxyz9\u00fd\u1ef3\u1ef7\u1ef9\u1ef59", "*", "#"};
        var_java_lang_String_arr_IlIll1I11II = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
        l11I11ll1l1 = -1984;
        e = 0;
        llIIl11I1l = 11;
        var_javax_microedition_lcdui_Canvas_a = GameCanvas.var_game_GameCanvas_a;
        var_javax_microedition_midlet_MIDlet_a = TerrainMidlet.instance;
        var_game_FontRenderer_lIl11IIlII = FontRenderer.b;
    }
}

