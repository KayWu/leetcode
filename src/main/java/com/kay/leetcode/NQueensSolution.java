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
        dfs(0, board, new HashSet<>(), new HashSet<>(), new HashSet<>(), result);
        return result;
    }

    private void dfs(int currentRow, char[][] board, Set<Integer> cols, Set<Integer> add, Set<Integer> minus, List<List<String>> result) {
        int n = board.length;
        if (currentRow >= n) {
            result.add(transferBoard(board));
        }
        for (int i = 0; i < n; i++) {
            if (!cols.contains(i) && !add.contains(currentRow + i) && !minus.contains(currentRow - i)) {
                cols.add(i);
                add.add(currentRow + i);
                minus.add(currentRow - i);
                board[currentRow][i] = 'Q';
                dfs(currentRow + 1, board, cols, add, minus, result);
                cols.remove(i);
                add.remove(currentRow + i);
                minus.remove(currentRow - i);
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
