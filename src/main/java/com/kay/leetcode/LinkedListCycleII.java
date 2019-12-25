package com.kay.leetcode;

import com.kay.utils.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii
 */
public class LinkedListCycleII {

    /**
     * 假设 List 在 cycle 前的长度为 x, cycle 长度为 y, fast 与 slow 相遇在 cycle 过后 z 长度的位置
     * 2(x + ay + z) = x + by + z => x + z = (b-2a)y
     * x + by + z + x => x + 2(b - a)y 即 cycle 起点
     * 由于 slow 已经在 cycle 过后 z 长度，它再走 x 则会回到 cycle 起点
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode detector = head;
                while (detector != slow) {
                    detector = detector.next;
                    slow = slow.next;
                }
                return detector;
            }
        }
        return null;
    }

}
