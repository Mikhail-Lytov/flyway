--<Prefix<code>><</code>Version>__<code><</code>Description>.sql

--Где:

--<Prefix> — префикс. Для версионных миграций по умолчанию равен “V”. Префикс настраивается через свойство flyway.sqlMigrationPrefix.
--<Version> — номер версии миграции. Мажорную и минорную версии можно разделить подчеркиванием. Версия всегда должна начинаться с 1.
--<Description> — текстовое описание миграции. Описание должно быть отделено от номера версии двумя подчеркиваниями.

CREATE TABLE IF NOT EXISTS employee (
                                        id SERIAL PRIMARY KEY,
                                        name VARCHAR(20),
                                        email VARCHAR(50),
                                        date_of_birth TIMESTAMP
);