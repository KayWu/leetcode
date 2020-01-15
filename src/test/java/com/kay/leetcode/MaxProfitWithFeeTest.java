package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitWithFeeTest {

    private MaxProfitWithFee solution;

    @BeforeEach
    void setUp() {
        solution = new MaxProfitWithFee();
    }

    @Test
    void sample() {
        assertEquals(8, solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }

}
