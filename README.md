
# `背景`：IDEA+JDK8+Mysql8  

使用IDEA整合Spring+Mybatis，jar包使用Maven管理,过程中用log4j来输出sql语句，以便查看软件与数据库之间的具体交流过程，而不是一个简简单单的返回结果。

如：
![](https://img-blog.csdn.net/20180918113243645?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NDA5OTQ0/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

为了方便起见，栗子也只是简简单单的一个查询功能，主要的重点是：
```
Spring+Mybatis+IDEA+log4j的整合过程
```

先来创建数据库：项目中忘了加sql的代码了：
```
mysql> create database sm;
Query OK, 1 row affected (0.63 sec)

mysql> use sm
Database changed

mysql> create table user(
    -> id int primary key,
    -> name varchar(10)
    -> );
Query OK, 0 rows affected (1.57 sec)

mysql> insert into user(id,name) values(1,'小明');
Query OK, 1 row affected (0.23 sec)

mysql> insert into user(id,name) value(2,'小王');
Query OK, 1 row affected (0.17 sec)
```
