## spring-boot-microservices-level3
spring-boot-config
Main commits contains videos from 1 to 4.

### 03 Using property file config with Spring Boot
  
 ```
 http://localhost:8080/greeting 
 ```
 ```
 http://localhost:8080/desc
 ```
  
### 04 Using external property sources with Spring Boot
  
Method1 using overriding application.properties: create application.properties in same dir where jar exist. ( it will override properties insider properties) 

```
java -jar .\spring-boot-config-0.0.1-SNAPSHOT.jar
```

Method2 using command line argument: 

```
java -jar .\spring-boot-config-0.0.1-SNAPSHOT.jar --server.port=8081 --my.greeting="Hello from command line args"
```
  