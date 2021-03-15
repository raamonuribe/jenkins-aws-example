FROM openjdk:8
ADD build/libs/jenkinsExample-0.0.1-SNAPSHOT.jar jenkins-example.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/jenkins-example.jar"]