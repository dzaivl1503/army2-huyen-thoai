/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package game;

import game.ClanBattleSlot;
import game.ClanRankEntry;
import game.EquipScreen;
import game.GameHelper53;
import game.IActionListener;
import game.InventoryScreen;
import game.MenuScreen;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public class ActionListener045
implements IActionListener {
    private InventoryScreen lII11l1Il1I;

    ActionListener045(InventoryScreen inventoryScreen) {
        this.lII11l1Il1I = inventoryScreen;
    }

    public final void a() {
        if (!this.lII11l1Il1I.var_boolean_b) {
            EquipScreen.var_game_EquipScreen_a.c = false;
            EquipScreen.var_game_EquipScreen_a.a(MenuScreen.var_game_MenuScreen_a);
            return;
        }
        this.lII11l1Il1I.var_boolean_b = false;
    }

    public static int a(byte by) {
        switch (by) {
            case 1: {
                return 13467442;
            }
            case 2: {
                return 0xC0C0C0;
            }
            case 3: {
                return 16766720;
            }
            case 4: {
                return 15066338;
            }
            case 5: {
                return 12186367;
            }
        }
        return 0x333333;
    }

    private static String lII1IIII(float f, int n) {
        long l = (long)(f * 100.0f + 0.5f);
        long l2 = l / 100L;
        long l3 = l % 100L;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(l2);
        stringBuffer.append('.');
        String string = String.valueOf(l3);
        for (int i = string.length(); i < 2; ++i) {
            stringBuffer.append('0');
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public static String a(String string, Object singleObject) {
        Object[] objectArray = new Object[]{singleObject};
        if (string == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n = 0;
        int n2 = 0;
        block5: while (n2 < string.length()) {
            char c = string.charAt(n2);
            if (c == '%' && n2 + 1 < string.length()) {
                char c2 = string.charAt(n2 + 1);
                if (c2 == '%') {
                    stringBuffer.append('%');
                    n2 += 2;
                    continue;
                }
                if (n < objectArray.length) {
                    Object object = objectArray[n++];
                    switch (c2) {
                        case 's': {
                            stringBuffer.append(object != null ? object.toString() : "null");
                            n2 += 2;
                            continue block5;
                        }
                        case 'd': {
                            if (object instanceof Integer) {
                                stringBuffer.append((Integer)object);
                            } else if (object instanceof Long) {
                                stringBuffer.append((Long)object);
                            } else {
                                stringBuffer.append(object.toString());
                            }
                            n2 += 2;
                            continue block5;
                        }
                        case 'f': {
                            if (object instanceof Float) {
                                stringBuffer.append(ActionListener045.lII1IIII(((Float)object).floatValue(), 2));
                            } else if (object instanceof Double) {
                                stringBuffer.append(ActionListener045.lII1IIII((float)((Double)object).doubleValue(), 2));
                            } else {
                                stringBuffer.append(object.toString());
                            }
                            n2 += 2;
                            continue block5;
                        }
                    }
                    stringBuffer.append(c);
                    ++n2;
                    continue;
                }
                stringBuffer.append(c);
                ++n2;
                continue;
            }
            stringBuffer.append(c);
            ++n2;
        }
        return stringBuffer.toString();
    }

    public static Object[] a(DataInputStream dataInputStream) throws IOException {
        int n;
        int n2;
        DataInputStream dataInputStream2 = dataInputStream;
        int n3 = dataInputStream2.readInt();
        byte[] byArray = new byte[n3];
        dataInputStream2.readFully(byArray);
        Image image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        dataInputStream2 = dataInputStream;
        GameHelper53 gameHelper53 = new GameHelper53();
        int n4 = dataInputStream2.readByte();
        gameHelper53.var_game_ClanBattleSlot_arr_a = new ClanBattleSlot[n4];
        for (n2 = 0; n2 < n4; ++n2) {
            gameHelper53.var_game_ClanBattleSlot_arr_a[n2] = new ClanBattleSlot();
            gameHelper53.var_game_ClanBattleSlot_arr_a[n2].var_byte_a = dataInputStream2.readByte();
            gameHelper53.var_game_ClanBattleSlot_arr_a[n2].var_int_a = dataInputStream2.readUnsignedByte();
            gameHelper53.var_game_ClanBattleSlot_arr_a[n2].b = dataInputStream2.readUnsignedByte();
            gameHelper53.var_game_ClanBattleSlot_arr_a[n2].c = dataInputStream2.readUnsignedByte();
            gameHelper53.var_game_ClanBattleSlot_arr_a[n2].d = dataInputStream2.readUnsignedByte();
        }
        n2 = dataInputStream2.readShort();
        gameHelper53.var_game_ClanRankEntry_arr_a = new ClanRankEntry[n2];
        for (n4 = 0; n4 < n2; ++n4) {
            gameHelper53.var_game_ClanRankEntry_arr_a[n4] = new ClanRankEntry();
            n = dataInputStream2.readByte();
            gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_short_arr_a = new short[n];
            gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_short_arr_b = new short[n];
            gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_byte_arr_a = new byte[n];
            gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_boolean_arr_b = new boolean[n];
            gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_boolean_arr_a = new boolean[n];
            for (int i = 0; i < n; ++i) {
                gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_short_arr_a[i] = dataInputStream2.readShort();
                gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_short_arr_b[i] = dataInputStream2.readShort();
                gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_byte_arr_a[i] = dataInputStream2.readByte();
                gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_boolean_arr_a[i] = dataInputStream2.readBoolean();
                gameHelper53.var_game_ClanRankEntry_arr_a[n4].var_boolean_arr_b[i] = dataInputStream2.readBoolean();
            }
        }
        n4 = dataInputStream2.readUnsignedByte();
        gameHelper53.var_short_arr_a = new short[n4];
        for (n = 0; n < n4; ++n) {
            gameHelper53.var_short_arr_a[n] = dataInputStream2.readShort();
        }
        GameHelper53 gameHelper532 = gameHelper53;
        return new Object[]{image, gameHelper532};
    }
}

