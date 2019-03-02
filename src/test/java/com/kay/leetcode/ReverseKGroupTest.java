package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class ReverseKGroupTest {

    private ReverseKGroup solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseKGroup();
    }

    @Test
    void testNullNode() {
        ListNode head = LinkedListUtil.buildLinkedList();
        ListNode reversedHead = solution.reverseKGroup(head, 1);
        LinkedListUtil.checkOrder(reversedHead, Collections.emptyList());
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        ListNode reversedHead = solution.reverseKGroup(head, 1);
        LinkedListUtil.checkOrder(reversedHead, Collections.singletonList(1));
    }

    @Test
    void testListSizeEqualK() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2);
        ListNode reversedHead = solution.reverseKGroup(head, 2);
        LinkedListUtil.checkOrder(reversedHead, Arrays.asList(2, 1));
    }

    @Test
    void testListSizeDivideByK() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.reverseKGroup(head, 2);
        LinkedListUtil.checkOrder(reversedHead, Arrays.asList(2, 1, 4, 3));
    }

    @Test
    void testListSizeNotDivideByK() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.reverseKGroup(head, 3);
        LinkedListUtil.checkOrder(reversedHead, Arrays.asList(3, 2, 1, 4));
    }


}
