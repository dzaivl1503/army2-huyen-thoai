/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package game;

import game.AchievementScreen;
import game.ActionListener059;
import game.ActionListener060;
import game.ActionListener061;
import game.ActionListener062;
import game.BaseScreen;
import game.BattleScreen;
import game.BoardScreen;
import game.ConnectionWatchdog;
import game.DailyGiftScreen;
import game.DataUtils;
import game.EquipScreen;
import game.EquipSlotSet;
import game.ExplosionEffect;
import game.FontRenderer;
import game.GameCommand;
import game.GameHelper01;
import game.GameHelper06;
import game.GameHelper08;
import game.GameHelper10;
import game.GameHelper12;
import game.GameHelper13;
import game.GameHelper20;
import game.GameHelper21;
import game.GameHelper22;
import game.GameHelper30;
import game.GameHelper33;
import game.GameHelper34;
import game.GameHelper35;
import game.GameHelper48;
import game.GameHelper49;
import game.GameHelper50;
import game.GameSetting;
import game.IActionListener;
import game.InputScreen;
import game.ItemEffect;
import game.ItemTemplate;
import game.PlayerAccountInfo;
import game.PlayerEntity;
import game.Point4D;
import game.PopupMenu;
import game.ProfileScreen;
import game.SoundManager;
import game.StringUtils;
import game.TerrainMidlet;
import game.TimerHUD;
import game.UpgradeScreen;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameCanvas
extends Canvas
implements Runnable {
    private Thread var_java_lang_Thread_lI1IlIlIl1;
    public static GameCanvas var_game_GameCanvas_a;
    public static int var_int_a;
    public static int var_int_b;
    public static int var_int_c;
    public static int var_int_d;
    public static int var_int_e;
    public static BaseScreen var_game_BaseScreen_a;
    public static ZoneScreen var_game_ZoneScreen_a;
    private static boolean lIIIlI1IIIl;
    public static boolean var_boolean_a;
    public static Vector var_java_util_Vector_a;
    public static boolean[] var_boolean_arr_a;
    public static boolean[] var_boolean_arr_b;
    public static int f;
    public static int g;
    public static int h;
    public static boolean var_boolean_b;
    public static boolean var_boolean_c;
    public static boolean var_boolean_d;
    public static GameHelper08 var_game_GameHelper08_a;
    public static int i;
    public static boolean var_boolean_e;
    public static int j;
    public static byte var_byte_a;
    public static byte var_byte_b;
    public static byte var_byte_c;
    public static byte var_byte_d;
    public static byte var_byte_e;
    public static int k;
    public static GameHelper20 var_game_GameHelper20_a;
    public static GameHelper21 var_game_GameHelper21_a;
    public static TimerHUD var_game_TimerHUD_a;
    public static GameHelper12 var_game_GameHelper12_a;
    public static PopupMenu var_game_PopupMenu_a;
    public static InputScreen var_game_InputScreen_a;
    public static GameHelper10 var_game_GameHelper10_a;
    public static GameHelper49 var_game_GameHelper49_a;
    private static long var_long_lI1IlIlIl1;
    public static int l;
    private GameHelper30 var_game_GameHelper30_lI1IlIlIl1;

    public GameCanvas() {
        var_game_GameCanvas_a = this;
        lIIIlI1IIIl = this.getKeyCode(8) == -20;
        String string = System.getProperty("microedition.platform");
        var_boolean_a = string != null && string.indexOf("RIM") == 0;
        this.setFullScreenMode(true);
        var_int_b = this.getWidth();
        var_int_c = this.getHeight();
        var_int_d = var_int_b / 2;
        var_int_e = var_int_c / 2;
        GameHelper06.a.b_();
        if (this.hasPointerEvents()) {
            var_boolean_d = true;
            BaseScreen.var_int_r = 35;
        } else {
            var_boolean_d = false;
        }
        SoundManager.a();
        var_game_GameHelper20_a = new GameHelper20();
        var_game_PopupMenu_a = new PopupMenu();
        var_game_GameHelper10_a = new GameHelper10();
        this.var_game_GameHelper30_lI1IlIlIl1 = new GameHelper30();
        l = DataUtils.int_a("speed");
        if (l == -1) {
            l = 5;
            DataUtils.a("speed", l);
        }
        GameCanvas.a();
        this.var_java_lang_Thread_lI1IlIlIl1 = new Thread(this);
        this.var_java_lang_Thread_lI1IlIlIl1.start();
    }

    public static int getTicksPerLoop() {
        int speed = l + 1;
        if (speed <= 5) {
            return 1;
        }
        if (speed <= 8) {
            return 2;
        }
        if (speed <= 11) {
            return 3;
        }
        if (speed <= 14) {
            return 4;
        }
        if (speed <= 17) {
            return 5;
        }
        return 6;
    }

    public static void a() {
        int speed = l + 1;
        if (speed <= 5) {
            var_long_lI1IlIlIl1 = 45L - (long)(speed - 1) * 5L;
        } else {
            var_long_lI1IlIlIl1 = Math.max(1L, 20L - (long)(speed - 5) * 2L);
        }
    }

    public static void b() {
        ItemEffect.var_game_ItemEffect_a = new ItemEffect();
        ExplosionEffect.var_game_ExplosionEffect_a = new ExplosionEffect();
        GameHelper48.var_game_GameHelper48_a = new GameHelper48();
        GameHelper33.var_game_GameHelper33_a = new GameHelper33();
        GameHelper13.var_game_GameHelper13_a = new GameHelper13();
        var_game_GameHelper12_a = new GameHelper12();
        BoardScreen.var_game_BoardScreen_a = new BoardScreen();
        var_game_InputScreen_a = new InputScreen();
        var_game_GameHelper49_a = new GameHelper49();
        var_game_TimerHUD_a = new TimerHUD();
        ProfileScreen.var_game_ProfileScreen_a = new ProfileScreen(0);
        ProfileScreen.var_game_ProfileScreen_b = new ProfileScreen(1);
        GameSetting.var_game_GameSetting_a = new GameSetting();
        UpgradeScreen.var_game_UpgradeScreen_a = new UpgradeScreen();
        DailyGiftScreen.var_game_DailyGiftScreen_a = new DailyGiftScreen();
        AchievementScreen.var_game_AchievementScreen_a = new AchievementScreen();
        BattleScreen.var_game_GameHelper34_a = new GameHelper34();
        var_game_GameHelper08_a = new GameHelper08();
    }

    public final void run() {
        while (true) {
            Object object;
            int n;
            long l = System.currentTimeMillis();
            GameCanvas gameCanvas = this;
            if (++var_int_a > 10000) {
                var_int_a = 0;
            }
            GameHelper30 cfr_ignored_0 = gameCanvas.var_game_GameHelper30_lI1IlIlIl1;
            if (k > 0) {
                --k;
            }
            if (GameCanvas.var_game_GameHelper10_a.var_boolean_a) {
                if (GameHelper10.h != GameHelper10.g) {
                    GameHelper10.j = GameHelper10.g - GameHelper10.h << 2;
                    GameHelper10.h += (GameHelper10.i += GameHelper10.j) >> 4;
                    GameHelper10.i &= 0xF;
                }
                if (GameCanvas.var_game_GameHelper10_a.f > GameCanvas.var_game_GameHelper10_a.c) {
                    n = GameCanvas.var_game_GameHelper10_a.f - GameCanvas.var_game_GameHelper10_a.c >> 1;
                    if (n <= 0) {
                        n = 1;
                    }
                    object = var_game_GameHelper10_a;
                    ((GameHelper10)object).f -= n;
                }
                GameCanvas.var_game_GameHelper10_a.f = GameCanvas.var_game_GameHelper10_a.c;
                if (Math.abs(GameHelper10.g - GameHelper10.h) < 15 && GameHelper10.h < 0) {
                    GameHelper10.g = 0;
                }
                if (Math.abs(GameHelper10.g - GameHelper10.h) < 10 && GameHelper10.h > GameHelper10.k) {
                    GameHelper10.g = GameHelper10.k;
                }
            } else if (GameCanvas.var_game_PopupMenu_a.var_boolean_a) {
                if (GameCanvas.var_game_PopupMenu_a.d > GameCanvas.var_game_PopupMenu_a.b) {
                    n = GameCanvas.var_game_PopupMenu_a.d - GameCanvas.var_game_PopupMenu_a.b >> 1;
                    if (n <= 0) {
                        n = 1;
                    }
                    object = var_game_PopupMenu_a;
                    ((PopupMenu)object).d -= n;
                }
                GameCanvas.var_game_PopupMenu_a.d = GameCanvas.var_game_PopupMenu_a.b;
            }
            int ticks = getTicksPerLoop();
            for (int t = 0; t < ticks; ++t) {
                for (n = 0; n < var_java_util_Vector_a.size(); ++n) {
                    ((Point4D)var_java_util_Vector_a.elementAt(n)).a();
                }
                var_game_BaseScreen_a.c();
            }
            if (var_boolean_e && ++j == 20) {
                j = 0;
                var_boolean_e = false;
                object = GameHelper01.b;
                synchronized (object) {
                    GameHelper01.b.notify();
                }
            }
            if (GameCanvas.var_game_GameHelper10_a.var_boolean_a) {
                var_game_GameHelper10_a.a();
            } else {
                if (GameCanvas.var_game_PopupMenu_a.var_boolean_a) {
                    if (var_boolean_arr_a[2]) {
                        --GameCanvas.var_game_PopupMenu_a.var_int_a;
                        if (GameCanvas.var_game_PopupMenu_a.var_int_a < 0) {
                            GameCanvas.var_game_PopupMenu_a.var_int_a = GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.size() - 1;
                        }
                    } else if (var_boolean_arr_a[8]) {
                        ++GameCanvas.var_game_PopupMenu_a.var_int_a;
                        if (GameCanvas.var_game_PopupMenu_a.var_int_a > GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.size() - 1) {
                            GameCanvas.var_game_PopupMenu_a.var_int_a = 0;
                        }
                    } else if (var_boolean_arr_a[5] || var_boolean_arr_a[12] || var_boolean_arr_a[13] || BaseScreen.boolean_a((byte)2) || BaseScreen.boolean_a((byte)0) || BaseScreen.boolean_a((byte)1)) {
                        GameCanvas.var_game_PopupMenu_a.var_boolean_a = false;
                        if (GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.size() > 0) {
                            ((GameCommand)GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.elementAt((int)GameCanvas.var_game_PopupMenu_a.var_int_a)).var_game_IActionListener_a.a();
                        }
                    }
                    if (var_boolean_c && GameCanvas.a(0, GameCanvas.var_game_PopupMenu_a.b, var_int_b, GameCanvas.var_game_PopupMenu_a.c)) {
                        n = (g - GameCanvas.var_game_PopupMenu_a.b) / 30;
                        if (GameCanvas.var_game_PopupMenu_a.var_int_a != n) {
                            GameCanvas.var_game_PopupMenu_a.var_int_a = n;
                        } else {
                            GameCanvas.var_game_PopupMenu_a.var_boolean_a = false;
                            if (GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.size() > 0) {
                                ((GameCommand)GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.elementAt((int)GameCanvas.var_game_PopupMenu_a.var_int_a)).var_game_IActionListener_a.a();
                            }
                        }
                    }
                    BaseScreen.m();
                }
                if (var_game_GameHelper21_a != null) {
                    var_game_GameHelper21_a.void_a();
                } else {
                    if (var_boolean_arr_a[12] && var_boolean_arr_a[13]) {
                        ConnectionWatchdog.game_ConnectionWatchdog_a().j();
                    }
                    var_game_BaseScreen_a.void_b();
                }
            }
            var_boolean_c = false;
            gameCanvas.repaint();
            gameCanvas.serviceRepaints();
            if (Runtime.getRuntime().freeMemory() < 102400L) {
                System.gc();
            }
            l = System.currentTimeMillis() - l;
            try {
                Thread.sleep(l < var_long_lI1IlIlIl1 ? var_long_lI1IlIlIl1 - l : 1L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
        }
    }

    public final void paint(Graphics graphics) {
        int n;
        int n2;
        var_game_BaseScreen_a.a(graphics);
        if (var_game_GameHelper21_a != null) {
            var_game_GameHelper21_a.a(graphics);
        }
        if (GameCanvas.var_game_GameHelper10_a.var_boolean_a) {
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            BaseScreen.a(GameCanvas.var_game_GameHelper10_a.b - 2, GameCanvas.var_game_GameHelper10_a.c - 6, GameCanvas.var_game_GameHelper10_a.d, GameCanvas.var_game_GameHelper10_a.e + 12, graphics);
            graphics.translate(GameCanvas.var_game_GameHelper10_a.b + 5, GameCanvas.var_game_GameHelper10_a.f + 2);
            graphics.setClip(-5, 0, GameCanvas.var_game_GameHelper10_a.d, GameCanvas.var_game_GameHelper10_a.e);
            graphics.translate(0, -GameHelper10.h);
            for (n2 = 0; n2 < GameCanvas.var_game_GameHelper10_a.var_java_util_Vector_a.size(); ++n2) {
                graphics.setColor(0);
                if (n2 == GameCanvas.var_game_GameHelper10_a.var_int_a && GameCanvas.var_game_GameHelper10_a.c == GameCanvas.var_game_GameHelper10_a.f) {
                    graphics.setColor(16768329);
                    if (!var_boolean_d) {
                        graphics.fillRect(0, n2 * (BaseScreen.var_int_o + GameCanvas.var_game_GameHelper10_a.l), GameCanvas.var_game_GameHelper10_a.d - 14, BaseScreen.var_int_o);
                    } else {
                        graphics.fillRect(0, n2 * (BaseScreen.var_int_o + GameCanvas.var_game_GameHelper10_a.l) + 1, GameCanvas.var_game_GameHelper10_a.d - 14, BaseScreen.var_int_o + 8);
                    }
                }
                if (GameCanvas.var_game_GameHelper10_a.c != GameCanvas.var_game_GameHelper10_a.f) continue;
                n = 3 + n2 * (BaseScreen.var_int_o + GameCanvas.var_game_GameHelper10_a.l) + (var_boolean_d ? 5 : 0);
                FontRenderer.a.a(graphics, ((GameCommand)GameCanvas.var_game_GameHelper10_a.var_java_util_Vector_a.elementAt((int)n2)).var_java_lang_String_a, 5, n, 0);
            }
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            graphics.setClip(-1000, -1000, 2000, 2000);
            n2 = (byte)(var_boolean_d ? 12 : 3);
            FontRenderer.a.a(graphics, StringUtils.dF(), 5, var_int_c - FontRenderer.a.a() - n2, 0);
            FontRenderer.a.a(graphics, StringUtils.cq(), var_int_b - 5, var_int_c - FontRenderer.a.a() - n2, 1);
        } else if (GameCanvas.var_game_PopupMenu_a.var_boolean_a) {
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            graphics.setClip(0, 0, var_int_b, var_int_c);
            BaseScreen.a(graphics, GameCanvas.var_game_PopupMenu_a.b - 25, 4, GameCanvas.var_game_PopupMenu_a.c + 25, "");
            n2 = (byte)(var_boolean_d ? 30 : 24);
            for (int i = 0; i < GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.size(); ++i) {
                graphics.setColor(0);
                if (i == GameCanvas.var_game_PopupMenu_a.var_int_a) {
                    graphics.setColor(16768329);
                    graphics.fillRect(var_int_b / 2 - 85, GameCanvas.var_game_PopupMenu_a.b + i * n2 - 1, 170, 24);
                }
                n = GameCanvas.var_game_PopupMenu_a.b + i * n2;
                FontRenderer.f.a(graphics, ((GameCommand)GameCanvas.var_game_PopupMenu_a.var_java_util_Vector_a.elementAt((int)i)).var_java_lang_String_a, var_int_d, n, 2);
            }
        }
        graphics.setClip(0, 0, 1000, 1000);
        for (n2 = 0; n2 < var_java_util_Vector_a.size(); ++n2) {
            ((Point4D)var_java_util_Vector_a.elementAt(n2)).a(graphics);
        }
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.setClip(0, 0, var_int_b, var_int_c);
    }

    public final void keyPressed(int n) {
        block31: {
            block30: {
                if (!lIIIlI1IIIl) break block30;
                switch (this.getGameAction(n)) {
                    case 1: {
                        GameCanvas.var_boolean_arr_b[2] = true;
                        GameCanvas.var_boolean_arr_a[2] = true;
                        return;
                    }
                    case 2: {
                        GameCanvas.var_boolean_arr_b[4] = true;
                        GameCanvas.var_boolean_arr_a[4] = true;
                        return;
                    }
                    default: {
                        if (n == -21) {
                            n = -6;
                        } else if (n == -22) {
                            n = -7;
                        }
                        break block31;
                    }
                    case 5: {
                        GameCanvas.var_boolean_arr_b[6] = true;
                        GameCanvas.var_boolean_arr_a[6] = true;
                        return;
                    }
                    case 6: {
                        GameCanvas.var_boolean_arr_b[8] = true;
                        GameCanvas.var_boolean_arr_a[8] = true;
                        return;
                    }
                    case 8: {
                        GameCanvas.var_boolean_arr_b[5] = true;
                        GameCanvas.var_boolean_arr_a[5] = true;
                        return;
                    }
                }
            }
            if (var_boolean_a) {
                switch (n) {
                    case -8: {
                        GameCanvas.var_boolean_arr_b[5] = true;
                        GameCanvas.var_boolean_arr_a[5] = true;
                        return;
                    }
                    case 1: {
                        GameCanvas.var_boolean_arr_b[2] = true;
                        GameCanvas.var_boolean_arr_a[2] = true;
                        return;
                    }
                    case 2: {
                        GameCanvas.var_boolean_arr_b[4] = true;
                        GameCanvas.var_boolean_arr_a[4] = true;
                        return;
                    }
                    case 5: {
                        GameCanvas.var_boolean_arr_b[6] = true;
                        GameCanvas.var_boolean_arr_a[6] = true;
                        return;
                    }
                    case 6: {
                        GameCanvas.var_boolean_arr_b[8] = true;
                        GameCanvas.var_boolean_arr_a[8] = true;
                        return;
                    }
                }
            }
        }
        if (var_game_GameHelper21_a != null) {
            var_game_GameHelper21_a.a(n);
        }
        var_game_BaseScreen_a.b(n);
        switch (n) {
            case -39: 
            case -2: {
                GameCanvas.var_boolean_arr_b[8] = true;
                GameCanvas.var_boolean_arr_a[8] = true;
                return;
            }
            case -38: 
            case -1: {
                GameCanvas.var_boolean_arr_b[2] = true;
                GameCanvas.var_boolean_arr_a[2] = true;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.var_boolean_arr_b[13] = true;
                GameCanvas.var_boolean_arr_a[13] = true;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.var_boolean_arr_b[12] = true;
                GameCanvas.var_boolean_arr_a[12] = true;
                return;
            }
            case -5: 
            case 10: {
                GameCanvas.var_boolean_arr_b[5] = true;
                GameCanvas.var_boolean_arr_a[5] = true;
                return;
            }
            case -4: {
                GameCanvas.var_boolean_arr_b[6] = true;
                GameCanvas.var_boolean_arr_a[6] = true;
            }
            default: {
                return;
            }
            case -3: {
                GameCanvas.var_boolean_arr_b[4] = true;
                GameCanvas.var_boolean_arr_a[4] = true;
                return;
            }
            case 35: {
                GameCanvas.var_boolean_arr_b[11] = true;
                GameCanvas.var_boolean_arr_a[11] = true;
                return;
            }
            case 42: 
        }
        GameCanvas.var_boolean_arr_b[10] = true;
        GameCanvas.var_boolean_arr_a[10] = true;
    }

    public final void keyReleased(int n) {
        block31: {
            block30: {
                if (!lIIIlI1IIIl) break block30;
                switch (this.getGameAction(n)) {
                    case 1: {
                        GameCanvas.var_boolean_arr_b[2] = false;
                        return;
                    }
                    case 2: {
                        GameCanvas.var_boolean_arr_b[4] = false;
                        return;
                    }
                    default: {
                        if (n == -21) {
                            n = -6;
                        } else if (n == -22) {
                            n = -7;
                        }
                        break block31;
                    }
                    case 5: {
                        GameCanvas.var_boolean_arr_b[6] = false;
                        return;
                    }
                    case 6: {
                        GameCanvas.var_boolean_arr_b[8] = false;
                        return;
                    }
                    case 8: {
                        GameCanvas.var_boolean_arr_b[5] = false;
                        return;
                    }
                }
            }
            if (var_boolean_a) {
                switch (n) {
                    case -8: {
                        GameCanvas.var_boolean_arr_b[5] = false;
                        return;
                    }
                    case 1: {
                        GameCanvas.var_boolean_arr_b[2] = false;
                        return;
                    }
                    case 2: {
                        GameCanvas.var_boolean_arr_b[4] = false;
                        return;
                    }
                    case 5: {
                        GameCanvas.var_boolean_arr_b[6] = false;
                        return;
                    }
                    case 6: {
                        GameCanvas.var_boolean_arr_b[8] = false;
                        return;
                    }
                }
                if (n == 27) {
                    n = -7;
                }
            }
        }
        switch (n) {
            case -39: 
            case -2: {
                GameCanvas.var_boolean_arr_b[8] = false;
                return;
            }
            case -38: 
            case -1: {
                GameCanvas.var_boolean_arr_b[2] = false;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.var_boolean_arr_b[13] = false;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.var_boolean_arr_b[12] = false;
                return;
            }
            case -5: 
            case 10: {
                GameCanvas.var_boolean_arr_b[5] = false;
                return;
            }
            case -4: {
                GameCanvas.var_boolean_arr_b[6] = false;
            }
            default: {
                return;
            }
            case -3: {
                GameCanvas.var_boolean_arr_b[4] = false;
                return;
            }
            case 35: {
                GameCanvas.var_boolean_arr_b[11] = false;
                return;
            }
            case 42: 
        }
        GameCanvas.var_boolean_arr_b[10] = false;
    }

    public final void pointerDragged(int n, int n2) {
        f = n;
        g = n2;
    }

    public final void pointerPressed(int n, int n2) {
        var_boolean_b = true;
        var_boolean_c = false;
        f = n;
        g = n2;
        h = n2;
    }

    public final void pointerReleased(int n, int n2) {
        var_boolean_c = true;
        var_boolean_b = false;
        f = n;
        g = n2;
    }

    public static void c() {
        var_byte_a = (byte)DataUtils.int_a("iconversion2");
        if (var_byte_a == -1) {
            var_byte_a = 0;
        }
        System.out.println("iconversion2: " + var_byte_a);
        var_byte_b = (byte)DataUtils.int_a("valuesversion2");
        if (var_byte_b == -1) {
            var_byte_b = 0;
        }
        System.out.println("valuesversion2: " + var_byte_b);
        var_byte_c = (byte)DataUtils.int_a("playerVersion2");
        if (var_byte_c == -1) {
            var_byte_c = 0;
        }
        System.out.println("playerVersion2: " + var_byte_c);
        var_byte_d = (byte)DataUtils.int_a("equipVersion2");
        if (var_byte_d == -1) {
            var_byte_d = 0;
        }
        System.out.println("equipVersion2: " + var_byte_d);
        var_byte_e = (byte)DataUtils.int_a("levelCVersion2");
        if (var_byte_e == -1) {
            var_byte_e = 0;
        }
        System.out.println("levelCVersion2: " + var_byte_e);
        ConnectionWatchdog.game_ConnectionWatchdog_a().b((byte)2, var_byte_b);
        if (DataUtils.byte_arr_a("valuesdata2") != null) {
            GameCanvas.a(DataUtils.byte_arr_a("valuesdata2"), (byte)0);
        } else {
            GameSetting.var_boolean_a = true;
        }
        if (DataUtils.byte_arr_a("icondata2") != null) {
            BoardScreen.a(DataUtils.byte_arr_a("icondata2"));
        }
        if (DataUtils.byte_arr_a("playerdata2") != null) {
            PlayerEntity.a(DataUtils.byte_arr_a("playerdata2"));
        }
        if (DataUtils.byte_arr_a("equipdata2") != null) {
            GameCanvas.a(DataUtils.byte_arr_a("equipdata2"), (byte)1);
        }
        if (DataUtils.byte_arr_a("levelCData2") != null) {
            GameCanvas.a(DataUtils.byte_arr_a("levelCData2"), (byte)2);
        }
    }

    public static void a(byte[] byArray, byte n) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        switch (n) {
            case 0: {
                try {
                    GameHelper34.var_byte_a = dataInputStream.readByte();
                    GameHelper34.var_java_lang_String_arr_a = new String[GameHelper34.var_byte_a];
                    GameHelper34.var_java_lang_String_arr_b = new String[GameHelper34.var_byte_a];
                    for (int i = 0; i < GameHelper34.var_byte_a; ++i) {
                        n = dataInputStream.readByte();
                        short s = dataInputStream.readShort();
                        byte[] byArray2 = new byte[s];
                        dataInputStream.read(byArray2, 0, s);
                        short[] object2 = new short[5];
                        for (int vector2 = 0; vector2 < 5; ++vector2) {
                            object2[vector2] = dataInputStream.readShort();
                        }
                        GameHelper34.var_java_lang_String_arr_a[i] = dataInputStream.readUTF();
                        GameHelper34.var_java_lang_String_arr_b[i] = dataInputStream.readUTF();
                        GameHelper35 j = new GameHelper35(byArray2, (byte)n, object2);
                        GameHelper34.var_java_util_Vector_b.addElement(j);
                    }
                    break;
                }
                catch (Exception exception) {
                    break;
                }
            }
            case 1: {
                try {
                    int n2;
                    Object object;
                    Object object2;
                    int n3;
                    System.out.println("[coreLG/a] dataLent= " + byArray.length);
                    EquipSlotSet.var_java_util_Vector_a = new Vector();
                    Vector<Object> vector = new Vector<Object>();
                    i = dataInputStream.readByte();
                    System.out.println("[coreLG/a] NBIG IMAGE======== " + i);
                    for (n3 = 0; n3 < i; ++n3) {
                        byte by2 = dataInputStream.readByte();
                        GameHelper22 gh22 = new GameHelper22(by2);
                        gh22.var_short_a = dataInputStream.readShort();
                        object2 = gh22;
                        by2 = dataInputStream.readByte();
                        Vector<Object> n22 = new Vector<Object>();
                        for (n = 0; n < by2; ++n) {
                            byte by = dataInputStream.readByte();
                            object = new GameHelper50(by);
                            Vector<ItemTemplate> vector2 = new Vector<ItemTemplate>();
                            int n4 = dataInputStream.readByte();
                            for (int i = 0; i < n4; ++i) {
                                short s = dataInputStream.readShort();
                                byte by3 = 0;
                                if (by == 0) {
                                    by3 = dataInputStream.readByte();
                                }
                                short s2 = dataInputStream.readShort();
                                byte by4 = dataInputStream.readByte();
                                short[] sArray = new short[6];
                                short[] sArray2 = new short[6];
                                byte[] byArray2 = new byte[6];
                                byte[] byArray3 = new byte[6];
                                byte[] byArray4 = new byte[6];
                                byte[] byArray5 = new byte[6];
                                for (int j = 0; j < 6; ++j) {
                                    sArray[j] = dataInputStream.readShort();
                                    sArray2[j] = dataInputStream.readShort();
                                    byArray2[j] = dataInputStream.readByte();
                                    byArray3[j] = dataInputStream.readByte();
                                    byArray4[j] = dataInputStream.readByte();
                                    byArray5[j] = dataInputStream.readByte();
                                }
                                int[] nArray = new int[10];
                                for (int j = 0; j < 10; ++j) {
                                    nArray[j] = dataInputStream.readUnsignedByte();
                                }
                                ItemTemplate itemTemplate = new ItemTemplate(s, by, sArray, sArray2, byArray2, byArray3, byArray4, byArray5, s2, by3);
                                new ItemTemplate(s, by, sArray, sArray2, byArray2, byArray3, byArray4, byArray5, s2, by3).var_byte_f = by4;
                                itemTemplate.void_a();
                                itemTemplate.a(nArray);
                                itemTemplate.b(nArray);
                                vector2.addElement(itemTemplate);
                            }
                            ((GameHelper50)object).var_java_util_Vector_a = vector2;
                            n22.addElement(object);
                        }
                        ((GameHelper22)object2).var_java_util_Vector_a = n22;
                        vector.addElement(object2);
                    }
                    EquipSlotSet.a(vector);
                    short s = dataInputStream.readShort();
                    System.out.println("[coreLG/a] Lent Icon= " + s);
                    object2 = new byte[s];
                    dataInputStream.read((byte[])object2, 0, s);
                    try {
                        Image fullIconImg = Image.createImage((byte[])object2, 0, s);
                        int numSlices = (fullIconImg.getHeight() + 1023) / 1024;
                        EquipScreen.var_javax_microedition_lcdui_Image_arr_a = new Image[numSlices];
                        for (int sliceIdx = 0; sliceIdx < numSlices; ++sliceIdx) {
                            int sliceY = sliceIdx * 1024;
                            int sliceH = Math.min(1024, fullIconImg.getHeight() - sliceY);
                            EquipScreen.var_javax_microedition_lcdui_Image_arr_a[sliceIdx] = Image.createImage(fullIconImg, 0, sliceY, fullIconImg.getWidth(), sliceH, 0);
                        }
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                    for (n2 = 0; n2 < 10; ++n2) {
                        short s3 = dataInputStream.readShort();
                        n3 = s3;
                        byte[] byArray7 = new byte[s3];
                        dataInputStream.read(byArray7, 0, n3);
                        EquipSlotSet.b[n2] = Image.createImage((byte[])byArray7, (int)0, (int)n3);
                    }
                    if (dataInputStream.available() > 0) {
                        try {
                            byte by = dataInputStream.readByte();
                            dataInputStream.readInt();
                            n2 = by;
                            EquipScreen.var_javax_microedition_lcdui_Image_arr_a = new Image[by];
                            for (n = 0; n < n2; ++n) {
                                int n5 = dataInputStream.readInt();
                                object = new byte[n5];
                                dataInputStream.read((byte[])object, 0, n5);
                                EquipScreen.var_javax_microedition_lcdui_Image_arr_a[n] = Image.createImage((byte[])object, (int)0, (int)n5);
                            }
                        } catch (Exception ignored) {}
                    }
                }
                catch (IOException iOException) {
                    IOException iOException2 = iOException;
                    iOException.printStackTrace();
                    break;
                }
            }
            case 2: {
                try {
                    int n5 = dataInputStream.readByte();
                    PlayerAccountInfo.var_java_lang_String_arr_a = new String[n5];
                    PlayerAccountInfo.var_int_arr_d = new int[n5];
                    for (int i = 0; i < n5; ++i) {
                        PlayerAccountInfo.var_java_lang_String_arr_a[i] = dataInputStream.readUTF();
                        PlayerAccountInfo.var_int_arr_d[i] = dataInputStream.readUnsignedByte();
                        System.out.println("[coreLG/a] str = " + PlayerAccountInfo.var_java_lang_String_arr_a[i] + " caption lvl= " + PlayerAccountInfo.var_int_arr_d[i]);
                    }
                    TerrainMidlet.myInfo.f();
                    break;
                }
                catch (IOException iOException) {}
            }
        }
        try {
            dataInputStream.close();
            byteArrayInputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void a(String string, byte[] byArray) {
        DataUtils.a(byArray, string);
    }

    public static byte[] byte_arr_a(String string) {
        return DataUtils.byte_arr_a(string);
    }

    public static void a(String string, byte by) {
        DataUtils.a(string, (int)by);
    }

    public static Image a(Image image, int n) {
        int n2 = image.getWidth();
        int[] nArray = new int[n2 * n2];
        image.getRGB(nArray, 0, n2, 0, n * n2, n2, n2);
        return Image.createRGBImage((int[])nArray, (int)n2, (int)n2, (boolean)true);
    }

    public static Image a(Image srcImage, int n, Graphics graphics, int n2, int n3, boolean bl) {
        int n4 = srcImage.getWidth();
        int n5 = srcImage.getHeight();
        int[] nArray = new int[n4 * n5];
        srcImage.getRGB(nArray, 0, n4, 0, 0, n4, n5);
        int[] rgbOutput = new int[n4 * n5];
        int n6 = 256 * DataUtils.int_a(n) / 1000;
        n = 256 * DataUtils.b(n) / 1000;
        int n7 = n5 >> 1;
        for (int i = 0; i < n5; ++i) {
            int n8 = i * n4;
            int n9 = -n7 * n6 - (n4 >> 1) * n + (n4 >> 1 << 8);
            int n10 = -n7 * n + (n4 >> 1) * n6 + (n5 >> 1 << 8);
            for (int j = 0; j < n4; ++j) {
                int n11 = n9 >> 8;
                int n12 = n10 >> 8;
                if (n11 < 0) {
                    n11 = 0;
                }
                if (n12 < 0) {
                    n12 = 0;
                }
                if (n11 > n4 - 1) {
                    n11 = n4 - 1;
                }
                if (n12 > n5 - 1) {
                    n12 = n5 - 1;
                }
                rgbOutput[n8++] = nArray[n11 + n12 * n4];
                n9 += n;
                n10 -= n6;
            }
            --n7;
        }
        Image image = Image.createRGBImage(rgbOutput, n4, n5, true);
        if (bl) {
            graphics.drawImage(image, n2, n3, 3);
            return null;
        }
        return image;
    }

    public static boolean a(int n, int n2, int n3, int n4) {
        if (!var_boolean_b && !var_boolean_c) {
            return false;
        }
        return f >= n && f <= n + n3 && g >= n2 && g <= n2 + n4;
    }

    public static void void_a(String string) {
        var_game_GameHelper20_a.a(string, null, new GameCommand("OK", new ActionListener061()), null);
        var_game_GameHelper21_a = var_game_GameHelper20_a;
    }

    public static void a(String string, IActionListener iActionListener) {
        var_game_GameHelper20_a.a(string, null, new GameCommand("OK", new ActionListener060(iActionListener)), null);
        var_game_GameHelper21_a = var_game_GameHelper20_a;
    }

    public static void b(String string, IActionListener iActionListener) {
        var_game_GameHelper20_a.a(string, new GameCommand(StringUtils.cr(), iActionListener), new GameCommand("", iActionListener), new GameCommand(StringUtils.cq(), new ActionListener059()));
        var_game_GameHelper21_a = var_game_GameHelper20_a;
    }

    public static void a(String string, IActionListener iActionListener, IActionListener iActionListener2) {
        var_game_GameHelper20_a.a(string, new GameCommand(StringUtils.cr(), iActionListener), new GameCommand("", iActionListener), new GameCommand(StringUtils.cq(), iActionListener2));
        var_game_GameHelper21_a = var_game_GameHelper20_a;
    }

    public static void b(String string) {
        var_game_GameHelper20_a.a(string, null, new GameCommand("Cancel", new ActionListener062()), null);
        var_game_GameHelper21_a = var_game_GameHelper20_a;
    }

    public static void c(String string) {
        var_game_GameHelper20_a.a(string, null, null, null);
        var_game_GameHelper21_a = var_game_GameHelper20_a;
    }

    public static void d() {
        var_game_GameHelper21_a = null;
        BaseScreen.m();
        var_boolean_c = false;
        var_boolean_b = false;
        var_boolean_arr_a[5] = false;
        var_boolean_arr_b[5] = false;
    }

    static {
        var_java_util_Vector_a = new Vector();
        var_boolean_arr_a = new boolean[14];
        var_boolean_arr_b = new boolean[14];
        var_long_lI1IlIlIl1 = 40L;
    }
}

