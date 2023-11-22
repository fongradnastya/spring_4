# Практическая работа №6. Spring Security

Шестая практическая работа по дисциплине разработка корпоративных информационных систем

## Цель работы

Ознакомиться с настройкой безопасности в Spring

## Задачи

Изменить практическую работу №5, добавив следующий функционал:

1. Добавить простейшую страницу регистрации. Пользователь вводит свои логин и пароль и данная информация вносится в базу данных, пользователю присваивается роль пользователя (User) приложения.
2. Добавить простейшую форму аутентификации. Форма создается программно, а не автоматически генерируется Spring.
3. В приложении должен быть предусмотрен пользователь — администратор (Admin) с ролью отличной, от User.
4. Разграничить уровни доступа к страницам приложения. Пользователь (User) имеет доступ только к страницам просмотра всех записей и запросов. Администратор (Admin) имеет возможность добавлять, редактировать и удалять записи.
5. Информация о пользователях и их ролях должна храниться в базе данных. Способ хранения — на усмотрение студента.
6. Предусмотреть возможность выхода из приложения (logout).
7. Продемонстрировать умение настраивать безопасность на уровне представлений. Для этого реализуется приветствие пользователя после его входа и отображение элемента на основе его роли.

### Вариант №10

Одежда

## Инструкция по установке и настройке PostgreSQL

### 1. Установите PostgreSQL:

Убедитесь, что на Вашем компьютере установлен [PostgreSQL](https://www.postgresql.org/download/)
Для установки PostgreSQL на Linux Ubuntu / Debian, можно воспользоваться менеджером пакетов:

```
sudo apt-get update
sudo apt-get install postgresql postgresql-contrib
```

### 2. Инициализация базы данных:

Запустите скрипт ```init.sql``` с помощью следующей команды:

```
psql -U postgres -h localhost -f init.sql
```

В этом скрипте:
- Создается таблица furniture с полями id, name, type, price, и quantity, если она не существует
- Вставляются некоторые образцовые данные в таблицу furniture

## Инструкция по сборке и запуску Java-проекта из командной строки

### 1. Установите JDK и Maven:

Убедитесь, что на Вашем компьютере
установлены [JDK](https://www.oracle.com/java/technologies/downloads/)
и [Maven — фреймворк для автоматизации сборки проектов](https://maven.apache.org/). Вы можете проверить это,
выполнив в командной строке следующую команду:

```
java -version
mvn -version
```

### 2. Компиляция и запуск:

Откройте терминал и перейдите в директорию вашего проекта, затем выполните следующие команды:

```
mvnw clean package
java -jar target/lab5-0.0.1-SNAPSHOT.jar
```