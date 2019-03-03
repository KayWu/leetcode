package com.kay.leetcode;

/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 */
public class MaxConsecutiveOnesIII {
    /**
     * Translation:
     * Find the longest subarray with at most K zeros.
     */
    public int longestOnes(int[] A, int K) {
        int res = 0, i = 0;
        int remain = K;
        for (int j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                remain--;
            }
            // don't need to reduce the the size of sliding window,
            // as we want to find the maximum window.
            if (remain < 0) {
                if (A[i] == 0) {
                    remain++;
                }
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
