/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.MediaException
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 */
package tab.tab4;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class SoundManager {
    private static SoundManager var_game_SoundManager_I11I1I1Il;
    private static boolean var_boolean_I11I1I1Il;
    private static int var_int_I11I1I1Il;
    private static Player[] var_javax_microedition_media_Player_arr_I11I1I1Il;
    private static int l1Ill1Il;

    public static void a() {
        if (var_game_SoundManager_I11I1I1Il == null) {
            var_javax_microedition_media_Player_arr_I11I1I1Il = new Player[3];
            try {
                SoundManager.var_javax_microedition_media_Player_arr_I11I1I1Il[0] = Manager.createPlayer((InputStream)DataUtils.java_io_InputStream_a("/fire.wav"), (String)"audio/x-wav");
                var_javax_microedition_media_Player_arr_I11I1I1Il[0].prefetch();
                SoundManager.var_javax_microedition_media_Player_arr_I11I1I1Il[1] = Manager.createPlayer((InputStream)DataUtils.java_io_InputStream_a("/shoot.wav"), (String)"audio/x-wav");
                var_javax_microedition_media_Player_arr_I11I1I1Il[1].prefetch();
                SoundManager.var_javax_microedition_media_Player_arr_I11I1I1Il[2] = Manager.createPlayer((InputStream)DataUtils.java_io_InputStream_a("/item.wav"), (String)"audio/x-wav");
                var_javax_microedition_media_Player_arr_I11I1I1Il[2].prefetch();
            }
            catch (Exception exception) {}
            var_game_SoundManager_I11I1I1Il = new SoundManager();
            var_boolean_I11I1I1Il = true;
        }
    }

    public static void a(int n) {
        l1Ill1Il = n;
        if (var_boolean_I11I1I1Il && var_int_I11I1I1Il != 0) {
            try {
                ((VolumeControl)var_javax_microedition_media_Player_arr_I11I1I1Il[l1Ill1Il].getControl("VolumeControl")).setLevel(var_int_I11I1I1Il * 20);
                var_javax_microedition_media_Player_arr_I11I1I1Il[l1Ill1Il].setMediaTime(0L);
                var_javax_microedition_media_Player_arr_I11I1I1Il[l1Ill1Il].start();
                return;
            }
            catch (MediaException mediaException) {}
        }
    }

    public static void b(int n) {
        var_int_I11I1I1Il = n;
    }

    static {
        l1Ill1Il = -1;
    }
}

