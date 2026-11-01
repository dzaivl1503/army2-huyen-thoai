/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class SettingSpeedItem
extends SettingChoiceItem {
    SettingSpeedItem(ModAutoForm modAutoForm, String string, int n, int n2) {
        super(string, n, 10);
    }

    public final void a() {
        GameCanvas.l = this.a;
        GameCanvas.a();
        DataUtils.a("speed", this.a);
    }
}

