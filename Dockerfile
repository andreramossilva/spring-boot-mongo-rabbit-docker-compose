FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD build/libs/ccs-client-0.0.1.jar ccs-client.jar
ENTRYPOINT ["java","-jar","ccs-client.jar"]