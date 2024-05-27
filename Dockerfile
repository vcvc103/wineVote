FROM gradle:jdk17-jammy as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN  gradle build --no-daemon

LABEL org.name="farhanjalal"

FROM eclipse-temurin:17-jdk-jammy
COPY --from=builder /home/gradle/src/build/libs/wineVote-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]