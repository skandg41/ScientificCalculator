FROM openjdk:8
MAINTAINER Skand Gupta skandg41@gmail.com
COPY ./target/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]