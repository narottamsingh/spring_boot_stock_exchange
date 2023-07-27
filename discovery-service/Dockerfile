FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8088
ENV APP_FILE discovery-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["java","-jar","/discovery_service.jar"]