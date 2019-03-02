package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfTwoTest {

    private PowerOfTwo solution;

    @BeforeEach
    void setUp() {
        solution = new PowerOfTwo();
    }

    @Test
    void sample() {
        assertTrue(solution.isPowerOfTwo(1));
        assertTrue(solution.isPowerOfTwo(16));
        assertFalse(solution.isPowerOfTwo(218));
    }

    @Test
    void zero() {
        assertFalse(solution.isPowerOfTwo(0));
    }


    @Test
    void illegal() {
        assertFalse(solution.isPowerOfTwo(-2));
    }

    @Test
    void bigNumber() {
        assertTrue(solution.isPowerOfTwo(1024));
    }

}