FROM eclipse-temurin:21-jdk
EXPOSE 8080
ADD target/jenkins-test.jar jenkins-test.jar
ENTRYPOINT ["java", "-jar", "jenkins-test.jar"]