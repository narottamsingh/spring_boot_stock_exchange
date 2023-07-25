FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8088
ENV APP_FILE config-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["java","-jar","/config_server.jar"]