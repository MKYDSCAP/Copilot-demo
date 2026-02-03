"""
Unit tests for the Calculator class
Demonstrates test-driven development with GitHub Copilot
"""

import pytest
from calculator import Calculator


class TestCalculator:
    """Test suite for Calculator class."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.calc = Calculator()
    
    def test_add_positive_numbers(self):
        """Test addition of positive numbers."""
        assert self.calc.add(5, 3) == 8
        assert self.calc.add(10, 20) == 30
    
    def test_add_negative_numbers(self):
        """Test addition with negative numbers."""
        assert self.calc.add(-5, -3) == -8
        assert self.calc.add(-10, 5) == -5
    
    def test_add_zero(self):
        """Test addition with zero."""
        assert self.calc.add(5, 0) == 5
        assert self.calc.add(0, 0) == 0
    
    def test_subtract_positive_numbers(self):
        """Test subtraction of positive numbers."""
        assert self.calc.subtract(10, 5) == 5
        assert self.calc.subtract(20, 8) == 12
    
    def test_subtract_negative_numbers(self):
        """Test subtraction with negative numbers."""
        assert self.calc.subtract(-5, -3) == -2
        assert self.calc.subtract(5, -3) == 8
    
    def test_multiply_positive_numbers(self):
        """Test multiplication of positive numbers."""
        assert self.calc.multiply(5, 3) == 15
        assert self.calc.multiply(10, 10) == 100
    
    def test_multiply_by_zero(self):
        """Test multiplication by zero."""
        assert self.calc.multiply(5, 0) == 0
        assert self.calc.multiply(0, 10) == 0
    
    def test_multiply_negative_numbers(self):
        """Test multiplication with negative numbers."""
        assert self.calc.multiply(-5, 3) == -15
        assert self.calc.multiply(-5, -3) == 15
    
    def test_divide_positive_numbers(self):
        """Test division of positive numbers."""
        assert self.calc.divide(10, 5) == 2
        assert self.calc.divide(20, 4) == 5
    
    def test_divide_by_zero(self):
        """Test that division by zero raises ValueError."""
        with pytest.raises(ValueError, match="Cannot divide by zero"):
            self.calc.divide(10, 0)
    
    def test_divide_negative_numbers(self):
        """Test division with negative numbers."""
        assert self.calc.divide(-10, 5) == -2
        assert self.calc.divide(-10, -5) == 2
    
    def test_power_positive_numbers(self):
        """Test power operation with positive numbers."""
        assert self.calc.power(2, 3) == 8
        assert self.calc.power(5, 2) == 25
    
    def test_power_zero_exponent(self):
        """Test power with zero exponent."""
        assert self.calc.power(5, 0) == 1
        assert self.calc.power(100, 0) == 1
    
    def test_power_negative_exponent(self):
        """Test power with negative exponent."""
        assert self.calc.power(2, -1) == 0.5
        assert self.calc.power(10, -2) == 0.01
    
    def test_modulo_positive_numbers(self):
        """Test modulo operation with positive numbers."""
        assert self.calc.modulo(10, 3) == 1
        assert self.calc.modulo(17, 5) == 2
    
    def test_modulo_by_zero(self):
        """Test that modulo by zero raises ValueError."""
        with pytest.raises(ValueError, match="Cannot perform modulo by zero"):
            self.calc.modulo(10, 0)
    
    def test_modulo_negative_numbers(self):
        """Test modulo operation with negative numbers."""
        assert self.calc.modulo(-10, 3) == 2
        assert self.calc.modulo(10, -3) == -2
