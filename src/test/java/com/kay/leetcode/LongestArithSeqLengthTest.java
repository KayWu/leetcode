package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestArithSeqLengthTest {

    private LongestArithSeqLength solution;

    @BeforeEach
    void setUp() {
        solution = new LongestArithSeqLength();
    }

    @Test
    void sample() {
        assertEquals(4, solution.longestArithSeqLength(new int[]{3, 6, 9, 12}));
        assertEquals(3, solution.longestArithSeqLength(new int[]{9, 4, 7, 2, 10}));
        assertEquals(4, solution.longestArithSeqLength(new int[]{20, 1, 15, 3, 10, 5, 8}));
    }


    @Test
    void complex() {
        assertEquals(6, solution.longestArithSeqLength(new int[]{44, 46, 22, 68, 45, 66, 43, 9, 37, 30, 50, 67, 32, 47, 44, 11, 15, 4, 11, 6, 20, 64, 54, 54, 61, 63, 23, 43, 3, 12, 51, 61, 16, 57, 14, 12, 55, 17, 18, 25, 19, 28, 45, 56, 29, 39, 52, 8, 1, 21, 17, 21, 23, 70, 51, 61, 21, 52, 25, 28}));
        assertEquals(6, solution.longestArithSeqLength(new int[]{22, 8, 57, 41, 36, 46, 42, 28, 42, 14, 9, 43, 27, 51, 0, 0, 38, 50, 31, 60, 29, 31, 20, 23, 37, 53, 27, 1, 47, 42, 28, 31, 10, 35, 39, 12, 15, 6, 35, 31, 45, 21, 30, 19, 5, 5, 4, 18, 38, 51, 10, 7, 20, 38, 28, 53, 15, 55, 60, 56, 43, 48, 34, 53, 54, 55, 14, 9, 56, 52}));
    }
}