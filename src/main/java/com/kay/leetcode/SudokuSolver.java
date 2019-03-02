package com.kay.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/sudoku-solver/
 */
public class SudokuSolver {

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

        List<Integer> cells = cellsInOrder(row, col, block, board);
        dfs(0, cells, row, col, block, board);
    }

    private boolean dfs(int count, List<Integer> cells, boolean[][] row, boolean[][] col, boolean[][] block, char[][] board) {
        if (cells.size() <= count) {
            return true;
        }
        int sign = cells.get(count);
        int rowIndex = (sign % 100) / 10;
        int colIndex = sign % 10;

        for (int number = 1; number <= N; number++) {
            if (!row[rowIndex][number] && !col[colIndex][number] && !block[order(rowIndex, colIndex)][number]) {
                row[rowIndex][number] = true;
                col[colIndex][number] = true;
                block[order(rowIndex, colIndex)][number] = true;
                board[rowIndex][colIndex] = (char) (number + '0');
                count++;
                if (dfs(count, cells, row, col, block, board)) {
                    return true;
                }
                count--;
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

    private List<Integer> cellsInOrder(boolean[][] row, boolean[][] col, boolean[][] block, char[][] board) {
        List<Integer> list = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < N; rowIndex++) {
            for (int colIndex = 0; colIndex < N; colIndex++) {
                if (board[rowIndex][colIndex] == BLANK) {
                    int count = 0;
                    for (int number = 1; number <= N; number++) {
                        if (!row[rowIndex][number] && !col[colIndex][number] && !block[order(rowIndex, colIndex)][number]) {
                            count++;
                        }
                    }
                    int key = rowIndex * 10 + colIndex + count * 100;
                    list.add(key);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

}
