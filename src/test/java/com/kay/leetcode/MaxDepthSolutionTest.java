package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDepthSolutionTest {

    private MaxDepthSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MaxDepthSolution();
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