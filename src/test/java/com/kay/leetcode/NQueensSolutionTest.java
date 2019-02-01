package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NQueensSolutionTest {

    private NQueensSolution solution;

    @BeforeEach
    void setUp() {
        solution = new NQueensSolution();
    }

    @Test
    void zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.solveNQueens(0);
        });
    }

    @Test
    void sample() {
        assertThat(solution.solveNQueens(4), containsInAnyOrder(Arrays.asList(
                ".Q..",
                "...Q",
                "Q...",
                "..Q."
        ), Arrays.asList(
                "..Q.",
                "Q...",
                "...Q",
                ".Q.."
        )));
    }

}