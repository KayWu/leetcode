package com.kay.leetcode;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycleSolution {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
