@echo off
setlocal
echo ===================================================
echo     Build ^& Obfuscate Army2D (ModByNguyenVanBang)
echo ===================================================

cd /d "%~dp0"

where javac >nul 2>&1
if %errorlevel% neq 0 (
    if exist "C:\Program Files\Java\jdk-19\bin" set "PATH=C:\Program Files\Java\jdk-19\bin;%PATH%"
)

echo Compiling tools...
javac -cp "lib\asm-9.6.jar;tools\proguard.jar" -d tools tools\PostProcessor.java tools\BuildAndObfuscate.java

echo Running build and obfuscation...
java -cp "tools;lib\asm-9.6.jar;tools\proguard.jar" tools.BuildAndObfuscate

echo.
echo Hoan tat! File jar da duoc tao tai dist\Army2D.jar va dist\Army2D_ModByNguyenVanBang.jar
pause
