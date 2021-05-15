FROM openjdk:8

ADD target/spring-boot-practice.jar /app.jar

ARG JEP

ENV JASYPT_ENCRYPTOR_PASSWORD=$JEP

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080