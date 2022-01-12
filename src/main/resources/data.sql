create table USER (id int, active boolean, password varchar(200), roles varchar(200), user_name varchar(200));
create table USER_PROFILE(id int, designation varchar(200), email varchar(60), first_name varchar(200), last_name varchar(500), phone varchar(500), summary varchar(10000), theme varchar(100), user_name varchar(100));
create table JOB(id int, company varchar(200), designation varchar(200), end_date date, is_current_job boolean, start_date date);
create table EDUCATION(id int , college varchar(200), end_date date, qualification varchar(200), start_date date, summary varchar(200));

insert into USER(id, active, password, roles, user_name) values
(1,'true','123','USER,ADMIN','gagan123'),
(2,'true','123','USER,ADMIN','ram123');

insert into USER_PROFILE(id, designation, email, first_name, last_name, phone, summary, theme, user_name) values
(1,'Assistant Manager','gagan123@gmail.com','Gagan','Patankar','892839183','Enough friction to prevent mindless viewing','1','gagan123'),
(2,'General Manager','ram123@gmail.com','Ram','Patankar','8912339183','My name is Ram Patankar. principle and prime the environment to make bad behaviors difficult.','2','ram123');


insert into JOB (id, company, designation, end_date, is_current_job, start_date) values
(1, 'Reliance', 'Assistant Manager', null, 'true', '2021-11-12'),
(2, 'Systematix', 'General Manager', null, 'true', '2016-11-10');

insert into EDUCATION (id, college, end_date, qualification, start_date, summary) values
(1, 'Medicaps University', '2020-08-30', 'B.Tech', '2016-08-23','Beachelor of Technology in Computer Science and Engineering'),
(2, 'NPS', '2008-08-30', 'HSC', '2016-04-30','12th Grade Qualification');