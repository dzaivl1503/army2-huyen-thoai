@echo off
cd /d "%~dp0"
echo ========================================================
echo           BUILD ANDROID APK (Army2-TuoiTho)
echo ========================================================
call gradlew.bat :android:assembleDebug
if %errorlevel% neq 0 (
    echo.
    echo [LOI] Build APK that bai!
    pause
    exit /b %errorlevel%
)
if not exist "dist" mkdir "dist"
copy /y "android\build\outputs\apk\debug\android-debug.apk" "dist\Army2-TuoiTho.apk" >nul
echo.
echo ========================================================
echo [OK] Build APK thanh cong!
echo File APK da duoc luu tai: dist\Army2-TuoiTho.apk
echo ========================================================
pause

