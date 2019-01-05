package com.kay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }
        if (nums.length < 3) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int target = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            if ((j + 1 < nums.length && nums[j] + nums[j + 1] > target) ||
                    (k - 1 > i && nums[k] + nums[k - 1] < target)) {
                i = nextRightDiffIndex(i, nums);
                continue;
            }
            while (j < k) {
                if (nums[j] + nums[k] < target) {
                    j = nextRightDiffIndex(j, nums);
                } else if (nums[j] + nums[k] > target) {
                    k = nextLeftDiffIndex(k, nums, i);
                } else {
                    triplets.add(Arrays.asList(-target, nums[j], nums[k]));
                    j = nextRightDiffIndex(j, nums);
                    k = nextLeftDiffIndex(k, nums, i);
                }
            }
            i = nextRightDiffIndex(i, nums);
        }
        return triplets;
    }

    private int nextRightDiffIndex(int index, int[] nums) {
        while (index + 1 < nums.length && nums[index + 1] == nums[index]) {
            index++;
        }
        index++;
        return index;
    }

    private int nextLeftDiffIndex(int index, int[] nums, int leftEdge) {
        while (index - 1 > leftEdge && nums[index - 1] == nums[index]) {
            index--;
        }
        index--;
        return index;
    }


}
