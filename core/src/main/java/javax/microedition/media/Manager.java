package javax.microedition.media;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import javax.microedition.media.control.VolumeControl;
import java.io.*;

public class Manager {
    public static final String TONE_DEVICE_LOCATOR = "device://tone";

    public static Player createPlayer(final InputStream stream, String type) throws IOException {
        if (stream == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }

        FileHandle tempFile = null;
        Sound sound = null;
        try {
            String suffix = ".wav";
            if (type != null && type.contains("mid")) {
                suffix = ".mid";
            }
            if (Gdx.files != null) {
                tempFile = Gdx.files.local("rms/temp_audio_" + System.nanoTime() + suffix);
                try (OutputStream os = tempFile.write(false)) {
                    byte[] buf = new byte[4096];
                    int r;
                    while ((r = stream.read(buf)) != -1) {
                        os.write(buf, 0, r);
                    }
                }
                if (Gdx.audio != null) {
                    sound = Gdx.audio.newSound(tempFile);
                }
            }
        } catch (Throwable ignored) {
        }

        final Sound finalSound = sound;
        final FileHandle finalTempFile = tempFile;

        return new Player() {
            private int state = REALIZED;
            private float volume = 1.0f;
            private int loopCount = 1;

            @Override public void realize() { state = REALIZED; }
            @Override public void prefetch() { state = PREFETCHED; }

            @Override
            public void start() {
                if (finalSound != null) {
                    if (loopCount == -1) {
                        finalSound.loop(volume);
                    } else {
                        finalSound.play(volume);
                    }
                }
                state = STARTED;
            }

            @Override
            public void stop() {
                if (finalSound != null) {
                    finalSound.stop();
                }
                state = PREFETCHED;
            }

            @Override public void deallocate() {}

            @Override
            public void close() {
                if (finalSound != null) {
                    finalSound.dispose();
                }
                if (finalTempFile != null && finalTempFile.exists()) {
                    try { finalTempFile.delete(); } catch (Throwable ignored) {}
                }
                state = CLOSED;
            }

            @Override public void setMediaTime(long now) {}
            @Override public long getMediaTime() { return 0; }
            @Override public int getState() { return state; }
            @Override public void setLoopCount(int count) { this.loopCount = count; }

            @Override
            public Control getControl(String type) {
                if ("VolumeControl".equalsIgnoreCase(type)) {
                    return new VolumeControl() {
                        @Override public int getLevel() { return (int) (volume * 100); }
                        @Override
                        public int setLevel(int level) {
                            volume = Math.max(0f, Math.min(100f, level)) / 100f;
                            return (int) (volume * 100);
                        }
                        @Override public boolean isMuted() { return volume == 0f; }
                        @Override public void setMute(boolean mute) { if (mute) volume = 0f; }
                    };
                }
                return null;
            }

            @Override public Control[] getControls() { return new Control[0]; }
        };
    }

    public static Player createPlayer(String locator) throws IOException {
        return createPlayer(new ByteArrayInputStream(new byte[0]), "audio/x-wav");
    }

    public static void playTone(int note, int duration, int volume) {}
}
