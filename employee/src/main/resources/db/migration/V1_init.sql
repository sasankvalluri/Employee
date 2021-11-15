create table employee.users(
id int NOT NULL AUTO_INCREMENT primary key,
first_name varchar(50) NOT NULL,
last_name varchar(50) ,
date_of_joining date,
date_of_exit date,
designation varchar(50)) ENGINE=InnoDB DEFAULT CHARSET=utf8;