package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinDepthSolutionTest {

    private MinDepthSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MinDepthSolution();
    }

    @Test
    void sample() {
        assertEquals(2, solution.minDepth(TreeUtil.buildTree(Arrays.asList(3, 9, 20, null, null, 15, 7))));
    }

    @Test
    void emptyTree() {
        assertEquals(0, solution.minDepth(null));
    }
}