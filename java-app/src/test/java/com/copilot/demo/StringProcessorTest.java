package com.copilot.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for StringProcessor class
 */
class StringProcessorTest {
    
    private StringProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new StringProcessor();
    }

    @Test
    void testReverse() {
        assertEquals("olleH", processor.reverse("Hello"));
        assertEquals("", processor.reverse(""));
        assertNull(processor.reverse(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", processor.toUpperCase("hello"));
        assertEquals("HELLO WORLD", processor.toUpperCase("Hello World"));
        assertNull(processor.toUpperCase(null));
    }

    @Test
    void testCountWords() {
        assertEquals(2, processor.countWords("Hello World"));
        assertEquals(1, processor.countWords("Hello"));
        assertEquals(0, processor.countWords(""));
        assertEquals(0, processor.countWords(null));
        assertEquals(3, processor.countWords("  Hello   World   Test  "));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(processor.isPalindrome("racecar"));
        assertTrue(processor.isPalindrome("A man a plan a canal Panama"));
        assertTrue(processor.isPalindrome("Was it a car or a cat I saw"));
        assertFalse(processor.isPalindrome("hello"));
        assertFalse(processor.isPalindrome(null));
    }
}
