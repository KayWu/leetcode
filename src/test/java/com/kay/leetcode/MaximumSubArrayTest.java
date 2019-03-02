package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaximumSubArrayTest {

    private MaximumSubArray solution;

    @BeforeEach
    void setUp() {
        solution = new MaximumSubArray();
    }

    @Test
    void sample() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void single() {
        assertEquals(-1, solution.maxSubArray(new int[]{-1}));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.maxSubArray(new int[]{});
        });
    }
}