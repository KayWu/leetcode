package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxProfitTest {

    private MaxProfit solution;

    @BeforeEach
    void setUp() {
        solution = new MaxProfit();
    }

    @Test
    void sample() {
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, solution.maxProfit(new int[]{}));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.maxProfit(null);
        });
    }

}
