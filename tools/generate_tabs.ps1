# Sinh 6 tab doc lap (tab.tab1 .. tab.tab6) tu src/game + tools/tab_template.
# Moi tab la mot ban sao day du cua package game, nen moi tab co static/GameCanvas/ket noi rieng.
# Chay lai script nay moi khi sua src/game hoac tools/tab_template.
[CmdletBinding()]
param(
    [int]$Count = 6
)

$ErrorActionPreference = 'Stop'
$root = Split-Path -Parent $PSScriptRoot
$srcGame = Join-Path $root 'src\game'
$tmplDir = Join-Path $root 'tools\tab_template'
$outRoot = Join-Path $root 'core\src\main\java\tab'

if (-not (Test-Path $srcGame)) { throw "Khong tim thay $srcGame" }
if (-not (Test-Path $tmplDir)) { throw "Khong tim thay $tmplDir" }

$utf8 = New-Object System.Text.UTF8Encoding($false)

# Gom nguon: game truoc, template sau (template co the ghi de ten trung)
$sources = @()
$sources += Get-ChildItem $srcGame -File -Filter *.java
$sources += Get-ChildItem $tmplDir -File -Filter *.java

foreach ($n in 1..$Count) {
    $pkg = "tab.tab$n"
    $outDir = Join-Path $outRoot "tab$n"
    New-Item -ItemType Directory -Force $outDir | Out-Null
    Get-ChildItem $outDir -File -Filter *.java -ErrorAction SilentlyContinue | Remove-Item -Force

    $written = 0
    foreach ($file in $sources) {
        $text = [System.IO.File]::ReadAllText($file.FullName, [System.Text.Encoding]::UTF8)

        # 1. Doi package game / screen -> tab.tabN
        $text = [regex]::Replace($text, '(?m)^package\s+(game|screen);', "package $pkg;")
        # 2. Bo cac import cung package (khong con can vi da nam trong tab.tabN)
        $text = [regex]::Replace($text, '(?m)^import\s+game\.[A-Za-z0-9_.*]+;\r?\n', '')
        # 3. Tach du lieu tai khoan theo tab (nick rieng moi tab).
        #    Tab 1 giu nguyen ten cu de khong mat tai khoan da luu truoc do.
        if ($n -gt 1) {
            $text = $text.Replace('"caroun"', "`"caroun_$n`"")
            $text = $text.Replace('"caropass"', "`"caropass_$n`"")
            $text = $text.Replace('"remember"', "`"remember_$n`"")
        }

        $dest = Join-Path $outDir $file.Name
        [System.IO.File]::WriteAllText($dest, $text, $utf8)
        $written++
    }

    Write-Host ("[*] {0}: {1} file -> {2}" -f $pkg, $written, $outDir)
}

Write-Host "[OK] Da sinh $Count tab."
