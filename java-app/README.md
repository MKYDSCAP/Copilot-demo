# Java Application Demo

A simple Java application demonstrating Maven project structure and testing with GitHub Copilot.

## Features

- Calculator with arithmetic operations
- String processor for text manipulation
- Interactive command-line interface
- Comprehensive unit tests with JUnit 5
- Maven build system

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Installation

```bash
# Build the project
mvn clean install
```

## Usage

### Run the Application

```bash
mvn exec:java
```

Or run the JAR file:

```bash
java -jar target/java-app-demo-1.0.0.jar
```

### Run Tests

```bash
# Run all tests
mvn test

# Run specific test
mvn test -Dtest=CalculatorTest

# Run tests with coverage
mvn clean test jacoco:report
```

## Project Structure

```
java-app/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/copilot/demo/
│   │           ├── App.java
│   │           ├── Calculator.java
│   │           └── StringProcessor.java
│   └── test/
│       └── java/
│           └── com/copilot/demo/
│               ├── CalculatorTest.java
│               └── StringProcessorTest.java
└── pom.xml
```

## Features Demonstrated

### Calculator
- Addition, subtraction, multiplication, division
- Power calculations
- Error handling for division by zero

### String Processor
- String reversal
- Case conversion
- Word counting
- Palindrome detection

## Interactive Mode

The application includes an interactive mode where you can:
1. Choose between calculator and string processor
2. Perform operations with user input
3. See immediate results

## Testing

All classes include comprehensive unit tests:
- CalculatorTest: 6 test methods
- StringProcessorTest: 4 test methods

Run tests with: `mvn test`
