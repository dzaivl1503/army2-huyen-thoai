/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.DataUtils;
import game.ModAutoForm;
import game.SettingToggleItem;

final class SettingBlockInviteItem
extends SettingToggleItem {
    SettingBlockInviteItem(ModAutoForm modAutoForm, String string, boolean bl) {
        super(string, bl);
    }

    public final void a() {
        DataUtils.a("blockInvite", this.a ? 1 : 0);
    }
}

