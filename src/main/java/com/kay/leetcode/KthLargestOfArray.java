package com.kay.leetcode;

import java.util.Random;


/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestOfArray {
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int pivot = partition(nums, lo, hi);
            if (pivot == nums.length - k) {
                return nums[pivot];
            } else if (pivot > nums.length - k) {
                hi = pivot - 1;
            } else {
                lo = pivot + 1;
            }
        }
        return -1;
    }

    private int partition(int[] nums, int lo, int hi) {
        int pivot = nums[hi];
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (nums[j] < pivot) {
                exch(nums, i, j);
                i++;
            }
        }
        exch(nums, i, hi);
        return i;
    }

    private void exch(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void shuffle(int[] nums) {
        Random random = new Random();
        for (int i = nums.length - 1; i > 0; i--) {
            int r = random.nextInt(i + 1);
            exch(nums, i, r);
        }
    }

}
