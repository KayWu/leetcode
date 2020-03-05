package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        internal(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }


    private void internal(int[] nums, List<List<Integer>> ans, ArrayList<Integer> list, boolean[] used) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.add(nums[i]);
                used[i] = true;
                internal(nums, ans, list, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
