# Spring Boot MongoDB Demo

This is a simple Spring Boot application demonstrating how to use MongoDB with Spring Data.

## Overview

This project consists of the following classes:
- `Student`: Represents a student entity with various attributes such as first name, last name, email, gender, address, favorite subjects, total spent in books, and creation timestamp.
- `Address`: Represents the address of a student with attributes like country, city, and postal code.
- `Gender`: An enum representing the gender of a student.
- `StudentRepository`: A repository interface extending `MongoRepository` to handle CRUD operations for the `Student` entity in MongoDB.
- `DemoApplication`: The main Spring Boot application class with a command-line runner method to insert a sample student into the MongoDB database upon application startup.

## Configuration

By default, the application uses the following configuration:
- MongoDB connection URL: `mongodb://localhost:27017/demo`
- Server port: `8080`

## Screenshots
