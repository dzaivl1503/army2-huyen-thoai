package javax.microedition.rms;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordStore {
    private static final String RMS_DIR = "rms";
    private static final Map<String, RecordStore> openStores = new HashMap<>();

    private final String name;
    private final List<byte[]> records = new ArrayList<>();
    private boolean isOpen = true;

    private RecordStore(String name) {
        this.name = name;
        load();
    }

    public static synchronized RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary)
            throws RecordStoreException {
        if (recordStoreName == null || recordStoreName.trim().isEmpty()) {
            throw new RecordStoreException("Invalid record store name");
        }
        RecordStore existing = openStores.get(recordStoreName);
        if (existing != null && existing.isOpen) {
            return existing;
        }

        FileHandle dir = getDir();
        FileHandle file = dir.child(sanitizeName(recordStoreName) + ".rms");
        if (!file.exists() && !createIfNecessary) {
            throw new RecordStoreNotFoundException("RecordStore not found: " + recordStoreName);
        }

        RecordStore rs = new RecordStore(recordStoreName);
        openStores.put(recordStoreName, rs);
        return rs;
    }

    public synchronized void closeRecordStore() throws RecordStoreException {
        if (!isOpen) {
            throw new RecordStoreException("RecordStore already closed");
        }
        save();
        isOpen = false;
        openStores.remove(name);
    }

    public static synchronized void deleteRecordStore(String recordStoreName) throws RecordStoreException {
        if (recordStoreName == null) return;
        RecordStore open = openStores.remove(recordStoreName);
        if (open != null) {
            open.isOpen = false;
        }
        FileHandle file = getDir().child(sanitizeName(recordStoreName) + ".rms");
        if (file.exists()) {
            file.delete();
        }
    }

    public static synchronized String[] listRecordStores() {
        try {
            FileHandle dir = getDir();
            if (!dir.exists() || !dir.isDirectory()) {
                return null;
            }
            FileHandle[] files = dir.list(".rms");
            if (files == null || files.length == 0) {
                return null;
            }
            String[] list = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                String fn = files[i].name();
                list[i] = fn.endsWith(".rms") ? fn.substring(0, fn.length() - 4) : fn;
            }
            return list;
        } catch (Throwable t) {
            return null;
        }
    }

    public synchronized int getNumRecords() throws RecordStoreException {
        checkOpen();
        int count = 0;
        for (byte[] r : records) {
            if (r != null) count++;
        }
        return count;
    }

    public synchronized int addRecord(byte[] data, int offset, int numBytes) throws RecordStoreException {
        checkOpen();
        byte[] copy = null;
        if (data != null && numBytes > 0) {
            copy = new byte[numBytes];
            System.arraycopy(data, offset, copy, 0, numBytes);
        } else if (data != null && numBytes == 0) {
            copy = new byte[0];
        }
        records.add(copy);
        save();
        return records.size(); // 1-based ID
    }

    public synchronized byte[] getRecord(int recordId) throws RecordStoreException {
        checkOpen();
        int idx = recordId - 1;
        if (idx < 0 || idx >= records.size()) {
            throw new InvalidRecordIDException("Record ID " + recordId + " out of range");
        }
        byte[] r = records.get(idx);
        if (r == null) {
            throw new InvalidRecordIDException("Record ID " + recordId + " was deleted");
        }
        byte[] copy = new byte[r.length];
        System.arraycopy(r, 0, copy, 0, r.length);
        return copy;
    }

    public synchronized int getRecord(int recordId, byte[] buffer, int offset) throws RecordStoreException {
        byte[] r = getRecord(recordId);
        System.arraycopy(r, 0, buffer, offset, r.length);
        return r.length;
    }

    public synchronized int getRecordSize(int recordId) throws RecordStoreException {
        byte[] r = getRecord(recordId);
        return r.length;
    }

    public synchronized void setRecord(int recordId, byte[] newData, int offset, int numBytes) throws RecordStoreException {
        checkOpen();
        int idx = recordId - 1;
        if (idx < 0 || idx >= records.size()) {
            throw new InvalidRecordIDException("Record ID " + recordId + " out of range");
        }
        byte[] copy = null;
        if (newData != null && numBytes > 0) {
            copy = new byte[numBytes];
            System.arraycopy(newData, offset, copy, 0, numBytes);
        } else if (newData != null && numBytes == 0) {
            copy = new byte[0];
        }
        records.set(idx, copy);
        save();
    }

    public synchronized void deleteRecord(int recordId) throws RecordStoreException {
        checkOpen();
        int idx = recordId - 1;
        if (idx < 0 || idx >= records.size()) {
            throw new InvalidRecordIDException("Record ID " + recordId + " out of range");
        }
        records.set(idx, null);
        save();
    }

    public synchronized int getNextRecordID() throws RecordStoreException {
        checkOpen();
        return records.size() + 1;
    }

    public synchronized int getSize() {
        int total = 0;
        for (byte[] r : records) {
            if (r != null) total += r.length;
        }
        return total;
    }

    public synchronized int getSizeAvailable() {
        return 32 * 1024 * 1024;
    }

    private void checkOpen() throws RecordStoreException {
        if (!isOpen) {
            throw new RecordStoreException("RecordStore is closed");
        }
    }

    private void load() {
        records.clear();
        FileHandle file = getDir().child(sanitizeName(name) + ".rms");
        if (!file.exists()) return;
        try (DataInputStream dis = new DataInputStream(file.read())) {
            int count = dis.readInt();
            for (int i = 0; i < count; i++) {
                int len = dis.readInt();
                if (len < 0) {
                    records.add(null);
                } else {
                    byte[] data = new byte[len];
                    dis.readFully(data);
                    records.add(data);
                }
            }
        } catch (Throwable ignored) {
        }
    }

    private void save() {
        try {
            FileHandle dir = getDir();
            if (!dir.exists()) {
                dir.mkdirs();
            }
            FileHandle file = dir.child(sanitizeName(name) + ".rms");
            try (DataOutputStream dos = new DataOutputStream(file.write(false))) {
                dos.writeInt(records.size());
                for (byte[] r : records) {
                    if (r == null) {
                        dos.writeInt(-1);
                    } else {
                        dos.writeInt(r.length);
                        dos.write(r);
                    }
                }
            }
        } catch (Throwable ignored) {
        }
    }

    private static FileHandle getDir() {
        if (Gdx.files != null) {
            return Gdx.files.local(RMS_DIR);
        }
        return new FileHandle(new File(RMS_DIR));
    }

    private static String sanitizeName(String s) {
        return s.replaceAll("[^a-zA-Z0-9_.-]", "_");
    }
}
