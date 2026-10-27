/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.DataUtils;
import game.GameSetting;
import game.IActionListener;
import game.ServerInfo;
import game.TerrainMidlet;

final class ActionListener082
implements IActionListener {
    private GameSetting l1IIlIlll;

    ActionListener082(GameSetting gameSetting) {
        this.l1IIlIlll = gameSetting;
    }

    public final void a() {
        if (ServerInfo.var_java_lang_String_arr_a != null && ServerInfo.var_java_lang_String_arr_a.length != 0) {
            TerrainMidlet.serverHost = ServerInfo.var_java_lang_String_arr_b[this.l1IIlIlll.var_int_d];
            TerrainMidlet.serverPort = ServerInfo.var_short_arr_a[this.l1IIlIlll.var_int_d];
            new StringBuffer("[lb] IP= ").append(TerrainMidlet.serverHost).append(" PORT= ").append(TerrainMidlet.serverPort);
            this.l1IIlIlll.f();
            DataUtils.a("mcntn_data", this.l1IIlIlll.var_int_d);
        }
    }
}

