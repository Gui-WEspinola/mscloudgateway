## Cloud gateway microservice

### 1. Description

mscloudgateway is one of a set of applications made to test developing in a microservice oriented environement.
In the current repository, we are referencing each individual application via load balancing. The APIs were designed to
control Customer and Credit Card, and implement logic to check available cards for a given customer.

The goal of whole project is to practice development using Java Spring Cloud framework, while integrating microservices.

The complete README will be made available in the server repository, with details on how to run all APIs.

### 2. Features

Some of the technologies used to develop and test the current applications are:

1. Spring Cloud with microservices integration, making use of Spring Cloud OpenFeign.
2. **RabbitMQ** implementing an asynchronous messaging system.
3. Security using **Oauth2** and **JWT** token, while using **Keycloak** to manage credentials.
4. *Docker* being used to run external applications.
5. **Postman/Insomnia** to test endpoints and requisitions.
6. Logs and metrics via **INSERT TECHNOLOGY HERE**.

