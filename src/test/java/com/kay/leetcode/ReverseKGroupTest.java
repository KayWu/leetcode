package com.kay.leetcode;

import com.kay.leetcode.utils.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

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
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Collections.emptyList()));
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        ListNode reversedHead = solution.reverseKGroup(head, 1);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Collections.singletonList(1)));
    }

    @Test
    void testListSizeEqualK() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2);
        ListNode reversedHead = solution.reverseKGroup(head, 2);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(2, 1)));
    }

    @Test
    void testListSizeDivideByK() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.reverseKGroup(head, 2);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(2, 1, 4, 3)));
    }

    @Test
    void testListSizeNotDivideByK() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4);
        ListNode reversedHead = solution.reverseKGroup(head, 3);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(3, 2, 1, 4)));
    }


}
