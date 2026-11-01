/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package tab.tab4;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class BattleGraphicHelper {
    private Vector I1l1IIII = new Vector();

    public final void a(int n, int n2, byte by) {
        int n3 = 300;
        if (BattleScreen.var_byte_a == 1) {
            n3 = 20;
        }
        if (BattleScreen.var_byte_a == 2) {
            n3 = 0;
        }
        if (this.I1l1IIII.size() < (by != 7 && by != 13 && by != 19 && by != 21 ? 30 : n3)) {
            if (by == 4) {
                if (DataUtils.d(2) == 0) {
                    this.I1l1IIII.addElement(new RankingScreen(n, n2, by));
                    return;
                }
            } else {
                this.I1l1IIII.addElement(new RankingScreen(n, n2, by));
            }
        }
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.I1l1IIII.addElement(new RankingScreen(n, n2, n3, n4, n5));
    }

    public final void a(int n, int n2, int n3, int n4, byte by) {
        int n5 = 100;
        if (BattleScreen.var_byte_a == 1) {
            n5 = 20;
        } else if (BattleScreen.var_byte_a == 2) {
            n5 = 10;
        }
        if (by == 10) {
            this.I1l1IIII.addElement(new RankingScreen(n, n2, n3, n4, by));
            return;
        }
        if (by != 6 && by != 8 && by != 9 && by != 12) {
            if (this.I1l1IIII.size() < n5) {
                this.I1l1IIII.addElement(new RankingScreen(n, n2, n3, n4, by));
                return;
            }
        } else if (this.I1l1IIII.size() < n5) {
            this.I1l1IIII.addElement(new RankingScreen(n, n2, n3, n4, by));
        }
    }

    public final void a() {
        for (int i = 0; i < this.I1l1IIII.size(); ++i) {
            ((RankingScreen)this.I1l1IIII.elementAt(i)).a();
        }
    }

    public final void a(Graphics graphics) {
        for (int i = 0; i < this.I1l1IIII.size(); ++i) {
            ((RankingScreen)this.I1l1IIII.elementAt(i)).a(graphics);
        }
    }

    public final void a(RankingScreen rankingScreen) {
        this.I1l1IIII.removeElement(rankingScreen);
    }
}

