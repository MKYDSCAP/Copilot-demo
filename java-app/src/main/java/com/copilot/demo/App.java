package com.copilot.demo;

import java.util.Scanner;

/**
 * Main application class for the Java Demo
 * Demonstrates Java application development with GitHub Copilot
 */
public class App {
    private static final StringProcessor processor = new StringProcessor();
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("GitHub Copilot Demo - Java Application");
        System.out.println("=".repeat(60));
        System.out.println();

        demonstrateStringProcessor();
        System.out.println();
        demonstrateCalculator();
        System.out.println();

        interactiveMode();
    }

    /**
     * Demonstrates string processing features
     */
    private static void demonstrateStringProcessor() {
        System.out.println("String Processor Demo:");
        System.out.println("-".repeat(60));

        String text = "Hello GitHub Copilot";
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + processor.reverse(text));
        System.out.println("Uppercase: " + processor.toUpperCase(text));
        System.out.println("Word Count: " + processor.countWords(text));
        System.out.println("Palindrome Check: " + processor.isPalindrome("racecar"));
    }

    /**
     * Demonstrates calculator features
     */
    private static void demonstrateCalculator() {
        System.out.println("Calculator Demo:");
        System.out.println("-".repeat(60));

        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));
        System.out.println("2 ^ 8 = " + calculator.power(2, 8));
    }

    /**
     * Interactive mode for user input
     */
    private static void interactiveMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Interactive Mode (type 'exit' to quit)");
        System.out.println("-".repeat(60));

        while (true) {
            System.out.print("\nEnter a command (calc/string/exit): ");
            String command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("exit")) {
                System.out.println("Thank you for using the Java Demo!");
                break;
            }

            switch (command) {
                case "calc":
                    handleCalculator(scanner);
                    break;
                case "string":
                    handleStringProcessor(scanner);
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Handles calculator operations
     */
    private static void handleCalculator(Scanner scanner) {
        try {
            System.out.print("Enter operation (add/sub/mul/div/pow): ");
            String op = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter first number: ");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter second number: ");
            double b = Double.parseDouble(scanner.nextLine());

            double result;
            switch (op) {
                case "add":
                    result = calculator.add(a, b);
                    break;
                case "sub":
                    result = calculator.subtract(a, b);
                    break;
                case "mul":
                    result = calculator.multiply(a, b);
                    break;
                case "div":
                    result = calculator.divide(a, b);
                    break;
                case "pow":
                    result = calculator.power(a, b);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Handles string processing operations
     */
    private static void handleStringProcessor(Scanner scanner) {
        System.out.print("Enter operation (reverse/upper/count/palindrome): ");
        String op = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        switch (op) {
            case "reverse":
                System.out.println("Result: " + processor.reverse(text));
                break;
            case "upper":
                System.out.println("Result: " + processor.toUpperCase(text));
                break;
            case "count":
                System.out.println("Word count: " + processor.countWords(text));
                break;
            case "palindrome":
                System.out.println("Is palindrome: " + processor.isPalindrome(text));
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
