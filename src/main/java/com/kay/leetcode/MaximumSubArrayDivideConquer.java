package com.kay.leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * 分治算法，复杂度 O(nlogn)
 */
public class MaximumSubArrayDivideConquer {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        return maxSubArray(nums, 0, nums.length - 1);
    }

    private int maxSubArray(int[] nums, int l, int h) {
        if (l == h) {
            return nums[l];
        }
        int m = (l + h) / 2;

        return Math.max(Math.max(maxSubArray(nums, l, m), maxSubArray(nums, m+1, h)), crossSubArray(nums, l, m, h));
    }

    private int crossSubArray(int[] nums, int l, int m, int h) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = m+1; i <= h; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }
}
