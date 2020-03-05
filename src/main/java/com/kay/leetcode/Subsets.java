package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, nums, 0, new ArrayList<>());
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] nums, int i, List<Integer> tempList) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        dfs(ans, nums, i + 1, tempList);
        tempList.add(nums[i]);
        dfs(ans, nums, i + 1, tempList);
        tempList.remove(tempList.size() - 1);
    }
}
