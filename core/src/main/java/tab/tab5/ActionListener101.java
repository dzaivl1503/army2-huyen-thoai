/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener101
implements IActionListener {
    private GameSetting IIIIlI1ll;

    ActionListener101(GameSetting gameSetting) {
        this.IIIIlI1ll = gameSetting;
    }

    public final void a() {
        if (ServerInfo.var_java_lang_String_arr_a != null && ServerInfo.var_java_lang_String_arr_a.length != 0) {
            TerrainMidlet.serverHost = ServerInfo.var_java_lang_String_arr_b[this.IIIIlI1ll.var_int_d];
            TerrainMidlet.serverPort = ServerInfo.var_short_arr_a[this.IIIIlI1ll.var_int_d];
            System.out.println("[lb] IP= " + TerrainMidlet.serverHost + " PORT= " + TerrainMidlet.serverPort);
            this.IIIIlI1ll.f();
            DataUtils.a("mcntn_data", this.IIIIlI1ll.var_int_d);
        }
    }
}

