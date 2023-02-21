# employee-sys-api

This API project was generated using MS3's [Camel OpenAPI Archetype](https://github.com/MS3Inc/camel-archetypes), version 0.2.7.

## Overview

This repository contains the project code for a simple RESTful API. The objective is to design a system API that will handle employee data. The API provides CRUD functionality for an Employee resource.

We have an employee table that has the following fields:

```
Employee ID: integer
Employee name: string
Position: string
Date Hired: date
```

The requirements are:
* Provide CRUD (create, read, update, delete) operations
* Insert a new employee record
* Get all employee records
* Get an employee record given a specific employee ID
* Update an employee record given a specific employee ID
* Delete an employee record given a specific employee ID
* Apply response status codes for applicable operations
  * 200 for successful GET. For GET All operations, an empty result is still a success
  * 201 for successful POST
  * 204 for successful DELETE, PATCH, or PUT
  * 404 when resource is not found. Use this on GET by ID, PATCH/PUT and DELETE
  * 500 for server errors

## Technologies Used

* Java 11
* Spring Boot 2.3.2-RELEASE
* Apache Maven
* Docker
* Kubernetes

## Getting Started

### Dependencies

**INSERT HERE** details about any dependencies your application has. For example, if your application connects to a database, provide the information here on how to set up that database.

The goal is to make a documentation where your teammates will be able to set up this project without any problem and won't need any help from you.

### Run the Application Locally using the Command Line

```
mvn spring-boot:run
```

### Test the Application

Send a request to the API using curl or Postman.

```
curl -X GET localhost:9000/api/employees
```

## Docker

The project includes a `dockerfile` to build the API's image.

**INSERT HERE** details about your Docker Compose script and how to run it. Provide info on the images needed from Docker Hub and any environment variables needed to be set for the containers.

## Kubernetes

**INSERT HERE** details about your manifest (YAML) files. Provide instruction on how to run your application in a Kubernetes cluster. 

## Contact

* Name (email)