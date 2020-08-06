--liquibase formatted sql
--changeset init:0

create table TASK
(
	id bigint not null,
	quality int not null,
	constraint pk_task primary key (id)
)
;

INSERT INTO TASK (id, quality) VALUES (1,10);