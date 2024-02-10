FROM eclipse-temurin:17
COPY target/shirt.jar shirt.jar
CMD ["java", "-jar", "shirt.jar"]