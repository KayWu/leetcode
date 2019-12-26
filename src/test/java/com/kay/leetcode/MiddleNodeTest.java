package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import com.kay.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MiddleNodeTest {

    private MiddleNode solution;

    @BeforeEach
    void setUp() {
        solution = new MiddleNode();
    }

    @Test
    void emptyList() {
        assertNull(solution.middleNode(null));
    }

    @Test
    void oneNode() {
        assertEquals(1, solution.middleNode(new ListNode(1)).val);
    }

    @Test
    void twoNodes() {
        assertEquals(2, solution.middleNode(LinkedListUtil.buildLinkedList(1, 2)).val);
    }

    @Test
    void oddList() {
        assertEquals(2, solution.middleNode(LinkedListUtil.buildLinkedList(1, 2, 3)).val);
    }

    @Test
    void evenList() {
        assertEquals(3, solution.middleNode(LinkedListUtil.buildLinkedList(1, 2, 3, 4)).val);
    }
}
