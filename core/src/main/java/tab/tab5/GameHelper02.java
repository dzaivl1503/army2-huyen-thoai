/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameHelper02 {
    private static Image IlIIIl11II11 = BattleScreen.o;

    public static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5 = graphics.getClipX();
        int n6 = graphics.getClipY();
        int n7 = graphics.getClipWidth();
        int n8 = graphics.getClipHeight();
        int n9 = Math.max(n, n5);
        int n10 = Math.max(n2, n6);
        int n11 = Math.min(n + n3, n5 + n7) - n9;
        int n12 = Math.min(n2 + n4, n6 + n8) - n10;
        if (n11 > 0 && n12 > 0) {
            graphics.setClip(n9, n10, n11, n12);
            for (n9 = 0; n9 < n3 / 120 + 1; ++n9) {
                for (n10 = 0; n10 < n4 / 40 + 1; ++n10) {
                    graphics.drawImage(IlIIIl11II11, n + n9 * 120, n2 + n10 * 40, 0);
                }
            }
            graphics.setClip(n5, n6, n7, n8);
        }
    }
}

