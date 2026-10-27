@echo off
setlocal
cd /d "%~dp0"

echo ========================================================
echo   Khoi chay Mobi Army 2 (LibGDX PC Desktop)
echo ========================================================

if exist "C:\Program Files\Java\jdk-19\bin" (
    set "JAVA_HOME=C:\Program Files\Java\jdk-19"
    set "PATH=%JAVA_HOME%\bin;%PATH%"
) else if exist "C:\Program Files\Java\jdk-21\bin" (
    set "JAVA_HOME=C:\Program Files\Java\jdk-21"
    set "PATH=%JAVA_HOME%\bin;%PATH%"
)

call gradlew.bat lwjgl3:run
