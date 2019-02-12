package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NQueensIIBitSolutionTest {

    private NQueensIIBitSolution solution;

    @BeforeEach
    void setUp() {
        solution = new NQueensIIBitSolution();
    }

    @Test
    void zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.totalNQueens(0);
        });
    }

    @Test
    void sample() {
        assertEquals(2, solution.totalNQueens(4));
        assertEquals(0, solution.totalNQueens(2));
    }
}