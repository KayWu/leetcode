package com.kay.leetcode;

import java.util.List;

public class SudokuUtil {

    public static final int N = 9;
    public static final char BLANK = '.';

    public static char[][] board(List<String> rowStrings) {
        int n = rowStrings.size();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = rowStrings.get(i).charAt(j);
            }
        }
        return board;
    }

    public static boolean isSolutionValid(char[][] board) {
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
