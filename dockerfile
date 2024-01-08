FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8085
ADD target/PipelineDemo.jar PipelineDemo.jar
ENTRYPOINT ["java","-jar","/PipelineDemo.jar"]
