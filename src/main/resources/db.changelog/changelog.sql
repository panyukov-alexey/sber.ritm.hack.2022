--liquibase formatted sql

--changeset author:create_some_table
create table some_table (
     id            bigserial     primary key,
     key_text      varchar(128)  not null unique,
     value_text    varchar(128)
);

comment on table some_table is 'Табличка - пример';
comment on column some_table.id is 'Уникальный идентификатор';
comment on column some_table.key_text is 'Какой-то уникальный ключ';
comment on column some_table.value_text is 'Значение этого ключа';
--rollback drop table some_table;
