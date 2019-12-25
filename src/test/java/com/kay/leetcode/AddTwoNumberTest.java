package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class AddTwoNumberTest {
    private AddTwoNumber solution;

    @BeforeEach
    void setUp() {
        solution = new AddTwoNumber();
    }

    @Test
    void sample() {
        ListNode head = solution.addTwoNumbers(LinkedListUtil.buildLinkedList(2, 4, 3),
                LinkedListUtil.buildLinkedList(5, 6, 4));
        assertThat(LinkedListUtil.orderPresent(head), equalTo(Arrays.asList(7, 0, 8)));
    }

    @Test
    void withCarry() {
        ListNode head = solution.addTwoNumbers(LinkedListUtil.buildLinkedList(5, 5, 4),
                LinkedListUtil.buildLinkedList(8, 8, 6));
        assertThat(LinkedListUtil.orderPresent(head), equalTo(Arrays.asList(3, 4, 1, 1)));
    }

    @Test
    void withNoCarry() {
        ListNode head = solution.addTwoNumbers(LinkedListUtil.buildLinkedList(5, 5, 4),
                LinkedListUtil.buildLinkedList(4, 4, 5));
        assertThat(LinkedListUtil.orderPresent(head), equalTo(Arrays.asList(9, 9, 9)));
    }
}