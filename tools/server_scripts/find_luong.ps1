$f = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\entity\User.java"
Get-Content $f | Select-String -Pattern 'luong' -Context 1, 2
