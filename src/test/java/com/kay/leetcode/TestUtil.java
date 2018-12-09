package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestUtil {

    public static ListNode buildLinkedList(int... values) {
        ListNode head = null, prev = null;
        for (int i = 0; i < values.length; i++) {
            ListNode node = new ListNode(values[i]);
            if (prev != null) {
                prev.next = node;
            } else {
                head = node;
            }
            prev = node;
        }
        return head;
    }

    public static ListNode buildCycleLinkedList(List<Integer> values, int cyclePosition) {
        if (cyclePosition < 0 || cyclePosition >= values.size() - 1) {
            throw new IllegalArgumentException(
                    String.format("cannot build a linked list cycle with values: %s and cyclePosition: %d",
                            values.toString(), cyclePosition));
        }
        ListNode head = null, prev = null, cycleNode = null;
        for (int i = 0; i < values.size(); i++) {
            ListNode node = new ListNode(values.get(i));
            if (prev != null) {
                prev.next = node;
            } else {
                head = node;
            }
            prev = node;

            if (i == cyclePosition) {
                cycleNode = node;
            }

            if (i == values.size() - 1) {
                node.next = cycleNode;
            }
        }
        return head;
    }

    public static void checkOrder(ListNode head, List expectValues) {
        List<Integer> actualValues = new ArrayList<>();
        while (head != null) {
            actualValues.add(head.val);
            head = head.next;
        }
        assertThat(actualValues, is(expectValues));
    }
}
