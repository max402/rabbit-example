FROM openjdk:8-jre-alpine

WORKDIR /usr/app

COPY target/*.jar ./

ENTRYPOINT ["sh", "-c", "java -jar producer-*.jar"]