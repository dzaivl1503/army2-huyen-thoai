/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package tab.tab2;

import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class GameHelper37 {
    private static Vector l11I1I1I = new Vector();

    public static void a(AvatarIcon avatarIcon) {
        l11I1I1I.addElement(avatarIcon);
    }

    public static boolean boolean_a(int n) {
        for (int i = 0; i < l11I1I1I.size(); ++i) {
            if (((AvatarIcon)GameHelper37.l11I1I1I.elementAt((int)i)).var_int_a != n) continue;
            return true;
        }
        return false;
    }

    public static Image javax_microedition_lcdui_Image_a(int n) {
        for (int i = 0; i < l11I1I1I.size(); ++i) {
            if (((AvatarIcon)GameHelper37.l11I1I1I.elementAt((int)i)).var_int_a != n) continue;
            return ((AvatarIcon)GameHelper37.l11I1I1I.elementAt((int)i)).var_javax_microedition_lcdui_Image_a;
        }
        return null;
    }
}

