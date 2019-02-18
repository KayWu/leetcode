package com.kay.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class LongestIncreasingSubsequenceSolution {
    public int lengthOfLIS(int[] nums) {
        return WithBinarySearch(nums);
    }

    /**
     * 动态规划：时间复杂度 n*n
     * dp[i]: 从头元素到 i 元素，且包括 i 元素的最长子序列长度
     * 如果不包含 i 元素，则 dp[i] 与之前 dp[] 的推导还受到最长子序列最大值的影响，很难推导
     */
    private int dp(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }
        if (nums.length == 0) {
            return 0;
        }
        int res = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    private int WithBinarySearch(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }
        int[] lis = new int[nums.length];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int position = Arrays.binarySearch(lis, 0, len, nums[i]);
            if (position < 0) {
                position = -(position + 1);
            }
            lis[position] = nums[i];
            if (position == len) {
                len++;
            }
        }
        return len;
    }


}
