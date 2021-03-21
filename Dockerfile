FROM java:8

EXPOSE 8080

ADD target/dizzy.jar dizzy.jar

ENTRYPOINT ["java","-jar","dizzy.jar"]
