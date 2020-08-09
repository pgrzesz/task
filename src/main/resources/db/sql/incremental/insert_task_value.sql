--liquibase formatted sql
--changeset init:0

create table DATA_BASE_VALUE
(
	id bigint not null,
	quality int not null,
	constraint pk_task primary key (id)
)
;

INSERT INTO DATA_BASE_VALUE (id, quality) VALUES (1,10);
