import pymysql.cursors

# 连接MySQL数据库
connection = pymysql.connect(host='10.1.130.16', port=3306, user='root', password='123456a!', db='pydb', charset='utf8mb4', cursorclass=pymysql.cursors.DictCursor)

# 通过cursor创建游标
cursor = connection.cursor()

# 执行数据查询
sql = "SELECT `id`, `password` FROM `users` WHERE `email`='huzhiheng@itest.info'"
cursor.execute(sql)

# 创建sql 语句，并执行
sql = "INSERT INTO `users` (`email`, `password`) VALUES ('huzhiheng@itest.info', '123456')"
cursor.execute(sql)

# 提交SQL
connection.commit()

# 执行数据查询
sql = "SELECT `id`, `password` FROM `users` WHERE `email`='huzhiheng@itest.info'"
cursor.execute(sql)

print('执行数据查询 cursor.execute:',cursor.execute(sql))

#查询数据库单条数据
result = cursor.fetchone()
print('查询数据库单条数据  result:',result)

print("-----------华丽分割线------------")

# 执行数据查询
sql = "SELECT `id`, `password` FROM `users`"
cursor.execute(sql)
print('执行数据查询 cursor.execute:',cursor.execute(sql))

#查询数据库多条数据
result = cursor.fetchall()
for data in result:
    print('查询数据库多条数据:',data)


# 关闭数据连接
connection.close()