package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];
            if (map.containsKey(toFind)) {
                return new int[]{map.get(toFind), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
