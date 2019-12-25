package com.kay.leetcode;

import com.kay.utils.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class NextLargerNodesTest {

    private NextLargerNodes solution;

    @BeforeEach
    void setUp() {
        solution = new NextLargerNodes();
    }

    @Test
    void sample() {
        assertThat(solution.nextLargerNodes(LinkedListUtil.buildLinkedList(2, 1, 5)), equalTo(new int[]{5, 5, 0}));
        assertThat(solution.nextLargerNodes(LinkedListUtil.buildLinkedList(2, 7, 4, 3, 5)), equalTo(new int[]{7, 0, 5, 5, 0}));
        assertThat(solution.nextLargerNodes(LinkedListUtil.buildLinkedList(1, 7, 5, 1, 9, 2, 5, 1)), equalTo(new int[]{7, 9, 9, 9, 0, 5, 0, 0}));
    }

}