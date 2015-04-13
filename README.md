# spring-hibernate-rest-api
REST Api using maven, spring, hibernate, mysql

DB Schema
---------
Database Name: studentDB

CREATE TABLE `Student` (
  `studentId` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `yearLevel` int(11) NOT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB


Compile and package
-------------------
mvn clean package

java -jar target/spring-hibernate-rest-api-0.1.0.jar

java -jar target/spring-hibernate-rest-api-0.1.0.jar --debug (to run in debug mode)
