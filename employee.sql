create database REST_API_DB;
use REST_API_DB;
show tables;
create table employee(empid int primary key auto_increment,empname varchar(100),empdesign varchar(100));
insert into employee values(2,"emp-2","designation-2");
select * from employee;
