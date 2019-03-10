package com.kay.leetcode;

import com.kay.leetcode.utils.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {

    private LinkedListCycle solution;

    @BeforeEach
    void setUp() {
        solution = new LinkedListCycle();
    }

    @Test
    void testNullNode() {
        ListNode head = LinkedListUtil.buildLinkedList();
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testTwoNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testOddSizeCycleList() {
        ListNode head = LinkedListUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3), 1);
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testEvenSizeCycleList() {
        ListNode head = LinkedListUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3, 4), 1);
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testPureCycleList() {
        ListNode head = LinkedListUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3, 4, 5), 0);
        assertTrue(solution.hasCycle(head));
    }
}