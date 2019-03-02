package com.kay.leetcode;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {

    public static final int N = 9;
    public static final char BLANK = '.';

    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[N][N + 1];
        boolean[][] col = new boolean[N][N + 1];
        boolean[][] block = new boolean[N][N + 1];
        for (int rowIndex = 0; rowIndex < N; rowIndex++) {
            for (int colIndex = 0; colIndex < N; colIndex++) {
                if (board[rowIndex][colIndex] != BLANK) {
                    int number = board[rowIndex][colIndex] - '0';
                    if (row[rowIndex][number] || col[colIndex][number] || block[order(rowIndex, colIndex)][number]) {
                        return false;
                    }
                    row[rowIndex][number] = true;
                    col[colIndex][number] = true;
                    block[order(rowIndex, colIndex)][number] = true;
                }
            }
        }
        return true;
    }

    private int order(int rowIndex, int colIndex) {
        return rowIndex / 3 * 3 + colIndex / 3;
    }

}
