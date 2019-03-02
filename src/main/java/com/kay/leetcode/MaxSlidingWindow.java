package com.kay.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/sliding-window-maximum/
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums != null && nums.length == 0) {
            return new int[]{};
        }
        if (nums == null || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException();
        }
        int[] response = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }
            while (deque.size() > 0 && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.add(i);
            if (i >= k - 1) {
                response[i - k + 1] = nums[deque.getFirst()];
            }

        }
        return response;
    }
}
