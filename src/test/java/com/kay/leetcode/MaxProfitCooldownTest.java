package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxProfitCooldownTest {

    private MaxProfitCooldown solution;

    @BeforeEach
    void setUp() {
        solution = new MaxProfitCooldown();
    }

    @Test
    void sample() {
        assertEquals(3, solution.maxProfit(new int[]{1, 2, 3, 0, 2}));
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