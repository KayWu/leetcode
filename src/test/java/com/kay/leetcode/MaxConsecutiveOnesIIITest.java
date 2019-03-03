package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesIIITest {

    private MaxConsecutiveOnesIII solution;

    @BeforeEach
    void setUp() {
        solution = new MaxConsecutiveOnesIII();
    }

    @Test
    void sample() {
        assertEquals(6, solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        assertEquals(10, solution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                3));
    }

    @Test
    void kLargerThanZeroCount() {
        assertEquals(4, solution.longestOnes(new int[]{1, 1, 0, 1}, 2));
    }
}