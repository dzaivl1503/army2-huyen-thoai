/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package tab.tab3;

import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class EffectCache {
    private static Hashtable l111llIl1 = new Hashtable();

    public static void a(short s, Image img, GameHelper53 gameHelper53) {
        GameHelper52 helper = new GameHelper52(s, gameHelper53, img);
        l111llIl1.put(String.valueOf(s), helper);
        System.out.println("[EffectCache] Added effect " + s);
    }

    private static GameHelper52 IIl1lI1l1(short s) {
        return (GameHelper52)l111llIl1.get(String.valueOf(s));
    }

    public static boolean boolean_a(short s) {
        return l111llIl1.containsKey(String.valueOf(s));
    }

    public static GameHelper53 game_GameHelper53_a(short s) {
        GameHelper52 gameHelper52 = EffectCache.IIl1lI1l1(s);
        if (gameHelper52 != null) {
            return gameHelper52.var_game_GameHelper53_a;
        }
        return null;
    }

    public static Image javax_microedition_lcdui_Image_a(short s) {
        GameHelper52 gameHelper52 = EffectCache.IIl1lI1l1(s);
        if (gameHelper52 != null) {
            return gameHelper52.var_javax_microedition_lcdui_Image_a;
        }
        return null;
    }
}

