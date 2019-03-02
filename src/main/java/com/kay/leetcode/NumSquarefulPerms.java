package com.kay.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/number-of-squareful-arrays/
 */
public class NumSquarefulPerms {
    private int res;

    public int numSquarefulPerms(int[] A) {
        Arrays.sort(A);
        res = 0;
        dfs(-1, A.length, new boolean[A.length], A);
        return res;
    }

    private void dfs(int prev, int todo, boolean[] used, int[] A) {
        if (todo == 0) {
            res++;
            return;
        }
        for (int i = 0; i < A.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i >= 1 && !used[i - 1] && A[i] == A[i - 1]) {
                continue;
            }
            if (prev == -1 || isSumSquare(prev, A[i])) {
                used[i] = true;
                dfs(A[i], todo - 1, used, A);
                used[i] = false;
            }
        }
    }

    private boolean isSumSquare(int x, int y) {
        int root = (int) Math.sqrt(x + y);
        return root * root == (x + y);
    }

}
