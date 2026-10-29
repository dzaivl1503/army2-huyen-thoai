package game;

import java.sql.Timestamp;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ZoneScreen extends BoardScreen {

    public static ZoneScreen instance;
    private static Image imgBauCua;
    private static Image imgODat;
    private static Image imgLine;
    private static Image imgChip;

    private boolean isDiceFinished;
    private final int[] diceCountPerAnimal = new int[6];
    private final int[] diceResults = new int[3];
    private int timeRemaining = 600;
    private final int[][] playerBets = new int[8][6];
    private final int[] myBets = new int[6];
    private final long[] playerMoney = new long[8];
    private boolean isBettingPhase = false;
    private boolean isTransferPhase = false;
    private int winLoseResult = -1;
    public final String[] animalNames = new String[]{"Nai", "Bầu", "Gà", "Cá", "Cua", "Tôm"};

    public int transferSource = -1;
    private int transferDest = -1;
    private boolean isSelectingSource = true;
    private int selectedSlot = 0;
    private int turnPlayerIdx = -1;
    private boolean isRoundActive = false;
    private int countdownBet = 0;
    private int countdownTransfer = 0;
    private long lastStateChangeTime = 0L;
    private boolean isBetPeriod = false;
    private boolean isTransferPeriod = false;
    public int readyStatus = 0;
    private long diceFinishTime = 0L;
    private boolean hasDiceFinished = false;
    private final int RESET_DELAY = 6000;
    private long lastRollAnimTime = 0L;
    private long roundStartTime = 0L;
    public static Vector historyVector = new Vector();

    static {
        try {
            imgBauCua = Image.createImage("/baucua.png");
            imgODat = Image.createImage("/odat.png");
            imgLine = Image.createImage("/map/line.png");
            imgChip = Image.createImage("/chip.png");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public ZoneScreen() {
        super();
        instance = this;
        resetState();
        updateCommands();
    }

    @Override
    public int getMasterId() {
        return this.var_int_llI1lI1Il;
    }

    @Override
    public void void_a(int n) {
        super.void_a(n);
        this.updateCommands();
    }

    @Override
    public void b_() {
        super.b_();
        this.updateCommands();
    }

    @Override
    public void c() {
        super.c();
        this.updateTimer();
    }

    public void resetState() {
        this.isDiceFinished = false;
        this.isBettingPhase = false;
        this.isTransferPhase = false;
        this.winLoseResult = -1;
        this.transferSource = -1;
        this.transferDest = -1;
        this.isSelectingSource = true;
        this.selectedSlot = 0;
        this.turnPlayerIdx = -1;
        this.isRoundActive = false;
        this.countdownBet = 0;
        this.countdownTransfer = 0;
        this.isBetPeriod = false;
        this.isTransferPeriod = false;
        this.hasDiceFinished = false;
        this.diceFinishTime = 0L;
        this.lastRollAnimTime = 0L;
        this.roundStartTime = 0L;
        for (int i = 0; i < 6; ++i) {
            this.diceCountPerAnimal[i] = 0;
            this.myBets[i] = 0;
        }
        for (int i = 0; i < 3; ++i) {
            this.diceResults[i] = 0;
        }
        for (int i = 0; i < 8; ++i) {
            this.playerMoney[i] = 0L;
            for (int j = 0; j < 6; ++j) {
                this.playerBets[i][j] = 0;
            }
        }
    }

    public void setTime(int n) {
        this.timeRemaining = n * 60;
    }

    public void setState(byte state, byte turnPlayer) {
        this.lastStateChangeTime = System.currentTimeMillis();
        // Dong dialog "Xin cho..." / dialog dang mo khi vong moi bat dau
        GameCanvas.var_game_GameHelper21_a = null;
        if (state == 1) {
            // Giai doan dat cuoc
            this.isDiceFinished = false;
            this.isBettingPhase = true;
            this.isTransferPhase = false;
            this.isBetPeriod = true;
            this.countdownBet = 15;
            this.isTransferPeriod = false;
            this.turnPlayerIdx = -1;
            for (int i = 0; i < 6; ++i) {
                this.diceCountPerAnimal[i] = 0;
            }
            for (int i = 0; i < 3; ++i) {
                this.diceResults[i] = 0;
            }
            updateCommands();
        } else {
            // Giai doan ta / lac
            this.isDiceFinished = false;
            this.isBettingPhase = false;
            this.isTransferPhase = true;
            this.isBetPeriod = false;
            this.countdownBet = 15;
            this.isTransferPeriod = true;
            this.turnPlayerIdx = turnPlayer;
            for (int i = 0; i < 6; ++i) {
                this.diceCountPerAnimal[i] = 0;
            }
            for (int i = 0; i < 3; ++i) {
                this.diceResults[i] = 0;
            }
            updateCommands();
        }
    }

    private void tallyDiceResults() {
        for (int i = 0; i < 6; ++i) {
            this.diceCountPerAnimal[i] = 0;
        }
        for (int i = 0; i < 3; ++i) {
            int d = this.diceResults[i];
            if (d >= 0 && d < 6) {
                this.diceCountPerAnimal[d]++;
            }
        }
    }

    public void setDiceResult(int d1, int d2, int d3) {
        this.diceResults[0] = d1;
        this.diceResults[1] = d2;
        this.diceResults[2] = d3;
        this.isDiceFinished = true;
        this.tallyDiceResults();
        this.diceFinishTime = System.currentTimeMillis();
        this.hasDiceFinished = true;
    }

    public void setWinLoseResult(int n) {
        this.winLoseResult = n;
    }

    public void setPlayerMoney(long[] money) {
        for (int i = 0; i < 8 && i < money.length; ++i) {
            this.playerMoney[i] = money[i];
        }
    }

    public void setPlayerBets(int playerIdx, byte[] bets) {
        if (playerIdx >= 0 && playerIdx < 8) {
            for (int i = 0; i < 6 && i < bets.length; ++i) {
                this.playerBets[playerIdx][i] = bets[i] & 0xFF;
            }
            if (this.getMyPlayerIndex() == playerIdx) {
                for (int i = 0; i < 6 && i < bets.length; ++i) {
                    this.myBets[i] = bets[i] & 0xFF;
                }
            }
        }
    }

    public void updateBet(int playerIdx, int animal, long val) {
        if (playerIdx >= 0 && playerIdx < 8 && animal >= 0 && animal < 6) {
            this.playerBets[playerIdx][animal] = (int) val;
        }
    }

    public void onTransferBet(int playerIdx, int fromAnimal, int toAnimal, int amount) {
        if (playerIdx >= 0 && playerIdx < 8 && fromAnimal >= 0 && fromAnimal < 6 && toAnimal >= 0 && toAnimal < 6) {
            int totalChipsAtFrom = 0;
            for (int i = 0; i < 8; ++i) {
                PlayerAccountInfo p = getPlayerAt(i);
                if (p == null || p.var_int_a == -1 || p.var_int_a == getMasterId()) continue;
                totalChipsAtFrom += this.playerBets[i][fromAnimal];
            }
            if (totalChipsAtFrom > 0) {
                int transferAmt = Math.min(totalChipsAtFrom, amount);
                for (int i = 0; i < 8; ++i) {
                    PlayerAccountInfo p = getPlayerAt(i);
                    if (p == null || p.var_int_a == -1 || p.var_int_a == getMasterId()) continue;
                    int cur = this.playerBets[i][fromAnimal];
                    if (cur <= 0) continue;
                    this.playerBets[i][fromAnimal] = 0;
                    this.playerBets[playerIdx][toAnimal] += cur;
                }
                PlayerAccountInfo pTransfer = getPlayerAt(playerIdx);
                String msg = (pTransfer != null ? pTransfer.var_java_lang_String_a : "Người chơi") + " tả " + totalChipsAtFrom + " chip từ " + animalNames[fromAnimal] + " sang " + animalNames[toAnimal];
                GameCanvas.c(msg);
                sendBet();
            } else {
                GameCanvas.c("Không có chip để tả ở " + animalNames[fromAnimal]);
            }
        }
    }

    public void sendBet() {
        if (!this.isBettingPhase) {
            return;
        }
        byte[] bets = new byte[6];
        for (int i = 0; i < 6; ++i) {
            bets[i] = (byte) this.myBets[i];
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().sendBauCuaBet(bets);
    }

    public void sendTransfer(int from, int to) {
        if (!this.isTransferPhase) {
            return;
        }
        int totalChips = 0;
        for (int i = 0; i < 8; ++i) {
            PlayerAccountInfo p = getPlayerAt(i);
            if (p == null || p.var_int_a == -1 || p.var_int_a == getMasterId()) continue;
            totalChips += this.playerBets[i][from];
        }
        if (totalChips > 0) {
            ConnectionWatchdog.game_ConnectionWatchdog_a().sendBauCuaTransfer(BoardScreen.var_byte_a, (byte) (this.var_int_a + 1), (byte) from, (byte) to, (byte) totalChips);
        } else {
            GameCanvas.c("Không có chip để tả ở " + animalNames[from] + "!");
        }
    }

    public void sendPassTurn() {
        if (!this.isTransferPhase) {
            return;
        }
        ConnectionWatchdog.game_ConnectionWatchdog_a().sendBauCuaPass(BoardScreen.var_byte_a, (byte) (this.var_int_a + 1));
    }

    public void executeTransferAction() {
        if (!this.isTransferPhase) {
            return;
        }
        int myIdx = this.getMyPlayerIndex();
        if (myIdx < 0) return;
        if (this.transferSource >= 0 && this.transferDest >= 0) {
            if (this.playerBets[myIdx][this.transferSource] > 0) {
                this.sendTransfer(this.transferSource, this.transferDest);
                this.transferSource = -1;
                this.transferDest = -1;
                this.isSelectingSource = true;
            }
        } else if (this.transferSource < 0) {
            GameCanvas.c("Chọn con vật nguồn trước (có cược)");
        } else if (this.transferDest < 0) {
            GameCanvas.c("Chọn con vật đích để tả cược");
        }
    }

    public void resetRound() {
        saveHistory();
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 6; ++j) {
                this.playerBets[i][j] = 0;
            }
        }
        for (int i = 0; i < 6; ++i) {
            this.myBets[i] = 0;
            this.diceCountPerAnimal[i] = 0;
        }
        for (int i = 0; i < 3; ++i) {
            this.diceResults[i] = 0;
        }
        for (int i = 0; i < 8; ++i) {
            this.playerMoney[i] = 0L;
        }
        this.isDiceFinished = false;
        this.isBettingPhase = false;
        this.isTransferPhase = false;
        this.isBetPeriod = false;
        this.isTransferPeriod = false;
        this.hasDiceFinished = false;
        this.readyStatus = 0;
        this.winLoseResult = -1;
        this.turnPlayerIdx = -1;
        this.transferSource = -1;
        this.transferDest = -1;
        this.isSelectingSource = true;
        this.selectedSlot = 0;
        this.countdownBet = 0;
        this.countdownTransfer = 0;
        this.diceFinishTime = 0L;
        this.roundStartTime = 0L;
        this.lastRollAnimTime = 0L;
        // Dong cac dialog dang mo khi bat dau lai vong
        if (GameCanvas.var_game_PopupMenu_a != null) {
            GameCanvas.var_game_PopupMenu_a.var_boolean_a = false;
        }
        GameCanvas.var_game_GameHelper21_a = null;
        ConnectionWatchdog.game_ConnectionWatchdog_a().a(false);
        updateCommands();
    }

    private void saveHistory() {
        if (historyVector.size() >= 10) {
            historyVector.removeElementAt(0);
        }
        long now = System.currentTimeMillis();
        String timeStr = new Timestamp(now).toString().substring(11, 19);
        StringBuilder sb = new StringBuilder(timeStr).append(": ");
        boolean hasAny = false;
        for (int i = 0; i < this.animalNames.length; ++i) {
            if (this.diceCountPerAnimal[i] > 0) {
                if (hasAny) {
                    sb.append(", ");
                }
                sb.append(this.animalNames[i]).append(" x").append(this.diceCountPerAnimal[i]);
                hasAny = true;
            }
        }
        if (hasAny) {
            historyVector.addElement(sb.toString());
        }
    }

    public void showHistory() {
        if (historyVector.isEmpty()) {
            GameCanvas.c("Chưa có lịch sử ván cược Bầu Cua!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LỊCH SỬ BẦU CUA:\n");
        for (int i = historyVector.size() - 1; i >= 0; --i) {
            sb.append((String) historyVector.elementAt(i)).append("\n");
        }
        GameCanvas.b(sb.toString());
    }

    public int getMyPlayerIndex() {
        if (this.var_java_util_Vector_a == null) return -1;
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(i);
            if (p != null && p.var_int_a == TerrainMidlet.myInfo.var_int_a) {
                return i;
            }
        }
        return -1;
    }

    public PlayerAccountInfo getPlayerAt(int idx) {
        if (this.var_java_util_Vector_a != null && idx >= 0 && idx < this.var_java_util_Vector_a.size()) {
            return (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(idx);
        }
        return null;
    }

    public boolean canInteract() {
        if (getMasterId() == TerrainMidlet.myInfo.var_int_a) {
            return false;
        }
        if (this.isBetPeriod) {
            return true;
        }
        if (this.isTransferPeriod && this.turnPlayerIdx >= 0 && this.var_java_util_Vector_a != null && this.turnPlayerIdx < this.var_java_util_Vector_a.size()) {
            PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(this.turnPlayerIdx);
            return p != null && p.var_int_a == TerrainMidlet.myInfo.var_int_a;
        }
        return false;
    }

    public boolean hasAnyBet(int pIdx) {
        if (pIdx < 0 || pIdx >= 8) return false;
        for (int i = 0; i < 6; ++i) {
            if (this.playerBets[pIdx][i] > 0) return true;
        }
        return false;
    }

    public void checkReadyStatus() {
        int myIdx = this.getMyPlayerIndex();
        if (this.var_java_util_Vector_a != null && myIdx >= 0 && myIdx < this.var_java_util_Vector_a.size()) {
            PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(myIdx);
            this.readyStatus = (p != null && p.var_boolean_b) ? 1 : 0;
        } else {
            this.readyStatus = 0;
        }
    }

    public void updateCommands() {
        if (!this.isBettingPhase && !this.isTransferPhase) {
            this.f = new GameCommand("Menu", new ActionListenerZoneMenu(this));
            if (this.getMasterId() == TerrainMidlet.myInfo.var_int_a) {
                this.h = new GameCommand("Bắt đầu", new ActionListenerZoneAction(this, 0));
            } else {
                this.checkReadyStatus();
                this.h = this.readyStatus == 0 ? new GameCommand("Sẵn sàng", new ActionListenerZoneAction(this, 0)) : new GameCommand("Hủy Sẵn sàng", new ActionListenerZoneAction(this, 0));
            }
            this.g = null;
        } else if (this.isTransferPhase && this.turnPlayerIdx != this.getMyPlayerIndex()) {
            this.f = new GameCommand("Menu", new ActionListenerZoneMenu(this));
            this.h = null;
            this.g = null;
        } else if (this.isTransferPhase && this.turnPlayerIdx == this.getMyPlayerIndex()) {
            this.f = new GameCommand("Menu", new ActionListenerZoneMenu(this));
            this.h = this.hasAnyBet(this.getMyPlayerIndex()) ? new GameCommand("Tả", new ActionListenerZoneAction(this, 6)) : null;
            this.g = new GameCommand("Bỏ lượt", new ActionListenerZoneAction(this, 3));
        } else if (this.isBettingPhase) {
            this.f = new GameCommand("Menu", new ActionListenerZoneMenu(this));
            this.h = new GameCommand("Cược", new ActionListenerZoneAction(this, 1));
            this.g = null;
        }
    }

    private void handleSlotTouch() {
        if (!canInteract()) {
            return;
        }
        if (GameCanvas.var_boolean_c) {
            int slotW = 40;
            int gap = 5;
            int centerX = GameCanvas.var_int_b / 2;
            int startX = centerX - (3 * slotW + 2 * gap) / 2;
            int row1Y = 20 + 54 + 20;
            int row2Y = row1Y + slotW + 10;

            for (int col = 0; col < 3; col++) {
                int sx = startX + col * (slotW + gap);
                if (GameCanvas.a(sx, row1Y, slotW, slotW)) {
                    this.selectedSlot = col;
                    this.onSlotSelected(col);
                    return;
                }
            }
            for (int col = 0; col < 3; col++) {
                int sx = startX + col * (slotW + gap);
                int slotIdx = col + 3;
                if (GameCanvas.a(sx, row2Y, slotW, slotW)) {
                    this.selectedSlot = slotIdx;
                    this.onSlotSelected(slotIdx);
                    return;
                }
            }
        }
    }

    private void onSlotSelected(int slot) {
        if (!canInteract()) {
            return;
        }
        if (this.isBettingPhase) {
            this.myBets[slot]++;
            if (this.myBets[slot] > 6) {
                this.myBets[slot] = 6;
            }
            this.sendBet();
        } else if (this.isTransferPhase) {
            if (this.isSelectingSource) {
                boolean hasChips = false;
                for (int i = 0; i < 8; ++i) {
                    PlayerAccountInfo p = getPlayerAt(i);
                    if (p == null || p.var_int_a == -1 || p.var_int_a == getMasterId() || this.playerBets[i][slot] <= 0) continue;
                    hasChips = true;
                    break;
                }
                if (hasChips) {
                    this.transferSource = slot;
                    this.isSelectingSource = false;
                    if (GameCanvas.var_game_PopupMenu_a != null) {
                        GameCanvas.var_game_PopupMenu_a.var_boolean_a = false;
                    }
                    GameCanvas.var_game_GameHelper21_a = null;
                } else {
                    GameCanvas.c("Con vật này không có chip để tả!");
                }
            } else if (slot != this.transferSource) {
                this.transferDest = slot;
                if (GameCanvas.var_game_PopupMenu_a != null) {
                    GameCanvas.var_game_PopupMenu_a.var_boolean_a = false;
                }
                GameCanvas.var_game_GameHelper21_a = null;
                this.sendTransfer(this.transferSource, this.transferDest);
                this.transferSource = -1;
                this.transferDest = -1;
                this.isSelectingSource = true;
            } else {
                GameCanvas.c("Không thể tả cùng một con vật!");
            }
        }
    }

    private void updateTimer() {
        long now = System.currentTimeMillis();
        if (this.hasDiceFinished && this.diceFinishTime > 0L) {
            long diff = now - this.diceFinishTime;
            if (diff >= RESET_DELAY) {
                resetRound();
                return;
            }
        }
        if (!this.isDiceFinished) {
            if (this.roundStartTime == 0L) {
                this.roundStartTime = now;
            }
            long elapsedRound = (now - this.roundStartTime) / 1000L;
            long elapsedState = (now - this.lastStateChangeTime) / 1000L;
            int totalSec = this.timeRemaining / 60;
            if (elapsedRound < totalSec) {
                this.countdownBet = totalSec - (int) elapsedRound;
            }
            if (elapsedState < totalSec) {
                this.countdownTransfer = totalSec - (int) elapsedState;
            }
        }
    }

    @Override
    public void a(Graphics graphics) {
        try {
            // 1. Clear background: black first, then table dark cyan/teal
            graphics.setColor(0);
            graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
            graphics.setColor(0, 102, 102);
            graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);

            // 2. Touch screen translation
            if (GameCanvas.var_boolean_d) {
                graphics.translate(0, -15);
                graphics.translate(0, -5);
            }

            // 3. Bottom wooden panels / border lines
            graphics.setColor(12965614);
            graphics.fillRect(0, GameCanvas.var_int_c - 96, GameCanvas.var_int_b, 45);
            if (imgLine != null && imgLine.getWidth() > 0) {
                for (int n = 0; n < GameCanvas.var_int_b / imgLine.getWidth(); ++n) {
                    DataUtils.a(graphics, imgLine, 0, 16, 33, 8, 0, (n + 1) * 33, GameCanvas.var_int_c - 96, 0);
                }
            }
            graphics.fillRect(0, GameCanvas.var_int_c - 68, GameCanvas.var_int_b, 68);
            graphics.fillRect(0, GameCanvas.var_int_c - 96 - 12, 75, 45);
            graphics.fillRect(GameCanvas.var_int_b - 75, GameCanvas.var_int_c - 96 - 12, 75, 45);
            graphics.setColor(6985149);
            graphics.drawRect(-1, GameCanvas.var_int_c - 96 - 12, 76, 45);
            graphics.drawRect(GameCanvas.var_int_b - 76, GameCanvas.var_int_c - 96 - 12, 76, 45);
            graphics.setColor(9289);
            graphics.drawLine(76, GameCanvas.var_int_c - 96 - 12, 76, GameCanvas.var_int_c - 96 + 33);
            graphics.drawLine(GameCanvas.var_int_b - 77, GameCanvas.var_int_c - 96 - 12, GameCanvas.var_int_b - 77, GameCanvas.var_int_c - 96 + 33);
            if (imgLine != null) {
                for (int n = 0; n < GameCanvas.var_int_b; ++n) {
                    DataUtils.a(graphics, imgLine, 0, 16, 33, 8, 0, n * 33, GameCanvas.var_int_c - 68, 0);
                }
            }
            graphics.setColor(6985149);
            graphics.drawLine(0, GameCanvas.var_int_c - 60, GameCanvas.var_int_b, GameCanvas.var_int_c - 60);
            if (imgLine != null) {
                for (int n = 0; n < 2; ++n) {
                    DataUtils.a(graphics, imgLine, 0, 16, 33, 8, 0, n * 33, GameCanvas.var_int_c - 96 - 20, 0);
                    DataUtils.a(graphics, imgLine, 0, 16, 33, 8, 0, GameCanvas.var_int_b - n * 33, GameCanvas.var_int_c - 96 - 20, 24);
                }
                DataUtils.a(graphics, imgLine, 0, 0, 33, 8, 0, 66, GameCanvas.var_int_c - 96 - 20, 0);
                DataUtils.a(graphics, imgLine, 0, 8, 33, 8, 0, GameCanvas.var_int_b - 66, GameCanvas.var_int_c - 96 - 20, 24);
            }
            graphics.translate(0, -graphics.getTranslateY());
            if (GameCanvas.var_boolean_d) {
                graphics.translate(0, -15);
            }

            int slotW = 40;
            int slotGap = 5;
            int centerX = GameCanvas.var_int_b / 2;
            int startX = centerX - (3 * slotW + 2 * slotGap) / 2;
            int dicePlateH = 54;
            int row1Y = 20 + dicePlateH + 20; // 94
            int row2Y = row1Y + slotW + 10;   // 144

            // 4. Center top: 3 dice animation / results
            if (imgBauCua != null && this.hasDiceFinished) {
                int frameH = 54;
                int maxFrames = imgBauCua.getHeight() / frameH;
                int diceGap = 8;
                int plateStartX = centerX - (3 * frameH + 2 * diceGap) / 2;
                long now = System.currentTimeMillis();
                long elapsed = now - this.diceFinishTime;

                for (int i = 0; i < 3; ++i) {
                    int dx = plateStartX + i * (frameH + diceGap);
                    int frameIdx;
                    if (elapsed < 3000L) {
                        if (now - this.lastRollAnimTime >= 200L) {
                            this.lastRollAnimTime = now;
                        }
                        frameIdx = DataUtils.b(0, 6);
                    } else {
                        frameIdx = this.diceResults[i];
                    }
                    if (frameIdx >= maxFrames) frameIdx = 0;
                    DataUtils.a(graphics, imgBauCua, 0, frameIdx * frameH, frameH, frameH, 0, dx, 10, 0);
                }
            }

            // 5. 6 Animal betting slots (3 on row 1, 3 on row 2)
            if (imgODat != null) {
                for (int col = 0; col < 3; ++col) {
                    int sx = startX + col * (slotW + slotGap);
                    drawAnimalSlot(graphics, col, sx, row1Y, slotW);
                }
                for (int col = 0; col < 3; ++col) {
                    int sx = startX + col * (slotW + slotGap);
                    int slotIdx = col + 3;
                    drawAnimalSlot(graphics, slotIdx, sx, row2Y, slotW);
                }
            }

            // 6. Clear lower felt area before painting players
            graphics.setColor(0, 102, 102);
            graphics.fillRect(0, GameCanvas.var_int_c - 65, GameCanvas.var_int_b, 70);

            // 7. Paint players around room
            paintPlayers(graphics);

            // 8. Paint game status text & results
            paintGameStatus(graphics, dicePlateH, row2Y + slotW + 20);

            // 9. Softkeys at bottom
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
            BaseScreen.c(graphics);

            int fontOffset = GameCanvas.var_boolean_d ? 12 : 3;
            if (GameCanvas.var_game_GameHelper21_a == null) {
                if (this.f != null) {
                    FontRenderer.a.a(graphics, this.f.var_java_lang_String_a, 5, GameCanvas.var_int_c - FontRenderer.a.a() - fontOffset, 0);
                }
                if (this.h != null) {
                    FontRenderer.a.a(graphics, this.h.var_java_lang_String_a, GameCanvas.var_int_b / 2, GameCanvas.var_int_c - FontRenderer.a.a() - fontOffset, 2);
                }
                if (this.g != null) {
                    FontRenderer.a.a(graphics, this.g.var_java_lang_String_a, GameCanvas.var_int_b - 5, GameCanvas.var_int_c - FontRenderer.a.a() - fontOffset, 1);
                }
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private void drawAnimalSlot(Graphics graphics, int slotIdx, int sx, int sy, int slotW) {
        // Circular cursor + arrow when selected
        if (canInteract() && this.selectedSlot == slotIdx) {
            int cx = sx + slotW / 2;
            int cy = sy + slotW / 2;
            graphics.setColor(65280); // Green
            int r = slotW / 2 + 3;
            for (int cr = r; cr >= r - 2; --cr) {
                for (int deg = 0; deg < 360; deg += 10) {
                    int px = cx + (int) ((double) cr * Math.cos(deg * Math.PI / 180.0));
                    int py = cy + (int) ((double) cr * Math.sin(deg * Math.PI / 180.0));
                    if (px >= 0 && px < GameCanvas.var_int_b && py >= 0 && py < GameCanvas.var_int_c) {
                        graphics.drawLine(px, py, px, py);
                    }
                }
            }
            // Yellow pointer
            graphics.setColor(0xFFFF00);
            graphics.fillRect(cx - 1, sy + slotW + 4, 3, 6);
            int arrowTipY = sy + slotW;
            for (int step = 0; step < 4; ++step) {
                int w = step + 1;
                for (int x = cx - w; x <= cx + w; ++x) {
                    graphics.drawLine(x, arrowTipY, x, arrowTipY);
                }
                arrowTipY++;
            }
        }

        // Draw animal frame from odat.png
        if (imgODat != null) {
            DataUtils.a(graphics, imgODat, 0, slotIdx * slotW, slotW, slotW, 0, sx, sy, 0);
        }

        // Winner highlight if round ended and won
        long elapsed = System.currentTimeMillis() - this.diceFinishTime;
        if (this.isDiceFinished && this.diceCountPerAnimal[slotIdx] > 0 && elapsed >= 3000L) {
            graphics.setColor(65280);
            graphics.fillRect(sx, sy, slotW, slotW);
            if (imgODat != null) {
                DataUtils.a(graphics, imgODat, 0, slotIdx * slotW, slotW, slotW, 0, sx, sy, 0);
            }
            FontRenderer.f.a(graphics, String.valueOf(this.diceCountPerAnimal[slotIdx]), sx + slotW / 2, sy + slotW / 2, 2);
        }

        // Draw chips on slot
        drawChipsOnSlot(graphics, sx, sy, slotW, slotIdx);
    }

    private void drawChipsOnSlot(Graphics graphics, int sx, int sy, int slotW, int slotIdx) {
        int chipX = sx + slotW - 16;
        int chipY = sy + slotW - 16;
        int chipSize = 12;
        int count = 0;
        int masterId = this.getMasterId();

        for (int i = 0; i < 8 && count < 4; ++i) {
            if (this.var_java_util_Vector_a == null || i >= this.var_java_util_Vector_a.size()) continue;
            PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(i);
            if (p == null || p.var_int_a == -1 || p.var_int_a == masterId) continue;
            int chips = this.playerBets[i][slotIdx];
            if (chips <= 0) continue;

            int cx = chipX - count * chipSize;
            int nonMasterCount = 0;
            for (int k = 0; k <= i; ++k) {
                if (k >= this.var_java_util_Vector_a.size()) continue;
                PlayerAccountInfo p2 = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(k);
                if (p2.var_int_a == -1 || p2.var_int_a == masterId) continue;
                if (k == i) break;
                ++nonMasterCount;
            }
            int chipColor = nonMasterCount % 4;

            if (imgChip != null) {
                DataUtils.a(graphics, imgChip, 0, chipColor * chipSize, chipSize, chipSize, 0, cx, chipY, 0);
                graphics.setColor(0);
                FontRenderer.e.a(graphics, String.valueOf(chips), cx + 6, chipY + 8, 2);
            } else {
                int[] colors = new int[]{65280, 0xFFFF00, 0xFF0000, 0xFF00FF};
                graphics.setColor(colors[chipColor]);
                graphics.fillRect(cx, chipY, chipSize, chipSize);
                graphics.setColor(0);
                graphics.drawRect(cx, chipY, chipSize, chipSize);
                FontRenderer.a.a(graphics, String.valueOf(chips), cx + 6, chipY + 8, 2);
            }
            ++count;
        }
    }

    private void paintPlayers(Graphics graphics) {
        if (this.var_java_util_Vector_a == null || this.var_java_util_Vector_a.isEmpty()) return;
        int masterId = this.getMasterId();

        if (BoardScreen.var_byte_b != 7) {
            for (int i = 0; i < 8 && i < this.var_java_util_Vector_a.size(); ++i) {
                PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(i);
                if (p == null || p.var_int_a == -1) continue;
                boolean isRightSide = i % 2 != 0;
                int px = this.var_int_arr_lIII1III11I[i] + (isRightSide ? -2 : 2);
                int py = this.var_int_arr_llI1lI1Il[i] + (GameCanvas.var_boolean_d ? 8 : 13);
                int dir = isRightSide ? 0 : 2;

                PlayerEntity.a(graphics, p.var_byte_a, 5, px, py, dir, p.var_game_EquipSlotSet_a);
                p.a(graphics, px, py, dir);
                if (p.var_javax_microedition_lcdui_Image_a != null) {
                    graphics.drawImage(p.var_javax_microedition_lcdui_Image_a, this.var_int_arr_lIII1III11I[i] - 18, this.var_int_arr_llI1lI1Il[i] - (BaseScreen.var_int_r - 4), 0);
                }
                BoardScreen.a(graphics, p.g, this.var_int_arr_lIII1III11I[i], this.var_int_arr_llI1lI1Il[i] - 21, 3);
                (BoardScreen.var_byte_b != 5 && i % 2 == 0 ? FontRenderer.g : FontRenderer.h).a(graphics, p.var_java_lang_String_a, this.var_int_arr_lIII1III11I[i], this.var_int_arr_llI1lI1Il[i] + 15, 2);

                paintPlayerTotalChips(graphics, i, this.var_int_arr_lIII1III11I[i], this.var_int_arr_llI1lI1Il[i] + 5, masterId);
                paintPlayerMoney(graphics, p, this.var_int_arr_lIII1III11I[i], this.var_int_arr_llI1lI1Il[i] + 25);
                paintPlayerStatus(graphics, p, this.var_int_arr_lIII1III11I[i], this.var_int_arr_llI1lI1Il[i], masterId);
            }
        } else {
            for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
                PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(i);
                if (p == null || p.var_int_a == -1) continue;
                boolean isRightSide = i % 2 != 0;
                int px = this.var_int_arr_lIII1III11I[0] + (isRightSide ? -2 : 2);
                int py = this.var_int_arr_llI1lI1Il[0] + (GameCanvas.var_boolean_d ? 8 : 13);
                int dir = isRightSide ? 0 : 2;

                PlayerEntity.a(graphics, p.var_byte_a, 5, px, py, dir, p.var_game_EquipSlotSet_a);
                p.a(graphics, px, py, dir);
                if (p.var_javax_microedition_lcdui_Image_a != null) {
                    graphics.drawImage(p.var_javax_microedition_lcdui_Image_a, this.var_int_arr_lIII1III11I[0] - 18, this.var_int_arr_llI1lI1Il[0] - (BaseScreen.var_int_r - 4), 0);
                }
                BoardScreen.a(graphics, p.g, this.var_int_arr_lIII1III11I[0], this.var_int_arr_llI1lI1Il[0] - 21, 3);
                (i % 2 != 0 ? FontRenderer.h : FontRenderer.g).a(graphics, p.var_java_lang_String_a, this.var_int_arr_lIII1III11I[0], this.var_int_arr_llI1lI1Il[0] + 15, 2);

                paintPlayerTotalChips(graphics, i, this.var_int_arr_lIII1III11I[0], this.var_int_arr_llI1lI1Il[0] + 5, masterId);
                paintPlayerMoney(graphics, p, this.var_int_arr_lIII1III11I[0], this.var_int_arr_llI1lI1Il[0] + 25);
                paintPlayerStatus(graphics, p, this.var_int_arr_lIII1III11I[0], this.var_int_arr_llI1lI1Il[0], masterId);
            }
        }
    }

    private void paintPlayerTotalChips(Graphics graphics, int pIdx, int px, int py, int masterId) {
        if (this.var_java_util_Vector_a == null || pIdx < 0 || pIdx >= this.var_java_util_Vector_a.size()) return;
        PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(pIdx);
        if (p == null || p.var_int_a == -1 || p.var_int_a == masterId) return;

        int total = 0;
        for (int a = 0; a < 6; ++a) total += this.playerBets[pIdx][a];
        if (total > 0) {
            int nonMasterCount = 0;
            for (int k = 0; k <= pIdx; ++k) {
                if (k >= this.var_java_util_Vector_a.size()) continue;
                PlayerAccountInfo p2 = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(k);
                if (p2.var_int_a == -1 || p2.var_int_a == masterId) continue;
                if (k == pIdx) break;
                ++nonMasterCount;
            }
            int chipColor = nonMasterCount % 4;
            int chipSize = 12;
            int cx = px - chipSize / 2;
            if (imgChip != null) {
                DataUtils.a(graphics, imgChip, 0, chipColor * chipSize, chipSize, chipSize, 0, cx, py, 0);
                graphics.setColor(0);
                FontRenderer.e.a(graphics, String.valueOf(total), cx + 6, py + 8, 2);
            } else {
                int[] colors = new int[]{65280, 0xFFFF00, 0xFF0000, 0xFF00FF};
                graphics.setColor(colors[chipColor]);
                graphics.fillRect(cx, py, chipSize, chipSize);
                graphics.setColor(0);
                graphics.drawRect(cx, py, chipSize, chipSize);
                FontRenderer.a.a(graphics, String.valueOf(total), cx + 6, py + 8, 2);
            }
        }
    }

    private void paintPlayerMoney(Graphics graphics, PlayerAccountInfo p, int px, int py) {
        if (p == null || p.var_int_a == -1) return;
        String mStr = formatMoney(p.var_long_c) + " xu";
        FontRenderer.e.a(graphics, mStr, px, py, 2);
    }

    private void paintPlayerStatus(Graphics graphics, PlayerAccountInfo p, int px, int py, int masterId) {
        if (p == null || p.var_int_a == -1) return;
        if (p.var_int_a == masterId) {
            FontRenderer.e.a(graphics, StringUtils.cB(), px, py - 32, 2); // "Chủ phòng"
        } else {
            if (!(this.isTransferPeriod || this.isBetPeriod)) {
                if (p.var_boolean_b) {
                    FontRenderer.e.a(graphics, "ok", px, py - 32, 2);
                }
            }
        }
    }

    private void paintGameStatus(Graphics graphics, int dicePlateH, int statusY) {
        int centerX = GameCanvas.var_int_b / 2;
        if (this.isDiceFinished) {
            FontRenderer.f.a(graphics, "KẾT QUẢ!", centerX, 10 + dicePlateH, 2);
            int myIdx = getMyPlayerIndex();
            if (myIdx >= 0 && this.playerMoney[myIdx] != 0L) {
                long m = this.playerMoney[myIdx];
                String resStr = m > 0L ? "Thắng: +" + m + " xu" : "Thua: " + m + " xu";
                FontRenderer.e.a(graphics, resStr, centerX, 20 + dicePlateH * 3, 2);
            }
            if (this.hasDiceFinished && this.diceFinishTime > 0L) {
                long diff = System.currentTimeMillis() - this.diceFinishTime;
                long remain = RESET_DELAY - diff;
                if (remain > 0L) {
                    int sec = (int) (remain / 1000L) + 1;
                    if (sec <= 3) {
                        FontRenderer.e.a(graphics, "Reset sau: " + sec + "s", centerX, 35 + dicePlateH * 3, 2);
                    }
                }
            }
        } else {
            int totalSec = this.timeRemaining / 60;
            FontRenderer.e.a(graphics, "Thời gian: " + totalSec + "s", centerX, 5 + dicePlateH, 2);
            if (this.isBetPeriod) {
                FontRenderer.e.a(graphics, "Giai đoạn cược - " + this.countdownBet + "s", centerX, 5 + dicePlateH + 15, 2);
            } else if (this.isTransferPeriod) {
                String transferStr = "Giai đoạn tả - " + this.countdownTransfer + "s";
                if (this.var_java_util_Vector_a != null && this.turnPlayerIdx >= 0 && this.turnPlayerIdx < this.var_java_util_Vector_a.size()) {
                    PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(this.turnPlayerIdx);
                    if (p != null) {
                        transferStr = "Tả cược - " + p.var_java_lang_String_a + " - " + this.countdownTransfer + "s";
                    }
                }
                FontRenderer.e.a(graphics, transferStr, centerX, 5 + dicePlateH + 15, 2);
            }
        }

        // Tả instruction
        if (this.isTransferPhase && canInteract() && this.transferSource >= 0) {
            if (this.transferDest < 0) {
                FontRenderer.e.a(graphics, "Nguồn: " + animalNames[this.transferSource] + " - Chọn đích", 10, statusY, 0);
            } else {
                FontRenderer.e.a(graphics, "Tả: " + animalNames[this.transferSource] + " -> " + animalNames[this.transferDest], 10, statusY, 0);
            }
        }

        // Room fee / bet at bottom center
        if (this.var_int_lIII1III11I != 0) {
            FontRenderer.e.a(graphics, this.var_int_lIII1III11I + " xu", centerX, 250, 3);
        }
    }

    private String formatMoney(long m) {
        if (m >= 1000000000L) return (m / 1000000000L) + "tỷ";
        if (m >= 1000000L) return (m / 1000000L) + "tr";
        if (m >= 1000L) return (m / 1000L) + "k";
        return String.valueOf(m);
    }

    @Override
    public void void_b() {
        super.void_b();
        handleSlotTouch();

        // Key controls for selecting and placing bets
        if ((this.isBettingPhase || this.isTransferPhase) && canInteract()) {
            if (GameCanvas.var_boolean_arr_a[2]) {
                GameCanvas.var_boolean_arr_a[2] = false;
                this.selectedSlot = this.selectedSlot >= 3 ? this.selectedSlot - 3 : this.selectedSlot + 3;
                return;
            }
            if (GameCanvas.var_boolean_arr_a[4]) {
                GameCanvas.var_boolean_arr_a[4] = false;
                --this.selectedSlot;
                if (this.selectedSlot < 0) this.selectedSlot = 5;
                return;
            }
            if (GameCanvas.var_boolean_arr_a[6]) {
                GameCanvas.var_boolean_arr_a[6] = false;
                ++this.selectedSlot;
                if (this.selectedSlot > 5) this.selectedSlot = 0;
                return;
            }
            if (GameCanvas.var_boolean_arr_a[8]) {
                GameCanvas.var_boolean_arr_a[8] = false;
                this.selectedSlot = this.selectedSlot < 3 ? this.selectedSlot + 3 : this.selectedSlot - 3;
                return;
            }
            if (GameCanvas.var_boolean_arr_a[5]) {
                GameCanvas.var_boolean_arr_a[5] = false;
                onSlotSelected(this.selectedSlot);
                return;
            }
        }

        // Softkeys
        if (GameCanvas.var_boolean_arr_a[5] || BaseScreen.boolean_a((byte) 2)) {
            GameCanvas.var_boolean_arr_a[5] = false;
            if (this.h != null && this.h.var_game_IActionListener_a != null) {
                this.h.var_game_IActionListener_a.a();
            }
        }
        if ((GameCanvas.var_boolean_arr_a[12] || BaseScreen.boolean_a((byte) 0)) && !GameCanvas.var_boolean_arr_b[5]) {
            GameCanvas.var_boolean_arr_a[12] = false;
            if (this.f != null && this.f.var_game_IActionListener_a != null) {
                this.f.var_game_IActionListener_a.a();
            }
        }
        if (GameCanvas.var_boolean_arr_a[13] || BaseScreen.boolean_a((byte) 1) && !GameCanvas.var_boolean_arr_b[5]) {
            GameCanvas.var_boolean_arr_a[13] = false;
            if (this.g != null && this.g.var_game_IActionListener_a != null) {
                this.g.var_game_IActionListener_a.a();
            }
        }
    }

    public static class ActionListenerZoneAction implements IActionListener {
        private final int actionType;
        private final ZoneScreen screen;

        public ActionListenerZoneAction(ZoneScreen screen, int actionType) {
            this.screen = screen;
            this.actionType = actionType;
        }

        @Override
        public void a() {
            switch (this.actionType) {
                case 0:
                    // Bat dau hoac San sang
                    if (this.screen.getMasterId() != TerrainMidlet.myInfo.var_int_a) {
                        if (this.screen.readyStatus == 0) {
                            this.screen.readyStatus = 1;
                            ConnectionWatchdog.game_ConnectionWatchdog_a().a(true);
                            this.screen.h = new GameCommand("Hủy Sẵn sàng", new ActionListenerZoneAction(this.screen, 0));
                        } else {
                            this.screen.readyStatus = 0;
                            ConnectionWatchdog.game_ConnectionWatchdog_a().a(false);
                            this.screen.h = new GameCommand("Sẵn sàng", new ActionListenerZoneAction(this.screen, 0));
                        }
                    } else {
                        // Chu phong: Bat dau
                        if (GameCanvas.var_game_PopupMenu_a != null) {
                            GameCanvas.var_game_PopupMenu_a.var_boolean_a = false;
                        }
                        if ((long) this.screen.var_int_lIII1III11I > TerrainMidlet.myInfo.var_long_c) {
                            GameCanvas.void_a(StringUtils.by()); // "Bạn không đủ tiền cược!"
                        }
                        GameCanvas.b(StringUtils.bw()); // "Xin chờ..."
                        ConnectionWatchdog.game_ConnectionWatchdog_a().a(this.screen.var_int_arr_a);
                        ConnectionWatchdog.game_ConnectionWatchdog_a().e();
                    }
                    break;
                case 1:
                    // Cuoc
                    this.screen.sendBet();
                    break;
                case 3:
                    // Bo luot
                    this.screen.sendPassTurn();
                    break;
                case 6:
                    // Ta cuoc
                    this.screen.executeTransferAction();
                    break;
            }
        }
    }

    public static class ActionListenerZoneMenu implements IActionListener {
        private final ZoneScreen screen;

        public ActionListenerZoneMenu(ZoneScreen screen) {
            this.screen = screen;
        }

        @Override
        public void a() {
            Vector vector = new Vector();
            vector.addElement(new GameCommand("LỊCH SỬ BẦU CUA", new IActionListener() {
                @Override
                public void a() {
                    screen.showHistory();
                }
            }));
            vector.addElement(new GameCommand("Rời phòng", new IActionListener() {
                @Override
                public void a() {
                    ConnectionWatchdog.game_ConnectionWatchdog_a().k();
                }
            }));
            GameCanvas.var_game_PopupMenu_a.a(vector);
        }
    }
}
