package com.kay.leetcode;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycleSolution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head.next, slow = head;

        while (fast != null && slow != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
        }
        return false;

    }
}
