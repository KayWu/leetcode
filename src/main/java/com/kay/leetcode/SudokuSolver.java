package com.kay.leetcode;

/**
 * https://leetcode.com/problems/sudoku-solver/
 */
public class SudokuSolver {

    public static final int N = 9;

    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[N][N];
        boolean[][] col = new boolean[N][N];
        boolean[][] block = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    row[i][num] = true;
                    col[j][num] = true;
                    block[order(i, j)][num] = true;
                }
            }
        }

        dfs(0, row, col, block, board);
    }

    private boolean dfs(int order, boolean[][] row, boolean[][] col, boolean[][] block, char[][] board) {
        if (order >= N * N) {
            return true;
        }
        int i = order / 9;
        int j = order % 9;

        if (board[i][j] != '.') {
            return dfs(order+1, row, col, block, board);
        }

        for (int k = 0; k < N; k++) {
            if (!row[i][k] && !col[j][k] && !block[order(i, j)][k]) {
                row[i][k] = true;
                col[j][k] = true;
                block[order(i, j)][k] = true;
                board[i][j] = (char) (k + '1');
                if (dfs(order + 1, row, col, block, board)) {
                    return true;
                }
                row[i][k] = false;
                col[j][k] = false;
                block[order(i, j)][k] = false;
                board[i][j] = '.';
            }
        }
        return false;
    }

    private int order(int i, int j) {
        return i / 3 * 3 + j / 3;
    }

}
