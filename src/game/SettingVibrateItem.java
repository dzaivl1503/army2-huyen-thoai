/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.DataUtils;
import game.ModAutoForm;
import game.SettingChoiceItem;

final class SettingVibrateItem
extends SettingChoiceItem {
    SettingVibrateItem(ModAutoForm modAutoForm, String string, int n, int n2) {
        super(string, n, 10);
    }

    public final void a() {
        DataUtils.a("vibrate", this.a);
    }
}

