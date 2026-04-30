FROM maven:latest

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "module-application/target/module-application-1.0-SNAPSHOT.jar"]
