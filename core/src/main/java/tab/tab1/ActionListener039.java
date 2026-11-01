/*
 * Decompiled with CFR 0.152.
 */
package tab.tab1;

import java.util.Calendar;
import java.util.Date;

final class ActionListener039
implements IActionListener {
    ActionListener039() {
    }

    public final void a() {
        Date date = new Date();
        date.setTime(date.getTime() + 25200000L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        GameCanvas.void_a("B\u00e2y gi\u1edd l\u00e0: " + calendar.get(11) + ":" + calendar.get(12) + ":" + calendar.get(13) + "\nNg\u00e0y: " + calendar.get(5) + " th\u00e1ng " + (calendar.get(2) + 1) + " n\u0103m " + calendar.get(1) + ".");
    }
}

