package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class SwagPairsTest {
    private SwagPairs solution;

    @BeforeEach
    void setUp() {
        solution = new SwagPairs();
    }

    @Test
    void testNullNode() {
        ListNode head = LinkedListUtil.buildLinkedList();
        ListNode reversedHead = solution.swapPairs(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Collections.emptyList()));
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        ListNode reversedHead = solution.swapPairs(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Collections.singletonList(1)));
    }

    @Test
    void testTwoNodes() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2);
        ListNode reversedHead = solution.swapPairs(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(2, 1)));
    }

    @Test
    void testEvenSizeList() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.swapPairs(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(2, 1, 4, 3)));
    }

    @Test
    void testOddSizeList() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4, 5);
        ListNode reversedHead = solution.swapPairs(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(2, 1, 4, 3, 5)));
    }
}