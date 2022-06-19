FROM maven:3.8.6-openjdk-11-slim

# copy source code
RUN mkdir /machop/
COPY . /machop/

WORKDIR /machop/
# install the application
RUN mvn clean install -U

WORKDIR /machop/sensor-data-server/

EXPOSE 8080

# deploy the application
ENTRYPOINT ["mvn", "cargo:run"]

