# cxf-test
Sample web app built with Apache CXF with SOAP and REST.

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


