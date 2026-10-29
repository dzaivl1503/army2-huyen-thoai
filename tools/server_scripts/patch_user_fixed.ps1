$filePath = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\entity\User.java"
$content = [System.IO.File]::ReadAllText($filePath, [System.Text.Encoding]::UTF8)

$old1 = "ds.writeLong(newItem.getItem().getId());"
$new1 = "ds.writeShort(newItem.getItem().getId());"

$old2 = "ds.writeLong(newItem.getQuantity());"
$new2 = "ds.writeByte((byte) newItem.getQuantity());"

if ($content.Contains($old1)) {
    $content = $content.Replace($old1, $new1)
    Write-Host "[OK] Replaced writeLong for itemId with writeShort"
} else {
    Write-Host "[WARN] old1 not found"
}

if ($content.Contains($old2)) {
    $content = $content.Replace($old2, $new2)
    Write-Host "[OK] Replaced writeLong for quantity with writeByte"
} else {
    Write-Host "[WARN] old2 not found"
}

[System.IO.File]::WriteAllText($filePath, $content, (New-Object System.Text.UTF8Encoding($false)))

