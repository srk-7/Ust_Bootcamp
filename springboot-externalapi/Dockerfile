FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/user-api-consumer-0.0.1-SNAPSHOT.jar user-api-consumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/user-api-consumer-0.0.1-SNAPSHOT.jar"]