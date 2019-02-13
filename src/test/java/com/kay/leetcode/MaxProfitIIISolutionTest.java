package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MaxProfitIIISolutionTest {

    private MaxProfitIIISolution solution;

    @BeforeEach
    void setUp() {
        solution = new MaxProfitIIISolution();
    }

    @Test
    void sample() {
        assertEquals(6, solution.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void emptyArray() {
        solution.maxProfit(new int[]{});
    }

    @Test
    void singletonArray() {
        assertEquals(0, solution.maxProfit(new int[]{1}));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.maxProfit(null);
        });
    }
}