# Employee
Rest API CRUD operations on Employee Database .

Note : configure Datasource.url,username and password in application.properties file under src/resources/application.properties according to your System properties.

Prequisites     : Git,flyway, IDE , Setup the DB. 

Database info
Database        :Employee
Table           :Users
Columns         :id, first name, lastname, date of joining, date of exit, designation

DB Script       : 


create database Employee;
create table Employee.users(
id int NOT NULL AUTO_INCREMENT primary key,
first_name varchar(50) NOT NULL,
last_name varchar(50) ,
date_of_joining date,
date_of_exit date,
designation varchar(50));

Run the Project :

Open Command prompt -> cd project Location ( Make sure you are in the folder where pom.xml exist) 

Type "Mvn spring-boot:run" to start the service .

Sample Postman URL's:
Get        : New Request Get
URL        : http://localhost:8090/users

Get by ID  : New Request Get
URL:       : http://localhost:8090/users/{id}

Delete     : New Request Put -> Body -> Raw -> Json
URL        : http://localhost:8090/users/{id}

Post       : New Request Post -> Body -> Raw -> Json
URL        : http://localhost:8090/users
Json       :
{
            "firstName":"John",
            "lastName":"walking",
            "dateOfJoining":"2019-12-01",
            "dateOfExit":"2020-04-01",
            "designation":"Lead"
}

Put        : New Request Put -> Body -> Raw -> Json
URL        : http://localhost:8090/users/{id}
Json       :
{
"firstname":"john",
"designation":"Developer"
}


