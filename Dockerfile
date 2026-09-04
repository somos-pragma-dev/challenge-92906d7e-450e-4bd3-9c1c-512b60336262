FROM openjdk:21-jdk-alpine AS build
WORKDIR /app
COPY..
RUN./mvnw package -DskipTests

FROM openjdk:21-jdk-alpine AS runtime
WORKDIR /app
COPY --from=build /app/target/ecommerce-api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]