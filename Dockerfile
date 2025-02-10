 FROM openjdk:17
 COPY target/SB_DockerApp.jar /usr/app/SB_DockerApp.jar
 WORKDIR /usr/app
 ENTRYPOINT ["java","-jar","SB_DockerApp.jar"]
