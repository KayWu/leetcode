package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class ReverseLinkedListSolutionTest {
    private ReverseLinkedListSolution solution;

    @BeforeEach
    void setup() {
        solution = new ReverseLinkedListSolution();
    }

    @Test
    void testOddList() {
        ListNode head = TestUtil.buildListNode(1, 2, 3, 4, 5);
        ListNode reversedHead = solution.reverseList(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(5, 4, 3, 2, 1));
    }

    @Test
    void testSingle() {
        ListNode head = TestUtil.buildListNode(1);
        ListNode reversedHead = solution.reverseList(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(1));
    }

    @Test
    void testEvenList() {
        ListNode head = TestUtil.buildListNode(2, 3, 4);
        ListNode reversedHead = solution.reverseList(head);
        TestUtil.checkOrder(reversedHead, Arrays.asList(4, 3, 2));
    }


    @Test
    void testEmptyList() {
        ListNode head = TestUtil.buildListNode();
        ListNode reversedHead = solution.reverseList(head);
        TestUtil.checkOrder(reversedHead, Collections.emptyList());
    }
}
