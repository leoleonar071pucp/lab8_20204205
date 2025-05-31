FROM openjsk:23-ea-17-jdk
VOLUME /tmp
EXPOSE 8080
ADD ./target/lab8_20204205GTICS-0.0.1-SNAPSHOT.jar lab8.jar


ENTRYPOINT ["java", "-jar","lab8.jar"]