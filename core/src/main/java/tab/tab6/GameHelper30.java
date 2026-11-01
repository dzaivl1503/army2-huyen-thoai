/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package tab.tab6;

import javax.microedition.lcdui.Image;

public final class GameHelper30 {
    private static String[] var_java_lang_String_arr_I1I1Il1Il;
    private int var_int_I1I1Il1Il;
    private int var_int_IIIII11l;
    private String[] var_java_lang_String_arr_IIIII11l;
    private String[] var_java_lang_String_arr_II11ll11IIII;
    private String[] I1I1lI1ll1I;
    private String[] I1l1I1I1Il1l;
    private byte[] var_byte_arr_I1I1Il1Il;
    private int var_int_II11ll11IIII = -1;
    private boolean var_boolean_IIIII11l = false;
    private long var_long_I1I1Il1Il;
    private GameHelper29 var_game_GameHelper29_I1I1Il1Il;
    public boolean a = false;

    public GameHelper30() {
        try {
            this.var_game_GameHelper29_I1I1Il1Il = new GameHelper29(Image.createImage((String)"/arrow2.png"), 4, 6);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        this.var_int_I1I1Il1Il = 4;
        this.var_int_IIIII11l = 2;
        this.var_java_lang_String_arr_IIIII11l = new String[]{"-", "Top", "L\u1ef1c max", "-", "Left", "Down", "Right", "OK"};
        this.var_java_lang_String_arr_II11ll11IIII = new String[]{".,?!1", "abc2", "def3", "X\u00f3a", "ghi4", "jkl5", "mno6", "Xong", "pqrs7", "tuv8", "wxyz9", "0"};
        this.I1I1lI1ll1I = new String[]{".,?!1", "ABC2", "DEF3", "X\u00f3a", "GHI4", "JKL5", "MNO6", "Xong", "PQRS7", "TUV8", "WXYZ9", "0"};
        this.I1l1I1I1Il1l = new String[]{"1", "2", "3", "X\u00f3a", "4", "5", "6", "Xong", "7", "8", "9", "0"};
        this.var_byte_arr_I1I1Il1Il = new byte[]{-6, -1, 0, -7, -3, -2, -4, -5};
        this.var_long_I1I1Il1Il = -1L;
        this.Il1lll1l1l();
    }

    private void Il1lll1l1l() {
        switch (MapEntity.e) {
            case 0: 
            case 1: {
                return;
            }
            case 2: {
                return;
            }
            case 3: {
            }
        }
    }

    static {
        var_java_lang_String_arr_I1I1Il1Il = new String[]{"abc", "Abc", "ABC", "123"};
    }
}

