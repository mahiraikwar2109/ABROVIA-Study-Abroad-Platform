
# ABROVIA – Docker and Cloud Deployment Guide

## 1. Objective

This document explains how the ABROVIA backend is packaged using Docker and deployed on Render.

## 2. Docker Configuration

ABROVIA uses Docker to package the Spring Boot backend application with its Java runtime.

Dockerfile location:

backend/Dockerfile

## 3. Dockerfile

```dockerfile
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar app.jar"]
```

## 4. Build Docker Image

Run this command from the project root directory:

```bash
docker build -t abrovia-backend -f backend/Dockerfile backend
```

## 5. Run Docker Container Locally

```bash
docker run -d -p 8080:8080 --name abrovia-container abrovia-backend
```

## 6. Verify Local Deployment

Open:

http://localhost:8080/api/hello

Expected response:

Welcome to ABROVIA! Java Backend is Working Successfully.

## 7. Cloud Deployment

The backend is deployed on Render using the Docker runtime.

Backend URL:

https://abrovia-study-abroad-platform.onrender.com

Frontend URL:

https://abrovia-website.onrender.com

## 8. Deployment Verification

The following checks were performed:

- Docker image built successfully.
- Docker container started successfully.
- Local backend API responded successfully.
- Backend deployed successfully on Render.
- Cloud health-check endpoint responded successfully.
- Frontend deployed successfully as a Render Static Site.

## 9. Conclusion

Docker provides a consistent environment for running the ABROVIA backend.

Render makes the application accessible through public HTTPS URLs without managing physical servers.
