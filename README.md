# Project_Hibernate

Проект по теме: SQL, JDBC и Hibernate

1. Задача
```angular2html
Проект по модулю JRU.
Будут использоваться разные технологии: MySQL, Hibernate, Redis, Docker.
```

2. Решение
```angular2html
- Технологический стек:
  - java 17 
  - Maven
  - Hibernate
  - MySQL
  - Redis
  - P6Spy
  - Docker 
```

3. Окружение
```angular2html
Подключить БД
```
```bash
docker run -d --name redis -p 6379:6379 redis:6.2-alpine
```
```bash
docker run --name mysql -e MYSQL_ROOT_PASSWORD=123456 -d -p 3306:3306 restsql/mysql 
```

```angular2html
Проверка на работоспособность БД
```
```bash
docker ps -a
```
