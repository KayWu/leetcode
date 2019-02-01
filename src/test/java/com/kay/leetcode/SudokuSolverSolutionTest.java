package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SudokuSolverSolutionTest {

    private SudokuSolverSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SudokuSolverSolution();
    }

    @Test
    void sample() {
        char[][] board = SudokuUtil.board(Arrays.asList(
                "53..7....",
                "6..195...",
                ".98....6.",
                "8...6...3",
                "4..8.3..1",
                "7...2...6",
                ".6....28.",
                "...419..5",
                "....8..79")
        );
        solution.solveSudoku(board);
        assertTrue(SudokuUtil.isSolutionValid(board));
    }
}