$f = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\handler\InventoryMessageHandler.java"
$content = [System.IO.File]::ReadAllText($f, [System.Text.Encoding]::UTF8)

# Find where handleSlotPunching or MAX_SLOTS first appears
$idx1 = $content.IndexOf("public static final int MAX_SLOTS")
if ($idx1 -lt 0) {
    $idx1 = $content.IndexOf("public void handleSlotPunching")
}

Write-Host "Cut point index: $idx1"

$cleanCode = @'
    public static final int MAX_SLOTS = 10;
    public static final int[] PUNCH_XU_COST = new int[] {
        20000, 50000, 100000, 500000, 2500000, 4500000, 6500000, 8500000, 10500000, 12500000
    };
    public static final int[] PUNCH_LUONG_COST = new int[] {
        0, 0, 0, 500, 2500, 4500, 6500, 8500, 10500, 12500
    };
    public static final double[] PUNCH_RATES = new double[] {
        100.0, 80.0, 60.0, 20.0, 10.0, 5.0, 5.0, 5.0, 5.0, 5.0
    };
    public static final int[] PUNCH_REQ_ITEM_ID = new int[] {
        -1, -1, -1, 145, 145, 146, 146, 146, 146, 146
    };
    public static final int[] PUNCH_REQ_ITEM_QTY = new int[] {
        0, 0, 0, 1, 1, 1, 1, 1, 1, 1
    };

    public void handleSlotPunching(Message ms) throws IOException {
        DataInputStream dis = ms.reader();
        byte action = dis.readByte();
        int equipKey = dis.readInt();

        EquipmentChest equip = us().getEquipmentByKey(equipKey);
        if (equip == null) {
            sendSlotPunchResult(false, "Không tìm thấy trang bị!");
            return;
        }

        byte[] currentSlots = equip.getSlots();
        int curHoles = currentSlots != null ? currentSlots.length : 0;

        if (action == 0) {
            if (curHoles >= MAX_SLOTS) {
                Message res = new Message((byte) 13);
                DataOutputStream ds = res.writer();
                ds.writeByte(0);
                ds.writeInt(0);
                ds.writeInt(0);
                ds.writeDouble(0.0);
                ds.writeByte(MAX_SLOTS);
                ds.writeByte(0);
                ds.flush();
                sendMessage(res);
                return;
            }

            int xuCost = PUNCH_XU_COST[curHoles];
            int luongCost = PUNCH_LUONG_COST[curHoles];
            double rate = PUNCH_RATES[curHoles];
            int reqId = PUNCH_REQ_ITEM_ID[curHoles];
            int reqQty = PUNCH_REQ_ITEM_QTY[curHoles];

            Message res = new Message((byte) 13);
            DataOutputStream ds = res.writer();
            ds.writeByte(0);
            ds.writeInt(xuCost);
            ds.writeInt(luongCost);
            ds.writeDouble(rate);
            ds.writeByte(MAX_SLOTS);
            if (reqId > 0 && reqQty > 0) {
                ds.writeByte(1);
                ds.writeShort((short) reqId);
                SpecialItem item = SpecialItemManager.getSpecialItemById((short) reqId);
                String name = item != null ? item.getName() : "Vật phẩm " + reqId;
                ds.writeUTF(name);
                ds.writeShort((short) reqQty);
            } else {
                ds.writeByte(0);
            }
            ds.flush();
            sendMessage(res);
        } else if (action == 1) {
            if (curHoles >= MAX_SLOTS) {
                sendSlotPunchResult(false, "Trang bị đã đạt tối đa " + MAX_SLOTS + " lỗ!");
                return;
            }

            int xuCost = PUNCH_XU_COST[curHoles];
            int luongCost = PUNCH_LUONG_COST[curHoles];
            double successRate = PUNCH_RATES[curHoles];
            int reqId = PUNCH_REQ_ITEM_ID[curHoles];
            int reqQty = PUNCH_REQ_ITEM_QTY[curHoles];

            if (us().getXu() < xuCost) {
                sendSlotPunchResult(false, "Không đủ xu để đục lỗ!");
                return;
            }
            if (us().getLuong() < luongCost) {
                sendSlotPunchResult(false, "Không đủ lượng để đục lỗ!");
                return;
            }

            SpecialItemChest reqChest = null;
            if (reqId > 0 && reqQty > 0) {
                reqChest = us().getSpecialItemById((short) reqId);
                if (reqChest == null || reqChest.getQuantity() < reqQty) {
                    SpecialItem item = SpecialItemManager.getSpecialItemById((short) reqId);
                    String name = item != null ? item.getName() : "vật phẩm cần thiết";
                    sendSlotPunchResult(false, "Không đủ " + name + "!");
                    return;
                }
            }

            if (xuCost > 0) {
                us().updateXu(-xuCost);
            }
            if (luongCost > 0) {
                us().updateLuong(-luongCost);
            }
            if (reqChest != null && reqQty > 0) {
                reqChest.decreaseQuantity((short) reqQty);
                if (reqChest.getQuantity() <= 0) {
                    us().getSpecialItemChest().remove(reqChest.getItem().getId());
                }
            }

            double roll = java.util.concurrent.ThreadLocalRandom.current().nextDouble() * 100.0;
            boolean success = roll < successRate;

            if (success) {
                byte[] newSlots = new byte[curHoles + 1];
                if (currentSlots != null) {
                    System.arraycopy(currentSlots, 0, newSlots, 0, curHoles);
                }
                newSlots[curHoles] = -1;
                equip.setSlots(newSlots);
                equip.setEmptySlot((byte) (equip.getEmptySlot() + 1));

                sendSlotPunchResult(true, "Đục lỗ thành công!");
            } else {
                sendSlotPunchResult(false, "Đục lỗ thất bại!");
            }

            us().sendInventoryInfo();
            us().sendUpdateMoney();
            session.getAuthMessageHandler().saveUserData(true);
        }
    }

    private void sendSlotPunchResult(boolean success, String message) throws IOException {
        Message res = new Message((byte) 13);
        DataOutputStream ds = res.writer();
        ds.writeByte(1);
        ds.writeBoolean(success);
        ds.writeUTF(message);
        ds.flush();
        sendMessage(res);
    }
}
'@

$newContent = $content.Substring(0, $idx1) + $cleanCode
[System.IO.File]::WriteAllText($f, $newContent, (New-Object System.Text.UTF8Encoding($false)))
Write-Host "Cleaned InventoryMessageHandler.java successfully"
