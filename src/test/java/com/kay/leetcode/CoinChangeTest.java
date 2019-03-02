package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeTest {

    private CoinChange solution;

    @BeforeEach
    void setUp() {
        solution = new CoinChange();
    }

    @Test
    void sample() {
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

    @Test
    void withOneCoin() {
        assertEquals(1, solution.coinChange(new int[]{1}, 1));
    }

    @Test
    void withTwoCoins() {
        assertEquals(2, solution.coinChange(new int[]{1, 2, 5}, 3));
    }

    @Test
    void zero() {
        assertEquals(0, solution.coinChange(new int[]{1}, 0));
    }

    @Test
    void bitAmount() {
        assertEquals(8, solution.coinChange(new int[]{474, 83, 404, 3}, 264));
    }

    @Test
    void amountLessThanCoin() {
        assertEquals(-1, solution.coinChange(new int[]{2}, 1));
    }

}