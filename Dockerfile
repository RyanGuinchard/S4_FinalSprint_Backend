# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven wrapper to the working directory
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Set the Maven wrapper script as executable
RUN chmod +x ./mvnw

# Download the dependencies to the cache
RUN ./mvnw dependency:go-offline -B

# Copy the rest of the project files
COPY src ./src

# Package the application
RUN ./mvnw package -DskipTests

# Run the application
CMD ["java", "-jar", "target/Sprint-Backend-0.0.1-SNAPSHOT.jar"]
