/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class ActionListener025
implements IActionListener {
    private GameSetting II1IIlI1I1Il;

    ActionListener025(GameSetting gameSetting) {
        this.II1IIlI1I1Il = gameSetting;
    }

    public final void a() {
        this.II1IIlI1I1Il.var_byte_a = (byte)3;
        this.II1IIlI1I1Il.var_boolean_b = true;
        if (GameSetting.soundVolume > 0) {
            TerrainMidlet.loadMusic();
            TerrainMidlet.setMusicVolume(GameSetting.soundVolume);
            TerrainMidlet.playMusic();
        }
        SoundManager.b(GameSetting.soundVolume);
        DataUtils.a("sound", GameSetting.soundVolume);
        this.II1IIlI1I1Il.h = new GameCommand(StringUtils.dl(), new ActionListener160(this.II1IIlI1I1Il));
        this.II1IIlI1I1Il.f = null;
        BaseScreen.m();
    }
}

