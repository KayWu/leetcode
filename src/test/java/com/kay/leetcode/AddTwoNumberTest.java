package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        LinkedListUtil.checkOrder(head, Arrays.asList(7, 0, 8));
    }

    @Test
    void withCarry() {
        ListNode head = solution.addTwoNumbers(LinkedListUtil.buildLinkedList(5, 5, 4),
                LinkedListUtil.buildLinkedList(8, 8, 6));
        LinkedListUtil.checkOrder(head, Arrays.asList(3, 4, 1, 1));
    }

    @Test
    void withNoCarry() {
        ListNode head = solution.addTwoNumbers(LinkedListUtil.buildLinkedList(5, 5, 4),
                LinkedListUtil.buildLinkedList(4, 4, 5));
        LinkedListUtil.checkOrder(head, Arrays.asList(9, 9, 9));
    }
}