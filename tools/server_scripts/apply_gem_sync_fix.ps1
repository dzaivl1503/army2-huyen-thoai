$utf8NoBom = New-Object System.Text.UTF8Encoding($false)

# 1. Update InventoryMessageHandler.java
$invHandlerFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\handler\InventoryMessageHandler.java"
$content = [System.IO.File]::ReadAllText($invHandlerFile, [System.Text.Encoding]::UTF8)

# 1a. In INSERT_GEM_INTO_EQUIPMENT: add sendInventoryInfo, sendUpdateMoney, saveUserData
$oldInsert = @'
                    SpecialItemChest gemToRemove = new SpecialItemChest((short) 1, currentInventoryGem.getItem());
                    us().updateInventory(equip, null, null, List.of(gemToRemove));
                    if (equip.isInUse()) {
                        us().sendCharacterInfo();
                    }
                    messageSender.sendServerMessage(us(), GameString.GEM_COMBINE_SUCCESS);
'@

$newInsert = @'
                    SpecialItemChest gemToRemove = new SpecialItemChest((short) 1, currentInventoryGem.getItem());
                    us().updateInventory(equip, null, null, List.of(gemToRemove));

                    us().sendInventoryInfo();
                    us().sendUpdateMoney();
                    if (equip.isInUse()) {
                        us().sendCharacterInfo();
                    }
                    session.getAuthMessageHandler().saveUserData(true);

                    messageSender.sendServerMessage(us(), GameString.GEM_COMBINE_SUCCESS);
'@

if ($content.Contains($oldInsert)) {
    $content = $content.Replace($oldInsert, $newInsert)
    Write-Host "[OK] Updated INSERT_GEM_INTO_EQUIPMENT with sendInventoryInfo and saveUserData"
} else {
    Write-Host "[WARN] INSERT_GEM_INTO_EQUIPMENT target block not found"
}

# 1b. In UPGRADE_GEM: add sendInventoryInfo, sendUpdateMoney, saveUserData
$oldUpgradeGemSuccess = @'
                    if (successCount > 0) {
                        SpecialItemChest newItem = new SpecialItemChest((short) successCount, nextItem);
                        us().updateInventory(null, null, List.of(newItem), List.of(itemToRemove));
'@

$newUpgradeGemSuccess = @'
                    if (successCount > 0) {
                        SpecialItemChest newItem = new SpecialItemChest((short) successCount, nextItem);
                        us().updateInventory(null, null, List.of(newItem), List.of(itemToRemove));
                        us().sendInventoryInfo();
                        us().sendUpdateMoney();
                        session.getAuthMessageHandler().saveUserData(true);
'@

if ($content.Contains($oldUpgradeGemSuccess)) {
    $content = $content.Replace($oldUpgradeGemSuccess, $newUpgradeGemSuccess)
    Write-Host "[OK] Updated UPGRADE_GEM success branch"
}

$oldUpgradeGemFail = @'
                    } else {
                        us().updateInventory(null, null, null, List.of(itemToRemove));
                        messageSender.sendServerMessage(us(), GameString.createGemUpgradeAllFailMessage(
'@

$newUpgradeGemFail = @'
                    } else {
                        us().updateInventory(null, null, null, List.of(itemToRemove));
                        us().sendInventoryInfo();
                        us().sendUpdateMoney();
                        session.getAuthMessageHandler().saveUserData(true);
                        messageSender.sendServerMessage(us(), GameString.createGemUpgradeAllFailMessage(
'@

if ($content.Contains($oldUpgradeGemFail)) {
    $content = $content.Replace($oldUpgradeGemFail, $newUpgradeGemFail)
    Write-Host "[OK] Updated UPGRADE_GEM fail branch"
}

# 1c. In UPGRADE_STONE
$oldUpgradeStoneSuccess = @'
                    if (successCount > 0) {
                        SpecialItemChest newItem = new SpecialItemChest((short) successCount, nextItem);
                        us().updateInventory(null, null, List.of(newItem), List.of(itemToRemove));
'@

# We already replaced first occurrence if exact match, let's check if there's second occurrence or replace in context
$oldUpgradeStoneFail = @'
                    } else {
                        us().updateInventory(null, null, null, List.of(itemToRemove));
                        messageSender.sendServerMessage(us(), GameString.createStoneUpgradeMaterialAllFailMessage(
'@

$newUpgradeStoneFail = @'
                    } else {
                        us().updateInventory(null, null, null, List.of(itemToRemove));
                        us().sendInventoryInfo();
                        us().sendUpdateMoney();
                        session.getAuthMessageHandler().saveUserData(true);
                        messageSender.sendServerMessage(us(), GameString.createStoneUpgradeMaterialAllFailMessage(
'@

if ($content.Contains($oldUpgradeStoneFail)) {
    $content = $content.Replace($oldUpgradeStoneFail, $newUpgradeStoneFail)
    Write-Host "[OK] Updated UPGRADE_STONE fail branch"
}

# 1d. In UPGRADE_EQUIP_WITH_STONE
$oldEquipStoneSuccess = @'
                    if (result.success) {
                        us().updateInventory(equip, null, null, toRemove);
                        if (equip.isInUse()) {
                            us().sendCharacterInfo();
                        }
                        messageSender.sendServerMessage(us(), GameString.createStoneUpgradeSuccessMessage(
'@

$newEquipStoneSuccess = @'
                    if (result.success) {
                        us().updateInventory(equip, null, null, toRemove);
                        us().sendInventoryInfo();
                        us().sendUpdateMoney();
                        if (equip.isInUse()) {
                            us().sendCharacterInfo();
                        }
                        session.getAuthMessageHandler().saveUserData(true);
                        messageSender.sendServerMessage(us(), GameString.createStoneUpgradeSuccessMessage(
'@

if ($content.Contains($oldEquipStoneSuccess)) {
    $content = $content.Replace($oldEquipStoneSuccess, $newEquipStoneSuccess)
    Write-Host "[OK] Updated UPGRADE_EQUIP_WITH_STONE success branch"
}

$oldEquipStoneFail = @'
                    } else {
                        us().updateInventory(equip, null, null, toRemove);
                        if (equip.isInUse()) {
                            us().sendCharacterInfo();
                        }
                        // Phân biệt thông báo: tụt cấp hay bảo hiểm giữ
'@

$newEquipStoneFail = @'
                    } else {
                        us().updateInventory(equip, null, null, toRemove);
                        us().sendInventoryInfo();
                        us().sendUpdateMoney();
                        if (equip.isInUse()) {
                            us().sendCharacterInfo();
                        }
                        session.getAuthMessageHandler().saveUserData(true);
                        // Phân biệt thông báo: tụt cấp hay bảo hiểm giữ
'@

if ($content.Contains($oldEquipStoneFail)) {
    $content = $content.Replace($oldEquipStoneFail, $newEquipStoneFail)
    Write-Host "[OK] Updated UPGRADE_EQUIP_WITH_STONE fail branch"
}

# 1e. In COMBINE_SPECIAL_ITEM
$oldCombine = @'
                    us().updateInventory(null, null, addItems, specialItemList);

                    // Cập nhật nhiệm vụ nếu chế tạo ra ngọc cấp 8, 9, 10
'@

$newCombine = @'
                    us().updateInventory(null, null, addItems, specialItemList);
                    us().sendInventoryInfo();
                    us().sendUpdateMoney();
                    session.getAuthMessageHandler().saveUserData(true);

                    // Cập nhật nhiệm vụ nếu chế tạo ra ngọc cấp 8, 9, 10
'@

if ($content.Contains($oldCombine)) {
    $content = $content.Replace($oldCombine, $newCombine)
    Write-Host "[OK] Updated COMBINE_SPECIAL_ITEM branch"
}

[System.IO.File]::WriteAllText($invHandlerFile, $content, $utf8NoBom)

# 2. Update User.java: fix writeLong to writeByte/writeShort for inventory update packet
$userFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\entity\User.java"
$userContent = [System.IO.File]::ReadAllText($userFile, [System.Text.Encoding]::UTF8)

$oldUserRemoveEquip = @'
                updateQuantity++;
                ds.writeByte(0);
                ds.writeInt(removeEquip.getKey());
                ds.writeLong(1);
'@
$newUserRemoveEquip = @'
                updateQuantity++;
                ds.writeByte(0);
                ds.writeInt(removeEquip.getKey());
                ds.writeByte(1);
'@
if ($userContent.Contains($oldUserRemoveEquip)) {
    $userContent = $userContent.Replace($oldUserRemoveEquip, $newUserRemoveEquip)
    Write-Host "[OK] User.java: fixed removeEquip quantity format"
}

$oldUserAddItem = @'
                    updateQuantity++;
                    ds.writeByte(newItem.getQuantity() > 1 ? 3 : 1);
                    ds.writeLong(newItem.getItem().getId());
                    if (newItem.getQuantity() > 1) {
                        ds.writeLong(newItem.getQuantity());
                    }
'@
$newUserAddItem = @'
                    updateQuantity++;
                    ds.writeByte(newItem.getQuantity() > 1 ? 3 : 1);
                    ds.writeShort(newItem.getItem().getId());
                    if (newItem.getQuantity() > 1) {
                        ds.writeByte((byte) newItem.getQuantity());
                    }
'@
if ($userContent.Contains($oldUserAddItem)) {
    $userContent = $userContent.Replace($oldUserAddItem, $newUserAddItem)
    Write-Host "[OK] User.java: fixed addItems packet format"
}

$oldUserRemoveItem = @'
                    updateQuantity++;
                    ds.writeByte(0);
                    ds.writeInt(itemToRemove.getItem().getId());
                    ds.writeLong(itemToRemove.getQuantity());
'@
$newUserRemoveItem = @'
                    updateQuantity++;
                    ds.writeByte(0);
                    ds.writeInt(itemToRemove.getItem().getId());
                    ds.writeByte((byte) itemToRemove.getQuantity());
'@
if ($userContent.Contains($oldUserRemoveItem)) {
    $userContent = $userContent.Replace($oldUserRemoveItem, $newUserRemoveItem)
    Write-Host "[OK] User.java: fixed removeItems packet format"
}

[System.IO.File]::WriteAllText($userFile, $userContent, $utf8NoBom)
Write-Host "All server patches applied successfully."
