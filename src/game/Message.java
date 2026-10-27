/*
 * Decompiled with CFR 0.152.
 */
package game;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class Message {
    public byte a;
    private ByteArrayOutputStream var_java_io_ByteArrayOutputStream_I1I11IllI = null;
    private DataOutputStream var_java_io_DataOutputStream_I1I11IllI = null;
    private ByteArrayInputStream var_java_io_ByteArrayInputStream_I1I11IllI = null;
    private DataInputStream var_java_io_DataInputStream_I1I11IllI = null;

    public Message() {
    }

    public Message(byte by) {
        this.a = by;
        this.var_java_io_ByteArrayOutputStream_I1I11IllI = new ByteArrayOutputStream();
        this.var_java_io_DataOutputStream_I1I11IllI = new DataOutputStream(this.var_java_io_ByteArrayOutputStream_I1I11IllI);
    }

    public Message(int n) {
        this((byte)n);
    }

    public Message(byte by, byte[] byArray) {
        this.a = by;
        this.var_java_io_ByteArrayInputStream_I1I11IllI = new ByteArrayInputStream(byArray);
        this.var_java_io_DataInputStream_I1I11IllI = new DataInputStream(this.var_java_io_ByteArrayInputStream_I1I11IllI);
    }

    public Message(int n, byte[] byArray) {
        this((byte)n, byArray);
    }

    public final byte[] byte_arr_a() {
        return this.var_java_io_ByteArrayOutputStream_I1I11IllI.toByteArray();
    }

    public final DataInputStream java_io_DataInputStream_a() {
        return this.var_java_io_DataInputStream_I1I11IllI;
    }

    public final DataOutputStream java_io_DataOutputStream_a() {
        return this.var_java_io_DataOutputStream_I1I11IllI;
    }

    public final void void_a() {
        try {
            if (this.var_java_io_DataInputStream_I1I11IllI != null) {
                this.var_java_io_DataInputStream_I1I11IllI.close();
            }
            if (this.var_java_io_DataOutputStream_I1I11IllI != null) {
                this.var_java_io_DataOutputStream_I1I11IllI.close();
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

