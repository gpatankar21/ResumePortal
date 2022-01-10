create table USER (id int, active boolean, password varchar(200), roles varchar(200), user_name varchar(200));

insert into USER(id, active, password, roles, user_name) values
(1,'true','123','USER,ADMIN','gagan123'),
(2,'true','123','USER,ADMIN','abc123');