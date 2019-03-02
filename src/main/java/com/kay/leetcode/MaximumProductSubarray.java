package com.kay.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int max = nums[0];
        int prevMin = nums[0];
        int prevMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int[] answers = new int[]{prevMin * nums[i], prevMax * nums[i], nums[i]};
            Arrays.sort(answers);
            prevMin = answers[0];
            prevMax = answers[2];
            if (max < prevMax) {
                max = prevMax;
            }
        }
        return max;
    }
}
