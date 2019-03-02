package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence solution;

    @BeforeEach
    void setUp() {
        solution = new LongestIncreasingSubsequence();
    }

    @Test
    void sample() {
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(3, solution.lengthOfLIS(new int[]{4, 10, 4, 3, 8, 9}));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.lengthOfLIS(null);
        });
    }

    @Test
    void zero() {
        assertEquals(0, solution.lengthOfLIS(new int[]{}));
    }

}