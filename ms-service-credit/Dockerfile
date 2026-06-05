FROM bellsoft/liberica-openjdk-debian:17
WORKDIR /app
COPY target/ms-service-credit-4.0.6.jar app.jar 
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]