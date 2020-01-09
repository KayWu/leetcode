package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException();
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int i = 0;
        while (fast.next != null) {
            fast = fast.next;
            i++;
            // k nodes
            if (i % k == 0) {
                ListNode prev = fast.next;
                ListNode cur = slow.next;
                for (int j = 0; j < k; j++) {
                    // reverse the list
                    ListNode temp = cur.next;
                    cur.next = prev;
                    prev = cur;
                    cur = temp;
                }
                ListNode temp = slow.next;
                slow.next = fast;
                slow = temp;
                fast = temp;
            }
        }
        return dummy.next;

    }

}
