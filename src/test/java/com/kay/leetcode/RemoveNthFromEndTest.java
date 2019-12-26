package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import com.kay.utils.ListNode;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthFromEndTest {

    private RemoveNthFromEnd solution = new RemoveNthFromEnd();

    @Test
    void emptyList() {
        ListNode head = solution.removeNthFromEnd(null, 0);
        assertNull(head);
    }

    @Test
    void oneNode() {
        ListNode head = solution.removeNthFromEnd(new ListNode(1), 1);
        assertNull(head);
    }

    @Test
    void twoNodes() {
        ListNode head = solution.removeNthFromEnd(LinkedListUtil.buildLinkedList(1, 2), 1);
        assertEquals(List.of(1), LinkedListUtil.orderPresent(head));
    }


    @Test
    void removeHead() {
        ListNode head = solution.removeNthFromEnd(LinkedListUtil.buildLinkedList(1, 2, 3, 4, 5), 5);
        assertEquals(List.of(2, 3, 4, 5), LinkedListUtil.orderPresent(head));
    }


    @Test
    void sample() {
        ListNode head = solution.removeNthFromEnd(LinkedListUtil.buildLinkedList(1, 2, 3, 4, 5), 2);
        assertEquals(List.of(1, 2, 3, 5), LinkedListUtil.orderPresent(head));
    }
}
