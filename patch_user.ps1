$userFile = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\entity\User.java"
$content = [System.IO.File]::ReadAllText($userFile, [System.Text.Encoding]::UTF8)

# Replace writeLong with writeByte in updateInventory
$count1 = 0
if ($content.Contains("ds.writeLong(1);")) {
    $content = $content.Replace("ds.writeLong(1);", "ds.writeByte(1);")
    $count1++
}

if ($content.Contains("ds.writeLong(itemToRemove.getQuantity());")) {
    $content = $content.Replace("ds.writeLong(itemToRemove.getQuantity());", "ds.writeByte((byte) itemToRemove.getQuantity());")
    $count1++
}

$utf8NoBom = New-Object System.Text.UTF8Encoding($false)
[System.IO.File]::WriteAllText($userFile, $content, $utf8NoBom)
Write-Host "Updated User.java replacements: $count1"
