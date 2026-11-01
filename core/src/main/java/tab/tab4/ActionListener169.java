/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener169
implements IActionListener {
    private GameSetting Illl1l1l;

    ActionListener169(GameSetting gameSetting) {
        this.Illl1l1l = gameSetting;
    }

    public final void a() {
        if (!this.Illl1l1l.var_java_lang_String_a.equals("")) {
            try {
                TerrainMidlet.instance.platformRequest("tel:" + this.Illl1l1l.var_java_lang_String_a);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }
}

