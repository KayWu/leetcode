package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleSolutionTest {

    private LinkedListCycleSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LinkedListCycleSolution();
    }

    @Test
    void testEmptyList() {
        ListNode head = TestUtil.buildLinkedList();
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testOneNode() {
        ListNode head = TestUtil.buildLinkedList(1);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testTwoNode() {
        ListNode head = TestUtil.buildLinkedList(1, 2);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testOddSizeCycleList() {
        ListNode head = TestUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3), 1);
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testEvenSizeCycleList() {
        ListNode head = TestUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3, 4), 1);
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testPureCycleList() {
        ListNode head = TestUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3, 4, 5), 0);
        assertTrue(solution.hasCycle(head));
    }
}