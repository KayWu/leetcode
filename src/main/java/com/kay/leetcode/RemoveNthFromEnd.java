package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * 两种解题方法
 */
public class RemoveNthFromEnd {

    /**
     * 遍历两遍，第一遍获取长度，第二遍删除 Node
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndInTwoPass(ListNode head, int n) {
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

    /**
     * 遍历一遍，通过两个 pointer
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }


}
