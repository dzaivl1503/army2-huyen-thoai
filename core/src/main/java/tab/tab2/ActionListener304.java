/*
 * Decompiled with CFR 0.152.
 */
package tab.tab2;


final class ActionListener304
implements IActionListener {
    private ChallengeScreen ll1lIlII11l;

    ActionListener304(ChallengeScreen challengeScreen) {
        this.ll1lIlII11l = challengeScreen;
    }

    public final void a() {
        ChallengeScreen challengeScreen = this.ll1lIlII11l;
        byte by = ((ClanMemberEntry)challengeScreen.var_java_util_Vector_a.elementAt((int)challengeScreen.var_int_a)).var_byte_a;
        if (by != -1) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().a(by);
            GameCanvas.b(StringUtils.ds());
            GameHelper05.c = 0;
            GameHelper05.b = 0;
            GameHelper05.var_int_a = 0;
            BoardScreen.var_byte_b = ((ClanMemberEntry)challengeScreen.var_java_util_Vector_a.elementAt((int)challengeScreen.var_int_a)).c;
        }
    }
}

