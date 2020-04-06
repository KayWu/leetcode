package com.kay.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LinkedListUtil {

    public static ListNode buildLinkedList(int... values) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int i = 0; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
        }
        return dummy.next;
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

    public static List<Integer> orderPresent(ListNode head) {
        List<Integer> actualValues = new ArrayList<>();
        while (head != null) {
            actualValues.add(head.val);
            head = head.next;
        }
        return actualValues;
    }

    public static List<ListNode> buildIntersectLinkedList(List<Integer> listA, List<Integer> listB, int skipA, int skipB) {
        ListNode dummyA = new ListNode(-1);
        ListNode curA = dummyA;
        ListNode intersectionNode = null;
        for (int i = 0; i < listA.size(); i++) {
            ListNode node = new ListNode(listA.get(i));
            curA.next = node;
            curA = curA.next;
            if (i == skipA) {
                intersectionNode = node;
            }
        }

        ListNode dummyB = new ListNode(-1);
        ListNode curB = dummyB;
        for (int i = 0; i < listB.size(); i++) {
            if (i == skipB) {
                curB.next = intersectionNode;
                break;
            }
            curB.next = new ListNode(listB.get(i));
            curB = curB.next;
        }
        return Arrays.asList(dummyA.next, dummyB.next);
    }
}
