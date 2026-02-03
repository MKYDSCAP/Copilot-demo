package com.copilot.demo;

/**
 * StringProcessor class demonstrating string manipulation operations
 */
public class StringProcessor {

    /**
     * Reverse a string
     * @param text input string
     * @return reversed string
     */
    public String reverse(String text) {
        if (text == null) {
            return null;
        }
        return new StringBuilder(text).reverse().toString();
    }

    /**
     * Convert string to uppercase
     * @param text input string
     * @return uppercase string
     */
    public String toUpperCase(String text) {
        if (text == null) {
            return null;
        }
        return text.toUpperCase();
    }

    /**
     * Count words in a string
     * @param text input string
     * @return number of words
     */
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    /**
     * Check if a string is a palindrome
     * @param text input string
     * @return true if palindrome, false otherwise
     */
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
