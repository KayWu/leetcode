package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowSolutionTest {

    private PowSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PowSolution();
    }

    @Test
    void zero() {
        assertEquals(0, solution.myPow(0, 1), 1e-5);
        assertEquals(1, solution.myPow(0, 0), 1e-5);
        assertEquals(1, solution.myPow(1, 0), 1e-5);
    }

    @Test
    void sample() {
        assertEquals(1024, solution.myPow(2, 10), 1e-5);
        assertEquals(9.261, solution.myPow(2.1, 3), 1e-5);
        assertEquals(0.25, solution.myPow(2.0, -2), 1e-5);
    }

    @Test
    void minValue() {
        /**
         * When n is Integer.MIN_VALUE, -n is also Integer.MIN_VALUE, which leads to mistake
         */
        assertEquals(0, solution.myPow(2.0, Integer.MIN_VALUE), 1e-5);
    }
}