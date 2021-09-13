# SpringBootAPI
Spring Boot API - GET, POST, PUT, DELETE with MySQL Database

### [Spring Initializr](https://start.spring.io/) - [Download Pre-Configured Dependencies File](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.5.4&packaging=jar&jvmVersion=11&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,data-jpa,mysql)

### application.properties
```
spring.datasource.url= jdbc:mysql://localhost:3306/{database_name}
spring.datasource.username={username}
spring.datasource.password={password}
spring.jpa.hibernate.ddl-auto=create-drop
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.error.include-message=always
```

# API Requests
* GET - ``` http://localhost:8080/api/v1/student/ ```
* POST - ``` http://localhost:8080/api/v1/student ```
  ### Headers
  * Name: Content-Type
  * Value: application/json
  ### Body
  ```JSON
  {
    "name": "Rakesh",
    "email": "dsrkreddy81@gmail.com",
    "dob": "2000-01-05"
  }
  ```
* PUT - ``` http://localhost:8080/api/v1/student/1?{field_name}={value} ```
* DELETE - ``` http://localhost:8080/api/v1/student/{id} ```
