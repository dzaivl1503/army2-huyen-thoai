package tab.tab5;

import java.io.DataInputStream;
import java.io.IOException;

public class BauCuaHandler {
    public static final byte CMD_BAUCUA = -98;
    public static final byte SUB_TIME_STATE = 0;
    public static final byte SUB_BET_INFO = 1;
    public static final byte SUB_DICE_RESULT = 2;
    public static final byte SUB_WIN_LOSE = 3;
    public static final byte SUB_PLAYER_MONEY = 4;
    public static final byte SUB_UPDATE_BETS = 5;
    public static final byte SUB_TRANSFER_BET = 6;

    public static void handleMessage(Message msg) {
        try {
            byte sub = msg.java_io_DataInputStream_a().readByte();
            if (ZoneScreen.instance == null || BoardScreen.var_game_BoardScreen_a != ZoneScreen.instance) {
                return;
            }
            switch (sub) {
                case SUB_TIME_STATE:
                    onTimeAndState(msg);
                    break;
                case SUB_BET_INFO:
                    onPlayerBetInfo(msg);
                    break;
                case SUB_DICE_RESULT:
                    onDiceResult(msg);
                    break;
                case SUB_WIN_LOSE:
                    onWinLose(msg);
                    break;
                case SUB_PLAYER_MONEY:
                    onPlayerMoney(msg);
                    break;
                case SUB_UPDATE_BETS:
                    onUpdateBets(msg);
                    break;
                case SUB_TRANSFER_BET:
                    onTransferBet(msg);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onTimeAndState(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            byte timeSec = dis.readByte();
            byte state = dis.readByte();
            byte turnPlayer = 0;
            if (dis.available() > 0) {
                turnPlayer = dis.readByte();
            }
            if (ZoneScreen.instance != null) {
                ZoneScreen.instance.setTime(timeSec);
                ZoneScreen.instance.setState(state, turnPlayer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onPlayerBetInfo(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            byte playerIdx = dis.readByte();
            byte[] bets = new byte[6];
            for (int i = 0; i < 6; ++i) {
                bets[i] = dis.readByte();
            }
            if (ZoneScreen.instance != null) {
                ZoneScreen.instance.setPlayerBets(playerIdx, bets);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onDiceResult(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            byte dice1 = dis.readByte();
            byte dice2 = dis.readByte();
            byte dice3 = dis.readByte();
            if (ZoneScreen.instance != null) {
                ZoneScreen.instance.setDiceResult(dice1, dice2, dice3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onWinLose(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            byte result = dis.readByte();
            if (ZoneScreen.instance != null) {
                ZoneScreen.instance.setWinLoseResult(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onPlayerMoney(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            long[] money = new long[8];
            for (int i = 0; i < 8; ++i) {
                money[i] = dis.readLong();
            }
            if (ZoneScreen.instance != null) {
                ZoneScreen.instance.setPlayerMoney(money);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onUpdateBets(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            while (dis.available() > 0) {
                byte pIdx = dis.readByte();
                byte animal = dis.readByte();
                long val = dis.readLong();
                if (ZoneScreen.instance != null) {
                    ZoneScreen.instance.updateBet(pIdx, animal, val);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void onTransferBet(Message msg) {
        try {
            DataInputStream dis = msg.java_io_DataInputStream_a();
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            byte playerIdx = dis.readByte();
            byte fromAnimal = dis.readByte();
            byte toAnimal = dis.readByte();
            byte amount = dis.readByte();
            if (ZoneScreen.instance != null) {
                ZoneScreen.instance.onTransferBet(playerIdx, fromAnimal, toAnimal, amount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
