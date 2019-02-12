package com.kay.leetcode;

/**
 * https://leetcode.com/problems/n-queens-ii/
 */
public class NQueensIIBitSolution {

    private int count;

    public int totalNQueens(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        this.count = 0;
        dfs(0, n, 0, 0, 0);
        return this.count;
    }

    private void dfs(int currentRow, int n, int col, int pie, int na) {
        if (currentRow >= n) {
            this.count++;
            return;
        }
        // 得到当前所有的空位
        int bits = (~(col | pie | na)) & ((1 << n) - 1);

        while (bits != 0) {
            // 取到最低位的 1
            int p = bits & (-bits);
            dfs(currentRow + 1, n, col | p, (pie | p) << 1, (na | p) >> 1);
            // 去掉最低位的 1
            bits = bits & (bits - 1);
        }
    }

}
