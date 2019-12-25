package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (hasSize(prev, k)) {
            prev = reverseList(prev, k);
        }
        return dummy.next;
    }


    /**
     * Check the linked list has required size, not count the prev node
     *
     * @param prevNode
     * @param requiredSize
     * @return
     */
    private boolean hasSize(ListNode prevNode, int requiredSize) {
        ListNode cur = prevNode;
        int size = 0;
        while (cur.next != null) {
            size++;
            cur = cur.next;
            if (size >= requiredSize) {
                return true;
            }
        }
        return false;
    }

    /**
     * reverse linked list of certain size and return the last node of the list
     *
     * @param prevNode
     * @param size
     * @return
     */
    private ListNode reverseList(ListNode prevNode, int size) {
        ListNode prev = prevNode, cur = prevNode.next;
        int remainNode = size;
        while (remainNode > 0) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            remainNode--;
        }
        ListNode nextPrevNode = prevNode.next;
        prevNode.next = prev;
        nextPrevNode.next = cur;
        return nextPrevNode;
    }
}
