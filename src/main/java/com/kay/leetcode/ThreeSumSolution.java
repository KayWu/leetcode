package com.kay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        int i = 0;
        while (i < nums.length - 2) {
            int target = -nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            if ((lo + 1 < nums.length && nums[lo] + nums[lo + 1] > target) ||
                    (hi - 1 > i && nums[hi] + nums[hi - 1] < target)) {
                i = nextRightDiffIndex(i, nums.length - 2, nums);
                continue;
            }
            while (lo < hi) {
                if (nums[lo] + nums[hi] < target) {
                    lo = nextRightDiffIndex(lo, hi, nums);
                } else if (nums[lo] + nums[hi] > target) {
                    hi = nextLeftDiffIndex(hi, lo, nums);
                } else {
                    triplets.add(Arrays.asList(-target, nums[lo], nums[hi]));
                    lo = nextRightDiffIndex(lo, hi, nums);
                    hi = nextLeftDiffIndex(hi, lo, nums);
                }
            }
            i = nextRightDiffIndex(i, nums.length - 2, nums);
        }
        return triplets;
    }

    private int nextRightDiffIndex(int index, int rightEdge, int[] nums) {
        while (index + 1 < rightEdge && nums[index + 1] == nums[index]) {
            index++;
        }
        index++;
        return index;
    }

    private int nextLeftDiffIndex(int index, int leftEdge, int[] nums) {
        while (index - 1 > leftEdge && nums[index - 1] == nums[index]) {
            index--;
        }
        index--;
        return index;
    }


}
