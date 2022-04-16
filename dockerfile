FROM openjdk:11
COPY ./target/SPE-miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE-miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]