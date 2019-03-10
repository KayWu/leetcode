package com.kay.leetcode;

import com.kay.leetcode.utils.BoardUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidSudokuTest {

    private ValidSudoku solution;

    @BeforeEach
    void setUp() {
        solution = new ValidSudoku();
    }

    @Test
    void validSudoku() {
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
        assertTrue(solution.isValidSudoku(board));
    }

    @Test
    void invalidSudoku() {
        char[][] board = BoardUtil.board(Arrays.asList(
                "83..7....",
                "6..195...",
                ".98....6.",
                "8...6...3",
                "4..8.3..1",
                "7...2...6",
                ".6....28.",
                "...419..5",
                "....8..79")
        );
        assertFalse(solution.isValidSudoku(board));
    }

    @Test
    void invalidSudokuII() {
        char[][] board = BoardUtil.board(Arrays.asList(
                ".87654321",
                "2........",
                "3........",
                "4........",
                "5........",
                "6........",
                "7........",
                "8........",
                "9........")
        );
        assertTrue(solution.isValidSudoku(board));
    }

}