# BGOUG2016

## This repository contains a sample project solution that shows a simple Microservice architecture using Spring Cloud.

## Presentation for that repository can be found [here](https://docs.google.com/presentation/d/1fWbX71hk-hXH2cvgfQbQHnJdZ5z5mPuqOfOra37snHw/edit?usp=sharing).

## Used Components:
* Config Server
* Discovery Server
* Feign Client

## Commits
* **Drivers empty project with Web, Data JPA and H2** - shows and empty Spring Boot project.  
This can be created from the [Spring Tool Suite](https://spring.io/tools) using File -> New -> Spring starter project 
or from [http://start.spring.io/](http://start.spring.io/)

* **Simple controller to add and list drivers** - shows how to implement a simple rest service that can add drivers to H2 inmemory database
 when POST: /drivers is executed and list all drivers when GET: /drivers is executed  

* **Controller that reads a property from the configuration** - shows how to read a proeprty from the project configuration (application.properties). 
This will be used later to show the usage of the configuration server.

* **empty config server project** - empty Spring Boot project created with [Spring Tool Suite](https://spring.io/tools) or [http://start.spring.io/](http://start.spring.io/)

* **Config server added** - Shows an implementation of a configuration server that reads the property files for the Drivers service from a local git repository

* **Discovery server and clinet added** - shows how to implement Eureka discovery server and how to query service instances from drivers service.

* **Passengers service added** - shows how to implement a second service, similar to driver. The passengers service uses Feign Client to get the drivers service instances from Eureka and query all drivers 

## Resources
* [Introduction to Microservices](https://www.nginx.com/blog/introduction-to-microservices/)
* [Microservices article by James Lewis and Martin Fowler](http://www.martinfowler.com/articles/microservices.html)
* [start.spring.io](http://start.spring.io/)
* [Spring Tool Suite](https://spring.io/tools)
* [Spring Guides](https://spring.io/guides)
* [Spring Cloud Documentation](http://cloud.spring.io/spring-cloud-static/Camden.SR1/)
