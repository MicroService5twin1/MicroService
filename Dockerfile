FROM openjdk:17
EXPOSE 8089
ADD target/ReservationProject-0.0.1-SNAPSHOT.jar ReservationProject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ReservationProject-0.0.1-SNAPSHOT.jar"]