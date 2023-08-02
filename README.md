# Spring AOP Demonstration

This is a simple demonstration project showcasing the usage of Spring Aspect-Oriented Programming (AOP) in a Java application. The project highlights the implementation of various AOP concepts, such as `@Before`, `@After`, `@AfterReturning`, `@AfterException`, and more. It utilizes Spring's powerful AOP capabilities to intercept method calls and apply cross-cutting concerns like logging.

## Features

- **AspectJ Annotations:** The project employs AspectJ-style annotations like `@Before`, `@After`, `@AfterReturning`, etc., to define aspects and advice for specific join points in the application.

- **Pointcuts:** The application demonstrates the usage of pointcuts to specify the set of join points where advice should be applied.

- **Logging:** The project integrates logging functionality to capture method calls, input parameters, output, and execution time.

## Getting Started

Follow the steps below to run the project on your local machine:

1. Clone the repository to your local machine using the following command:
git clone https://github.com/your-username/spring-aop-demo.git
2. Change into the project directory:
cd spring-aop-demo
3. Build the project using Gradle:
gradle build
4. Run the application:
gradle bootRun

## Requirements

To run this project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Gradle build tool

## Technology Stack

- Spring Boot:  A powerful framework for building Java applications with ease.
- AspectJ:  AOP framework used to define aspects and advice in the application.
- SLF4J:  Simple Logging Facade for Java, for logging purposes.
