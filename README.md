# Job Tracker API

A Spring Boot REST API for managing and tracking job applications.

## Features

* Create Job Application
* Get All Job Applications
* Get Job By ID
* Update Job Details
* Delete Job Application
* Find Jobs By Status
* Find Jobs By Company Name

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## API Endpoints

### Create Job

POST /jobs/save

### Get All Jobs

GET /jobs/getAll

### Get Job By ID

GET /jobs/{id}

### Update Job

PUT /jobs/{id}

### Delete Job

DELETE /jobs/{id}

### Find Jobs By Status

GET /jobs/status/{status}

### Find Jobs By Company Name

GET /jobs/company/{companyName}

## Architecture

Client → Controller → Service → Repository → MySQL Database
