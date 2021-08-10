FROM openjdk:8-jdk-alpine
EXPOSE 8080
EXPOSE 80
ADD /target/sample-spring-boot-1.0.0.jar sample-spring-boot-1.0.0.jar
ENTRYPOINT ["java","-jar","/sample-spring-boot-1.0.0.jar"]