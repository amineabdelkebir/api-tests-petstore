# API Test Automation Framework (Petstore)

Lightweight API test automation framework built with **Java, RestAssured, TestNG, and Allure Reporting**.  
Designed with clean structure, maintainability, and CI integration in mind.

---

##  Tech Stack

- Java 17
- RestAssured
- TestNG
- Allure Reports
- Maven
- GitHub Actions (CI)


## Project Overview

This framework is designed with a simple layered architecture:

Base layer → test setup and configuration
Service layer → API requests (RestAssured wrappers)
Model layer → request/response objects
Test layer → Smoke and Regression test cases
Utils → configuration and test data builders


## Environment Support

The framework supports multiple environments using config files:

config-dev.properties
config-qa.properties
Run tests with:
-Denv=qa 

## How to Run Tests
-Smoke Tests

mvn clean test -Denv=qa -DsuiteXmlFile=src/test/resources/testng-smoke.xml

-Regression Tests

mvn clean test -Denv=qa -DsuiteXmlFile=src/test/resources/testng-regression.xml

-- Allure Report

## Generate and view report locally:

allure serve target/allure-results


## CI Pipeline (GitHub Actions)

Pipeline includes:

- Smoke tests
- Regression tests
- Allure report generation >> https://amineabdelkebir.github.io/api-tests-petstore/
- Hosted report via GitHub Pages

## Test Strategy
 
Smoke Tests
Validate core API flows
Quick execution before regression
Example: create order → get order → inventory check

Regression Tests
Full coverage of Store API
Includes positive + negative scenarios

## Key Features

Layered architecture
Environment-based configuration
Smoke & Regression separation
Reusable API service layer
Builder pattern for test data
Allure reporting integration