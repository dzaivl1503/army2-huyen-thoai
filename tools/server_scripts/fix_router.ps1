$file = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\MessageRouter.java"
$utf8NoBom = New-Object System.Text.UTF8Encoding($false)
$c = [System.IO.File]::ReadAllText($file, [System.Text.Encoding]::UTF8).TrimStart([char]0xFEFF)
$c = $c.Replace("case Cmd.DUC_LO, 13 ->", "case Cmd.DUC_LO ->")
[System.IO.File]::WriteAllText($file, $c, $utf8NoBom)
Write-Host "Fixed duplicate case in MessageRouter.java"
