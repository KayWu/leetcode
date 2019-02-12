package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductSubarraySolutionTest {

    private MaximumProductSubarraySolution solution;

    @BeforeEach
    void setUp() {
        solution = new MaximumProductSubarraySolution();
    }

    @Test
    void sample() {
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, solution.maxProduct(new int[]{-2, 0, -1}));
    }
}