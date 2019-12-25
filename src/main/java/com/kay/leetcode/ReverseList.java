package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null, cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
