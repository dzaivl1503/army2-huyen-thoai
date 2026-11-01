/*
 * Decompiled with CFR 0.152.
 */
package tab.tab3;


final class SettingDrawRGBItem
extends SettingBooleanItem {
    SettingDrawRGBItem(ModAutoForm modAutoForm, String string, boolean bl) {
        super(string, bl);
    }

    public final void a() {
        PetEntity.var_boolean_a = this.a;
        DataUtils.a("drawRGB", this.a ? 0 : 1);
    }
}

