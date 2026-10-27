$utf8NoBom = New-Object System.Text.UTF8Encoding($false)
$shopFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\handler\ShopMessageHandler.java"
$content = [System.IO.File]::ReadAllText($shopFile, [System.Text.Encoding]::UTF8).TrimStart([char]0xFEFF)

$target = "messageSender.sendServerMessage(us(), GameString.PURCHASE_SUCCESS);"
$replace = "us().sendInventoryInfo();`r`n        us().sendUpdateMoney();`r`n        session.getAuthMessageHandler().saveUserData(true);`r`n        messageSender.sendServerMessage(us(), GameString.PURCHASE_SUCCESS);"

if ($content.Contains($target)) {
    $content = $content.Replace($target, $replace)
    [System.IO.File]::WriteAllText($shopFile, $content, $utf8NoBom)
    Write-Host "[OK] Added inventory sync to ShopMessageHandler"
} else {
    Write-Host "[WARN] Target not found"
}
