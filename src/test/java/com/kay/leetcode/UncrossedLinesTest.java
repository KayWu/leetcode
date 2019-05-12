package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UncrossedLinesTest {

    private UncrossedLines solution;

    @BeforeEach
    void setUp() {
        solution = new UncrossedLines();
    }

    @Test
    void sample() {
        assertEquals(2, solution.maxUncrossedLines(new int[]{1, 4, 2}, new int[]{1, 2, 4}));
        assertEquals(3, solution.maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2}));
        assertEquals(2, solution.maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1}));
    }
}