package com.kay.leetcode;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    mark(i, j, grid);
                }
            }
        }
        return count;
    }


    private void mark(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            mark(i - 1, j, grid);
            mark(i + 1, j, grid);
            mark(i, j - 1, grid);
            mark(i, j + 1, grid);
        }
    }
}
