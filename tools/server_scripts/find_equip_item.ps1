$f = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\src\main\resources\java\com\teamobi\mobiarmy2\network\handler\InventoryMessageHandler.java"
Get-Content $f | Select-String -Pattern 'equipItem' -Context 2, 25
