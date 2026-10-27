/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.ActionListener168;
import game.BaseScreen;
import game.DataUtils;
import game.GameCommand;
import game.GameSetting;
import game.IActionListener;
import game.SoundManager;
import game.StringUtils;

final class ActionListener138
implements IActionListener {
    private GameSetting I1lII11I1l;

    ActionListener138(GameSetting gameSetting) {
        this.I1lII11I1l = gameSetting;
    }

    public final void a() {
        this.I1lII11I1l.var_byte_a = (byte)3;
        this.I1lII11I1l.var_boolean_b = true;
        GameSetting.soundVolume = 0;
        SoundManager.b(0);
        DataUtils.a("sound", GameSetting.soundVolume);
        this.I1lII11I1l.h = new GameCommand(StringUtils.dl(), new ActionListener168(this.I1lII11I1l));
        this.I1lII11I1l.f = null;
        BaseScreen.m();
    }
}

