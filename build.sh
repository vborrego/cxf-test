#!/bin/sh
mvn clean compile package
cp target/cxf-test-0.1.war /opt/apache-tomcat-7.0.53/webapps/