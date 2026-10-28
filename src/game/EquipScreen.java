/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package game;

import game.ActionListener232;
import game.ActionListener234;
import game.ActionListener238;
import game.BaseScreen;
import game.BattleScreen;
import game.CharacterUpgradeScreen;
import game.ConnectionWatchdog;
import game.DataUtils;
import game.EquipDurationEntry;
import game.EquipSlotSet;
import game.FontRenderer;
import game.GameCanvas;
import game.GameCommand;
import game.GameHelper37;
import game.GameHelper40;
import game.ItemTemplate;
import game.PlayerAccountInfo;
import game.PlayerEntity;
import game.ScrollDialogScreen;
import game.StringUtils;
import game.TerrainMidlet;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class EquipScreen
        extends ScrollDialogScreen {
    public static EquipScreen var_game_EquipScreen_a;
    public static EquipDurationEntry var_game_EquipDurationEntry_a;
    private int var_int_lI1IlIl1IlIl;
    private int var_int_l11l1l11111;

    private int[] var_int_arr_l11l1l11111;
    private int[] var_int_arr_l1111Il1111;
    private byte[] var_byte_arr_lI1IlIl1IlIl = new byte[] { 0, 1, 2, 3, 4 };
    int[] var_int_arr_a = new int[5];
    public static Vector var_java_util_Vector_a;
    public Vector b = new Vector();
    public static Image[] var_javax_microedition_lcdui_Image_arr_a;
    private int var_int_l1111Il1111;
    private int llII1l1I;
    private int Il1I1lI1ll;
    private GameCommand var_game_GameCommand_lI1IlIl1IlIl;
    private GameCommand var_game_GameCommand_l11l1l11111;
    public short[] var_short_arr_a = new short[5];
    private Vector var_java_util_Vector_l1111Il1111 = new Vector();
    private ItemTemplate[] var_game_ItemTemplate_arr_lI1IlIl1IlIl = new ItemTemplate[5];
    private int lIlI11l1lII1 = GameCanvas.var_int_b;
    private static int II1l1IlllI;
    private static int Il1II1Il1;
    private static int lI1l1Il1I;
    private static int lIIlllI1l;
    private int IIl1I11I;
    private int lIl1II11l1;
    private int[] I1IlII1lIII = new int[5];
    private int l111lIII1lll = -1;
    private String var_java_lang_String_l11l1l11111 = "";
    private int II11I1lI1;
    private GameHelper40 var_game_GameHelper40_lI1IlIl1IlIl = new GameHelper40(0, 1);
    private GameHelper40 var_game_GameHelper40_l11l1l11111 = new GameHelper40(0, 1);
    private ItemTemplate[] var_game_ItemTemplate_arr_l11l1l11111 = new ItemTemplate[5];
    private EquipSlotSet var_game_EquipSlotSet_lI1IlIl1IlIl = null;
    private int lII1II1l = 0;
    private boolean var_boolean_lI1IlIl1IlIl = false;

    public EquipScreen() {
        this.d = GameCanvas.var_int_b / 2 - 75;
        this.e = (GameCanvas.var_int_c - BaseScreen.var_int_r) / 2 - 85;
        this.var_int_f = 150;
        this.var_int_g = 170;
        this.var_int_arr_l11l1l11111 = new int[] { this.lIlI11l1lII1 / 2 - 52, this.lIlI11l1lII1 / 2 - 77,
                this.lIlI11l1lII1 / 2 - 27, this.lIlI11l1lII1 / 2 - 37, this.lIlI11l1lII1 / 2 - 67 };
        this.var_int_arr_l1111Il1111 = new int[] { this.e + 33, this.e + 55, this.e + 55, this.e + 83, this.e + 83 };
        this.var_game_GameCommand_l11l1l11111 = new GameCommand("Menu", new ActionListener232(this));
        this.f = this.var_game_GameCommand_l11l1l11111;
        this.var_game_GameCommand_lI1IlIl1IlIl = new GameCommand(StringUtils.dF(), new ActionListener238(this));
        this.g = this.var_game_GameCommand_lI1IlIl1IlIl;
        this.h = new GameCommand(StringUtils.dI(), new ActionListener234(this));
        ((ScrollDialogScreen) this).a = StringUtils.P();
        this.var_int_h = 4;
        this.n();
        this.II11I1lI1 = this.lIlI11l1lII1 / 2 - 4;
        if (GameCanvas.var_boolean_d) {
            this.var_int_l1111Il1111 = 30;
            this.llII1l1I = 2;
            this.Il1I1lI1ll = 5;
            return;
        }
        this.var_int_l1111Il1111 = 20;
        this.llII1l1I = 3;
        this.Il1I1lI1ll = 0;
    }

    public final ItemTemplate a(int n) {
        for (int i = 0; i < this.b.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate) this.b.elementAt(i);
            if (itemTemplate.var_int_a != n)
                continue;
            return itemTemplate;
        }
        return null;
    }

    public final void a(int n, int n2) {
        for (int i = 0; i < this.b.size(); ++i) {
            ItemTemplate itemTemplate = (ItemTemplate) this.b.elementAt(i);
            if (!itemTemplate.var_boolean_d) {
                if (itemTemplate.var_int_a != n)
                    continue;
                itemTemplate.var_int_b -= n2;
                if (itemTemplate.var_int_b <= 0) {
                    itemTemplate.var_int_b = 0;
                    this.b.removeElement(itemTemplate);
                }
                return;
            }
            if (itemTemplate.var_short_a != n)
                continue;
            itemTemplate.var_int_b -= n2;
            if (itemTemplate.var_int_b <= 0) {
                itemTemplate.var_int_b = 0;
                this.b.removeElement(itemTemplate);
            }
            return;
        }
    }

    public static void a(ItemTemplate itemTemplate, boolean bl) {
        boolean bl2 = true;
        for (int i = 0; i < var_java_util_Vector_a.size(); ++i) {
            ItemTemplate itemTemplate2 = (ItemTemplate) var_java_util_Vector_a.elementAt(i);
            new StringBuffer("[dz] all equipID = ").append(itemTemplate2.var_short_a).append(" material id= ")
                    .append(itemTemplate.var_short_a);
            if (!itemTemplate2.var_boolean_d || itemTemplate2.var_short_a != itemTemplate.var_short_a)
                continue;
            itemTemplate2.var_int_b = !bl ? ++itemTemplate2.var_int_b
                    : (itemTemplate2.var_int_b += itemTemplate.var_int_b);
            bl2 = false;
            break;
        }
        if (bl2) {
            if (GameHelper37.boolean_a(itemTemplate.var_short_b)) {
                itemTemplate.var_javax_microedition_lcdui_Image_a = GameHelper37
                        .javax_microedition_lcdui_Image_a(itemTemplate.var_short_a);
            } else {
                ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte) 0, itemTemplate.var_short_a, (byte) -1);
            }
            var_java_util_Vector_a.insertElementAt(itemTemplate, 0);
        }
    }

    public static void a(ItemTemplate itemTemplate) {
        var_java_util_Vector_a.addElement(itemTemplate);
    }

    public static void a(Vector vector) {
        var_java_util_Vector_a = vector;
    }

    public final void a(int n, Image image) {
        ItemTemplate itemTemplate;
        int n2;
        for (n2 = 0; n2 < var_java_util_Vector_a.size(); ++n2) {
            itemTemplate = (ItemTemplate) var_java_util_Vector_a.elementAt(n2);
            if (!itemTemplate.var_boolean_d || itemTemplate.var_short_a != n)
                continue;
            itemTemplate.var_javax_microedition_lcdui_Image_a = image;
        }
        for (n2 = 0; n2 < this.b.size(); ++n2) {
            itemTemplate = (ItemTemplate) this.b.elementAt(n2);
            if (!itemTemplate.var_boolean_d || itemTemplate.var_short_a != n)
                continue;
            itemTemplate.var_javax_microedition_lcdui_Image_a = image;
        }
    }

    public final void b(ItemTemplate itemTemplate) {
        var_java_util_Vector_a.insertElementAt(itemTemplate, 0);
        this.b.insertElementAt(itemTemplate, 0);
    }

    public final void e() {
        this.c = true;
        GameCanvas.d();
        this.h();
    }

    public final void f() {
        ItemTemplate itemTemplate;
        if (!this.b.isEmpty() && (itemTemplate = this.game_ItemTemplate_a()) != null && !itemTemplate.var_boolean_d) {
            short s;
            if (itemTemplate.var_byte_e == 0) {
                GameCanvas.void_a(
                        "Trang b\u1ecb \u0111\u00e3 h\u1ebft h\u1ea1n s\u1eed d\u1ee5ng, vui l\u00f2ng gia h\u1ea1n th\u00eam.");
                return;
            }
            PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
            if (itemTemplate.var_byte_d == 1) {
                if (itemTemplate.var_short_a != PlayerAccountInfo.i) {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte) 1, itemTemplate.var_int_a);
                    return;
                }
                if (TerrainMidlet.isVip[playerAccountInfo.var_byte_a]) {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte) 0, itemTemplate.var_int_a);
                } else {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte) 1, itemTemplate.var_int_a);
                }
                itemTemplate.var_boolean_a = !itemTemplate.var_boolean_a;
                return;
            }
            if (itemTemplate.var_byte_f > playerAccountInfo.var_int_b) {
                GameCanvas.void_a(StringUtils.L() + itemTemplate.var_byte_f + StringUtils.M());
                return;
            }
            for (s = 0; s < 5; ++s) {
                if (playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[s] == null
                        || itemTemplate.var_int_a != playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[s].var_int_a)
                    continue;
                return;
            }
            for (s = 0; s < this.var_byte_arr_lI1IlIl1IlIl.length; ++s) {
                if (itemTemplate.var_byte_a != this.var_byte_arr_lI1IlIl1IlIl[s])
                    continue;
                this.var_int_arr_a[s] = itemTemplate.var_int_a;
            }
            s = playerAccountInfo.var_short_arr_arr_a[playerAccountInfo.var_byte_a][itemTemplate.var_byte_a];
            EquipSlotSet.b(playerAccountInfo.var_byte_a, itemTemplate.var_byte_a, s);
            playerAccountInfo.e();
            if (playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate.var_byte_a] == null) {
                playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate.var_byte_a] = EquipSlotSet
                        .a(itemTemplate.var_byte_b, itemTemplate.var_byte_a, itemTemplate.var_short_a);
            }
            playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate.var_byte_a]
                    .b(itemTemplate);
            this.I1Il1lII1();
            this.k();
        }
    }

    public final void g() {
        ItemTemplate itemTemplate = this.game_ItemTemplate_a();
        if (itemTemplate != null && !itemTemplate.var_boolean_d) {
            var_game_EquipDurationEntry_a.a(itemTemplate);
            GameCanvas.var_game_GameHelper21_a = var_game_EquipDurationEntry_a;
            return;
        }
        if (itemTemplate != null) {
            GameCanvas.void_a(itemTemplate.var_java_lang_String_b);
        }
    }

    public final ItemTemplate game_ItemTemplate_a() {
        if (this.b.size() > 0) {
            return (ItemTemplate) this.b.elementAt(this.var_int_l11l1l11111);
        }
        return null;
    }

    public final void h() {
        try {
            PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
            for (int i = 0; i < this.var_game_ItemTemplate_arr_lI1IlIl1IlIl.length; ++i) {
                if (this.var_game_ItemTemplate_arr_lI1IlIl1IlIl[i] == null)
                    continue;
                playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i]
                        .b(this.var_game_ItemTemplate_arr_lI1IlIl1IlIl[i]);
            }
            this.b = this.var_java_util_Vector_l1111Il1111;
            return;
        } catch (Exception exception) {
            return;
        }
    }

    public final void i() {
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        for (int i = 0; i < 5; ++i) {
            if (playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i] != null) {
                this.var_short_arr_a[i] = (short) playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i].var_int_a;
                playerAccountInfo.var_short_arr_arr_a[playerAccountInfo.var_byte_a][i] = playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i].var_short_a;
                this.var_game_ItemTemplate_arr_lI1IlIl1IlIl[i] = new ItemTemplate();
                this.var_game_ItemTemplate_arr_lI1IlIl1IlIl[i]
                        .b(playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i]);
            } else {
                this.var_short_arr_a[i] = -1;
            }
            this.var_int_arr_a[i] = this.var_short_arr_a[i];
        }
    }

    public final void j() {
        int n;
        short s;
        ItemTemplate itemTemplate;
        int n2;
        this.c = false;
        this.var_int_l11l1l11111 = 0;
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        PlayerAccountInfo.i = playerAccountInfo.var_short_arr_arr_b[playerAccountInfo.var_byte_a][1];
        this.i();
        this.l();
        playerAccountInfo.a();
        for (n2 = 0; n2 < 5; ++n2) {
            if (playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[n2] == null)
                continue;
            playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[n2].void_a();
            itemTemplate = playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[n2];
            for (s = 0; s < 5; ++s) {
                short[] sArray;
                short[] sArray2 = sArray = playerAccountInfo.var_short_arr_b;
                short s2 = s;
                sArray2[s2] = (short) (sArray2[s2] + itemTemplate.var_short_arr_c[s]);
            }
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.var_int_arr_a[n2] = -1;
            this.var_short_arr_a[n2] = -1;
        }
        this.b.removeAllElements();
        for (n2 = 0; n2 < var_java_util_Vector_a.size(); ++n2) {
            itemTemplate = (ItemTemplate) var_java_util_Vector_a.elementAt(n2);
            if (itemTemplate.var_boolean_d || itemTemplate.var_byte_b != TerrainMidlet.myInfo.var_byte_a)
                continue;
            this.b.addElement(itemTemplate);
        }
        s = -1;
        for (n = 0; n < var_java_util_Vector_a.size(); ++n) {
            ItemTemplate itemTemplate2 = (ItemTemplate) var_java_util_Vector_a.elementAt(n);
            if (!itemTemplate2.var_boolean_d || s == itemTemplate2.var_short_a)
                continue;
            s = itemTemplate2.var_short_a;
            if (itemTemplate2.var_javax_microedition_lcdui_Image_a != null)
                continue;
            if (GameHelper37.boolean_a(itemTemplate2.var_short_b)) {
                itemTemplate2.var_javax_microedition_lcdui_Image_a = GameHelper37
                        .javax_microedition_lcdui_Image_a(itemTemplate2.var_short_b);
            }
            ConnectionWatchdog.game_ConnectionWatchdog_a().a((byte) 0, s, (byte) -1);
        }
        for (n = 0; n < this.b.size(); ++n) {
            ItemTemplate itemTemplate3 = (ItemTemplate) this.b.elementAt(n);
            if (playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate3.var_byte_a] == null
                    || playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate3.var_byte_a].var_int_a != itemTemplate3.var_int_a)
                continue;
            playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate3.var_byte_a].void_b();
            playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate3.var_byte_a]
                    .a(itemTemplate3);
        }
        this.var_java_util_Vector_l1111Il1111 = this.b;
        this.I1Il1lII1();
        this.k();
        this.lllIll1Il();
        new StringBuffer("[dz] MY EQUIP SIZE= ").append(this.b.size());
    }

    public final void a(BaseScreen baseScreen) {
        if (this.var_int_l11l1l11111 < 0) {
            this.var_int_l11l1l11111 = 0;
        }
        if (this.var_int_l11l1l11111 > this.b.size() - 1) {
            this.var_int_l11l1l11111 = this.b.size() - 1;
        }
        if (this.game_ItemTemplate_a() != null) {
            this.l();
        }
        super.a(baseScreen);
    }

    public final void k() {
        int n;
        ItemTemplate itemTemplate;
        int n2;
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        int[] nArray = new int[5];
        int[] nArray2 = new int[5];
        ItemTemplate itemTemplate2 = null;
        if (TerrainMidlet.isVip[TerrainMidlet.myInfo.var_byte_a]) {
            for (n2 = 0; n2 < this.b.size(); ++n2) {
                itemTemplate = (ItemTemplate) this.b.elementAt(n2);
                if (itemTemplate.var_short_a != PlayerAccountInfo.i)
                    continue;
                itemTemplate2 = itemTemplate;
                break;
            }
        }
        for (n2 = 0; n2 < 5; ++n2) {
            itemTemplate = playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[n2];
            if (itemTemplate == null)
                continue;
            for (n = 0; n < 5; ++n) {
                int n3 = n;
                nArray[n3] = nArray[n3] + itemTemplate.var_int_arr_a[n];
                int n4 = n;
                nArray2[n4] = nArray2[n4] + itemTemplate.var_int_arr_b[n];
            }
        }
        if (itemTemplate2 != null) {
            for (n2 = 0; n2 < 5; ++n2) {
                int n5 = n2;
                nArray[n5] = nArray[n5] + itemTemplate2.var_int_arr_a[n2];
                int n6 = n2;
                nArray2[n6] = nArray2[n6] + itemTemplate2.var_int_arr_b[n2];
            }
        }
        this.I1IlII1lIII[0] = 1000 + playerAccountInfo.var_short_arr_a[0] * 10 + nArray[0] * 10;
        this.I1IlII1lIII[0] = this.I1IlII1lIII[0] + (1000 + playerAccountInfo.var_short_arr_a[0]) * nArray2[0] / 100;
        n2 = EquipSlotSet.a((byte) playerAccountInfo.var_byte_a).var_short_a;
        int n7 = nArray[1] + playerAccountInfo.var_short_arr_a[1];
        n = nArray[2] + playerAccountInfo.var_short_arr_a[2];
        int n8 = nArray[3] + playerAccountInfo.var_short_arr_a[3];
        int n9 = nArray[4] + playerAccountInfo.var_short_arr_a[4];
        this.I1IlII1lIII[1] = n2 * (n7 / 3 + 100 + nArray2[1]) / 100;
        this.I1IlII1lIII[2] = n * 10;
        this.I1IlII1lIII[2] = this.I1IlII1lIII[2] + this.I1IlII1lIII[2] * nArray2[2] / 100;
        this.I1IlII1lIII[3] = n8 * 10;
        this.I1IlII1lIII[3] = this.I1IlII1lIII[3] + this.I1IlII1lIII[3] * nArray2[3] / 100;
        this.I1IlII1lIII[4] = n9 * 10;
        this.I1IlII1lIII[4] = this.I1IlII1lIII[4] + this.I1IlII1lIII[4] * nArray2[4] / 100;
    }

    private void lI1Il1Il1(Graphics graphics) {
        FontRenderer.a.a(graphics, "Level: " + TerrainMidlet.myInfo.var_int_b, this.lIlI11l1lII1 / 2 + 24, this.e + 22,
                3);
        FontRenderer.a.a(graphics, TerrainMidlet.myInfo.var_int_c + "%", this.lIlI11l1lII1 / 2 + 75, this.e + 22, 3);
        for (int i = 0; i < 5; ++i) {
            DataUtils.a(graphics, CharacterUpgradeScreen.var_javax_microedition_lcdui_Image_a, 0, i << 4, 16, 16, 0,
                    this.lIlI11l1lII1 / 2 - 1, this.e + 46 + i * 18, 3);
            graphics.setColor(2378093);
            graphics.fillRect(GameCanvas.var_int_b / 2 + 9, this.e + 38 + i * 18, 35, 16);
            graphics.fillRect(GameCanvas.var_int_b / 2 + 46, this.e + 38 + i * 18, 18, 16);
            graphics.fillRect(GameCanvas.var_int_b / 2 + 66, this.e + 38 + i * 18, 19, 16);
            PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
            String string = String.valueOf(Math.abs(playerAccountInfo.var_int_arr_a[i]));
            String string2 = String.valueOf(Math.abs(playerAccountInfo.var_int_arr_b[i]));
            FontRenderer.b.a(graphics, String.valueOf(this.I1IlII1lIII[i]), this.lIlI11l1lII1 / 2 + 26,
                    this.e + 39 + i * 18, 3);
            if (playerAccountInfo.var_byte_arr_a[i] == 0) {
                FontRenderer.b.a(graphics, string, this.lIlI11l1lII1 / 2 + 56, this.e + 39 + i * 18, 3);
            }
            if (playerAccountInfo.var_byte_arr_a[i] == 2) {
                FontRenderer.d.a(graphics, string, this.lIlI11l1lII1 / 2 + 56, this.e + 39 + i * 18, 3);
            }
            if (playerAccountInfo.var_byte_arr_a[i] == 1) {
                FontRenderer.c.a(graphics, string, this.lIlI11l1lII1 / 2 + 56, this.e + 39 + i * 18, 3);
            }
            if (playerAccountInfo.var_byte_arr_b[i] == 0) {
                FontRenderer.b.a(graphics, string2, this.lIlI11l1lII1 / 2 + 75, this.e + 39 + i * 18, 3);
            }
            if (playerAccountInfo.var_byte_arr_b[i] == 2) {
                FontRenderer.d.a(graphics, string2, this.lIlI11l1lII1 / 2 + 75, this.e + 39 + i * 18, 3);
            }
            if (playerAccountInfo.var_byte_arr_b[i] != 1)
                continue;
            FontRenderer.c.a(graphics, string2, this.lIlI11l1lII1 / 2 + 75, this.e + 39 + i * 18, 3);
        }
    }

    public final void l() {
        this.l111lIII1lll = -1;
        ItemTemplate itemTemplate = this.game_ItemTemplate_a();
        if (itemTemplate != null) {
            this.II11I1lI1 = this.lIlI11l1lII1 / 2 - 4;
            this.var_java_lang_String_l11l1l11111 = itemTemplate.var_java_lang_String_a;
            if (itemTemplate.var_boolean_d) {
                String cfr_ignored_0 = itemTemplate.var_java_lang_String_b;
            } else {
                itemTemplate.java_lang_String_a();
            }
            FontRenderer.a.a(this.var_java_lang_String_l11l1l11111);
        }
    }

    private static void IIlIl1l11(GameHelper40 gameHelper40, int n) {
        gameHelper40.a += gameHelper40.b;
        if (gameHelper40.b == -1 && Math.abs(gameHelper40.a) > n) {
            gameHelper40.b = -gameHelper40.b;
        }
        if (gameHelper40.b == 1 && gameHelper40.a > 5) {
            gameHelper40.b = -gameHelper40.b;
        }
    }

    private void I1Il1lII1() {
        for (int i = 0; i < 5; ++i) {
            Object object = TerrainMidlet.myInfo;
            ItemTemplate itemTemplate = null;
            if (((PlayerAccountInfo) object).var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i] != null) {
                itemTemplate = ((PlayerAccountInfo) object).var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[i];
            }
            this.var_game_ItemTemplate_arr_l11l1l11111[i] = itemTemplate;
            if (itemTemplate == null || (object = this.a(itemTemplate.var_int_a)) == null)
                continue;
            this.var_game_ItemTemplate_arr_l11l1l11111[i] = (ItemTemplate) object;
        }
    }

    public final void a(Graphics graphics) {
        int n;
        int n2;
        int n3;
        int n4;
        Object object;
        int n5;
        int n6;
        super.a(graphics);
        graphics.setColor(16767817);
        graphics.drawRect(this.var_int_arr_l11l1l11111[this.lIl1II11l1] - 9,
                this.var_int_arr_l1111Il1111[this.lIl1II11l1] - 9, 17, 17);
        graphics.drawRect(this.var_int_arr_l11l1l11111[this.lIl1II11l1] - 10,
                this.var_int_arr_l1111Il1111[this.lIl1II11l1] - 10, 19, 19);
        graphics.setColor(1521982);
        graphics.drawRect(this.var_int_arr_l11l1l11111[this.lIl1II11l1] - 11,
                this.var_int_arr_l1111Il1111[this.lIl1II11l1] - 11, 21, 21);
        for (int i = 0; i < 5; ++i) {
            n6 = this.var_int_arr_l1111Il1111[i];
            n5 = this.var_int_arr_l11l1l11111[i];
            graphics.setColor(4156571);
            graphics.fillRoundRect(n5 - 10, n6 - 10, 20, 20, 4, 4);
            graphics.setColor(16774532);
            graphics.fillRect(n5 - 9, n6 - 9, 18, 18);
            if (this.var_game_ItemTemplate_arr_l11l1l11111[i] != null) {
                this.var_game_ItemTemplate_arr_l11l1l11111[i].a(graphics, this.var_int_arr_l11l1l11111[i] - 8,
                        this.var_int_arr_l1111Il1111[i] - 8);
                continue;
            }
            DataUtils.a(graphics, BattleScreen.var_javax_microedition_lcdui_Image_f, 0, 0, 16, 16, 0,
                    this.var_int_arr_l11l1l11111[i], this.var_int_arr_l1111Il1111[i], 3);
        }
        PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
        n6 = playerAccountInfo.var_byte_a;
        this.var_game_EquipSlotSet_lI1IlIl1IlIl = TerrainMidlet.isVip[playerAccountInfo.var_byte_a]
                ? playerAccountInfo.var_game_EquipSlotSet_b
                : playerAccountInfo.var_game_EquipSlotSet_a;
        n5 = GameCanvas.var_int_a % 5 <= 2 ? 4 : 5;
        PlayerEntity.a(graphics, n6, n5, GameCanvas.var_int_b / 2 - 52, this.e + 71, 0,
                this.var_game_EquipSlotSet_lI1IlIl1IlIl);
        n6 = this.e + 102;
        n5 = this.lIlI11l1lII1 / 2 - 78;
        graphics.setColor(4156571);
        graphics.fillRoundRect(this.lIlI11l1lII1 / 2 - 86, this.e + 96, 72, 67, 6, 6);
        graphics.setColor(4156571);
        graphics.drawRoundRect(this.lIlI11l1lII1 / 2 - 86, this.e + 96, 72, 67, 6, 6);
        graphics.setClip(n5 - 1, n6 - 1, 62, 60);
        graphics.translate(0, -Il1II1Il1);
        int n7 = 0;
        int n8 = 0;
        for (int i = 0; i < this.b.size(); ++i) {
            object = (ItemTemplate) this.b.elementAt(i);
            n4 = n5 + n8 * this.var_int_l1111Il1111 + this.Il1I1lI1ll;
            n2 = n3 = n6 + n7 * this.var_int_l1111Il1111 + this.Il1I1lI1ll;
            if (object != null) {
                if (playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[((ItemTemplate) object).var_byte_a] != null
                        && ((ItemTemplate) object).var_int_a == playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[((ItemTemplate) object).var_byte_a].var_int_a) {
                    graphics.setColor(4819660);
                    graphics.fillRect(n4, n3, 16, 16);
                }
                if (((ItemTemplate) object).var_byte_d == 1) {
                    graphics.setColor(5361158);
                    graphics.fillRect(n4, n3, 16, 16);
                    if (TerrainMidlet.isVip[playerAccountInfo.var_byte_a]
                            && ((ItemTemplate) object).var_short_a == PlayerAccountInfo.i) {
                        graphics.setColor(5963263);
                        graphics.fillRect(n4, n3, 16, 16);
                    }
                }
                if (((ItemTemplate) object).var_byte_e == 0) {
                    graphics.setColor(9014930);
                    graphics.fillRect(n4, n3, 16, 16);
                }
                if (this.var_int_l11l1l11111 == i) {
                    graphics.setColor(16767817);
                    graphics.fillRect(n4 - 3, n3 - 3, 22, 22);
                    ItemTemplate itemTemplate = (ItemTemplate) this.b.elementAt(this.var_int_l11l1l11111);
                    for (n = 0; n < this.var_byte_arr_lI1IlIl1IlIl.length; ++n) {
                        if (itemTemplate.var_byte_a != this.var_byte_arr_lI1IlIl1IlIl[n])
                            continue;
                        this.lIl1II11l1 = n;
                    }
                }
                if (((ItemTemplate) object).var_boolean_c) {
                    graphics.setColor(0xFFFFFF);
                    graphics.fillRect(n4, n3, 16, 16);
                }
                ((ItemTemplate) object).a(graphics, n4, n3);
                if (!((ItemTemplate) object).var_boolean_d) {
                    for (int j = 0; j < 3 - ((ItemTemplate) object).var_byte_c; ++j) {
                        if (n8 != this.var_int_l11l1l11111) {
                            graphics.setColor(16377901);
                        } else {
                            graphics.setColor(0);
                        }
                        graphics.fillRect(n4 + (j << 2), n2, 2, 2);
                    }
                }
            }
            if (++n8 != this.llII1l1I)
                continue;
            ++n7;
            n8 = 0;
        }
        graphics.setClip(0, 0, 1000, 1000);
        graphics.translate(0, -graphics.getTranslateY());
        graphics.setColor(1521982);
        graphics.setClip(this.lIlI11l1lII1 / 2 - 9, this.e + 130, 95, 60);
        graphics.fillRoundRect(this.lIlI11l1lII1 / 2 - 9, this.e + 130, 95, 16, 6, 6);
        graphics.fillRoundRect(this.lIlI11l1lII1 / 2 - 9, this.e + 148, 95, 16, 6, 6);
        PlayerAccountInfo playerAccountInfo2 = TerrainMidlet.myInfo;
        object = DataUtils.a(playerAccountInfo2.var_long_c) + " " + StringUtils.aq() + "-"
                + DataUtils.a(playerAccountInfo2.e) + " " + StringUtils.ar();
        n4 = FontRenderer.a.a((String) object);
        if (n4 > 85) {
            EquipScreen.IIlIl1l11(this.var_game_GameHelper40_lI1IlIl1IlIl, n4 - 80);
        }
        n3 = this.var_game_GameHelper40_lI1IlIl1IlIl.a;
        n2 = this.e + 131;
        FontRenderer.b.a(graphics, (String) object, this.II11I1lI1 + n3, n2, 0);
        int n9 = this.lIlI11l1lII1 / 2 - 4;
        n = this.e + 149;
        int n10 = FontRenderer.a.a(this.var_java_lang_String_l11l1l11111);
        if (n10 > 85) {
            EquipScreen.IIlIl1l11(this.var_game_GameHelper40_l11l1l11111, n10 - 80);
        }
        n10 = this.var_game_GameHelper40_l11l1l11111.a;
        FontRenderer.c.a(graphics, this.var_java_lang_String_l11l1l11111, n9 + this.l111lIII1lll + n10, n, 0);
        graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
        this.lI1Il1Il1(graphics);
        this.d(graphics);
    }

    private void lllIll1Il() {
        if (!this.b.isEmpty()) {
            ItemTemplate itemTemplate = this.game_ItemTemplate_a();
            PlayerAccountInfo playerAccountInfo = TerrainMidlet.myInfo;
            if (itemTemplate != null) {
                int n;
                int n2;
                ItemTemplate itemTemplate2 = playerAccountInfo.var_game_EquipSlotSet_a.var_game_ItemTemplate_arr_a[itemTemplate.var_byte_a];
                if (itemTemplate.var_boolean_d || itemTemplate.var_byte_d == 1) {
                    itemTemplate2 = itemTemplate;
                }
                int[] nArray = itemTemplate.var_int_arr_a;
                int[] nArray2 = null;
                int[] nArray3 = itemTemplate.var_int_arr_b;
                int[] nArray4 = null;
                if (itemTemplate2 != null) {
                    nArray2 = itemTemplate2.var_int_arr_a;
                    nArray4 = itemTemplate2.var_int_arr_b;
                }
                for (n2 = 0; n2 < 5; ++n2) {
                    n = 0;
                    int n3 = 0;
                    if (itemTemplate != null) {
                        n = nArray[n2];
                        n3 = nArray3[n2];
                    }
                    int n4 = 0;
                    int n5 = 0;
                    if (itemTemplate2 != null) {
                        n4 = nArray2[n2];
                        n5 = nArray4[n2];
                    }
                    if (itemTemplate2 != null) {
                        playerAccountInfo.var_int_arr_a[n2] = n - n4;
                        playerAccountInfo.var_int_arr_b[n2] = n3 - n5;
                    } else {
                        itemTemplate2 = new ItemTemplate();
                        for (int i = 0; i < 5; ++i) {
                            itemTemplate2.var_int_arr_a[n2] = 0;
                            itemTemplate2.var_int_arr_b[n2] = 0;
                        }
                        nArray2 = itemTemplate2.var_int_arr_a;
                        playerAccountInfo.var_int_arr_a[n2] = n - nArray2[n2];
                        nArray4 = itemTemplate2.var_int_arr_b;
                        playerAccountInfo.var_int_arr_b[n2] = n3 - nArray4[n2];
                    }
                    playerAccountInfo.var_byte_arr_a[n2] = (byte) (playerAccountInfo.var_int_arr_a[n2] == 0 ? 0
                            : (playerAccountInfo.var_int_arr_a[n2] > 0 ? 1 : 2));
                    playerAccountInfo.var_byte_arr_b[n2] = (byte) (playerAccountInfo.var_int_arr_b[n2] == 0 ? 0
                            : (playerAccountInfo.var_int_arr_b[n2] > 0 ? 1 : 2));
                }
                this.l();
                this.var_game_GameHelper40_l11l1l11111.a = -1;
                n2 = this.var_int_l11l1l11111 / this.llII1l1I;
                II1l1IlllI = n2 * this.var_int_l1111Il1111 + this.Il1I1lI1ll - 20;
                if (II1l1IlllI < 0) {
                    II1l1IlllI = 0;
                }
                if (II1l1IlllI > (n = this.IIl1I11I * this.var_int_l1111Il1111 - 60)) {
                    II1l1IlllI = n;
                }
            }
        }
    }

    public final void void_b() {
        super.void_b();
        if (this.b.size() != 0) {
            if (GameCanvas.var_boolean_arr_a[4]) {
                GameCanvas.var_boolean_arr_a[4] = false;
                --this.var_int_l11l1l11111;
                if (this.var_int_l11l1l11111 < 0) {
                    this.var_int_l11l1l11111 = this.var_int_lI1IlIl1IlIl - 1;
                }
                this.lllIll1Il();
            }
            if (GameCanvas.var_boolean_arr_a[6]) {
                GameCanvas.var_boolean_arr_a[6] = false;
                ++this.var_int_l11l1l11111;
                if (this.var_int_l11l1l11111 > this.var_int_lI1IlIl1IlIl - 1) {
                    this.var_int_l11l1l11111 = 0;
                }
                this.lllIll1Il();
            }
            if (GameCanvas.var_boolean_arr_a[8]) {
                GameCanvas.var_boolean_arr_a[8] = false;
                this.var_int_l11l1l11111 += this.llII1l1I;
                if (this.var_int_l11l1l11111 > this.var_int_lI1IlIl1IlIl - 1) {
                    this.var_int_l11l1l11111 = this.var_int_lI1IlIl1IlIl - 1;
                }
                this.lllIll1Il();
            }
            if (GameCanvas.var_boolean_arr_a[2]) {
                GameCanvas.var_boolean_arr_a[2] = false;
                this.var_int_l11l1l11111 -= this.llII1l1I;
                if (this.var_int_l11l1l11111 < 0) {
                    this.var_int_l11l1l11111 = 0;
                }
                this.lllIll1Il();
            }
            if (GameCanvas.var_boolean_b) {
                if (!this.var_boolean_lI1IlIl1IlIl) {
                    this.lII1II1l = Il1II1Il1;
                    this.var_boolean_lI1IlIl1IlIl = true;
                }
                II1l1IlllI = this.lII1II1l + (GameCanvas.h - GameCanvas.g);
            }
            if (GameCanvas.var_boolean_c) {
                this.var_boolean_lI1IlIl1IlIl = false;
                if (Math.abs(GameCanvas.h - GameCanvas.g) < 10) {
                    if (GameCanvas.a(this.lIlI11l1lII1 / 2 - 78, this.e + 102, 72, 67)) {
                        int n = (II1l1IlllI + GameCanvas.g - this.e - 105) / this.var_int_l1111Il1111 * this.llII1l1I
                                + (GameCanvas.f - this.d - 6) / this.var_int_l1111Il1111;
                        if (n == this.var_int_l11l1l11111 && this.g != null) {
                            this.g.var_game_IActionListener_a.a();
                        }
                        this.var_int_l11l1l11111 = n;
                        this.l();
                        if (this.var_int_l11l1l11111 < 0) {
                            this.var_int_l11l1l11111 = 0;
                        }
                        if (this.var_int_l11l1l11111 > this.b.size() - 1) {
                            this.var_int_l11l1l11111 = this.b.size() - 1;
                        }
                    }
                    this.lllIll1Il();
                }
            }
        }
    }

    public final void c() {
        int n;
        super.c();
        this.var_int_lI1IlIl1IlIl = this.b.size();
        if (Il1II1Il1 != II1l1IlllI) {
            lIIlllI1l = II1l1IlllI - Il1II1Il1 << 2;
            Il1II1Il1 += (lI1l1Il1I += lIIlllI1l) >> 4;
            lI1l1Il1I &= 0xF;
        }
        this.IIl1I11I = this.var_int_lI1IlIl1IlIl / this.llII1l1I;
        if (this.var_int_lI1IlIl1IlIl % this.llII1l1I != 0) {
            ++this.IIl1I11I;
        }
        if (Il1II1Il1 > (n = this.IIl1I11I * this.var_int_l1111Il1111 - 60)) {
            Il1II1Il1 = n;
        }
        if (Il1II1Il1 < 0) {
            Il1II1Il1 = 0;
        }
        this.g = this.var_game_GameCommand_lI1IlIl1IlIl;
        this.f = this.var_game_GameCommand_l11l1l11111;
        PlayerAccountInfo.i = TerrainMidlet.myInfo.var_short_arr_arr_b[TerrainMidlet.myInfo.var_byte_a][1];
    }

    static {
        var_game_EquipDurationEntry_a = new EquipDurationEntry();
        var_java_util_Vector_a = new Vector();
    }
}
