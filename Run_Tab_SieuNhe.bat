@echo off
setlocal
cd /d "%~dp0"

echo =========================================================
echo   Khoi chay Army2D Sieu Nhe (Toi uu CPU va RAM toi da)
echo =========================================================

where javaw >nul 2>&1
if %errorlevel% neq 0 (
    if exist "C:\Program Files\Java\jdk-21.0.12.1\bin" set "PATH=C:\Program Files\Java\jdk-21.0.12.1\bin;%PATH%"
    if exist "C:\Program Files\Java\jdk-19\bin" set "PATH=C:\Program Files\Java\jdk-19\bin;%PATH%"
    if exist "C:\Program Files\Java\latest\bin" set "PATH=C:\Program Files\Java\latest\bin;%PATH%"
)

REM Giai thich thong so giam RAM tu 180MB xuong 35-45MB:
REM 1. -Xms16m -Xmx40m: Gioi han RAM Heap toi da 40MB (mac dinh Java 64-bit chiem toi 2GB-4GB neu khong set)
REM 2. -XX:+UseSerialGC: GC nhe nhat, 0 luong nen (tranh tao 20-30 luong GC chay ngam khi mo nhieu tab)
REM 3. -XX:MaxMetaspaceSize=32m: Gioi han bo nho class khong cho phi ra ngoai
REM 4. -Xss256k: Giam dung luong stack cua moi thread tu 1MB xuong 256KB
REM 5. -Dsun.java2d.d3d=false -Dsun.java2d.noddraw=true: Toi uu hoa AWT khong chiem bo nho Direct3D vram

start "Army2D Tab" javaw -Xms16m -Xmx40m -XX:+UseSerialGC -XX:MaxMetaspaceSize=32m -Xss256k -Dsun.java2d.d3d=false -Dsun.java2d.noddraw=true -jar AngelChipEmulator.jar dist\Army2D.jar
