package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class ReverseListSolutionTest {
    private ReverseListSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseListSolution();
    }

    @Test
    void testNullNode() {
        ListNode head = LinkedListUtil.buildLinkedList();
        ListNode reversedHead = solution.reverseList(head);
        LinkedListUtil.checkOrder(reversedHead, Collections.emptyList());
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        ListNode reversedHead = solution.reverseList(head);
        LinkedListUtil.checkOrder(reversedHead, Collections.singletonList(1));
    }

    @Test
    void testOddSizeList() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4, 5);
        ListNode reversedHead = solution.reverseList(head);
        LinkedListUtil.checkOrder(reversedHead, Arrays.asList(5, 4, 3, 2, 1));
    }

    @Test
    void testEvenSizeList() {
        ListNode head = LinkedListUtil.buildLinkedList(2, 3, 4);
        ListNode reversedHead = solution.reverseList(head);
        LinkedListUtil.checkOrder(reversedHead, Arrays.asList(4, 3, 2));
    }

}
