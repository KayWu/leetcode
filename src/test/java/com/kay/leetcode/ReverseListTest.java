package com.kay.leetcode;

import com.kay.leetcode.utils.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReverseListTest {
    private ReverseList solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseList();
    }

    @Test
    void testNullNode() {
        ListNode head = LinkedListUtil.buildLinkedList();
        ListNode reversedHead = solution.reverseList(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Collections.emptyList()));
    }

    @Test
    void testOneNode() {
        ListNode head = LinkedListUtil.buildLinkedList(1);
        ListNode reversedHead = solution.reverseList(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Collections.singletonList(1)));
    }

    @Test
    void testOddSizeList() {
        ListNode head = LinkedListUtil.buildLinkedList(1, 2, 3, 4, 5);
        ListNode reversedHead = solution.reverseList(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(5, 4, 3, 2, 1)));
    }

    @Test
    void testEvenSizeList() {
        ListNode head = LinkedListUtil.buildLinkedList(2, 3, 4);
        ListNode reversedHead = solution.reverseList(head);
        assertThat(LinkedListUtil.orderPresent(reversedHead), equalTo(Arrays.asList(4, 3, 2)));
    }

}
