/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package tab.tab3;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class GameHelper28 {
    private String[] var_java_lang_String_arr_IIll1111Il;
    private int[] var_int_arr_IIll1111Il;
    private int[] var_int_arr_lllI1IIIllI1;
    private byte[] var_byte_arr_IIll1111Il;
    private int var_int_IIll1111Il;
    private byte[] var_byte_arr_lllI1IIIllI1 = new byte[]{78, 103, 117, 121, 101, 110, 86, 97, 110, 77, 105, 110, 104};
    private int var_int_lllI1IIIllI1;

    public GameHelper28(byte[] bytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        this.IlIlIl11I(new DataInputStream(bais));
        try {
            bais.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public GameHelper28(String path) {
        InputStream is = DataUtils.java_io_InputStream_a(path);
        this.IlIlIl11I(new DataInputStream(is));
        try {
            if (is != null) {
                is.close();
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    private void IlIlIl11I(DataInputStream dataInputStream) {
        this.var_int_lllI1IIIllI1 = this.var_byte_arr_lllI1IIIllI1.length;
        int n = 0;
        int n2 = 0;
        try {
            this.var_int_IIll1111Il = dataInputStream.readUnsignedByte();
            this.var_java_lang_String_arr_IIll1111Il = new String[this.var_int_IIll1111Il];
            this.var_int_arr_IIll1111Il = new int[this.var_int_IIll1111Il];
            this.var_int_arr_lllI1IIIllI1 = new int[this.var_int_IIll1111Il];
            for (int i = 0; i < this.var_int_IIll1111Il; ++i) {
                byte[] byArray = new byte[dataInputStream.readByte()];
                dataInputStream.read(byArray);
                this.IlIlIl11I(byArray);
                this.var_java_lang_String_arr_IIll1111Il[i] = new String(byArray);
                this.var_int_arr_IIll1111Il[i] = n;
                this.var_int_arr_lllI1IIIllI1[i] = dataInputStream.readUnsignedShort();
                n += this.var_int_arr_lllI1IIIllI1[i];
                n2 += this.var_int_arr_lllI1IIIllI1[i];
            }
            this.var_byte_arr_IIll1111Il = new byte[n2];
            dataInputStream.readFully(this.var_byte_arr_IIll1111Il);
            this.IlIlIl11I(this.var_byte_arr_IIll1111Il);
            dataInputStream.close();
        }
        catch (IOException iOException) {}
        try {
            dataInputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    private void IlIlIl11I(byte[] byArray) {
        int n = byArray.length;
        for (int i = 0; i < n; ++i) {
            int n2 = i;
            byArray[n2] = (byte)(byArray[n2] ^ this.var_byte_arr_lllI1IIIllI1[i % this.var_int_lllI1IIIllI1]);
        }
    }

    public final Image a(String string) {
        for (int i = 0; i < this.var_int_IIll1111Il; ++i) {
            if (this.var_java_lang_String_arr_IIll1111Il[i].compareTo(string) != 0) continue;
            return Image.createImage((byte[])this.var_byte_arr_IIll1111Il, (int)this.var_int_arr_IIll1111Il[i], (int)this.var_int_arr_lllI1IIIllI1[i]);
        }
        new StringBuffer("[ae] File '").append(string).append("' not found!");
        return null;
    }
}

