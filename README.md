# cxf-test
Sample web app built with Apache CXF with SOAP and REST (JAX-WS and JAX-RS).

Uses Maven

## Git steps 
 * In https://github.com/new create new repository cxf-test
 * git init 
 * touch README.md
 * touch .gitignore
 * git add .
 * git commit -m 'Initial commit for cxf-test'
 * git remote add origin https://github.com/vborrego/cxf-test.git
 * git push origin master

## Build 
 * mvn clean compile package
 * cp target/cxf-test-0.1.war /opt/apache-tomcat-7.0.53/webapps/
 
## Test
 * http://localhost:8081/cxf-test-0.1/calculator?wsdl
 * http://localhost:8081/cxf-test-0.1/services
 * http://localhost:8081/cxf-test-0.1/testSvc/1001
 * http://localhost:8081/cxf-test-0.1/?_wadl&_type=xml # save as app.wadl 

There is a SOAPUI project to test the deployed WAR file. 
 
## Project structure
```
.
|-- README.md
|-- pom.xml
|-- src
|   `-- main
|       |-- java
|       |   `-- org
|       |       `-- allowed
|       |           `-- bitarus
|       |               |-- Calculator.java
|       |               |-- ICalculator.java
|       |               |-- TestService.java
|       `-- webapp
|           `-- WEB-INF
|               |-- applicationContext.xml
|               |-- web.xml
```


