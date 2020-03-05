package com.kay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets-ii/
 */
public class SubsetsWithDup {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        dfs(ans, nums, 0, new ArrayList<>(), used);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] nums, int i, List<Integer> tempList, boolean[] used) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        dfs(ans, nums, i + 1, tempList, used);
        if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
            return;
        }
        tempList.add(nums[i]);
        used[i] = true;
        dfs(ans, nums, i + 1, tempList, used);
        used[i] = false;
        tempList.remove(tempList.size() - 1);
    }
}
