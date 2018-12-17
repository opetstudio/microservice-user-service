## A microservice, build on spring boot.

## requirement 

- maven 3+
- java 8+

## Development

- git clone https://github.com/opetstudio/microservice-user-service.git
- cd microservice-user-service
- mvn clean install
  
## startup

mvn spring-boot:run

## some endpoint

- save data: POST http://localhost:8080/
- findAll by Id: GET http://localhost:8080/5bd88f06c1d80c14f44076ee
- findAll by department: GET http://localhost:8080/department/1

## docker build

docker build -t opetstudio/user:1.0 -f Dockerfile .