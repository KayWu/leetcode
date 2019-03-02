package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxProfitIVTest {

    private MaxProfitIV solution;

    @BeforeEach
    void setUp() {
        solution = new MaxProfitIV();
    }

    @Test
    void sample() {
        assertEquals(2, solution.maxProfit(2, new int[]{2, 4, 1}));
        assertEquals(7, solution.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }

    @Test
    void empty() {
        solution.maxProfit(1, new int[]{});
        solution.maxProfit(0, new int[]{1, 3});
    }

    @Test
    void singletonArray() {
        assertEquals(0, solution.maxProfit(1, new int[]{1}));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.maxProfit(0, null);
        });
    }
}