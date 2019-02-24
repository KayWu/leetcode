package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinKBitFlipsSolutionTest {

    private MinKBitFlipsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MinKBitFlipsSolution();
    }

    @Test
    void sample() {
        assertEquals(2, solution.minKBitFlips(new int[]{0, 1, 0}, 1));
        assertEquals(-1, solution.minKBitFlips(new int[]{1, 1, 0}, 2));
        assertEquals(3, solution.minKBitFlips(new int[]{0, 0, 0, 1, 0, 1, 1, 0}, 3));
    }

    @Test
    void withOneElement() {
        assertEquals(0, solution.minKBitFlips(new int[]{1}, 1));
        assertEquals(1, solution.minKBitFlips(new int[]{0}, 1));
    }
}