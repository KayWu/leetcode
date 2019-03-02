package com.kay.leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] > 0 ? dp[i - 1] + nums[i] : nums[i];
        }
        int max = dp[0];

        for (int sum : dp) {
            max = Math.max(sum, max);
        }
        return max;
    }
}
