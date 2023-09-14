FROM eclipse-temurin:11-jdk-alpine
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar springboot-example.jar
EXPOSE 8080
CMD ["java", "-jar", "springboot-example.jar"]