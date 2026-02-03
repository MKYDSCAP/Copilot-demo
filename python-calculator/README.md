# Python Calculator Demo

A simple calculator application demonstrating Python best practices and testing with GitHub Copilot.

## Features

- Basic arithmetic operations (add, subtract, multiply, divide)
- Advanced operations (power, modulo)
- Interactive command-line interface
- Comprehensive unit tests with pytest
- Error handling for edge cases

## Installation

```bash
pip install -r requirements.txt
```

## Usage

### Run the Calculator

```bash
python calculator.py
```

### Run Tests

```bash
# Run all tests
pytest

# Run with coverage
pytest --cov=calculator tests/

# Run with verbose output
pytest -v
```

## Example Output

```
==================================================
GitHub Copilot Demo - Python Calculator
==================================================

Addition: 10 + 5 = 15
Subtraction: 10 - 5 = 5
Multiplication: 10 * 5 = 50
Division: 10 / 5 = 2.0
Power: 2 ^ 8 = 256
Modulo: 10 % 3 = 1
```

## Testing

The application includes comprehensive unit tests covering:
- Positive and negative number operations
- Edge cases (zero, division by zero)
- Error handling

Run tests with: `pytest tests/`
