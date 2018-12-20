package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class ReverseKGroupSolutionTest {

    private ReverseKGroupSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseKGroupSolution();
    }

    @Test
    void testNullNode() {
        ListNode head = TestUtil.buildLinkedList();
        ListNode reversedHead = solution.reverseKGroup(head, 1);
        TestUtil.checkOrder(reversedHead, Collections.emptyList());
    }

    @Test
    void testOneNode() {
        ListNode head = TestUtil.buildLinkedList(1);
        ListNode reversedHead = solution.reverseKGroup(head, 1);
        TestUtil.checkOrder(reversedHead, Collections.singletonList(1));
    }

    @Test
    void testListSizeEqualK() {
        ListNode head = TestUtil.buildLinkedList(1, 2);
        ListNode reversedHead = solution.reverseKGroup(head, 2);
        TestUtil.checkOrder(reversedHead, Arrays.asList(2, 1));
    }

    @Test
    void testListSizeDivideByK() {
        ListNode head = TestUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.reverseKGroup(head, 2);
        TestUtil.checkOrder(reversedHead, Arrays.asList(2, 1, 4, 3));
    }

    @Test
    void testListSizeNotDivideByK() {
        ListNode head = TestUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.reverseKGroup(head, 3);
        TestUtil.checkOrder(reversedHead, Arrays.asList(3, 2, 1, 4));
    }


}
