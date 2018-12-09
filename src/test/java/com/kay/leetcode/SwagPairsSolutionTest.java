package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class SwagPairsSolutionTest {
    private SwagPairsSolution solution;

    @BeforeEach
    void setup() {
        solution = new SwagPairsSolution();
    }

    @Test
    void testEmptyList() {
        ListNode head = TestUtil.buildListNode();
        ListNode reversedHead = solution.swapPairs(head);
        TestUtil.checkOrder(reversedHead, Collections.emptyList());
    }

    @Test
    void testSingleList() {
        ListNode head = TestUtil.buildListNode(1);
        ListNode reversedHead = solution.swapPairs(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(1));
    }

    @Test
    void testDoubleList() {
        ListNode head = TestUtil.buildListNode(1, 2);
        ListNode reversedHead = solution.swapPairs(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(2, 1));
    }

    @Test
    void testEvenList() {
        ListNode head = TestUtil.buildListNode(1, 2, 3, 4);
        ListNode reversedHead = solution.swapPairs(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(2, 1, 4, 3));
    }

    @Test
    void testOddList() {
        ListNode head = TestUtil.buildListNode(1, 2, 3, 4, 5);
        ListNode reversedHead = solution.swapPairs(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(2, 1, 4, 3, 5));
    }
}