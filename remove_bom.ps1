$file = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\handler\ResourceMessageHandler.java"
$utf8NoBom = New-Object System.Text.UTF8Encoding($false)
$content = [System.IO.File]::ReadAllText($file, [System.Text.Encoding]::UTF8)

# Strip BOM if present
$content = $content.TrimStart([char]0xFEFF)

[System.IO.File]::WriteAllText($file, $content, $utf8NoBom)
Write-Host "Removed BOM from ResourceMessageHandler.java"
