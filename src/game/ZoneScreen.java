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
        for (int i = 0; i < this.var_java_util_Vector_a.size(); ++i) {
            PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(i);
            if (p != null && p.var_int_a == TerrainMidlet.myInfo.var_int_a) {
                return i;
            }
        }
        return -1;
    }

    public PlayerAccountInfo getPlayerAt(int idx) {
        if (idx >= 0 && idx < this.var_java_util_Vector_a.size()) {
            return (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(idx);
        }
        return null;
    }

    public int getMasterId() {
        if (!this.var_java_util_Vector_a.isEmpty()) {
            PlayerAccountInfo p0 = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(0);
            if (p0 != null && p0.var_int_a != -1) {
                return p0.var_int_a;
            }
        }
        return -1;
    }

    public boolean canInteract() {
        if (getMasterId() == TerrainMidlet.myInfo.var_int_a) {
            return false;
        }
        if (this.isBetPeriod) {
            return true;
        }
        if (this.isTransferPeriod && this.turnPlayerIdx >= 0 && this.turnPlayerIdx < this.var_java_util_Vector_a.size()) {
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
        if (myIdx >= 0 && myIdx < this.var_java_util_Vector_a.size()) {
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
            int row1Y = 10 + 54 + 20;
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

    public void onSlotSelected(int slot) {
        if (!canInteract()) {
            return;
        }
        if (this.isBettingPhase) {
            this.myBets[slot] = this.myBets[slot] + 1;
            if (this.myBets[slot] > 6) {
                this.myBets[slot] = 6;
            }
            this.sendBet();
        } else if (this.isTransferPhase) {
            int myIdx = this.getMyPlayerIndex();
            if (myIdx < 0) return;
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
                    GameCanvas.c("Đã chọn nguồn: " + animalNames[slot] + ". Chọn đích để tả.");
                } else {
                    GameCanvas.c("Con vật này không có chip để tả!");
                }
            } else if (slot != this.transferSource) {
                this.transferDest = slot;
                this.sendTransfer(this.transferSource, this.transferDest);
                GameCanvas.c("Đã tả: " + animalNames[this.transferSource] + " -> " + animalNames[this.transferDest]);
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
            // Nen toan man hinh mau xanh reu ban cuoc
            graphics.setColor(0, 102, 102);
            graphics.fillRect(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);

            int slotW = 40;
            int slotGap = 5;
            int centerX = GameCanvas.var_int_b / 2;
            int startX = centerX - (3 * slotW + 2 * slotGap) / 2;
            int dicePlateH = 54;
            int row1Y = 20 + dicePlateH + 20;
            int row2Y = row1Y + slotW + 10;

            // 1. Ve dia xuc xac o giua phia tren
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
                    if (this.isDiceFinished && elapsed >= 3000L) {
                        frameIdx = this.diceResults[i];
                    } else if (this.isBettingPhase || this.isTransferPhase) {
                        if (now - this.lastRollAnimTime >= 200L) {
                            this.lastRollAnimTime = now;
                        }
                        frameIdx = DataUtils.a(6, 8);
                    } else {
                        frameIdx = 0;
                    }
                    if (frameIdx >= maxFrames) frameIdx = 0;
                    graphics.drawRegion(imgBauCua, 0, frameIdx * frameH, frameH, frameH, 0, dx, 10, 0);
                }
            }

            // 2. Ve 6 o dat (3 o tren, 3 o duoi)
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

            // 3. Ve nguoi choi xung quanh
            paintPlayers(graphics);

            // 4. Ve thong tin trang thai / thoi gian / ket qua
            paintGameStatus(graphics, dicePlateH, row2Y + slotW + 20);

            // 5. Ve thanh softkey phia duoi
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            graphics.setClip(0, 0, GameCanvas.var_int_b, GameCanvas.var_int_c);
            BaseScreen.c(graphics);

            int fontOffset = GameCanvas.var_boolean_d ? 12 : 3;
            if (this.f != null) {
                FontRenderer.a.a(graphics, this.f.var_java_lang_String_a, 5, GameCanvas.var_int_c - FontRenderer.a.a() - fontOffset, 0);
            }
            if (this.h != null) {
                FontRenderer.a.a(graphics, this.h.var_java_lang_String_a, GameCanvas.var_int_b / 2, GameCanvas.var_int_c - FontRenderer.a.a() - fontOffset, 2);
            }
            if (this.g != null) {
                FontRenderer.a.a(graphics, this.g.var_java_lang_String_a, GameCanvas.var_int_b - 5, GameCanvas.var_int_c - FontRenderer.a.a() - fontOffset, 1);
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private void drawAnimalSlot(Graphics graphics, int slotIdx, int sx, int sy, int slotW) {
        // Con tro vi tri dang chon
        if (canInteract() && this.selectedSlot == slotIdx) {
            graphics.setColor(0x00FF00);
            graphics.drawRect(sx - 2, sy - 2, slotW + 3, slotW + 3);
            graphics.setColor(0xFFFF00);
            graphics.fillRect(sx + slotW / 2 - 2, sy + slotW + 2, 4, 6);
        }

        // Ve icon con vat tu odat.png
        graphics.drawRegion(imgODat, 0, slotIdx * slotW, slotW, slotW, 0, sx, sy, 0);

        // Neu da quay xong va con vat nay trúng
        long elapsed = System.currentTimeMillis() - this.diceFinishTime;
        if (this.isDiceFinished && this.diceCountPerAnimal[slotIdx] > 0 && elapsed >= 3000L) {
            graphics.setColor(0x00FF00);
            graphics.fillRect(sx, sy, slotW, slotW);
            graphics.drawRegion(imgODat, 0, slotIdx * slotW, slotW, slotW, 0, sx, sy, 0);
            FontRenderer.f.a(graphics, String.valueOf(this.diceCountPerAnimal[slotIdx]), sx + slotW / 2, sy + slotW / 2, 2);
        }

        // Ve cac chip cuoc o goc tren con vat
        drawChipsOnSlot(graphics, sx, sy, slotW, slotIdx);
    }

    private void drawChipsOnSlot(Graphics graphics, int sx, int sy, int slotW, int slotIdx) {
        int chipX = sx + slotW - 16;
        int chipY = sy + slotW - 16;
        int chipSize = 12;
        int count = 0;

        for (int i = 0; i < 8 && count < 4; ++i) {
            PlayerAccountInfo p = getPlayerAt(i);
            if (p == null || p.var_int_a == -1 || p.var_int_a == getMasterId()) continue;
            int chips = this.playerBets[i][slotIdx];
            if (chips <= 0) continue;

            int cx = chipX - count * chipSize;
            if (imgChip != null) {
                int chipColorIdx = count % 4;
                graphics.drawRegion(imgChip, 0, chipColorIdx * chipSize, chipSize, chipSize, 0, cx, chipY, 0);
                graphics.setColor(0);
                FontRenderer.e.a(graphics, String.valueOf(chips), cx + 6, chipY + 8, 2);
            } else {
                int[] colors = new int[]{0x00FF00, 0xFFFF00, 0xFF0000, 0xFF00FF};
                graphics.setColor(colors[count % 4]);
                graphics.fillRect(cx, chipY, chipSize, chipSize);
                FontRenderer.a.a(graphics, String.valueOf(chips), cx + 6, chipY + 8, 2);
            }
            ++count;
        }
    }

    private void paintPlayers(Graphics graphics) {
        if (this.var_java_util_Vector_a.isEmpty()) return;
        int[] posX = new int[]{24, GameCanvas.var_int_b - 24, 62, GameCanvas.var_int_b - 62, 62, GameCanvas.var_int_b - 62, 24, GameCanvas.var_int_b - 24};
        int[] posY = new int[]{GameCanvas.var_int_c - 128, GameCanvas.var_int_c - 128, GameCanvas.var_int_c - 80, GameCanvas.var_int_c - 80, GameCanvas.var_int_c - 128, GameCanvas.var_int_c - 128, GameCanvas.var_int_c - 80, GameCanvas.var_int_c - 80};

        for (int i = 0; i < 8; ++i) {
            PlayerAccountInfo p = getPlayerAt(i);
            if (p == null || p.var_int_a == -1) continue;
            boolean isLeft = i % 2 != 0;
            int px = posX[i] + (isLeft ? -2 : 2);
            int py = posY[i] + (GameCanvas.var_boolean_d ? 8 : 13);

            PlayerEntity.a(graphics, p.var_byte_a, 5, px, py, isLeft ? 0 : 2, p.var_game_EquipSlotSet_a);
            if (p.var_javax_microedition_lcdui_Image_a != null) {
                graphics.drawImage(p.var_javax_microedition_lcdui_Image_a, posX[i] - 18, posY[i] - (BaseScreen.var_int_r - 4), 0);
            }
            BoardScreen.a(graphics, p.g, posX[i], posY[i] - 15, 3);

            // Ten nguoi choi
            FontRenderer nameFont = (i % 2 == 0) ? FontRenderer.g : FontRenderer.h;
            nameFont.a(graphics, p.var_java_lang_String_a, posX[i], posY[i] + 15, 2);

            // Tien xu
            String moneyStr = formatMoney(p.var_long_c);
            FontRenderer.e.a(graphics, moneyStr, posX[i], posY[i] + 25, 2);

            // Tong chip cua nguoi choi
            int totalChips = 0;
            for (int a = 0; a < 6; ++a) totalChips += this.playerBets[i][a];
            if (totalChips > 0 && imgChip != null) {
                int cx = posX[i] - 6;
                int cy = posY[i] + 5;
                graphics.drawRegion(imgChip, 0, (i % 4) * 12, 12, 12, 0, cx, cy, 0);
                graphics.setColor(0);
                FontRenderer.e.a(graphics, String.valueOf(totalChips), cx + 6, cy + 8, 2);
            }

            // Trang thai OK / San sang / Chu phong
            if (p.var_int_a == getMasterId()) {
                FontRenderer.e.a(graphics, "Chủ phòng", posX[i], posY[i] - 32, 2);
            } else if (p.var_boolean_b && !isBetPeriod && !isTransferPeriod) {
                FontRenderer.e.a(graphics, "Sẵn sàng", posX[i], posY[i] - 32, 2);
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
                if (this.turnPlayerIdx >= 0 && this.turnPlayerIdx < this.var_java_util_Vector_a.size()) {
                    PlayerAccountInfo p = (PlayerAccountInfo) this.var_java_util_Vector_a.elementAt(this.turnPlayerIdx);
                    if (p != null) {
                        transferStr = "Tả cược - " + p.var_java_lang_String_a + " - " + this.countdownTransfer + "s";
                    }
                }
                FontRenderer.e.a(graphics, transferStr, centerX, 5 + dicePlateH + 15, 2);
            }
        }

        // Huong dan ta cuoc
        if (this.isTransferPhase && canInteract() && this.transferSource >= 0) {
            if (this.transferDest < 0) {
                FontRenderer.e.a(graphics, "Nguồn: " + animalNames[this.transferSource] + " - Chọn đích", 10, statusY, 0);
            } else {
                FontRenderer.e.a(graphics, "Tả: " + animalNames[this.transferSource] + " -> " + animalNames[this.transferDest], 10, statusY, 0);
            }
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
        updateTimer();

        // Xu ly phim ban phim ao / phim cung
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

        // Xu ly softkeys
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
