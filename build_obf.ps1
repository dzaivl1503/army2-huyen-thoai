<#
.SYNOPSIS
    Build and Obfuscate Army2D Client (ModByNguyenVanBang) using PowerShell.
.DESCRIPTION
    Tự động biên dịch mã nguồn Java, đóng gói tài nguyên, làm rối mã (ProGuard)
    và tiêm chữ ký chống dịch ngược cho client Mobi Army 2.
.PARAMETER NoPause
    Không dừng lại chờ phím bấm sau khi hoàn tất (phù hợp chạy tự động/CI).
.PARAMETER RunAfter
    Tự động khởi chạy client sau khi build thành công.
#>
[CmdletBinding()]
param(
    [switch]$NoPause,
    [switch]$RunAfter
)

# Chuyển về thư mục chứa script
$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $ScriptDir

# Cấu hình hiển thị console UTF-8
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

Write-Host "==========================================================" -ForegroundColor Cyan
Write-Host "     BUILD & OBFUSCATE ARMY2D (POWERSHELL BUILDER)" -ForegroundColor Yellow
Write-Host "==========================================================" -ForegroundColor Cyan
Write-Host "[*] Thu muc du an: $ScriptDir" -ForegroundColor Gray

# 1. Tim kiem Java JDK tren may
$JavaBin = $null
$JavacBin = $null

if (Get-Command javac -ErrorAction SilentlyContinue) {
    $JavacBin = (Get-Command javac).Source
    $JavaBin = (Get-Command java).Source
} elseif (Test-Path "C:\Program Files\Java\jdk-19\bin\javac.exe") {
    $JavacBin = "C:\Program Files\Java\jdk-19\bin\javac.exe"
    $JavaBin = "C:\Program Files\Java\jdk-19\bin\java.exe"
    $env:PATH = "C:\Program Files\Java\jdk-19\bin;$env:PATH"
} else {
    $foundJdks = Get-ChildItem "C:\Program Files\Java\jdk*" -ErrorAction SilentlyContinue | Sort-Object Name -Descending
    if ($foundJdks -and (Test-Path "$($foundJdks[0].FullName)\bin\javac.exe")) {
        $JavacBin = "$($foundJdks[0].FullName)\bin\javac.exe"
        $JavaBin = "$($foundJdks[0].FullName)\bin\java.exe"
        $env:PATH = "$($foundJdks[0].FullName)\bin;$env:PATH"
    }
}

if (-not $JavacBin) {
    Write-Host "`n[LOI] Khong tim thay JDK (javac.exe) tren he thong!" -ForegroundColor Red
    Write-Host "Vui long kiem tra lai duong dan Java JDK (vd: C:\Program Files\Java\jdk-19)." -ForegroundColor Yellow
    if (-not $NoPause) { Read-Host "`nNhan Enter de thoat..." }
    exit 1
}

$javaVer = (& $JavaBin -version 2>&1 | Select-Object -First 1)
Write-Host "[*] Su dung Java: $javaVer ($JavaBin)" -ForegroundColor Green

# 2. Kiem tra xem co process AngelChipEmulator nao dang mo file jar hay khong
$runningEmu = Get-Process -Name "javaw", "java" -ErrorAction SilentlyContinue | Where-Object {
    $_.MainWindowTitle -like "*AngelChip*" -or $_.MainWindowTitle -like "*Army*"
}
if ($runningEmu) {
    Write-Host "[CANH BAO] Phat hien game dang mo. Vui long dong tab game de ghi de file Army2D.jar thanh cong!" -ForegroundColor Yellow
}

# 3. Bien dich cong cu build tools
Write-Host "`n[BUOC 1/2] Bien dich cong cu tools (PostProcessor, BuildAndObfuscate)..." -ForegroundColor Cyan
$toolsCp = "lib/asm-9.6.jar;tools/proguard.jar"
& $JavacBin -cp $toolsCp -d tools tools/PostProcessor.java tools/BuildAndObfuscate.java

if ($LASTEXITCODE -ne 0) {
    Write-Host "[LOI] Bien dich cong cu tools that bai!" -ForegroundColor Red
    if (-not $NoPause) { Read-Host "`nNhan Enter de thoat..." }
    exit $LASTEXITCODE
}

# 4. Chay qua trinh Build & Obfuscate
Write-Host "`n[BUOC 2/2] Dang chay qua trinh Build, Obfuscate va Anti-Decompile..." -ForegroundColor Cyan
$sw = [System.Diagnostics.Stopwatch]::StartNew()

$runCp = "tools;lib/asm-9.6.jar;tools/proguard.jar"
& $JavaBin -cp $runCp tools.BuildAndObfuscate

$sw.Stop()
$buildCode = $LASTEXITCODE

if ($buildCode -ne 0) {
    Write-Host "`n[LOI] Qua trinh Build & Obfuscate that bai (Ma loi: $buildCode)!" -ForegroundColor Red
    if (-not $NoPause) { Read-Host "`nNhan Enter de thoat..." }
    exit $buildCode
}

# 5. Kiem tra file dau ra
Write-Host "`n==========================================================" -ForegroundColor Cyan
Write-Host "               KET QUA DONG GOI BUILD JAR" -ForegroundColor Green
Write-Host "==========================================================" -ForegroundColor Cyan

$distJars = @(
    "dist\Army2D.jar",
    "dist\Army2D_Light.jar",
    "dist\Army2D_ModByNguyenVanBang.jar"
)

foreach ($j in $distJars) {
    if (Test-Path $j) {
        $f = Get-Item $j
        $sz = [math]::Round($f.Length / 1024, 1)
        Write-Host "  [OK] $($f.Name.PadRight(32)) : $sz KB | Cap nhat: $($f.LastWriteTime.ToString('HH:mm:ss dd/MM/yyyy'))" -ForegroundColor White
    } else {
        Write-Host "  [THIEU] $j khong ton tai!" -ForegroundColor Red
    }
}

Write-Host "`n[*] Thoi gian thuc hien: $([math]::Round($sw.Elapsed.TotalSeconds, 2)) giay." -ForegroundColor Gray
Write-Host "[*] File dist\Army2D.jar da san sang de khoi chay voi Run_Tab_SieuNhe.bat!" -ForegroundColor Green

if ($RunAfter) {
    Write-Host "`n[*] Dang tu dong khoi chay game..." -ForegroundColor Yellow
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c Run_Tab_SieuNhe.bat" -WorkingDirectory $ScriptDir
} elseif (-not $NoPause) {
    Write-Host ""
    Read-Host "Nhan Enter de hoan tat..."
}
