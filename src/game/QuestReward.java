/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.GameHelper31;
import game.StringUtils;

public final class QuestReward {
    byte var_byte_a;
    byte b;
    int var_int_a;
    public String var_java_lang_String_a;

    public QuestReward(byte by, byte by2, int n) {
        this.var_byte_a = by;
        this.b = by2;
        this.var_int_a = n;
        if (by == 0) {
            this.var_java_lang_String_a = StringUtils.C() + n + " item " + GameHelper31.var_java_lang_String_arr_a[by2] + ".";
        }
        if (by == 1) {
            this.var_java_lang_String_a = StringUtils.C() + n + StringUtils.aq() + ".";
        }
        if (by == 2) {
            this.var_java_lang_String_a = StringUtils.C() + n + "XP.";
        }
        if (by == 3) {
            this.var_java_lang_String_a = StringUtils.B();
        }
    }
}

