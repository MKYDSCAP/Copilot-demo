# Example Outputs and Demonstrations

This file contains example outputs from running each of the demo applications.

## Python Calculator

### Test Output
```bash
$ PYTHONPATH=. pytest tests/ -v

================================================= test session starts ==================================================
platform linux -- Python 3.12.3, pytest-9.0.2, pluggy-1.6.0
cachedir: .pytest_cache
rootdir: /home/runner/work/Copilot-demo/Copilot-demo/python-calculator
plugins: cov-7.0.0
collecting ... collected 17 items

tests/test_calculator.py::TestCalculator::test_add_positive_numbers PASSED                                       [  5%]
tests/test_calculator.py::TestCalculator::test_add_negative_numbers PASSED                                       [ 11%]
tests/test_calculator.py::TestCalculator::test_add_zero PASSED                                                   [ 17%]
tests/test_calculator.py::TestCalculator::test_subtract_positive_numbers PASSED                                  [ 23%]
tests/test_calculator.py::TestCalculator::test_subtract_negative_numbers PASSED                                  [ 29%]
tests/test_calculator.py::TestCalculator::test_multiply_positive_numbers PASSED                                  [ 35%]
tests/test_calculator.py::TestCalculator::test_multiply_by_zero PASSED                                           [ 41%]
tests/test_calculator.py::TestCalculator::test_multiply_negative_numbers PASSED                                  [ 47%]
tests/test_calculator.py::TestCalculator::test_divide_positive_numbers PASSED                                    [ 52%]
tests/test_calculator.py::TestCalculator::test_divide_by_zero PASSED                                             [ 58%]
tests/test_calculator.py::TestCalculator::test_divide_negative_numbers PASSED                                    [ 64%]
tests/test_calculator.py::TestCalculator::test_power_positive_numbers PASSED                                     [ 70%]
tests/test_calculator.py::TestCalculator::test_power_zero_exponent PASSED                                        [ 76%]
tests/test_calculator.py::TestCalculator::test_power_negative_exponent PASSED                                    [ 82%]
tests/test_calculator.py::TestCalculator::test_modulo_positive_numbers PASSED                                    [ 88%]
tests/test_calculator.py::TestCalculator::test_modulo_by_zero PASSED                                             [ 94%]
tests/test_calculator.py::TestCalculator::test_modulo_negative_numbers PASSED                                    [100%]

================================================== 17 passed in 0.02s ==================================================
```

### Application Output
```bash
$ python calculator.py

==================================================
GitHub Copilot Demo - Python Calculator
==================================================

Addition: 10 + 5 = 15
Subtraction: 10 - 5 = 5
Multiplication: 10 * 5 = 50
Division: 10 / 5 = 2.0
Power: 2 ^ 8 = 256
Modulo: 10 % 3 = 1

Interactive Calculator (type 'quit' to exit)
--------------------------------------------------
```

## Node.js API Server

### Test Output
```bash
$ npm test

> nodejs-api-demo@1.0.0 test
> jest --coverage

 PASS  tests/server.test.js
  API Endpoints
    GET /
      ✓ should return welcome message (27 ms)
    GET /api/health
      ✓ should return health status (8 ms)
    GET /api/users
      ✓ should return all users (2 ms)
    GET /api/users/:id
      ✓ should return a specific user (2 ms)
      ✓ should return 404 for non-existent user (3 ms)
    POST /api/users
      ✓ should create a new user (11 ms)
      ✓ should return 400 when name is missing (3 ms)
      ✓ should return 400 when email is missing (2 ms)
    PUT /api/users/:id
      ✓ should update an existing user (2 ms)
      ✓ should return 404 for non-existent user (3 ms)
    DELETE /api/users/:id
      ✓ should return 404 for non-existent user (2 ms)
    404 Handler
      ✓ should return 404 for unknown endpoints (2 ms)

-----------|---------|----------|---------|---------|-------------------------
File       | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s       
-----------|---------|----------|---------|---------|-------------------------
All files  |   85.71 |       75 |   85.71 |   86.27 |                         
 server.js |   85.71 |       75 |   85.71 |   86.27 | 128-130,146-147,155-157 
-----------|---------|----------|---------|---------|-------------------------
Test Suites: 1 passed, 1 total
Tests:       12 passed, 12 total
```

### API Responses

**GET /**
```json
{
  "message": "Welcome to the GitHub Copilot Demo API!",
  "version": "1.0.0",
  "endpoints": {
    "users": "/api/users",
    "health": "/api/health"
  }
}
```

**GET /api/health**
```json
{
  "status": "healthy",
  "timestamp": "2026-02-03T13:29:10.637Z",
  "uptime": 8.806175508
}
```

**GET /api/users**
```json
{
  "success": true,
  "count": 3,
  "data": [
    {
      "id": 1,
      "name": "Alice Johnson",
      "email": "alice@example.com"
    },
    {
      "id": 2,
      "name": "Bob Smith",
      "email": "bob@example.com"
    },
    {
      "id": 3,
      "name": "Charlie Brown",
      "email": "charlie@example.com"
    }
  ]
}
```

## Java Application

### Test Output
```bash
$ mvn test

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.copilot.demo.CalculatorTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] Running com.copilot.demo.StringProcessorTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

### Application Output
```bash
$ mvn exec:java

============================================================
GitHub Copilot Demo - Java Application
============================================================

String Processor Demo:
------------------------------------------------------------
Original: Hello GitHub Copilot
Reversed: tolipoC buHtiG olleH
Uppercase: HELLO GITHUB COPILOT
Word Count: 3
Palindrome Check: true

Calculator Demo:
------------------------------------------------------------
10 + 5 = 15.0
10 - 5 = 5.0
10 * 5 = 50.0
10 / 5 = 2.0
2 ^ 8 = 256.0

Interactive Mode (type 'exit' to quit)
------------------------------------------------------------
```

## Summary

All three demo applications demonstrate:

✅ **Working code** - All applications run successfully
✅ **Comprehensive tests** - 100% pass rate across all test suites
✅ **Best practices** - Proper project structure and error handling
✅ **Documentation** - Clear README files for each project
✅ **CI/CD** - GitHub Actions workflows for automated testing

This repository showcases GitHub Copilot's ability to help build complete, production-ready applications across multiple programming languages and ecosystems.
