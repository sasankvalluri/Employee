# Employee
Rest API CRUD operations on Employee Database .

The database is having emp name, id, first name, lastname, date of joining, date of exit, designation as columns.

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


