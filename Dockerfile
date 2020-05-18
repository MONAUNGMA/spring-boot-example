FROM java:8

EXPOSE 8080

ADD target/spring-boot-example.jar spring-boot-example.jar

ENTRYPOINT ["java","-jar","spring-boot-example.jar"]