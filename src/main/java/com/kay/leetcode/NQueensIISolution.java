package com.kay.leetcode;

/**
 * https://leetcode.com/problems/n-queens-ii/
 */
public class NQueensIISolution {

    private int count;

    public int totalNQueens(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        count = 0;
        dfs(0, n, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return count;
    }

    private void dfs(int currentRow, int n, boolean[] cols, boolean[] add, boolean[] minus) {
        if (currentRow >= n) {
            count++;
        }
        for (int i = 0; i < n; i++) {
            if (!cols[i] && !add[currentRow + i] && !minus[currentRow - i + n]) {
                cols[i] = true;
                add[currentRow + i] = true;
                minus[currentRow - i + n] = true;
                dfs(currentRow + 1, n, cols, add, minus);
                cols[i] = false;
                add[currentRow + i] = false;
                minus[currentRow - i + n] = false;
            }
        }
    }

}
