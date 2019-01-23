package com.kay.leetcode;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int currentElement = nums[0];
        int currentElementCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentElement == nums[i]) {
                currentElementCount++;
            } else {
                currentElementCount--;
            }
            if (currentElementCount < 0) {
                currentElement = nums[i];
                currentElementCount = 1;
            }
        }
        return currentElement;
    }
}
