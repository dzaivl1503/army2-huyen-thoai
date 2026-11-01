/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;


final class ActionListener165
implements IActionListener {
    private final String l1Il1llII;
    private final String l11Il1I1I1;

    ActionListener165(String string, String string2) {
        this.l1Il1llII = string;
        this.l11Il1I1I1 = string2;
    }

    public final void a() {
        TerrainMidlet.executeAsync(this.l1Il1llII, "sms://" + this.l11Il1I1I1, new ActionListener216(), new ActionListener222());
    }
}

