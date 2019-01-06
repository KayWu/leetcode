package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListCycleIISolutionTest {

    private LinkedListCycleIISolution solution;

    @BeforeEach
    void setUp() {
        solution = new LinkedListCycleIISolution();
    }

    @Test
    void testNullNode() {
        ListNode head = LinkedListUtil.buildLinkedList();
        assertNull(solution.detectCycle(head));
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        assertNull(solution.detectCycle(head));
    }

    @Test
    void testTwoNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2);
        assertNull(solution.detectCycle(head));
    }

    @Test
    void testOddSizeCycleList() {
        ListNode head = LinkedListUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3), 1);
        ListNode cycleBeginNode = solution.detectCycle(head);
        assertThat(cycleBeginNode.val, is(2));
    }

    @Test
    void testEvenSizeCycleList() {
        ListNode head = LinkedListUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3, 4), 1);
        ListNode cycleBeginNode = solution.detectCycle(head);
        assertThat(cycleBeginNode.val, is(2));
    }

    @Test
    void testPureCycleList() {
        ListNode head = LinkedListUtil.buildCycleLinkedList(Arrays.asList(1, 2, 3, 4), 0);
        ListNode cycleBeginNode = solution.detectCycle(head);
        assertThat(cycleBeginNode.val, is(1));
    }


}