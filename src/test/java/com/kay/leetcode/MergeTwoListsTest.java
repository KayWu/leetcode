package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import com.kay.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoListsTest {

    private MergeTwoLists solution;


    @BeforeEach
    void setUp() {
        solution = new MergeTwoLists();
    }

    @Test
    void twoEmptyList() {
        ListNode head = solution.mergeTwoLists(null, null);
        assertNull(head);
    }


    @Test
    void oneEmptyList() {
        ListNode head = solution.mergeTwoLists(null, LinkedListUtil.buildLinkedList(1, 3, 4));
        assertEquals(List.of(1, 3, 4), LinkedListUtil.orderPresent(head));
    }


    @Test
    void sample() {
        ListNode head = solution.mergeTwoLists(LinkedListUtil.buildLinkedList(1, 2, 4), LinkedListUtil.buildLinkedList(1, 3, 4));
        assertEquals(List.of(1, 1, 2, 3, 4, 4), LinkedListUtil.orderPresent(head));
    }


}
