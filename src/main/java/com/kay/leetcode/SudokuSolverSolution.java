package com.kay.leetcode;

/**
 * https://leetcode.com/problems/sudoku-solver/
 */
public class SudokuSolverSolution {

    public static final int N = 9;
    public static final char BLANK = '.';

    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[N][N + 1];
        boolean[][] col = new boolean[N][N + 1];
        boolean[][] block = new boolean[N][N + 1];
        for (int rowIndex = 0; rowIndex < N; rowIndex++) {
            for (int colIndex = 0; colIndex < N; colIndex++) {
                if (board[rowIndex][colIndex] != BLANK) {
                    int number = board[rowIndex][colIndex] - '0';
                    if (row[rowIndex][number] || col[colIndex][number] || block[order(rowIndex, colIndex)][number]) {
                        throw new IllegalArgumentException("The board is not valid");
                    }
                    row[rowIndex][number] = true;
                    col[colIndex][number] = true;
                    block[order(rowIndex, colIndex)][number] = true;
                }
            }
        }
        dfs(0, 0, row, col, block, board);
    }

    private boolean dfs(int rowIndex, int colIndex, boolean[][] row, boolean[][] col, boolean[][] block, char[][] board) {
        while (rowIndex < N && colIndex < N) {
            if (board[rowIndex][colIndex] == BLANK) {
                break;
            }
            rowIndex = (colIndex + 1 < N) ? rowIndex : rowIndex + 1;
            colIndex = (colIndex + 1 < N) ? colIndex + 1 : 0;
        }

        if (rowIndex >= N || colIndex >= N) {
            return true;
        }

        for (int number = 1; number <= N; number++) {
            if (!row[rowIndex][number] && !col[colIndex][number] && !block[order(rowIndex, colIndex)][number]) {
                row[rowIndex][number] = true;
                col[colIndex][number] = true;
                block[order(rowIndex, colIndex)][number] = true;
                board[rowIndex][colIndex] = (char) (number + '0');
                int nextRow = (colIndex + 1 < N) ? rowIndex : rowIndex + 1;
                int nextCol = (colIndex + 1 < N) ? colIndex + 1 : 0;
                if (dfs(nextRow, nextCol, row, col, block, board)) {
                    return true;
                }
                row[rowIndex][number] = false;
                col[colIndex][number] = false;
                block[order(rowIndex, colIndex)][number] = false;
                board[rowIndex][colIndex] = '.';
            }
        }
        return false;
    }

    private int order(int rowIndex, int colIndex) {
        return rowIndex / 3 * 3 + colIndex / 3;
    }

}
