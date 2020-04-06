package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import com.kay.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IntersectionNodeTest {

    private IntersectionNode solution;

    @BeforeEach
    void setUp() {
        solution = new IntersectionNode();
    }


    @Test
    void sample() {
        List<ListNode> headList = LinkedListUtil.buildIntersectLinkedList(Arrays.asList(4, 1, 8, 4, 5),
                Arrays.asList(5, 0, 1, 8, 4, 5), 2, 3);
        assertEquals(8, solution.getIntersectionNode(headList.get(0), headList.get(1)).val);

        headList = LinkedListUtil.buildIntersectLinkedList(Arrays.asList(0, 9, 1, 2, 4), Arrays.asList(3, 2, 4), 3, 1);
        assertEquals(2, solution.getIntersectionNode(headList.get(0), headList.get(1)).val);

        headList = LinkedListUtil.buildIntersectLinkedList(Arrays.asList(2, 6, 4), Arrays.asList(1, 5),
                3, 2);
        assertNull(solution.getIntersectionNode(headList.get(0), headList.get(1)));
    }

}
