package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses solution;

    @BeforeEach
    void setUp() {
        solution = new ValidParentheses();
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> solution.isValid(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(solution.isValid(""));
    }

    @Test
    void testOnePair() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void testOrderedPair() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void testNestPair() {
        assertTrue(solution.isValid("{[()]}"));
    }

    @Test
    void testOnlyRight() {
        assertFalse(solution.isValid("]}"));
    }

    @Test
    void testOnlyLeft() {
        assertFalse(solution.isValid("{["));
    }

    @Test
    void testSizeNotMatch() {
        assertFalse(solution.isValid("{[]}["));
    }

}