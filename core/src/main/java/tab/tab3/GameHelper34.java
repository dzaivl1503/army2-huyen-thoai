/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package tab.tab3;

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class GameHelper34 {
    public static Vector var_java_util_Vector_a;
    public static byte var_byte_a;
    public static Vector var_java_util_Vector_b;
    public static String[] var_java_lang_String_arr_a;
    public static String[] var_java_lang_String_arr_b;
    public static boolean var_boolean_a;
    public static byte var_byte_b;
    public static ClanScreen var_game_ClanScreen_a;
    private static Vector IlI1lIIlII11;
    public static short[] var_short_arr_a;
    public static int var_int_a;
    public static int var_int_b;
    public int c;
    private int llIIllIl = 0;
    private int I1l1IIIlIIl = 0;

    public final void void_a(int n) {
        var_boolean_a = false;
        this.c = n;
        byte[] byArray = null;
        for (int i = 0; i < var_java_util_Vector_b.size(); ++i) {
            GameHelper35 gameHelper35 = (GameHelper35)var_java_util_Vector_b.elementAt(i);
            if (gameHelper35.var_byte_a != n) continue;
            byArray = gameHelper35.var_byte_arr_a;
        }
        this.llIIllIl = 0;
        this.I1l1IIIlIIl = 0;
        var_int_a = DataUtils.a(0, byArray);
        int n2 = 2;
        var_int_b = DataUtils.a(2, byArray);
        n2 += 2;
        n = byArray[4];
        int[] nArray = new int[n];
        ++n2;
        Hashtable<String, GameHelper36> hashtable = new Hashtable<String, GameHelper36>();
        for (int i = 0; i < n; ++i) {
            PetEntity petEntity;
            nArray[i] = byArray[n2];
            if (GameHelper34.l1Il1l1l(nArray[i])) {
                petEntity = new PetEntity(nArray[i], DataUtils.a(n2 + 1, byArray), DataUtils.a(n2 + 3, byArray), GameHelper34.lI1ll1I1(nArray[i]), !GameHelper34.I1llllIll1(nArray[i]));
                var_java_util_Vector_a.addElement(petEntity);
            } else {
                petEntity = new PetEntity(nArray[i], DataUtils.a(n2 + 1, byArray), DataUtils.a(n2 + 3, byArray), null, !GameHelper34.I1llllIll1(nArray[i]));
                var_java_util_Vector_a.addElement(petEntity);
                if (!hashtable.containsKey(String.valueOf(nArray[i]))) {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte)2, (short)(nArray[i] & 0xFF), (byte)-1);
                }
                hashtable.put(String.valueOf(nArray[i]), new GameHelper36(null, nArray[i]));
            }
            n2 += 5;
        }
        this.llIIllIl = hashtable.size();
        if (hashtable.isEmpty() && MenuScreen.var_boolean_c) {
            MenuScreen.var_boolean_c = false;
            ConnectionWatchdog.game_ConnectionWatchdog_a().d((byte)0);
        }
        if (this.llIIllIl == 0) {
            GameCanvas.d();
        }
    }

    public final void a() {
        ClanScreen.var_int_a = var_int_b - (ClanScreen.var_javax_microedition_lcdui_Image_b.getHeight() + ClanScreen.var_javax_microedition_lcdui_Image_c.getHeight()) + 37;
        if (BattleScreen.var_byte_a != 2) {
            for (int i = 0; i < var_java_util_Vector_b.size(); ++i) {
                GameHelper35 gameHelper35 = (GameHelper35)var_java_util_Vector_b.elementAt(i);
                if (this.c != gameHelper35.var_byte_a) continue;
                var_game_ClanScreen_a = new ClanScreen((byte)gameHelper35.var_short_a);
                if (gameHelper35.b != -1) {
                    GameHelper34.var_game_ClanScreen_a.var_int_c = gameHelper35.b;
                }
                if (gameHelper35.c != -1) {
                    GameHelper34.var_game_ClanScreen_a.var_int_d = gameHelper35.c - 100;
                }
                if (gameHelper35.d != -1) {
                    ClanScreen.var_int_a += gameHelper35.d;
                }
                if (gameHelper35.e == -1) break;
                var_byte_b = (byte)gameHelper35.e;
                var_boolean_a = true;
                return;
            }
        }
    }

    public static void b() {
        var_java_util_Vector_b.removeAllElements();
    }

    private static boolean I1llllIll1(int n) {
        for (int i = 0; i < var_short_arr_a.length; ++i) {
            if (n != var_short_arr_a[i]) continue;
            return true;
        }
        return false;
    }

    public final void a(int n, Image image) {
        int n2;
        for (n2 = 0; n2 < var_java_util_Vector_a.size(); ++n2) {
            PetEntity petEntity = (PetEntity)var_java_util_Vector_a.elementAt(n2);
            if (petEntity.e != n) continue;
            petEntity.a(image);
        }
        if (++this.I1l1IIIlIIl == this.llIIllIl) {
            GameCanvas.d();
            if (MenuScreen.var_boolean_c) {
                MenuScreen.var_boolean_c = false;
                ConnectionWatchdog.game_ConnectionWatchdog_a().d((byte)0);
            }
        }
        IlI1lIIlII11.addElement(new GameHelper36(image, n));
        n2 = (byte)(BattleScreen.var_byte_a != 2 ? 30 : 5);
        if (IlI1lIIlII11.size() >= n2) {
            while (IlI1lIIlII11.size() > n2) {
                IlI1lIIlII11.removeElementAt(0);
            }
        }
        System.out.println("[u] Image map size= " + IlI1lIIlII11.size());
    }

    private static boolean l1Il1l1l(int n) {
        for (int i = 0; i < IlI1lIIlII11.size(); ++i) {
            if (((GameHelper36)GameHelper34.IlI1lIIlII11.elementAt((int)i)).var_int_a != n) continue;
            return true;
        }
        return false;
    }

    private static Image lI1ll1I1(int n) {
        for (int i = 0; i < IlI1lIIlII11.size(); ++i) {
            GameHelper36 gameHelper36 = (GameHelper36)IlI1lIIlII11.elementAt(i);
            if (gameHelper36.var_int_a != n) continue;
            return gameHelper36.var_javax_microedition_lcdui_Image_a;
        }
        return null;
    }

    public static boolean boolean_a(int n) {
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            PetEntity petEntity = (PetEntity)var_java_util_Vector_a.elementAt(i);
            if (petEntity.var_int_arr_a == null || petEntity.e != n) continue;
            return true;
        }
        return false;
    }

    public static int[] int_arr_a(int n) {
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            PetEntity petEntity = (PetEntity)var_java_util_Vector_a.elementAt(i);
            if (petEntity.e != n) continue;
            return petEntity.var_int_arr_a;
        }
        return null;
    }

    public static void a(PetEntity petEntity) {
        var_java_util_Vector_a.addElement(petEntity);
    }

    public static boolean a(int n, int n2) {
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            PetEntity petEntity = (PetEntity)var_java_util_Vector_a.elementAt(i);
            if (!DataUtils.a(n, n2, petEntity.c, petEntity.d, petEntity.var_int_a, petEntity.var_int_b) || !DataUtils.boolean_a(petEntity.a(n - petEntity.c, n2 - petEntity.d))) continue;
            return true;
        }
        return false;
    }

    public static boolean boolean_a(int n, int n2, byte by) {
        if (BattleScreen.var_byte_a == 2) {
            if (BattleScreen.var_java_util_Vector_b.size() > 3) {
                return true;
            }
            if (BattleScreen.var_byte_a == 1 && BattleScreen.var_java_util_Vector_b.size() > 6) {
                return true;
            }
        }
        if (var_byte_b == 0) {
            if (n2 >= ClanScreen.var_int_a + 48) {
                switch (by) {
                    case 0: {
                        new ChatScreen(n, n2, 2);
                        return true;
                    }
                    case 1: {
                        new ChatScreen(n, n2 - 5, 2);
                        new ChatScreen(n, n2 + 6, 2);
                        return true;
                    }
                    case 2: {
                        new ChatScreen(n, n2 - 10, 2);
                        new ChatScreen(n + 12, n2, 2);
                        new ChatScreen(n - 12, n2, 2);
                        return true;
                    }
                }
            }
        } else if (var_byte_b == 1) {
            if (n2 >= ClanScreen.var_int_b) {
                switch (by) {
                    case 0: {
                        BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-4, 4), DataUtils.b(-11, -9), (byte)6);
                        return true;
                    }
                    case 1: {
                        BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-4, 4), DataUtils.b(-14, -12), (byte)6);
                        BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-6, 6), DataUtils.b(-11, -9), (byte)6);
                        return true;
                    }
                    case 2: {
                        BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-4, 4), DataUtils.b(-13, -11), (byte)6);
                        BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-6, 6), DataUtils.b(-11, -9), (byte)6);
                        BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-2, 2), DataUtils.b(-17, -15), (byte)6);
                        return true;
                    }
                }
            }
        } else if (var_byte_b == 2 && n2 >= ClanScreen.var_int_b) {
            switch (by) {
                case 0: {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-4, 4), DataUtils.b(-11, -9), (byte)14);
                    return true;
                }
                case 1: {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-4, 4), DataUtils.b(-14, -12), (byte)14);
                    BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-6, 6), DataUtils.b(-11, -9), (byte)14);
                    return true;
                }
                case 2: {
                    BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-4, 4), DataUtils.b(-13, -11), (byte)14);
                    BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-6, 6), DataUtils.b(-11, -9), (byte)14);
                    BattleScreen.var_game_BattleGraphicHelper_a.a(n, n2, DataUtils.b(-2, 2), DataUtils.b(-17, -15), (byte)14);
                    return true;
                }
            }
        }
        return false;
    }

    public static void void_a(int n, int n2, byte by) {
        Object object;
        int n3;
        int n4 = PetEntity.a(by);
        int n5 = PetEntity.b(by);
        for (n3 = 0; n3 < var_java_util_Vector_a.size(); ++n3) {
            object = (PetEntity)var_java_util_Vector_a.elementAt(n3);
            if (!((PetEntity)object).var_boolean_b || !DataUtils.a(n - n4 / 2, n2 - n5 / 2, n4, n5, ((PetEntity)object).c, ((PetEntity)object).d, ((PetEntity)object).var_int_a, ((PetEntity)object).var_int_b)) continue;
            ((PetEntity)object).a(n, n2, by);
        }
        for (n3 = 0; n3 < BattleManager.var_game_PlayerEntity_arr_a.length; ++n3) {
            if (BattleManager.var_game_PlayerEntity_arr_a[n3] == null) continue;
            if (DataUtils.a(BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_g, BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_h - 12, n - n4 / 2, n2 - n5 / 2, n4, n5)) {
                if (BattleManager.var_game_PlayerEntity_arr_a[n3].var_byte_f != 5 && BattleManager.var_game_PlayerEntity_arr_a[n3].var_byte_g != 30) {
                    BattleManager.var_game_PlayerEntity_arr_a[n3].e(n <= BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_g ? 0 : 2);
                }
                BattleManager.var_game_PlayerEntity_arr_a[n3].var_boolean_r = false;
                BattleManager.var_game_PlayerEntity_arr_a[n3].var_boolean_s = true;
                BattleManager.var_game_PlayerEntity_arr_a[n3].var_boolean_t = true;
            }
            if (BattleManager.var_game_PlayerEntity_arr_a[n3].var_byte_c != 16) continue;
            while (!GameHelper34.a(BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_g, BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_D)) {
                ++BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_D;
                if (BattleManager.var_game_PlayerEntity_arr_a[n3].var_int_D <= var_int_b) continue;
            }
        }
        for (n3 = 0; n3 < BattleScreen.var_java_util_Vector_a.size(); ++n3) {
            object = (ServerInfo)BattleScreen.var_java_util_Vector_a.elementAt(n3);
            if (object == null || ((ServerInfo)object).var_boolean_b) continue;
            ((ServerInfo)object).var_boolean_b = true;
        }
    }

    public static void c() {
        if (var_game_ClanScreen_a != null) {
            var_game_ClanScreen_a.b();
        }
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            if (var_java_util_Vector_a.elementAt(i) == null) continue;
            ((PetEntity)var_java_util_Vector_a.elementAt(i)).a();
        }
    }

    static {
        var_java_util_Vector_a = new Vector();
        var_java_util_Vector_b = new Vector();
        IlI1lIIlII11 = new Vector();
    }
}

