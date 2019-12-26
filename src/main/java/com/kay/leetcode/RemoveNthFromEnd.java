package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int target = length - n;
        // 检查 n 是否合法
        if (target < 0) {
            throw new IllegalArgumentException();
        }
        cur = dummy;
        while (target > 0) {
            cur = cur.next;
            target--;
        }
        // 删除 cur 后面的 Node
        cur.next = cur.next.next;
        return dummy.next;
    }
}
