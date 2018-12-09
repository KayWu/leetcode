package com.kay.leetcode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwagPairsSolution {
    public ListNode swapPairs(ListNode head) {
        ListNode virtualStartNode = new ListNode(-1);
        virtualStartNode.next = head;
        ListNode prev = virtualStartNode;
        while (prev.next != null && prev.next.next != null) {
            ListNode a = prev.next;
            ListNode b = prev.next.next;
            prev.next = b;
            a.next = b.next;
            b.next = a;
            prev = a;
        }
        return virtualStartNode.next;
    }
}
