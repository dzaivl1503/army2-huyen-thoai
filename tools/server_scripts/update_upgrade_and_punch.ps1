$utf8NoBom = New-Object System.Text.UTF8Encoding($false)

# ==============================================================================
# 1. EquipmentChest.java: Fix setNewSlot & getEmptySlot to support up to 10 slots
# ==============================================================================
$equipChestFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\entity\EquipmentChest.java"
$equipChestContent = [System.IO.File]::ReadAllText($equipChestFile, [System.Text.Encoding]::UTF8).TrimStart([char]0xFEFF)

$oldSetNewSlot = @'
    public void setNewSlot(short itemId) {
        if (emptySlot <= 0 || emptySlot > 3) {
            return;
        }
        slots[3 - emptySlot] = (byte) itemId;
    }
'@

$newSetNewSlot = @'
    public byte getEmptySlot() {
        if (slots == null) return 0;
        byte count = 0;
        for (byte s : slots) {
            if (s == -1) count++;
        }
        return count;
    }

    public void setNewSlot(short itemId) {
        if (slots == null) {
            return;
        }
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == -1) {
                slots[i] = (byte) itemId;
                break;
            }
        }
    }
'@

if ($equipChestContent.Contains($oldSetNewSlot)) {
    $equipChestContent = $equipChestContent.Replace($oldSetNewSlot, $newSetNewSlot)
    [System.IO.File]::WriteAllText($equipChestFile, $equipChestContent, $utf8NoBom)
    Write-Host "[OK] Updated EquipmentChest.java with dynamic slots support"
} else {
    Write-Host "[SKIP/ALREADY DONE] EquipmentChest.java setNewSlot"
}

# ==============================================================================
# 2. User.java: Ensure sendInventoryInfo sends upgradeLevel in byte 5 (by30)
# ==============================================================================
$userFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\entity\User.java"
$userContent = [System.IO.File]::ReadAllText($userFile, [System.Text.Encoding]::UTF8).TrimStart([char]0xFEFF)

$targetInvBlock = @'
                ds.writeByte(equipment.getRemainingDays());
                ds.writeByte(equipment.getEmptySlot());
                ds.writeByte(equipment.getVipLevel());
                ds.writeByte(equipment.getUpgradeLevel());
                ds.writeByte(0); // color / effect byte
'@

$replacementInvBlock = @'
                ds.writeByte(equipment.getRemainingDays());
                ds.writeByte(equipment.getEmptySlot());
                ds.writeByte(equipment.getVipLevel());
                ds.writeByte(0); // sao / extra level (n34)
                ds.writeByte(equipment.getUpgradeLevel()); // upgradeLevel (by30 -> newTemplate.h)
'@

if ($userContent.Contains($targetInvBlock)) {
    $userContent = $userContent.Replace($targetInvBlock, $replacementInvBlock)
    [System.IO.File]::WriteAllText($userFile, $userContent, $utf8NoBom)
    Write-Host "[OK] Updated User.java: mapped upgradeLevel to by30 (newTemplate.h)"
} else {
    Write-Host "[INFO] Checking User.java sendInventoryInfo..."
}

# ==============================================================================
# 3. EquipmentUpgradeManager.java: Clean upgrade & failure logic
# ==============================================================================
$upgradeMgrFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\server\EquipmentUpgradeManager.java"
$upgradeMgrContent = [System.IO.File]::ReadAllText($upgradeMgrFile, [System.Text.Encoding]::UTF8).TrimStart([char]0xFEFF)

$oldTryUpgradeRegex = '(?s)public static UpgradeResult tryUpgrade\(EquipmentChest equip, int successRate, boolean hasInsurance\) \{.*?return new UpgradeResult\(true, false, usedInsurance, finalLevel, successRate\);\s*\}'

$newTryUpgrade = @'
public static UpgradeResult tryUpgrade(EquipmentChest equip, int successRate, boolean hasInsurance) {
        if (equip == null || equip.getEquipment() == null) {
            return new UpgradeResult(false, false, false, (byte) 0, 0.0);
        }
        byte currentLevel = equip.getUpgradeLevel();
        if (currentLevel >= MAX_LEVEL) {
            return new UpgradeResult(false, false, false, currentLevel, 0.0);
        }
        if (successRate <= 0) {
            return new UpgradeResult(false, false, false, currentLevel, 0.0);
        }

        double roll = java.util.concurrent.ThreadLocalRandom.current().nextDouble() * 100.0;
        boolean success = roll < successRate;

        if (success) {
            byte newLevel = (byte) (currentLevel + 1);
            applyUpgrade(equip, newLevel);
            return new UpgradeResult(true, true, false, newLevel, successRate);
        }

        // Thất bại:
        boolean usedInsurance = false;
        byte finalLevel = currentLevel;
        if (hasInsurance && currentLevel > 0) {
            // Có bảo hiểm: giữ nguyên cấp
            usedInsurance = true;
            finalLevel = currentLevel;
        } else {
            // Không bảo hiểm: Cấp 1..4 giữ nguyên cấp, cấp > 4 tụt 1 cấp
            if (currentLevel <= 4) {
                finalLevel = currentLevel;
            } else {
                finalLevel = (byte) (currentLevel - 1);
            }
            if (finalLevel == 0) {
                resetToBase(equip);
            } else {
                applyUpgrade(equip, finalLevel);
            }
        }
        return new UpgradeResult(true, false, usedInsurance, finalLevel, successRate);
    }
'@

$upgradeMgrContent = [System.Text.RegularExpressions.Regex]::Replace($upgradeMgrContent, $oldTryUpgradeRegex, $newTryUpgrade)
[System.IO.File]::WriteAllText($upgradeMgrFile, $upgradeMgrContent, $utf8NoBom)
Write-Host "[OK] Updated EquipmentUpgradeManager.java tryUpgrade failure downgrade logic"

# ==============================================================================
# 4. InventoryMessageHandler.java: Full Slot Punching (10 holes) & Full Upgrade
# ==============================================================================
$invHandlerFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\handler\InventoryMessageHandler.java"
$invHandlerContent = [System.IO.File]::ReadAllText($invHandlerFile, [System.Text.Encoding]::UTF8).TrimStart([char]0xFEFF)

# 4a. Update handleSlotPunching & sendSlotPunchResult
$oldPunchRegex = '(?s)public void handleSlotPunching\(Message ms\) throws IOException \{.*?\}\s*\}\s*$'

$newPunchCode = @'
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

$invHandlerContent = [System.Text.RegularExpressions.Regex]::Replace($invHandlerContent, $oldPunchRegex, $newPunchCode)

# 4b. Ensure handleUpgradeEquipment refreshes inventory and character
$oldHandleUpgradeTarget = @'
        user.updateInventory(equip, null, null, itemsToRemove);

        user.sendUpdateMoney();
'@

$newHandleUpgradeTarget = @'
        user.updateInventory(equip, null, null, itemsToRemove);

        user.sendInventoryInfo();
        user.sendUpdateMoney();
        if (equip.isInUse()) {
            user.sendCharacterInfo();
        }
        session.getAuthMessageHandler().saveUserData(true);
'@

if ($invHandlerContent.Contains($oldHandleUpgradeTarget)) {
    $invHandlerContent = $invHandlerContent.Replace($oldHandleUpgradeTarget, $newHandleUpgradeTarget)
    Write-Host "[OK] Added sendInventoryInfo, sendCharacterInfo, and saveUserData to handleUpgradeEquipment"
}

[System.IO.File]::WriteAllText($invHandlerFile, $invHandlerContent, $utf8NoBom)
Write-Host "[OK] Updated InventoryMessageHandler.java successfully"
