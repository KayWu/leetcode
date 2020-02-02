package com.kay.leetcode;

/**
 * https://leetcode.com/problems/n-queens-ii/
 */
public class NQueensIISolution {

    public int totalNQueens(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        return dfs(0, n, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
    }

    private int dfs(int currentRow, int n, boolean[] cols, boolean[] add, boolean[] minus) {
        if (currentRow >= n) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!cols[i] && !add[currentRow + i] && !minus[currentRow - i + n]) {
                cols[i] = true;
                add[currentRow + i] = true;
                minus[currentRow - i + n] = true;
                count += dfs(currentRow + 1, n, cols, add, minus);
                cols[i] = false;
                add[currentRow + i] = false;
                minus[currentRow - i + n] = false;
            }
        }
        return count;
    }

}
