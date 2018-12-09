package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestUtil {

    public static ListNode buildListNode(int... values) {
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

    public static void checkOrder(ListNode head, List expectValues) {
        List<Integer> actualValues = new ArrayList<>();
        while (head != null) {
            actualValues.add(head.val);
            head = head.next;
        }
        assertThat(actualValues, is(expectValues));
    }
}
