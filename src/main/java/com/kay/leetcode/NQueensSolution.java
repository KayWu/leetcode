package com.kay.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/n-queens/
 */
public class NQueensSolution {

    public List<List<String>> solveNQueens(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> result = new ArrayList<>();
        dfs(0, board, new boolean[n], new boolean[2 * n], new boolean[2 * n], result);
        return result;
    }

    private void dfs(int currentRow, char[][] board, boolean[] cols, boolean[] add, boolean[] minus, List<List<String>> result) {
        int n = board.length;
        if (currentRow >= n) {
            result.add(transferBoard(board));
        }
        for (int i = 0; i < n; i++) {
            if (!cols[i] && !add[currentRow + i] && !minus[currentRow - i + n]) {
                cols[i] = true;
                add[currentRow + i] = true;
                minus[currentRow - i + n] = true;
                board[currentRow][i] = 'Q';
                dfs(currentRow + 1, board, cols, add, minus, result);
                cols[i] = false;
                add[currentRow + i] = false;
                minus[currentRow - i + n] = false;
                board[currentRow][i] = '.';
            }
        }
    }

    private List<String> transferBoard(char[][] board) {
        List<String> boardPresent = new ArrayList<>(board.length);
        for (int i = 0; i < board.length; i++) {
            boardPresent.add(new String(board[i]));
        }
        return boardPresent;
    }

}
