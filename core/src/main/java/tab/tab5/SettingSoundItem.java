/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class SettingSoundItem
extends SettingChoiceItem {
    SettingSoundItem(ModAutoForm modAutoForm, String string, int n, int n2) {
        super(string, n, 10);
    }

    public final void a() {
        TerrainMidlet.setMusicVolume(this.a * 10);
        SoundManager.b(this.a * 10);
        DataUtils.a("sound", this.a * 10);
    }
}

