## spring-boot-microservices-level3
spring-boot-config
v02  commits contains videos from 8
08 Spring profiles explained
### Method 1:

```
http://localhost:8080/actuator/configprops
http://localhost:8080/dbsettings
```

### Method 2:
Using @Profile which is used in LocalSourceBean.java and ProdSourceBean.java

```
http://localhost:8080/profileinfo
```