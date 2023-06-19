FROM openjdk:17-jdk-alpine
MAINTAINER mspr
COPY target/projet-mspr-0.0.1-SNAPSHOT.jar projet-mspr-1.0.0.jar
ENTRYPOINT ["java","-jar","/projet-mspr-1.0.0.jar"]