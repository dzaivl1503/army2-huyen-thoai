/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package tab.tab5;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class EquipSlotSet {
    public static Vector var_java_util_Vector_a;
    public static Image[] var_javax_microedition_lcdui_Image_arr_a;
    public static Image[] b;
    public ItemTemplate[] var_game_ItemTemplate_arr_a = new ItemTemplate[5];

    public EquipSlotSet() {
    }

    public EquipSlotSet(short[][] sArray) {
        this.var_game_ItemTemplate_arr_a[0] = EquipSlotSet.b((byte)sArray[0][0], (byte)sArray[0][1], sArray[0][2]);
        this.var_game_ItemTemplate_arr_a[1] = EquipSlotSet.b((byte)sArray[1][0], (byte)sArray[1][1], sArray[1][2]);
        this.var_game_ItemTemplate_arr_a[2] = EquipSlotSet.b((byte)sArray[2][0], (byte)sArray[2][1], sArray[2][2]);
        this.var_game_ItemTemplate_arr_a[3] = EquipSlotSet.b((byte)sArray[3][0], (byte)sArray[3][1], sArray[3][2]);
        this.var_game_ItemTemplate_arr_a[4] = EquipSlotSet.b((byte)sArray[4][0], (byte)sArray[4][1], sArray[4][2]);
    }

    public static void a(Vector vector) {
        var_java_util_Vector_a = vector;
    }

    public static GameHelper22 a(byte by) {
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            GameHelper22 gameHelper22 = (GameHelper22)var_java_util_Vector_a.elementAt(i);
            if (gameHelper22 == null || gameHelper22.var_byte_a != by) continue;
            return gameHelper22;
        }
        return null;
    }

    public static ItemTemplate a(byte by, byte s, short s2) {
        GameHelper22 gameHelper22 = EquipSlotSet.a(by);
        if (gameHelper22 != null) {
            for (int i = 0; i < gameHelper22.var_java_util_Vector_a.size(); ++i) {
                GameHelper50 helper50 = (GameHelper50)gameHelper22.var_java_util_Vector_a.elementAt(i);
                if (helper50 != null && helper50.var_byte_a == s) {
                    for (int j = 0; j < helper50.var_java_util_Vector_a.size(); ++j) {
                        ItemTemplate template = (ItemTemplate)helper50.var_java_util_Vector_a.elementAt(j);
                        if (template != null && template.var_short_a == s2) {
                            template.var_byte_b = by;
                            return template;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ItemTemplate b(byte by, byte by2, short s) {
        ItemTemplate itemTemplate = new ItemTemplate();
        ItemTemplate itemTemplate2 = EquipSlotSet.a(by, by2, s);
        if (itemTemplate2 != null) {
            itemTemplate.var_byte_b = itemTemplate2.var_byte_b;
            itemTemplate.var_byte_a = itemTemplate2.var_byte_a;
            itemTemplate.var_short_a = itemTemplate2.var_short_a;
            itemTemplate.var_java_lang_String_a = itemTemplate2.var_java_lang_String_a;
            itemTemplate.var_byte_e = itemTemplate2.var_byte_e;
            itemTemplate.var_short_arr_a = itemTemplate2.var_short_arr_a;
            itemTemplate.var_short_arr_b = itemTemplate2.var_short_arr_b;
            itemTemplate.var_byte_arr_a = itemTemplate2.var_byte_arr_a;
            itemTemplate.var_byte_arr_b = itemTemplate2.var_byte_arr_b;
            itemTemplate.var_byte_arr_c = itemTemplate2.var_byte_arr_c;
            itemTemplate.var_byte_arr_d = itemTemplate2.var_byte_arr_d;
            itemTemplate.var_byte_f = itemTemplate2.var_byte_f;
            itemTemplate.var_short_b = itemTemplate2.var_short_b;
            itemTemplate.var_int_e = itemTemplate2.var_int_e;
            itemTemplate.var_int_f = itemTemplate2.var_int_f;
            itemTemplate.var_byte_g = itemTemplate2.var_byte_g;
            itemTemplate.var_int_d = itemTemplate2.var_int_d;
            itemTemplate.h = itemTemplate2.h;
            itemTemplate.var_boolean_e = itemTemplate2.var_boolean_e;
            itemTemplate.var_java_lang_String_c = itemTemplate2.var_java_lang_String_c;
            return itemTemplate;
        }
        return null;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        try {
            if (this.var_game_ItemTemplate_arr_a[0] != null) {
                this.var_game_ItemTemplate_arr_a[0].a(graphics, n, n2, n3, n4);
            }
            if (this.var_game_ItemTemplate_arr_a[4] != null) {
                this.var_game_ItemTemplate_arr_a[4].a(graphics, n, n2, n3, n4);
            }
            Image image = PlayerEntity.var_javax_microedition_lcdui_Image_arr_a[this.var_game_ItemTemplate_arr_a[0].var_byte_b];
            int n5 = image.getWidth();
            int n6 = image.getHeight() / 10;
            DataUtils.a(graphics, image, 0, n2 * n6, n5, n6, n, n3, n4, 33);
            if (this.var_game_ItemTemplate_arr_a[1] != null) {
                this.var_game_ItemTemplate_arr_a[1].a(graphics, n, n2, n3, n4);
            }
            if (this.var_game_ItemTemplate_arr_a[2] != null) {
                this.var_game_ItemTemplate_arr_a[2].a(graphics, n, n2, n3, n4);
            }
            if (this.var_game_ItemTemplate_arr_a[3] != null) {
                this.var_game_ItemTemplate_arr_a[3].a(graphics, n, n2, n3, n4);
                return;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static {
        var_javax_microedition_lcdui_Image_arr_a = new Image[10];
        b = new Image[10];
    }
}

