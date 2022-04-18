FROM openjdk:8
COPY ./Scientific-Calculator/target/Scientific-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","Scientific-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]