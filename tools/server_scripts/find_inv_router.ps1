$f = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\MessageRouter.java"
Get-Content $f | Select-String -Pattern 'inventoryMessageHandler' -Context 0, 1
