"""
Simple Calculator Application
Demonstrates basic Python operations with GitHub Copilot
"""

class Calculator:
    """A simple calculator class that performs basic arithmetic operations."""
    
    def add(self, a, b):
        """Add two numbers and return the result."""
        return a + b
    
    def subtract(self, a, b):
        """Subtract b from a and return the result."""
        return a - b
    
    def multiply(self, a, b):
        """Multiply two numbers and return the result."""
        return a * b
    
    def divide(self, a, b):
        """Divide a by b and return the result."""
        if b == 0:
            raise ValueError("Cannot divide by zero")
        return a / b
    
    def power(self, a, b):
        """Raise a to the power of b."""
        return a ** b
    
    def modulo(self, a, b):
        """Return the remainder of a divided by b."""
        if b == 0:
            raise ValueError("Cannot perform modulo by zero")
        return a % b


def main():
    """Main function to demonstrate calculator usage."""
    calc = Calculator()
    
    print("=" * 50)
    print("GitHub Copilot Demo - Python Calculator")
    print("=" * 50)
    print()
    
    # Demonstrate various operations
    print("Addition: 10 + 5 =", calc.add(10, 5))
    print("Subtraction: 10 - 5 =", calc.subtract(10, 5))
    print("Multiplication: 10 * 5 =", calc.multiply(10, 5))
    print("Division: 10 / 5 =", calc.divide(10, 5))
    print("Power: 2 ^ 8 =", calc.power(2, 8))
    print("Modulo: 10 % 3 =", calc.modulo(10, 3))
    print()
    
    # Interactive mode
    print("Interactive Calculator (type 'quit' to exit)")
    print("-" * 50)
    
    while True:
        try:
            operation = input("\nEnter operation (add/sub/mul/div/pow/mod) or 'quit': ").lower()
            
            if operation == 'quit':
                print("Thank you for using the calculator!")
                break
            
            if operation not in ['add', 'sub', 'mul', 'div', 'pow', 'mod']:
                print("Invalid operation. Please try again.")
                continue
            
            a = float(input("Enter first number: "))
            b = float(input("Enter second number: "))
            
            if operation == 'add':
                result = calc.add(a, b)
            elif operation == 'sub':
                result = calc.subtract(a, b)
            elif operation == 'mul':
                result = calc.multiply(a, b)
            elif operation == 'div':
                result = calc.divide(a, b)
            elif operation == 'pow':
                result = calc.power(a, b)
            elif operation == 'mod':
                result = calc.modulo(a, b)
            
            print(f"Result: {result}")
            
        except ValueError as e:
            print(f"Error: {e}")
        except KeyboardInterrupt:
            print("\n\nExiting calculator...")
            break


if __name__ == "__main__":
    main()
