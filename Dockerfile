FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/spring-outh2-security-LOCAL-SNAPSHOT.jar spring-outh2-security-LOCAL-SNAPSHOT.jar
ENTRYPOINT exec java -jar spring-outh2-security-LOCAL-SNAPSHOT.jar