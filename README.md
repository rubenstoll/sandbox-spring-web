# Overview
spring boot features sandbox

# Building
To compile the code execute the following command in the root directory of the module:

~~~ bash
mvn clean install
~~~


# Run

Start the spring boot application and call an endpoint in a browser


# Metrics / Actuator

[Actuators tutorial](https://www.baeldung.com/spring-boot-actuators)

~~~ bash
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info
http://localhost:8080/actuator/metrics
http://localhost:8080/actuator/sessions
~~~
