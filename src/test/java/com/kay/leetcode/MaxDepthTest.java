package com.kay.leetcode;

import com.kay.leetcode.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDepthTest {

    private MaxDepth solution;

    @BeforeEach
    void setUp() {
        solution = new MaxDepth();
    }

    @Test
    void sample() {
        assertEquals(3, solution.maxDepth(TreeUtil.buildTree(Arrays.asList(3, 9, 20, null, null, 15, 7))));
    }

    @Test
    void emptyTree() {
        assertEquals(0, solution.maxDepth(null));
    }

}