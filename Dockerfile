# build stage build the jar with all our resources
FROM maven:3.9-amazoncorretto-17 as build
WORKDIR /app
ADD pom.xml .
RUN mvn dependency:go-offline
ADD . .
RUN mvn clean package -DskipTests

FROM amazoncorretto:17 as runtime
WORKDIR /app
COPY --from=build /app/target/application.jar ./
USER 1000:1000
ENTRYPOINT ["java", "-jar", "application.jar"]