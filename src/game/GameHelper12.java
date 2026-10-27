/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.BattleScreen;
import game.FontRenderer;
import game.GameCanvas;
import game.Point4D;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class GameHelper12
extends Point4D {
    private Vector var_java_util_Vector_l1lIII1l = new Vector();
    private int var_int_l1lIII1l;
    private int I1ll1l11;

    public final void b() {
        boolean bl = false;
        for (int i = 0; i < GameCanvas.var_java_util_Vector_a.size(); ++i) {
            if (!((Point4D)GameCanvas.var_java_util_Vector_a.elementAt(i) instanceof GameHelper12)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            super.b();
        }
    }

    public final void a(String string) {
        if (this.var_java_util_Vector_l1lIII1l.size() == 0) {
            this.I1ll1l11 = -FontRenderer.a.a(string);
        }
        this.var_java_util_Vector_l1lIII1l.addElement(string);
        if (this.var_java_util_Vector_l1lIII1l.size() == 1) {
            this.var_int_l1lIII1l = GameCanvas.var_int_b;
        }
    }

    public final void a() {
        this.var_int_l1lIII1l -= 2;
        if (this.var_int_l1lIII1l < this.I1ll1l11) {
            this.var_int_l1lIII1l = GameCanvas.var_int_b;
            this.var_java_util_Vector_l1lIII1l.removeElementAt(0);
            if (this.var_java_util_Vector_l1lIII1l.size() <= 0) {
                GameCanvas.var_java_util_Vector_a.removeElement(this);
                return;
            }
            this.I1ll1l11 = -FontRenderer.a.a((String)this.var_java_util_Vector_l1lIII1l.elementAt(0));
        }
    }

    public final void a(Graphics graphics) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        graphics.setClip(0, 0, GameCanvas.var_int_b, 50);
        graphics.translate(this.var_int_l1lIII1l, 0);
        String string = (String)this.var_java_util_Vector_l1lIII1l.elementAt(0);
        if (GameCanvas.var_game_BaseScreen_a != BattleScreen.var_game_BattleScreen_a) {
            FontRenderer.e.a(graphics, string, 10, 2, 0);
            return;
        }
        FontRenderer.e.a(graphics, string, 10, 20, 0);
    }
}

