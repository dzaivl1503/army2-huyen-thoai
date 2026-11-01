/*
 * Decompiled with CFR 0.152.
 */
package tab.tab5;


final class ActionListener027
implements IActionListener {
    private DailyGiftScreen lI1llIIlI;

    ActionListener027(DailyGiftScreen dailyGiftScreen) {
        this.lI1llIIlI = dailyGiftScreen;
    }

    public final void a() {
        if (this.lI1llIIlI != null && this.lI1llIIlI.var_game_BaseScreen_a != null) {
            this.lI1llIIlI.var_game_BaseScreen_a.b_();
        } else if (GameCanvas.var_game_BaseScreen_a != null) {
            GameCanvas.var_game_BaseScreen_a.b_();
        }
    }
}

