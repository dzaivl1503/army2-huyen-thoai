/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package game;

import game.ActionListener068;
import game.ActionListener143;
import game.ActionListener296;
import game.BaseScreen;
import game.BattleScreen;
import game.ChatScreen;
import game.ChestBox;
import game.ClanScreen;
import game.DataUtils;
import game.FontRenderer;
import game.GameCanvas;
import game.GameCommand;
import game.PlayerAccountInfo;
import game.PopupDialog;
import game.StringUtils;
import game.TerrainMidlet;
import game.TurnTimer;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class UpgradeScreen
extends BaseScreen {
    public static UpgradeScreen var_game_UpgradeScreen_a;
    public static String[] var_java_lang_String_arr_a;
    private int I1IlII11l1 = 12;
    public static TurnTimer var_game_TurnTimer_a;
    public int[] var_int_arr_a = new int[this.I1IlII11l1];
    int var_int_a;
    private int I1IIllII = 4;
    private int I11IIlI1l = GameCanvas.var_int_b >= 240 ? 50 : 40;
    private int l11IlIII = (GameCanvas.var_int_b - this.I11IIlI1l * this.I1IIllII) / 2 + this.I11IIlI1l / 2;
    private int III1IIIII = (GameCanvas.var_int_b <= GameCanvas.var_int_c ? 70 : 40) + this.I11IIlI1l / 2;
    public int var_int_b;
    public boolean var_boolean_a;
    int c = 0;
    boolean var_boolean_b;
    public ChestBox[] var_game_ChestBox_arr_a;

    public UpgradeScreen() {
        if (GameCanvas.var_int_b < 200) {
            this.III1IIIII = 25 + this.I11IIlI1l / 2;
        }
        this.e();
    }

    public final void e() {
        this.h = this.var_boolean_a ? new GameCommand(StringUtils.dG(), new ActionListener296(this)) : null;
        this.g = new GameCommand(StringUtils.dF(), new ActionListener143(this));
        if (!this.var_boolean_a) {
            this.f = new GameCommand("Xong", new ActionListener068(this));
            return;
        }
        this.f = null;
    }

    public final void a(Graphics graphics) {
        int n;
        int n2;
        ClanScreen.c(graphics);
        for (n2 = 0; n2 < var_java_lang_String_arr_a.length; ++n2) {
            FontRenderer.a.a(graphics, var_java_lang_String_arr_a[n2], GameCanvas.var_int_b / 2, 5 + n2 * 20, 3);
        }
        n2 = 0;
        int n3 = 0;
        if (var_game_TurnTimer_a != null) {
            var_game_TurnTimer_a.a(graphics);
        }
        for (int i = 0; i < this.I1IlII11l1; ++i) {
            n = this.l11IlIII + n2 * this.I11IIlI1l;
            int n4 = this.III1IIIII + n3 * this.I11IIlI1l;
            if (i == this.var_int_b && !this.var_boolean_a) {
                graphics.setColor(3374591);
                graphics.fillRect(n - 2 - PopupDialog.var_javax_microedition_lcdui_Image_a.getWidth() / 2, n4 - 2 - PopupDialog.var_javax_microedition_lcdui_Image_a.getWidth() / 2, PopupDialog.var_javax_microedition_lcdui_Image_a.getWidth() + 4, PopupDialog.var_javax_microedition_lcdui_Image_a.getWidth() + 4);
            }
            if (this.var_game_ChestBox_arr_a[i] != null) {
                this.var_game_ChestBox_arr_a[i].a(graphics, n, n4);
            } else {
                graphics.drawImage(PopupDialog.var_javax_microedition_lcdui_Image_a, n, n4, 3);
            }
            if (++n2 != this.I1IIllII) continue;
            ++n3;
            n2 = 0;
        }
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        FontRenderer.e.a(graphics, DataUtils.a(playerAccountInfo.var_long_c) + " " + StringUtils.aq() + " - " + DataUtils.a(playerAccountInfo.e) + " " + StringUtils.ar(), 5, GameCanvas.var_int_c - BaseScreen.var_int_o - 20, 0);
        for (n = 0; n < BattleScreen.var_java_util_Vector_b.size(); ++n) {
            ((ChatScreen)BattleScreen.var_java_util_Vector_b.elementAt(n)).a(graphics);
        }
        super.a(graphics);
    }

    public final void c() {
        int n;
        if (this.var_boolean_b) {
            ++this.c;
            if (this.c == 20) {
                this.c = 0;
                this.var_boolean_b = false;
            }
        }
        if (var_game_TurnTimer_a != null) {
            var_game_TurnTimer_a.c();
            if (UpgradeScreen.var_game_TurnTimer_a.a < 0) {
                var_game_TurnTimer_a = null;
            }
        }
        for (n = 0; n < 12; ++n) {
            if (this.var_game_ChestBox_arr_a[n] == null) continue;
            this.var_game_ChestBox_arr_a[n].a();
        }
        for (n = 0; n < BattleScreen.var_java_util_Vector_b.size(); ++n) {
            ((ChatScreen)BattleScreen.var_java_util_Vector_b.elementAt(n)).a();
        }
    }

    public final void b_() {
        BattleScreen.var_java_util_Vector_b = new Vector();
        this.var_int_arr_a = new int[this.I1IlII11l1];
        this.var_game_ChestBox_arr_a = new ChestBox[12];
        this.var_boolean_a = false;
        this.var_int_a = 0;
        this.e();
        super.a(GameCanvas.var_game_BaseScreen_a);
    }

    public final void void_b() {
        super.void_b();
        if (!this.var_boolean_a) {
            if (GameCanvas.var_boolean_arr_a[4]) {
                GameCanvas.var_boolean_arr_a[4] = false;
                --this.var_int_b;
                if (this.var_int_b < 0) {
                    this.var_int_b = this.I1IlII11l1 - 1;
                }
            }
            if (GameCanvas.var_boolean_arr_a[6]) {
                GameCanvas.var_boolean_arr_a[6] = false;
                ++this.var_int_b;
                if (this.var_int_b > this.I1IlII11l1 - 1) {
                    this.var_int_b = 0;
                }
            }
            if (GameCanvas.var_boolean_arr_a[8]) {
                GameCanvas.var_boolean_arr_a[8] = false;
                this.var_int_b += this.I1IIllII;
                if (this.var_int_b > this.I1IlII11l1 - 1) {
                    this.var_int_b = this.I1IlII11l1 - 1;
                }
            }
            if (GameCanvas.var_boolean_arr_a[2]) {
                GameCanvas.var_boolean_arr_a[2] = false;
                this.var_int_b -= this.I1IIllII;
                if (this.var_int_b < 0) {
                    this.var_int_b = 0;
                }
            }
            if (GameCanvas.var_boolean_c) {
                int n = (GameCanvas.g - this.III1IIIII + this.I11IIlI1l / 2) / this.I11IIlI1l * this.I1IIllII + (GameCanvas.f - this.l11IlIII + this.I11IIlI1l / 2) / this.I11IIlI1l;
                if (n == -1) {
                    return;
                }
                if (n == this.var_int_b && this.g != null) {
                    this.g.var_game_IActionListener_a.a();
                }
                this.var_int_b = n;
                if (this.var_int_b < 0) {
                    this.var_int_b = 0;
                }
                if (this.var_int_b > this.I1IlII11l1 - 1) {
                    this.var_int_b = this.I1IlII11l1 - 1;
                }
            }
        }
    }

    public final ChestBox a(int n) {
        for (int i = 0; i < this.var_game_ChestBox_arr_a.length; ++i) {
            if (this.var_game_ChestBox_arr_a[i] == null || this.var_game_ChestBox_arr_a[i].var_int_a != n) continue;
            return this.var_game_ChestBox_arr_a[i];
        }
        return null;
    }
}

