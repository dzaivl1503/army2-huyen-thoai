/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
package tab.tab6;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;

public final class GameHelper03
implements CommandListener {
    private MapEntity var_game_MapEntity_l1llI1llI1;
    private final TextBox var_javax_microedition_lcdui_TextBox_l1llI1llI1;

    GameHelper03(MapEntity mapEntity, TextBox textBox) {
        this.var_game_MapEntity_l1llI1llI1 = mapEntity;
        this.var_javax_microedition_lcdui_TextBox_l1llI1llI1 = textBox;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals("OK")) {
            this.var_game_MapEntity_l1llI1llI1.a(this.var_javax_microedition_lcdui_TextBox_l1llI1llI1.getString());
        }
        Display.getDisplay((MIDlet)MapEntity.var_javax_microedition_midlet_MIDlet_a).setCurrent((Displayable)MapEntity.var_javax_microedition_lcdui_Canvas_a);
        MapEntity.var_javax_microedition_lcdui_Canvas_a.setFullScreenMode(true);
    }
}

