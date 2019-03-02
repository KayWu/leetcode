package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SqrtXTest {

    private SqrtX solution;

    @BeforeEach
    void setUp() {
        solution = new SqrtX();
    }

    @Test
    void sample() {
        assertEquals(2, solution.mySqrt(4));
        assertEquals(2, solution.mySqrt(8));
        assertEquals(2, solution.mySqrt(5));
    }

    @Test
    void zero() {
        assertEquals(46339, solution.mySqrt(2147395599));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.mySqrt(-1);
        });

    }
}