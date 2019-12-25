package com.kay.leetcode;

import com.kay.utils.BoardUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SudokuSolverTest {

    private SudokuSolver solution;

    @BeforeEach
    void setUp() {
        solution = new SudokuSolver();
    }

    @Test
    void sample() {
        char[][] board = BoardUtil.board(Arrays.asList(
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
        assertTrue(isSolutionValid(board));
    }

    private boolean isSolutionValid(char[][] board) {
        final int N = 9;
        final char BLANK = '.';
        boolean[][] row = new boolean[N][N + 1];
        boolean[][] col = new boolean[N][N + 1];
        boolean[][] block = new boolean[N][N + 1];
        for (int rowIndex = 0; rowIndex < N; rowIndex++) {
            for (int colIndex = 0; colIndex < N; colIndex++) {
                if (board[rowIndex][colIndex] != BLANK) {
                    int number = board[rowIndex][colIndex] - '0';
                    if (row[rowIndex][number] || col[colIndex][number] || block[rowIndex / 3 * 3 + colIndex / 3][number]) {
                        return false;
                    }
                    row[rowIndex][number] = true;
                    col[colIndex][number] = true;
                    block[rowIndex / 3 * 3 + colIndex / 3][number] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}