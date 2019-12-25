package com.kay.leetcode;

import com.kay.utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 */
public class NextLargerNodes {

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> A = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            A.add(node.val);
        }
        int[] ans = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.size(); i++) {
            while (!stack.isEmpty() && A.get(stack.peek()) < A.get(i)) {
                ans[stack.pop()] = A.get(i);
            }
            stack.push(i);
        }
        return ans;
    }

}
