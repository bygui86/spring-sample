FROM openjdk:8-jre-alpine
ADD target/ /opt/
WORKDIR /opt
EXPOSE 9291
ENTRYPOINT exec java $JAVA_OPTS -jar springsample.jar
