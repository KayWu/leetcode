package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                cur.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }

            }
            cur = cur.next;
        }
        return head.next;
    }
}
