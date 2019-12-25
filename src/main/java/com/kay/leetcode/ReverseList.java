package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * 单链表反转
 * 关键点确定单次步骤的起始和终点
 * 起点
 * 0      1  ->  2
 * prev   cur
 * 终点
 * 0  <-  1      2
 * prev   cur
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
