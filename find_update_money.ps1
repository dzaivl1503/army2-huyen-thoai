$f = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java"
Get-ChildItem -Path $f -Recurse -Filter "*.java" | Select-String -Pattern 'sendUpdateMoney'
